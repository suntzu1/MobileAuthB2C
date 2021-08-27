package mono.com.zipow.videobox.view.mm;


public class MMMessageTemplateItemView_OnClickTemplateActionMoreListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMMessageTemplateItemView.OnClickTemplateActionMoreListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickTemplateActionMore:(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V:GetOnClickTemplateActionMore_Landroid_view_View_Ljava_lang_String_Ljava_lang_String_Ljava_util_List_Handler:Com.Zipow.Videobox.View.MM.MMMessageTemplateItemView/IOnClickTemplateActionMoreListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMMessageTemplateItemView+IOnClickTemplateActionMoreListenerImplementor, MobileRTC_Droid", MMMessageTemplateItemView_OnClickTemplateActionMoreListenerImplementor.class, __md_methods);
	}


	public MMMessageTemplateItemView_OnClickTemplateActionMoreListenerImplementor ()
	{
		super ();
		if (getClass () == MMMessageTemplateItemView_OnClickTemplateActionMoreListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMMessageTemplateItemView+IOnClickTemplateActionMoreListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickTemplateActionMore (android.view.View p0, java.lang.String p1, java.lang.String p2, java.util.List p3)
	{
		n_onClickTemplateActionMore (p0, p1, p2, p3);
	}

	private native void n_onClickTemplateActionMore (android.view.View p0, java.lang.String p1, java.lang.String p2, java.util.List p3);

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
