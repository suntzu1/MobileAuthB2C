package mono.com.zipow.videobox.view;


public class JoinConfView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.JoinConfView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBack:()V:GetOnBackHandler:Com.Zipow.Videobox.View.JoinConfView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onJoinByNumber:(JLjava/lang/String;Ljava/lang/String;ZZ)V:GetOnJoinByNumber_JLjava_lang_String_Ljava_lang_String_ZZHandler:Com.Zipow.Videobox.View.JoinConfView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onJoinByUrl:(Ljava/lang/String;Ljava/lang/String;)V:GetOnJoinByUrl_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.JoinConfView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.JoinConfView+IListenerImplementor, MobileRTC_Droid", JoinConfView_ListenerImplementor.class, __md_methods);
	}


	public JoinConfView_ListenerImplementor ()
	{
		super ();
		if (getClass () == JoinConfView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.JoinConfView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onBack ()
	{
		n_onBack ();
	}

	private native void n_onBack ();


	public void onJoinByNumber (long p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4)
	{
		n_onJoinByNumber (p0, p1, p2, p3, p4);
	}

	private native void n_onJoinByNumber (long p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4);


	public void onJoinByUrl (java.lang.String p0, java.lang.String p1)
	{
		n_onJoinByUrl (p0, p1);
	}

	private native void n_onJoinByUrl (java.lang.String p0, java.lang.String p1);

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
