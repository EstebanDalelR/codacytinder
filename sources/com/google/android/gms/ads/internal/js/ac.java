package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzalk;

final class ac implements zzalk<zzc> {
    /* renamed from: a */
    private /* synthetic */ C4273e f11808a;
    /* renamed from: b */
    private /* synthetic */ C2388t f11809b;

    ac(C2388t c2388t, C4273e c4273e) {
        this.f11809b = c2388t;
        this.f11808a = c4273e;
    }

    public final /* synthetic */ void zzf(Object obj) {
        synchronized (this.f11809b.f7287a) {
            this.f11809b.f7294h = 0;
            if (!(this.f11809b.f7293g == null || this.f11808a == this.f11809b.f7293g)) {
                ec.a("New JS engine is loaded, marking previous one as destroyable.");
                this.f11809b.f7293g.m17135c();
            }
            this.f11809b.f7293g = this.f11808a;
        }
    }
}
