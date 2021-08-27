package mono.com.zipow.videobox.view;


public class InviteBuddyListView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.InviteBuddyListView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelected:(ZLcom/zipow/videobox/view/InviteBuddyItem;)V:GetOnSelected_ZLcom_zipow_videobox_view_InviteBuddyItem_Handler:Com.Zipow.Videobox.View.InviteBuddyListView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onSelectionChanged:()V:GetOnSelectionChangedHandler:Com.Zipow.Videobox.View.InviteBuddyListView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onViewMoreClick:()V:GetOnViewMoreClickHandler:Com.Zipow.Videobox.View.InviteBuddyListView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.InviteBuddyListView+IListenerImplementor, MobileRTC_Droid", InviteBuddyListView_ListenerImplementor.class, __md_methods);
	}


	public InviteBuddyListView_ListenerImplementor ()
	{
		super ();
		if (getClass () == InviteBuddyListView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.InviteBuddyListView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onSelected (boolean p0, com.zipow.videobox.view.InviteBuddyItem p1)
	{
		n_onSelected (p0, p1);
	}

	private native void n_onSelected (boolean p0, com.zipow.videobox.view.InviteBuddyItem p1);


	public void onSelectionChanged ()
	{
		n_onSelectionChanged ();
	}

	private native void n_onSelectionChanged ();


	public void onViewMoreClick ()
	{
		n_onViewMoreClick ();
	}

	private native void n_onViewMoreClick ();

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
