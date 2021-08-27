using System;
using System.Threading.Tasks;
using MobileAuthB2C.Models;
using MobileAuthB2C.Services;
using Newtonsoft.Json;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace MobileAuthB2C.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class HybridWebViewPage : ContentPage
    {
        string _webViewParams;
        string _userData;


        public HybridWebViewPage(string webViewParams, string userData)
        {
            _webViewParams = webViewParams;
            _userData = userData;
            NavigationPage.SetHasNavigationBar(this, false);
            InitializeComponent();
            WebViewElement.Source = Constants.WebViewSrc + _webViewParams;

            Console.WriteLine("######################");

            Console.WriteLine(Constants.WebViewSrc + _webViewParams);

            WebViewElement.RegisterAction(DisplayDataFromJavascript);
            WebViewElement.Navigating += WebviewNavigating;
            WebViewElement.Navigated += WebviewNavigated;
            ActivityIndicator.IsRunning = true;
        }

        protected override void OnAppearing()
        {
            base.OnAppearing();
            CheckPermissions();
        }
        void WebviewNavigating(object sender, WebNavigatingEventArgs e)
        {
        }
        void WebviewNavigated(object sender, WebNavigatedEventArgs e)
        {
            ActivityIndicator.IsRunning = false;
        }
        private void DisplayDataFromJavascript(string data)
        {
            Device.InvokeOnMainThreadAsync(async () =>
            {
                try
                {
                    WebViewDataModel webViewData = JsonConvert.DeserializeObject<WebViewDataModel>(data);

                    switch (webViewData.Method)
                    {
                        case "webViewLoaded":
                            await ConfigureWebView();
                            break;
                        case "backButton":
                            NavigateBack(webViewData.Data.ToString());
                            break;
                        default:
                            break;
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }


            });

        }

        private async Task ConfigureWebView()
        {
            ActivityIndicator.IsRunning = false;

            await WebViewElement.EvaluateJavaScriptAsync($"window.receiveUserConfig('{_userData}')");
        }

        private void CheckPermissions()
        {
            if (Device.RuntimePlatform == Device.Android)
            {
                // Android specific code

                DependencyService.Get<IPermissionService>().GetPermission();
            }
        }

        private async void NavigateBack(String res)
        {
            await Navigation.PopAsync();
        }
    }
}