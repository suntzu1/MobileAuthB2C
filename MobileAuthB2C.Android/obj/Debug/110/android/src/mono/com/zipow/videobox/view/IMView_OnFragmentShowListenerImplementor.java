package mono.com.zipow.videobox.view;


public class IMView_OnFragmentShowListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.IMView.OnFragmentShowListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onShow:()V:GetOnShowHandler:Com.Zipow.Videobox.View.IMView/IOnFragmentShowListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.IMView+IOnFragmentShowListenerImplementor, MobileRTC_Droid", IMView_OnFragmentShowListenerImplementor.class, __md_methods);
	}


	public IMView_OnFragmentShowListenerImplementor ()
	{
		super ();
		if (getClass () == IMView_OnFragmentShowListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.IMView+IOnFragmentShowListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onShow ()
	{
		n_onShow ();
	}

	private native void n_onShow ();

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
