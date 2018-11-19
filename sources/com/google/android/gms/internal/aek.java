package com.google.android.gms.internal;

import java.io.IOException;

public final class aek extends adz<aek> {
    /* renamed from: c */
    private static volatile aek[] f26569c;
    /* renamed from: a */
    public byte[] f26570a;
    /* renamed from: b */
    public byte[] f26571b;

    public aek() {
        this.f26570a = null;
        this.f26571b = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    public static aek[] m31356b() {
        if (f26569c == null) {
            synchronized (aed.f15102b) {
                if (f26569c == null) {
                    f26569c = new aek[0];
                }
            }
        }
        return f26569c;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a() + ady.m19011b(1, this.f26570a);
        return this.f26571b != null ? a + ady.m19011b(2, this.f26571b) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f26570a = adx.m18991f();
            } else if (a == 18) {
                this.f26571b = adx.m18991f();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        ady.m19026a(1, this.f26570a);
        if (this.f26571b != null) {
            ady.m19026a(2, this.f26571b);
        }
        super.mo4218a(ady);
    }
}
