package mono.com.zipow.videobox.view.mm;


public class MMSlashCommandPopupView_OnSlashCommandClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMSlashCommandPopupView.OnSlashCommandClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSlashCommandClick:(Lcom/zipow/videobox/view/mm/MMSlashCommandPopupView$SlashItem;)V:GetOnSlashCommandClick_Lcom_zipow_videobox_view_mm_MMSlashCommandPopupView_SlashItem_Handler:Com.Zipow.Videobox.View.MM.MMSlashCommandPopupView/IOnSlashCommandClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMSlashCommandPopupView+IOnSlashCommandClickListenerImplementor, MobileRTC_Droid", MMSlashCommandPopupView_OnSlashCommandClickListenerImplementor.class, __md_methods);
	}


	public MMSlashCommandPopupView_OnSlashCommandClickListenerImplementor ()
	{
		super ();
		if (getClass () == MMSlashCommandPopupView_OnSlashCommandClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMSlashCommandPopupView+IOnSlashCommandClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onSlashCommandClick (com.zipow.videobox.view.mm.MMSlashCommandPopupView.SlashItem p0)
	{
		n_onSlashCommandClick (p0);
	}

	private native void n_onSlashCommandClick (com.zipow.videobox.view.mm.MMSlashCommandPopupView.SlashItem p0);

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
