package mono.com.zipow.videobox.view.sip;


public class ZMSeekBar_OnProgressChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.sip.ZMSeekBar.OnProgressChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getProgressOnActionUp:(Lcom/zipow/videobox/view/sip/ZMSeekBar;IF)V:GetGetProgressOnActionUp_Lcom_zipow_videobox_view_sip_ZMSeekBar_IFHandler:Com.Zipow.Videobox.View.Sip.ZMSeekBar/IOnProgressChangedListenerInvoker, MobileRTC_Droid\n" +
			"n_onProgressChanged:(Lcom/zipow/videobox/view/sip/ZMSeekBar;IF)V:GetOnProgressChanged_Lcom_zipow_videobox_view_sip_ZMSeekBar_IFHandler:Com.Zipow.Videobox.View.Sip.ZMSeekBar/IOnProgressChangedListenerInvoker, MobileRTC_Droid\n" +
			"n_onProgressChangedWhenMoving:(Lcom/zipow/videobox/view/sip/ZMSeekBar;IF)V:GetOnProgressChangedWhenMoving_Lcom_zipow_videobox_view_sip_ZMSeekBar_IFHandler:Com.Zipow.Videobox.View.Sip.ZMSeekBar/IOnProgressChangedListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Sip.ZMSeekBar+IOnProgressChangedListenerImplementor, MobileRTC_Droid", ZMSeekBar_OnProgressChangedListenerImplementor.class, __md_methods);
	}


	public ZMSeekBar_OnProgressChangedListenerImplementor ()
	{
		super ();
		if (getClass () == ZMSeekBar_OnProgressChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Sip.ZMSeekBar+IOnProgressChangedListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void getProgressOnActionUp (com.zipow.videobox.view.sip.ZMSeekBar p0, int p1, float p2)
	{
		n_getProgressOnActionUp (p0, p1, p2);
	}

	private native void n_getProgressOnActionUp (com.zipow.videobox.view.sip.ZMSeekBar p0, int p1, float p2);


	public void onProgressChanged (com.zipow.videobox.view.sip.ZMSeekBar p0, int p1, float p2)
	{
		n_onProgressChanged (p0, p1, p2);
	}

	private native void n_onProgressChanged (com.zipow.videobox.view.sip.ZMSeekBar p0, int p1, float p2);


	public void onProgressChangedWhenMoving (com.zipow.videobox.view.sip.ZMSeekBar p0, int p1, float p2)
	{
		n_onProgressChangedWhenMoving (p0, p1, p2);
	}

	private native void n_onProgressChangedWhenMoving (com.zipow.videobox.view.sip.ZMSeekBar p0, int p1, float p2);

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
