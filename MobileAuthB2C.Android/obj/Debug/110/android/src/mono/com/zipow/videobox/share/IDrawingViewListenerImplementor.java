package mono.com.zipow.videobox.share;


public class IDrawingViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.share.IDrawingViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAnnoWidthChanged:(I)V:GetOnAnnoWidthChanged_IHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onBeginEditing:(II)V:GetOnBeginEditing_IIHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onBitmapChanged:(Landroid/graphics/Canvas;)V:GetOnBitmapChanged_Landroid_graphics_Canvas_Handler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onClearClicked:(Lcom/zipow/annotate/AnnotateDrawingView$AnnoClearType;)V:GetOnClearClicked_Lcom_zipow_annotate_AnnotateDrawingView_AnnoClearType_Handler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onDismissAllTip:()V:GetOnDismissAllTipHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onEndEditing:()V:GetOnEndEditingHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onLongPressed:(Z)V:GetOnLongPressed_ZHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onNewPageClicked:()V:GetOnNewPageClickedHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onPageManagementClicked:()V:GetOnPageManagementClickedHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onRepaint:()V:GetOnRepaintHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onSavePageSnapshot:(I)V:GetOnSavePageSnapshot_IHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onSaveWbClicked:()V:GetOnSaveWbClickedHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onShapeRecognitionChecked:(Z)V:GetOnShapeRecognitionChecked_ZHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onShowAnnoTip:(Lcom/zipow/annotate/AnnotateDrawingView$AnnoTipType;I)V:GetOnShowAnnoTip_Lcom_zipow_annotate_AnnotateDrawingView_AnnoTipType_IHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"n_setAnnoWindow:(IIFFF)V:GetSetAnnoWindow_IIFFFHandler:Com.Zipow.Videobox.Share.IDrawingViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Share.IDrawingViewListenerImplementor, MobileRTC_Droid", IDrawingViewListenerImplementor.class, __md_methods);
	}


	public IDrawingViewListenerImplementor ()
	{
		super ();
		if (getClass () == IDrawingViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Share.IDrawingViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onAnnoWidthChanged (int p0)
	{
		n_onAnnoWidthChanged (p0);
	}

	private native void n_onAnnoWidthChanged (int p0);


	public void onBeginEditing (int p0, int p1)
	{
		n_onBeginEditing (p0, p1);
	}

	private native void n_onBeginEditing (int p0, int p1);


	public void onBitmapChanged (android.graphics.Canvas p0)
	{
		n_onBitmapChanged (p0);
	}

	private native void n_onBitmapChanged (android.graphics.Canvas p0);


	public void onClearClicked (com.zipow.annotate.AnnotateDrawingView.AnnoClearType p0)
	{
		n_onClearClicked (p0);
	}

	private native void n_onClearClicked (com.zipow.annotate.AnnotateDrawingView.AnnoClearType p0);


	public void onDismissAllTip ()
	{
		n_onDismissAllTip ();
	}

	private native void n_onDismissAllTip ();


	public void onEndEditing ()
	{
		n_onEndEditing ();
	}

	private native void n_onEndEditing ();


	public void onLongPressed (boolean p0)
	{
		n_onLongPressed (p0);
	}

	private native void n_onLongPressed (boolean p0);


	public void onNewPageClicked ()
	{
		n_onNewPageClicked ();
	}

	private native void n_onNewPageClicked ();


	public void onPageManagementClicked ()
	{
		n_onPageManagementClicked ();
	}

	private native void n_onPageManagementClicked ();


	public void onRepaint ()
	{
		n_onRepaint ();
	}

	private native void n_onRepaint ();


	public void onSavePageSnapshot (int p0)
	{
		n_onSavePageSnapshot (p0);
	}

	private native void n_onSavePageSnapshot (int p0);


	public void onSaveWbClicked ()
	{
		n_onSaveWbClicked ();
	}

	private native void n_onSaveWbClicked ();


	public void onShapeRecognitionChecked (boolean p0)
	{
		n_onShapeRecognitionChecked (p0);
	}

	private native void n_onShapeRecognitionChecked (boolean p0);


	public void onShowAnnoTip (com.zipow.annotate.AnnotateDrawingView.AnnoTipType p0, int p1)
	{
		n_onShowAnnoTip (p0, p1);
	}

	private native void n_onShowAnnoTip (com.zipow.annotate.AnnotateDrawingView.AnnoTipType p0, int p1);


	public void setAnnoWindow (int p0, int p1, float p2, float p3, float p4)
	{
		n_setAnnoWindow (p0, p1, p2, p3, p4);
	}

	private native void n_setAnnoWindow (int p0, int p1, float p2, float p3, float p4);

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
