package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;

final class ev extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28744a;
    /* renamed from: b */
    private /* synthetic */ long f28745b;

    ev(Context context, long j) {
        this.f28744a = context;
        this.f28745b = j;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        Editor edit = this.f28744a.getSharedPreferences("admob", 0).edit();
        edit.putLong("first_ad_req_time_ms", this.f28745b);
        edit.apply();
    }
}
