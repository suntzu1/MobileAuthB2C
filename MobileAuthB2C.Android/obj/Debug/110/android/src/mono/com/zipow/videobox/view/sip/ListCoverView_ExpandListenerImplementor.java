package mono.com.zipow.videobox.view.sip;


public class ListCoverView_ExpandListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.sip.ListCoverView.ExpandListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCollapseEnd:()V:GetOnCollapseEndHandler:Com.Zipow.Videobox.View.Sip.ListCoverView/IExpandListenerInvoker, MobileRTC_Droid\n" +
			"n_onCollapseStart:()V:GetOnCollapseStartHandler:Com.Zipow.Videobox.View.Sip.ListCoverView/IExpandListenerInvoker, MobileRTC_Droid\n" +
			"n_onExpandStart:()V:GetOnExpandStartHandler:Com.Zipow.Videobox.View.Sip.ListCoverView/IExpandListenerInvoker, MobileRTC_Droid\n" +
			"n_onExpandend:()V:GetOnExpandendHandler:Com.Zipow.Videobox.View.Sip.ListCoverView/IExpandListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Sip.ListCoverView+IExpandListenerImplementor, MobileRTC_Droid", ListCoverView_ExpandListenerImplementor.class, __md_methods);
	}


	public ListCoverView_ExpandListenerImplementor ()
	{
		super ();
		if (getClass () == ListCoverView_ExpandListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Sip.ListCoverView+IExpandListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCollapseEnd ()
	{
		n_onCollapseEnd ();
	}

	private native void n_onCollapseEnd ();


	public void onCollapseStart ()
	{
		n_onCollapseStart ();
	}

	private native void n_onCollapseStart ();


	public void onExpandStart ()
	{
		n_onExpandStart ();
	}

	private native void n_onExpandStart ();


	public void onExpandend ()
	{
		n_onExpandend ();
	}

	private native void n_onExpandend ();

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
