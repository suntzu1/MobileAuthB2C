package mono.com.zipow.videobox.photopicker;


public class OnItemCheckStateChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.videobox.photopicker.OnItemCheckStateChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onItemCheckStateChanged:(ILcom/zipow/videobox/photopicker/entity/Photo;I)V:GetOnItemCheckStateChanged_ILcom_zipow_videobox_photopicker_entity_Photo_IHandler:Com.Zipow.Videobox.Photopicker.IOnItemCheckStateChangedListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Videobox.Photopicker.IOnItemCheckStateChangedListenerImplementor, MobileRTC_Droid", OnItemCheckStateChangedListenerImplementor.class, __md_methods);
	}


	public OnItemCheckStateChangedListenerImplementor ()
	{
		super ();
		if (getClass () == OnItemCheckStateChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Videobox.Photopicker.IOnItemCheckStateChangedListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onItemCheckStateChanged (int p0, com.zipow.videobox.photopicker.entity.Photo p1, int p2)
	{
		n_onItemCheckStateChanged (p0, p1, p2);
	}

	private native void n_onItemCheckStateChanged (int p0, com.zipow.videobox.photopicker.entity.Photo p1, int p2);

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
