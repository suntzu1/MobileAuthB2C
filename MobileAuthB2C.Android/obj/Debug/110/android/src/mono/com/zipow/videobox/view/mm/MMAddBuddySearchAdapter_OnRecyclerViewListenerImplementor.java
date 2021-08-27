package mono.com.zipow.videobox.view.mm;


public class MMAddBuddySearchAdapter_OnRecyclerViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMAddBuddySearchAdapter.OnRecyclerViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onActionButtonClick:(Landroid/view/View;II)V:GetOnActionButtonClick_Landroid_view_View_IIHandler:Com.Zipow.Videobox.View.MM.MMAddBuddySearchAdapter/IOnRecyclerViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onInviteButtonClick:(Landroid/view/View;Ljava/lang/String;)V:GetOnInviteButtonClick_Landroid_view_View_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.MMAddBuddySearchAdapter/IOnRecyclerViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onItemClick:(Landroid/view/View;I)V:GetOnItemClick_Landroid_view_View_IHandler:Com.Zipow.Videobox.View.MM.MMAddBuddySearchAdapter/IOnRecyclerViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMAddBuddySearchAdapter+IOnRecyclerViewListenerImplementor, MobileRTC_Droid", MMAddBuddySearchAdapter_OnRecyclerViewListenerImplementor.class, __md_methods);
	}


	public MMAddBuddySearchAdapter_OnRecyclerViewListenerImplementor ()
	{
		super ();
		if (getClass () == MMAddBuddySearchAdapter_OnRecyclerViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMAddBuddySearchAdapter+IOnRecyclerViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onActionButtonClick (android.view.View p0, int p1, int p2)
	{
		n_onActionButtonClick (p0, p1, p2);
	}

	private native void n_onActionButtonClick (android.view.View p0, int p1, int p2);


	public void onInviteButtonClick (android.view.View p0, java.lang.String p1)
	{
		n_onInviteButtonClick (p0, p1);
	}

	private native void n_onInviteButtonClick (android.view.View p0, java.lang.String p1);


	public void onItemClick (android.view.View p0, int p1)
	{
		n_onItemClick (p0, p1);
	}

	private native void n_onItemClick (android.view.View p0, int p1);

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
