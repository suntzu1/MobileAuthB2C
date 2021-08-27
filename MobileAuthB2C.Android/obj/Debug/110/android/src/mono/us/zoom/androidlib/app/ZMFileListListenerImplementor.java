package mono.us.zoom.androidlib.app;


public class ZMFileListListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.app.ZMFileListListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onOpenDirFailed:(Ljava/lang/String;)V:GetOnOpenDirFailed_Ljava_lang_String_Handler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onOpenFileFailed:(Ljava/lang/String;)V:GetOnOpenFileFailed_Ljava_lang_String_Handler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onReLogin:()V:GetOnReLoginHandler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onRefresh:()V:GetOnRefreshHandler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onSelectedFile:(Ljava/lang/String;Ljava/lang/String;)V:GetOnSelectedFile_Ljava_lang_String_Ljava_lang_String_Handler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onSharedFileLink:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V:GetOnSharedFileLink_Ljava_lang_String_Ljava_lang_String_Ljava_lang_String_JIHandler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onStarted:(ZLjava/lang/String;)V:GetOnStarted_ZLjava_lang_String_Handler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onStarting:()V:GetOnStartingHandler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onUpdateWaitingMessage:(Ljava/lang/String;)V:GetOnUpdateWaitingMessage_Ljava_lang_String_Handler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onWaitingEnd:()V:GetOnWaitingEndHandler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"n_onWaitingStart:(Ljava/lang/String;)V:GetOnWaitingStart_Ljava_lang_String_Handler:US.Zoom.Androidlib.App.IZMFileListListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.App.IZMFileListListenerImplementor, CommonLib", ZMFileListListenerImplementor.class, __md_methods);
	}


	public ZMFileListListenerImplementor ()
	{
		super ();
		if (getClass () == ZMFileListListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.App.IZMFileListListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onOpenDirFailed (java.lang.String p0)
	{
		n_onOpenDirFailed (p0);
	}

	private native void n_onOpenDirFailed (java.lang.String p0);


	public void onOpenFileFailed (java.lang.String p0)
	{
		n_onOpenFileFailed (p0);
	}

	private native void n_onOpenFileFailed (java.lang.String p0);


	public void onReLogin ()
	{
		n_onReLogin ();
	}

	private native void n_onReLogin ();


	public void onRefresh ()
	{
		n_onRefresh ();
	}

	private native void n_onRefresh ();


	public void onSelectedFile (java.lang.String p0, java.lang.String p1)
	{
		n_onSelectedFile (p0, p1);
	}

	private native void n_onSelectedFile (java.lang.String p0, java.lang.String p1);


	public void onSharedFileLink (java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, int p4)
	{
		n_onSharedFileLink (p0, p1, p2, p3, p4);
	}

	private native void n_onSharedFileLink (java.lang.String p0, java.lang.String p1, java.lang.String p2, long p3, int p4);


	public void onStarted (boolean p0, java.lang.String p1)
	{
		n_onStarted (p0, p1);
	}

	private native void n_onStarted (boolean p0, java.lang.String p1);


	public void onStarting ()
	{
		n_onStarting ();
	}

	private native void n_onStarting ();


	public void onUpdateWaitingMessage (java.lang.String p0)
	{
		n_onUpdateWaitingMessage (p0);
	}

	private native void n_onUpdateWaitingMessage (java.lang.String p0);


	public void onWaitingEnd ()
	{
		n_onWaitingEnd ();
	}

	private native void n_onWaitingEnd ();


	public void onWaitingStart (java.lang.String p0)
	{
		n_onWaitingStart (p0);
	}

	private native void n_onWaitingStart (java.lang.String p0);

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
