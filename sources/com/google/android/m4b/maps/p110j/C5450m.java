package com.google.android.m4b.maps.p110j;

import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: com.google.android.m4b.maps.j.m */
public abstract class C5450m {
    /* renamed from: a */
    private static final Object f20432a = new Object();
    /* renamed from: b */
    private static C5450m f20433b;

    /* renamed from: a */
    public abstract boolean mo5434a(String str, ServiceConnection serviceConnection, String str2);

    /* renamed from: b */
    public abstract void mo5435b(String str, ServiceConnection serviceConnection, String str2);

    /* renamed from: a */
    public static C5450m m23693a(Context context) {
        synchronized (f20432a) {
            if (f20433b == null) {
                f20433b = new C6703n(context.getApplicationContext());
            }
        }
        return f20433b;
    }
}
