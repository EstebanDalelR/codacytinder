package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ec;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.y */
final class C2379y implements Runnable {
    /* renamed from: a */
    private /* synthetic */ JSONObject f7263a;
    /* renamed from: b */
    private /* synthetic */ C2378x f7264b;

    C2379y(C2378x c2378x, JSONObject jSONObject) {
        this.f7264b = c2378x;
        this.f7263a = jSONObject;
    }

    public final void run() {
        this.f7264b.f7260a.zza("fetchHttpRequestCompleted", this.f7263a);
        ec.b("Dispatched http response.");
    }
}
