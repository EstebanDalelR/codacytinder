package com.google.android.gms.internal;

import org.json.JSONObject;

final class ag implements Runnable {
    /* renamed from: a */
    final /* synthetic */ JSONObject f15154a;
    /* renamed from: b */
    final /* synthetic */ String f15155b;
    /* renamed from: c */
    private /* synthetic */ ae f15156c;

    ag(ae aeVar, JSONObject jSONObject, String str) {
        this.f15156c = aeVar;
        this.f15154a = jSONObject;
        this.f15155b = str;
    }

    public final void run() {
        this.f15156c.f26550l = ae.f26542d.b(null);
        this.f15156c.f26550l.zza(new ah(this), new ai(this));
    }
}
