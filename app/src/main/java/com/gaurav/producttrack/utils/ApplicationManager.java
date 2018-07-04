package com.gaurav.producttrack.utils;

import android.content.Context;

public class ApplicationManager {
    private static Context appContext;

    protected static void setAppContext(Context context) {
        appContext = context;
    }

    public static Context getAppContext() {
        return appContext;
    }
}
