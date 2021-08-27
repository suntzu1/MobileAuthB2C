package mono.com.zipow.videobox.view;


public class ConfToolsPanel_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.ConfToolsPanel.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onToolbarVisibilityChanged:(Z)V:GetOnToolbarVisibilityChanged_ZHandler:Com.Zipow.Videobox.View.ConfToolsPanel/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.ConfToolsPanel+IListenerImplementor, MobileRTC_Droid", ConfToolsPanel_ListenerImplementor.class, __md_methods);
	}


	public ConfToolsPanel_ListenerImplementor ()
	{
		super ();
		if (getClass () == ConfToolsPanel_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.ConfToolsPanel+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onToolbarVisibilityChanged (boolean p0)
	{
		n_onToolbarVisibilityChanged (p0);
	}

	private native void n_onToolbarVisibilityChanged (boolean p0);

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
