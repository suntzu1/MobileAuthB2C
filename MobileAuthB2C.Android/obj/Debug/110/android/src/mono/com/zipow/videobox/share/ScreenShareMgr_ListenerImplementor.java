package mono.com.zipow.videobox.share;


public class ScreenShareMgr_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.share.ScreenShareMgr.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnoStatusChanged:()V:GetOnAnnoStatusChangedHandler:Com.Zipow.Videobox.Share.ScreenShareMgr/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickStopScreenShare:()V:GetOnClickStopScreenShareHandler:Com.Zipow.Videobox.Share.ScreenShareMgr/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Share.ScreenShareMgr+IListenerImplementor, MobileRTC_Droid", ScreenShareMgr_ListenerImplementor.class, __md_methods);
	}


	public ScreenShareMgr_ListenerImplementor ()
	{
		super ();
		if (getClass () == ScreenShareMgr_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Share.ScreenShareMgr+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
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
