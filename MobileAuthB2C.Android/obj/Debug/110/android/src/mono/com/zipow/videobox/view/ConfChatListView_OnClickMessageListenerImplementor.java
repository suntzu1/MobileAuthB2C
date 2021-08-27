package mono.com.zipow.videobox.view;


public class ConfChatListView_OnClickMessageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.ConfChatListView.OnClickMessageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClickMessage:(Lcom/zipow/videobox/view/ConfChatItem;)V:GetOnClickMessage_Lcom_zipow_videobox_view_ConfChatItem_Handler:Com.Zipow.Videobox.View.ConfChatListView/IOnClickMessageListenerInvoker, MobileRTC_Droid\n" +
			"n_onLongClickMessage:(Lcom/zipow/videobox/view/ConfChatItem;)V:GetOnLongClickMessage_Lcom_zipow_videobox_view_ConfChatItem_Handler:Com.Zipow.Videobox.View.ConfChatListView/IOnClickMessageListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.ConfChatListView+IOnClickMessageListenerImplementor, MobileRTC_Droid", ConfChatListView_OnClickMessageListenerImplementor.class, __md_methods);
	}


	public ConfChatListView_OnClickMessageListenerImplementor ()
	{
		super ();
		if (getClass () == ConfChatListView_OnClickMessageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.ConfChatListView+IOnClickMessageListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onClickMessage (com.zipow.videobox.view.ConfChatItem p0)
	{
		n_onClickMessage (p0);
	}

	private native void n_onClickMessage (com.zipow.videobox.view.ConfChatItem p0);


	public void onLongClickMessage (com.zipow.videobox.view.ConfChatItem p0)
	{
		n_onLongClickMessage (p0);
	}

	private native void n_onLongClickMessage (com.zipow.videobox.view.ConfChatItem p0);

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
