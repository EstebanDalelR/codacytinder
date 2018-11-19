package com.facebook.ads.internal.p040g;

import java.util.UUID;

/* renamed from: com.facebook.ads.internal.g.h */
public class C1414h {
    /* renamed from: a */
    private static final String f3903a = "h";
    /* renamed from: b */
    private static volatile boolean f3904b = false;
    /* renamed from: c */
    private static double f3905c;
    /* renamed from: d */
    private static String f3906d;

    /* renamed from: a */
    public static void m4920a() {
        if (!f3904b) {
            synchronized (f3903a) {
                if (!f3904b) {
                    f3904b = true;
                    f3905c = ((double) System.currentTimeMillis()) / 1000.0d;
                    f3906d = UUID.randomUUID().toString();
                }
            }
        }
    }

    /* renamed from: b */
    public static double m4921b() {
        return f3905c;
    }

    /* renamed from: c */
    public static String m4922c() {
        return f3906d;
    }
}
