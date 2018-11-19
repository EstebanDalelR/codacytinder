package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.i */
final class C2538i implements Callable<String> {
    /* renamed from: a */
    private /* synthetic */ SharedPreferences f7711a;
    /* renamed from: b */
    private /* synthetic */ String f7712b;
    /* renamed from: c */
    private /* synthetic */ String f7713c;

    C2538i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f7711a = sharedPreferences;
        this.f7712b = str;
        this.f7713c = str2;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f7711a.getString(this.f7712b, this.f7713c);
    }
}
