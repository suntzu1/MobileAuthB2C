package mono.us.zoom.androidlib.widget;


public class ZMTextView_OnClickLinkListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.ZMTextView.OnClickLinkListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLongClickLink:(Ljava/lang/String;)Z:GetOnLongClickLink_Ljava_lang_String_Handler:US.Zoom.Androidlib.Widget.ZMTextView/IOnClickLinkListenerInvoker, CommonLib\n" +
			"n_onLongClickWhole:(Ljava/lang/String;)Z:GetOnLongClickWhole_Ljava_lang_String_Handler:US.Zoom.Androidlib.Widget.ZMTextView/IOnClickLinkListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.ZMTextView+IOnClickLinkListenerImplementor, CommonLib", ZMTextView_OnClickLinkListenerImplementor.class, __md_methods);
	}


	public ZMTextView_OnClickLinkListenerImplementor ()
	{
		super ();
		if (getClass () == ZMTextView_OnClickLinkListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.ZMTextView+IOnClickLinkListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public boolean onLongClickLink (java.lang.String p0)
	{
		return n_onLongClickLink (p0);
	}

	private native boolean n_onLongClickLink (java.lang.String p0);


	public boolean onLongClickWhole (java.lang.String p0)
	{
		return n_onLongClickWhole (p0);
	}

	private native boolean n_onLongClickWhole (java.lang.String p0);

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
