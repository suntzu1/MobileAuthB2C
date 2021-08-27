package mono.us.zoom.androidlib.widget;


public class TouchImageView_OnViewPortChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.TouchImageView.OnViewPortChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onViewPortChanged:()V:GetOnViewPortChangedHandler:US.Zoom.Androidlib.Widget.TouchImageView/IOnViewPortChangedListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.TouchImageView+IOnViewPortChangedListenerImplementor, CommonLib", TouchImageView_OnViewPortChangedListenerImplementor.class, __md_methods);
	}


	public TouchImageView_OnViewPortChangedListenerImplementor ()
	{
		super ();
		if (getClass () == TouchImageView_OnViewPortChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.TouchImageView+IOnViewPortChangedListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onViewPortChanged ()
	{
		n_onViewPortChanged ();
	}

	private native void n_onViewPortChanged ();

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
