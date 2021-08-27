package mono.us.zoom.androidlib.widget;


public class TouchImageView_OnSingleTapConfirmedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.TouchImageView.OnSingleTapConfirmedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSingleTapConfirmed:()V:GetOnSingleTapConfirmedHandler:US.Zoom.Androidlib.Widget.TouchImageView/IOnSingleTapConfirmedListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.TouchImageView+IOnSingleTapConfirmedListenerImplementor, CommonLib", TouchImageView_OnSingleTapConfirmedListenerImplementor.class, __md_methods);
	}


	public TouchImageView_OnSingleTapConfirmedListenerImplementor ()
	{
		super ();
		if (getClass () == TouchImageView_OnSingleTapConfirmedListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.TouchImageView+IOnSingleTapConfirmedListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onSingleTapConfirmed ()
	{
		n_onSingleTapConfirmed ();
	}

	private native void n_onSingleTapConfirmed ();

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
