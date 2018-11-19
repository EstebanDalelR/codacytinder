package com.google.android.gms.ads.internal.js;

import com.google.android.gms.common.internal.ad;
import com.google.android.gms.internal.ec;
import com.google.android.gms.internal.iy;
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.zzaiq;

/* renamed from: com.google.android.gms.ads.internal.js.e */
public final class C4273e extends iz<zzc> {
    /* renamed from: a */
    private final Object f13894a = new Object();
    /* renamed from: b */
    private zzaiq<zzc> f13895b;
    /* renamed from: c */
    private boolean f13896c;
    /* renamed from: d */
    private int f13897d;

    public C4273e(zzaiq<zzc> zzaiq) {
        this.f13895b = zzaiq;
        this.f13896c = false;
        this.f13897d = 0;
    }

    /* renamed from: f */
    private final void m17132f() {
        synchronized (this.f13894a) {
            ad.m9050a(this.f13897d >= 0);
            if (this.f13896c && this.f13897d == 0) {
                ec.a("No reference is left (including root). Cleaning up engine.");
                zza(new C3764h(this), new iy());
            } else {
                ec.a("There are still references to the engine. Not destroying.");
            }
        }
    }

    /* renamed from: a */
    public final C4272a m17133a() {
        C4272a c4272a = new C4272a(this);
        synchronized (this.f13894a) {
            zza(new C3762f(this, c4272a), new C3763g(this, c4272a));
            ad.m9050a(this.f13897d >= 0);
            this.f13897d++;
        }
        return c4272a;
    }

    /* renamed from: b */
    protected final void m17134b() {
        synchronized (this.f13894a) {
            ad.m9050a(this.f13897d > 0);
            ec.a("Releasing 1 reference for JS Engine");
            this.f13897d--;
            m17132f();
        }
    }

    /* renamed from: c */
    public final void m17135c() {
        synchronized (this.f13894a) {
            ad.m9050a(this.f13897d >= 0);
            ec.a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f13896c = true;
            m17132f();
        }
    }
}
