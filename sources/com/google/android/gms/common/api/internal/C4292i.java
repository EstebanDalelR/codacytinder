package com.google.android.gms.common.api.internal;

import android.support.v4.util.C0546b;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.i */
public class C4292i extends cl {
    /* renamed from: e */
    private final C0546b<cg<?>> f13983e;
    /* renamed from: f */
    private al f13984f;

    /* renamed from: i */
    private final void m17242i() {
        if (!this.f13983e.isEmpty()) {
            this.f13984f.m8959a(this);
        }
    }

    /* renamed from: a */
    protected final void mo3572a(ConnectionResult connectionResult, int i) {
        this.f13984f.m8961b(connectionResult, i);
    }

    /* renamed from: b */
    public final void mo2549b() {
        super.mo2549b();
        m17242i();
    }

    /* renamed from: c */
    public final void mo3578c() {
        super.mo3578c();
        m17242i();
    }

    /* renamed from: d */
    public final void mo2551d() {
        super.mo2551d();
        this.f13984f.m8962b(this);
    }

    /* renamed from: f */
    protected final void mo3574f() {
        this.f13984f.m8964d();
    }

    /* renamed from: g */
    final C0546b<cg<?>> m17248g() {
        return this.f13983e;
    }
}
