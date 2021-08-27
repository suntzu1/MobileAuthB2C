package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickLinkPreviewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickLinkPreviewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickLinkPreview:(Lcom/zipow/videobox/view/mm/MMMessageItem;Lcom/zipow/videobox/view/mm/LinkPreviewMetaInfo;)V:GetOnClickLinkPreview_Lcom_zipow_videobox_view_mm_MMMessageItem_Lcom_zipow_videobox_view_mm_LinkPreviewMetaInfo_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickLinkPreviewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickLinkPreviewListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickLinkPreviewListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickLinkPreviewListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickLinkPreviewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickLinkPreviewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickLinkPreview (com.zipow.videobox.view.mm.MMMessageItem p0, com.zipow.videobox.view.mm.LinkPreviewMetaInfo p1)
	{
		n_onClickLinkPreview (p0, p1);
	}

	private native void n_onClickLinkPreview (com.zipow.videobox.view.mm.MMMessageItem p0, com.zipow.videobox.view.mm.LinkPreviewMetaInfo p1);

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
