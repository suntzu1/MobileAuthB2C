package mono.com.zipow.videobox.util;


public class DesktopModeReceiver_DesktopModeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.util.DesktopModeReceiver.DesktopModeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDesktopModeChange:(Z)V:GetOnDesktopModeChange_ZHandler:Com.Zipow.Videobox.Util.DesktopModeReceiver/IDesktopModeListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Util.DesktopModeReceiver+IDesktopModeListenerImplementor, MobileRTC_Droid", DesktopModeReceiver_DesktopModeListenerImplementor.class, __md_methods);
	}


	public DesktopModeReceiver_DesktopModeListenerImplementor ()
	{
		super ();
		if (getClass () == DesktopModeReceiver_DesktopModeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Util.DesktopModeReceiver+IDesktopModeListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onDesktopModeChange (boolean p0)
	{
		n_onDesktopModeChange (p0);
	}

	private native void n_onDesktopModeChange (boolean p0);

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
