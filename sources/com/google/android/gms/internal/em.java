package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class em extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28727a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28728b;

    em(Context context, zzahg zzahg) {
        this.f28727a = context;
        this.f28728b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28727a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("app_settings_json", sharedPreferences.getString("app_settings_json", ""));
        bundle.putLong("app_settings_last_update_ms", sharedPreferences.getLong("app_settings_last_update_ms", 0));
        if (this.f28728b != null) {
            this.f28728b.zzb(bundle);
        }
    }
}
