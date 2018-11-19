package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.ar;

@zzzv
public final class dv {
    /* renamed from: a */
    private final Object f16042a;
    /* renamed from: b */
    private int f16043b;
    /* renamed from: c */
    private int f16044c;
    /* renamed from: d */
    private final dq f16045d;
    /* renamed from: e */
    private final String f16046e;

    private dv(dq dqVar, String str) {
        this.f16042a = new Object();
        this.f16045d = dqVar;
        this.f16046e = str;
    }

    public dv(String str) {
        this(ar.i(), str);
    }

    /* renamed from: a */
    public final Bundle m19647a() {
        Bundle bundle;
        synchronized (this.f16042a) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f16043b);
            bundle.putInt("pmnll", this.f16044c);
        }
        return bundle;
    }

    /* renamed from: a */
    public final void m19648a(int i, int i2) {
        synchronized (this.f16042a) {
            this.f16043b = i;
            this.f16044c = i2;
            this.f16045d.m27295a(this.f16046e, this);
        }
    }
}
