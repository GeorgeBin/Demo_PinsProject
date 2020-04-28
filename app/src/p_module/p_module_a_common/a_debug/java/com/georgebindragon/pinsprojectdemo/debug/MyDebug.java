package com.georgebindragon.pinsprojectdemo.debug;

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


public class MyDebug
{
	private static final String TAG = "MyDebug-->";

	private static final MyDebug ourInstance = new MyDebug();

	public static MyDebug getInstance() { return ourInstance; }

	private MyDebug() { }

	public void someDebugCode()
	{
		Log.i(TAG, "someDebugCode-->只可以在debug模式下被调用，不会打包到release版本中。" +
				"如果没有注释掉，会在编译过程报错！");
	}
}
