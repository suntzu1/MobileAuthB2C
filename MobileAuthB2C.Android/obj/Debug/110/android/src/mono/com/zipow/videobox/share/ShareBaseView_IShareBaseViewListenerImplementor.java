package mono.com.zipow.videobox.share;


public class ShareBaseView_IShareBaseViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.share.ShareBaseView.IShareBaseViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCloseView:(Lcom/zipow/videobox/share/ShareBaseView;)V:GetOnCloseView_Lcom_zipow_videobox_share_ShareBaseView_Handler:Com.Zipow.Videobox.Share.ShareBaseView/IShareBaseViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onRepaint:(Lcom/zipow/videobox/share/ShareBaseView;)V:GetOnRepaint_Lcom_zipow_videobox_share_ShareBaseView_Handler:Com.Zipow.Videobox.Share.ShareBaseView/IShareBaseViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onSavePhoto:()V:GetOnSavePhotoHandler:Com.Zipow.Videobox.Share.ShareBaseView/IShareBaseViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Share.ShareBaseView+IShareBaseViewListenerImplementor, MobileRTC_Droid", ShareBaseView_IShareBaseViewListenerImplementor.class, __md_methods);
	}


	public ShareBaseView_IShareBaseViewListenerImplementor ()
	{
		super ();
		if (getClass () == ShareBaseView_IShareBaseViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Share.ShareBaseView+IShareBaseViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCloseView (com.zipow.videobox.share.ShareBaseView p0)
	{
		n_onCloseView (p0);
	}

	private native void n_onCloseView (com.zipow.videobox.share.ShareBaseView p0);


	public void onRepaint (com.zipow.videobox.share.ShareBaseView p0)
	{
		n_onRepaint (p0);
	}

	private native void n_onRepaint (com.zipow.videobox.share.ShareBaseView p0);


	public void onSavePhoto ()
	{
		n_onSavePhoto ();
	}

	private native void n_onSavePhoto ();

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
