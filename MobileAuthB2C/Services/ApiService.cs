using System;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using Gia.Constants;
using Gia.Models;
using MobileAuthB2C.Models;
using Newtonsoft.Json;

namespace Gia.Services
{
    public class ApiService
    {
        HttpClient client;
        public ApiService()
        {
            client = new HttpClient
            {
                MaxResponseContentBufferSize = 256000
            };
        }

        public async Task<UserModel> Login(string email, string password)
        {
            ApiResponseModel apiResponse = new ApiResponseModel();
            UserModel user = new UserModel();
            HttpResponseMessage response;
            try
            {
                object userInfo = new { login_email = email, login_password = password, sourceFrom = "MVP"};
                var jsonData = JsonConvert.SerializeObject(userInfo);
                var requestBody = new StringContent(jsonData, Encoding.UTF8, "application/json");
                response = await client.PostAsync(AppConstants.ApiUrl + "registration/cognitoLogin", requestBody);
                if (response.StatusCode == System.Net.HttpStatusCode.OK)
                {
                    var content = await response.Content.ReadAsStringAsync();
                    Console.WriteLine(content);
                    apiResponse = JsonConvert.DeserializeObject<ApiResponseModel>(await response.Content.ReadAsStringAsync());
                    if(apiResponse.Status == "success")
                    {
                        user = JsonConvert.DeserializeObject<UserModel>(apiResponse.Result.ToString());
                        user.Success = true;
                        return user;
                    }
                    else
                    {
                        user.Success = false;
                        user.Error = apiResponse.Message;
                        return user;
                    }
                }
                else
                {
                    user.Success = false;
                    user.Error = "Failed to authenticate";
                    return user;
                }
            }
            catch (Exception E)
            {
                Console.WriteLine(E.ToString());
                user.Success = false;
                user.Error = "Failed to authenticate";
                return user;
            }
        }


        public async Task<UserAccountModel> RegisterUser(UserAccountModel userAccount)
        {
            UserAccountModel userResponse = new UserAccountModel();
            HttpResponseMessage response;
            try
            {
                object userInfo = new { FirstName = userAccount.FirstName, LastName = userAccount.LastName, Mobile = userAccount.Mobile, Email = userAccount.Email, Password = userAccount.Password, ConfirmPassword = userAccount.ConfirmPassword };
                var jsonData = JsonConvert.SerializeObject(userInfo);
                var requestBody = new StringContent(jsonData, Encoding.UTF8, "application/json");
                response = await client.PostAsync(AppConstants.AzureApi, requestBody);
                Console.WriteLine("api response");
                Console.WriteLine(response.StatusCode);
                if (response.StatusCode == System.Net.HttpStatusCode.OK)
                {
                    var content = await response.Content.ReadAsStringAsync();
                    Console.WriteLine("response body");
                    Console.WriteLine(content);
                    userResponse.Success = true;
                    return userResponse;

                }
                else {
                    userResponse.Success = false;
                    userResponse.Error = "Failed to register user";
                    return userResponse;

                }

            }
            catch (Exception E)
            {
                Console.WriteLine(E.ToString());
                userResponse.Success = false;
                userResponse.Error = "Failed to register user";
                return userResponse;
            }
        }


        public async Task<string> CognitoLogin(string email)
        {
            ApiResponseModel apiResponse = new ApiResponseModel();
            HttpResponseMessage response;
            try
            {
                object userInfo = new { email = email};
                var jsonData = JsonConvert.SerializeObject(userInfo);
                var requestBody = new StringContent(jsonData, Encoding.UTF8, "application/json");
                response = await client.PostAsync(AppConstants.CognitoUrl, requestBody);
                if (response.StatusCode == System.Net.HttpStatusCode.OK)
                {
                    var content = await response.Content.ReadAsStringAsync();
                    Console.WriteLine(content);
                    apiResponse = JsonConvert.DeserializeObject<ApiResponseModel>(await response.Content.ReadAsStringAsync());
                    if (apiResponse.Status == "success")
                    {
                        return apiResponse.Result.ToString();
                    }
                    else
                    {
                        return "Failed to authenticate";
                    }
                }
                else
                {
                    return "Failed to authenticate";
                }
            }
            catch (Exception E)
            {
                Console.WriteLine(E.ToString());
                return "Failed to authenticate";
            }
        }

    }
}
