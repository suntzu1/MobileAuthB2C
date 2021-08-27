package mono.us.zoom.androidlib.util;


public class ZMHtmlUtil_OnURLSpanClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.util.ZMHtmlUtil.OnURLSpanClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V:GetOnClick_Landroid_view_View_Ljava_lang_String_Ljava_lang_String_Handler:US.Zoom.Androidlib.Util.ZMHtmlUtil/IOnURLSpanClickListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Util.ZMHtmlUtil+IOnURLSpanClickListenerImplementor, CommonLib", ZMHtmlUtil_OnURLSpanClickListenerImplementor.class, __md_methods);
	}


	public ZMHtmlUtil_OnURLSpanClickListenerImplementor ()
	{
		super ();
		if (getClass () == ZMHtmlUtil_OnURLSpanClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Util.ZMHtmlUtil+IOnURLSpanClickListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0, java.lang.String p1, java.lang.String p2)
	{
		n_onClick (p0, p1, p2);
	}

	private native void n_onClick (android.view.View p0, java.lang.String p1, java.lang.String p2);

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
