package com.facebook.ads.internal.p047k;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.k.j */
public class C1492j {
    /* renamed from: a */
    private final String f4125a;
    /* renamed from: b */
    private final String f4126b;
    /* renamed from: c */
    private final String f4127c;
    /* renamed from: d */
    private final List<String> f4128d;
    /* renamed from: e */
    private final String f4129e;
    /* renamed from: f */
    private final String f4130f;

    private C1492j(String str, String str2, String str3, List<String> list, String str4, String str5) {
        this.f4125a = str;
        this.f4126b = str2;
        this.f4127c = str3;
        this.f4128d = list;
        this.f4129e = str4;
        this.f4130f = str5;
    }

    /* renamed from: a */
    public static C1492j m5261a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("package");
        String optString2 = jSONObject.optString("appsite");
        String optString3 = jSONObject.optString("appsite_url");
        JSONArray optJSONArray = jSONObject.optJSONArray("key_hashes");
        List arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        return new C1492j(optString, optString2, optString3, arrayList, jSONObject.optString("market_uri"), jSONObject.optString("fallback_url"));
    }

    /* renamed from: a */
    public String m5262a() {
        return this.f4125a;
    }

    /* renamed from: b */
    public String m5263b() {
        return this.f4126b;
    }

    /* renamed from: c */
    public String m5264c() {
        return this.f4127c;
    }
}
