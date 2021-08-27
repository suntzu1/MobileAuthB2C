namespace Gia.Constants
{
    public static class AppConstants
    {
    //  public static string WebViewSrc = "https://gia-dev2.ucmdigitalhealth.com/";
        public static string WebViewSrc = "https://ucmsdk-qa.ucmdigitalhealth.com/";
        public static string ApiUrl = WebViewSrc + "dev2/";
        public static string AzureApi = "https://ucm-mvp-dev-fnapp.azurewebsites.net/api/ucmtestpoc";


        public static string CognitoUrl = "https://undxnux2i6.execute-api.us-east-1.amazonaws.com/alpha/login/cognitologin";



        public static string ZoomAppKey = "Vg9R5vsglsMAQ5e8jcHe3BrpiSuG296JtvaJ";
        public static string ZoomAppSecret = "QEe14e22QAe3XUmmAeGiNErcVqGTKZfkJuBQ";




        public static string Tenant = "ucmiia.onmicrosoft.com";
        public static string AzureADB2CHostname = "ucmiia.b2clogin.com";
        public static string ClientID = "553aad78-c813-4044-8c4e-a8be91ae57c1";
        public static string PolicySignUpSignIn = "b2c_1_susi";
        public static string PolicyEditProfile = "b2c_1_edit_profile";
        public static string PolicyResetPassword = "b2c_1_reset";

        public static string[] Scopes = { "https://ucmiia.onmicrosoft.com/553aad78-c813-4044-8c4e-a8be91ae57c1/demo.read" };

        public static string AuthorityBase = $"https://{AzureADB2CHostname}/tfp/{Tenant}/";
        public static string AuthoritySignInSignUp = $"{AuthorityBase}{PolicySignUpSignIn}";
        public static string AuthorityEditProfile = $"{AuthorityBase}{PolicyEditProfile}";
        public static string AuthorityPasswordReset = $"{AuthorityBase}{PolicyResetPassword}";
        public static string IOSKeyChainGroup = "com.microsoft.adalcache";

    }
}
