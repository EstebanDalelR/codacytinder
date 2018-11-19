package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

final class kq implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f16283a;
    /* renamed from: b */
    private /* synthetic */ String f16284b;
    /* renamed from: c */
    private /* synthetic */ int f16285c;
    /* renamed from: d */
    private /* synthetic */ ko f16286d;

    kq(ko koVar, String str, String str2, int i) {
        this.f16286d = koVar;
        this.f16283a = str;
        this.f16284b = str2;
        this.f16285c = i;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f16283a);
        hashMap.put("cachedSrc", this.f16284b);
        hashMap.put("totalBytes", Integer.toString(this.f16285c));
        this.f16286d.m27419a("onPrecacheEvent", hashMap);
    }
}
