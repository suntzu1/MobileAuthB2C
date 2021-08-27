package mono.com.zipow.videobox.view.mm.contentfile;


public class ContentFileChatListAdapter_OnRecyclerViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.contentfile.ContentFileChatListAdapter.OnRecyclerViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemClick:(Ljava/lang/String;Ljava/lang/String;)V:GetOnItemClick_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.Contentfile.ContentFileChatListAdapter/IOnRecyclerViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.Contentfile.ContentFileChatListAdapter+IOnRecyclerViewListenerImplementor, MobileRTC_Droid", ContentFileChatListAdapter_OnRecyclerViewListenerImplementor.class, __md_methods);
	}


	public ContentFileChatListAdapter_OnRecyclerViewListenerImplementor ()
	{
		super ();
		if (getClass () == ContentFileChatListAdapter_OnRecyclerViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.Contentfile.ContentFileChatListAdapter+IOnRecyclerViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onItemClick (java.lang.String p0, java.lang.String p1)
	{
		n_onItemClick (p0, p1);
	}

	private native void n_onItemClick (java.lang.String p0, java.lang.String p1);

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
