package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.py;

/* renamed from: com.google.android.gms.flags.impl.j */
public final class C2539j {
    /* renamed from: a */
    private static SharedPreferences f7714a;

    /* renamed from: a */
    public static SharedPreferences m9241a(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f7714a == null) {
                f7714a = (SharedPreferences) py.a(new C2540k(context));
            }
            sharedPreferences = f7714a;
        }
        return sharedPreferences;
    }
}
