package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.py;

/* renamed from: com.google.android.gms.flags.impl.h */
public final class C3843h extends C2534a<String> {
    /* renamed from: a */
    public static String m14465a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) py.a(new C2538i(sharedPreferences, str, str2));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str3 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return str2;
        }
    }
}
