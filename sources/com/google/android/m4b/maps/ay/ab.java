package com.google.android.m4b.maps.ay;

import android.os.Looper;
import com.google.android.m4b.maps.p125y.C5571j;

public final class ab extends aa {
    /* renamed from: a */
    private static final ab f23764a = new ab(Looper.getMainLooper().getThread(), "Not on the main thread", "Should not be on the main thread");
    /* renamed from: b */
    private final Thread f23765b;
    /* renamed from: c */
    private final String f23766c;
    /* renamed from: d */
    private final String f23767d;

    /* renamed from: c */
    public static aa m27950c() {
        return f23764a;
    }

    /* renamed from: d */
    public static void m27951d() {
        f23764a.mo4875a();
    }

    /* renamed from: e */
    public static void m27952e() {
        f23764a.mo4876b();
    }

    private ab(Thread thread, String str, String str2) {
        this.f23765b = thread;
        this.f23766c = str;
        this.f23767d = str2;
    }

    /* renamed from: a */
    public final void mo4875a() {
        C5571j.m24302b(Thread.currentThread() == this.f23765b, this.f23766c);
    }

    /* renamed from: b */
    public final void mo4876b() {
        C5571j.m24302b(Thread.currentThread() != this.f23765b, this.f23767d);
    }
}
