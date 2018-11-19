package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.c */
final class C2535c implements Callable<Boolean> {
    /* renamed from: a */
    private /* synthetic */ SharedPreferences f7702a;
    /* renamed from: b */
    private /* synthetic */ String f7703b;
    /* renamed from: c */
    private /* synthetic */ Boolean f7704c;

    C2535c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f7702a = sharedPreferences;
        this.f7703b = str;
        this.f7704c = bool;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Boolean.valueOf(this.f7702a.getBoolean(this.f7703b, this.f7704c.booleanValue()));
    }
}
