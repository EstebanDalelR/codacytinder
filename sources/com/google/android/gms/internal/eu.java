package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

final class eu extends fd {
    /* renamed from: a */
    private /* synthetic */ Context f28742a;
    /* renamed from: b */
    private /* synthetic */ zzahg f28743b;

    eu(Context context, zzahg zzahg) {
        this.f28742a = context;
        this.f28743b = zzahg;
        super();
    }

    /* renamed from: a */
    public final void mo6837a() {
        SharedPreferences sharedPreferences = this.f28742a.getSharedPreferences("admob", 0);
        Bundle bundle = new Bundle();
        bundle.putInt("request_in_session_count", sharedPreferences.getInt("request_in_session_count", -1));
        if (this.f28743b != null) {
            this.f28743b.zzb(bundle);
        }
    }
}
