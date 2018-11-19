package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class eg extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28714a;
    /* renamed from: b */
    private /* synthetic */ String f28715b;

    eg(Context context, String str) {
        this.f28714a = context;
        this.f28715b = str;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28714a.getSharedPreferences("admob", 0).edit();
        edit.putString("content_vertical_hashes", this.f28715b);
        edit.apply();
    }
}
