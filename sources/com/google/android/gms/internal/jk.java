package com.google.android.gms.internal;

final class jk implements Runnable {
    /* renamed from: a */
    private /* synthetic */ int f16209a;
    /* renamed from: b */
    private /* synthetic */ int f16210b;
    /* renamed from: c */
    private /* synthetic */ jf f16211c;

    jk(jf jfVar, int i, int i2) {
        this.f16211c = jfVar;
        this.f16209a = i;
        this.f16210b = i2;
    }

    public final void run() {
        if (this.f16211c.f26907r != null) {
            this.f16211c.f26907r.zzf(this.f16209a, this.f16210b);
        }
    }
}
