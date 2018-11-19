package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import java.util.Map;

final class anb implements zzt<Object> {
    /* renamed from: a */
    private /* synthetic */ zzzb f23013a;
    /* renamed from: b */
    private /* synthetic */ amx f23014b;

    anb(amx amx, zzzb zzzb) {
        this.f23014b = amx;
        this.f23013a = zzzb;
    }

    public final void zza(Object obj, Map<String, String> map) {
        zzanh zzanh = (zzanh) this.f23014b.f15511a.get();
        if (zzanh == null) {
            this.f23013a.zzb("/showOverlay", this);
        } else if (zzanh == null) {
            throw null;
        } else {
            ((View) zzanh).setVisibility(0);
        }
    }
}
