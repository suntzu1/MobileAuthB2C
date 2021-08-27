package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickMessageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickMessageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickMessage:(Lcom/zipow/videobox/view/mm/MMMessageItem;)V:GetOnClickMessage_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickMessageListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickMessageListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickMessageListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickMessageListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickMessageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickMessageListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickMessage (com.zipow.videobox.view.mm.MMMessageItem p0)
	{
		n_onClickMessage (p0);
	}

	private native void n_onClickMessage (com.zipow.videobox.view.mm.MMMessageItem p0);

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
