package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.js.C2388t;
import com.google.android.gms.ads.internal.js.zzc;

@zzzv
public final class ara {
    /* renamed from: a */
    private static zzaiq<zzc> f15619a = new arb();
    /* renamed from: b */
    private static zzaiq<zzc> f15620b = new arc();
    /* renamed from: c */
    private final C2388t f15621c;

    public ara(Context context, zzakd zzakd, String str) {
        this.f15621c = new C2388t(context, zzakd, str, f15619a, f15620b);
    }

    /* renamed from: a */
    public final <I, O> zztp<I, O> m19456a(String str, zzts<I> zzts, zztr<O> zztr) {
        return new ard(this.f15621c, str, zzts, zztr);
    }
}
