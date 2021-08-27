package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickTemplateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickTemplateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickEditTemplate:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V:GetOnClickEditTemplate_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickTemplateListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickSelectTemplate:(Ljava/lang/String;Ljava/lang/String;)V:GetOnClickSelectTemplate_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickTemplateListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickTemplateListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickTemplateListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickTemplateListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickTemplateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickTemplateListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickEditTemplate (java.lang.String p0, java.lang.String p1, java.lang.String p2)
	{
		n_onClickEditTemplate (p0, p1, p2);
	}

	private native void n_onClickEditTemplate (java.lang.String p0, java.lang.String p1, java.lang.String p2);


	public void onClickSelectTemplate (java.lang.String p0, java.lang.String p1)
	{
		n_onClickSelectTemplate (p0, p1);
	}

	private native void n_onClickSelectTemplate (java.lang.String p0, java.lang.String p1);

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
