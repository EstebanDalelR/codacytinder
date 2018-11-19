package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class et extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28740a;
    /* renamed from: b */
    private /* synthetic */ int f28741b;

    et(Context context, int i) {
        this.f28740a = context;
        this.f28741b = i;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28740a.getSharedPreferences("admob", 0).edit();
        edit.putInt("request_in_session_count", this.f28741b);
        edit.apply();
    }
}
