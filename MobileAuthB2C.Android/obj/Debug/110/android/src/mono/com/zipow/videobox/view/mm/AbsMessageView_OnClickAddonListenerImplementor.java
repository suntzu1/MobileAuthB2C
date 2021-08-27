package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickAddonListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickAddonListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickAddon:(Lcom/zipow/videobox/view/mm/MMAddonMessage$NodeMsgHref;)V:GetOnClickAddon_Lcom_zipow_videobox_view_mm_MMAddonMessage_NodeMsgHref_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickAddonListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickAddonListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickAddonListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickAddonListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickAddonListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickAddonListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickAddon (com.zipow.videobox.view.mm.MMAddonMessage.NodeMsgHref p0)
	{
		n_onClickAddon (p0);
	}

	private native void n_onClickAddon (com.zipow.videobox.view.mm.MMAddonMessage.NodeMsgHref p0);

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
