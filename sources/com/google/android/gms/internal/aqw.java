package com.google.android.gms.internal;

import android.content.Context;

@zzzv
public final class aqw {
    /* renamed from: a */
    private final Object f15614a = new Object();
    /* renamed from: b */
    private ara f15615b;

    /* renamed from: a */
    public final ara m19454a(Context context, zzakd zzakd) {
        ara ara;
        synchronized (this.f15614a) {
            if (this.f15615b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f15615b = new ara(context, zzakd, (String) aja.m19221f().m19334a(alo.f15449a));
            }
            ara = this.f15615b;
        }
        return ara;
    }
}
