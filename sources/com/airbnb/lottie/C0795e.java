package com.airbnb.lottie;

import com.leanplum.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.e */
public class C0795e {
    /* renamed from: a */
    private final int f2176a;
    /* renamed from: b */
    private final int f2177b;
    /* renamed from: c */
    private final String f2178c;
    /* renamed from: d */
    private final String f2179d;

    /* renamed from: com.airbnb.lottie.e$a */
    static class C0794a {
        /* renamed from: a */
        static C0795e m2863a(JSONObject jSONObject) {
            return new C0795e(jSONObject.optInt("w"), jSONObject.optInt("h"), jSONObject.optString("id"), jSONObject.optString(BuildConfig.LEANPLUM_PACKAGE_IDENTIFIER));
        }
    }

    private C0795e(int i, int i2, String str, String str2) {
        this.f2176a = i;
        this.f2177b = i2;
        this.f2178c = str;
        this.f2179d = str2;
    }

    /* renamed from: a */
    public String m2864a() {
        return this.f2178c;
    }

    /* renamed from: b */
    public String m2865b() {
        return this.f2179d;
    }
}
