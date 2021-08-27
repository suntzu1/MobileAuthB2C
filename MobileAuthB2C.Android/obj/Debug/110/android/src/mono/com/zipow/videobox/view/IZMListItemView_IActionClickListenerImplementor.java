package mono.com.zipow.videobox.view;


public class IZMListItemView_IActionClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.IZMListItemView.IActionClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAction:(Ljava/lang/String;I)V:GetOnAction_Ljava_lang_String_IHandler:Com.Zipow.Videobox.View.IZMListItemViewActionClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.IZMListItemViewActionClickListenerImplementor, MobileRTC_Droid", IZMListItemView_IActionClickListenerImplementor.class, __md_methods);
	}


	public IZMListItemView_IActionClickListenerImplementor ()
	{
		super ();
		if (getClass () == IZMListItemView_IActionClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.IZMListItemViewActionClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onAction (java.lang.String p0, int p1)
	{
		n_onAction (p0, p1);
	}

	private native void n_onAction (java.lang.String p0, int p1);

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
