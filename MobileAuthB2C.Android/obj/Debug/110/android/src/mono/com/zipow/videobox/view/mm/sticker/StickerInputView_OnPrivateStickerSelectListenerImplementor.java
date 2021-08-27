package mono.com.zipow.videobox.view.mm.sticker;


public class StickerInputView_OnPrivateStickerSelectListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.sticker.StickerInputView.OnPrivateStickerSelectListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrivateStickerSelect:(Lcom/zipow/videobox/view/mm/sticker/StickerEvent;)V:GetOnPrivateStickerSelect_Lcom_zipow_videobox_view_mm_sticker_StickerEvent_Handler:Com.Zipow.Videobox.View.MM.Sticker.StickerInputView/IOnPrivateStickerSelectListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.Sticker.StickerInputView+IOnPrivateStickerSelectListenerImplementor, MobileRTC_Droid", StickerInputView_OnPrivateStickerSelectListenerImplementor.class, __md_methods);
	}


	public StickerInputView_OnPrivateStickerSelectListenerImplementor ()
	{
		super ();
		if (getClass () == StickerInputView_OnPrivateStickerSelectListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.Sticker.StickerInputView+IOnPrivateStickerSelectListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onPrivateStickerSelect (com.zipow.videobox.view.mm.sticker.StickerEvent p0)
	{
		n_onPrivateStickerSelect (p0);
	}

	private native void n_onPrivateStickerSelect (com.zipow.videobox.view.mm.sticker.StickerEvent p0);

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
