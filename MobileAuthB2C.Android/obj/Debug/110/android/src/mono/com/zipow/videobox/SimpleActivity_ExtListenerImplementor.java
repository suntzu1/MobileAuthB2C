package mono.com.zipow.videobox;


public class SimpleActivity_ExtListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.SimpleActivity.ExtListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBackPressed:()Z:GetOnBackPressedHandler:Com.Zipow.Videobox.SimpleActivity/IExtListenerInvoker, MobileRTC_Droid\n" +
			"n_onKeyboardClosed:()V:GetOnKeyboardClosedHandler:Com.Zipow.Videobox.SimpleActivity/IExtListenerInvoker, MobileRTC_Droid\n" +
			"n_onKeyboardOpen:()V:GetOnKeyboardOpenHandler:Com.Zipow.Videobox.SimpleActivity/IExtListenerInvoker, MobileRTC_Droid\n" +
			"n_onSearchRequested:()Z:GetOnSearchRequestedHandler:Com.Zipow.Videobox.SimpleActivity/IExtListenerInvoker, MobileRTC_Droid\n" +
			"n_onTipLayerTouched:()Z:GetOnTipLayerTouchedHandler:Com.Zipow.Videobox.SimpleActivity/IExtListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.SimpleActivity+IExtListenerImplementor, MobileRTC_Droid", SimpleActivity_ExtListenerImplementor.class, __md_methods);
	}


	public SimpleActivity_ExtListenerImplementor ()
	{
		super ();
		if (getClass () == SimpleActivity_ExtListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.SimpleActivity+IExtListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public boolean onBackPressed ()
	{
		return n_onBackPressed ();
	}

	private native boolean n_onBackPressed ();


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


	public boolean onSearchRequested ()
	{
		return n_onSearchRequested ();
	}

	private native boolean n_onSearchRequested ();


	public boolean onTipLayerTouched ()
	{
		return n_onTipLayerTouched ();
	}

	private native boolean n_onTipLayerTouched ();

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
