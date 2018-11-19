package com.airbnb.lottie.model;

import com.airbnb.lottie.C0788c;
import com.airbnb.lottie.model.content.C2993i;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.g */
public class C0854g {
    /* renamed from: a */
    private final List<C2993i> f2219a;
    /* renamed from: b */
    private final char f2220b;
    /* renamed from: c */
    private final int f2221c;
    /* renamed from: d */
    private final double f2222d;
    /* renamed from: e */
    private final String f2223e;
    /* renamed from: f */
    private final String f2224f;

    /* renamed from: com.airbnb.lottie.model.g$a */
    public static class C0853a {
        /* renamed from: a */
        public static C0854g m2926a(JSONObject jSONObject, C0788c c0788c) {
            int i = 0;
            char charAt = jSONObject.optString("ch").charAt(0);
            int optInt = jSONObject.optInt(ManagerWebServices.PARAM_SIZE);
            double optDouble = jSONObject.optDouble("w");
            String optString = jSONObject.optString("style");
            String optString2 = jSONObject.optString("fFamily");
            jSONObject = jSONObject.optJSONObject(ManagerWebServices.FB_DATA);
            List emptyList = Collections.emptyList();
            if (jSONObject != null) {
                jSONObject = jSONObject.optJSONArray("shapes");
                if (jSONObject != null) {
                    emptyList = new ArrayList(jSONObject.length());
                    while (i < jSONObject.length()) {
                        emptyList.add((C2993i) C2993i.m11577a(jSONObject.optJSONObject(i), c0788c));
                        i++;
                    }
                }
            }
            return new C0854g(emptyList, charAt, optInt, optDouble, optString, optString2);
        }
    }

    /* renamed from: a */
    public static int m2927a(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    C0854g(List<C2993i> list, char c, int i, double d, String str, String str2) {
        this.f2219a = list;
        this.f2220b = c;
        this.f2221c = i;
        this.f2222d = d;
        this.f2223e = str;
        this.f2224f = str2;
    }

    /* renamed from: a */
    public List<C2993i> m2928a() {
        return this.f2219a;
    }

    /* renamed from: b */
    public double m2929b() {
        return this.f2222d;
    }

    public int hashCode() {
        return C0854g.m2927a(this.f2220b, this.f2224f, this.f2223e);
    }
}
