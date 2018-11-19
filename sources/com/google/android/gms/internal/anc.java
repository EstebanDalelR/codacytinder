package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class anc implements zzt<Object> {
    /* renamed from: a */
    private /* synthetic */ zzzb f23015a;
    /* renamed from: b */
    private /* synthetic */ amx f23016b;

    anc(amx amx, zzzb zzzb) {
        this.f23016b = amx;
        this.f23015a = zzzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzanh zzanh = (zzanh) this.f23016b.f15511a.get();
        if (zzanh == null) {
            this.f23015a.zzb("/hideOverlay", this);
        } else if (zzanh == null) {
            throw null;
        } else {
            ((View) zzanh).setVisibility(8);
        }
    }
}
