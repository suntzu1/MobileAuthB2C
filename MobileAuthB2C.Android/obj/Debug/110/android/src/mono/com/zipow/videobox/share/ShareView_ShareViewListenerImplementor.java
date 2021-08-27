package mono.com.zipow.videobox.share;


public class ShareView_ShareViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.share.ShareView.ShareViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onShareError:()V:GetOnShareErrorHandler:Com.Zipow.Videobox.Share.ShareView/IShareViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onStartEdit:()V:GetOnStartEditHandler:Com.Zipow.Videobox.Share.ShareView/IShareViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onStopEdit:()V:GetOnStopEditHandler:Com.Zipow.Videobox.Share.ShareView/IShareViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Share.ShareView+IShareViewListenerImplementor, MobileRTC_Droid", ShareView_ShareViewListenerImplementor.class, __md_methods);
	}


	public ShareView_ShareViewListenerImplementor ()
	{
		super ();
		if (getClass () == ShareView_ShareViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Share.ShareView+IShareViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onShareError ()
	{
		n_onShareError ();
	}

	private native void n_onShareError ();


	public void onStartEdit ()
	{
		n_onStartEdit ();
	}

	private native void n_onStartEdit ();


	public void onStopEdit ()
	{
		n_onStopEdit ();
	}

	private native void n_onStopEdit ();

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
