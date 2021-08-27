package mono.com.zipow.videobox.view;


public class ZMPMIMeetingOptionLayout_PMIEditMeetingListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.ZMPMIMeetingOptionLayout.PMIEditMeetingListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onJBHChange:()V:GetOnJBHChangeHandler:Com.Zipow.Videobox.View.ZMPMIMeetingOptionLayout/IPMIEditMeetingListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.ZMPMIMeetingOptionLayout+IPMIEditMeetingListenerImplementor, MobileRTC_Droid", ZMPMIMeetingOptionLayout_PMIEditMeetingListenerImplementor.class, __md_methods);
	}


	public ZMPMIMeetingOptionLayout_PMIEditMeetingListenerImplementor ()
	{
		super ();
		if (getClass () == ZMPMIMeetingOptionLayout_PMIEditMeetingListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.ZMPMIMeetingOptionLayout+IPMIEditMeetingListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onJBHChange ()
	{
		n_onJBHChange ();
	}

	private native void n_onJBHChange ();

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
