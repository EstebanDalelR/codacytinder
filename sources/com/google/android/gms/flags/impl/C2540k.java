package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.flags.impl.k */
final class C2540k implements Callable<SharedPreferences> {
    /* renamed from: a */
    private /* synthetic */ Context f7715a;

    C2540k(Context context) {
        this.f7715a = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        return this.f7715a.getSharedPreferences("google_sdk_flags", 0);
    }
}
