package mono.us.zoom.androidlib.widget;


public class TimeZoneListView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.TimeZoneListView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSelected:(Ljava/lang/String;)V:GetOnSelected_Ljava_lang_String_Handler:US.Zoom.Androidlib.Widget.TimeZoneListView/IListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.TimeZoneListView+IListenerImplementor, CommonLib", TimeZoneListView_ListenerImplementor.class, __md_methods);
	}


	public TimeZoneListView_ListenerImplementor ()
	{
		super ();
		if (getClass () == TimeZoneListView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.TimeZoneListView+IListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onSelected (java.lang.String p0)
	{
		n_onSelected (p0);
	}

	private native void n_onSelected (java.lang.String p0);

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
