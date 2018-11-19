package com.foursquare.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.internal.util.j */
public class C3504j extends C1947i {
    /* renamed from: a */
    public boolean mo2014a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        boolean z = false;
        if (connectivityManager == null) {
            return false;
        }
        context = connectivityManager.getActiveNetworkInfo();
        if (!(context == null || context.isConnected() == null)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo2015b(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        return (wifiManager == null || wifiManager.isWifiEnabled() == null) ? null : true;
    }

    /* renamed from: a */
    public long mo2013a(ScanResult scanResult) {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }
}
