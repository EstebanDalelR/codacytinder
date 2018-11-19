package com.google.android.exoplayer2;

import java.util.HashSet;

/* renamed from: com.google.android.exoplayer2.h */
public final class C2121h {
    /* renamed from: a */
    private static final HashSet<String> f6060a = new HashSet();
    /* renamed from: b */
    private static String f6061b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized String m7579a() {
        String str;
        synchronized (C2121h.class) {
            str = f6061b;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m7580a(String str) {
        synchronized (C2121h.class) {
            if (f6060a.add(str)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(f6061b);
                stringBuilder.append(", ");
                stringBuilder.append(str);
                f6061b = stringBuilder.toString();
            }
        }
    }
}
