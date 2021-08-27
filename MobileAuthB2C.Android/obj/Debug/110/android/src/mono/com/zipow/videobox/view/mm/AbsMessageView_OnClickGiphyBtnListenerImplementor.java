package mono.com.zipow.videobox.view.mm;


public class AbsMessageView_OnClickGiphyBtnListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.AbsMessageView.OnClickGiphyBtnListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickGiphyBtn:(Lcom/zipow/videobox/view/mm/MMMessageItem;Landroid/view/View;)V:GetOnClickGiphyBtn_Lcom_zipow_videobox_view_mm_MMMessageItem_Landroid_view_View_Handler:Com.Zipow.Videobox.View.MM.AbsMessageView/IOnClickGiphyBtnListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickGiphyBtnListenerImplementor, MobileRTC_Droid", AbsMessageView_OnClickGiphyBtnListenerImplementor.class, __md_methods);
	}


	public AbsMessageView_OnClickGiphyBtnListenerImplementor ()
	{
		super ();
		if (getClass () == AbsMessageView_OnClickGiphyBtnListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.AbsMessageView+IOnClickGiphyBtnListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickGiphyBtn (com.zipow.videobox.view.mm.MMMessageItem p0, android.view.View p1)
	{
		n_onClickGiphyBtn (p0, p1);
	}

	private native void n_onClickGiphyBtn (com.zipow.videobox.view.mm.MMMessageItem p0, android.view.View p1);

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
