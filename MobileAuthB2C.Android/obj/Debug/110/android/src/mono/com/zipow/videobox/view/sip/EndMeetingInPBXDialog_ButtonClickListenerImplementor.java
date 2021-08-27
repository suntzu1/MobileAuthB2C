package mono.com.zipow.videobox.view.sip;


public class EndMeetingInPBXDialog_ButtonClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.sip.EndMeetingInPBXDialog.ButtonClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNegativeClick:()V:GetOnNegativeClickHandler:Com.Zipow.Videobox.View.Sip.EndMeetingInPBXDialog/IButtonClickListenerInvoker, MobileRTC_Droid\n" +
			"n_onNeutralClick:()V:GetOnNeutralClickHandler:Com.Zipow.Videobox.View.Sip.EndMeetingInPBXDialog/IButtonClickListenerInvoker, MobileRTC_Droid\n" +
			"n_onPositiveClick:()V:GetOnPositiveClickHandler:Com.Zipow.Videobox.View.Sip.EndMeetingInPBXDialog/IButtonClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Sip.EndMeetingInPBXDialog+IButtonClickListenerImplementor, MobileRTC_Droid", EndMeetingInPBXDialog_ButtonClickListenerImplementor.class, __md_methods);
	}


	public EndMeetingInPBXDialog_ButtonClickListenerImplementor ()
	{
		super ();
		if (getClass () == EndMeetingInPBXDialog_ButtonClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Sip.EndMeetingInPBXDialog+IButtonClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onNegativeClick ()
	{
		n_onNegativeClick ();
	}

	private native void n_onNegativeClick ();


	public void onNeutralClick ()
	{
		n_onNeutralClick ();
	}

	private native void n_onNeutralClick ();


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
