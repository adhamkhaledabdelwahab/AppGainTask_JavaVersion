package kh.ad.appgaintask.core;

import android.util.Log;

import kh.ad.appgaintask.BuildConfig;

public class LogUtil {
    static public void d(String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message);
        }
    }
}
