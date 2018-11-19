package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fc extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28756a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28757b;

    fc(Context context, zzahg zzahg) {
        this.f28756a = context;
        this.f28757b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28756a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putString("content_url_hashes", sharedPreferences.getString("content_url_hashes", ""));
        if (this.f28757b != null) {
            this.f28757b.zzb(bundle);
        }
    }
}
