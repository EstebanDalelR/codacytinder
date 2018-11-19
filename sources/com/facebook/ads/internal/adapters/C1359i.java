package com.facebook.ads.internal.adapters;

import android.graphics.Color;
import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.i */
public class C1359i implements Serializable {
    /* renamed from: a */
    public static final int f3665a = Color.parseColor("#90949c");
    /* renamed from: b */
    public static final int f3666b = Color.parseColor("#4b4f56");
    /* renamed from: c */
    public static final int f3667c = Color.parseColor("#f6f7f9");
    /* renamed from: d */
    public static final int f3668d = Color.parseColor("#ff4080ff");
    /* renamed from: e */
    public static final int f3669e = Color.parseColor("#23272F");
    /* renamed from: f */
    public static final int f3670f = Color.parseColor("#ff4080ff");
    private static final long serialVersionUID = 8946536326456653736L;
    /* renamed from: g */
    private int f3671g = f3665a;
    /* renamed from: h */
    private int f3672h = f3666b;
    /* renamed from: i */
    private int f3673i = -16777216;
    /* renamed from: j */
    private int f3674j = f3667c;
    /* renamed from: k */
    private int f3675k = f3668d;
    /* renamed from: l */
    private int f3676l = -1;
    /* renamed from: m */
    private int f3677m = -16777216;

    /* renamed from: a */
    public static C1359i m4752a(JSONObject jSONObject) {
        C1359i c1359i = new C1359i();
        if (jSONObject != null) {
            Object optString = jSONObject.optString("accent_color");
            Object optString2 = jSONObject.optString("body_color");
            Object optString3 = jSONObject.optString("subtitle_color");
            Object optString4 = jSONObject.optString("bg_color");
            Object optString5 = jSONObject.optString("cta_color");
            Object optString6 = jSONObject.optString("cta_text_color");
            Object optString7 = jSONObject.optString("title_color");
            if (!TextUtils.isEmpty(optString)) {
                c1359i.f3671g = Color.parseColor(optString);
            }
            if (!TextUtils.isEmpty(optString2)) {
                c1359i.f3672h = Color.parseColor(optString2);
            }
            if (!TextUtils.isEmpty(optString3)) {
                c1359i.f3673i = Color.parseColor(optString3);
            }
            if (!TextUtils.isEmpty(optString4)) {
                c1359i.f3674j = Color.parseColor(optString4);
            }
            if (!TextUtils.isEmpty(optString5)) {
                c1359i.f3675k = Color.parseColor(optString5);
            }
            if (!TextUtils.isEmpty(optString6)) {
                c1359i.f3676l = Color.parseColor(optString6);
            }
            if (!TextUtils.isEmpty(optString7)) {
                c1359i.f3677m = Color.parseColor(optString7);
            }
        }
        return c1359i;
    }

    /* renamed from: a */
    public int m4753a(boolean z) {
        return z ? -1 : this.f3671g;
    }

    /* renamed from: b */
    public int m4754b(boolean z) {
        return z ? -1 : this.f3672h;
    }

    /* renamed from: c */
    public int m4755c(boolean z) {
        return z ? -1 : this.f3673i;
    }

    /* renamed from: d */
    public int m4756d(boolean z) {
        return z ? f3669e : this.f3674j;
    }

    /* renamed from: e */
    public int m4757e(boolean z) {
        return z ? -1 : this.f3675k;
    }

    /* renamed from: f */
    public int m4758f(boolean z) {
        return z ? f3670f : this.f3676l;
    }

    /* renamed from: g */
    public int m4759g(boolean z) {
        return z ? -1 : this.f3677m;
    }
}
