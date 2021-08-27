package mono.com.zipow.videobox.view.photopicker;


public class TouchImageView_OnTouchImageViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.photopicker.TouchImageView.OnTouchImageViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMove:()V:GetOnMoveHandler:Com.Zipow.Videobox.View.Photopicker.NewTouchImageView/IOnTouchImageViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Photopicker.NewTouchImageView+IOnTouchImageViewListenerImplementor, MobileRTC_Droid", TouchImageView_OnTouchImageViewListenerImplementor.class, __md_methods);
	}


	public TouchImageView_OnTouchImageViewListenerImplementor ()
	{
		super ();
		if (getClass () == TouchImageView_OnTouchImageViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Photopicker.NewTouchImageView+IOnTouchImageViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onMove ()
	{
		n_onMove ();
	}

	private native void n_onMove ();

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
