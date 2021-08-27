package mono.com.zipow.nydus;


public class VideoCapturer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.nydus.VideoCapturer.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCapturePaused:()V:GetOnCapturePausedHandler:Com.Zipow.Nydus.VideoCapturer/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onCaptureResumed:()V:GetOnCaptureResumedHandler:Com.Zipow.Nydus.VideoCapturer/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Nydus.VideoCapturer+IListenerImplementor, MobileRTC_Droid", VideoCapturer_ListenerImplementor.class, __md_methods);
	}


	public VideoCapturer_ListenerImplementor ()
	{
		super ();
		if (getClass () == VideoCapturer_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Nydus.VideoCapturer+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCapturePaused ()
	{
		n_onCapturePaused ();
	}

	private native void n_onCapturePaused ();


	public void onCaptureResumed ()
	{
		n_onCaptureResumed ();
	}

	private native void n_onCaptureResumed ();

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
