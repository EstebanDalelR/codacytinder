package com.google.android.gms.common.util;

import android.os.Build.VERSION;

/* renamed from: com.google.android.gms.common.util.k */
public final class C2526k {
    /* renamed from: a */
    public static boolean m9210a() {
        return VERSION.SDK_INT >= 15;
    }

    /* renamed from: b */
    public static boolean m9211b() {
        return VERSION.SDK_INT >= 16;
    }

    /* renamed from: c */
    public static boolean m9212c() {
        return VERSION.SDK_INT >= 17;
    }

    /* renamed from: d */
    public static boolean m9213d() {
        return VERSION.SDK_INT >= 18;
    }

    /* renamed from: e */
    public static boolean m9214e() {
        return VERSION.SDK_INT >= 19;
    }

    /* renamed from: f */
    public static boolean m9215f() {
        return VERSION.SDK_INT >= 20;
    }

    /* renamed from: g */
    public static boolean m9216g() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: h */
    public static boolean m9217h() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: i */
    public static boolean m9218i() {
        if (!(VERSION.SDK_INT >= 26 || "O".equals(VERSION.CODENAME) || VERSION.CODENAME.startsWith("OMR"))) {
            if (!VERSION.CODENAME.startsWith("ODR")) {
                return false;
            }
        }
        return true;
    }
}
