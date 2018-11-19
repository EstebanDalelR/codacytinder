package com.airbnb.lottie;

import java.util.Map;

/* renamed from: com.airbnb.lottie.h */
public class C0799h {
    /* renamed from: a */
    private final Map<String, String> f2180a;
    /* renamed from: b */
    private boolean f2181b;

    /* renamed from: a */
    public String m2866a(String str) {
        return str;
    }

    /* renamed from: b */
    public final String m2867b(String str) {
        if (this.f2181b && this.f2180a.containsKey(str)) {
            return (String) this.f2180a.get(str);
        }
        String a = m2866a(str);
        if (this.f2181b) {
            this.f2180a.put(str, a);
        }
        return a;
    }
}
