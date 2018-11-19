package com.facebook.ads.internal.p047k;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.k.o */
public class C1501o {
    /* renamed from: a */
    private final String f4158a;
    /* renamed from: b */
    private final Map<String, String> f4159b;
    /* renamed from: c */
    private final String f4160c;

    public C1501o(String str, Map<String, String> map) {
        this(str, map, false);
    }

    public C1501o(String str, Map<String, String> map, boolean z) {
        this.f4158a = str;
        this.f4159b = map;
        this.f4160c = z ? "1" : "0";
    }

    /* renamed from: a */
    public Map<String, String> m5284a() {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("stacktrace", this.f4158a);
        hashMap.put("caught_exception", this.f4160c);
        hashMap.putAll(this.f4159b);
        return hashMap;
    }
}
