package kh.ad.appgaintask.core;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.util.Log;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

import kh.ad.appgaintask.BuildConfig;

/**
 * This class is responsible for prevent multiDex(or 64k reference exceed) build error
 */

@SuppressLint("Registered")
public class MyApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(getApplicationContext());
        Log.i("MyApplication", "DebugMode: " + BuildConfig.DEBUG);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
