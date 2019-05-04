package com.magdamiu.androidfundamentalsseria2.utils;

import android.util.Log;

import com.magdamiu.androidfundamentalsseria2.BuildConfig;

// class used in order to log messages in the Logcat window, only in Debug mode
public class Logging {
  public static void show(Object obj, String message) {
      if (BuildConfig.DEBUG) {
          Log.e(obj.getClass().getName(), message);
      }
  }
}