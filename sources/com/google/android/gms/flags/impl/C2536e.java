package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.e */
final class C2536e implements Callable<Integer> {
    /* renamed from: a */
    private /* synthetic */ SharedPreferences f7705a;
    /* renamed from: b */
    private /* synthetic */ String f7706b;
    /* renamed from: c */
    private /* synthetic */ Integer f7707c;

    C2536e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f7705a = sharedPreferences;
        this.f7706b = str;
        this.f7707c = num;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Integer.valueOf(this.f7705a.getInt(this.f7706b, this.f7707c.intValue()));
    }
}
