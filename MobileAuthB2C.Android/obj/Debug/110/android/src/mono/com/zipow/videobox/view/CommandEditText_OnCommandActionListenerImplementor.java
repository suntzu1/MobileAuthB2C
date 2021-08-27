package mono.com.zipow.videobox.view;


public class CommandEditText_OnCommandActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.CommandEditText.OnCommandActionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCommandAction:(I)V:GetOnCommandAction_IHandler:Com.Zipow.Videobox.View.CommandEditText/IOnCommandActionListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.CommandEditText+IOnCommandActionListenerImplementor, MobileRTC_Droid", CommandEditText_OnCommandActionListenerImplementor.class, __md_methods);
	}


	public CommandEditText_OnCommandActionListenerImplementor ()
	{
		super ();
		if (getClass () == CommandEditText_OnCommandActionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.CommandEditText+IOnCommandActionListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCommandAction (int p0)
	{
		n_onCommandAction (p0);
	}

	private native void n_onCommandAction (int p0);

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
