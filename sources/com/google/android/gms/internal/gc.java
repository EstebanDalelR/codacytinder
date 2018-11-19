package com.google.android.gms.internal;

@zzzv
public final class gc {
    /* renamed from: a */
    private boolean f16074a = false;
    /* renamed from: b */
    private float f16075b = 1.0f;

    /* renamed from: c */
    private final synchronized boolean m19786c() {
        return this.f16075b >= 0.0f;
    }

    /* renamed from: a */
    public final synchronized float m19787a() {
        if (!m19786c()) {
            return 1.0f;
        }
        return this.f16075b;
    }

    /* renamed from: a */
    public final synchronized void m19788a(float f) {
        this.f16075b = f;
    }

    /* renamed from: a */
    public final synchronized void m19789a(boolean z) {
        this.f16074a = z;
    }

    /* renamed from: b */
    public final synchronized boolean m19790b() {
        return this.f16074a;
    }
}
