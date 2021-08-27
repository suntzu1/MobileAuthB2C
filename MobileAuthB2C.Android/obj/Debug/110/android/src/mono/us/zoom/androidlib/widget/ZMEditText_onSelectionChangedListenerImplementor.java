package mono.us.zoom.androidlib.widget;


public class ZMEditText_onSelectionChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.ZMEditText.onSelectionChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEditTextSelectionChanged:(II)V:GetOnEditTextSelectionChanged_IIHandler:US.Zoom.Androidlib.Widget.ZMEditText/IOnSelectionChangedListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.ZMEditText+IOnSelectionChangedListenerImplementor, CommonLib", ZMEditText_onSelectionChangedListenerImplementor.class, __md_methods);
	}


	public ZMEditText_onSelectionChangedListenerImplementor ()
	{
		super ();
		if (getClass () == ZMEditText_onSelectionChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.ZMEditText+IOnSelectionChangedListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onEditTextSelectionChanged (int p0, int p1)
	{
		n_onEditTextSelectionChanged (p0, p1);
	}

	private native void n_onEditTextSelectionChanged (int p0, int p1);

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
