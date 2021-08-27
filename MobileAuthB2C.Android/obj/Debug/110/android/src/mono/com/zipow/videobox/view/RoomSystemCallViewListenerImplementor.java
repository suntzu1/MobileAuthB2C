package mono.com.zipow.videobox.view;


public class RoomSystemCallViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.RoomSystemCallViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancel:(Z)V:GetOnCancel_ZHandler:Com.Zipow.Videobox.View.IRoomSystemCallViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onConnected:(Z)V:GetOnConnected_ZHandler:Com.Zipow.Videobox.View.IRoomSystemCallViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onConnecting:(Z)V:GetOnConnecting_ZHandler:Com.Zipow.Videobox.View.IRoomSystemCallViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onFailed:(Z)V:GetOnFailed_ZHandler:Com.Zipow.Videobox.View.IRoomSystemCallViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.IRoomSystemCallViewListenerImplementor, MobileRTC_Droid", RoomSystemCallViewListenerImplementor.class, __md_methods);
	}


	public RoomSystemCallViewListenerImplementor ()
	{
		super ();
		if (getClass () == RoomSystemCallViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.IRoomSystemCallViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCancel (boolean p0)
	{
		n_onCancel (p0);
	}

	private native void n_onCancel (boolean p0);


	public void onConnected (boolean p0)
	{
		n_onConnected (p0);
	}

	private native void n_onConnected (boolean p0);


	public void onConnecting (boolean p0)
	{
		n_onConnecting (p0);
	}

	private native void n_onConnecting (boolean p0);


	public void onFailed (boolean p0)
	{
		n_onFailed (p0);
	}

	private native void n_onFailed (boolean p0);

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
