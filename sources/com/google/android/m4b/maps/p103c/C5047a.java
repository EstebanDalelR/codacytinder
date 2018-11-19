package com.google.android.m4b.maps.p103c;

import android.os.Build;
import android.os.Build.VERSION;
import java.lang.reflect.Field;

/* renamed from: com.google.android.m4b.maps.c.a */
public final class C5047a {
    /* renamed from: a */
    private static Boolean f18659a;
    /* renamed from: b */
    private static Exception f18660b;

    /* renamed from: a */
    public static boolean m22575a() {
        if (f18659a != null) {
            return f18659a.booleanValue();
        }
        if (f18660b != null) {
            throw f18660b;
        }
        try {
            boolean z = true;
            if (Integer.parseInt(VERSION.SDK) < 8) {
                if (!"sdk".equals(Build.PRODUCT)) {
                    if (!"google_sdk".equals(Build.PRODUCT)) {
                        z = false;
                    }
                }
                f18659a = Boolean.valueOf(z);
            } else {
                Class cls = Class.forName("android.os.Build");
                Field field = cls.getField("HARDWARE");
                field.setAccessible(true);
                f18659a = Boolean.valueOf("goldfish".equals((String) field.get(cls)));
            }
            return f18659a.booleanValue();
        } catch (Exception e) {
            f18660b = e;
            throw e;
        }
    }
}
