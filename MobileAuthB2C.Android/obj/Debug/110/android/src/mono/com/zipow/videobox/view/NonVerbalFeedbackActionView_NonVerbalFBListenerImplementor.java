package mono.com.zipow.videobox.view;


public class NonVerbalFeedbackActionView_NonVerbalFBListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.NonVerbalFeedbackActionView.NonVerbalFBListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClearFeedback:()V:GetOnClearFeedbackHandler:Com.Zipow.Videobox.View.NonVerbalFeedbackActionView/INonVerbalFBListenerInvoker, MobileRTC_Droid\n" +
			"n_onSetFeedback:(I)V:GetOnSetFeedback_IHandler:Com.Zipow.Videobox.View.NonVerbalFeedbackActionView/INonVerbalFBListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.NonVerbalFeedbackActionView+INonVerbalFBListenerImplementor, MobileRTC_Droid", NonVerbalFeedbackActionView_NonVerbalFBListenerImplementor.class, __md_methods);
	}


	public NonVerbalFeedbackActionView_NonVerbalFBListenerImplementor ()
	{
		super ();
		if (getClass () == NonVerbalFeedbackActionView_NonVerbalFBListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.NonVerbalFeedbackActionView+INonVerbalFBListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClearFeedback ()
	{
		n_onClearFeedback ();
	}

	private native void n_onClearFeedback ();


	public void onSetFeedback (int p0)
	{
		n_onSetFeedback (p0);
	}

	private native void n_onSetFeedback (int p0);

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
