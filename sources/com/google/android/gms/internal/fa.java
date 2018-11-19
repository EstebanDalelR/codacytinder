package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class fa extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28752a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28753b;

    fa(Context context, zzahg zzahg) {
        this.f28752a = context;
        this.f28753b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28752a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putBoolean("content_url_opted_out", sharedPreferences.getBoolean("content_url_opted_out", true));
        if (this.f28753b != null) {
            this.f28753b.zzb(bundle);
        }
    }
}
