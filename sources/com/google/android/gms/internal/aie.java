package com.google.android.gms.internal;

import java.io.IOException;

public final class aie extends adz<aie> {
    /* renamed from: a */
    public String f26646a;
    /* renamed from: b */
    public aig f26647b;

    public aie() {
        this.f26646a = null;
        this.f26647b = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26646a != null) {
            a += ady.m19010b(1, this.f26646a);
        }
        return this.f26647b != null ? a + ady.m19009b(4, this.f26647b) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f26646a = adx.m18989e();
            } else if (a == 34) {
                if (this.f26647b == null) {
                    this.f26647b = new aig();
                }
                adx.m18980a(this.f26647b);
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26646a != null) {
            ady.m19024a(1, this.f26646a);
        }
        if (this.f26647b != null) {
            ady.m19023a(4, this.f26647b);
        }
        super.mo4218a(ady);
    }
}
