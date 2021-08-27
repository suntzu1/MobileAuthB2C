package mono.com.zipow.videobox.confapp;


public class GLImage_OnClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.confapp.GLImage.OnClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Lcom/zipow/videobox/confapp/GLImage;)V:GetOnClick_Lcom_zipow_videobox_confapp_GLImage_Handler:Com.Zipow.Videobox.Confapp.GLImage/IOnClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Confapp.GLImage+IOnClickListenerImplementor, MobileRTC_Droid", GLImage_OnClickListenerImplementor.class, __md_methods);
	}


	public GLImage_OnClickListenerImplementor ()
	{
		super ();
		if (getClass () == GLImage_OnClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Confapp.GLImage+IOnClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClick (com.zipow.videobox.confapp.GLImage p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (com.zipow.videobox.confapp.GLImage p0);

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
