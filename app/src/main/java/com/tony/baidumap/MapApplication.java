package com.tony.baidumap;

import android.app.Application;
import android.content.Context;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by Administrator on 2015/9/2.
 */
public class MapApplication extends Application{
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        SDKInitializer.initialize(getApplicationContext());

    }

    public static Context getContext(){
        return context;
    }
}
