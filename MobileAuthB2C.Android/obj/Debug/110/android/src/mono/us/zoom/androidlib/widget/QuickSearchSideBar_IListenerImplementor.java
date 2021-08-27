package mono.us.zoom.androidlib.widget;


public class QuickSearchSideBar_IListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.QuickSearchSideBar.IListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onQuickSearchCharPressed:(C)V:GetOnQuickSearchCharPressed_CHandler:US.Zoom.Androidlib.Widget.QuickSearchSideBar/IListenerInvoker, CommonLib\n" +
			"n_onQuickSearchCharReleased:(C)V:GetOnQuickSearchCharReleased_CHandler:US.Zoom.Androidlib.Widget.QuickSearchSideBar/IListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.QuickSearchSideBar+IListenerImplementor, CommonLib", QuickSearchSideBar_IListenerImplementor.class, __md_methods);
	}


	public QuickSearchSideBar_IListenerImplementor ()
	{
		super ();
		if (getClass () == QuickSearchSideBar_IListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.QuickSearchSideBar+IListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onQuickSearchCharPressed (char p0)
	{
		n_onQuickSearchCharPressed (p0);
	}

	private native void n_onQuickSearchCharPressed (char p0);


	public void onQuickSearchCharReleased (char p0)
	{
		n_onQuickSearchCharReleased (p0);
	}

	private native void n_onQuickSearchCharReleased (char p0);

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
