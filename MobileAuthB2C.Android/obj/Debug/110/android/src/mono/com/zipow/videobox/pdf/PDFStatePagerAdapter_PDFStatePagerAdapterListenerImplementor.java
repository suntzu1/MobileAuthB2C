package mono.com.zipow.videobox.pdf;


public class PDFStatePagerAdapter_PDFStatePagerAdapterListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.pdf.PDFStatePagerAdapter.PDFStatePagerAdapterListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadPageErr:(I)V:GetOnLoadPageErr_IHandler:Com.Zipow.Videobox.Pdf.PDFStatePagerAdapter/IPDFStatePagerAdapterListenerInvoker, MobileRTC_Droid\n" +
			"n_onRenderPageErr:(I)V:GetOnRenderPageErr_IHandler:Com.Zipow.Videobox.Pdf.PDFStatePagerAdapter/IPDFStatePagerAdapterListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Pdf.PDFStatePagerAdapter+IPDFStatePagerAdapterListenerImplementor, MobileRTC_Droid", PDFStatePagerAdapter_PDFStatePagerAdapterListenerImplementor.class, __md_methods);
	}


	public PDFStatePagerAdapter_PDFStatePagerAdapterListenerImplementor ()
	{
		super ();
		if (getClass () == PDFStatePagerAdapter_PDFStatePagerAdapterListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Pdf.PDFStatePagerAdapter+IPDFStatePagerAdapterListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onLoadPageErr (int p0)
	{
		n_onLoadPageErr (p0);
	}

	private native void n_onLoadPageErr (int p0);


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
