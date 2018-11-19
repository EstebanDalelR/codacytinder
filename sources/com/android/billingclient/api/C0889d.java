package com.android.billingclient.api;

import android.text.TextUtils;
import com.tinder.api.ManagerWebServices;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.d */
public class C0889d {
    /* renamed from: a */
    private final String f2314a;
    /* renamed from: b */
    private final String f2315b;
    /* renamed from: c */
    private final JSONObject f2316c = new JSONObject(this.f2314a);

    /* renamed from: com.android.billingclient.api.d$a */
    public static class C0888a {
        /* renamed from: a */
        private List<C0889d> f2312a;
        /* renamed from: b */
        private int f2313b;

        C0888a(int i, List<C0889d> list) {
            this.f2312a = list;
            this.f2313b = i;
        }

        /* renamed from: a */
        public int m3001a() {
            return this.f2313b;
        }

        /* renamed from: b */
        public List<C0889d> m3002b() {
            return this.f2312a;
        }
    }

    public C0889d(String str, String str2) throws JSONException {
        this.f2314a = str;
        this.f2315b = str2;
    }

    /* renamed from: a */
    public String m3003a() {
        return this.f2316c.optString("productId");
    }

    /* renamed from: b */
    public long m3004b() {
        return this.f2316c.optLong("purchaseTime");
    }

    /* renamed from: c */
    public String m3005c() {
        return this.f2316c.optString(ManagerWebServices.PARAM_TOKEN, this.f2316c.optString("purchaseToken"));
    }

    /* renamed from: d */
    public String m3006d() {
        return this.f2314a;
    }

    /* renamed from: e */
    public String m3007e() {
        return this.f2315b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Purchase. Json: ");
        stringBuilder.append(this.f2314a);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0889d)) {
            return false;
        }
        C0889d c0889d = (C0889d) obj;
        if (!TextUtils.equals(this.f2314a, c0889d.m3006d()) || TextUtils.equals(this.f2315b, c0889d.m3007e()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f2314a.hashCode();
    }
}
