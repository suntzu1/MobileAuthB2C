package mono.com.zipow.videobox.photopicker;


public class OnPagerItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.photopicker.OnPagerItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemClick:(Landroid/view/View;)V:GetOnItemClick_Landroid_view_View_Handler:Com.Zipow.Videobox.Photopicker.IOnPagerItemClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Photopicker.IOnPagerItemClickListenerImplementor, MobileRTC_Droid", OnPagerItemClickListenerImplementor.class, __md_methods);
	}


	public OnPagerItemClickListenerImplementor ()
	{
		super ();
		if (getClass () == OnPagerItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Photopicker.IOnPagerItemClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onItemClick (android.view.View p0)
	{
		n_onItemClick (p0);
	}

	private native void n_onItemClick (android.view.View p0);

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
