package mono.com.zipow.videobox.view;


public class GiphyPreviewView_OnBackClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.GiphyPreviewView.OnBackClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBackClick:(Landroid/view/View;)V:GetOnBackClick_Landroid_view_View_Handler:Com.Zipow.Videobox.View.GiphyPreviewView/IOnBackClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.GiphyPreviewView+IOnBackClickListenerImplementor, MobileRTC_Droid", GiphyPreviewView_OnBackClickListenerImplementor.class, __md_methods);
	}


	public GiphyPreviewView_OnBackClickListenerImplementor ()
	{
		super ();
		if (getClass () == GiphyPreviewView_OnBackClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.GiphyPreviewView+IOnBackClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onBackClick (android.view.View p0)
	{
		n_onBackClick (p0);
	}

	private native void n_onBackClick (android.view.View p0);

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
