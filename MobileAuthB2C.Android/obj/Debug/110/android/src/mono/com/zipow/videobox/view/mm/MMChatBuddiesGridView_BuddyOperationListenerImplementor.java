package mono.com.zipow.videobox.view.mm;


public class MMChatBuddiesGridView_BuddyOperationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMChatBuddiesGridView.BuddyOperationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickAddBtn:()V:GetOnClickAddBtnHandler:Com.Zipow.Videobox.View.MM.MMChatBuddiesGridView/IBuddyOperationListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickBuddyItem:(Lcom/zipow/videobox/view/mm/MMBuddyItem;)V:GetOnClickBuddyItem_Lcom_zipow_videobox_view_mm_MMBuddyItem_Handler:Com.Zipow.Videobox.View.MM.MMChatBuddiesGridView/IBuddyOperationListenerInvoker, MobileRTC_Droid\n" +
			"n_onRemoveBuddy:(Lcom/zipow/videobox/view/mm/MMBuddyItem;)V:GetOnRemoveBuddy_Lcom_zipow_videobox_view_mm_MMBuddyItem_Handler:Com.Zipow.Videobox.View.MM.MMChatBuddiesGridView/IBuddyOperationListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMChatBuddiesGridView+IBuddyOperationListenerImplementor, MobileRTC_Droid", MMChatBuddiesGridView_BuddyOperationListenerImplementor.class, __md_methods);
	}


	public MMChatBuddiesGridView_BuddyOperationListenerImplementor ()
	{
		super ();
		if (getClass () == MMChatBuddiesGridView_BuddyOperationListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMChatBuddiesGridView+IBuddyOperationListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickAddBtn ()
	{
		n_onClickAddBtn ();
	}

	private native void n_onClickAddBtn ();


	public void onClickBuddyItem (com.zipow.videobox.view.mm.MMBuddyItem p0)
	{
		n_onClickBuddyItem (p0);
	}

	private native void n_onClickBuddyItem (com.zipow.videobox.view.mm.MMBuddyItem p0);


	public void onRemoveBuddy (com.zipow.videobox.view.mm.MMBuddyItem p0)
	{
		n_onRemoveBuddy (p0);
	}

	private native void n_onRemoveBuddy (com.zipow.videobox.view.mm.MMBuddyItem p0);

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
