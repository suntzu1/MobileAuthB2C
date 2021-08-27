package mono.com.zipow.videobox.view.mm.sticker;


public class StickerInputView_OnStickerSelectListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.sticker.StickerInputView.OnStickerSelectListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStickerSelect:(Landroid/view/View;)V:GetOnStickerSelect_Landroid_view_View_Handler:Com.Zipow.Videobox.View.MM.Sticker.StickerInputView/IOnStickerSelectListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.Sticker.StickerInputView+IOnStickerSelectListenerImplementor, MobileRTC_Droid", StickerInputView_OnStickerSelectListenerImplementor.class, __md_methods);
	}


	public StickerInputView_OnStickerSelectListenerImplementor ()
	{
		super ();
		if (getClass () == StickerInputView_OnStickerSelectListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.Sticker.StickerInputView+IOnStickerSelectListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onStickerSelect (android.view.View p0)
	{
		n_onStickerSelect (p0);
	}

	private native void n_onStickerSelect (android.view.View p0);

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
