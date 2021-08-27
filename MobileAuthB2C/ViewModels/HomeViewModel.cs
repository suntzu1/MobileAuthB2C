using System.Collections.Generic;
using System.Threading.Tasks;
using MobileAuthB2C.Models;
using MobileAuthB2C.Views;
using Newtonsoft.Json;
using Xamarin.Forms;

namespace MobileAuthB2C.ViewModels
{
    public class HomeViewModel: BaseViewModel
    {
        private List<ThemeDataModel> themeList = new List<ThemeDataModel>();

        private UserModel user;

        public HomeViewModel(UserModel userData)
        {
            UserData = userData;
            ThemeList.Add(new ThemeDataModel() { ThemeName = "Default", ThemePrimaryColor = "0xFFBE143c", ThemeSecondaryColor = "0xff8D143c", ThemeFont = "Source Sans Pro" });
            ThemeList.Add(new ThemeDataModel() { ThemeName = "Blue", ThemePrimaryColor = "0xFF25A1DA", ThemeSecondaryColor = "0xFF0058B3", ThemeFont = "ProductSans", AppLogo = "https://gia-dev2.ucmdigitalhealth.com/images/logo2.png" });
            SelectedTheme = ThemeList[0];
        }
        public List<ThemeDataModel> ThemeList
        {
            get { return themeList; }
            set
            {
                themeList = value;
                OnPropertyChanged("ThemeList");
            }
        }
        private ThemeDataModel selectedTheme;
        public ThemeDataModel SelectedTheme
        {
            get { return selectedTheme; }
            set
            {
                selectedTheme = value;
                OnPropertyChanged("SelectedTheme");
            }
        }
        public UserModel UserData
        {
            get { return user; }
            set
            {
                user = value;
                OnPropertyChanged("UserData");
            }
        }
        public Command HomeBtnCommand
        {
            get
            {
                return new Command<string>(
            async (string pageType) =>
            {
                await HomeBtnCommandHandler(pageType);
            });
            }
        }


        private async Task HomeBtnCommandHandler(string pageType)
        {
            switch (pageType)
            {
                case "urgent-care":
                case "screening":
                case "rxrefill":
                case "covid19-care":
                case "profile":
                case "learn-about-topic":
                    await navigateToWebView(pageType);
                    break;
                default:
                    await App.Current.MainPage.DisplayAlert("", "This feature is currently unavailable", "OK");
                    break;
            }
        }
        private async Task navigateToWebView(string pageType)
        {
            UserData.ThemePrimaryColor = SelectedTheme.ThemePrimaryColor;
            UserData.ThemeSecondaryColor = SelectedTheme.ThemeSecondaryColor;
            UserData.ThemeFont = SelectedTheme.ThemeFont;
            UserData.AppLogo = SelectedTheme.AppLogo;
            string jsonData = JsonConvert.SerializeObject(UserData);
            await App.Current.MainPage.Navigation.PushAsync(new HybridWebViewPage(pageType, jsonData));

        }
    }
}
