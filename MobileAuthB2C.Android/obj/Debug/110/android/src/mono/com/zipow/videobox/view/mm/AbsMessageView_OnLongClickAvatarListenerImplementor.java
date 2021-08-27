package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnLongClickAvatarListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnLongClickAvatarListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLongClickAvatar:(Lcom/zipow/videobox/view/mm/MMMessageItem;)Z:GetOnLongClickAvatar_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnLongClickAvatarListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnLongClickAvatarListenerImplementor, MobileRTC_Droid", AbsMessageView_OnLongClickAvatarListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnLongClickAvatarListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnLongClickAvatarListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnLongClickAvatarListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public boolean onLongClickAvatar (com.zipow.videobox.view.mm.MMMessageItem p0)
	{
		return n_onLongClickAvatar (p0);
	}

	private native boolean n_onLongClickAvatar (com.zipow.videobox.view.mm.MMMessageItem p0);

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
