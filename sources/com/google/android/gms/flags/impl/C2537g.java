package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.g */
final class C2537g implements Callable<Long> {
    /* renamed from: a */
    private /* synthetic */ SharedPreferences f7708a;
    /* renamed from: b */
    private /* synthetic */ String f7709b;
    /* renamed from: c */
    private /* synthetic */ Long f7710c;

    C2537g(SharedPreferences sharedPreferences, String str, Long l) {
        this.f7708a = sharedPreferences;
        this.f7709b = str;
        this.f7710c = l;
    }

    public final /* synthetic */ Object call() throws Exception {
        return Long.valueOf(this.f7708a.getLong(this.f7709b, this.f7710c.longValue()));
    }
}
