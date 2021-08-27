package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickStatusImageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickStatusImageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickStatusImage:(Lcom/zipow/videobox/view/mm/MMMessageItem;)V:GetOnClickStatusImage_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickStatusImageListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickStatusImageListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickStatusImageListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickStatusImageListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickStatusImageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickStatusImageListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickStatusImage (com.zipow.videobox.view.mm.MMMessageItem p0)
	{
		n_onClickStatusImage (p0);
	}

	private native void n_onClickStatusImage (com.zipow.videobox.view.mm.MMMessageItem p0);

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
