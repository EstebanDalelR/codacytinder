package com.google.android.m4b.maps.p113m;

import android.content.Context;
import com.facebook.ads.AdError;
import java.util.regex.Pattern;

/* renamed from: com.google.android.m4b.maps.m.a */
public final class C5475a {
    /* renamed from: a */
    private static Pattern f20475a;

    /* renamed from: a */
    public static int m23829a(int i) {
        return i / AdError.NETWORK_ERROR_CODE;
    }

    /* renamed from: a */
    public static boolean m23830a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    /* renamed from: b */
    public static boolean m23831b(int i) {
        return (i % AdError.NETWORK_ERROR_CODE) / 100 == 3;
    }
}
