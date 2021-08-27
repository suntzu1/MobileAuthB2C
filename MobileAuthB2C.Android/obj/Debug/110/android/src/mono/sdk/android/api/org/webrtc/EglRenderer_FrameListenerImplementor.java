package mono.sdk.android.api.org.webrtc;


public class EglRenderer_FrameListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		sdk.android.api.org.webrtc.EglRenderer.FrameListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFrame:(Landroid/graphics/Bitmap;)V:GetOnFrame_Landroid_graphics_Bitmap_Handler:Sdk.Android.Api.Org.Webrtc.EglRenderer/IFrameListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Sdk.Android.Api.Org.Webrtc.EglRenderer+IFrameListenerImplementor, MobileRTC_Droid", EglRenderer_FrameListenerImplementor.class, __md_methods);
	}


	public EglRenderer_FrameListenerImplementor ()
	{
		super ();
		if (getClass () == EglRenderer_FrameListenerImplementor.class)
			mono.android.TypeManager.Activate ("Sdk.Android.Api.Org.Webrtc.EglRenderer+IFrameListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onFrame (android.graphics.Bitmap p0)
	{
		n_onFrame (p0);
	}

	private native void n_onFrame (android.graphics.Bitmap p0);

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
