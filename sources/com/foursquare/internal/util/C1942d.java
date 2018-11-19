package com.foursquare.internal.util;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;

/* renamed from: com.foursquare.internal.util.d */
public class C1942d {
    @IntRange(from = -1, to = 100)
    /* renamed from: a */
    public static int m6822a(@NonNull Context context) {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context == null) {
            return -1;
        }
        int intExtra = context.getIntExtra("level", -1);
        context = context.getIntExtra("scale", -1);
        if (intExtra >= 0) {
            if (context > null) {
                return (intExtra * 100) / context;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static boolean m6825b(@NonNull Context context) {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (context == null) {
            return false;
        }
        context = context.getIntExtra("plugged", -1);
        if (context == 1 || context == 2) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m6823a() {
        return VERSION.SDK_INT >= 17;
    }

    /* renamed from: b */
    public static boolean m6824b() {
        if (!(Build.HARDWARE.contains("vbox86") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")))) {
            if (!"google_sdk".equals(Build.PRODUCT)) {
                return false;
            }
        }
        return true;
    }
}
