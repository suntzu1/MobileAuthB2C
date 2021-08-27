package mono.com.zipow.videobox.view.mm;


public class MMZoomFileView_OnShowAllShareActionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.MMZoomFileView.OnShowAllShareActionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onShowAllShareAction:(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V:GetOnShowAllShareAction_Ljava_lang_String_Ljava_util_ArrayList_Ljava_util_ArrayList_Handler:Com.Zipow.Videobox.View.MM.MMZoomFileView/IOnShowAllShareActionListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.MMZoomFileView+IOnShowAllShareActionListenerImplementor, MobileRTC_Droid", MMZoomFileView_OnShowAllShareActionListenerImplementor.class, __md_methods);
	}


	public MMZoomFileView_OnShowAllShareActionListenerImplementor ()
	{
		super ();
		if (getClass () == MMZoomFileView_OnShowAllShareActionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.MMZoomFileView+IOnShowAllShareActionListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onShowAllShareAction (java.lang.String p0, java.util.ArrayList p1, java.util.ArrayList p2)
	{
		n_onShowAllShareAction (p0, p1, p2);
	}

	private native void n_onShowAllShareAction (java.lang.String p0, java.util.ArrayList p1, java.util.ArrayList p2);

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
