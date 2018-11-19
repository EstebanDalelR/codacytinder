package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class ei extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28718a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28719b;

    ei(Context context, zzahg zzahg) {
        this.f28718a = context;
        this.f28719b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28718a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("auto_collect_location", sharedPreferences.getBoolean("auto_collect_location", false));
        if (this.f28719b != null) {
            this.f28719b.zzb(bundle);
        }
    }
}
