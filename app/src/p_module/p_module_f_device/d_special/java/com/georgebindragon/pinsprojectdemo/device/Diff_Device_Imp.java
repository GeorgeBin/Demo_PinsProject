package com.georgebindragon.pinsprojectdemo.device;

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


public class Diff_Device_Imp extends Diff_Device_BaseImp
{
	private static final Diff_Device_Imp ourInstance = new Diff_Device_Imp();

	public static Diff_Device_Imp getInstance() { return ourInstance; }

	private Diff_Device_Imp() { }

	@Override
	public int calculateMoney(int count)
	{
		int result = count * 100;
		Log.i(TAG, "calculateMoney-->count=" + count + "\tresult=" + result);
		return result;
	}
}
