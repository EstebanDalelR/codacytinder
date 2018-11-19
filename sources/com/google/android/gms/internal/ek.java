package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class ek extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28722a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28723b;

    ek(Context context, zzahg zzahg) {
        this.f28722a = context;
        this.f28723b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28722a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("version_code", sharedPreferences.getInt("version_code", 0));
        if (this.f28723b != null) {
            this.f28723b.zzb(bundle);
        }
    }
}
