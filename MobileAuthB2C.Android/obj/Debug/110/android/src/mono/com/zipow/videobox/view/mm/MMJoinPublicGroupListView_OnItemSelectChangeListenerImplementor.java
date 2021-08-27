package mono.com.zipow.videobox.view.mm;


public class MMJoinPublicGroupListView_OnItemSelectChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMJoinPublicGroupListView.OnItemSelectChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemSelectChange:()V:GetOnItemSelectChangeHandler:Com.Zipow.Videobox.View.MM.MMJoinPublicGroupListView/IOnItemSelectChangeListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMJoinPublicGroupListView+IOnItemSelectChangeListenerImplementor, MobileRTC_Droid", MMJoinPublicGroupListView_OnItemSelectChangeListenerImplementor.class, __md_methods);
	}


	public MMJoinPublicGroupListView_OnItemSelectChangeListenerImplementor ()
	{
		super ();
		if (getClass () == MMJoinPublicGroupListView_OnItemSelectChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMJoinPublicGroupListView+IOnItemSelectChangeListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onItemSelectChange ()
	{
		n_onItemSelectChange ();
	}

	private native void n_onItemSelectChange ();

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
