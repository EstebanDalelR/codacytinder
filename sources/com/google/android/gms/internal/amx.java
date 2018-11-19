package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

final class amx {
    /* renamed from: a */
    private final WeakReference<zzanh> f15511a;
    /* renamed from: b */
    private String f15512b;

    public amx(zzanh zzanh) {
        this.f15511a = new WeakReference(zzanh);
    }

    /* renamed from: a */
    public final void m19374a(zzzb zzzb) {
        zzzb.zza("/loadHtml", new amy(this, zzzb));
        zzzb.zza("/showOverlay", new anb(this, zzzb));
        zzzb.zza("/hideOverlay", new anc(this, zzzb));
        zzanh zzanh = (zzanh) this.f15511a.get();
        if (zzanh != null) {
            zzanh.zzsz().m20005a("/sendMessageToSdk", new and(this, zzzb));
        }
    }
}
