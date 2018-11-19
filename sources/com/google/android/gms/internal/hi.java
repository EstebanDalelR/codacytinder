package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class hi implements Callable<String> {
    /* renamed from: a */
    private /* synthetic */ Context f16139a;
    /* renamed from: b */
    private /* synthetic */ Context f16140b;

    hi(hh hhVar, Context context, Context context2) {
        this.f16139a = context;
        this.f16140b = context2;
    }

    public final /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        int i = 0;
        if (this.f16139a != null) {
            ec.m27332a("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f16139a.getSharedPreferences("admob_user_agent", 0);
        } else {
            ec.m27332a("Attempting to read user agent from local cache.");
            sharedPreferences = this.f16140b.getSharedPreferences("admob_user_agent", 0);
            i = 1;
        }
        Object string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            ec.m27332a("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f16140b);
            if (i != 0) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                ec.m27332a("Persisting user agent.");
            }
        }
        return string;
    }
}
