package com.android.installreferrer.api;

import android.os.Bundle;

/* renamed from: com.android.installreferrer.api.a */
public class C0900a {
    /* renamed from: a */
    private final Bundle f2327a;

    public C0900a(Bundle bundle) {
        this.f2327a = bundle;
    }

    /* renamed from: a */
    public String m3028a() {
        return this.f2327a.getString("install_referrer");
    }

    /* renamed from: b */
    public long m3029b() {
        return this.f2327a.getLong("referrer_click_timestamp_seconds");
    }

    /* renamed from: c */
    public long m3030c() {
        return this.f2327a.getLong("install_begin_timestamp_seconds");
    }
}
