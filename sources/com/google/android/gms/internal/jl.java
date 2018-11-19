package com.google.android.gms.internal;

final class jl implements Runnable {
    /* renamed from: a */
    private /* synthetic */ jf f16212a;

    jl(jf jfVar) {
        this.f16212a = jfVar;
    }

    public final void run() {
        if (this.f16212a.f26907r != null) {
            this.f16212a.f26907r.onPaused();
            this.f16212a.f26907r.zzrr();
        }
    }
}
