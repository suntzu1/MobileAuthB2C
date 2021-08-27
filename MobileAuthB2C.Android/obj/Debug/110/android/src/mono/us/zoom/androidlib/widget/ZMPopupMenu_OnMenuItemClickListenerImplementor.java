package mono.us.zoom.androidlib.widget;


public class ZMPopupMenu_OnMenuItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.ZMPopupMenu.OnMenuItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMenuItemClick:(Lus/zoom/androidlib/widget/IZMMenuItem;)V:GetOnMenuItemClick_Lus_zoom_androidlib_widget_IZMMenuItem_Handler:US.Zoom.Androidlib.Widget.ZMPopupMenu/IOnMenuItemClickListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.ZMPopupMenu+IOnMenuItemClickListenerImplementor, CommonLib", ZMPopupMenu_OnMenuItemClickListenerImplementor.class, __md_methods);
	}


	public ZMPopupMenu_OnMenuItemClickListenerImplementor ()
	{
		super ();
		if (getClass () == ZMPopupMenu_OnMenuItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.ZMPopupMenu+IOnMenuItemClickListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onMenuItemClick (us.zoom.androidlib.widget.IZMMenuItem p0)
	{
		n_onMenuItemClick (p0);
	}

	private native void n_onMenuItemClick (us.zoom.androidlib.widget.IZMMenuItem p0);

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
