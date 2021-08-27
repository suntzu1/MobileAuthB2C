package mono.com.zipow.nydus;


public class USBMonitor_OnDeviceConnectListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.zipow.nydus.USBMonitor.OnDeviceConnectListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttach:(Landroid/hardware/usb/UsbDevice;)V:GetOnAttach_Landroid_hardware_usb_UsbDevice_Handler:Com.Zipow.Nydus.USBMonitor/IOnDeviceConnectListenerInvoker, MobileRTC_Droid\n" +
			"n_onConnect:(Landroid/hardware/usb/UsbDevice;Lcom/zipow/nydus/USBMonitor$UsbControlBlock;Z)Z:GetOnConnect_Landroid_hardware_usb_UsbDevice_Lcom_zipow_nydus_USBMonitor_UsbControlBlock_ZHandler:Com.Zipow.Nydus.USBMonitor/IOnDeviceConnectListenerInvoker, MobileRTC_Droid\n" +
			"n_onDettach:(Landroid/hardware/usb/UsbDevice;)V:GetOnDettach_Landroid_hardware_usb_UsbDevice_Handler:Com.Zipow.Nydus.USBMonitor/IOnDeviceConnectListenerInvoker, MobileRTC_Droid\n" +
			"n_onDisconnect:(Landroid/hardware/usb/UsbDevice;Lcom/zipow/nydus/USBMonitor$UsbControlBlock;)V:GetOnDisconnect_Landroid_hardware_usb_UsbDevice_Lcom_zipow_nydus_USBMonitor_UsbControlBlock_Handler:Com.Zipow.Nydus.USBMonitor/IOnDeviceConnectListenerInvoker, MobileRTC_Droid\n" +
			"";
		mono.android.Runtime.register ("Com.Zipow.Nydus.USBMonitor+IOnDeviceConnectListenerImplementor, MobileRTC_Droid", USBMonitor_OnDeviceConnectListenerImplementor.class, __md_methods);
	}


	public USBMonitor_OnDeviceConnectListenerImplementor ()
	{
		super ();
		if (getClass () == USBMonitor_OnDeviceConnectListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Zipow.Nydus.USBMonitor+IOnDeviceConnectListenerImplementor, MobileRTC_Droid", "", this, new java.lang.Object[] {  });
	}


	public void onAttach (android.hardware.usb.UsbDevice p0)
	{
		n_onAttach (p0);
	}

	private native void n_onAttach (android.hardware.usb.UsbDevice p0);


	public boolean onConnect (android.hardware.usb.UsbDevice p0, com.zipow.nydus.USBMonitor.UsbControlBlock p1, boolean p2)
	{
		return n_onConnect (p0, p1, p2);
	}

	private native boolean n_onConnect (android.hardware.usb.UsbDevice p0, com.zipow.nydus.USBMonitor.UsbControlBlock p1, boolean p2);


	public void onDettach (android.hardware.usb.UsbDevice p0)
	{
		n_onDettach (p0);
	}

	private native void n_onDettach (android.hardware.usb.UsbDevice p0);


	public void onDisconnect (android.hardware.usb.UsbDevice p0, com.zipow.nydus.USBMonitor.UsbControlBlock p1)
	{
		n_onDisconnect (p0, p1);
	}

	private native void n_onDisconnect (android.hardware.usb.UsbDevice p0, com.zipow.nydus.USBMonitor.UsbControlBlock p1);

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
