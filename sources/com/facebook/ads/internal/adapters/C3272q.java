package com.facebook.ads.internal.adapters;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p047k.C1486f;
import com.facebook.ads.internal.p047k.C1488g;
import com.facebook.ads.internal.p047k.C1488g.C1487a;
import com.facebook.ads.internal.p047k.C1490h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.q */
public class C3272q implements C1487a {
    /* renamed from: a */
    private final String f10004a;
    /* renamed from: b */
    private final String f10005b;
    /* renamed from: c */
    private final C1486f f10006c;
    /* renamed from: d */
    private final Collection<String> f10007d;
    /* renamed from: e */
    private final Map<String, String> f10008e;
    /* renamed from: f */
    private final String f10009f;
    /* renamed from: g */
    private final int f10010g;
    /* renamed from: h */
    private final int f10011h;
    /* renamed from: i */
    private final int f10012i;
    /* renamed from: j */
    private final String f10013j;

    private C3272q(String str, String str2, C1486f c1486f, Collection<String> collection, Map<String, String> map, String str3, int i, int i2, int i3, String str4) {
        this.f10004a = str;
        this.f10005b = str2;
        this.f10006c = c1486f;
        this.f10007d = collection;
        this.f10008e = map;
        this.f10009f = str3;
        this.f10010g = i;
        this.f10011h = i2;
        this.f10012i = i3;
        this.f10013j = str4;
    }

    /* renamed from: a */
    public static C3272q m12566a(Bundle bundle) {
        return new C3272q(C1490h.m5247a(bundle.getByteArray("markup")), null, C1486f.NONE, null, null, bundle.getString("request_id"), bundle.getInt("viewability_check_initial_delay"), bundle.getInt("viewability_check_interval"), bundle.getInt("skip_after_seconds", 0), bundle.getString("ct"));
    }

    /* renamed from: a */
    public static C3272q m12567a(JSONObject jSONObject) {
        JSONArray jSONArray = null;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("markup");
        String optString2 = jSONObject.optString("activation_command");
        String optString3 = jSONObject.optString("request_id");
        String a = C1490h.m5245a(jSONObject, "ct");
        C1486f a2 = C1486f.m5229a(jSONObject.optString("invalidation_behavior"));
        try {
            jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Collection a3 = C1488g.m5233a(jSONArray);
        jSONObject = jSONObject.optJSONObject("metadata");
        Map hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, jSONObject.optString(str));
            }
        }
        return new C3272q(optString, optString2, a2, a3, hashMap, optString3, hashMap.containsKey("viewability_check_initial_delay") ? Integer.parseInt((String) hashMap.get("viewability_check_initial_delay")) : 0, hashMap.containsKey("viewability_check_interval") ? Integer.parseInt((String) hashMap.get("viewability_check_interval")) : AdError.NETWORK_ERROR_CODE, hashMap.containsKey("skip_after_seconds") ? Integer.parseInt((String) hashMap.get("skip_after_seconds")) : 0, a);
    }

    /* renamed from: b */
    public static C3272q m12568b(Intent intent) {
        return new C3272q(C1490h.m5247a(intent.getByteArrayExtra("markup")), intent.getStringExtra("activation_command"), C1486f.NONE, null, null, intent.getStringExtra("request_id"), intent.getIntExtra("viewability_check_initial_delay", 0), intent.getIntExtra("viewability_check_interval", AdError.NETWORK_ERROR_CODE), intent.getIntExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, 0), intent.getStringExtra("ct"));
    }

    /* renamed from: D */
    public String mo1728D() {
        return this.f10013j;
    }

    /* renamed from: F */
    public C1486f mo1729F() {
        return this.f10006c;
    }

    /* renamed from: G */
    public Collection<String> mo1730G() {
        return this.f10007d;
    }

    /* renamed from: a */
    public String m12572a() {
        return this.f10004a;
    }

    /* renamed from: a */
    public void m12573a(Intent intent) {
        intent.putExtra("markup", C1490h.m5256a(this.f10004a));
        intent.putExtra("activation_command", this.f10005b);
        intent.putExtra("request_id", this.f10009f);
        intent.putExtra("viewability_check_initial_delay", this.f10010g);
        intent.putExtra("viewability_check_interval", this.f10011h);
        intent.putExtra(AudienceNetworkActivity.SKIP_DELAY_SECONDS_KEY, this.f10012i);
        intent.putExtra("ct", this.f10013j);
    }

    /* renamed from: b */
    public String m12574b() {
        return this.f10005b;
    }

    /* renamed from: c */
    public Map<String, String> m12575c() {
        return this.f10008e;
    }

    /* renamed from: d */
    public String m12576d() {
        return this.f10009f;
    }

    /* renamed from: e */
    public int m12577e() {
        return this.f10010g;
    }

    /* renamed from: f */
    public int m12578f() {
        return this.f10011h;
    }

    /* renamed from: g */
    public Bundle m12579g() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("markup", C1490h.m5256a(this.f10004a));
        bundle.putString("request_id", this.f10009f);
        bundle.putInt("viewability_check_initial_delay", this.f10010g);
        bundle.putInt("viewability_check_interval", this.f10011h);
        bundle.putInt("skip_after_seconds", this.f10012i);
        bundle.putString("ct", this.f10013j);
        return bundle;
    }
}
