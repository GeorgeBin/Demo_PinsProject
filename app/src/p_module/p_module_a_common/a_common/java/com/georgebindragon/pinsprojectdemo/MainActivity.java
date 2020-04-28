package com.georgebindragon.pinsprojectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.georgebindragon.pinsprojectdemo.debug.MyDebug;
import com.georgebindragon.pinsprojectdemo.device.Diff_Device_Control;

public class MainActivity extends AppCompatActivity
{
	private static final String TAG = "MainActivity-->";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		MyDebug.getInstance().someDebugCode();

		initView();

		initData();

		getMetaData();
	}

	TextView count_tv;

	private void initView()
	{
		count_tv = findViewById(R.id.activity_main_count_tv);
	}

	private void initData()
	{
		int money = Diff_Device_Control.getInstance().calculateMoney(20);
		count_tv.setText("计费：" + money + "元");

		String string = getString(R.string.app_version_resValue);
		Log.i(TAG, "initData-->通过gradle添加的 string=" + string);
	}


	private void getMetaData()
	{
		getMetaDataFromApplication();
		getMetaDataFromActivity();
		getMetaDataFromService();
		getMetaDataFromReceiver();
	}

	private void getMetaDataFromApplication()
	{
		try
		{
			ApplicationInfo appInfo      = this.getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
			String          value_holder = appInfo.metaData.getString("com.georgebindragon.meta-data.key_holder");
			Log.d(TAG, "value_holder from application=" + value_holder);
		} catch (PackageManager.NameNotFoundException e) { e.printStackTrace(); }
	}

	private void getMetaDataFromActivity()
	{
		try
		{
			ActivityInfo info           = this.getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
			String       value_activity = info.metaData.getString("com.georgebindragon.meta-data.key_activity");
			Log.d(TAG, "value_activity=" + value_activity);
		} catch (PackageManager.NameNotFoundException e) { e.printStackTrace(); }
	}

	private void getMetaDataFromService()
	{
		try
		{
			ComponentName cn            = new ComponentName(this, MyService.class);
			ServiceInfo   info          = this.getPackageManager().getServiceInfo(cn, PackageManager.GET_META_DATA);
			String        value_service = info.metaData.getString("com.georgebindragon.meta-data.key_service");
			Log.d(TAG, "value_service=" + value_service);
		} catch (PackageManager.NameNotFoundException e) { e.printStackTrace(); }
	}

	private void getMetaDataFromReceiver()
	{
		try
		{
			ComponentName cn             = new ComponentName(this, MyReceiver.class);
			ActivityInfo  info           = this.getPackageManager().getReceiverInfo(cn, PackageManager.GET_META_DATA);
			String        value_receiver = info.metaData.getString("com.georgebindragon.meta-data.key_receiver");
			Log.d(TAG, "value_receiver=" + value_receiver);
		} catch (PackageManager.NameNotFoundException e) { e.printStackTrace(); }
	}
}
