using Android.App;
using Android.Content;
using Microsoft.Identity.Client;
namespace Gia.Droid
{
    [Activity]
    [IntentFilter(new[] { Intent.ActionView },
        Categories = new[] { Intent.CategoryBrowsable, Intent.CategoryDefault },
        DataHost = "auth",
        DataScheme = "msal553aad78-c813-4044-8c4e-a8be91ae57c1")]
    public class MsalActivity : BrowserTabActivity
    {
    }
}
