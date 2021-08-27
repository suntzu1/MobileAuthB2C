package mono.com.zipow.videobox.util;


public class ZMGlideRequestListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.util.ZMGlideRequestListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(Ljava/lang/String;Lcom/zipow/videobox/util/GifException;)V:GetOnError_Ljava_lang_String_Lcom_zipow_videobox_util_GifException_Handler:Com.Zipow.Videobox.Util.IZMGlideRequestListenerInvoker, MobileRTC_Droid\n" +
			"n_onSuccess:(Ljava/lang/String;)V:GetOnSuccess_Ljava_lang_String_Handler:Com.Zipow.Videobox.Util.IZMGlideRequestListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Util.IZMGlideRequestListenerImplementor, MobileRTC_Droid", ZMGlideRequestListenerImplementor.class, __md_methods);
	}


	public ZMGlideRequestListenerImplementor ()
	{
		super ();
		if (getClass () == ZMGlideRequestListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Util.IZMGlideRequestListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onError (java.lang.String p0, com.zipow.videobox.util.GifException p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (java.lang.String p0, com.zipow.videobox.util.GifException p1);


	public void onSuccess (java.lang.String p0)
	{
		n_onSuccess (p0);
	}

	private native void n_onSuccess (java.lang.String p0);

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
