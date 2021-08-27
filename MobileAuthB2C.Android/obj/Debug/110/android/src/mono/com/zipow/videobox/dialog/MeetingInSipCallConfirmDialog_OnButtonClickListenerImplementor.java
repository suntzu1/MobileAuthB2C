package mono.com.zipow.videobox.dialog;


public class MeetingInSipCallConfirmDialog_OnButtonClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.dialog.MeetingInSipCallConfirmDialog.OnButtonClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNegativeClick:()V:GetOnNegativeClickHandler:Com.Zipow.Videobox.Dialog.MeetingInSipCallConfirmDialog/IOnButtonClickListenerInvoker, MobileRTC_Droid\n" +
			"n_onPositiveClick:()V:GetOnPositiveClickHandler:Com.Zipow.Videobox.Dialog.MeetingInSipCallConfirmDialog/IOnButtonClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Dialog.MeetingInSipCallConfirmDialog+IOnButtonClickListenerImplementor, MobileRTC_Droid", MeetingInSipCallConfirmDialog_OnButtonClickListenerImplementor.class, __md_methods);
	}


	public MeetingInSipCallConfirmDialog_OnButtonClickListenerImplementor ()
	{
		super ();
		if (getClass () == MeetingInSipCallConfirmDialog_OnButtonClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Dialog.MeetingInSipCallConfirmDialog+IOnButtonClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onNegativeClick ()
	{
		n_onNegativeClick ();
	}

	private native void n_onNegativeClick ();


	public void onPositiveClick ()
	{
		n_onPositiveClick ();
	}

	private native void n_onPositiveClick ();

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
