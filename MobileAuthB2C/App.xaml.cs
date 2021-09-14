using System;
using MobileAuthB2C.Views;
using Microsoft.Identity.Client;
using Xamarin.Forms;

namespace MobileAuthB2C
{
    public partial class App : Application
    {
        public static IPublicClientApplication AuthenticationClient { get; private set; }
        public static IPublicClientApplication AuthenticationClientSoc { get; private set; }

        public static object UIParent { get; set; } = null;
        public App()
        {
            InitializeComponent();

            try
            {
                AuthenticationClient = PublicClientApplicationBuilder.Create(Constants.ClientId)
                    .WithIosKeychainSecurityGroup(Constants.IosKeychainSecurityGroups)
                    .WithB2CAuthority(Constants.AuthoritySignIn)
                    .WithRedirectUri($"msal{Constants.ClientId}://auth")
                    .Build();
                AuthenticationClientSoc = PublicClientApplicationBuilder.Create(Constants.ClientId)
                    .WithIosKeychainSecurityGroup(Constants.IosKeychainSecurityGroups)
                    .WithB2CAuthority(Constants.AuthoritySignInSoc)
                    .WithRedirectUri($"msal{Constants.ClientId}://auth")
                    .Build();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }

            MainPage = new NavigationPage(new LoginPage());

            // DependencyService.Register<MockDataStore>();
            // MainPage = new AppShell();
        }

        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
