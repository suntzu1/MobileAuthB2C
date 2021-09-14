namespace MobileAuthB2C
{

    // no config files so we will use constants class
    public static class Constants
    {
        public static readonly string TenantName = "abemvptesting";
        public static readonly string TenantId = "abemvptesting.onmicrosoft.com";
        public static readonly string ClientId = "294840f4-0bff-4fb0-9399-563044317163";
        public static readonly string SignInPolicy = "B2C_1_b2c_su_si_mfasms";
        public static readonly string SignInPolicySoc = "B2C_1_b2c_su_si_soc";
        public static readonly string PolicyPassword = "B2C_1_passwordreset";
        public static string IosKeychainSecurityGroups = "com.microsoft.adalcache";
        public static readonly string[] Scopes = new[] { "openid", "offline_access" };

        public static string AuthorityBase = $"https://{TenantName}.b2clogin.com/tfp/{TenantId}/";
        public static string AuthoritySignIn = $"{AuthorityBase}{SignInPolicy}";
        public static string AuthoritySignInSoc = $"{AuthorityBase}{SignInPolicySoc}";
        public static string WebViewSrc = "https://ucmsdk-qa.ucmdigitalhealth.com/";
        public static string ApiUrl = WebViewSrc + "dev2/";
        public static string CrazyPassword = "5nAo#F1qQoV4a!!";
    }
}
