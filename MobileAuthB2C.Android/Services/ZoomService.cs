using System;
using Gia.Droid.Services;
using Gia.Services;
using US.Zoom.Sdk;
using Xamarin.Forms;

[assembly: Dependency(typeof(ZoomService))]
namespace Gia.Droid.Services
{
    public class ZoomService : Java.Lang.Object, IZoomService, IZoomSDKInitializeListener
    {
        ZoomSDK zoomSDK;
        public ZoomService()
        {

        }
        public void InitZoomLib(string appKey, string appSecret)
        {
            zoomSDK = ZoomSDK.Instance;
            var zoomInitParams = new ZoomSDKInitParams
            {
                AppKey = appKey,
                AppSecret = appSecret
            };
            zoomSDK.Initialize(Android.App.Application.Context, this, zoomInitParams);
        }

        public bool IsInitialized() => zoomSDK?.IsInitialized ?? false;

        public void JoinMeeting(string meetingId, string displayName, string meetingPassword)
        {
            if (IsInitialized())
            {
                var meetingService = zoomSDK.MeetingService;
                meetingService.JoinMeetingWithParams(Android.App.Application.Context, new JoinMeetingParams
                {
                    MeetingNo = meetingId,
                    DisplayName = displayName,
                    Password = meetingPassword
                });
            }
        }

        public void OnZoomAuthIdentityExpired()
        {
            Console.WriteLine("OnZoomAuthIdentityExpired");
        }

        public void OnZoomSDKInitializeResult(int p0, int p1)
        {
            Console.WriteLine($"Authentication Status: {p0} - {p1}");
        }
    }
}
