package com.google.android.m4b.maps.p113m;

/* renamed from: com.google.android.m4b.maps.m.d */
public final class C6715d implements C5477c {
    /* renamed from: a */
    private static C6715d f25127a;

    /* renamed from: b */
    public static synchronized C5477c m29983b() {
        C5477c c5477c;
        synchronized (C6715d.class) {
            if (f25127a == null) {
                f25127a = new C6715d();
            }
            c5477c = f25127a;
        }
        return c5477c;
    }

    /* renamed from: a */
    public final long mo5485a() {
        return System.currentTimeMillis();
    }
}
