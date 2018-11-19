package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class ep extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28733a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28734b;

    ep(Context context, zzahg zzahg) {
        this.f28733a = context;
        this.f28734b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28733a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("native_advanced_settings", sharedPreferences.getString("native_advanced_settings", "{}"));
        if (this.f28734b != null) {
            this.f28734b.zzb(bundle);
        }
    }
}
