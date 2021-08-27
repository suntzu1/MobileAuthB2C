package mono.com.zipow.videobox.view.mm;


public class ReactionEmojiDialog_OnReactionEmojiListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.ReactionEmojiDialog.OnReactionEmojiListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReactionEmojiClick:(Landroid/view/View;ILjava/lang/CharSequence;Ljava/lang/Object;)V:GetOnReactionEmojiClick_Landroid_view_View_ILjava_lang_CharSequence_Ljava_lang_Object_Handler:Com.Zipow.Videobox.View.MM.ReactionEmojiDialog/IOnReactionEmojiListenerInvoker, MobileRTC_Droid\n" +
			"n_onReactionEmojiDialogShowed:(ZI)V:GetOnReactionEmojiDialogShowed_ZIHandler:Com.Zipow.Videobox.View.MM.ReactionEmojiDialog/IOnReactionEmojiListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.ReactionEmojiDialog+IOnReactionEmojiListenerImplementor, MobileRTC_Droid", ReactionEmojiDialog_OnReactionEmojiListenerImplementor.class, __md_methods);
	}


	public ReactionEmojiDialog_OnReactionEmojiListenerImplementor ()
	{
		super ();
		if (getClass () == ReactionEmojiDialog_OnReactionEmojiListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.ReactionEmojiDialog+IOnReactionEmojiListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onReactionEmojiClick (android.view.View p0, int p1, java.lang.CharSequence p2, java.lang.Object p3)
	{
		n_onReactionEmojiClick (p0, p1, p2, p3);
	}

	private native void n_onReactionEmojiClick (android.view.View p0, int p1, java.lang.CharSequence p2, java.lang.Object p3);


	public void onReactionEmojiDialogShowed (boolean p0, int p1)
	{
		n_onReactionEmojiDialogShowed (p0, p1);
	}

	private native void n_onReactionEmojiDialogShowed (boolean p0, int p1);

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
