package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class el extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28724a;
    /* renamed from: b */
    private /* synthetic */ String f28725b;
    /* renamed from: c */
    private /* synthetic */ long f28726c;

    el(Context context, String str, long j) {
        this.f28724a = context;
        this.f28725b = str;
        this.f28726c = j;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28724a.getSharedPreferences("admob", 0).edit();
        edit.putString("app_settings_json", this.f28725b);
        edit.putLong("app_settings_last_update_ms", this.f28726c);
        edit.apply();
    }
}
