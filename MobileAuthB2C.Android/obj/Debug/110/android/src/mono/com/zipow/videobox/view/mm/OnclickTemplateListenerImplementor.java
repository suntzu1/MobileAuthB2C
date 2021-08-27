package mono.com.zipow.videobox.view.mm;


public class OnclickTemplateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.OnclickTemplateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEditTemplate:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V:GetOnEditTemplate_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.IOnclickTemplateListenerInvoker, MobileRTC_Droid\n" +
			"n_onTemplateSelectClick:(Ljava/lang/String;Ljava/lang/String;)V:GetOnTemplateSelectClick_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.IOnclickTemplateListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.IOnclickTemplateListenerImplementor, MobileRTC_Droid", OnclickTemplateListenerImplementor.class, __md_methods);
	}


	public OnclickTemplateListenerImplementor ()
	{
		super ();
		if (getClass () == OnclickTemplateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.IOnclickTemplateListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onEditTemplate (java.lang.String p0, java.lang.String p1, java.lang.String p2)
	{
		n_onEditTemplate (p0, p1, p2);
	}

	private native void n_onEditTemplate (java.lang.String p0, java.lang.String p1, java.lang.String p2);


	public void onTemplateSelectClick (java.lang.String p0, java.lang.String p1)
	{
		n_onTemplateSelectClick (p0, p1);
	}

	private native void n_onTemplateSelectClick (java.lang.String p0, java.lang.String p1);

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
