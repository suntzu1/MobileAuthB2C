package mono.com.zipow.videobox.view.mm;


public class VoiceRecordView_OnVoiceRecordListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.view.mm.VoiceRecordView.OnVoiceRecordListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onRecordEnd:(Ljava/lang/String;J)V:GetOnRecordEnd_Ljava_lang_String_JHandler:Com.Zipow.Videobox.View.MM.VoiceRecordView/IOnVoiceRecordListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.View.MM.VoiceRecordView+IOnVoiceRecordListenerImplementor, MobileRTC_Droid", VoiceRecordView_OnVoiceRecordListenerImplementor.class, __md_methods);
	}


	public VoiceRecordView_OnVoiceRecordListenerImplementor ()
	{
		super ();
		if (getClass () == VoiceRecordView_OnVoiceRecordListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.View.MM.VoiceRecordView+IOnVoiceRecordListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onRecordEnd (java.lang.String p0, long p1)
	{
		n_onRecordEnd (p0, p1);
	}

	private native void n_onRecordEnd (java.lang.String p0, long p1);

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
