package com.mapbox.android.core.permissions;

import android.content.Context;
import android.support.v4.content.C0432b;

/* renamed from: com.mapbox.android.core.permissions.a */
public class C5765a {
    /* renamed from: a */
    private static boolean m25343a(Context context, String str) {
        return C0432b.b(context, str) == null ? true : null;
    }

    /* renamed from: b */
    private static boolean m25344b(Context context) {
        return C5765a.m25343a(context, "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* renamed from: c */
    private static boolean m25345c(Context context) {
        return C5765a.m25343a(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* renamed from: a */
    public static boolean m25342a(Context context) {
        if (!C5765a.m25344b(context)) {
            if (C5765a.m25345c(context) == null) {
                return null;
            }
        }
        return true;
    }
}
