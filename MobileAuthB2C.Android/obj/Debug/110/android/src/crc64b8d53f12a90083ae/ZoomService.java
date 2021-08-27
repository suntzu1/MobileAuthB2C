package crc64b8d53f12a90083ae;


public class ZoomService
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.sdk.ZoomSDKInitializeListener,
		us.zoom.androidlib.util.IListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onZoomAuthIdentityExpired:()V:GetOnZoomAuthIdentityExpiredHandler:US.Zoom.Sdk.IZoomSDKInitializeListenerInvoker, MobileRTC_Droid\n" +
			"n_onZoomSDKInitializeResult:(II)V:GetOnZoomSDKInitializeResult_IIHandler:US.Zoom.Sdk.IZoomSDKInitializeListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Gia.Droid.Services.ZoomService, MobileAuthB2C.Android", ZoomService.class, __md_methods);
	}


	public ZoomService ()
	{
		super ();
		if (getClass () == ZoomService.class)
			mono.android.TypeManager.Activate ("Gia.Droid.Services.ZoomService, MobileAuthB2C.Android", "", this, new java.lang.Object[] {  });
	}


	public void onZoomAuthIdentityExpired ()
	{
		n_onZoomAuthIdentityExpired ();
	}

	private native void n_onZoomAuthIdentityExpired ();


	public void onZoomSDKInitializeResult (int p0, int p1)
	{
		n_onZoomSDKInitializeResult (p0, p1);
	}

	private native void n_onZoomSDKInitializeResult (int p0, int p1);

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
