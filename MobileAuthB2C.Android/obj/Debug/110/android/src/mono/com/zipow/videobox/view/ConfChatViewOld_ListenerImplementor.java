package mono.com.zipow.videobox.view;


public class ConfChatViewOld_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.ConfChatViewOld.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickBack:()V:GetOnClickBackHandler:Com.Zipow.Videobox.View.ConfChatViewOld/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.ConfChatViewOld+IListenerImplementor, MobileRTC_Droid", ConfChatViewOld_ListenerImplementor.class, __md_methods);
	}


	public ConfChatViewOld_ListenerImplementor ()
	{
		super ();
		if (getClass () == ConfChatViewOld_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.ConfChatViewOld+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickBack ()
	{
		n_onClickBack ();
	}

	private native void n_onClickBack ();

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
