package com.leanplum.p069a;

import org.json.JSONObject;

/* renamed from: com.leanplum.a.bi */
final class bi implements Runnable {
    /* renamed from: a */
    private /* synthetic */ JSONObject f21207a;
    /* renamed from: b */
    private /* synthetic */ C5727q f21208b;

    bi(C5727q c5727q, JSONObject jSONObject) {
        this.f21208b = c5727q;
        this.f21207a = jSONObject;
    }

    public final void run() {
        this.f21208b.f21280Y.m25056b(String.format("5:::%s", new Object[]{this.f21207a.toString()}));
    }
}
