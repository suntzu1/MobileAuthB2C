package mono.com.zipow.videobox.sdk;


public class SDKScreenShareMgr_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.sdk.SDKScreenShareMgr.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnoStatusChanged:()V:GetOnAnnoStatusChangedHandler:Com.Zipow.Videobox.Sdk.SDKScreenShareMgr/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickStopScreenShare:()V:GetOnClickStopScreenShareHandler:Com.Zipow.Videobox.Sdk.SDKScreenShareMgr/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Sdk.SDKScreenShareMgr+IListenerImplementor, MobileRTC_Droid", SDKScreenShareMgr_ListenerImplementor.class, __md_methods);
	}


	public SDKScreenShareMgr_ListenerImplementor ()
	{
		super ();
		if (getClass () == SDKScreenShareMgr_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Sdk.SDKScreenShareMgr+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onAnnoStatusChanged ()
	{
		n_onAnnoStatusChanged ();
	}

	private native void n_onAnnoStatusChanged ();


	public void onClickStopScreenShare ()
	{
		n_onClickStopScreenShare ();
	}

	private native void n_onClickStopScreenShare ();

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
