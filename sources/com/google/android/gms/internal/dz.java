package com.google.android.gms.internal;

final class dz implements Runnable {
    /* renamed from: a */
    private /* synthetic */ dy f16049a;

    dz(dy dyVar) {
        this.f16049a = dyVar;
    }

    public final void run() {
        this.f16049a.f23294b = Thread.currentThread();
        this.f16049a.mo6837a();
    }
}
