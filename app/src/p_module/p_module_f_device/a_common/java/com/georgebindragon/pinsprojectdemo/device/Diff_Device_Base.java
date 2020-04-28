package com.georgebindragon.pinsprojectdemo.device;

import android.content.Context;

/**
 * 创建人：George
 *
 * 描述：
 *
 * 修改人：
 * 修改时间：
 * 修改备注：
 */


public abstract class Diff_Device_Base
{
	protected String TAG = "Device：" + getClass().getSimpleName() + "-->";

	public abstract void onApplicationCreate(Context context); //在app初始化阶段做的额外的事情

	public abstract int calculateMoney(int count); // 计费。不同设备，计费手段不一样
}