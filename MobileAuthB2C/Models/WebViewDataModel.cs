using System;
using Newtonsoft.Json;

namespace MobileAuthB2C.Models
{
    public class WebViewDataModel
    {
        [JsonProperty(PropertyName = "method")]
        public string Method { get; set; }

        [JsonProperty(PropertyName = "data")]
        public Object Data { get; set; }
    }
}
