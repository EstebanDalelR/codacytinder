package com.google.android.gms.internal;

@zzzv
final class ke implements Runnable {
    /* renamed from: a */
    private jr f16265a;
    /* renamed from: b */
    private boolean f16266b = false;

    ke(jr jrVar) {
        this.f16265a = jrVar;
    }

    /* renamed from: c */
    private final void m19969c() {
        fk.f16060a.removeCallbacks(this);
        fk.f16060a.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void m19970a() {
        this.f16266b = true;
    }

    /* renamed from: b */
    public final void m19971b() {
        this.f16266b = false;
        m19969c();
    }

    public final void run() {
        if (!this.f16266b) {
            this.f16265a.m27400h();
            m19969c();
        }
    }
}
