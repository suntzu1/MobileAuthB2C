package mono.com.zipow.videobox.fragment;


public class MMChatInputFragment_OnChatInputListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.fragment.MMChatInputFragment.OnChatInputListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCommentSent:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V:GetOnCommentSent_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.Fragment.MMChatInputFragment/IOnChatInputListenerInvoker, MobileRTC_Droid\n" +
			"n_onMessageSent:(Ljava/lang/String;Ljava/lang/String;)V:GetOnMessageSent_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.Fragment.MMChatInputFragment/IOnChatInputListenerInvoker, MobileRTC_Droid\n" +
			"n_onShowInvitationsSent:(I)V:GetOnShowInvitationsSent_IHandler:Com.Zipow.Videobox.Fragment.MMChatInputFragment/IOnChatInputListenerInvoker, MobileRTC_Droid\n" +
			"n_onViewInitReady:()V:GetOnViewInitReadyHandler:Com.Zipow.Videobox.Fragment.MMChatInputFragment/IOnChatInputListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Fragment.MMChatInputFragment+IOnChatInputListenerImplementor, MobileRTC_Droid", MMChatInputFragment_OnChatInputListenerImplementor.class, __md_methods);
	}


	public MMChatInputFragment_OnChatInputListenerImplementor ()
	{
		super ();
		if (getClass () == MMChatInputFragment_OnChatInputListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Fragment.MMChatInputFragment+IOnChatInputListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCommentSent (java.lang.String p0, java.lang.String p1, java.lang.String p2)
	{
		n_onCommentSent (p0, p1, p2);
	}

	private native void n_onCommentSent (java.lang.String p0, java.lang.String p1, java.lang.String p2);


	public void onMessageSent (java.lang.String p0, java.lang.String p1)
	{
		n_onMessageSent (p0, p1);
	}

	private native void n_onMessageSent (java.lang.String p0, java.lang.String p1);


	public void onShowInvitationsSent (int p0)
	{
		n_onShowInvitationsSent (p0);
	}

	private native void n_onShowInvitationsSent (int p0);


	public void onViewInitReady ()
	{
		n_onViewInitReady ();
	}

	private native void n_onViewInitReady ();

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
