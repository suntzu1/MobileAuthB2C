package mono.com.zipow.videobox.view.sip;


public class ZoomSipPhoneSelectListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.sip.ZoomSipPhoneSelectListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelected:(Lcom/zipow/videobox/view/IMAddrBookItem;)V:GetOnSelected_Lcom_zipow_videobox_view_IMAddrBookItem_Handler:Com.Zipow.Videobox.View.Sip.IZoomSipPhoneSelectListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Sip.IZoomSipPhoneSelectListenerImplementor, MobileRTC_Droid", ZoomSipPhoneSelectListenerImplementor.class, __md_methods);
	}


	public ZoomSipPhoneSelectListenerImplementor ()
	{
		super ();
		if (getClass () == ZoomSipPhoneSelectListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Sip.IZoomSipPhoneSelectListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onSelected (com.zipow.videobox.view.IMAddrBookItem p0)
	{
		n_onSelected (p0);
	}

	private native void n_onSelected (com.zipow.videobox.view.IMAddrBookItem p0);

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
