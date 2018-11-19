package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.ar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
public final class arj {
    /* renamed from: a */
    public final List<ari> f15641a;
    /* renamed from: b */
    public final long f15642b;
    /* renamed from: c */
    public final List<String> f15643c;
    /* renamed from: d */
    public final List<String> f15644d;
    /* renamed from: e */
    public final List<String> f15645e;
    /* renamed from: f */
    public final List<String> f15646f;
    /* renamed from: g */
    public final boolean f15647g;
    /* renamed from: h */
    public final String f15648h;
    /* renamed from: i */
    public final long f15649i;
    /* renamed from: j */
    public final String f15650j;
    /* renamed from: k */
    public final int f15651k;
    /* renamed from: l */
    public final int f15652l;
    /* renamed from: m */
    public final long f15653m;
    /* renamed from: n */
    public final boolean f15654n;
    /* renamed from: o */
    public final boolean f15655o;
    /* renamed from: p */
    public final boolean f15656p;
    /* renamed from: q */
    public int f15657q;
    /* renamed from: r */
    public int f15658r;
    /* renamed from: s */
    public boolean f15659s;

    public arj(String str) throws JSONException {
        this(new JSONObject(str));
    }

    public arj(List<ari> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f15641a = list;
        this.f15642b = j;
        this.f15643c = list2;
        this.f15644d = list3;
        this.f15645e = list4;
        this.f15646f = list5;
        this.f15647g = z;
        this.f15648h = str;
        this.f15649i = -1;
        this.f15657q = 0;
        this.f15658r = 1;
        this.f15650j = null;
        this.f15651k = 0;
        this.f15652l = -1;
        this.f15653m = -1;
        this.f15654n = false;
        this.f15655o = false;
        this.f15656p = false;
        this.f15659s = false;
    }

    public arj(JSONObject jSONObject) throws JSONException {
        if (hx.m19910a(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            ec.m27332a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        List arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            ari ari = new ari(jSONArray.getJSONObject(i2));
            if (ari.m19457a()) {
                this.f15659s = true;
            }
            arrayList.add(ari);
            if (i < 0 && m19459a(ari)) {
                i = i2;
            }
        }
        this.f15657q = i;
        this.f15658r = jSONArray.length();
        this.f15641a = Collections.unmodifiableList(arrayList);
        this.f15648h = jSONObject.optString("qdata");
        this.f15652l = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.f15653m = jSONObject.optLong("timeout_ms", -1);
        jSONObject = jSONObject.optJSONObject("settings");
        if (jSONObject != null) {
            this.f15642b = jSONObject.optLong("ad_network_timeout_millis", -1);
            ar.v();
            this.f15643c = arp.m19461a(jSONObject, "click_urls");
            ar.v();
            this.f15644d = arp.m19461a(jSONObject, "imp_urls");
            ar.v();
            this.f15645e = arp.m19461a(jSONObject, "nofill_urls");
            ar.v();
            this.f15646f = arp.m19461a(jSONObject, "remote_ping_urls");
            this.f15647g = jSONObject.optBoolean("render_in_browser", false);
            long optLong = jSONObject.optLong("refresh", -1);
            if (optLong > 0) {
                j = 1000 * optLong;
            }
            this.f15649i = j;
            zzaeq zza = zzaeq.zza(jSONObject.optJSONArray("rewards"));
            if (zza == null) {
                this.f15650j = null;
                this.f15651k = 0;
            } else {
                this.f15650j = zza.type;
                this.f15651k = zza.zzcwd;
            }
            this.f15654n = jSONObject.optBoolean("use_displayed_impression", false);
            this.f15655o = jSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.f15656p = jSONObject.optBoolean("allow_pub_owned_ad_view", false);
            return;
        }
        this.f15642b = -1;
        this.f15643c = null;
        this.f15644d = null;
        this.f15645e = null;
        this.f15646f = null;
        this.f15649i = -1;
        this.f15650j = null;
        this.f15651k = 0;
        this.f15654n = false;
        this.f15647g = false;
        this.f15655o = false;
        this.f15656p = false;
    }

    /* renamed from: a */
    private static boolean m19459a(ari ari) {
        for (String equals : ari.f15624c) {
            if (equals.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
        }
        return false;
    }
}
