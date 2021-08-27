package crc649ff1135dfc343e3a;


public class JsBridge
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_InvokeAction:(Ljava/lang/String;)V:__export__\n" +
			"";
		mono.android.Runtime.register ("Gia.Droid.Renderers.JsBridge, MobileAuthB2C.Android", JsBridge.class, __md_methods);
	}


	public JsBridge ()
	{
		super ();
		if (getClass () == JsBridge.class)
			mono.android.TypeManager.Activate ("Gia.Droid.Renderers.JsBridge, MobileAuthB2C.Android", "", this, new java.lang.Object[] {  });
	}

	public JsBridge (crc649ff1135dfc343e3a.HybridWebViewRenderer p0)
	{
		super ();
		if (getClass () == JsBridge.class)
			mono.android.TypeManager.Activate ("Gia.Droid.Renderers.JsBridge, MobileAuthB2C.Android", "Gia.Droid.Renderers.HybridWebViewRenderer, MobileAuthB2C.Android", this, new java.lang.Object[] { p0 });
	}

	@android.webkit.JavascriptInterface

	public void invokeAction (java.lang.String p0)
	{
		n_InvokeAction (p0);
	}

	private native void n_InvokeAction (java.lang.String p0);

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
