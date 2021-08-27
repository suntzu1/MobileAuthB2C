using System;
using Gia.Authentication;
using Xamarin.Essentials;

namespace Gia.Droid.Services
{
    class AndroidParentWindowLocatorService : IParentWindowLocatorService
    {
        public object GetCurrentParentWindow()
        {
            return Platform.CurrentActivity;
        }
    }
}
