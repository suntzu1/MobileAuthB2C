package mono.com.zipow.videobox.view.mm;


public class AddCompanyContactsListView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AddCompanyContactsListView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelectionChanged:()V:GetOnSelectionChangedHandler:Com.Zipow.Videobox.View.MM.AddCompanyContactsListView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AddCompanyContactsListView+IListenerImplementor, MobileRTC_Droid", AddCompanyContactsListView_ListenerImplementor.class, __md_methods);
	}


	public AddCompanyContactsListView_ListenerImplementor ()
	{
		super ();
		if (getClass () == AddCompanyContactsListView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AddCompanyContactsListView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
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
