package com.facebook.ads.internal.p047k;

import android.support.annotation.Nullable;

/* renamed from: com.facebook.ads.internal.k.e */
public class C1485e {
    /* renamed from: a */
    private static boolean f4114a = false;
    /* renamed from: b */
    private static boolean f4115b = false;

    @Nullable
    /* renamed from: a */
    public static synchronized String m5226a(String str) {
        synchronized (C1485e.class) {
            if (C1485e.m5227a()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fb.e2e.");
                stringBuilder.append(str);
                str = System.getProperty(stringBuilder.toString());
                return str;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m5227a() {
        boolean z;
        synchronized (C1485e.class) {
            if (!f4115b) {
                f4114a = "true".equals(System.getProperty("fb.running_e2e"));
                f4115b = true;
            }
            z = f4114a;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized boolean m5228b(String str) {
        boolean equals;
        synchronized (C1485e.class) {
            equals = "true".equals(C1485e.m5226a(str));
        }
        return equals;
    }
}
