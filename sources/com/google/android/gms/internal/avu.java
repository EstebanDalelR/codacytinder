package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;

final class avu implements zzaki<zzanh> {
    /* renamed from: a */
    private /* synthetic */ String f23210a;
    /* renamed from: b */
    private /* synthetic */ zzt f23211b;

    avu(avo avo, String str, zzt zzt) {
        this.f23210a = str;
        this.f23211b = zzt;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzanh) obj).zza(this.f23210a, this.f23211b);
    }

    public final void zzb(Throwable th) {
    }
}
