package mono.com.zipow.videobox.view;


public class JoinConfView_JoinConfRecentMeetingsDialog_OnMeetingItemSelectListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.JoinConfView.JoinConfRecentMeetingsDialog.OnMeetingItemSelectListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClearMeetingHistory:()V:GetOnClearMeetingHistoryHandler:Com.Zipow.Videobox.View.JoinConfView/JoinConfRecentMeetingsDialog/IOnMeetingItemSelectListenerInvoker, MobileRTC_Droid\n" +
			"n_onMeetingItemSelect:(Lcom/zipow/videobox/CmmSavedMeeting;)V:GetOnMeetingItemSelect_Lcom_zipow_videobox_CmmSavedMeeting_Handler:Com.Zipow.Videobox.View.JoinConfView/JoinConfRecentMeetingsDialog/IOnMeetingItemSelectListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.JoinConfView+JoinConfRecentMeetingsDialog+IOnMeetingItemSelectListenerImplementor, MobileRTC_Droid", JoinConfView_JoinConfRecentMeetingsDialog_OnMeetingItemSelectListenerImplementor.class, __md_methods);
	}


	public JoinConfView_JoinConfRecentMeetingsDialog_OnMeetingItemSelectListenerImplementor ()
	{
		super ();
		if (getClass () == JoinConfView_JoinConfRecentMeetingsDialog_OnMeetingItemSelectListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.JoinConfView+JoinConfRecentMeetingsDialog+IOnMeetingItemSelectListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClearMeetingHistory ()
	{
		n_onClearMeetingHistory ();
	}

	private native void n_onClearMeetingHistory ();


	public void onMeetingItemSelect (com.zipow.videobox.CmmSavedMeeting p0)
	{
		n_onMeetingItemSelect (p0);
	}

	private native void n_onMeetingItemSelect (com.zipow.videobox.CmmSavedMeeting p0);

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
