package com.leanplum.utils;

import android.content.Context;
import android.os.Build.VERSION;

public class BuildUtil {
    /* renamed from: a */
    private static int f21445a = -1;

    public static boolean isNotificationChannelSupported(Context context) {
        if (VERSION.SDK_INT >= 26) {
            if (f21445a == -1 && context != null) {
                f21445a = context.getApplicationInfo().targetSdkVersion;
            }
            if (f21445a >= 26) {
                return true;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static int m25298a(Context context) {
        if (f21445a == -1 && context != null) {
            f21445a = context.getApplicationInfo().targetSdkVersion;
        }
        return f21445a;
    }
}
