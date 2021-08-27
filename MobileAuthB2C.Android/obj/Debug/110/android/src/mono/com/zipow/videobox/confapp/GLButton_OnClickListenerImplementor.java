package mono.com.zipow.videobox.confapp;


public class GLButton_OnClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.confapp.GLButton.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Lcom/zipow/videobox/confapp/GLButton;)V:GetOnClick_Lcom_zipow_videobox_confapp_GLButton_Handler:Com.Zipow.Videobox.Confapp.GLButton/IOnClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Confapp.GLButton+IOnClickListenerImplementor, MobileRTC_Droid", GLButton_OnClickListenerImplementor.class, __md_methods);
	}


	public GLButton_OnClickListenerImplementor ()
	{
		super ();
		if (getClass () == GLButton_OnClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Confapp.GLButton+IOnClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClick (com.zipow.videobox.confapp.GLButton p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (com.zipow.videobox.confapp.GLButton p0);

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
