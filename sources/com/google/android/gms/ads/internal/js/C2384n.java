package com.google.android.gms.ads.internal.js;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.js.n */
final class C2384n implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f7278a;
    /* renamed from: b */
    private /* synthetic */ JSONObject f7279b;
    /* renamed from: c */
    private /* synthetic */ C4390l f7280c;

    C2384n(C4390l c4390l, String str, JSONObject jSONObject) {
        this.f7280c = c4390l;
        this.f7278a = str;
        this.f7279b = jSONObject;
    }

    public final void run() {
        this.f7280c.f14562a.zzb(this.f7278a, this.f7279b);
    }
}
