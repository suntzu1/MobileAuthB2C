package mono.com.zipow.videobox.view;


public class CallRoomView_CallRoomRecentMeetingsDialog_OnMeetingItemSelectListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.CallRoomView.CallRoomRecentMeetingsDialog.OnMeetingItemSelectListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMeetingItemSelect:(Lcom/zipow/videobox/ptapp/RoomDevice;)V:GetOnMeetingItemSelect_Lcom_zipow_videobox_ptapp_RoomDevice_Handler:Com.Zipow.Videobox.View.CallRoomView/CallRoomRecentMeetingsDialog/IOnMeetingItemSelectListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.CallRoomView+CallRoomRecentMeetingsDialog+IOnMeetingItemSelectListenerImplementor, MobileRTC_Droid", CallRoomView_CallRoomRecentMeetingsDialog_OnMeetingItemSelectListenerImplementor.class, __md_methods);
	}


	public CallRoomView_CallRoomRecentMeetingsDialog_OnMeetingItemSelectListenerImplementor ()
	{
		super ();
		if (getClass () == CallRoomView_CallRoomRecentMeetingsDialog_OnMeetingItemSelectListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.CallRoomView+CallRoomRecentMeetingsDialog+IOnMeetingItemSelectListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onMeetingItemSelect (com.zipow.videobox.ptapp.RoomDevice p0)
	{
		n_onMeetingItemSelect (p0);
	}

	private native void n_onMeetingItemSelect (com.zipow.videobox.ptapp.RoomDevice p0);

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
