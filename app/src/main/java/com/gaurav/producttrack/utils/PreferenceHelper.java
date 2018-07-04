package com.gaurav.producttrack.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by gauravjeet on 7/9/17.
 */

public class PreferenceHelper {
    Context ctx;
    private static SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ApplicationManager.getAppContext());
    private static SharedPreferences.Editor editor = sharedPreferences.edit();

    public PreferenceHelper(Context context) {
        ctx = context;
    }

    public PreferenceHelper() {

    }

    public static SharedPreferences getSharedPreference() {
        return sharedPreferences;
    }

    public static SharedPreferences.Editor getSharedPreferenceEditor() {
        return editor;
    }

    public void saveString(String key, String value) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String getString(String key, String defaultValue) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        return settings.getString(key, defaultValue);
    }

    public void saveInt(String key, int value) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public int getInt(String key, int defaultValue) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        return settings.getInt(key, defaultValue);
    }

    public void saveBoolean(String key, boolean value) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        return settings.getBoolean(key, defaultValue);
    }

    public void saveLong(String key, long value) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public void removeKey(String key) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove(key);
        editor.apply();
    }

    public long getLong(String key, long defaultValue) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
        return settings.getLong(key, defaultValue);
    }

//    public boolean isDeviceRegistered() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        return settings.getBoolean(AppConstant.IS_DEVICE_ACTIVATED, false);
//    }

//    public void setDeviceRegistered() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        SharedPreferences.Editor editor = settings.edit();
//        editor.putBoolean(AppConstant.IS_DEVICE_ACTIVATED, true);
//        editor.commit();
//    }
//
//    public void setDeviceUnRegistered() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        SharedPreferences.Editor editor = settings.edit();
//        editor.putBoolean(AppConstant.IS_DEVICE_ACTIVATED, false);
//        editor.commit();
//    }
//
//    public void setUserRegistered() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        SharedPreferences.Editor editor = settings.edit();
//        editor.putBoolean(AppConstant.IS_USER_REGISTERED, true);
//        editor.commit();
//    }
//
//    public void setUserUnRegistered() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        SharedPreferences.Editor editor = settings.edit();
//        editor.putBoolean(AppConstant.IS_USER_REGISTERED, false);
//        editor.commit();
//    }
//
//
//    public void setLoginPinSetup() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        SharedPreferences.Editor editor = settings.edit();
//        editor.putBoolean(AppConstant.IS_LOGIN_PIN_SET, true);
//        editor.commit();
//    }
//
//    public void setAppExpired() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        SharedPreferences.Editor editor = settings.edit();
//        editor.putBoolean(AppConstant.IS_APP_EXPIRED, true);
//        editor.commit();
//    }
//
//    public boolean isAppExpired() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        return settings.getBoolean(AppConstant.IS_APP_EXPIRED, false);
//    }
//
//    public boolean isLoginPinSetup() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        return settings.getBoolean(AppConstant.IS_LOGIN_PIN_SET, false);
//    }
//
//    public boolean isUserRegistered() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        return settings.getBoolean(AppConstant.IS_USER_REGISTERED, false);
//    }
//
//    public boolean isUserLoggedIn() {
//        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(ctx);
//        return settings.getBoolean(AppConstant.IS_LOGGED_IN, false);
//    }

}
