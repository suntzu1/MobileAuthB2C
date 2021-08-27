package mono.com.zipow.videobox.sdk;


public class SDKVideoView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.sdk.SDKVideoView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_beforeGLContextDestroyed:()V:GetBeforeGLContextDestroyedHandler:Com.Zipow.Videobox.Sdk.SDKVideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_surfaceCreated:()V:GetSurfaceCreatedHandler:Com.Zipow.Videobox.Sdk.SDKVideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_surfaceDestroyed:()V:GetSurfaceDestroyedHandler:Com.Zipow.Videobox.Sdk.SDKVideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Sdk.SDKVideoView+IListenerImplementor, MobileRTC_Droid", SDKVideoView_ListenerImplementor.class, __md_methods);
	}


	public SDKVideoView_ListenerImplementor ()
	{
		super ();
		if (getClass () == SDKVideoView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Sdk.SDKVideoView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void beforeGLContextDestroyed ()
	{
		n_beforeGLContextDestroyed ();
	}

	private native void n_beforeGLContextDestroyed ();


	public void surfaceCreated ()
	{
		n_surfaceCreated ();
	}

	private native void n_surfaceCreated ();


	public void surfaceDestroyed ()
	{
		n_surfaceDestroyed ();
	}

	private native void n_surfaceDestroyed ();

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
