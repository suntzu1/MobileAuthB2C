package mono.us.zoom.internal;


public class RTCVideoRawDataDelegate_RTCVideoRawDataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.internal.RTCVideoRawDataDelegate.RTCVideoRawDataListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onShareRawDataReceived:(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;ZIIIJ)V:GetOnShareRawDataReceived_Ljava_nio_ByteBuffer_Ljava_nio_ByteBuffer_Ljava_nio_ByteBuffer_ZIIIJHandler:US.Zoom.Internal.RTCVideoRawDataDelegate/IRTCVideoRawDataListenerInvoker, MobileRTC_Droid\n" +
			"n_onSubscribedShareUserDataOff:()V:GetOnSubscribedShareUserDataOffHandler:US.Zoom.Internal.RTCVideoRawDataDelegate/IRTCVideoRawDataListenerInvoker, MobileRTC_Droid\n" +
			"n_onSubscribedShareUserDataOn:()V:GetOnSubscribedShareUserDataOnHandler:US.Zoom.Internal.RTCVideoRawDataDelegate/IRTCVideoRawDataListenerInvoker, MobileRTC_Droid\n" +
			"n_onSubscribedShareUserLeft:()V:GetOnSubscribedShareUserLeftHandler:US.Zoom.Internal.RTCVideoRawDataDelegate/IRTCVideoRawDataListenerInvoker, MobileRTC_Droid\n" +
			"n_onSubscribedVideoUserDataOff:()V:GetOnSubscribedVideoUserDataOffHandler:US.Zoom.Internal.RTCVideoRawDataDelegate/IRTCVideoRawDataListenerInvoker, MobileRTC_Droid\n" +
			"n_onSubscribedVideoUserDataOn:()V:GetOnSubscribedVideoUserDataOnHandler:US.Zoom.Internal.RTCVideoRawDataDelegate/IRTCVideoRawDataListenerInvoker, MobileRTC_Droid\n" +
			"n_onSubscribedVideoUserLeft:()V:GetOnSubscribedVideoUserLeftHandler:US.Zoom.Internal.RTCVideoRawDataDelegate/IRTCVideoRawDataListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoRawDataReceived:(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;ZIIIJ)V:GetOnVideoRawDataReceived_Ljava_nio_ByteBuffer_Ljava_nio_ByteBuffer_Ljava_nio_ByteBuffer_ZIIIJHandler:US.Zoom.Internal.RTCVideoRawDataDelegate/IRTCVideoRawDataListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Internal.RTCVideoRawDataDelegate+IRTCVideoRawDataListenerImplementor, MobileRTC_Droid", RTCVideoRawDataDelegate_RTCVideoRawDataListenerImplementor.class, __md_methods);
	}


	public RTCVideoRawDataDelegate_RTCVideoRawDataListenerImplementor ()
	{
		super ();
		if (getClass () == RTCVideoRawDataDelegate_RTCVideoRawDataListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Internal.RTCVideoRawDataDelegate+IRTCVideoRawDataListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onShareRawDataReceived (java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, java.nio.ByteBuffer p2, boolean p3, int p4, int p5, int p6, long p7)
	{
		n_onShareRawDataReceived (p0, p1, p2, p3, p4, p5, p6, p7);
	}

	private native void n_onShareRawDataReceived (java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, java.nio.ByteBuffer p2, boolean p3, int p4, int p5, int p6, long p7);


	public void onSubscribedShareUserDataOff ()
	{
		n_onSubscribedShareUserDataOff ();
	}

	private native void n_onSubscribedShareUserDataOff ();


	public void onSubscribedShareUserDataOn ()
	{
		n_onSubscribedShareUserDataOn ();
	}

	private native void n_onSubscribedShareUserDataOn ();


	public void onSubscribedShareUserLeft ()
	{
		n_onSubscribedShareUserLeft ();
	}

	private native void n_onSubscribedShareUserLeft ();


	public void onSubscribedVideoUserDataOff ()
	{
		n_onSubscribedVideoUserDataOff ();
	}

	private native void n_onSubscribedVideoUserDataOff ();


	public void onSubscribedVideoUserDataOn ()
	{
		n_onSubscribedVideoUserDataOn ();
	}

	private native void n_onSubscribedVideoUserDataOn ();


	public void onSubscribedVideoUserLeft ()
	{
		n_onSubscribedVideoUserLeft ();
	}

	private native void n_onSubscribedVideoUserLeft ();


	public void onVideoRawDataReceived (java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, java.nio.ByteBuffer p2, boolean p3, int p4, int p5, int p6, long p7)
	{
		n_onVideoRawDataReceived (p0, p1, p2, p3, p4, p5, p6, p7);
	}

	private native void n_onVideoRawDataReceived (java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, java.nio.ByteBuffer p2, boolean p3, int p4, int p5, int p6, long p7);

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
