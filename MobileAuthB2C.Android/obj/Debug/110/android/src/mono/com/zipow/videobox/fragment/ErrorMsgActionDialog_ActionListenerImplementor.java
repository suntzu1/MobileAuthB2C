package mono.com.zipow.videobox.fragment;


public class ErrorMsgActionDialog_ActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.fragment.ErrorMsgActionDialog.ActionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAction:()V:GetOnActionHandler:Com.Zipow.Videobox.Fragment.ErrorMsgActionDialog/IActionListenerInvoker, MobileRTC_Droid\n" +
			"n_onCancel:()V:GetOnCancelHandler:Com.Zipow.Videobox.Fragment.ErrorMsgActionDialog/IActionListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Fragment.ErrorMsgActionDialog+IActionListenerImplementor, MobileRTC_Droid", ErrorMsgActionDialog_ActionListenerImplementor.class, __md_methods);
	}


	public ErrorMsgActionDialog_ActionListenerImplementor ()
	{
		super ();
		if (getClass () == ErrorMsgActionDialog_ActionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Fragment.ErrorMsgActionDialog+IActionListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onAction ()
	{
		n_onAction ();
	}

	private native void n_onAction ();


	public void onCancel ()
	{
		n_onCancel ();
	}

	private native void n_onCancel ();

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
