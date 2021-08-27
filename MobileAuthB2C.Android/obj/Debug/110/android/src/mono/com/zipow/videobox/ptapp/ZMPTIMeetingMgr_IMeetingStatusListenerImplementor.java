package mono.com.zipow.videobox.ptapp;


public class ZMPTIMeetingMgr_IMeetingStatusListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.ptapp.ZMPTIMeetingMgr.IMeetingStatusListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeetingListLoadDone:(Lcom/zipow/videobox/ptapp/ZMPTIMeetingMgr$SourceMeetingList;)V:GetOnMeetingListLoadDone_Lcom_zipow_videobox_ptapp_ZMPTIMeetingMgr_SourceMeetingList_Handler:Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr/IMeetingStatusListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr+IMeetingStatusListenerImplementor, MobileRTC_Droid", ZMPTIMeetingMgr_IMeetingStatusListenerImplementor.class, __md_methods);
	}


	public ZMPTIMeetingMgr_IMeetingStatusListenerImplementor ()
	{
		super ();
		if (getClass () == ZMPTIMeetingMgr_IMeetingStatusListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Ptapp.ZMPTIMeetingMgr+IMeetingStatusListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onMeetingListLoadDone (com.zipow.videobox.ptapp.ZMPTIMeetingMgr.SourceMeetingList p0)
	{
		n_onMeetingListLoadDone (p0);
	}

	private native void n_onMeetingListLoadDone (com.zipow.videobox.ptapp.ZMPTIMeetingMgr.SourceMeetingList p0);

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
