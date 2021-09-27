using Microsoft.Identity.Client;
using System;
using System.IdentityModel.Tokens.Jwt;
using System.Linq;
using System.Threading.Tasks;
using MobileAuthB2C.Models;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace MobileAuthB2C.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    // ReSharper disable once RedundantExtendsListEntry
    public partial class LoginResultPage : ContentPage
    {
        private readonly AuthenticationResult _authenticationResult;

        private UserModel _userModel;
        private readonly UserModel _userData;

        public LoginResultPage()
        {
            InitializeComponent();
        }

        public LoginResultPage(AuthenticationResult result, UserModel userData)
        {
            this._authenticationResult = result;
            this._userData = userData;
            InitializeComponent();
        }

        protected override void OnAppearing()
        {
            GetClaims();
            base.OnAppearing();
            Task.Run(async () =>
            {
                await Task.Delay(500);
                // await Navigation.PushAsync(new HomePage(_userModel));
                Device.BeginInvokeOnMainThread(() =>
                {
                    ContinueBtn_OnClicked(this, null);
                });
            });
        }

        private void GetClaims()
        {
            var token = _authenticationResult.IdToken;
            if (token != null)
            {
                var handler = new JwtSecurityTokenHandler();
                var data = handler.ReadJwtToken(token);
                var claims = data.Claims.ToList();
                if (claims.Any())
                {
                    _userModel = new UserModel
                    {
                        Name = data.Claims.FirstOrDefault(x => x.Type.Equals(("name")))?.Value,
                        FirstName = data.Claims.FirstOrDefault(x => x.Type.Equals(("given_name")))?.Value,
                        LastName = data.Claims.FirstOrDefault(x => x.Type.Equals(("family_name")))?.Value
                    };
                    Welcome.Text = $"Welcome {_userModel.Name}";
                    try
                    {
                        _userModel.Email = data.Claims.FirstOrDefault(x => x.Type.Equals(("emails")))?.Value;
                        Email.Text = $"Email: {_userModel.Email}";
                        Issuer.Text = $"Token Issuer: {data.Claims.FirstOrDefault(x => x.Type.Equals(("iss")))?.Value}";
                        Idp.Text = $"IDP: {data.Claims.FirstOrDefault(x => x.Type.Equals(("idp")))?.Value}";
                        if (Idp.Text.Length < 6)
                        {
                            var tfp = data.Claims.FirstOrDefault(x => x.Type.Equals(("tfp")))?.Value;
                            if(tfp == "B2C_1_b2c_su_si_mfasms")
                                Idp.Text = "IDP: Microsoft Azure B2C";
                        }
                    }
                    catch
                    {
                        // ignored
                    }
                }

            }
        }

        private async void SignOutBtn_OnClicked(object sender, EventArgs e)
        {
            await App.AuthenticationClient.RemoveAsync(_authenticationResult.Account);
            await Navigation.PushAsync(new LoginPage());
        }

        private async void ContinueBtn_OnClicked(object sender, EventArgs e)
        {
            if (_userData.Success)
            {
                if (_userData.InvalidUser != null)
                {
                    await App.Current.MainPage.DisplayAlert("Login Failed",
                        _userData.InvalidUser, "OK");

                }
                else
                {
                    await Navigation.PushAsync(new HomePage(_userModel));
                    //await App.Current.MainPage.Navigation.PushAsync(new HomePage(_userData));
                }
            }
            else
            {
                await App.Current.MainPage.DisplayAlert("Login Failed", _userData.Error, "OK");
            }

        }
    }
}