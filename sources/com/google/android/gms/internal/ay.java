package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class ay implements zzt<Object> {
    /* renamed from: a */
    private /* synthetic */ av f23226a;

    ay(av avVar) {
        this.f23226a = avVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f23226a.f15761b) {
            if (this.f23226a.f15764e.isDone()) {
                return;
            }
            ba baVar = new ba(-2, map);
            if (this.f23226a.f15762c.equals(baVar.m19552h())) {
                this.f23226a.f15764e.m27364b(baVar);
                return;
            }
        }
    }
}
