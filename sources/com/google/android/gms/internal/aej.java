package com.google.android.gms.internal;

import java.io.IOException;

public final class aej extends adz<aej> {
    /* renamed from: a */
    public String f26568a;

    public aej() {
        this.f26568a = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        return this.f26568a != null ? a + ady.m19010b(1, this.f26568a) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f26568a = adx.m18989e();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26568a != null) {
            ady.m19024a(1, this.f26568a);
        }
        super.mo4218a(ady);
    }
}
