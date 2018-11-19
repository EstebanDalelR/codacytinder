package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.internal.zzj;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.q */
final class C3805q extends C2479x {
    /* renamed from: a */
    final /* synthetic */ C3803n f12030a;
    /* renamed from: b */
    private final Map<zze, C3804p> f12031b;

    public C3805q(C3803n c3803n, Map<zze, C3804p> map) {
        this.f12030a = c3803n;
        super(c3803n);
        this.f12031b = map;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo2565a() {
        Object obj;
        Object obj2 = 1;
        int i = 0;
        Object obj3 = null;
        Object obj4 = 1;
        for (zze zze : this.f12031b.keySet()) {
            if (!zze.zzagg()) {
                obj4 = null;
            } else if (!((C3804p) this.f12031b.get(zze)).f12029c) {
                obj = 1;
                break;
            } else {
                obj3 = 1;
            }
        }
        obj2 = obj3;
        obj = null;
        if (obj2 != null) {
            i = this.f12030a.f12009d.mo2566a(this.f12030a.f12008c);
        }
        if (i == 0 || (r0 == null && r4 == null)) {
            if (this.f12030a.f12018m) {
                this.f12030a.f12016k.connect();
            }
            for (zze zze2 : this.f12031b.keySet()) {
                zzj zzj = (zzj) this.f12031b.get(zze2);
                if (!zze2.zzagg() || i == 0) {
                    zze2.zza(zzj);
                } else {
                    this.f12030a.f12006a.m17177a(new C3807s(this, this.f12030a, zzj));
                }
            }
            return;
        }
        this.f12030a.f12006a.m17177a(new C3806r(this, this.f12030a, new ConnectionResult(i, null)));
    }
}
