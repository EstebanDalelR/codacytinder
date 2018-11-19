package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class er extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28736a;
    /* renamed from: b */
    private /* synthetic */ long f28737b;

    er(Context context, long j) {
        this.f28736a = context;
        this.f28737b = j;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28736a.getSharedPreferences("admob", 0).edit();
        edit.putLong("app_last_background_time_ms", this.f28737b);
        edit.apply();
    }
}
