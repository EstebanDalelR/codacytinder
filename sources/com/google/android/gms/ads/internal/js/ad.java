package com.google.android.gms.ads.internal.js;

import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.zzali;

final class ad implements zzali {
    /* renamed from: a */
    private /* synthetic */ C4273e f11810a;
    /* renamed from: b */
    private /* synthetic */ C2388t f11811b;

    ad(C2388t c2388t, C4273e c4273e) {
        this.f11811b = c2388t;
        this.f11810a = c4273e;
    }

    public final void run() {
        synchronized (this.f11811b.f7287a) {
            this.f11811b.f7294h = 1;
            ec.a("Failed loading new engine. Marking new engine destroyable.");
            this.f11810a.m17135c();
        }
    }
}
