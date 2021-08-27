package mono.com.zipow.videobox.dialog;


public class ChooseHostDialog_OnItemSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.dialog.ChooseHostDialog.OnItemSelectedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemSelected:(Lcom/zipow/videobox/dialog/ChooseHostDialog$MeetingHostByItem;)V:GetOnItemSelected_Lcom_zipow_videobox_dialog_ChooseHostDialog_MeetingHostByItem_Handler:Com.Zipow.Videobox.Dialog.ChooseHostDialog/IOnItemSelectedListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Dialog.ChooseHostDialog+IOnItemSelectedListenerImplementor, MobileRTC_Droid", ChooseHostDialog_OnItemSelectedListenerImplementor.class, __md_methods);
	}


	public ChooseHostDialog_OnItemSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == ChooseHostDialog_OnItemSelectedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Dialog.ChooseHostDialog+IOnItemSelectedListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onItemSelected (com.zipow.videobox.dialog.ChooseHostDialog.MeetingHostByItem p0)
	{
		n_onItemSelected (p0);
	}

	private native void n_onItemSelected (com.zipow.videobox.dialog.ChooseHostDialog.MeetingHostByItem p0);

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
