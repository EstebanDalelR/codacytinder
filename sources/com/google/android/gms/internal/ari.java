package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.ar;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class ari {
    /* renamed from: a */
    public final String f15622a;
    /* renamed from: b */
    public final String f15623b;
    /* renamed from: c */
    public final List<String> f15624c;
    /* renamed from: d */
    public final String f15625d;
    /* renamed from: e */
    public final String f15626e;
    /* renamed from: f */
    public final List<String> f15627f;
    /* renamed from: g */
    public final List<String> f15628g;
    /* renamed from: h */
    public final List<String> f15629h;
    /* renamed from: i */
    public final List<String> f15630i;
    /* renamed from: j */
    public final String f15631j;
    /* renamed from: k */
    public final List<String> f15632k;
    /* renamed from: l */
    public final List<String> f15633l;
    @Nullable
    /* renamed from: m */
    public final String f15634m;
    @Nullable
    /* renamed from: n */
    public final String f15635n;
    /* renamed from: o */
    public final String f15636o;
    @Nullable
    /* renamed from: p */
    public final List<String> f15637p;
    /* renamed from: q */
    public final String f15638q;
    /* renamed from: r */
    public final long f15639r;
    @Nullable
    /* renamed from: s */
    private String f15640s;

    public ari(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, String str5, String str6, List<String> list5, List<String> list6, String str7, String str8, String str9, List<String> list7, String str10, List<String> list8, String str11, long j) {
        this.f15622a = str;
        this.f15623b = null;
        this.f15624c = list;
        this.f15625d = null;
        this.f15626e = null;
        this.f15627f = list2;
        this.f15628g = list3;
        this.f15629h = list4;
        this.f15631j = str5;
        this.f15632k = list5;
        this.f15633l = list6;
        this.f15634m = null;
        this.f15635n = null;
        this.f15636o = null;
        this.f15637p = null;
        this.f15638q = null;
        this.f15630i = list8;
        this.f15640s = null;
        this.f15639r = -1;
    }

    public ari(JSONObject jSONObject) throws JSONException {
        List a;
        this.f15623b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        List arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f15624c = Collections.unmodifiableList(arrayList);
        this.f15625d = jSONObject.optString("allocation_id", null);
        ar.v();
        this.f15627f = arp.m19461a(jSONObject, "clickurl");
        ar.v();
        this.f15628g = arp.m19461a(jSONObject, "imp_urls");
        ar.v();
        this.f15630i = arp.m19461a(jSONObject, "fill_urls");
        ar.v();
        this.f15632k = arp.m19461a(jSONObject, "video_start_urls");
        ar.v();
        this.f15633l = arp.m19461a(jSONObject, "video_complete_urls");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            ar.v();
            a = arp.m19461a(optJSONObject, "manual_impression_urls");
        } else {
            a = null;
        }
        this.f15629h = a;
        this.f15622a = optJSONObject != null ? optJSONObject.toString() : null;
        optJSONObject = jSONObject.optJSONObject(ManagerWebServices.FB_DATA);
        this.f15631j = optJSONObject != null ? optJSONObject.toString() : null;
        this.f15626e = optJSONObject != null ? optJSONObject.optString("class_name") : null;
        this.f15634m = jSONObject.optString("html_template", null);
        this.f15635n = jSONObject.optString("ad_base_url", null);
        optJSONObject = jSONObject.optJSONObject(ManagerWebServices.PARAM_KEY_ASSETS);
        this.f15636o = optJSONObject != null ? optJSONObject.toString() : null;
        ar.v();
        this.f15637p = arp.m19461a(jSONObject, "template_ids");
        optJSONObject = jSONObject.optJSONObject("ad_loader_options");
        this.f15638q = optJSONObject != null ? optJSONObject.toString() : null;
        this.f15640s = jSONObject.optString(QueryParams.RESPONSE_TYPE, null);
        this.f15639r = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    /* renamed from: a */
    public final boolean m19457a() {
        return "banner".equalsIgnoreCase(this.f15640s);
    }

    /* renamed from: b */
    public final boolean m19458b() {
        return "native".equalsIgnoreCase(this.f15640s);
    }
}
