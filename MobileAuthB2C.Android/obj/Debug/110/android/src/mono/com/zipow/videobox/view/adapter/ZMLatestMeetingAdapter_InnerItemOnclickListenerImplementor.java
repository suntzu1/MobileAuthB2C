package mono.com.zipow.videobox.view.adapter;


public class ZMLatestMeetingAdapter_InnerItemOnclickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.adapter.ZMLatestMeetingAdapter.InnerItemOnclickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_itemClick:(Landroid/view/View;)V:GetItemClick_Landroid_view_View_Handler:Com.Zipow.Videobox.View.Adapter.ZMLatestMeetingAdapter/IInnerItemOnclickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.Adapter.ZMLatestMeetingAdapter+IInnerItemOnclickListenerImplementor, MobileRTC_Droid", ZMLatestMeetingAdapter_InnerItemOnclickListenerImplementor.class, __md_methods);
	}


	public ZMLatestMeetingAdapter_InnerItemOnclickListenerImplementor ()
	{
		super ();
		if (getClass () == ZMLatestMeetingAdapter_InnerItemOnclickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.Adapter.ZMLatestMeetingAdapter+IInnerItemOnclickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void itemClick (android.view.View p0)
	{
		n_itemClick (p0);
	}

	private native void n_itemClick (android.view.View p0);

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
