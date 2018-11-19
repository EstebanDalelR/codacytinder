package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import org.json.JSONObject;

@zzzv
public final class dm {
    /* renamed from: a */
    public final zzaat f15995a;
    /* renamed from: b */
    public final zzaax f15996b;
    /* renamed from: c */
    public final arj f15997c;
    @Nullable
    /* renamed from: d */
    public final zzjn f15998d;
    /* renamed from: e */
    public final int f15999e;
    /* renamed from: f */
    public final long f16000f;
    /* renamed from: g */
    public final long f16001g;
    @Nullable
    /* renamed from: h */
    public final JSONObject f16002h;
    /* renamed from: i */
    public final ahw f16003i;
    /* renamed from: j */
    public final boolean f16004j;

    public dm(zzaat zzaat, zzaax zzaax, arj arj, zzjn zzjn, int i, long j, long j2, JSONObject jSONObject, ahw ahw, @Nullable Boolean bool) {
        boolean booleanValue;
        this.f15995a = zzaat;
        this.f15996b = zzaax;
        this.f15997c = arj;
        this.f15998d = zzjn;
        this.f15999e = i;
        this.f16000f = j;
        this.f16001g = j2;
        this.f16002h = jSONObject;
        this.f16003i = ahw;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            ar.e();
            booleanValue = fk.m19708a(zzaat.zzcnd);
        }
        this.f16004j = booleanValue;
    }

    public dm(zzaat zzaat, zzaax zzaax, arj arj, zzjn zzjn, int i, long j, long j2, JSONObject jSONObject, ahz ahz) {
        this.f15995a = zzaat;
        this.f15996b = zzaax;
        this.f15997c = null;
        this.f15998d = null;
        this.f15999e = i;
        this.f16000f = j;
        this.f16001g = j2;
        this.f16002h = null;
        this.f16003i = new ahw(ahz, ((Boolean) aja.m19221f().m19334a(alo.cJ)).booleanValue());
        this.f16004j = false;
    }
}
