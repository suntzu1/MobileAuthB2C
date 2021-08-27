package mono.com.zipow.videobox.view;


public class AddFavoriteListView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.AddFavoriteListView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelectionChanged:()V:GetOnSelectionChangedHandler:Com.Zipow.Videobox.View.AddFavoriteListView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.AddFavoriteListView+IListenerImplementor, MobileRTC_Droid", AddFavoriteListView_ListenerImplementor.class, __md_methods);
	}


	public AddFavoriteListView_ListenerImplementor ()
	{
		super ();
		if (getClass () == AddFavoriteListView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.AddFavoriteListView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onSelectionChanged ()
	{
		n_onSelectionChanged ();
	}

	private native void n_onSelectionChanged ();

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
