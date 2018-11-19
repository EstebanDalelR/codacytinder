package com.foursquare.internal.util;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.os.Build.VERSION;

/* renamed from: com.foursquare.internal.util.i */
public abstract class C1947i {
    /* renamed from: a */
    public abstract long mo2013a(ScanResult scanResult);

    /* renamed from: a */
    public abstract boolean mo2014a(Context context);

    /* renamed from: b */
    public abstract boolean mo2015b(Context context);

    /* renamed from: a */
    public static C1947i m6837a() {
        switch (VERSION.SDK_INT) {
            case 15:
            case 16:
                return new C3504j();
            case 17:
                return new C4229k();
            default:
                return new C4370l();
        }
    }
}
