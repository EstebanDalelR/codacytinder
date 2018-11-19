package com.facebook.ads.internal.server;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

@SuppressLint({"SharedPreferencesUse"})
/* renamed from: com.facebook.ads.internal.server.c */
public class C1529c {
    /* renamed from: a */
    private final SharedPreferences f4280a;

    public C1529c(Context context) {
        this.f4280a = context.getApplicationContext().getSharedPreferences("com.facebook.ads.SERVER", 0);
    }

    /* renamed from: a */
    public synchronized void m5385a() {
        this.f4280a.edit().clear().apply();
    }

    /* renamed from: a */
    synchronized void m5386a(String str) {
        StringBuilder stringBuilder = new StringBuilder(m5387b());
        if (!TextUtils.isEmpty(stringBuilder)) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(";");
            stringBuilder2.append(str);
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        this.f4280a.edit().putString("ad_visibility_key_data", stringBuilder.toString()).apply();
    }

    /* renamed from: b */
    public synchronized String m5387b() {
        return this.f4280a.getString("ad_visibility_key_data", "");
    }
}
