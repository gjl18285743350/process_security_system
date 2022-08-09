package com.example.process_security_system.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

/**
 * 日志服务
 */
public class LogService extends Service {
    private final String TAG = this.getClass().getSimpleName();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "onStartCommand: "+"日志服务启动了");
        return super.onStartCommand(intent, flags, startId);
    }
}
