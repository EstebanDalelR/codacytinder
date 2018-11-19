package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.NonNull;
import com.foursquare.internal.util.C1940b;

class am {
    /* renamed from: a */
    static void m6939a(Context context, String str) {
        C1940b.m6817a(context, "rdms.json", 0, str, true);
    }

    /* renamed from: b */
    static void m6941b(@NonNull Context context, @NonNull String str) {
        C1940b.m6817a(context, "rdss.json", 0, str, true);
    }

    /* renamed from: a */
    static String m6938a(Context context) {
        return C1940b.m6815a(context, "rdms.json", 0, true);
    }

    /* renamed from: b */
    static String m6940b(Context context) {
        return C1940b.m6815a(context, "rdss.json", 0, true);
    }

    /* renamed from: c */
    static void m6942c(Context context) {
        C1940b.m6819a(context, "rdms.json");
    }

    /* renamed from: d */
    static void m6943d(Context context) {
        m6942c(context);
    }
}
