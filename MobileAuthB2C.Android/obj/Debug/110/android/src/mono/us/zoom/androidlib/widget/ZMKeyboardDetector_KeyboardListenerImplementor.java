package mono.us.zoom.androidlib.widget;


public class ZMKeyboardDetector_KeyboardListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.ZMKeyboardDetector.KeyboardListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onKeyboardClosed:()V:GetOnKeyboardClosedHandler:US.Zoom.Androidlib.Widget.ZMKeyboardDetector/IKeyboardListenerInvoker, CommonLib\n" +
			"n_onKeyboardOpen:()V:GetOnKeyboardOpenHandler:US.Zoom.Androidlib.Widget.ZMKeyboardDetector/IKeyboardListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.ZMKeyboardDetector+IKeyboardListenerImplementor, CommonLib", ZMKeyboardDetector_KeyboardListenerImplementor.class, __md_methods);
	}


	public ZMKeyboardDetector_KeyboardListenerImplementor ()
	{
		super ();
		if (getClass () == ZMKeyboardDetector_KeyboardListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.ZMKeyboardDetector+IKeyboardListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onKeyboardClosed ()
	{
		n_onKeyboardClosed ();
	}

	private native void n_onKeyboardClosed ();


	public void onKeyboardOpen ()
	{
		n_onKeyboardOpen ();
	}

	private native void n_onKeyboardOpen ();

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
