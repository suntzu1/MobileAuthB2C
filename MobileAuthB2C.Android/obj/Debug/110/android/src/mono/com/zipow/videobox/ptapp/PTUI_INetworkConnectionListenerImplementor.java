package mono.com.zipow.videobox.ptapp;


public class PTUI_INetworkConnectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.ptapp.PTUI.INetworkConnectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProxySettingNotification:(Ljava/lang/String;I)V:GetOnProxySettingNotification_Ljava_lang_String_IHandler:Com.Zipow.Videobox.Ptapp.PTUI/INetworkConnectionListenerInvoker, MobileRTC_Droid\n" +
			"n_onSSLCertVerifyNotification:(Lcom/zipow/videobox/ptapp/VerifyCertEvent;)V:GetOnSSLCertVerifyNotification_Lcom_zipow_videobox_ptapp_VerifyCertEvent_Handler:Com.Zipow.Videobox.Ptapp.PTUI/INetworkConnectionListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Ptapp.PTUI+INetworkConnectionListenerImplementor, MobileRTC_Droid", PTUI_INetworkConnectionListenerImplementor.class, __md_methods);
	}


	public PTUI_INetworkConnectionListenerImplementor ()
	{
		super ();
		if (getClass () == PTUI_INetworkConnectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Ptapp.PTUI+INetworkConnectionListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onProxySettingNotification (java.lang.String p0, int p1)
	{
		n_onProxySettingNotification (p0, p1);
	}

	private native void n_onProxySettingNotification (java.lang.String p0, int p1);


	public void onSSLCertVerifyNotification (com.zipow.videobox.ptapp.VerifyCertEvent p0)
	{
		n_onSSLCertVerifyNotification (p0);
	}

	private native void n_onSSLCertVerifyNotification (com.zipow.videobox.ptapp.VerifyCertEvent p0);

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
