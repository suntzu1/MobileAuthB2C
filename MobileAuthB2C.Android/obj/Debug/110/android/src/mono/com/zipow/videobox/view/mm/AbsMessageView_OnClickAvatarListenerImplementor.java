package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickAvatarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickAvatarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickAvatar:(Lcom/zipow/videobox/view/mm/MMMessageItem;)V:GetOnClickAvatar_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickAvatarListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickAvatarListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickAvatarListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickAvatarListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickAvatarListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickAvatarListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickAvatar (com.zipow.videobox.view.mm.MMMessageItem p0)
	{
		n_onClickAvatar (p0);
	}

	private native void n_onClickAvatar (com.zipow.videobox.view.mm.MMMessageItem p0);

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
