package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class es extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28738a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28739b;

    es(Context context, zzahg zzahg) {
        this.f28738a = context;
        this.f28739b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28738a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putLong("app_last_background_time_ms", sharedPreferences.getLong("app_last_background_time_ms", 0));
        if (this.f28739b != null) {
            this.f28739b.zzb(bundle);
        }
    }
}
