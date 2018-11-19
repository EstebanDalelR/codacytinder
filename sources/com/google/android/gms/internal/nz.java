package com.google.android.gms.internal;

import java.io.IOException;

public final class nz extends adz<nz> {
    /* renamed from: a */
    public Long f27023a;
    /* renamed from: b */
    public Long f27024b;
    /* renamed from: c */
    public Long f27025c;
    /* renamed from: d */
    private Long f27026d;
    /* renamed from: e */
    private Long f27027e;

    public nz() {
        this.f27026d = null;
        this.f27027e = null;
        this.f27023a = null;
        this.f27024b = null;
        this.f27025c = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f27026d != null) {
            a += ady.m19017d(1, this.f27026d.longValue());
        }
        if (this.f27027e != null) {
            a += ady.m19017d(2, this.f27027e.longValue());
        }
        if (this.f27023a != null) {
            a += ady.m19017d(3, this.f27023a.longValue());
        }
        if (this.f27024b != null) {
            a += ady.m19017d(4, this.f27024b.longValue());
        }
        return this.f27025c != null ? a + ady.m19017d(5, this.f27025c.longValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f27026d = Long.valueOf(adx.m18994i());
            } else if (a == 16) {
                this.f27027e = Long.valueOf(adx.m18994i());
            } else if (a == 24) {
                this.f27023a = Long.valueOf(adx.m18994i());
            } else if (a == 32) {
                this.f27024b = Long.valueOf(adx.m18994i());
            } else if (a == 40) {
                this.f27025c = Long.valueOf(adx.m18994i());
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f27026d != null) {
            ady.m19028b(1, this.f27026d.longValue());
        }
        if (this.f27027e != null) {
            ady.m19028b(2, this.f27027e.longValue());
        }
        if (this.f27023a != null) {
            ady.m19028b(3, this.f27023a.longValue());
        }
        if (this.f27024b != null) {
            ady.m19028b(4, this.f27024b.longValue());
        }
        if (this.f27025c != null) {
            ady.m19028b(5, this.f27025c.longValue());
        }
        super.mo4218a(ady);
    }
}
