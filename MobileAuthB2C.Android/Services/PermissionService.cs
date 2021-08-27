using Android;
using Android.OS;
using AndroidX.Core.App;
using AndroidX.Core.Content;
using Gia.Droid.Services;
using Gia.Services;
using MobileAuthB2C.Services;
using Xamarin.Essentials;
using Xamarin.Forms;

[assembly: Dependency(typeof(PermissionService))]
namespace Gia.Droid.Services
{
    public class PermissionService : IPermissionService
    {
        public PermissionService()
        {
        }

        public void GetPermission()
        {
            if ((int)Build.VERSION.SdkInt >= 23)
            {
                var cameraPermission = ContextCompat.CheckSelfPermission(Android.App.Application.Context, Manifest.Permission.Camera);
                var microphonePermission = ContextCompat.CheckSelfPermission(Android.App.Application.Context, Manifest.Permission.RecordAudio);
                if (cameraPermission == Android.Content.PM.Permission.Denied || microphonePermission == Android.Content.PM.Permission.Denied)
                {
                    ActivityCompat.RequestPermissions(Platform.CurrentActivity, new string[] { Manifest.Permission.Camera, Manifest.Permission.RecordAudio }, 1);

                }
            }
        }

    }
}
