using System;
namespace Gia.Models
{
    public class ApiResponseModel
    {
        public string Status { get; set; }
        public int StatusCode { get; set; }
        public string Message { get; set; }
        public Object Result { get; set; }
    }
}
