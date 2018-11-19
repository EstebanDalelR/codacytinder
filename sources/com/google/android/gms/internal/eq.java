package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class eq extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28735a;

    eq(Context context) {
        this.f28735a = context;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28735a.getSharedPreferences("admob", 0).edit();
        edit.remove("native_advanced_settings");
        edit.apply();
    }
}
