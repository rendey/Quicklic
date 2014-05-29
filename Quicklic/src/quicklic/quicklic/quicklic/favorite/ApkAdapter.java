package quicklic.quicklic.quicklic.favorite;

import java.util.List;

import quicklic.floating.api.R;
import quicklic.quicklic.util.ViewHolder;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ApkAdapter extends BaseAdapter
{
	private Context context;
	private LayoutInflater inflater;
	private int layout;
	private List<PackageInfo> packageList;
	private PackageManager packageManager;

	public ApkAdapter(Context context, int layout, List<PackageInfo> packageList, PackageManager packageManager)
	{
		super();
		this.context = context;
		this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.layout = layout;
		this.packageList = packageList;
		this.packageManager = packageManager;
	}

	public int getCount()
	{
		return packageList.size();
	}

	public Object getItem( int position )
	{
		return packageList.get(position);
	}

	public long getItemId( int position )
	{
		return position;
	}

	public View getView( int position, View convertView, ViewGroup parent )
	{
		TextView apkName;

		if ( convertView == null )
		{
			convertView = inflater.inflate(layout, parent, false);
		}

		apkName = ViewHolder.get(convertView, R.id.appname_TextView);

		PackageInfo packageInfo = (PackageInfo) getItem(position);
		Drawable appIcon = packageManager.getApplicationIcon(packageInfo.applicationInfo);
		String appName = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
		appIcon.setBounds(0, 0, 80, 80);
		apkName.setCompoundDrawables(appIcon, null, null, null);
		apkName.setCompoundDrawablePadding(5);
		apkName.setText(appName);

		return convertView;
	}
}