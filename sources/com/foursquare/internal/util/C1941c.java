package com.foursquare.internal.util;

import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.internal.util.c */
public class C1941c {
    /* renamed from: a */
    public static boolean m6821a(long j, int i) {
        return System.currentTimeMillis() - (j + TimeUnit.MINUTES.toMillis((long) (Math.pow(2.0d, (double) i) - 1.0d))) > 0 ? 1 : 0;
    }
}
