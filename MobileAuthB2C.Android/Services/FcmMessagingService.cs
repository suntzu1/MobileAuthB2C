using System;
using Android.App;
using Android.Content;
using Android.Media;
using Firebase.Messaging;
using MobileAuthB2C.Droid;

namespace Gia.Droid
{
    [Service]
    [IntentFilter(new[] { "com.google.firebase.INSTANCE_ID_EVENT" })]
    [IntentFilter(new[] { "com.google.firebase.MESSAGING_EVENT" })]
    [IntentFilter(new[] { "com.google.android.c2dm.intent.RECEIVE" })]
    public class FcmMessagingService : FirebaseMessagingService
    {
        public const string PRIMARY_CHANNEL = "fcm_fallback_notification_channel";

       public override void OnMessageReceived(RemoteMessage message)
        {
            ShowNotification(message);

            base.OnMessageReceived(message);
        }

        private void ShowNotification(RemoteMessage message)
        {
            try
            {
                var intent = new Intent(this, typeof(MainActivity));
                

                Random random = new Random();
                int pushCount = random.Next(9999 - 1000) + 1000; //for multiplepushnotifications

                
                var notificationManager = GetSystemService(Context.NotificationService) as NotificationManager;

                var notificationChannel = new NotificationChannel(PRIMARY_CHANNEL, "Miscellaneous", NotificationImportance.High);

                var audioAttributes = new AudioAttributes.Builder()
                    .SetContentType(AudioContentType.Music)
                    .SetUsage(AudioUsageKind.Notification).Build();


                notificationChannel.EnableLights(true);
                notificationChannel.EnableVibration(true);
                notificationChannel.LockscreenVisibility = NotificationVisibility.Public;


                Android.Net.Uri notificationUri = Android.Net.Uri.Parse($"{ ContentResolver.SchemeAndroidResource}://{PackageName}/{Resource.Raw.ringtone}");

                notificationChannel.SetSound(notificationUri, audioAttributes);


                notificationManager.CreateNotificationChannel(notificationChannel);

                var remoteNotification = message.Data;


                intent.PutExtra("MeetingId", remoteNotification["meeting_id"]); 
                intent.PutExtra("MeetingPassword", remoteNotification["meeting_password"]);
                intent.AddFlags(ActivityFlags.ClearTop);
                var pendingIntent = PendingIntent.GetActivity(this, pushCount, intent, PendingIntentFlags.Immutable);


                var builder = new Notification.Builder(this, PRIMARY_CHANNEL)
                    .SetContentTitle(remoteNotification["title"])
                    .SetContentText(remoteNotification["body"])
                    .SetSmallIcon(Resource.Mipmap.icon)
                    .SetAutoCancel(true)
                    .SetContentIntent(pendingIntent);


                var notification = builder.Build();
                notificationManager.Notify(0, notification);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

    }


}
