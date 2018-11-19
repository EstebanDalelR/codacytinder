package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.hf;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.js.z */
final class C3770z implements zzt<zzaj> {
    /* renamed from: a */
    private /* synthetic */ zzc f11825a;
    /* renamed from: b */
    private /* synthetic */ hf f11826b;
    /* renamed from: c */
    private /* synthetic */ C2389u f11827c;

    C3770z(C2389u c2389u, zzc zzc, hf hfVar) {
        this.f11827c = c2389u;
        this.f11825a = zzc;
        this.f11826b = hfVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.f11827c.f7297c.f7287a) {
            ec.d("JS Engine is requesting an update");
            if (this.f11827c.f7297c.f7294h == 0) {
                ec.d("Starting reload.");
                this.f11827c.f7297c.f7294h = 2;
                this.f11827c.f7297c.m8727a(this.f11827c.f7295a);
            }
            this.f11825a.zzb("/requestReload", (zzt) this.f11826b.a());
        }
    }
}
