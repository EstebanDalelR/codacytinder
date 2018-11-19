package com.google.android.gms.internal;

import java.io.IOException;

public final class aem extends adz<aem> {
    /* renamed from: a */
    private byte[] f26577a;
    /* renamed from: b */
    private byte[] f26578b;
    /* renamed from: c */
    private byte[] f26579c;

    public aem() {
        this.f26577a = null;
        this.f26578b = null;
        this.f26579c = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26577a != null) {
            a += ady.m19011b(1, this.f26577a);
        }
        if (this.f26578b != null) {
            a += ady.m19011b(2, this.f26578b);
        }
        return this.f26579c != null ? a + ady.m19011b(3, this.f26579c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f26577a = adx.m18991f();
            } else if (a == 18) {
                this.f26578b = adx.m18991f();
            } else if (a == 26) {
                this.f26579c = adx.m18991f();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26577a != null) {
            ady.m19026a(1, this.f26577a);
        }
        if (this.f26578b != null) {
            ady.m19026a(2, this.f26578b);
        }
        if (this.f26579c != null) {
            ady.m19026a(3, this.f26579c);
        }
        super.mo4218a(ady);
    }
}
