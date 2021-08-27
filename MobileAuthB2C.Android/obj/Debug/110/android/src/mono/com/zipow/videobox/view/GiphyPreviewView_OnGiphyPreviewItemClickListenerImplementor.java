package mono.com.zipow.videobox.view;


public class GiphyPreviewView_OnGiphyPreviewItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.GiphyPreviewView.OnGiphyPreviewItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGiphyPreviewItemClick:(Lcom/zipow/videobox/view/GiphyPreviewView$GiphyPreviewItem;)V:GetOnGiphyPreviewItemClick_Lcom_zipow_videobox_view_GiphyPreviewView_GiphyPreviewItem_Handler:Com.Zipow.Videobox.View.GiphyPreviewView/IOnGiphyPreviewItemClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.GiphyPreviewView+IOnGiphyPreviewItemClickListenerImplementor, MobileRTC_Droid", GiphyPreviewView_OnGiphyPreviewItemClickListenerImplementor.class, __md_methods);
	}


	public GiphyPreviewView_OnGiphyPreviewItemClickListenerImplementor ()
	{
		super ();
		if (getClass () == GiphyPreviewView_OnGiphyPreviewItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.GiphyPreviewView+IOnGiphyPreviewItemClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onGiphyPreviewItemClick (com.zipow.videobox.view.GiphyPreviewView.GiphyPreviewItem p0)
	{
		n_onGiphyPreviewItemClick (p0);
	}

	private native void n_onGiphyPreviewItemClick (com.zipow.videobox.view.GiphyPreviewView.GiphyPreviewItem p0);

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
