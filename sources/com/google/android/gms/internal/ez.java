package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class ez extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28750a;
    /* renamed from: b */
    private /* synthetic */ boolean f28751b;

    ez(Context context, boolean z) {
        this.f28750a = context;
        this.f28751b = z;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28750a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("content_url_opted_out", this.f28751b);
        edit.apply();
    }
}
