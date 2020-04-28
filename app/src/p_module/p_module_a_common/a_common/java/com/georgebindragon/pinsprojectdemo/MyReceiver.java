package com.georgebindragon.pinsprojectdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * 创建人：George
 *
 * 描述：
 *
 * 修改人：
 * 修改时间：
 * 修改备注：
 */


public class MyReceiver extends BroadcastReceiver
{
	private static final String TAG = "MyReceiver-->";

	@Override
	public void onReceive(Context context, Intent intent)
	{
		Log.i(TAG, "onReceive-->");
	}
}
