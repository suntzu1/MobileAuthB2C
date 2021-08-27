package mono.com.zipow.videobox.view;


public class IMChatView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.IMChatView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickButtonBack:()V:GetOnClickButtonBackHandler:Com.Zipow.Videobox.View.IMChatView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.IMChatView+IListenerImplementor, MobileRTC_Droid", IMChatView_ListenerImplementor.class, __md_methods);
	}


	public IMChatView_ListenerImplementor ()
	{
		super ();
		if (getClass () == IMChatView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.IMChatView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickButtonBack ()
	{
		n_onClickButtonBack ();
	}

	private native void n_onClickButtonBack ();

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
