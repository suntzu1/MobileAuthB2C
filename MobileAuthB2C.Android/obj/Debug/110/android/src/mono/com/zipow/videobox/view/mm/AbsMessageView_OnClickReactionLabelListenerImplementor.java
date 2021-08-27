package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickReactionLabelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickReactionLabelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickAddReactionLabel:(Landroid/view/View;Lcom/zipow/videobox/view/mm/MMMessageItem;)V:GetOnClickAddReactionLabel_Landroid_view_View_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickReactionLabelListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickReactionLabel:(Landroid/view/View;Lcom/zipow/videobox/view/mm/MMMessageItem;Lcom/zipow/videobox/view/mm/MMCommentsEmojiCountItem;Z)V:GetOnClickReactionLabel_Landroid_view_View_Lcom_zipow_videobox_view_mm_MMMessageItem_Lcom_zipow_videobox_view_mm_MMCommentsEmojiCountItem_ZHandler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickReactionLabelListenerInvoker, MobileRTC_Droid\n" +
			"n_onLongClickAddReactionLabel:(Landroid/view/View;Lcom/zipow/videobox/view/mm/MMMessageItem;)Z:GetOnLongClickAddReactionLabel_Landroid_view_View_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickReactionLabelListenerInvoker, MobileRTC_Droid\n" +
			"n_onLongClickReactionLabel:(Landroid/view/View;Lcom/zipow/videobox/view/mm/MMMessageItem;Lcom/zipow/videobox/view/mm/MMCommentsEmojiCountItem;)Z:GetOnLongClickReactionLabel_Landroid_view_View_Lcom_zipow_videobox_view_mm_MMMessageItem_Lcom_zipow_videobox_view_mm_MMCommentsEmojiCountItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickReactionLabelListenerInvoker, MobileRTC_Droid\n" +
			"n_onMoreReply:(Landroid/view/View;Lcom/zipow/videobox/view/mm/MMMessageItem;)V:GetOnMoreReply_Landroid_view_View_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickReactionLabelListenerInvoker, MobileRTC_Droid\n" +
			"n_onReachReactionLimit:()V:GetOnReachReactionLimitHandler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickReactionLabelListenerInvoker, MobileRTC_Droid\n" +
			"n_onShowFloatingText:(Landroid/view/View;IZ)V:GetOnShowFloatingText_Landroid_view_View_IZHandler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickReactionLabelListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickReactionLabelListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickReactionLabelListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickReactionLabelListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickReactionLabelListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickReactionLabelListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickAddReactionLabel (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1)
	{
		n_onClickAddReactionLabel (p0, p1);
	}

	private native void n_onClickAddReactionLabel (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1);


	public void onClickReactionLabel (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1, com.zipow.videobox.view.mm.MMCommentsEmojiCountItem p2, boolean p3)
	{
		n_onClickReactionLabel (p0, p1, p2, p3);
	}

	private native void n_onClickReactionLabel (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1, com.zipow.videobox.view.mm.MMCommentsEmojiCountItem p2, boolean p3);


	public boolean onLongClickAddReactionLabel (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1)
	{
		return n_onLongClickAddReactionLabel (p0, p1);
	}

	private native boolean n_onLongClickAddReactionLabel (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1);


	public boolean onLongClickReactionLabel (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1, com.zipow.videobox.view.mm.MMCommentsEmojiCountItem p2)
	{
		return n_onLongClickReactionLabel (p0, p1, p2);
	}

	private native boolean n_onLongClickReactionLabel (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1, com.zipow.videobox.view.mm.MMCommentsEmojiCountItem p2);


	public void onMoreReply (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1)
	{
		n_onMoreReply (p0, p1);
	}

	private native void n_onMoreReply (android.view.View p0, com.zipow.videobox.view.mm.MMMessageItem p1);


	public void onReachReactionLimit ()
	{
		n_onReachReactionLimit ();
	}

	private native void n_onReachReactionLimit ();


	public void onShowFloatingText (android.view.View p0, int p1, boolean p2)
	{
		n_onShowFloatingText (p0, p1, p2);
	}

	private native void n_onShowFloatingText (android.view.View p0, int p1, boolean p2);

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
