package mono.com.zipow.videobox.view.sip;


public class DialKeyboardView_OnKeyDialListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.sip.DialKeyboardView.OnKeyDialListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onKeyDial:(Ljava/lang/String;)V:GetOnKeyDial_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.Sip.DialKeyboardView/IOnKeyDialListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Sip.DialKeyboardView+IOnKeyDialListenerImplementor, MobileRTC_Droid", DialKeyboardView_OnKeyDialListenerImplementor.class, __md_methods);
	}


	public DialKeyboardView_OnKeyDialListenerImplementor ()
	{
		super ();
		if (getClass () == DialKeyboardView_OnKeyDialListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Sip.DialKeyboardView+IOnKeyDialListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onKeyDial (java.lang.String p0)
	{
		n_onKeyDial (p0);
	}

	private native void n_onKeyDial (java.lang.String p0);

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
