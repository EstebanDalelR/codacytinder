package com.foursquare.internal.util;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.util.Log;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FsLog {
    private static boolean debuggable = false;

    /* renamed from: a */
    public static boolean m6802a() {
        return false;
    }

    /* renamed from: a */
    public static void m6800a(String str, String str2) {
        if (m6802a()) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m6801a(String str, String str2, Throwable th) {
        if (m6802a()) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m6803b(String str, String str2) {
        if (m6802a()) {
            Log.v(str, str2);
        }
    }

    /* renamed from: c */
    public static void m6805c(String str, String str2) {
        if (m6802a()) {
            Log.w(str, str2);
        }
    }

    /* renamed from: b */
    public static void m6804b(String str, String str2, Throwable th) {
        if (m6802a()) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m6807d(String str, String str2) {
        if (m6802a()) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m6806c(String str, String str2, Throwable th) {
        if (m6802a()) {
            Log.e(str, str2, th);
        }
    }
}
