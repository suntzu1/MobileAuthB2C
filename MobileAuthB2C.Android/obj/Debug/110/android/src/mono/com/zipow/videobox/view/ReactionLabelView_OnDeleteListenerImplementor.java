package mono.com.zipow.videobox.view;


public class ReactionLabelView_OnDeleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.ReactionLabelView.OnDeleteListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDeleted:(Landroid/view/View;)V:GetOnDeleted_Landroid_view_View_Handler:Com.Zipow.Videobox.View.ReactionLabelView/IOnDeleteListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.ReactionLabelView+IOnDeleteListenerImplementor, MobileRTC_Droid", ReactionLabelView_OnDeleteListenerImplementor.class, __md_methods);
	}


	public ReactionLabelView_OnDeleteListenerImplementor ()
	{
		super ();
		if (getClass () == ReactionLabelView_OnDeleteListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.ReactionLabelView+IOnDeleteListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onDeleted (android.view.View p0)
	{
		n_onDeleted (p0);
	}

	private native void n_onDeleted (android.view.View p0);

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
