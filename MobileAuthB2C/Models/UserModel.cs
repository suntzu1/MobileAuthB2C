using Newtonsoft.Json;

namespace MobileAuthB2C.Models
{
    public class UserModel
    {
        [JsonProperty(PropertyName = "account_id")]
        public string AccountId { get; set; }

        [JsonProperty(PropertyName = "first_name")]
        public string FirstName { get; set; }

        [JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        [JsonProperty(PropertyName = "last_name")]
        public string LastName { get; set; }

        [JsonProperty(PropertyName = "mobile_phone")]
        public string Mobile { get; set; }

        [JsonProperty(PropertyName = "email_id")]
        public string Email { get; set; }

        [JsonProperty(PropertyName = "id_token")]
        public string Token { get; set; }

        [JsonProperty(PropertyName = "salesforce_account_id")]
        public string SalesForceAccountId { get; set; }

        [JsonProperty(PropertyName = "cognitoUserName")]
        public string CognitoUserName { get; set; }

        [JsonProperty(PropertyName = "INVALID_USER")]
        public string InvalidUser { get; set; }

        public string FirebaseToken { get; set; }

        public bool Success { get; set; }

        public string Error { get; set; }

        public string AppType { get; set; }

        public string ThemePrimaryColor { get; set; }

        public string ThemeSecondaryColor { get; set; }

        public string ThemeFont { get; set; }

        public string AppLogo { get; set; }
    }
}
