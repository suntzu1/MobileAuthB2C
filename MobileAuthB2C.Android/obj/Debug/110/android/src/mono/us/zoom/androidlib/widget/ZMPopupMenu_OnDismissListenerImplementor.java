package mono.us.zoom.androidlib.widget;


public class ZMPopupMenu_OnDismissListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.ZMPopupMenu.OnDismissListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDismiss:(Lus/zoom/androidlib/widget/ZMPopupMenu;)V:GetOnDismiss_Lus_zoom_androidlib_widget_ZMPopupMenu_Handler:US.Zoom.Androidlib.Widget.ZMPopupMenu/IOnDismissListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.ZMPopupMenu+IOnDismissListenerImplementor, CommonLib", ZMPopupMenu_OnDismissListenerImplementor.class, __md_methods);
	}


	public ZMPopupMenu_OnDismissListenerImplementor ()
	{
		super ();
		if (getClass () == ZMPopupMenu_OnDismissListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.ZMPopupMenu+IOnDismissListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onDismiss (us.zoom.androidlib.widget.ZMPopupMenu p0)
	{
		n_onDismiss (p0);
	}

	private native void n_onDismiss (us.zoom.androidlib.widget.ZMPopupMenu p0);

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
