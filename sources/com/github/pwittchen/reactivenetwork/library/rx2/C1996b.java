package com.github.pwittchen.reactivenetwork.library.rx2;

import android.os.Build.VERSION;

/* renamed from: com.github.pwittchen.reactivenetwork.library.rx2.b */
public class C1996b {
    /* renamed from: a */
    public static void m7207a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static boolean m7208a() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public static boolean m7209b() {
        return VERSION.SDK_INT >= 23;
    }
}
