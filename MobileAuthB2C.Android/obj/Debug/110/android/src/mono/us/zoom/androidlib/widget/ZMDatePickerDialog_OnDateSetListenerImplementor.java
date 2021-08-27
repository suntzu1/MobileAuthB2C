package mono.us.zoom.androidlib.widget;


public class ZMDatePickerDialog_OnDateSetListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		us.zoom.androidlib.widget.ZMDatePickerDialog.OnDateSetListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDateSet:(Landroid/widget/DatePicker;III)V:GetOnDateSet_Landroid_widget_DatePicker_IIIHandler:US.Zoom.Androidlib.Widget.ZMDatePickerDialog/IOnDateSetListenerInvoker, CommonLib\n" +
			"";
		mono.android.Runtime.register ("US.Zoom.Androidlib.Widget.ZMDatePickerDialog+IOnDateSetListenerImplementor, CommonLib", ZMDatePickerDialog_OnDateSetListenerImplementor.class, __md_methods);
	}


	public ZMDatePickerDialog_OnDateSetListenerImplementor ()
	{
		super ();
		if (getClass () == ZMDatePickerDialog_OnDateSetListenerImplementor.class)
			mono.android.TypeManager.Activate ("US.Zoom.Androidlib.Widget.ZMDatePickerDialog+IOnDateSetListenerImplementor, CommonLib", "", this, new java.lang.Object[] {  });
	}


	public void onDateSet (android.widget.DatePicker p0, int p1, int p2, int p3)
	{
		n_onDateSet (p0, p1, p2, p3);
	}

	private native void n_onDateSet (android.widget.DatePicker p0, int p1, int p2, int p3);

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
