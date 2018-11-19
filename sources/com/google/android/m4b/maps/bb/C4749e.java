package com.google.android.m4b.maps.bb;

import com.google.android.m4b.maps.ca.C5052d;

/* renamed from: com.google.android.m4b.maps.bb.e */
public final class C4749e {
    /* renamed from: a */
    private final C7443g f17416a;

    /* renamed from: com.google.android.m4b.maps.bb.e$a */
    public enum C4748a {
        FADE_IN,
        FADE_OUT,
        FADE_BETWEEN
    }

    public C4749e(long j, C4748a c4748a) {
        this(0, 500, c4748a);
    }

    public C4749e(long j, long j2, C4748a c4748a) {
        this(j, j2, c4748a, 0, 0);
    }

    public C4749e(long j, long j2, C4748a c4748a, int i, int i2) {
        long j3 = j + j2;
        this.f17416a = new C7443g(new C4745c(((float) j) / ((float) j3)));
        this.f17416a.setDuration(j3);
        switch (c4748a) {
            case FADE_IN:
                this.f17416a.m32042a(0);
                this.f17416a.m32042a(65536);
                return;
            case FADE_OUT:
                this.f17416a.m32042a(65536);
                this.f17416a.m32042a(0);
                return;
            case FADE_BETWEEN:
                this.f17416a.m32042a(i);
                this.f17416a.m32042a(i2);
                break;
            default:
                break;
        }
    }

    /* renamed from: a */
    public final int m21087a(C5052d c5052d) {
        long e = c5052d.m22616e();
        if (!this.f17416a.hasStarted()) {
            this.f17416a.start();
        }
        this.f17416a.m32043a(e);
        int b = this.f17416a.m32044b();
        if (!this.f17416a.hasEnded()) {
            c5052d.m22611b();
        }
        return b;
    }

    /* renamed from: a */
    public final void m21088a() {
        this.f17416a.start();
    }
}
