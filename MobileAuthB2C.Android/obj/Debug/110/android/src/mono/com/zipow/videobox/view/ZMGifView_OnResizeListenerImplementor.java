package mono.com.zipow.videobox.view;


public class ZMGifView_OnResizeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.ZMGifView.OnResizeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResize:(II)V:GetOnResize_IIHandler:Com.Zipow.Videobox.View.ZMGifView/IOnResizeListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.ZMGifView+IOnResizeListenerImplementor, MobileRTC_Droid", ZMGifView_OnResizeListenerImplementor.class, __md_methods);
	}


	public ZMGifView_OnResizeListenerImplementor ()
	{
		super ();
		if (getClass () == ZMGifView_OnResizeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.ZMGifView+IOnResizeListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResize (int p0, int p1)
	{
		n_onResize (p0, p1);
	}

	private native void n_onResize (int p0, int p1);

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
