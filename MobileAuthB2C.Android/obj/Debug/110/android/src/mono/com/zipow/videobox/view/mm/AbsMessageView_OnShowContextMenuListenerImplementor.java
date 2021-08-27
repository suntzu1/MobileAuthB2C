package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnShowContextMenuListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnShowContextMenuListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onShowContextMenu:(Landroid/view/View;Lcom/zipow/videobox/view/mm/MMMessageItem;)Z:GetOnShowContextMenu_Landroid_view_View_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnShowContextMenuListenerInvoker, MobileRTC_Droid\n" +
			"n_onShowLinkContextMenu:(Landroid/view/View;Lcom/zipow/videobox/view/mm/MMMessageItem;Ljava/lang/String;)Z:GetOnShowLinkContextMenu_Landroid_view_View_Lcom_zipow_videobox_view_mm_MMMessageItem_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnShowContextMenuListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnShowContextMenuListenerImplementor, MobileRTC_Droid", AbsMessageView_OnShowContextMenuListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnShowContextMenuListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnShowContextMenuListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnShowContextMenuListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public boolean onShowContextMenu (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1)
	{
		return n_onShowContextMenu (p0, p1);
	}

	private native boolean n_onShowContextMenu (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1);


	public boolean onShowLinkContextMenu (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1, java.lang.String p2)
	{
		return n_onShowLinkContextMenu (p0, p1, p2);
	}

	private native boolean n_onShowLinkContextMenu (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1, java.lang.String p2);

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
