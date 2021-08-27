package mono.com.zipow.videobox.view.bookmark;


public class BookmarkListView_onChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.bookmark.BookmarkListView.onChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDataChange:()V:GetOnDataChangeHandler:Com.Zipow.Videobox.View.Bookmark.BookmarkListView/IOnChangeListenerInvoker, MobileRTC_Droid\n" +
			"n_onEditItem:(I)V:GetOnEditItem_IHandler:Com.Zipow.Videobox.View.Bookmark.BookmarkListView/IOnChangeListenerInvoker, MobileRTC_Droid\n" +
			"n_onSelectItem:(Lcom/zipow/videobox/view/bookmark/BookmarkItem;)V:GetOnSelectItem_Lcom_zipow_videobox_view_bookmark_BookmarkItem_Handler:Com.Zipow.Videobox.View.Bookmark.BookmarkListView/IOnChangeListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Bookmark.BookmarkListView+IOnChangeListenerImplementor, MobileRTC_Droid", BookmarkListView_onChangeListenerImplementor.class, __md_methods);
	}


	public BookmarkListView_onChangeListenerImplementor ()
	{
		super ();
		if (getClass () == BookmarkListView_onChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Bookmark.BookmarkListView+IOnChangeListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onDataChange ()
	{
		n_onDataChange ();
	}

	private native void n_onDataChange ();


	public void onEditItem (int p0)
	{
		n_onEditItem (p0);
	}

	private native void n_onEditItem (int p0);


	public void onSelectItem (com.zipow.videobox.view.bookmark.BookmarkItem p0)
	{
		n_onSelectItem (p0);
	}

	private native void n_onSelectItem (com.zipow.videobox.view.bookmark.BookmarkItem p0);

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
