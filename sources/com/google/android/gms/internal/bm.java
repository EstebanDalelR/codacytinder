package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.ar;
import org.json.JSONObject;

@zzzv
public final class bm implements zzacf {
    /* renamed from: a */
    private zztp<JSONObject, JSONObject> f23233a;
    /* renamed from: b */
    private zztp<JSONObject, JSONObject> f23234b;

    public bm(Context context) {
        this.f23233a = ar.r().m19454a(context, zzakd.zzrd()).m19456a("google.afma.request.getAdDictionary", aqx.f15616a, aqx.f15616a);
        this.f23234b = ar.r().m19454a(context, zzakd.zzrd()).m19456a("google.afma.sdkConstants.getSdkConstants", aqx.f15616a, aqx.f15616a);
    }

    public final zztp<JSONObject, JSONObject> zznq() {
        return this.f23233a;
    }

    public final zztp<JSONObject, JSONObject> zznr() {
        return this.f23234b;
    }
}
