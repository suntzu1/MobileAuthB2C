package mono.com.zipow.videobox.dialog;


public class ConfirmAlertDialog_OnButtonClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.dialog.ConfirmAlertDialog.OnButtonClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onNegativeClick:()V:GetOnNegativeClickHandler:Com.Zipow.Videobox.Dialog.ConfirmAlertDialog/IOnButtonClickListenerInvoker, MobileRTC_Droid\n" +
			"n_onPositiveClick:()V:GetOnPositiveClickHandler:Com.Zipow.Videobox.Dialog.ConfirmAlertDialog/IOnButtonClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Dialog.ConfirmAlertDialog+IOnButtonClickListenerImplementor, MobileRTC_Droid", ConfirmAlertDialog_OnButtonClickListenerImplementor.class, __md_methods);
	}


	public ConfirmAlertDialog_OnButtonClickListenerImplementor ()
	{
		super ();
		if (getClass () == ConfirmAlertDialog_OnButtonClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Dialog.ConfirmAlertDialog+IOnButtonClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onNegativeClick ()
	{
		n_onNegativeClick ();
	}

	private native void n_onNegativeClick ();


	public void onPositiveClick ()
	{
		n_onPositiveClick ();
	}

	private native void n_onPositiveClick ();

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
