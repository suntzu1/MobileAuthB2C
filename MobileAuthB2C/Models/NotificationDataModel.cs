using System;
using Newtonsoft.Json;

namespace Gia.Models
{
    public class NotificationDataModel
    {
        [JsonProperty(PropertyName = "MeetingId")]
        public string MeetingId { get; set; }

        [JsonProperty(PropertyName = "MeetingPassword")]
        public string MeetingPassword { get; set; }

        public bool PlayAudio { get; set; }
    }
}
