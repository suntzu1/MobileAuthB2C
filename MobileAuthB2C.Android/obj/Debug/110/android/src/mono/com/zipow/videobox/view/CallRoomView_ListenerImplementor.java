package mono.com.zipow.videobox.view;


public class CallRoomView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.CallRoomView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBack:()V:GetOnBackHandler:Com.Zipow.Videobox.View.CallRoomView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.CallRoomView+IListenerImplementor, MobileRTC_Droid", CallRoomView_ListenerImplementor.class, __md_methods);
	}


	public CallRoomView_ListenerImplementor ()
	{
		super ();
		if (getClass () == CallRoomView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.CallRoomView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onBack ()
	{
		n_onBack ();
	}

	private native void n_onBack ();

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
