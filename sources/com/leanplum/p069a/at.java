package com.leanplum.p069a;

import org.json.JSONObject;

/* renamed from: com.leanplum.a.at */
final class at implements Runnable {
    /* renamed from: a */
    private /* synthetic */ JSONObject f21172a;
    /* renamed from: b */
    private /* synthetic */ C7037n f21173b;

    at(C7037n c7037n, JSONObject jSONObject) {
        this.f21173b = c7037n;
        this.f21172a = jSONObject;
    }

    public final void run() {
        try {
            if (!aw.b(this.f21172a)) {
                ao.a(new Object[]{aw.c(this.f21172a)});
                if (this.f21173b.f25592a != null) {
                    this.f21173b.f25592a.onResponse(false);
                }
            } else if (this.f21173b.f25592a != null) {
                this.f21173b.f25592a.onResponse(true);
            }
        } catch (Throwable th) {
            bo.a(th);
        }
    }
}
