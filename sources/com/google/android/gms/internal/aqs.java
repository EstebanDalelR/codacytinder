package com.google.android.gms.internal;

import android.os.Bundle;

@zzzv
public final class aqs {
    /* renamed from: a */
    private static aqs f15600a = new aqs();
    /* renamed from: b */
    private int f15601b;
    /* renamed from: c */
    private int f15602c;
    /* renamed from: d */
    private int f15603d;
    /* renamed from: e */
    private int f15604e;
    /* renamed from: f */
    private int f15605f;

    /* renamed from: a */
    public static aqs m19439a() {
        return f15600a;
    }

    /* renamed from: a */
    final void m19440a(int i) {
        this.f15601b += i;
    }

    /* renamed from: b */
    final void m19441b() {
        this.f15602c++;
    }

    /* renamed from: c */
    final void m19442c() {
        this.f15603d++;
    }

    /* renamed from: d */
    final void m19443d() {
        this.f15604e++;
    }

    /* renamed from: e */
    final void m19444e() {
        this.f15605f++;
    }

    /* renamed from: f */
    public final int m19445f() {
        return this.f15602c;
    }

    /* renamed from: g */
    public final int m19446g() {
        return this.f15603d;
    }

    /* renamed from: h */
    public final int m19447h() {
        return this.f15604e;
    }

    /* renamed from: i */
    public final int m19448i() {
        return this.f15605f;
    }

    /* renamed from: j */
    public final Bundle m19449j() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f15601b);
        bundle.putInt("ipds", this.f15602c);
        bundle.putInt("ipde", this.f15603d);
        bundle.putInt("iph", this.f15604e);
        bundle.putInt("ipm", this.f15605f);
        return bundle;
    }
}
