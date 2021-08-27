package mono.us.zoom.androidlib.widget;


public class PullDownRefreshListView_PullDownRefreshListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.PullDownRefreshListView.PullDownRefreshListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPullDownRefresh:()V:GetOnPullDownRefreshHandler:US.Zoom.Androidlib.Widget.PullDownRefreshListView/IPullDownRefreshListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.PullDownRefreshListView+IPullDownRefreshListenerImplementor, CommonLib", PullDownRefreshListView_PullDownRefreshListenerImplementor.class, __md_methods);
	}


	public PullDownRefreshListView_PullDownRefreshListenerImplementor ()
	{
		super ();
		if (getClass () == PullDownRefreshListView_PullDownRefreshListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.PullDownRefreshListView+IPullDownRefreshListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onPullDownRefresh ()
	{
		n_onPullDownRefresh ();
	}

	private native void n_onPullDownRefresh ();

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
