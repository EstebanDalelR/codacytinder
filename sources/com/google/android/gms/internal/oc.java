package com.google.android.gms.internal;

import java.io.IOException;

public final class oc extends adz<oc> {
    /* renamed from: a */
    public Long f27038a;
    /* renamed from: b */
    private String f27039b;
    /* renamed from: c */
    private byte[] f27040c;

    public oc() {
        this.f27038a = null;
        this.f27039b = null;
        this.f27040c = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f27038a != null) {
            a += ady.m19017d(1, this.f27038a.longValue());
        }
        if (this.f27039b != null) {
            a += ady.m19010b(3, this.f27039b);
        }
        return this.f27040c != null ? a + ady.m19011b(4, this.f27040c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f27038a = Long.valueOf(adx.m18994i());
            } else if (a == 26) {
                this.f27039b = adx.m18989e();
            } else if (a == 34) {
                this.f27040c = adx.m18991f();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f27038a != null) {
            ady.m19028b(1, this.f27038a.longValue());
        }
        if (this.f27039b != null) {
            ady.m19024a(3, this.f27039b);
        }
        if (this.f27040c != null) {
            ady.m19026a(4, this.f27040c);
        }
        super.mo4218a(ady);
    }
}
