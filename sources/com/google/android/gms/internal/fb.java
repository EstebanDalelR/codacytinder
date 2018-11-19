package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class fb extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28754a;
    /* renamed from: b */
    private /* synthetic */ String f28755b;

    fb(Context context, String str) {
        this.f28754a = context;
        this.f28755b = str;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28754a.getSharedPreferences("admob", 0).edit();
        edit.putString("content_url_hashes", this.f28755b);
        edit.apply();
    }
}
