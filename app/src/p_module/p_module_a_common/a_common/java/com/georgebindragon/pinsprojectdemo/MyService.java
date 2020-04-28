package com.georgebindragon.pinsprojectdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service
{
	public MyService() { }

	@Override
	public IBinder onBind(Intent intent) { return null; }
}
