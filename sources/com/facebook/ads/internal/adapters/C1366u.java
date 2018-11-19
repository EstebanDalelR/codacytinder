package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.p047k.C1502p;
import com.tinder.api.ManagerWebServices;
import com.tinder.model.analytics.AnalyticsConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.u */
public class C1366u implements Serializable {
    private static final long serialVersionUID = 8751287062553772011L;
    /* renamed from: a */
    private final List<C1353c> f3691a;
    /* renamed from: b */
    private final String f3692b;
    /* renamed from: c */
    private final String f3693c;
    /* renamed from: d */
    private final C1359i f3694d;
    /* renamed from: e */
    private final String f3695e;
    /* renamed from: f */
    private final String f3696f;
    /* renamed from: g */
    private final C1359i f3697g;
    /* renamed from: h */
    private final String f3698h;
    /* renamed from: i */
    private final int f3699i;
    /* renamed from: j */
    private final int f3700j;

    private C1366u(List<C1353c> list, String str, String str2, String str3, String str4, String str5, C1359i c1359i, C1359i c1359i2, int i, int i2) {
        this.f3691a = list;
        this.f3692b = str;
        this.f3693c = str2;
        this.f3694d = c1359i2;
        this.f3695e = str3;
        this.f3696f = str4;
        this.f3697g = c1359i;
        this.f3698h = str5;
        this.f3699i = i;
        this.f3700j = i2;
    }

    /* renamed from: a */
    public static C1366u m4761a(JSONObject jSONObject, Context context) {
        String optString = jSONObject.optString("ad_choices_link_url");
        String optString2 = jSONObject.optString("ct");
        String optString3 = jSONObject.optString(ManagerWebServices.PARAM_JOB_TITLE);
        int i = 0;
        int optInt = jSONObject.optInt("viewability_check_initial_delay", 0);
        int optInt2 = jSONObject.optInt("viewability_check_interval", AdError.NETWORK_ERROR_CODE);
        String str = "";
        JSONObject optJSONObject = jSONObject.optJSONObject(AnalyticsConstants.VALUE_SHARE_METHOD_ICON);
        if (optJSONObject != null) {
            str = optJSONObject.optString("url");
        }
        String str2 = str;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("layout");
        optJSONObject = null;
        if (optJSONObject2 != null) {
            optJSONObject = optJSONObject2.optJSONObject("portrait");
            optJSONObject2 = optJSONObject2.optJSONObject("landscape");
        } else {
            optJSONObject2 = null;
        }
        C1359i a = C1359i.m4752a(optJSONObject);
        C1359i a2 = C1359i.m4752a(optJSONObject2);
        String optString4 = jSONObject.optString("request_id", "");
        JSONArray optJSONArray = jSONObject.optJSONArray(ManagerWebServices.PARAM_CAROUSEL);
        List arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            arrayList.add(C1353c.m4734a(jSONObject));
        } else {
            while (i < optJSONArray.length()) {
                try {
                    arrayList.add(C1353c.m4734a(optJSONArray.getJSONObject(i)));
                } catch (Exception e) {
                    C1502p.m5285a(e, context);
                    e.printStackTrace();
                }
                i++;
            }
        }
        return new C1366u(arrayList, optString, optString2, optString3, str2, optString4, a, a2, optInt, optInt2);
    }

    /* renamed from: a */
    public String m4762a() {
        return this.f3693c;
    }

    /* renamed from: b */
    public String m4763b() {
        return this.f3695e;
    }

    /* renamed from: c */
    public String m4764c() {
        return this.f3696f;
    }

    /* renamed from: d */
    public List<C1353c> m4765d() {
        return Collections.unmodifiableList(this.f3691a);
    }

    /* renamed from: e */
    public String m4766e() {
        return this.f3692b;
    }

    /* renamed from: f */
    public String m4767f() {
        return this.f3698h;
    }

    /* renamed from: g */
    public C1359i m4768g() {
        return this.f3697g;
    }

    /* renamed from: h */
    public C1359i m4769h() {
        return this.f3694d;
    }

    /* renamed from: i */
    public int m4770i() {
        return this.f3699i;
    }

    /* renamed from: j */
    public int m4771j() {
        return this.f3700j;
    }
}
