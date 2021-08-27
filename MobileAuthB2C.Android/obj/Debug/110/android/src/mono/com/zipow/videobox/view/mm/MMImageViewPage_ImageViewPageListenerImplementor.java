package mono.com.zipow.videobox.view.mm;


public class MMImageViewPage_ImageViewPageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMImageViewPage.ImageViewPageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_downloadImage:(Ljava/lang/String;Ljava/lang/String;)V:GetDownloadImage_Ljava_lang_String_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.MMImageViewPage/IImageViewPageListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMImageViewPage+IImageViewPageListenerImplementor, MobileRTC_Droid", MMImageViewPage_ImageViewPageListenerImplementor.class, __md_methods);
	}


	public MMImageViewPage_ImageViewPageListenerImplementor ()
	{
		super ();
		if (getClass () == MMImageViewPage_ImageViewPageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMImageViewPage+IImageViewPageListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void downloadImage (java.lang.String p0, java.lang.String p1)
	{
		n_downloadImage (p0, p1);
	}

	private native void n_downloadImage (java.lang.String p0, java.lang.String p1);

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
