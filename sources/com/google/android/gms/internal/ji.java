package com.google.android.gms.internal;

final class ji implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f16205a;
    /* renamed from: b */
    private /* synthetic */ String f16206b;
    /* renamed from: c */
    private /* synthetic */ jf f16207c;

    ji(jf jfVar, String str, String str2) {
        this.f16207c = jfVar;
        this.f16205a = str;
        this.f16206b = str2;
    }

    public final void run() {
        if (this.f16207c.f26907r != null) {
            this.f16207c.f26907r.zzg(this.f16205a, this.f16206b);
        }
    }
}
