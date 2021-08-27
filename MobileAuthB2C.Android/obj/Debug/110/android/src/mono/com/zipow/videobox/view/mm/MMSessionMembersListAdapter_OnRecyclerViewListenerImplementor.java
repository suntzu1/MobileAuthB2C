package mono.com.zipow.videobox.view.mm;


public class MMSessionMembersListAdapter_OnRecyclerViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMSessionMembersListAdapter.OnRecyclerViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemClick:(Lcom/zipow/videobox/view/mm/MMBuddyItem;)V:GetOnItemClick_Lcom_zipow_videobox_view_mm_MMBuddyItem_Handler:Com.Zipow.Videobox.View.MM.MMSessionMembersListAdapter/IOnRecyclerViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onItemLongClick:(Lcom/zipow/videobox/view/mm/MMBuddyItem;)V:GetOnItemLongClick_Lcom_zipow_videobox_view_mm_MMBuddyItem_Handler:Com.Zipow.Videobox.View.MM.MMSessionMembersListAdapter/IOnRecyclerViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMSessionMembersListAdapter+IOnRecyclerViewListenerImplementor, MobileRTC_Droid", MMSessionMembersListAdapter_OnRecyclerViewListenerImplementor.class, __md_methods);
	}


	public MMSessionMembersListAdapter_OnRecyclerViewListenerImplementor ()
	{
		super ();
		if (getClass () == MMSessionMembersListAdapter_OnRecyclerViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMSessionMembersListAdapter+IOnRecyclerViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onItemClick (com.zipow.videobox.view.mm.MMBuddyItem p0)
	{
		n_onItemClick (p0);
	}

	private native void n_onItemClick (com.zipow.videobox.view.mm.MMBuddyItem p0);


	public void onItemLongClick (com.zipow.videobox.view.mm.MMBuddyItem p0)
	{
		n_onItemLongClick (p0);
	}

	private native void n_onItemLongClick (com.zipow.videobox.view.mm.MMBuddyItem p0);

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
