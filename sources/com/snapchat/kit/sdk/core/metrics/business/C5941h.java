package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.h */
public class C5941h {
    /* renamed from: a */
    private final SharedPreferences f21716a;
    /* renamed from: b */
    private long f21717b = 0;

    public C5941h(SharedPreferences sharedPreferences) {
        this.f21716a = sharedPreferences;
    }

    /* renamed from: a */
    public void m25539a() {
        this.f21717b = this.f21716a.getLong("sequence_id_max", 0);
    }

    /* renamed from: b */
    public long m25540b() {
        long j = this.f21717b + 1;
        this.f21717b = j;
        this.f21716a.edit().putLong("sequence_id_max", this.f21717b).apply();
        return j;
    }

    /* renamed from: c */
    public long m25541c() {
        return this.f21717b;
    }
}
