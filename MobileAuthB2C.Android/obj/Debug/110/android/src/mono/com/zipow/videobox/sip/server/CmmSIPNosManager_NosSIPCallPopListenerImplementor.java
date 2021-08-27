package mono.com.zipow.videobox.sip.server;


public class CmmSIPNosManager_NosSIPCallPopListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.sip.server.CmmSIPNosManager.NosSIPCallPopListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_cancel:(Ljava/lang/String;)V:GetCancel_Ljava_lang_String_Handler:Com.Zipow.Videobox.Sip.Server.CmmSIPNosManager/INosSIPCallPopListenerInvoker, MobileRTC_Droid\n" +
			"n_forceFinish:()V:GetForceFinishHandler:Com.Zipow.Videobox.Sip.Server.CmmSIPNosManager/INosSIPCallPopListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Sip.Server.CmmSIPNosManager+INosSIPCallPopListenerImplementor, MobileRTC_Droid", CmmSIPNosManager_NosSIPCallPopListenerImplementor.class, __md_methods);
	}


	public CmmSIPNosManager_NosSIPCallPopListenerImplementor ()
	{
		super ();
		if (getClass () == CmmSIPNosManager_NosSIPCallPopListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Sip.Server.CmmSIPNosManager+INosSIPCallPopListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void cancel (java.lang.String p0)
	{
		n_cancel (p0);
	}

	private native void n_cancel (java.lang.String p0);


	public void forceFinish ()
	{
		n_forceFinish ();
	}

	private native void n_forceFinish ();

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
