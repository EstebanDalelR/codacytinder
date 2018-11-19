package com.airbnb.lottie.model;

import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.f */
public class C0852f {
    /* renamed from: a */
    private final String f2215a;
    /* renamed from: b */
    private final String f2216b;
    /* renamed from: c */
    private final String f2217c;
    /* renamed from: d */
    private final float f2218d;

    /* renamed from: com.airbnb.lottie.model.f$a */
    public static class C0851a {
        /* renamed from: a */
        public static C0852f m2922a(JSONObject jSONObject) {
            return new C0852f(jSONObject.optString("fFamily"), jSONObject.optString("fName"), jSONObject.optString("fStyle"), (float) jSONObject.optDouble("ascent"));
        }
    }

    C0852f(String str, String str2, String str3, float f) {
        this.f2215a = str;
        this.f2216b = str2;
        this.f2217c = str3;
        this.f2218d = f;
    }

    /* renamed from: a */
    public String m2923a() {
        return this.f2215a;
    }

    /* renamed from: b */
    public String m2924b() {
        return this.f2216b;
    }

    /* renamed from: c */
    public String m2925c() {
        return this.f2217c;
    }
}
