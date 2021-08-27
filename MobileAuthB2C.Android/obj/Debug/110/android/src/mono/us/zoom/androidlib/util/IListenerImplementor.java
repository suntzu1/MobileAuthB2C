package mono.us.zoom.androidlib.util;


public class IListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.util.IListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Util.IListenerImplementor, CommonLib", IListenerImplementor.class, __md_methods);
	}


	public IListenerImplementor ()
	{
		super ();
		if (getClass () == IListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Util.IListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}

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
