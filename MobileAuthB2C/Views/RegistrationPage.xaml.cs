using System;
using System.Collections.Generic;
using Gia.ViewModels;
using Xamarin.Forms;

namespace Gia.View
{
    public partial class RegistrationPage : ContentPage
    {
        RegistrationViewModel registrationViewModel;

        public RegistrationPage()
        {
            registrationViewModel = new RegistrationViewModel();
            InitializeComponent();
            BindingContext = registrationViewModel;
        }
    }
}
