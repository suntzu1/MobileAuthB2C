package mono.com.zipow.videobox.view.mm.sticker;


public class StickerInputView_OnGiphyPreviewBackClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.sticker.StickerInputView.OnGiphyPreviewBackClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGiphyPreviewBack:()V:GetOnGiphyPreviewBackHandler:Com.Zipow.Videobox.View.MM.Sticker.StickerInputView/IOnGiphyPreviewBackClickListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.Sticker.StickerInputView+IOnGiphyPreviewBackClickListenerImplementor, MobileRTC_Droid", StickerInputView_OnGiphyPreviewBackClickListenerImplementor.class, __md_methods);
	}


	public StickerInputView_OnGiphyPreviewBackClickListenerImplementor ()
	{
		super ();
		if (getClass () == StickerInputView_OnGiphyPreviewBackClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.Sticker.StickerInputView+IOnGiphyPreviewBackClickListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onGiphyPreviewBack ()
	{
		n_onGiphyPreviewBack ();
	}

	private native void n_onGiphyPreviewBack ();

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
