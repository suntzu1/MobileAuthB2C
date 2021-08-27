package mono.us.zoom.androidlib.widget.segement;


public class OnTabSelectListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.segement.OnTabSelectListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTabReselect:(I)V:GetOnTabReselect_IHandler:US.Zoom.Androidlib.Widget.Segement.IOnTabSelectListenerInvoker, CommonLib\n" +
			"n_onTabSelect:(I)V:GetOnTabSelect_IHandler:US.Zoom.Androidlib.Widget.Segement.IOnTabSelectListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.Segement.IOnTabSelectListenerImplementor, CommonLib", OnTabSelectListenerImplementor.class, __md_methods);
	}


	public OnTabSelectListenerImplementor ()
	{
		super ();
		if (getClass () == OnTabSelectListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.Segement.IOnTabSelectListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onTabReselect (int p0)
	{
		n_onTabReselect (p0);
	}

	private native void n_onTabReselect (int p0);


	public void onTabSelect (int p0)
	{
		n_onTabSelect (p0);
	}

	private native void n_onTabSelect (int p0);

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
