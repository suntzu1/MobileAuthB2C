using System;
using System.Threading.Tasks;
using Gia.Models;
using MobileAuthB2C;
using MobileAuthB2C.ViewModels;
using Xamarin.Forms;

namespace Gia.ViewModels
{
    public class RegistrationViewModel : BaseViewModel
    {
        public RegistrationViewModel()
        {
        }
        private UserAccountModel userAccount = new UserAccountModel();
        private bool _isLoading;
        public bool IsLoading
        {
            get { return _isLoading; }
            set
            {
                _isLoading = value;
                OnPropertyChanged("IsLoading");
            }
        }
        private bool _isBtnVisible = true;
        public bool IsBtnVisible
        {
            get { return _isBtnVisible; }
            set
            {
                _isBtnVisible = value;
                OnPropertyChanged("IsBtnVisible");
            }
        }
        public string FirstName
        {
            get { return userAccount.FirstName; }
            set
            {
                userAccount.FirstName = value;
                OnPropertyChanged("FirstName");
            }
        }
        public string LastName
        {
            get { return userAccount.LastName; }
            set
            {
                userAccount.LastName = value;
                OnPropertyChanged("LastName");
            }
        }
        public string Email
        {
            get { return userAccount.Email; }
            set
            {
                userAccount.Email = value;
                OnPropertyChanged("Email");
            }
        }
        public string Mobile
        {
            get { return userAccount.Mobile; }
            set
            {
                userAccount.Mobile = value;
                OnPropertyChanged("Mobile");
            }
        }
        public string Password
        {
            get { return userAccount.Password; }
            set
            {
                userAccount.Password = value;
                OnPropertyChanged("Password");
            }
        }
        public string ConfirmPassword
        {
            get { return userAccount.ConfirmPassword; }
            set
            {
                userAccount.ConfirmPassword = value;
                OnPropertyChanged("ConfirmPassword");
            }
        }

        public Command CreateAccountCommand
        {
            get
            {
                return new Command(async x => await CreateAccount());
            }
        }

        private async Task CreateAccount()
        {
            try
            {
                    IsBtnVisible = false;
                    IsLoading = true;
                    UserAccountModel userResponse = await apiService.RegisterUser(userAccount);
                    IsLoading = false;
                    IsBtnVisible = true;
                if (userResponse.Success)
                {
                    await App.Current.MainPage.DisplayAlert("Registration success", "User Registered", "OK");
                    await App.Current.MainPage.Navigation.PopAsync();
                }
                else
                {
                    await App.Current.MainPage.DisplayAlert("Registration Failed", "Failed to register user", "OK");
                }
            }
            catch (Exception E)
            {
                Console.WriteLine(E.Message);
                await App.Current.MainPage.DisplayAlert("Registration Failed", "Failed to register user", "OK");
            }
        }
    }
}
