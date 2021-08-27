package mono.com.zipow.videobox.pdf;


public class PDFViewPage_PDFViewPageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.pdf.PDFViewPage.PDFViewPageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickEvent:()V:GetOnClickEventHandler:Com.Zipow.Videobox.Pdf.PDFViewPage/IPDFViewPageListenerInvoker, MobileRTC_Droid\n" +
			"n_onLoaderPageErr:(I)V:GetOnLoaderPageErr_IHandler:Com.Zipow.Videobox.Pdf.PDFViewPage/IPDFViewPageListenerInvoker, MobileRTC_Droid\n" +
			"n_onPDFDisplayRefresh:()V:GetOnPDFDisplayRefreshHandler:Com.Zipow.Videobox.Pdf.PDFViewPage/IPDFViewPageListenerInvoker, MobileRTC_Droid\n" +
			"n_onRenderPageErr:(I)V:GetOnRenderPageErr_IHandler:Com.Zipow.Videobox.Pdf.PDFViewPage/IPDFViewPageListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Pdf.PDFViewPage+IPDFViewPageListenerImplementor, MobileRTC_Droid", PDFViewPage_PDFViewPageListenerImplementor.class, __md_methods);
	}


	public PDFViewPage_PDFViewPageListenerImplementor ()
	{
		super ();
		if (getClass () == PDFViewPage_PDFViewPageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Pdf.PDFViewPage+IPDFViewPageListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickEvent ()
	{
		n_onClickEvent ();
	}

	private native void n_onClickEvent ();


	public void onLoaderPageErr (int p0)
	{
		n_onLoaderPageErr (p0);
	}

	private native void n_onLoaderPageErr (int p0);


	public void onPDFDisplayRefresh ()
	{
		n_onPDFDisplayRefresh ();
	}

	private native void n_onPDFDisplayRefresh ();


	public void onRenderPageErr (int p0)
	{
		n_onRenderPageErr (p0);
	}

	private native void n_onRenderPageErr (int p0);

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
