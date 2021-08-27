using System;
using Android.App;
using Android.Content;
using Android.OS;
using Android.Provider;

namespace Gia.Droid.Utils
{
    public class CameraUtil
    {
        public CameraUtil()
        {
        }

        public static void CaptureImage(Activity activity, Android.Net.Uri imageUri, int requestCode)
        {
            Intent intentCamera = new Intent();

            _ = intentCamera.SetAction(MediaStore.ActionImageCapture);


            if (Build.VERSION.SdkInt >= Android.OS.BuildVersionCodes.N)
            {
                intentCamera.PutExtra(MediaStore.ExtraOutput, imageUri);
                intentCamera.AddFlags(ActivityFlags.GrantReadUriPermission);
            }
            if (activity != null)
            {
                activity.StartActivityForResult(intentCamera, requestCode);
            }
        }
    }
}
