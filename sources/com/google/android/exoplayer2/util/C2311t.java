package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: com.google.android.exoplayer2.util.t */
public final class C2311t {
    /* renamed from: a */
    public static void m8447a(String str) {
        if (C2314v.f6956a >= 18) {
            C2311t.m8449b(str);
        }
    }

    /* renamed from: a */
    public static void m8446a() {
        if (C2314v.f6956a >= 18) {
            C2311t.m8448b();
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m8449b(String str) {
        Trace.beginSection(str);
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m8448b() {
        Trace.endSection();
    }
}
