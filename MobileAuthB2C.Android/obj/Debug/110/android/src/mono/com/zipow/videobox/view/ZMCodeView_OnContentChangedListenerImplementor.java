package mono.com.zipow.videobox.view;


public class ZMCodeView_OnContentChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.ZMCodeView.OnContentChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onContentChanged:()V:GetOnContentChangedHandler:Com.Zipow.Videobox.View.ZMCodeView/IOnContentChangedListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.ZMCodeView+IOnContentChangedListenerImplementor, MobileRTC_Droid", ZMCodeView_OnContentChangedListenerImplementor.class, __md_methods);
	}


	public ZMCodeView_OnContentChangedListenerImplementor ()
	{
		super ();
		if (getClass () == ZMCodeView_OnContentChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.ZMCodeView+IOnContentChangedListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onContentChanged ()
	{
		n_onContentChanged ();
	}

	private native void n_onContentChanged ();

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
