using System;
using System.Threading.Tasks;
using Android.Gms.Tasks;
using Android.Runtime;
using Firebase.DynamicLinks;
using Firebase.Messaging;
using Xamarin.Forms;

namespace Gia.Droid.Services
{
    public class DynamiclinkListener : Java.Lang.Object, IOnSuccessListener, IOnFailureListener
    {
        public void OnFailure(Java.Lang.Exception e)
        {
            Console.WriteLine(e.Message);
        }

        void IOnSuccessListener.OnSuccess(Java.Lang.Object result)
        {
            if (result != null)
            {
                try
                {
                    var pendingDynamicLink = result as PendingDynamicLinkData;
                    string notificationData = @"{'MeetingId': '" + pendingDynamicLink.Link.GetQueryParameter("id") + "' , 'MeetingPassword': '" + pendingDynamicLink.Link.GetQueryParameter("pwd") + "','PlayAudio':'false'}";
                    MessagingCenter.Send<object, string>(this, "notificationData", notificationData);
                }
                catch (Exception e)
                {
                    Console.WriteLine(e);
                }
            }


        }
    }

    class OnSuccessListner : Java.Lang.Object, IOnSuccessListener
    {
        TaskCompletionSource<string> _tcs;

        public OnSuccessListner(TaskCompletionSource<string> tcs)
        {
            _tcs = tcs;
        }

        void IOnSuccessListener.OnSuccess(Java.Lang.Object result)
        {
            var link = result.JavaCast<IShortDynamicLink>();
            _tcs.TrySetResult(link.ShortLink.ToString());
        }
    }
}
