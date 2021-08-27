package mono.com.zipow.videobox.view.video;


public class VideoView_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.video.VideoView.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_beforeGLContextDestroyed:()V:GetBeforeGLContextDestroyedHandler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_beforeSurfaceDestroyed:()V:GetBeforeSurfaceDestroyedHandler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoViewDetachedFromWindow:()V:GetOnVideoViewDetachedFromWindowHandler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoViewDoubleTap:(Landroid/view/MotionEvent;)V:GetOnVideoViewDoubleTap_Landroid_view_MotionEvent_Handler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoViewDown:(Landroid/view/MotionEvent;)V:GetOnVideoViewDown_Landroid_view_MotionEvent_Handler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoViewFling:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V:GetOnVideoViewFling_Landroid_view_MotionEvent_Landroid_view_MotionEvent_FFHandler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoViewHoverEvent:(Landroid/view/MotionEvent;)Z:GetOnVideoViewHoverEvent_Landroid_view_MotionEvent_Handler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoViewScroll:(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V:GetOnVideoViewScroll_Landroid_view_MotionEvent_Landroid_view_MotionEvent_FFHandler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoViewSingleTapConfirmed:(Landroid/view/MotionEvent;)V:GetOnVideoViewSingleTapConfirmed_Landroid_view_MotionEvent_Handler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"n_onVideoViewTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnVideoViewTouchEvent_Landroid_view_MotionEvent_Handler:Com.Zipow.Videobox.View.Video.VideoView/IListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Video.VideoView+IListenerImplementor, MobileRTC_Droid", VideoView_ListenerImplementor.class, __md_methods);
	}


	public VideoView_ListenerImplementor ()
	{
		super ();
		if (getClass () == VideoView_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Video.VideoView+IListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void beforeGLContextDestroyed ()
	{
		n_beforeGLContextDestroyed ();
	}

	private native void n_beforeGLContextDestroyed ();


	public void beforeSurfaceDestroyed ()
	{
		n_beforeSurfaceDestroyed ();
	}

	private native void n_beforeSurfaceDestroyed ();


	public void onVideoViewDetachedFromWindow ()
	{
		n_onVideoViewDetachedFromWindow ();
	}

	private native void n_onVideoViewDetachedFromWindow ();


	public void onVideoViewDoubleTap (android.view.MotionEvent p0)
	{
		n_onVideoViewDoubleTap (p0);
	}

	private native void n_onVideoViewDoubleTap (android.view.MotionEvent p0);


	public void onVideoViewDown (android.view.MotionEvent p0)
	{
		n_onVideoViewDown (p0);
	}

	private native void n_onVideoViewDown (android.view.MotionEvent p0);


	public void onVideoViewFling (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3)
	{
		n_onVideoViewFling (p0, p1, p2, p3);
	}

	private native void n_onVideoViewFling (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);


	public boolean onVideoViewHoverEvent (android.view.MotionEvent p0)
	{
		return n_onVideoViewHoverEvent (p0);
	}

	private native boolean n_onVideoViewHoverEvent (android.view.MotionEvent p0);


	public void onVideoViewScroll (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3)
	{
		n_onVideoViewScroll (p0, p1, p2, p3);
	}

	private native void n_onVideoViewScroll (android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);


	public void onVideoViewSingleTapConfirmed (android.view.MotionEvent p0)
	{
		n_onVideoViewSingleTapConfirmed (p0);
	}

	private native void n_onVideoViewSingleTapConfirmed (android.view.MotionEvent p0);


	public boolean onVideoViewTouchEvent (android.view.MotionEvent p0)
	{
		return n_onVideoViewTouchEvent (p0);
	}

	private native boolean n_onVideoViewTouchEvent (android.view.MotionEvent p0);

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
