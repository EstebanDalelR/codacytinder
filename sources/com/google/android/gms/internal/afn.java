package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzt;
import org.json.JSONObject;

@zzzv
public final class afn implements zzgo {
    /* renamed from: a */
    private final afe f22910a;
    /* renamed from: b */
    private final zzanh f22911b;
    /* renamed from: c */
    private final zzt<zzanh> f22912c = new afo(this);
    /* renamed from: d */
    private final zzt<zzanh> f22913d = new afp(this);
    /* renamed from: e */
    private final zzt<zzanh> f22914e = new afq(this);

    public afn(afe afe, zzanh zzanh) {
        this.f22910a = afe;
        this.f22911b = zzanh;
        zzanh zzanh2 = this.f22911b;
        zzanh2.zza("/updateActiveView", this.f22912c);
        zzanh2.zza("/untrackActiveViewUnit", this.f22913d);
        zzanh2.zza("/visibilityChanged", this.f22914e);
        String str = "Custom JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f22910a.f15127a.m19074d());
        hx.m19911b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final void zzb(JSONObject jSONObject, boolean z) {
        if (z) {
            this.f22910a.m19092b((zzgo) this);
        } else {
            this.f22911b.zzb("AFMA_updateActiveView", jSONObject);
        }
    }

    public final boolean zzgg() {
        return true;
    }

    public final void zzgh() {
        zzanh zzanh = this.f22911b;
        zzanh.zzb("/visibilityChanged", this.f22914e);
        zzanh.zzb("/untrackActiveViewUnit", this.f22913d);
        zzanh.zzb("/updateActiveView", this.f22912c);
    }
}
