package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.iy;
import com.google.android.gms.internal.iz;

/* renamed from: com.google.android.gms.ads.internal.js.a */
public final class C4272a extends iz<zzaj> {
    /* renamed from: a */
    private final Object f13891a = new Object();
    /* renamed from: b */
    private final C4273e f13892b;
    /* renamed from: c */
    private boolean f13893c;

    public C4272a(C4273e c4273e) {
        this.f13892b = c4273e;
    }

    /* renamed from: a */
    public final void m17130a() {
        synchronized (this.f13891a) {
            if (this.f13893c) {
                return;
            }
            this.f13893c = true;
            zza(new C3759b(this), new iy());
            zza(new C3760c(this), new C3761d(this));
        }
    }
}
