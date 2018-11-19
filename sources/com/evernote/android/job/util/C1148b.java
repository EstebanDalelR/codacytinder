package com.evernote.android.job.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.support.annotation.NonNull;
import android.support.v4.net.ConnectivityManagerCompat;
import com.evernote.android.job.JobRequest.NetworkType;

/* renamed from: com.evernote.android.job.util.b */
public final class C1148b {
    /* renamed from: a */
    public static boolean m3881a() {
        return false;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static C1147a m3880a(Context context) {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context == null) {
            return C1147a.f3016a;
        }
        float intExtra = ((float) context.getIntExtra("level", -1)) / ((float) context.getIntExtra("scale", -1));
        context = context.getIntExtra("plugged", 0);
        boolean z = true;
        if (!(context == 1 || context == 2)) {
            if (VERSION.SDK_INT < 17 || context != 4) {
                z = false;
            }
        }
        return new C1147a(z, intExtra);
    }

    /* renamed from: b */
    public static boolean m3882b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        boolean z = true;
        if (VERSION.SDK_INT >= 23) {
            if (!powerManager.isDeviceIdleMode()) {
                if (powerManager.isInteractive() != null) {
                    z = false;
                }
            }
            return z;
        } else if (VERSION.SDK_INT >= 20) {
            return powerManager.isInteractive() ^ 1;
        } else {
            return powerManager.isScreenOn() ^ 1;
        }
    }

    @NonNull
    /* renamed from: c */
    public static NetworkType m3883c(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.isConnectedOrConnecting()) {
                if (ConnectivityManagerCompat.m1948a(connectivityManager) == null) {
                    return NetworkType.UNMETERED;
                }
                if (activeNetworkInfo.isRoaming() != null) {
                    return NetworkType.CONNECTED;
                }
                return NetworkType.NOT_ROAMING;
            }
        }
        return NetworkType.ANY;
    }
}
