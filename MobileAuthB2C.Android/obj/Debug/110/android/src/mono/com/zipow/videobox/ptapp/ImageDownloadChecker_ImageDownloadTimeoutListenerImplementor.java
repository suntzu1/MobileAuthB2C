package mono.com.zipow.videobox.ptapp;


public class ImageDownloadChecker_ImageDownloadTimeoutListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.ptapp.ImageDownloadChecker.ImageDownloadTimeoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onImageDownloadTimeout:(Ljava/lang/String;Ljava/lang/String;)V:GetOnImageDownloadTimeout_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.Ptapp.ImageDownloadChecker/IImageDownloadTimeoutListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Ptapp.ImageDownloadChecker+IImageDownloadTimeoutListenerImplementor, MobileRTC_Droid", ImageDownloadChecker_ImageDownloadTimeoutListenerImplementor.class, __md_methods);
	}


	public ImageDownloadChecker_ImageDownloadTimeoutListenerImplementor ()
	{
		super ();
		if (getClass () == ImageDownloadChecker_ImageDownloadTimeoutListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Ptapp.ImageDownloadChecker+IImageDownloadTimeoutListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onImageDownloadTimeout (java.lang.String p0, java.lang.String p1)
	{
		n_onImageDownloadTimeout (p0, p1);
	}

	private native void n_onImageDownloadTimeout (java.lang.String p0, java.lang.String p1);

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
