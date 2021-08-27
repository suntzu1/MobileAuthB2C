package mono.com.zipow.videobox.view;


public class ConfToolbar_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.ConfToolbar.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickAttendeeLowerHand:()V:GetOnClickAttendeeLowerHandHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickAttendeeRaiseHand:()V:GetOnClickAttendeeRaiseHandHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickBtnAudio:()V:GetOnClickBtnAudioHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickChats:()V:GetOnClickChatsHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickLeave:()V:GetOnClickLeaveHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickMore:()V:GetOnClickMoreHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickParticipants:()V:GetOnClickParticipantsHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickQA:()V:GetOnClickQAHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onToolbarVisibilityChanged:(Z)V:GetOnToolbarVisibilityChanged_ZHandler:Com.Zipow.Videobox.View.ConfToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.ConfToolbar+IListenerImplementor, MobileRTC_Droid", ConfToolbar_ListenerImplementor.class, __md_methods);
	}


	public ConfToolbar_ListenerImplementor ()
	{
		super ();
		if (getClass () == ConfToolbar_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.ConfToolbar+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickAttendeeLowerHand ()
	{
		n_onClickAttendeeLowerHand ();
	}

	private native void n_onClickAttendeeLowerHand ();


	public void onClickAttendeeRaiseHand ()
	{
		n_onClickAttendeeRaiseHand ();
	}

	private native void n_onClickAttendeeRaiseHand ();


	public void onClickBtnAudio ()
	{
		n_onClickBtnAudio ();
	}

	private native void n_onClickBtnAudio ();


	public void onClickChats ()
	{
		n_onClickChats ();
	}

	private native void n_onClickChats ();


	public void onClickLeave ()
	{
		n_onClickLeave ();
	}

	private native void n_onClickLeave ();


	public void onClickMore ()
	{
		n_onClickMore ();
	}

	private native void n_onClickMore ();


	public void onClickParticipants ()
	{
		n_onClickParticipants ();
	}

	private native void n_onClickParticipants ();


	public void onClickQA ()
	{
		n_onClickQA ();
	}

	private native void n_onClickQA ();


	public void onToolbarVisibilityChanged (boolean p0)
	{
		n_onToolbarVisibilityChanged (p0);
	}

	private native void n_onToolbarVisibilityChanged (boolean p0);

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
