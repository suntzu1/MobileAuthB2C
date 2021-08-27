package mono.com.zipow.videobox.ptapp;


public class ZMPTIMeetingMgr_IPTUIStatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.ptapp.ZMPTIMeetingMgr.IPTUIStatusListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCalendarConfigReady:(J)V:GetOnCalendarConfigReady_JHandler:Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr/IPTUIStatusListenerInvoker, MobileRTC_Droid\n" +
			"n_onCallStatusChanged:(J)V:GetOnCallStatusChanged_JHandler:Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr/IPTUIStatusListenerInvoker, MobileRTC_Droid\n" +
			"n_onRefreshMyNotes:()V:GetOnRefreshMyNotesHandler:Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr/IPTUIStatusListenerInvoker, MobileRTC_Droid\n" +
			"n_onWebLogin:(J)V:GetOnWebLogin_JHandler:Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr/IPTUIStatusListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr+IPTUIStatusListenerImplementor, MobileRTC_Droid", ZMPTIMeetingMgr_IPTUIStatusListenerImplementor.class, __md_methods);
	}


	public ZMPTIMeetingMgr_IPTUIStatusListenerImplementor ()
	{
		super ();
		if (getClass () == ZMPTIMeetingMgr_IPTUIStatusListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr+IPTUIStatusListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCalendarConfigReady (long p0)
	{
		n_onCalendarConfigReady (p0);
	}

	private native void n_onCalendarConfigReady (long p0);


	public void onCallStatusChanged (long p0)
	{
		n_onCallStatusChanged (p0);
	}

	private native void n_onCallStatusChanged (long p0);


	public void onRefreshMyNotes ()
	{
		n_onRefreshMyNotes ();
	}

	private native void n_onRefreshMyNotes ();


	public void onWebLogin (long p0)
	{
		n_onWebLogin (p0);
	}

	private native void n_onWebLogin (long p0);

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
