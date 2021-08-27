package mono.com.zipow.videobox.view.sip;


public class AbstractSharedLineItem_OnItemClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.sip.AbstractSharedLineItem.OnItemClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:(Landroid/view/View;I)V:GetOnClick_Landroid_view_View_IHandler:Com.Zipow.Videobox.View.Sip.AbstractSharedLineItem/IOnItemClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Sip.AbstractSharedLineItem+IOnItemClickListenerImplementor, MobileRTC_Droid", AbstractSharedLineItem_OnItemClickListenerImplementor.class, __md_methods);
	}


	public AbstractSharedLineItem_OnItemClickListenerImplementor ()
	{
		super ();
		if (getClass () == AbstractSharedLineItem_OnItemClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Sip.AbstractSharedLineItem+IOnItemClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClick (android.view.View p0, int p1)
	{
		n_onClick (p0, p1);
	}

	private native void n_onClick (android.view.View p0, int p1);

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
