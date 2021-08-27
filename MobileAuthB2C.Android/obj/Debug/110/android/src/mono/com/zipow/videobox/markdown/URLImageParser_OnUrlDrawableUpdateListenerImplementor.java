package mono.com.zipow.videobox.markdown;


public class URLImageParser_OnUrlDrawableUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.markdown.URLImageParser.OnUrlDrawableUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUrlDrawableUpdate:()V:GetOnUrlDrawableUpdateHandler:Com.Zipow.Videobox.Markdown.URLImageParser/IOnUrlDrawableUpdateListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Markdown.URLImageParser+IOnUrlDrawableUpdateListenerImplementor, MobileRTC_Droid", URLImageParser_OnUrlDrawableUpdateListenerImplementor.class, __md_methods);
	}


	public URLImageParser_OnUrlDrawableUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == URLImageParser_OnUrlDrawableUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Markdown.URLImageParser+IOnUrlDrawableUpdateListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onUrlDrawableUpdate ()
	{
		n_onUrlDrawableUpdate ();
	}

	private native void n_onUrlDrawableUpdate ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
