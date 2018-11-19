package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class ef extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28712a;
    /* renamed from: b */
    private /* synthetic */ boolean f28713b;

    ef(Context context, boolean z) {
        this.f28712a = context;
        this.f28713b = z;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28712a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("use_https", this.f28713b);
        edit.apply();
    }
}
