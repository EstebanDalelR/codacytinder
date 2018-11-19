package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.py;

/* renamed from: com.google.android.gms.flags.impl.b */
public final class C3840b extends C2534a<Boolean> {
    /* renamed from: a */
    public static Boolean m14462a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) py.a(new C2535c(sharedPreferences, str, bool));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return bool;
        }
    }
}
