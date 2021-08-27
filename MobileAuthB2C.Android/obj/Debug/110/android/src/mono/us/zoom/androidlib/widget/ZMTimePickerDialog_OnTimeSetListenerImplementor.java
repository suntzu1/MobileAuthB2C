package mono.us.zoom.androidlib.widget;


public class ZMTimePickerDialog_OnTimeSetListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.ZMTimePickerDialog.OnTimeSetListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTimeSet:(Landroid/widget/TimePicker;II)V:GetOnTimeSet_Landroid_widget_TimePicker_IIHandler:US.Zoom.Androidlib.Widget.ZMTimePickerDialog/IOnTimeSetListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.ZMTimePickerDialog+IOnTimeSetListenerImplementor, CommonLib", ZMTimePickerDialog_OnTimeSetListenerImplementor.class, __md_methods);
	}


	public ZMTimePickerDialog_OnTimeSetListenerImplementor ()
	{
		super ();
		if (getClass () == ZMTimePickerDialog_OnTimeSetListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.ZMTimePickerDialog+IOnTimeSetListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onTimeSet (android.widget.TimePicker p0, int p1, int p2)
	{
		n_onTimeSet (p0, p1, p2);
	}

	private native void n_onTimeSet (android.widget.TimePicker p0, int p1, int p2);

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
