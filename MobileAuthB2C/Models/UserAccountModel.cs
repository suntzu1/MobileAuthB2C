using System;
using Newtonsoft.Json;

namespace Gia.Models
{
    public class UserAccountModel
    {

        [JsonProperty(PropertyName = "first_name")]
        public string FirstName { get; set; }

        [JsonProperty(PropertyName = "last_name")]
        public string LastName { get; set; }

        [JsonProperty(PropertyName = "mobile_phone")]
        public string Mobile { get; set; }

        [JsonProperty(PropertyName = "email_id")]
        public string Email { get; set; }

        [JsonProperty(PropertyName = "password")]
        public string Password { get; set; }

        [JsonProperty(PropertyName = "confirm_password")]
        public string ConfirmPassword { get; set; }

        public bool Success { get; set; }

        public string Error { get; set; }

    }
}
