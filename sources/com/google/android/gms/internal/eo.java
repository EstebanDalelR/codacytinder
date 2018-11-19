package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class eo extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28731a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28732b;

    eo(Context context, zzahg zzahg) {
        this.f28731a = context;
        this.f28732b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28731a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_https", sharedPreferences.getBoolean("use_https", true));
        if (this.f28732b != null) {
            this.f28732b.zzb(bundle);
        }
    }
}
