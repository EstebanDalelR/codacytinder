package com.google.android.gms.internal;

import android.util.Log;

@zzzv
public class hx {
    /* renamed from: a */
    public static void m19909a(String str, Throwable th) {
        if (m19910a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: a */
    public static boolean m19910a(int i) {
        if (i < 5) {
            if (!Log.isLoggable("Ads", i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m19911b(String str) {
        if (m19910a(3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: b */
    public static void m19912b(String str, Throwable th) {
        if (m19910a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m19913c(String str) {
        if (m19910a(6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: c */
    public static void m19914c(String str, Throwable th) {
        if (m19910a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m19915d(String str) {
        if (m19910a(4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: e */
    public static void m19916e(String str) {
        if (m19910a(5)) {
            Log.w("Ads", str);
        }
    }
}
