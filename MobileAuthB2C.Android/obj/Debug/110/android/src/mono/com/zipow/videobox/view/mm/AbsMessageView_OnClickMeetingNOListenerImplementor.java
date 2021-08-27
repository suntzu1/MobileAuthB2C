package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickMeetingNOListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickMeetingNOListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickMeetingNO:(Ljava/lang/String;)V:GetOnClickMeetingNO_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickMeetingNOListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickMeetingNOListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickMeetingNOListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickMeetingNOListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickMeetingNOListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickMeetingNOListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickMeetingNO (java.lang.String p0)
	{
		n_onClickMeetingNO (p0);
	}

	private native void n_onClickMeetingNO (java.lang.String p0);

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
