package mono.com.zipow.videobox.photopicker;


public class OnPhotoClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.photopicker.OnPhotoClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;IZ)V:GetOnClick_Landroid_view_View_IZHandler:Com.Zipow.Videobox.Photopicker.IOnPhotoClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Photopicker.IOnPhotoClickListenerImplementor, MobileRTC_Droid", OnPhotoClickListenerImplementor.class, __md_methods);
	}


	public OnPhotoClickListenerImplementor ()
	{
		super ();
		if (getClass () == OnPhotoClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Photopicker.IOnPhotoClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0, int p1, boolean p2)
	{
		n_onClick (p0, p1, p2);
	}

	private native void n_onClick (android.view.View p0, int p1, boolean p2);

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
