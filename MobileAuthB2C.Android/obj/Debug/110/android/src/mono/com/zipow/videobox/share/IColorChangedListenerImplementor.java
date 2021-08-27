package mono.com.zipow.videobox.share;


public class IColorChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.share.IColorChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onColorPicked:(I)V:GetOnColorPicked_IHandler:Com.Zipow.Videobox.Share.IColorChangedListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Share.IColorChangedListenerImplementor, MobileRTC_Droid", IColorChangedListenerImplementor.class, __md_methods);
	}


	public IColorChangedListenerImplementor ()
	{
		super ();
		if (getClass () == IColorChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Share.IColorChangedListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onColorPicked (int p0)
	{
		n_onColorPicked (p0);
	}

	private native void n_onColorPicked (int p0);

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
