package mono.com.zipow.videobox.view;


public class MeetingReactionView_OnSelectListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.MeetingReactionView.OnSelectListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelectMeetingReaction:(II)V:GetOnSelectMeetingReaction_IIHandler:Com.Zipow.Videobox.View.MeetingReactionView/IOnSelectListenerInvoker, MobileRTC_Droid\n" +
			"n_onSelectMeetingReaction:(Ljava/lang/String;)V:GetOnSelectMeetingReaction2_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MeetingReactionView/IOnSelectListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MeetingReactionView+IOnSelectListenerImplementor, MobileRTC_Droid", MeetingReactionView_OnSelectListenerImplementor.class, __md_methods);
	}


	public MeetingReactionView_OnSelectListenerImplementor ()
	{
		super ();
		if (getClass () == MeetingReactionView_OnSelectListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MeetingReactionView+IOnSelectListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onSelectMeetingReaction (int p0, int p1)
	{
		n_onSelectMeetingReaction (p0, p1);
	}

	private native void n_onSelectMeetingReaction (int p0, int p1);


	public void onSelectMeetingReaction (java.lang.String p0)
	{
		n_onSelectMeetingReaction (p0);
	}

	private native void n_onSelectMeetingReaction (java.lang.String p0);

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
