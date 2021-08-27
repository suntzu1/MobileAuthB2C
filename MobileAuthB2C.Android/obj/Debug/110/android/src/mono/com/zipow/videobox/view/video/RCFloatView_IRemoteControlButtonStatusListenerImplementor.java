package mono.com.zipow.videobox.view.video;


public class RCFloatView_IRemoteControlButtonStatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.video.RCFloatView.IRemoteControlButtonStatusListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEnabledRC:(Z)V:GetOnEnabledRC_ZHandler:Com.Zipow.Videobox.View.Video.RCFloatView/IRemoteControlButtonStatusListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Video.RCFloatView+IRemoteControlButtonStatusListenerImplementor, MobileRTC_Droid", RCFloatView_IRemoteControlButtonStatusListenerImplementor.class, __md_methods);
	}


	public RCFloatView_IRemoteControlButtonStatusListenerImplementor ()
	{
		super ();
		if (getClass () == RCFloatView_IRemoteControlButtonStatusListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Video.RCFloatView+IRemoteControlButtonStatusListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onEnabledRC (boolean p0)
	{
		n_onEnabledRC (p0);
	}

	private native void n_onEnabledRC (boolean p0);

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
