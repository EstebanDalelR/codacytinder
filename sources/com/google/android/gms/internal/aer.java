package com.google.android.gms.internal;

import java.io.IOException;

public final class aer extends adz<aer> {
    /* renamed from: a */
    public String f26602a;
    /* renamed from: b */
    public Long f26603b;
    /* renamed from: c */
    public Boolean f26604c;

    public aer() {
        this.f26602a = null;
        this.f26603b = null;
        this.f26604c = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26602a != null) {
            a += ady.m19010b(1, this.f26602a);
        }
        if (this.f26603b != null) {
            a += ady.m19017d(2, this.f26603b.longValue());
        }
        if (this.f26604c == null) {
            return a;
        }
        this.f26604c.booleanValue();
        return a + (ady.m19007b(3) + 1);
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f26602a = adx.m18989e();
            } else if (a == 16) {
                this.f26603b = Long.valueOf(adx.m18982b());
            } else if (a == 24) {
                this.f26604c = Boolean.valueOf(adx.m18988d());
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26602a != null) {
            ady.m19024a(1, this.f26602a);
        }
        if (this.f26603b != null) {
            ady.m19028b(2, this.f26603b.longValue());
        }
        if (this.f26604c != null) {
            ady.m19025a(3, this.f26604c.booleanValue());
        }
        super.mo4218a(ady);
    }
}
