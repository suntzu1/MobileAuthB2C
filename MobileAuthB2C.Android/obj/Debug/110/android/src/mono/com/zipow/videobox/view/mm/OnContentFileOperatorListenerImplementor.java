package mono.com.zipow.videobox.view.mm;


public class OnContentFileOperatorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.OnContentFileOperatorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onZoomFileCancelTransfer:(Ljava/lang/String;)V:GetOnZoomFileCancelTransfer_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.IOnContentFileOperatorListenerInvoker, MobileRTC_Droid\n" +
			"n_onZoomFileClick:(Ljava/lang/String;)V:GetOnZoomFileClick_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.IOnContentFileOperatorListenerInvoker, MobileRTC_Droid\n" +
			"n_onZoomFileClick:(Ljava/lang/String;Ljava/util/List;)V:GetOnZoomFileClick2_Ljava_lang_String_Ljava_util_List_Handler:Com.Zipow.Videobox.View.MM.IOnContentFileOperatorListenerInvoker, MobileRTC_Droid\n" +
			"n_onZoomFileIntegrationClick:(Ljava/lang/String;)V:GetOnZoomFileIntegrationClick_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.IOnContentFileOperatorListenerInvoker, MobileRTC_Droid\n" +
			"n_onZoomFileShared:(Ljava/lang/String;)V:GetOnZoomFileShared_Ljava_lang_String_Handler:Com.Zipow.Videobox.View.MM.IOnContentFileOperatorListenerInvoker, MobileRTC_Droid\n" +
			"n_onZoomFileSharerAction:(Ljava/lang/String;Lcom/zipow/videobox/view/mm/MMZoomShareAction;ZZ)V:GetOnZoomFileSharerAction_Ljava_lang_String_Lcom_zipow_videobox_view_mm_MMZoomShareAction_ZZHandler:Com.Zipow.Videobox.View.MM.IOnContentFileOperatorListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.IOnContentFileOperatorListenerImplementor, MobileRTC_Droid", OnContentFileOperatorListenerImplementor.class, __md_methods);
	}


	public OnContentFileOperatorListenerImplementor ()
	{
		super ();
		if (getClass () == OnContentFileOperatorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.IOnContentFileOperatorListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onZoomFileCancelTransfer (java.lang.String p0)
	{
		n_onZoomFileCancelTransfer (p0);
	}

	private native void n_onZoomFileCancelTransfer (java.lang.String p0);


	public void onZoomFileClick (java.lang.String p0)
	{
		n_onZoomFileClick (p0);
	}

	private native void n_onZoomFileClick (java.lang.String p0);


	public void onZoomFileClick (java.lang.String p0, java.util.List p1)
	{
		n_onZoomFileClick (p0, p1);
	}

	private native void n_onZoomFileClick (java.lang.String p0, java.util.List p1);


	public void onZoomFileIntegrationClick (java.lang.String p0)
	{
		n_onZoomFileIntegrationClick (p0);
	}

	private native void n_onZoomFileIntegrationClick (java.lang.String p0);


	public void onZoomFileShared (java.lang.String p0)
	{
		n_onZoomFileShared (p0);
	}

	private native void n_onZoomFileShared (java.lang.String p0);


	public void onZoomFileSharerAction (java.lang.String p0, com.zipow.videobox.view.mm.MMZoomShareAction p1, boolean p2, boolean p3)
	{
		n_onZoomFileSharerAction (p0, p1, p2, p3);
	}

	private native void n_onZoomFileSharerAction (java.lang.String p0, com.zipow.videobox.view.mm.MMZoomShareAction p1, boolean p2, boolean p3);

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
