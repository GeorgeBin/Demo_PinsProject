package com.georgebindragon.pinsprojectdemo.device;

import android.content.Context;
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


public abstract class Diff_Device_BaseImp extends Diff_Device_Base
{
	@Override
	public void onApplicationCreate(Context context)
	{
		Log.i(TAG, "onApplicationCreate-->此处的初始化，目前是一样的");
	}
}