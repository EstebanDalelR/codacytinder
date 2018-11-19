package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.e */
public class C0891e {
    /* renamed from: a */
    private final String f2319a;
    /* renamed from: b */
    private final JSONObject f2320b = new JSONObject(this.f2319a);

    /* renamed from: com.android.billingclient.api.e$a */
    static class C0890a {
        /* renamed from: a */
        private List<C0891e> f2317a;
        /* renamed from: b */
        private int f2318b;

        C0890a(int i, List<C0891e> list) {
            this.f2317a = list;
            this.f2318b = i;
        }

        /* renamed from: a */
        List<C0891e> m3008a() {
            return this.f2317a;
        }

        /* renamed from: b */
        int m3009b() {
            return this.f2318b;
        }
    }

    public C0891e(String str) throws JSONException {
        this.f2319a = str;
    }

    /* renamed from: a */
    public String m3010a() {
        return this.f2320b.optString("productId");
    }

    /* renamed from: b */
    public long m3011b() {
        return this.f2320b.optLong("price_amount_micros");
    }

    /* renamed from: c */
    public String m3012c() {
        return this.f2320b.optString("price_currency_code");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SkuDetails: ");
        stringBuilder.append(this.f2319a);
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return TextUtils.equals(this.f2319a, ((C0891e) obj).f2319a);
            }
        }
        return null;
    }

    public int hashCode() {
        return this.f2319a.hashCode();
    }
}
