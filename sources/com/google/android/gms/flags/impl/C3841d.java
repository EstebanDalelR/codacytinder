package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.py;

/* renamed from: com.google.android.gms.flags.impl.d */
public final class C3841d extends C2534a<Integer> {
    /* renamed from: a */
    public static Integer m14463a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) py.a(new C2536e(sharedPreferences, str, num));
        } catch (Exception e) {
            str = "FlagDataUtils";
            String str2 = "Flag value not available, returning default: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return num;
        }
    }
}
