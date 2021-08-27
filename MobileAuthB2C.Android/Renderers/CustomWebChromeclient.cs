using System;
using Android.App;
using Android.OS;
using Android.Webkit;
using AndroidX.Core.Content;
using Gia.Droid.Utils;
using Java.IO;
using MobileAuthB2C.Droid;

namespace Gia.Droid.Renderers
{
    public class CustomWebChromeClient : WebChromeClient
    {
        Activity mContext;
        readonly string _javascript;
        Action<IValueCallback, Java.Lang.String, Java.Lang.String> callback;

        public CustomWebChromeClient(Activity context, string javascript, Action<IValueCallback, Java.Lang.String, Java.Lang.String> callback)
        {
            this.mContext = context;
            _javascript = javascript;
            this.callback = callback;
        }

        public override void OnReceivedTitle(Android.Webkit.WebView view, string title)
        {
            view.EvaluateJavascript(_javascript, null);
            base.OnReceivedTitle(view, title);
        }


        //For Android 4.1+
        [Java.Interop.Export]
        public void openFileChooser(IValueCallback uploadMsg, Java.Lang.String acceptType, Java.Lang.String capture)
        {
            callback(uploadMsg, acceptType, capture);
        }

        // For Android 5.0+
        public override bool OnShowFileChooser(WebView webView, IValueCallback filePathCallback, FileChooserParams fileChooserParams)
        {
            //return base.OnShowFileChooser(webView, filePathCallback, fileChooserParams);

            if (fileChooserParams.IsCaptureEnabled)
            {
                MainActivity.mUploadCallbackAboveL = filePathCallback;
                CapturePhoto();
            }
            else
            {
                callback(filePathCallback, null, null);
            }
            return true;
        }

        private void CapturePhoto()
        {
            File fileUri = new File(mContext.FilesDir.Path);

            if (Build.VERSION.SdkInt >= Android.OS.BuildVersionCodes.N)
            {
                if (!fileUri.Exists())
                {
                    fileUri.Mkdir();
                }
                File file = new File(fileUri, SystemClock.CurrentThreadTimeMillis() + ".jpg");
                MainActivity.imageUri = FileProvider.GetUriForFile(mContext, Application.Context.PackageName + ".fileprovider", file);
            }
            CameraUtil.CaptureImage(mContext, MainActivity.imageUri, MainActivity.PHOTO_REQUEST);
        }

        [Android.Annotation.TargetApi(Value = 21)]
        public override void OnPermissionRequest(PermissionRequest request)
        {
            mContext.RunOnUiThread(() =>
            {
                request.Grant(request.GetResources());

            });

        }
    }
}