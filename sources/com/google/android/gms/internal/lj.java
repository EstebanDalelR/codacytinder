package com.google.android.gms.internal;

import java.util.Map;

final class lj implements Runnable {
    /* renamed from: a */
    private /* synthetic */ Map f16341a;
    /* renamed from: b */
    private /* synthetic */ li f16342b;

    lj(li liVar, Map map) {
        this.f16342b = liVar;
        this.f16341a = map;
    }

    public final void run() {
        this.f16342b.f26915a.zza("pubVideoCmd", this.f16341a);
    }
}
