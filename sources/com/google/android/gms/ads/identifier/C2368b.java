package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C2513p;

/* renamed from: com.google.android.gms.ads.identifier.b */
public final class C2368b {
    /* renamed from: a */
    private SharedPreferences f7075a;

    public C2368b(Context context) {
        try {
            context = C2513p.getRemoteContext(context);
            this.f7075a = context == null ? null : context.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f7075a = null;
        }
    }

    /* renamed from: a */
    final float m8620a(String str, float f) {
        try {
            return this.f7075a == null ? 0.0f : this.f7075a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* renamed from: a */
    final String m8621a(String str, String str2) {
        try {
            return this.f7075a == null ? str2 : this.f7075a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    /* renamed from: a */
    public final boolean m8622a(String str, boolean z) {
        try {
            return this.f7075a == null ? false : this.f7075a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
