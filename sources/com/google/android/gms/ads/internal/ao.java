package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.sv;
import com.google.android.gms.internal.tb;
import java.util.concurrent.Callable;

final class ao implements Callable<tb> {
    /* renamed from: a */
    private /* synthetic */ al f7107a;

    ao(al alVar) {
        this.f7107a = alVar;
    }

    public final /* synthetic */ Object call() throws Exception {
        return new tb(sv.a(this.f7107a.f13847a.zzcv, this.f7107a.f13850d, false));
    }
}
