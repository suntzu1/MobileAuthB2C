﻿using Gia.Constants;
using Microsoft.Identity.Client;
using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace Gia.Authentication
{
    public class B2CAuthenticationService
    {

        private readonly IPublicClientApplication _pca;


        private static readonly Lazy<B2CAuthenticationService> lazy = new Lazy<B2CAuthenticationService>
           (() => new B2CAuthenticationService());

        public static B2CAuthenticationService Instance { get { return lazy.Value; } }


        private B2CAuthenticationService()
        {

            // default redirectURI; each platform specific project will have to override it with its own
            var builder = PublicClientApplicationBuilder.Create(AppConstants.ClientID)
                .WithB2CAuthority(AppConstants.AuthoritySignInSignUp)
                .WithIosKeychainSecurityGroup(AppConstants.IOSKeyChainGroup)
                .WithRedirectUri($"msal{AppConstants.ClientID}://auth");

            // iOS implementation would require to expose the current ViewControler - not currently implemented as it is not required

            if (Device.RuntimePlatform == Device.Android)
            {
                var windowLocatorService = DependencyService.Get<IParentWindowLocatorService>();

                if (windowLocatorService != null)
                {
                    builder = builder.WithParentActivityOrWindow(() => windowLocatorService?.GetCurrentParentWindow());
                }
            }
            _pca = builder.Build();
        }

        public async Task<UserContext> SignInAsync()
        {
            UserContext newContext;
          //  try
         //   {
                // acquire token silent
         //       newContext = await AcquireTokenSilent();
          //  }
         //   catch (MsalUiRequiredException)
        //    {
                // acquire token interactive
                newContext = await SignInInteractively();
         //  }
            return newContext;
        }

        private async Task<UserContext> AcquireTokenSilent()
        {
            IEnumerable<IAccount> accounts = await _pca.GetAccountsAsync();
            AuthenticationResult authResult = await _pca.AcquireTokenSilent(AppConstants.Scopes, GetAccountByPolicy(accounts, AppConstants.PolicySignUpSignIn))
               .WithB2CAuthority(AppConstants.AuthoritySignInSignUp)
               .ExecuteAsync();

            var newContext = UpdateUserInfo(authResult);
            return newContext;
        }

        public async Task<UserContext> ResetPasswordAsync()
        {
            AuthenticationResult authResult = await _pca.AcquireTokenInteractive(AppConstants.Scopes)
                .WithPrompt(Prompt.NoPrompt)
                .WithAuthority(AppConstants.AuthorityPasswordReset)
                .ExecuteAsync();

            var userContext = UpdateUserInfo(authResult);

            return userContext;
        }

        public async Task<UserContext> EditProfileAsync()
        {
            IEnumerable<IAccount> accounts = await _pca.GetAccountsAsync();

            AuthenticationResult authResult = await _pca.AcquireTokenInteractive(AppConstants.Scopes)
                .WithAccount(GetAccountByPolicy(accounts, AppConstants.PolicyEditProfile))
                .WithPrompt(Prompt.NoPrompt)
                .WithAuthority(AppConstants.AuthorityEditProfile)
                .ExecuteAsync();

            var userContext = UpdateUserInfo(authResult);

            return userContext;
        }

        private async Task<UserContext> SignInInteractively()
        {
            AuthenticationResult authResult = await _pca.AcquireTokenInteractive(AppConstants.Scopes)
                .ExecuteAsync();

            var newContext = UpdateUserInfo(authResult);
            return newContext;
        }

        public async Task<UserContext> SignOutAsync()
        {

            IEnumerable<IAccount> accounts = await _pca.GetAccountsAsync();
            while (accounts.Any())
            {
                await _pca.RemoveAsync(accounts.FirstOrDefault());
                accounts = await _pca.GetAccountsAsync();
            }
            var signedOutContext = new UserContext();
            signedOutContext.IsLoggedOn = false;
            return signedOutContext;
        }

        private IAccount GetAccountByPolicy(IEnumerable<IAccount> accounts, string policy)
        {
            foreach (var account in accounts)
            {
                string userIdentifier = account.HomeAccountId.ObjectId.Split('.')[0];
                if (userIdentifier.EndsWith(policy.ToLower())) return account;
            }

            return null;
        }

        private string Base64UrlDecode(string s)
        {
            s = s.Replace('-', '+').Replace('_', '/');
            s = s.PadRight(s.Length + (4 - s.Length % 4) % 4, '=');
            var byteArray = Convert.FromBase64String(s);
            var decoded = Encoding.UTF8.GetString(byteArray, 0, byteArray.Count());
            return decoded;
        }

        public UserContext UpdateUserInfo(AuthenticationResult ar)
        {
            var newContext = new UserContext();
            newContext.IsLoggedOn = false;
            JObject user = ParseIdToken(ar.IdToken);

            newContext.AccessToken = ar.AccessToken;
            newContext.Name = user["name"]?.ToString();
            newContext.UserIdentifier = user["oid"]?.ToString();

            newContext.GivenName = user["given_name"]?.ToString();
            newContext.FamilyName = user["family_name"]?.ToString();

            newContext.StreetAddress = user["streetAddress"]?.ToString();
            newContext.City = user["city"]?.ToString();
            newContext.Province = user["state"]?.ToString();
            newContext.PostalCode = user["postalCode"]?.ToString();
            newContext.Country = user["country"]?.ToString();

            newContext.JobTitle = user["jobTitle"]?.ToString();

            var emails = user["emails"] as JArray;
            if (emails != null)
            {
                newContext.EmailAddress = emails[0].ToString();
            }
            newContext.IsLoggedOn = true;

            return newContext;
        }

        JObject ParseIdToken(string idToken)
        {
            // Get the piece with actual user info
            idToken = idToken.Split('.')[1];
            idToken = Base64UrlDecode(idToken);
            return JObject.Parse(idToken);
        }
    }
}

