package mono.us.zoom.androidlib.util;


public class FingerprintUtil_IFingerprintResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.util.FingerprintUtil.IFingerprintResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuthenticateError:(ILjava/lang/CharSequence;)V:GetOnAuthenticateError_ILjava_lang_CharSequence_Handler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"n_onAuthenticateFailed:()V:GetOnAuthenticateFailedHandler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"n_onAuthenticateHelp:(ILjava/lang/CharSequence;)V:GetOnAuthenticateHelp_ILjava_lang_CharSequence_Handler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"n_onAuthenticateStart:()V:GetOnAuthenticateStartHandler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"n_onAuthenticateSucceeded:(Landroid/hardware/fingerprint/FingerprintManager$AuthenticationResult;)V:GetOnAuthenticateSucceeded_Landroid_hardware_fingerprint_FingerprintManager_AuthenticationResult_Handler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"n_onInSecurity:()V:GetOnInSecurityHandler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"n_onNoEnroll:()V:GetOnNoEnrollHandler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"n_onNoHardwareDetected:()V:GetOnNoHardwareDetectedHandler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"n_onSupport:()V:GetOnSupportHandler:US.Zoom.Androidlib.Util.FingerprintUtil/IFingerprintResultListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Util.FingerprintUtil+IFingerprintResultListenerImplementor, CommonLib", FingerprintUtil_IFingerprintResultListenerImplementor.class, __md_methods);
	}


	public FingerprintUtil_IFingerprintResultListenerImplementor ()
	{
		super ();
		if (getClass () == FingerprintUtil_IFingerprintResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Util.FingerprintUtil+IFingerprintResultListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onAuthenticateError (int p0, java.lang.CharSequence p1)
	{
		n_onAuthenticateError (p0, p1);
	}

	private native void n_onAuthenticateError (int p0, java.lang.CharSequence p1);


	public void onAuthenticateFailed ()
	{
		n_onAuthenticateFailed ();
	}

	private native void n_onAuthenticateFailed ();


	public void onAuthenticateHelp (int p0, java.lang.CharSequence p1)
	{
		n_onAuthenticateHelp (p0, p1);
	}

	private native void n_onAuthenticateHelp (int p0, java.lang.CharSequence p1);


	public void onAuthenticateStart ()
	{
		n_onAuthenticateStart ();
	}

	private native void n_onAuthenticateStart ();


	public void onAuthenticateSucceeded (android.hardware.fingerprint.FingerprintManager.AuthenticationResult p0)
	{
		n_onAuthenticateSucceeded (p0);
	}

	private native void n_onAuthenticateSucceeded (android.hardware.fingerprint.FingerprintManager.AuthenticationResult p0);


	public void onInSecurity ()
	{
		n_onInSecurity ();
	}

	private native void n_onInSecurity ();


	public void onNoEnroll ()
	{
		n_onNoEnroll ();
	}

	private native void n_onNoEnroll ();


	public void onNoHardwareDetected ()
	{
		n_onNoHardwareDetected ();
	}

	private native void n_onNoHardwareDetected ();


	public void onSupport ()
	{
		n_onSupport ();
	}

	private native void n_onSupport ();

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
