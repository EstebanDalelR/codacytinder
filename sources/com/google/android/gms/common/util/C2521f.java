package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;

/* renamed from: com.google.android.gms.common.util.f */
public final class C2521f {
    /* renamed from: a */
    private static Boolean f7678a;
    /* renamed from: b */
    private static Boolean f7679b;
    /* renamed from: c */
    private static Boolean f7680c;

    @TargetApi(20)
    /* renamed from: a */
    public static boolean m9199a(Context context) {
        if (f7678a == null) {
            boolean z = C2526k.m9215f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            f7678a = Boolean.valueOf(z);
        }
        return f7678a.booleanValue();
    }

    @TargetApi(24)
    /* renamed from: b */
    public static boolean m9200b(Context context) {
        return (!C2526k.m9217h() || C2521f.m9201c(context)) && C2521f.m9199a(context);
    }

    @TargetApi(21)
    /* renamed from: c */
    public static boolean m9201c(Context context) {
        if (f7679b == null) {
            boolean z = C2526k.m9216g() && context.getPackageManager().hasSystemFeature("cn.google");
            f7679b = Boolean.valueOf(z);
        }
        return f7679b.booleanValue();
    }

    /* renamed from: d */
    public static boolean m9202d(Context context) {
        if (f7680c == null) {
            boolean z;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot")) {
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    z = false;
                    f7680c = Boolean.valueOf(z);
                }
            }
            z = true;
            f7680c = Boolean.valueOf(z);
        }
        return f7680c.booleanValue();
    }
}
