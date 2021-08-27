package mono.com.zipow.videobox.view;


public class IFeccListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.IFeccListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFeccClick:(II)V:GetOnFeccClick_IIHandler:Com.Zipow.Videobox.View.IFeccListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.IFeccListenerImplementor, MobileRTC_Droid", IFeccListenerImplementor.class, __md_methods);
	}


	public IFeccListenerImplementor ()
	{
		super ();
		if (getClass () == IFeccListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.IFeccListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onFeccClick (int p0, int p1)
	{
		n_onFeccClick (p0, p1);
	}

	private native void n_onFeccClick (int p0, int p1);

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
