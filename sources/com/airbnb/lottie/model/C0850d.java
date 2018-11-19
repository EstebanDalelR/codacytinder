package com.airbnb.lottie.model;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.airbnb.lottie.model.d */
public class C0850d {
    /* renamed from: a */
    public String f2205a;
    /* renamed from: b */
    public String f2206b;
    /* renamed from: c */
    public int f2207c;
    /* renamed from: d */
    int f2208d;
    /* renamed from: e */
    public int f2209e;
    /* renamed from: f */
    double f2210f;
    @ColorInt
    /* renamed from: g */
    public int f2211g;
    @ColorInt
    /* renamed from: h */
    public int f2212h;
    /* renamed from: i */
    public int f2213i;
    /* renamed from: j */
    public boolean f2214j;

    /* renamed from: com.airbnb.lottie.model.d$a */
    public static final class C0849a {
        /* renamed from: a */
        public static C0850d m2921a(JSONObject jSONObject) {
            int i;
            int argb;
            JSONObject jSONObject2 = jSONObject;
            String optString = jSONObject2.optString("t");
            String optString2 = jSONObject2.optString("f");
            int optInt = jSONObject2.optInt("s");
            int optInt2 = jSONObject2.optInt("j");
            int optInt3 = jSONObject2.optInt("tr");
            double optDouble = jSONObject2.optDouble("lh");
            JSONArray optJSONArray = jSONObject2.optJSONArray("fc");
            String str = optString;
            int argb2 = Color.argb(255, (int) (optJSONArray.optDouble(0) * 255.0d), (int) (optJSONArray.optDouble(1) * 255.0d), (int) (optJSONArray.optDouble(2) * 255.0d));
            optJSONArray = jSONObject2.optJSONArray("sc");
            if (optJSONArray != null) {
                i = argb2;
                argb = Color.argb(255, (int) (optJSONArray.optDouble(0) * 255.0d), (int) (optJSONArray.optDouble(1) * 255.0d), (int) (optJSONArray.optDouble(2) * 255.0d));
            } else {
                i = argb2;
                argb = 0;
            }
            return new C0850d(str, optString2, optInt, optInt2, optInt3, optDouble, i, argb, jSONObject2.optInt("sw"), jSONObject2.optBoolean("of"));
        }
    }

    C0850d(String str, String str2, int i, int i2, int i3, double d, @ColorInt int i4, @ColorInt int i5, int i6, boolean z) {
        this.f2205a = str;
        this.f2206b = str2;
        this.f2207c = i;
        this.f2208d = i2;
        this.f2209e = i3;
        this.f2210f = d;
        this.f2211g = i4;
        this.f2212h = i5;
        this.f2213i = i6;
        this.f2214j = z;
    }

    public int hashCode() {
        int hashCode = (((((((this.f2205a.hashCode() * 31) + this.f2206b.hashCode()) * 31) + this.f2207c) * 31) + this.f2208d) * 31) + this.f2209e;
        long doubleToLongBits = Double.doubleToLongBits(this.f2210f);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f2211g;
    }
}
