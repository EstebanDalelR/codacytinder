package com.google.android.gms.internal;

import java.io.IOException;

public final class aig extends adz<aig> {
    /* renamed from: a */
    public Integer f26652a;
    /* renamed from: b */
    public Integer f26653b;
    /* renamed from: c */
    public Integer f26654c;

    public aig() {
        this.f26652a = null;
        this.f26653b = null;
        this.f26654c = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26652a != null) {
            a += ady.m19008b(1, this.f26652a.intValue());
        }
        if (this.f26653b != null) {
            a += ady.m19008b(2, this.f26653b.intValue());
        }
        return this.f26654c != null ? a + ady.m19008b(3, this.f26654c.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f26652a = Integer.valueOf(adx.m18993h());
            } else if (a == 16) {
                this.f26653b = Integer.valueOf(adx.m18993h());
            } else if (a == 24) {
                this.f26654c = Integer.valueOf(adx.m18993h());
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26652a != null) {
            ady.m19021a(1, this.f26652a.intValue());
        }
        if (this.f26653b != null) {
            ady.m19021a(2, this.f26653b.intValue());
        }
        if (this.f26654c != null) {
            ady.m19021a(3, this.f26654c.intValue());
        }
        super.mo4218a(ady);
    }
}
