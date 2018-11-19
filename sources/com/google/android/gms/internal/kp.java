package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

final class kp implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f16277a;
    /* renamed from: b */
    private /* synthetic */ String f16278b;
    /* renamed from: c */
    private /* synthetic */ int f16279c;
    /* renamed from: d */
    private /* synthetic */ int f16280d;
    /* renamed from: e */
    private /* synthetic */ boolean f16281e = false;
    /* renamed from: f */
    private /* synthetic */ ko f16282f;

    kp(ko koVar, String str, String str2, int i, int i2, boolean z) {
        this.f16282f = koVar;
        this.f16277a = str;
        this.f16278b = str2;
        this.f16279c = i;
        this.f16280d = i2;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f16277a);
        hashMap.put("cachedSrc", this.f16278b);
        hashMap.put("bytesLoaded", Integer.toString(this.f16279c));
        hashMap.put("totalBytes", Integer.toString(this.f16280d));
        hashMap.put("cacheReady", this.f16281e ? "1" : "0");
        this.f16282f.m27419a("onPrecacheEvent", hashMap);
    }
}
