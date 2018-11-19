package com.google.android.gms.internal;

import org.json.JSONObject;

final class avw implements zzaki<zzanh> {
    /* renamed from: a */
    private /* synthetic */ String f23214a;
    /* renamed from: b */
    private /* synthetic */ JSONObject f23215b;

    avw(avo avo, String str, JSONObject jSONObject) {
        this.f23214a = str;
        this.f23215b = jSONObject;
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ((zzanh) obj).zza(this.f23214a, this.f23215b);
    }

    public final void zzb(Throwable th) {
    }
}
