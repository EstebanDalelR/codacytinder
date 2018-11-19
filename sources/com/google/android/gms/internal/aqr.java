package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.C4269a;
import com.google.android.gms.ads.internal.C4458k;
import com.google.android.gms.ads.internal.ar;

final class aqr {
    /* renamed from: a */
    C4458k f15593a;
    @Nullable
    /* renamed from: b */
    zzjj f15594b;
    /* renamed from: c */
    apl f15595c;
    /* renamed from: d */
    long f15596d;
    /* renamed from: e */
    boolean f15597e;
    /* renamed from: f */
    boolean f15598f;
    /* renamed from: g */
    private /* synthetic */ aqq f15599g;

    aqr(aqq aqq, apk apk) {
        this.f15599g = aqq;
        this.f15593a = apk.m19403b(aqq.f15590c);
        this.f15595c = new apl();
        apl apl = this.f15595c;
        C4269a c4269a = this.f15593a;
        c4269a.zza(new apm(apl));
        c4269a.zza(new apu(apl));
        c4269a.zza(new apw(apl));
        c4269a.zza(new apy(apl));
        c4269a.zza(new aqa(apl));
    }

    aqr(aqq aqq, apk apk, zzjj zzjj) {
        this(aqq, apk);
        this.f15594b = zzjj;
    }

    /* renamed from: a */
    final boolean m19438a() {
        if (this.f15597e) {
            return false;
        }
        this.f15598f = this.f15593a.zzb(aqo.m19415b(this.f15594b != null ? this.f15594b : this.f15599g.f15589b));
        this.f15597e = true;
        this.f15596d = ar.k().currentTimeMillis();
        return true;
    }
}
