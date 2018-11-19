package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class ej extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28720a;
    /* renamed from: b */
    private /* synthetic */ int f28721b;

    ej(Context context, int i) {
        this.f28720a = context;
        this.f28721b = i;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28720a.getSharedPreferences("admob", 0).edit();
        edit.putInt("version_code", this.f28721b);
        edit.apply();
    }
}
