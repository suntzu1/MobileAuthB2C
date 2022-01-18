namespace MobileAuthB2C
{

    // no config files so we will use constants class
    public static class Constants
    {
        // my personal tenant settings
        /*
        public static readonly string TenantName = "abemvptesting";
        public static readonly string TenantId = "abemvptesting.onmicrosoft.com";
        public static readonly string ClientId = "294840f4-0bff-4fb0-9399-563044317163";
        public static readonly string SignInPolicy = "B2C_1_b2c_su_si_mfasms";
        public static readonly string SignInPolicySoc = "B2C_1_b2c_su_si_soc";
        public static readonly string PolicyPassword = "B2C_1_passwordreset";

        // mvp tenant setting
        public static readonly string TenantName = "mvpb2cdev";
        public static readonly string TenantId = "mvpb2cdev.onmicrosoft.com";
        public static readonly string ClientId = "d4fd54d3-a0fd-4b26-a905-acfbb1df7a94";
        public static readonly string SignInPolicy = "B2C_1A_NEWMOBILE";
        public static readonly string SignInPolicySoc = "B2C_1A_NewMobileSocial";
        public static readonly string PolicyPassword = "B2C_1A_SignInMemberOIDC";
        */

        // mvp tenant setting 2
        public static readonly string TenantName = "mvpb2cacc";
        public static readonly string TenantId = "mvpb2cacc.onmicrosoft.com";
        public static readonly string ClientId = "6a3559bc-1177-4dda-a421-2c82d91d35c3";
        public static readonly string SignInPolicy = "B2C_1A_NEWMOBILE";
        public static readonly string SignInPolicySoc = "B2C_1A_NewMobileSocial";
        public static readonly string PolicyPassword = "B2C_1A_SignInMemberOIDC";

        //public static readonly string ClientId = "38d6fdb6-6c6a-416e-b84c-bf9a36ecb4b0"; // xamarin mobile dmi
        //public static readonly string ClientId = "a8584628-6371-4c58-a9d2-795967af6990"; // 
        //public static readonly string ClientId = "a5f23d05-3cb7-4ed5-adb4-76db2ff4a021"; // member


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
