package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickActionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickAction:(Ljava/lang/String;Ljava/lang/String;)V:GetOnClickAction_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickActionListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickActionListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickActionListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickActionListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickActionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickActionListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickAction (java.lang.String p0, java.lang.String p1)
	{
		n_onClickAction (p0, p1);
	}

	private native void n_onClickAction (java.lang.String p0, java.lang.String p1);

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
