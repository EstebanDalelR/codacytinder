package com.airbnb.lottie;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.os.C0529b;

@RestrictTo({Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.b */
public class C0785b {
    /* renamed from: a */
    private static boolean f2132a = false;
    /* renamed from: b */
    private static String[] f2133b;
    /* renamed from: c */
    private static long[] f2134c;
    /* renamed from: d */
    private static int f2135d;
    /* renamed from: e */
    private static int f2136e;

    /* renamed from: a */
    public static void m2775a(String str) {
        if (!f2132a) {
            return;
        }
        if (f2135d == 20) {
            f2136e++;
            return;
        }
        f2133b[f2135d] = str;
        f2134c[f2135d] = System.nanoTime();
        C0529b.m1953a(str);
        f2135d++;
    }

    /* renamed from: b */
    public static float m2776b(String str) {
        if (f2136e > 0) {
            f2136e--;
            return 0.0f;
        } else if (!f2132a) {
            return 0.0f;
        } else {
            f2135d--;
            if (f2135d == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f2133b[f2135d])) {
                C0529b.m1952a();
                return ((float) (System.nanoTime() - f2134c[f2135d])) / 1000000.0f;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unbalanced trace call ");
                stringBuilder.append(str);
                stringBuilder.append(". Expected ");
                stringBuilder.append(f2133b[f2135d]);
                stringBuilder.append(".");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
