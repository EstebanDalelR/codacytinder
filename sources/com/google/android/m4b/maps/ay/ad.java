package com.google.android.m4b.maps.ay;

import com.google.android.m4b.maps.p104d.C5318a;

public abstract class ad {
    /* renamed from: a */
    private static final String f17297a = "ad";
    /* renamed from: b */
    private C5318a f17298b;
    /* renamed from: c */
    private long f17299c;
    /* renamed from: d */
    private final long f17300d;
    /* renamed from: e */
    private final C4712d f17301e;

    /* renamed from: a */
    public abstract C5318a mo4897a();

    public ad(long j) {
        this(j, new C4712d());
    }

    private ad(long j, C4712d c4712d) {
        this.f17298b = null;
        this.f17300d = j;
        this.f17301e = c4712d;
    }

    /* renamed from: b */
    public final synchronized C5318a m20916b() {
        long c = C4712d.m20957c();
        if (this.f17298b == null || c >= this.f17299c) {
            C5318a a = mo4897a();
            if (a != null) {
                this.f17298b = a;
                this.f17299c = c + this.f17300d;
            }
        }
        return this.f17298b;
    }
}
