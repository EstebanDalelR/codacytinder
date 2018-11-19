package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;

final class avv implements zzaki<zzanh> {
    /* renamed from: a */
    private /* synthetic */ String f23212a;
    /* renamed from: b */
    private /* synthetic */ zzt f23213b;

    avv(avo avo, String str, zzt zzt) {
        this.f23212a = str;
        this.f23213b = zzt;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzanh) obj).zzb(this.f23212a, this.f23213b);
    }

    public final void zzb(Throwable th) {
    }
}
