package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@zzzv
public final class dp {
    /* renamed from: a */
    private final long f16019a;
    /* renamed from: b */
    private final List<String> f16020b = new ArrayList();
    /* renamed from: c */
    private final List<String> f16021c = new ArrayList();
    /* renamed from: d */
    private final Map<String, arj> f16022d = new HashMap();
    /* renamed from: e */
    private String f16023e;
    /* renamed from: f */
    private String f16024f;
    /* renamed from: g */
    private boolean f16025g = false;

    public dp(String str, long j) {
        this.f16024f = str;
        this.f16019a = j;
        m19629a(str);
    }

    /* renamed from: a */
    private final void m19629a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = 0;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f16025g = false;
                    hx.m19916e("App settings could not be fetched successfully.");
                    return;
                }
                this.f16025g = true;
                this.f16023e = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        CharSequence optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f16021c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    jSONObject2 = jSONObject2.optJSONObject("mediation_config");
                                    if (jSONObject2 != null) {
                                        this.f16022d.put(optString2, new arj(jSONObject2));
                                    }
                                }
                            }
                        }
                        i++;
                    }
                }
                m19630a(jSONObject);
            } catch (Throwable e) {
                hx.m19914c("Exception occurred while processing app setting json", e);
                ar.i().m27296a(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    private final void m19630a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f16020b.add(optJSONArray.optString(i));
            }
        }
    }

    /* renamed from: a */
    public final long m19631a() {
        return this.f16019a;
    }

    /* renamed from: b */
    public final boolean m19632b() {
        return this.f16025g;
    }

    /* renamed from: c */
    public final String m19633c() {
        return this.f16024f;
    }

    /* renamed from: d */
    public final String m19634d() {
        return this.f16023e;
    }

    /* renamed from: e */
    public final Map<String, arj> m19635e() {
        return this.f16022d;
    }
}
