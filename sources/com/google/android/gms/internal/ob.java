package com.google.android.gms.internal;

import java.io.IOException;

public final class ob extends adz<ob> {
    /* renamed from: a */
    public byte[] f27034a;
    /* renamed from: b */
    public byte[] f27035b;
    /* renamed from: c */
    public byte[] f27036c;
    /* renamed from: d */
    public byte[] f27037d;

    public ob() {
        this.f27034a = null;
        this.f27035b = null;
        this.f27036c = null;
        this.f27037d = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f27034a != null) {
            a += ady.m19011b(1, this.f27034a);
        }
        if (this.f27035b != null) {
            a += ady.m19011b(2, this.f27035b);
        }
        if (this.f27036c != null) {
            a += ady.m19011b(3, this.f27036c);
        }
        return this.f27037d != null ? a + ady.m19011b(4, this.f27037d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f27034a = adx.m18991f();
            } else if (a == 18) {
                this.f27035b = adx.m18991f();
            } else if (a == 26) {
                this.f27036c = adx.m18991f();
            } else if (a == 34) {
                this.f27037d = adx.m18991f();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f27034a != null) {
            ady.m19026a(1, this.f27034a);
        }
        if (this.f27035b != null) {
            ady.m19026a(2, this.f27035b);
        }
        if (this.f27036c != null) {
            ady.m19026a(3, this.f27036c);
        }
        if (this.f27037d != null) {
            ady.m19026a(4, this.f27037d);
        }
        super.mo4218a(ady);
    }
}
