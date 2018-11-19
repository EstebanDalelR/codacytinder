package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class en extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28729a;
    /* renamed from: b */
    private /* synthetic */ String f28730b;

    en(Context context, String str) {
        this.f28729a = context;
        this.f28730b = str;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28729a.getSharedPreferences("admob", 0).edit();
        edit.putString("native_advanced_settings", this.f28730b);
        edit.apply();
    }
}
