package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class ey extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28748a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28749b;

    ey(Context context, zzahg zzahg) {
        this.f28748a = context;
        this.f28749b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28748a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("webview_cache_version", sharedPreferences.getInt("webview_cache_version", 0));
        if (this.f28749b != null) {
            this.f28749b.zzb(bundle);
        }
    }
}
