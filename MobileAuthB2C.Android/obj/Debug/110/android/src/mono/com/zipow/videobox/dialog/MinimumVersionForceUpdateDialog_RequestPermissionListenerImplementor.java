package mono.com.zipow.videobox.dialog;


public class MinimumVersionForceUpdateDialog_RequestPermissionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.dialog.MinimumVersionForceUpdateDialog.RequestPermissionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_requestPermission:()V:GetRequestPermissionHandler:Com.Zipow.Videobox.Dialog.MinimumVersionForceUpdateDialog/IRequestPermissionListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Dialog.MinimumVersionForceUpdateDialog+IRequestPermissionListenerImplementor, MobileRTC_Droid", MinimumVersionForceUpdateDialog_RequestPermissionListenerImplementor.class, __md_methods);
	}


	public MinimumVersionForceUpdateDialog_RequestPermissionListenerImplementor ()
	{
		super ();
		if (getClass () == MinimumVersionForceUpdateDialog_RequestPermissionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Dialog.MinimumVersionForceUpdateDialog+IRequestPermissionListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void requestPermission ()
	{
		n_requestPermission ();
	}

	private native void n_requestPermission ();

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
