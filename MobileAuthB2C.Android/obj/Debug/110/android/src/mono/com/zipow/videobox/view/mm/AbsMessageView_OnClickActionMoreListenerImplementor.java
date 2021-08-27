package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickActionMoreListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickActionMoreListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickActionMore:(Ljava/lang/String;Ljava/util/List;)V:GetOnClickActionMore_Ljava_lang_String_Ljava_util_List_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickActionMoreListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickActionMoreListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickActionMoreListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickActionMoreListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickActionMoreListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickActionMoreListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickActionMore (java.lang.String p0, java.util.List p1)
	{
		n_onClickActionMore (p0, p1);
	}

	private native void n_onClickActionMore (java.lang.String p0, java.util.List p1);

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
