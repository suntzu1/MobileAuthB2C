using System;
using System.Collections.Generic;
using System.IdentityModel.Tokens.Jwt;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;
using Gia.Constants;
using Gia.Models;
using Gia.Services;
using Gia.ViewModels;
using Microsoft.Identity.Client;
using MobileAuthB2C.Models;
using Newtonsoft.Json;
using Plugin.Fingerprint;
using Plugin.Fingerprint.Abstractions;
using Xamarin.Forms;
using Xamarin.Forms.Internals;
using Xamarin.Forms.Xaml;

namespace MobileAuthB2C.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class LoginPage : ContentPage
    {
        LoginViewModel loginViewModel;
        IZoomService zoomService;
        private AuthenticationResult _authenticationResult;

        public LoginPage()
        {
            loginViewModel = new LoginViewModel();
            NavigationPage.SetHasNavigationBar(this, false);
            InitializeComponent();
            BindingContext = loginViewModel;
        }

        protected override void OnAppearing()
        {
            base.OnAppearing();
            try
            {
                RunInitialCheckForCachedAuthAndBiometric();
                // var task = Task.Run(async () => await RunInitialCheckForCachedAuthAndBiometric());
            }
            catch
            {
                // Do nothing - the user isn't logged in
            }
            MessagingCenter.Subscribe<object, string>(this, "notificationData", (sender, arg) =>
            {
                NotificationDataModel notificationData = JsonConvert.DeserializeObject<NotificationDataModel>(arg.ToString());

                if (notificationData.MeetingId != "" && notificationData.MeetingPassword != "")
                {
                    _ = ShowMeetingPage(notificationData.MeetingId, notificationData.MeetingPassword, notificationData.PlayAudio);
                }

            });
        }

        private async Task ShowMeetingPage(string MeetingId, string MeetingPassword, bool PlayAudio)
        {
            try
            {
                if (PlayAudio)
                {
                    DependencyService.Get<IAudio>().PlayAudio();
                }
                bool answer = await DisplayAlert("Care Provider is available now.", "Please join now to start the virtual consult", "Accept", "Reject");
                if (answer)
                {
                    //  await App.Current.MainPage.Navigation.PushAsync(new HybridWebViewPage("jitsi?meetingId=" + MeetingId + "&meetingPassword=" + MeetingPassword, ""));


                    try
                    {

                        zoomService = DependencyService.Get<IZoomService>();
                        zoomService.InitZoomLib(AppConstants.ZoomAppKey, AppConstants.ZoomAppSecret);
                        await Task.Delay(2000);
                        if (!zoomService.IsInitialized())
                        {
                            return;
                        }
                        Console.WriteLine("### intialized");
                        zoomService.JoinMeeting(MeetingId, "User", MeetingPassword);
                    }
                    catch (Exception e)
                    {
                        Console.WriteLine(e.Message);
                    }
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }

        protected async Task WaitAndExecute(int millisec, Action actionToExecute)
        {
            await Task.Delay(millisec);
            actionToExecute();
        }

        private async Task RunInitialCheckForCachedAuthAndBiometric()
        {
            // await Task.Delay(500);
            var TupAccDetItems = await CheckForAnyCachedCredentials();
            var accDetail = TupAccDetItems.Item1;
            try
            {
                if (accDetail?.Accounts != null && accDetail.Accounts.Any())
                {
                    await GetCachedB2CTokenForAuthentication(accDetail.Accounts);
                    BtnLoginB2C.IsEnabled = false;
                    var bioAuthResult = await PerformBiometricAuthentication();
                    if (bioAuthResult.Authenticated && _authenticationResult != null &&
                        _authenticationResult.IdToken != string.Empty)
                    {
                        var ucmLoginResult = await LoginToUcmSdk(_authenticationResult.IdToken);
                        await Navigation.PushAsync(new LoginResultPage(_authenticationResult, ucmLoginResult.Item2));
                    }
                }
                else BtnLoginB2C.IsEnabled = true;
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
                BtnLoginB2C.IsEnabled = true;
            }

            try
            {
                accDetail = TupAccDetItems.Item2;
                if (accDetail?.Accounts != null && accDetail.Accounts.Any())
                {
                    await GetCachedSocIdTokenForAuthentication(accDetail.Accounts);
                    BtnLoginSocId.IsEnabled = false;
                    var bioAuthResult = await PerformBiometricAuthentication();
                    if (bioAuthResult.Authenticated && _authenticationResult != null &&
                        _authenticationResult.IdToken != string.Empty)
                    {
                        var ucmLoginResult = await LoginToUcmSdk(_authenticationResult.IdToken);
                        await Navigation.PushAsync(new LoginResultPage(_authenticationResult, ucmLoginResult.Item2));
                    }
                }
                else BtnLoginSocId.IsEnabled = true;
            }
            catch
            {
                BtnLoginSocId.IsEnabled = true;
            }

        }

        private async Task<Tuple<Gia.Models.UserAccountModel, UserModel>> LoginToUcmSdk(string IdToken)
        {
            var data = new JwtSecurityTokenHandler().ReadJwtToken(IdToken);
            var claims = data.Claims.ToList();
            var email = data.Claims.FirstOrDefault(x => x.Type.Equals(("emails")))?.Value;
            //UserModel userData = await loginViewModel.apiService.Login(email, Constants.CrazyPassword);
            loginViewModel.Email = email;
            loginViewModel.Password = Constants.CrazyPassword;
            await loginViewModel.Login();
            UserModel userData = loginViewModel.UserModel;
            var guam = new Gia.Models.UserAccountModel
            {
                Email = userData.Email,
                FirstName = userData.FirstName,
                LastName = userData.LastName,
                Password = Constants.CrazyPassword,
                Mobile = userData.Mobile
            };

            if (userData.Error == "Failed to authenticate")
            {
                userData = new UserModel
                {
                    Name = data.Claims.FirstOrDefault(x => x.Type.Equals(("name")))?.Value,
                    FirstName = data.Claims.FirstOrDefault(x => x.Type.Equals(("given_name")))?.Value,
                    LastName = data.Claims.FirstOrDefault(x => x.Type.Equals(("family_name")))?.Value,
                    Mobile = data.Claims.FirstOrDefault(x => x.Type.Equals(("mobile")))?.Value
                };

                userData.Success = true;
            }

            return new Tuple<UserAccountModel, UserModel>(await loginViewModel.apiService.RegisterUser(guam), userData);
        }

        private async Task<bool> CheckForCachedCredentials()
        {
            IEnumerable<IAccount> accounts;
            List<IAccount> accList;
            try
            {
                // Look for existing account
                accounts = await App.AuthenticationClient.GetAccountsAsync();

                accList = accounts.ToList();
                if (accList.Any())
                {
                    await GetCachedB2CTokenForAuthentication(accList);

                    // await Navigation.PushAsync(new LogoutPage(result));
                    var ucmLoginResult = await LoginToUcmSdk(_authenticationResult.IdToken);
                    await Navigation.PushAsync(new LoginResultPage(_authenticationResult, ucmLoginResult.Item2));
                }
            }
            catch
            {
                // Look for existing account
                accounts = await App.AuthenticationClientSoc.GetAccountsAsync();

                accList = accounts.ToList();
                if (accList.Any())
                {
                    await GetCachedSocIdTokenForAuthentication(accList);

                    // await Navigation.PushAsync(new LogoutPage(result));
                    var ucmLoginResult = await LoginToUcmSdk(_authenticationResult.IdToken);
                    await Navigation.PushAsync(new LoginResultPage(_authenticationResult, ucmLoginResult.Item2));
                }
            }

            if (!accList.Any())
            {
                await DisplayAlert("Alert", "You don't have an active login. Please login before using biometrics.", "OK");
                return false;
            }

            return true;
        }

        private async Task<Tuple<AccountDetail, AccountDetail>> CheckForAnyCachedCredentials()
        {
            IEnumerable<IAccount> accountsB2C = null;
            IEnumerable<IAccount> accountsSoc = null;
            try
            {
                // Look for existing b2c account
                accountsB2C = await App.AuthenticationClient.GetAccountsAsync();
            }
            catch
            {
                // ignored
            }

            // Look for existing soc id account
            try
            {
                accountsSoc = await App.AuthenticationClientSoc.GetAccountsAsync();
            }
            catch
            {
                // ignored
            }

            //return ;
            return new Tuple<AccountDetail, AccountDetail>(
                new AccountDetail(IdentityType.B2C, accountsB2C?.ToList()),
                new AccountDetail(IdentityType.SocialIdentity, accountsSoc?.ToList())
            );
        }

        private async Task GetCachedB2CTokenForAuthentication(List<IAccount> accList)
        {
            _authenticationResult = await App.AuthenticationClient
                .AcquireTokenSilent(Constants.Scopes, accList.FirstOrDefault())
                .ExecuteAsync();
        }
        private async Task GetCachedSocIdTokenForAuthentication(List<IAccount> accList)
        {
            _authenticationResult = await App.AuthenticationClientSoc
                .AcquireTokenSilent(Constants.Scopes, accList.FirstOrDefault())
                .ExecuteAsync();
        }

        private async void OnSignInClicked(object sender, EventArgs e)
        {
            await LoginAzureB2C_Async();
        }

        private async Task LoginAzureB2C_Async(bool useWebView = true, bool useSocLogin = false)
        {
            try
            {
                var authClient = useSocLogin ? App.AuthenticationClientSoc : App.AuthenticationClient;
                //var ewvo = new EmbeddedWebViewOptions
                //{
                //    Title = "Email & Password Login",
                //};
                var result = await authClient
                    .AcquireTokenInteractive(Constants.Scopes)
                    .WithPrompt(Prompt.ForceLogin)
                    .WithUseEmbeddedWebView(useWebView)
                    .WithParentActivityOrWindow(App.UIParent)
                    // 'WebView2Options API is only supported on .NET Fx, .NET Core and .NET5 '
                    //.WithEmbeddedWebViewOptions(ewvo)
                    .ExecuteAsync();
                var ucmLoginResult = await LoginToUcmSdk(result.IdToken);
                await Navigation.PushAsync(new LoginResultPage(result, ucmLoginResult.Item2));
            }
            catch (MsalClientException ex)
            {
                Console.WriteLine(ex);
                // throw;
                await DisplayAlert("Error", "Failed! Please try later.", "OK");
            }
        }


        private async void AuthButton_Clicked(object sender, EventArgs e)
        {
            var authResult = await PerformBiometricAuthentication();
            if (authResult != null && authResult.Authenticated)
            {
                //Success  
                await CheckForCachedCredentials();
            }
            else
            {
                await DisplayAlert("Error", "Authentication failed", "OK");
            }
        }

        private async Task<FingerprintAuthenticationResult> PerformBiometricAuthentication()
        {
            var isFingerprintAvailable = await CrossFingerprint.Current.IsAvailableAsync(false);
            if (!isFingerprintAvailable)
            {
                await DisplayAlert("Error",
                    "Biometric authentication is not available or configured.", "OK");
                return null;
            }

            var conf = new AuthenticationRequestConfiguration("Gia Biometric Authentication",
                "Authenticate to access your Gia application");

            try
            {
                var authResult = await CrossFingerprint.Current.AuthenticateAsync(conf);
                return authResult;
            }
            catch (Exception ex)
            {
                await DisplayAlert("Error", ex.Message, "OK");
            }
            return null;
        }

        private async void SocAuthButton_Clicked(object sender, EventArgs e)
        {
            await LoginAzureB2C_Async(false, true);
        }

        public class AccountDetail
        {
            public IdentityType IdentityType { get; }
            public List<IAccount> Accounts { get; }

            public AccountDetail(IdentityType identityType, List<IAccount> accounts)
            {
                IdentityType = identityType;
                Accounts = accounts;
            }
        }

        public enum IdentityType
        {
            B2C, SocialIdentity
        }

        private async void TbiLogout_OnClicked(object sender, EventArgs e)
        {
            if (_authenticationResult != null)
                await App.AuthenticationClient.RemoveAsync(_authenticationResult.Account);
#pragma warning disable 4014
            RunInitialCheckForCachedAuthAndBiometric();
#pragma warning restore 4014
        }
    }
}