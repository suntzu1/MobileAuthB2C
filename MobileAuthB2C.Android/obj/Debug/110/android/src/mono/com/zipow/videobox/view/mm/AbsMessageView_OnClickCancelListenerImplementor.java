package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickCancelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickCancelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickCancel:(Lcom/zipow/videobox/view/mm/MMMessageItem;)V:GetOnClickCancel_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickCancelListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickCancelListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickCancelListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickCancelListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickCancelListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickCancelListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickCancel (com.zipow.videobox.view.mm.MMMessageItem p0)
	{
		n_onClickCancel (p0);
	}

	private native void n_onClickCancel (com.zipow.videobox.view.mm.MMMessageItem p0);

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
