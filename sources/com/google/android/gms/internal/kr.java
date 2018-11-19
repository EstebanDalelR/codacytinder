package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

final class kr implements Runnable {
    /* renamed from: a */
    private /* synthetic */ String f16287a;
    /* renamed from: b */
    private /* synthetic */ String f16288b;
    /* renamed from: c */
    private /* synthetic */ String f16289c;
    /* renamed from: d */
    private /* synthetic */ String f16290d;
    /* renamed from: e */
    private /* synthetic */ ko f16291e;

    kr(ko koVar, String str, String str2, String str3, String str4) {
        this.f16291e = koVar;
        this.f16287a = str;
        this.f16288b = str2;
        this.f16289c = str3;
        this.f16290d = str4;
    }

    public final void run() {
        Map hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f16287a);
        if (!TextUtils.isEmpty(this.f16288b)) {
            hashMap.put("cachedSrc", this.f16288b);
        }
        hashMap.put("type", ko.m27420b(this.f16289c));
        hashMap.put("reason", this.f16289c);
        if (!TextUtils.isEmpty(this.f16290d)) {
            hashMap.put("message", this.f16290d);
        }
        this.f16291e.m27419a("onPrecacheEvent", hashMap);
    }
}
