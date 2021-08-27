using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Gms.Extensions;
using Android.Runtime;
using Android.OS;
using Android.Webkit;
using Firebase;
using Firebase.DynamicLinks;
using Firebase.Messaging;
using Gia.Authentication;
using Gia.Droid.Services;
using Microsoft.Identity.Client;
using Plugin.Fingerprint;
using Xamarin.Forms;
using System;

namespace MobileAuthB2C.Droid
{
    [Activity(Label = "MobileAuthB2C", Icon = "@mipmap/icon", Theme = "@style/MainTheme", 
        // MainLauncher = true, 
        ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation | ConfigChanges.UiMode | ConfigChanges.ScreenLayout | ConfigChanges.SmallestScreenSize )]
    public class MainActivity : global::Xamarin.Forms.Platform.Android.FormsAppCompatActivity
    {
        internal static int FILECHOOSER_RESULTCODE = 1;
        public static int PHOTO_REQUEST = 10023;
        public static IValueCallback mUploadCallbackAboveL;
        public static Android.Net.Uri imageUri;
        public static IValueCallback UploadMessage { get; internal set; }

        // protected override void OnCreate(Bundle savedInstanceState)
        // {
        //     base.OnCreate(savedInstanceState);
        //
        //     Xamarin.Essentials.Platform.Init(this, savedInstanceState);
        //     global::Xamarin.Forms.Forms.Init(this, savedInstanceState);
        //     LoadApplication(new App());
        // }

        protected override void OnCreate(Bundle savedInstanceState)
        {

            CrossFingerprint.SetCurrentActivityResolver(() => this);
            TabLayoutResource = Resource.Layout.Tabbar;
            ToolbarResource = Resource.Layout.Toolbar;

            base.OnCreate(savedInstanceState);

            Xamarin.Essentials.Platform.Init(this, savedInstanceState);
            Forms.Init(this, savedInstanceState);
            DependencyService.Register<IParentWindowLocatorService, AndroidParentWindowLocatorService>();

            _ = FirebaseApp.InitializeApp(this);
            _ = SaveFcmTokenAsync();

            string MeetingId = Intent.GetStringExtra("MeetingId");
            string MeetingPassword = Intent.GetStringExtra("MeetingPassword");
            string notificationData = @"{'MeetingId': '" + MeetingId + "' , 'MeetingPassword': '" + MeetingPassword + "','PlayAudio':'false'}";

            // FirebaseDynamicLinks.Instance.GetDynamicLink(Intent)
            //     .AddOnSuccessListener(this, new DynamiclinkListener());
            LoadApplication(new App());
            App.UIParent = this;
            SendNotification(notificationData);
        }
        async void SendNotification(string notificationData)
        {
            await System.Threading.Tasks.Task.Delay(2000);

            MessagingCenter.Send<object, string>(this, "notificationData", notificationData);

        }
        private async System.Threading.Tasks.Task SaveFcmTokenAsync()
        {
            string fcmToken = (string)await FirebaseMessaging.Instance.GetToken();
            Console.WriteLine("######### fcm token ######");
            Console.WriteLine(fcmToken);
            Xamarin.Forms.Application.Current.Properties["FcmToken"] = fcmToken;
            Xamarin.Forms.Application.Current.Properties["AppType"] = "android";
            await Xamarin.Forms.Application.Current.SavePropertiesAsync();
        }

        protected override void OnActivityResult(int requestCode, Result resultCode, Intent data)
        {
            base.OnActivityResult(requestCode, resultCode, data);
            AuthenticationContinuationHelper.SetAuthenticationContinuationEventArgs(requestCode, resultCode, data);
        }
        public override void OnRequestPermissionsResult(int requestCode, string[] permissions, [GeneratedEnum] Android.Content.PM.Permission[] grantResults)
        {
            Xamarin.Essentials.Platform.OnRequestPermissionsResult(requestCode, permissions, grantResults);

            base.OnRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}