package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class eh extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28716a;
    /* renamed from: b */
    private /* synthetic */ boolean f28717b;

    eh(Context context, boolean z) {
        this.f28716a = context;
        this.f28717b = z;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28716a.getSharedPreferences("admob", 0).edit();
        edit.putBoolean("auto_collect_location", this.f28717b);
        edit.apply();
    }
}
