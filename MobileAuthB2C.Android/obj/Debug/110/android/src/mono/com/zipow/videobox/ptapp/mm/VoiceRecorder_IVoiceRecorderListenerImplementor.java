package mono.com.zipow.videobox.ptapp.mm;


public class VoiceRecorder_IVoiceRecorderListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.ptapp.mm.VoiceRecorder.IVoiceRecorderListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onError:(II)V:GetOnError_IIHandler:Com.Zipow.Videobox.Ptapp.MM.VoiceRecorder/IVoiceRecorderListenerInvoker, MobileRTC_Droid\n" +
			"n_onInfo:(II)V:GetOnInfo_IIHandler:Com.Zipow.Videobox.Ptapp.MM.VoiceRecorder/IVoiceRecorderListenerInvoker, MobileRTC_Droid\n" +
			"n_onRecordEnd:()V:GetOnRecordEndHandler:Com.Zipow.Videobox.Ptapp.MM.VoiceRecorder/IVoiceRecorderListenerInvoker, MobileRTC_Droid\n" +
			"n_onTimeUpdate:(J)V:GetOnTimeUpdate_JHandler:Com.Zipow.Videobox.Ptapp.MM.VoiceRecorder/IVoiceRecorderListenerInvoker, MobileRTC_Droid\n" +
			"n_onVolumeUpdate:(F)V:GetOnVolumeUpdate_FHandler:Com.Zipow.Videobox.Ptapp.MM.VoiceRecorder/IVoiceRecorderListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Ptapp.MM.VoiceRecorder+IVoiceRecorderListenerImplementor, MobileRTC_Droid", VoiceRecorder_IVoiceRecorderListenerImplementor.class, __md_methods);
	}


	public VoiceRecorder_IVoiceRecorderListenerImplementor ()
	{
		super ();
		if (getClass () == VoiceRecorder_IVoiceRecorderListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Ptapp.MM.VoiceRecorder+IVoiceRecorderListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onError (int p0, int p1)
	{
		n_onError (p0, p1);
	}

	private native void n_onError (int p0, int p1);


	public void onInfo (int p0, int p1)
	{
		n_onInfo (p0, p1);
	}

	private native void n_onInfo (int p0, int p1);


	public void onRecordEnd ()
	{
		n_onRecordEnd ();
	}

	private native void n_onRecordEnd ();


	public void onTimeUpdate (long p0)
	{
		n_onTimeUpdate (p0);
	}

	private native void n_onTimeUpdate (long p0);


	public void onVolumeUpdate (float p0)
	{
		n_onVolumeUpdate (p0);
	}

	private native void n_onVolumeUpdate (float p0);

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
