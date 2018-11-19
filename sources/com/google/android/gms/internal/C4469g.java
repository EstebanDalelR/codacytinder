package com.google.android.gms.internal;

/* renamed from: com.google.android.gms.internal.g */
final class C4469g implements Runnable {
    /* renamed from: a */
    private /* synthetic */ awe f16073a;

    C4469g(awe awe) {
        this.f16073a = awe;
    }

    public final void run() {
        synchronized (this.f16073a.f26843d) {
            if (this.f16073a.f26840a == null) {
                return;
            }
            this.f16073a.mo6838b();
            this.f16073a.m31531a(2, "Timed out waiting for ad response.");
        }
    }
}
