package mono.com.zipow.videobox.view.mm;


public class ReactionEmojiSampleView_OnReactionEmojiSampleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.ReactionEmojiSampleView.OnReactionEmojiSampleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onMoreEmojiClick:(Lcom/zipow/videobox/view/mm/MMMessageItem;)V:GetOnMoreEmojiClick_Lcom_zipow_videobox_view_mm_MMMessageItem_Handler:Com.Zipow.Videobox.View.MM.ReactionEmojiSampleView/IOnReactionEmojiSampleListenerInvoker, MobileRTC_Droid\n" +
			"n_onReactionEmojiClick:(Landroid/view/View;ILjava/lang/CharSequence;Ljava/lang/Object;)V:GetOnReactionEmojiClick_Landroid_view_View_ILjava_lang_CharSequence_Ljava_lang_Object_Handler:Com.Zipow.Videobox.View.MM.ReactionEmojiSampleView/IOnReactionEmojiSampleListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.ReactionEmojiSampleView+IOnReactionEmojiSampleListenerImplementor, MobileRTC_Droid", ReactionEmojiSampleView_OnReactionEmojiSampleListenerImplementor.class, __md_methods);
	}


	public ReactionEmojiSampleView_OnReactionEmojiSampleListenerImplementor ()
	{
		super ();
		if (getClass () == ReactionEmojiSampleView_OnReactionEmojiSampleListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.ReactionEmojiSampleView+IOnReactionEmojiSampleListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onMoreEmojiClick (com.zipow.videobox.view.mm.MMMessageItem p0)
	{
		n_onMoreEmojiClick (p0);
	}

	private native void n_onMoreEmojiClick (com.zipow.videobox.view.mm.MMMessageItem p0);


	public void onReactionEmojiClick (android.view.View p0, int p1, java.lang.CharSequence p2, java.lang.Object p3)
	{
		n_onReactionEmojiClick (p0, p1, p2, p3);
	}

	private native void n_onReactionEmojiClick (android.view.View p0, int p1, java.lang.CharSequence p2, java.lang.Object p3);

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
