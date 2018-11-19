package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.gmsg.ab;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.C2388t;
import com.google.android.gms.ads.internal.js.C4272a;
import com.google.android.gms.ads.internal.js.zzaj;
import org.json.JSONObject;

@zzzv
public final class afr implements zzgo {
    /* renamed from: a */
    private final afe f22918a;
    /* renamed from: b */
    private final Context f22919b;
    /* renamed from: c */
    private final ab f22920c;
    /* renamed from: d */
    private C4272a f22921d;
    /* renamed from: e */
    private boolean f22922e;
    /* renamed from: f */
    private final zzt<zzaj> f22923f = new afw(this);
    /* renamed from: g */
    private final zzt<zzaj> f22924g = new afx(this);
    /* renamed from: h */
    private final zzt<zzaj> f22925h = new afy(this);
    /* renamed from: i */
    private final zzt<zzaj> f22926i = new afz(this);

    public afr(afe afe, C2388t c2388t, Context context) {
        this.f22918a = afe;
        this.f22919b = context;
        this.f22920c = new ab(this.f22919b);
        this.f22921d = c2388t.b(null);
        this.f22921d.zza(new afs(this), new aft(this));
        String str = "Core JS tracking ad unit: ";
        String valueOf = String.valueOf(this.f22918a.f15127a.m19074d());
        hx.m19911b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    final void m27082a(zzaj zzaj) {
        zzaj.zza("/updateActiveView", this.f22923f);
        zzaj.zza("/untrackActiveViewUnit", this.f22924g);
        zzaj.zza("/visibilityChanged", this.f22925h);
        if (ar.z().m19598a(this.f22919b)) {
            zzaj.zza("/logScionEvent", this.f22926i);
        }
    }

    /* renamed from: b */
    final void m27083b(zzaj zzaj) {
        zzaj.zzb("/visibilityChanged", this.f22925h);
        zzaj.zzb("/untrackActiveViewUnit", this.f22924g);
        zzaj.zzb("/updateActiveView", this.f22923f);
        if (ar.z().m19598a(this.f22919b)) {
            zzaj.zzb("/logScionEvent", this.f22926i);
        }
    }

    public final void zzb(JSONObject jSONObject, boolean z) {
        this.f22921d.zza(new afu(this, jSONObject), new iy());
    }

    public final boolean zzgg() {
        return this.f22922e;
    }

    public final void zzgh() {
        this.f22921d.zza(new afv(this), new iy());
        this.f22921d.a();
    }
}
