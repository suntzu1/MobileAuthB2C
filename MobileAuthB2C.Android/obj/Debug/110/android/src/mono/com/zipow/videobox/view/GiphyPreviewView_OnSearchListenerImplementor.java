package mono.com.zipow.videobox.view;


public class GiphyPreviewView_OnSearchListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.GiphyPreviewView.OnSearchListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSearch:(Ljava/lang/String;)V:GetOnSearch_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.GiphyPreviewView/IOnSearchListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.GiphyPreviewView+IOnSearchListenerImplementor, MobileRTC_Droid", GiphyPreviewView_OnSearchListenerImplementor.class, __md_methods);
	}


	public GiphyPreviewView_OnSearchListenerImplementor ()
	{
		super ();
		if (getClass () == GiphyPreviewView_OnSearchListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.GiphyPreviewView+IOnSearchListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onSearch (java.lang.String p0)
	{
		n_onSearch (p0);
	}

	private native void n_onSearch (java.lang.String p0);

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
