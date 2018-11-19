package com.facebook.ads.internal.p047k;

import android.support.annotation.Nullable;
import com.facebook.ads.internal.server.AdPlacementType;
import com.tinder.api.ManagerWebServices;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.k.b */
public class C1481b {
    /* renamed from: a */
    public static String f4104a;
    /* renamed from: b */
    private String f4105b;
    /* renamed from: c */
    private Map<String, Object> f4106c;
    /* renamed from: d */
    private int f4107d;
    /* renamed from: e */
    private String f4108e;

    /* renamed from: com.facebook.ads.internal.k.b$a */
    public enum C1479a {
        OPEN_STORE(0),
        OPEN_LINK(1),
        XOUT(2),
        OPEN_URL(3),
        SHOW_INTERSTITIAL(4);
        
        /* renamed from: f */
        int f4100f;

        private C1479a(int i) {
            this.f4100f = i;
        }
    }

    /* renamed from: com.facebook.ads.internal.k.b$b */
    public enum C1480b {
        LOADING_AD(0);
        
        /* renamed from: b */
        int f4103b;

        private C1480b(int i) {
            this.f4103b = i;
        }
    }

    public C1481b(String str, Map<String, Object> map, int i, String str2) {
        this.f4105b = str;
        this.f4106c = map;
        this.f4107d = i;
        this.f4108e = str2;
    }

    /* renamed from: a */
    public static C1481b m5213a(long j, C1479a c1479a, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Map hashMap = new HashMap();
        hashMap.put("Time", String.valueOf(currentTimeMillis - j));
        hashMap.put("AdAction", String.valueOf(c1479a.f4100f));
        return new C1481b("bounceback", hashMap, (int) (currentTimeMillis / 1000), str);
    }

    /* renamed from: a */
    public static C1481b m5214a(C1480b c1480b, AdPlacementType adPlacementType, long j, String str) {
        Map hashMap = new HashMap();
        hashMap.put("LatencyType", String.valueOf(c1480b.f4103b));
        hashMap.put("AdPlacementType", adPlacementType.toString());
        hashMap.put("Time", String.valueOf(j));
        String str2 = "latency";
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (str == null) {
            str = f4104a;
        }
        return new C1481b(str2, hashMap, currentTimeMillis, str);
    }

    /* renamed from: a */
    public static C1481b m5215a(@Nullable Throwable th, @Nullable String str) {
        Map hashMap = new HashMap();
        if (th != null) {
            hashMap.put("ex", th.getClass().getSimpleName());
            hashMap.put("ex_msg", th.getMessage());
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        String str2 = "error";
        if (str == null) {
            str = f4104a;
        }
        return new C1481b(str2, hashMap, currentTimeMillis, str);
    }

    /* renamed from: a */
    public JSONObject m5216a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f4105b);
            jSONObject.put(ManagerWebServices.FB_DATA, new JSONObject(this.f4106c));
            jSONObject.put("time", this.f4107d);
            jSONObject.put("request_id", this.f4108e);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
