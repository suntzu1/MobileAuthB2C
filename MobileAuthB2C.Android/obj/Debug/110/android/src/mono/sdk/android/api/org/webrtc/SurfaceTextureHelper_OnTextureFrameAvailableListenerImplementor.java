package mono.sdk.android.api.org.webrtc;


public class SurfaceTextureHelper_OnTextureFrameAvailableListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		sdk.android.api.org.webrtc.SurfaceTextureHelper.OnTextureFrameAvailableListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTextureFrameAvailable:(I[FJ)V:GetOnTextureFrameAvailable_IarrayFJHandler:Sdk.Android.Api.Org.Webrtc.SurfaceTextureHelper/IOnTextureFrameAvailableListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Sdk.Android.Api.Org.Webrtc.SurfaceTextureHelper+IOnTextureFrameAvailableListenerImplementor, MobileRTC_Droid", SurfaceTextureHelper_OnTextureFrameAvailableListenerImplementor.class, __md_methods);
	}


	public SurfaceTextureHelper_OnTextureFrameAvailableListenerImplementor ()
	{
		super ();
		if (getClass () == SurfaceTextureHelper_OnTextureFrameAvailableListenerImplementor.class)
			mono.android.TypeManager.Activate ("Sdk.Android.Api.Org.Webrtc.SurfaceTextureHelper+IOnTextureFrameAvailableListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onTextureFrameAvailable (int p0, float[] p1, long p2)
	{
		n_onTextureFrameAvailable (p0, p1, p2);
	}

	private native void n_onTextureFrameAvailable (int p0, float[] p1, long p2);

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
