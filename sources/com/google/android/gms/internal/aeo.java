package com.google.android.gms.internal;

import java.io.IOException;

public final class aeo extends adz<aeo> {
    /* renamed from: a */
    private Integer f26586a;
    /* renamed from: b */
    private byte[] f26587b;
    /* renamed from: c */
    private byte[] f26588c;

    public aeo() {
        this.f26586a = null;
        this.f26587b = null;
        this.f26588c = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26586a != null) {
            a += ady.m19008b(1, this.f26586a.intValue());
        }
        if (this.f26587b != null) {
            a += ady.m19011b(2, this.f26587b);
        }
        return this.f26588c != null ? a + ady.m19011b(3, this.f26588c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f26586a = Integer.valueOf(adx.m18985c());
            } else if (a == 18) {
                this.f26587b = adx.m18991f();
            } else if (a == 26) {
                this.f26588c = adx.m18991f();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26586a != null) {
            ady.m19021a(1, this.f26586a.intValue());
        }
        if (this.f26587b != null) {
            ady.m19026a(2, this.f26587b);
        }
        if (this.f26588c != null) {
            ady.m19026a(3, this.f26588c);
        }
        super.mo4218a(ady);
    }
}
