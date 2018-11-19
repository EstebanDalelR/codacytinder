package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzzv
public final class ba {
    /* renamed from: a */
    private final List<String> f15832a;
    /* renamed from: b */
    private final String f15833b;
    /* renamed from: c */
    private final String f15834c;
    /* renamed from: d */
    private final String f15835d;
    /* renamed from: e */
    private final boolean f15836e;
    /* renamed from: f */
    private final String f15837f;
    /* renamed from: g */
    private final String f15838g;
    /* renamed from: h */
    private String f15839h;
    /* renamed from: i */
    private final int f15840i;
    /* renamed from: j */
    private final boolean f15841j;
    /* renamed from: k */
    private final JSONObject f15842k;

    public ba(int i, Map<String, String> map) {
        this.f15839h = (String) map.get("url");
        this.f15833b = (String) map.get("base_uri");
        this.f15834c = (String) map.get("post_parameters");
        this.f15836e = m19542b((String) map.get("drt_include"));
        this.f15837f = (String) map.get("request_id");
        this.f15835d = (String) map.get("type");
        this.f15832a = m19543c((String) map.get("errors"));
        this.f15840i = i;
        this.f15838g = (String) map.get("fetched_ad");
        this.f15841j = m19542b((String) map.get("render_test_ad_label"));
        this.f15842k = new JSONObject();
    }

    public ba(JSONObject jSONObject) {
        this.f15839h = jSONObject.optString("url");
        this.f15833b = jSONObject.optString("base_uri");
        this.f15834c = jSONObject.optString("post_parameters");
        this.f15836e = m19542b(jSONObject.optString("drt_include"));
        this.f15837f = jSONObject.optString("request_id");
        this.f15835d = jSONObject.optString("type");
        this.f15832a = m19543c(jSONObject.optString("errors"));
        int i = 1;
        if (jSONObject.optInt("valid", 0) == 1) {
            i = -2;
        }
        this.f15840i = i;
        this.f15838g = jSONObject.optString("fetched_ad");
        this.f15841j = jSONObject.optBoolean("render_test_ad_label");
        jSONObject = jSONObject.optJSONObject("preprocessor_flags");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f15842k = jSONObject;
    }

    /* renamed from: b */
    private static boolean m19542b(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    /* renamed from: c */
    private static List<String> m19543c(String str) {
        return str == null ? null : Arrays.asList(str.split(","));
    }

    /* renamed from: a */
    public final int m19544a() {
        return this.f15840i;
    }

    /* renamed from: a */
    public final void m19545a(String str) {
        this.f15839h = str;
    }

    /* renamed from: b */
    public final List<String> m19546b() {
        return this.f15832a;
    }

    /* renamed from: c */
    public final String m19547c() {
        return this.f15833b;
    }

    /* renamed from: d */
    public final String m19548d() {
        return this.f15834c;
    }

    /* renamed from: e */
    public final String m19549e() {
        return this.f15839h;
    }

    /* renamed from: f */
    public final String m19550f() {
        return this.f15835d;
    }

    /* renamed from: g */
    public final boolean m19551g() {
        return this.f15836e;
    }

    /* renamed from: h */
    public final String m19552h() {
        return this.f15837f;
    }

    /* renamed from: i */
    public final String m19553i() {
        return this.f15838g;
    }

    /* renamed from: j */
    public final boolean m19554j() {
        return this.f15841j;
    }
}
