package mono.com.zipow.annotate;


public class ShareScreenAnnoToolbar_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.annotate.ShareScreenAnnoToolbar.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnoStatusChanged:()V:GetOnAnnoStatusChangedHandler:Com.Zipow.Annotate.ShareScreenAnnoToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onClickStopShare:()V:GetOnClickStopShareHandler:Com.Zipow.Annotate.ShareScreenAnnoToolbar/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Annotate.ShareScreenAnnoToolbar+IListenerImplementor, MobileRTC_Droid", ShareScreenAnnoToolbar_ListenerImplementor.class, __md_methods);
	}


	public ShareScreenAnnoToolbar_ListenerImplementor ()
	{
		super ();
		if (getClass () == ShareScreenAnnoToolbar_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Annotate.ShareScreenAnnoToolbar+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onAnnoStatusChanged ()
	{
		n_onAnnoStatusChanged ();
	}

	private native void n_onAnnoStatusChanged ();


	public void onClickStopShare ()
	{
		n_onClickStopShare ();
	}

	private native void n_onClickStopShare ();

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
