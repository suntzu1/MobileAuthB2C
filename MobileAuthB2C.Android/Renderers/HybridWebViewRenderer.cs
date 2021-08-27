using Android.Content;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;
//using Gia.Controls;
using Gia.Droid.Renderers;
using Android.OS;
using System;
using MobileAuthB2C.Controls;
using MobileAuthB2C.Droid;

[assembly: ExportRenderer(typeof(HybridWebView), typeof(HybridWebViewRenderer))]
namespace Gia.Droid.Renderers
{
    public class HybridWebViewRenderer : WebViewRenderer
    {
        private const string JavascriptFunction = "function invokeCSharpAction(data){jsBridge.invokeAction(data);}";
        Context _context;

        public HybridWebViewRenderer(Context context) : base(context)
        {
            _context = context;
        }

        protected override void OnElementChanged(ElementChangedEventArgs<Xamarin.Forms.WebView> e)
        {
            base.OnElementChanged(e);
            if (Control != null)
            {
                // Control.Settings.SetAppCacheEnabled(true);
                //Control.Settings.SetAppCachePath(_context.CacheDir.Path);
                // Control.Settings.CacheMode = Android.Webkit.CacheModes.CacheElseNetwork;
            }
          if (e.OldElement != null)
            {
                Control.RemoveJavascriptInterface("jsBridge");
                ((HybridWebView)Element).Cleanup();
            }
            if (e.NewElement != null)
            {
                

                Control.AddJavascriptInterface(new JsBridge(this), "jsBridge");
                Control.SetWebChromeClient(new CustomWebChromeClient(_context.GetActivity(), $"javascript: {JavascriptFunction}", (uploadMsg, acceptType, capture) =>
                {
                    Console.WriteLine("##############");
                    Console.WriteLine(capture);
                        MainActivity.UploadMessage = uploadMsg;
                        var i = new Intent(Intent.ActionGetContent);

                        //To set all image file types. You can change to whatever you need
                        i.SetType("*/*");

                        //Here File Chooser dialog is started as Activity, and it gives result while coming back from that Activity.
                        ((MainActivity)this.Context).StartActivityForResult(Intent.CreateChooser(i, "File Chooser"), MainActivity.FILECHOOSER_RESULTCODE);
                }));
            }
        }
    }
}
