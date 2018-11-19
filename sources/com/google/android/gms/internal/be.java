package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import java.util.concurrent.Callable;

final class be implements Callable<bb> {
    /* renamed from: a */
    private /* synthetic */ Context f15900a;
    /* renamed from: b */
    private /* synthetic */ bd f15901b;

    be(bd bdVar, Context context) {
        this.f15901b = bdVar;
        this.f15900a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        bb a;
        bf bfVar = (bf) this.f15901b.f15899a.get(this.f15900a);
        if (bfVar != null) {
            if ((bfVar.f15902a + ((Long) aja.m19221f().m19334a(alo.bc)).longValue() < ar.k().currentTimeMillis() ? 1 : null) == null) {
                if (((Boolean) aja.m19221f().m19334a(alo.bb)).booleanValue()) {
                    a = new bc(this.f15900a, bfVar.f15903b).m19561a();
                    this.f15901b.f15899a.put(this.f15900a, new bf(this.f15901b, a));
                    return a;
                }
            }
        }
        a = new bc(this.f15900a).m19561a();
        this.f15901b.f15899a.put(this.f15900a, new bf(this.f15901b, a));
        return a;
    }
}
