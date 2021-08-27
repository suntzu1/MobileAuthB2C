using System;
using System.Threading.Tasks;
using Gia.Authentication;
using Gia.Constants;
using Gia.Models;
using Gia.Services;
using Gia.View;
using MobileAuthB2C;
using MobileAuthB2C.Models;
using MobileAuthB2C.ViewModels;
using MobileAuthB2C.Views;
using Xamarin.Forms;

namespace Gia.ViewModels
{
    public class LoginViewModel : BaseViewModel
    {
       


        public LoginViewModel()
        {
           
        }
        private bool _isLoading;
        public bool IsLoading
        {
            get { return _isLoading; }
            set
            {
                _isLoading = value;
                OnPropertyChanged("IsLoading");
            }
        }
        private bool _isBtnVisible = true;
        public bool IsBtnVisible
        {
            get { return _isBtnVisible; }
            set
            {
                _isBtnVisible = value;
                OnPropertyChanged("IsBtnVisible");
            }
        }
        private string email;
        public string Email
        {
            get { return email; }
            set
            {
                email = value;
                OnPropertyChanged("Email");
            }
        }
        private string password;
        public string Password
        {
            get { return password; }
            set
            {
                password = value;
                OnPropertyChanged("Password");
            }
        }

        public UserModel UserModel { get; set; }

        public Command LoginCommand
        {
            get
            {
                return new Command(async x => await Login());
            }
        }

        public async Task Login()
        {

            
            try
            {
                if (string.IsNullOrEmpty(Email) || string.IsNullOrEmpty(Password))
                    await App.Current.MainPage.DisplayAlert("Empty Values", "Please enter Email and Password", "OK");
                else
                {
                    IsBtnVisible = false;
                    IsLoading = true;
                    //UserModel userData = await apiService.Login(Email, Password);
                    UserModel userData = await apiService.Login("ragesh.sr@iinerds.com", "Ragesh@1234");

                    this.UserModel = userData;

                    if (Application.Current.Properties.ContainsKey("FcmToken"))
                    {
                        Console.WriteLine(App.Current.Properties["FcmToken"].ToString());
                        userData.FirebaseToken = App.Current.Properties["FcmToken"].ToString();

                    }
                    if (Application.Current.Properties.ContainsKey("AppType"))
                    {
                        userData.AppType = App.Current.Properties["AppType"].ToString();
                    }
                    IsLoading = false;
                    IsBtnVisible = true;
                    if (userData.Success)
                    {
                        if (userData.InvalidUser != null)
                        {
                            await App.Current.MainPage.DisplayAlert("Login Failed",
                                userData.InvalidUser, "OK");

                        }
                        else
                        {
                            // Abe: took off the nav since we are using login page to do the same
                            // await App.Current.MainPage.Navigation.PushAsync(new HomePage(userData));
                        }
                    }
                    else
                    {
                        await App.Current.MainPage.DisplayAlert("Login Failed", userData.Error, "OK");
                    }

                }

            }
            catch (Exception E)
            {
                Console.WriteLine(E.Message);
                await App.Current.MainPage.DisplayAlert("Login Failed", "Failed to authenticate", "OK");
            }
        }

        public Command CreateAccountCommand
        {
            get
            {
                return new Command(async x => await CreateAccount());
            }
        }
        private async Task CreateAccount()
        {
            await App.Current.MainPage.Navigation.PushAsync(new RegistrationPage());
        }

        public Command B2CLoginCommand
        {
            get
            {
                return new Command(async x => await B2CLogin());
            }
        }
        private async Task B2CLogin()
        {
              var userContext = await B2CAuthenticationService.Instance.SignInAsync();
            _ = UpdateSignInState(userContext);

        }
        private async Task UpdateSignInState(UserContext userContext)
        {
            if (userContext.IsLoggedOn)
            {
                string cognitioToken =  await apiService.CognitoLogin(userContext.EmailAddress);
                await App.Current.MainPage.DisplayAlert("Success","Logged in as " + userContext.EmailAddress, "OK");
            }
            else
            {
                await App.Current.MainPage.DisplayAlert("Login Failed", "Failed to login", "OK");
            }
        }



      /*  public Command StartZoomCommand
        {
            get
            {
                return new Command(async x => await StartZoom());
            }
        }

        private async Task StartZoom()
        {
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
               zoomService.JoinMeeting("86500458275", "xamarin", "5s17kU");
            }
            catch(Exception e)
            {
                Console.WriteLine(e.Message);
            }

        }*/
    }
}
