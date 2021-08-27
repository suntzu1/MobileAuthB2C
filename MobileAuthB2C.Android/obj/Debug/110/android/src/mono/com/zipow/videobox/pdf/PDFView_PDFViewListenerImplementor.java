package mono.com.zipow.videobox.pdf;


public class PDFView_PDFViewListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.pdf.PDFView.PDFViewListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPDFViewClicked:()V:GetOnPDFViewClickedHandler:Com.Zipow.Videobox.Pdf.PDFView/IPDFViewListenerInvoker, MobileRTC_Droid\n" +
			"n_onPDFViewPageChanged:()V:GetOnPDFViewPageChangedHandler:Com.Zipow.Videobox.Pdf.PDFView/IPDFViewListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Pdf.PDFView+IPDFViewListenerImplementor, MobileRTC_Droid", PDFView_PDFViewListenerImplementor.class, __md_methods);
	}


	public PDFView_PDFViewListenerImplementor ()
	{
		super ();
		if (getClass () == PDFView_PDFViewListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Pdf.PDFView+IPDFViewListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onPDFViewClicked ()
	{
		n_onPDFViewClicked ();
	}

	private native void n_onPDFViewClicked ();


	public void onPDFViewPageChanged ()
	{
		n_onPDFViewPageChanged ();
	}

	private native void n_onPDFViewPageChanged ();

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
