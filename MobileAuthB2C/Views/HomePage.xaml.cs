using MobileAuthB2C.Models;
using MobileAuthB2C.ViewModels;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace MobileAuthB2C.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class HomePage : ContentPage
    {
        HomeViewModel homeViewModel;
        public HomePage(UserModel userData)
        {
            homeViewModel = new HomeViewModel(userData);
            NavigationPage.SetHasNavigationBar(this, false);
            InitializeComponent();
            BindingContext = homeViewModel;
        }
    }
}