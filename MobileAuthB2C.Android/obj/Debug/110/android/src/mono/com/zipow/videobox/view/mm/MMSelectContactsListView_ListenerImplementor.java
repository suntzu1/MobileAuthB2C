package mono.com.zipow.videobox.view.mm;


public class MMSelectContactsListView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMSelectContactsListView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelectCountReachMax:()V:GetOnSelectCountReachMaxHandler:Com.Zipow.Videobox.View.MM.MMSelectContactsListView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onSelected:(ZLcom/zipow/videobox/view/mm/MMSelectContactsListItem;)V:GetOnSelected_ZLcom_zipow_videobox_view_mm_MMSelectContactsListItem_Handler:Com.Zipow.Videobox.View.MM.MMSelectContactsListView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onSelectionChanged:()V:GetOnSelectionChangedHandler:Com.Zipow.Videobox.View.MM.MMSelectContactsListView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onViewMoreClick:()V:GetOnViewMoreClickHandler:Com.Zipow.Videobox.View.MM.MMSelectContactsListView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMSelectContactsListView+IListenerImplementor, MobileRTC_Droid", MMSelectContactsListView_ListenerImplementor.class, __md_methods);
	}


	public MMSelectContactsListView_ListenerImplementor ()
	{
		super ();
		if (getClass () == MMSelectContactsListView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMSelectContactsListView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onSelectCountReachMax ()
	{
		n_onSelectCountReachMax ();
	}

	private native void n_onSelectCountReachMax ();


	public void onSelected (boolean p0, com.zipow.videobox.view.mm.MMSelectContactsListItem p1)
	{
		n_onSelected (p0, p1);
	}

	private native void n_onSelected (boolean p0, com.zipow.videobox.view.mm.MMSelectContactsListItem p1);


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
