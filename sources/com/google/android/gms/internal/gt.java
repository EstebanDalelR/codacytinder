package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;

final class gt implements zzakg<Throwable, T> {
    /* renamed from: a */
    private /* synthetic */ zzajb f23307a;

    gt(gr grVar, zzajb zzajb) {
        this.f23307a = zzajb;
    }

    public final /* synthetic */ zzakv zzc(Object obj) throws Exception {
        Throwable th = (Throwable) obj;
        hx.m19912b("Error occurred while dispatching http response in getter.", th);
        ar.i().m27296a(th, "HttpGetter.deliverResponse.1");
        return id.m19920a(this.f23307a.zzni());
    }
}
