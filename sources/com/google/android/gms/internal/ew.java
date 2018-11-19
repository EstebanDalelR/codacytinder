package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class ew extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28746a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28747b;

    ew(Context context, zzahg zzahg) {
        this.f28746a = context;
        this.f28747b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28746a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putLong("first_ad_req_time_ms", sharedPreferences.getLong("first_ad_req_time_ms", 0));
        if (this.f28747b != null) {
            this.f28747b.zzb(bundle);
        }
    }
}
