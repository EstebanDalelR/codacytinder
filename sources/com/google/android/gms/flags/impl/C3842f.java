package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.py;

/* renamed from: com.google.android.gms.flags.impl.f */
public final class C3842f extends C2534a<Long> {
    /* renamed from: a */
    public static Long m14464a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) py.a(new C2537g(sharedPreferences, str, l));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return l;
        }
    }
}
