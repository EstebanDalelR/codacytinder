package com.google.android.gms.internal;

import java.io.IOException;

public final class nu extends adz<nu> {
    /* renamed from: a */
    public String f26944a;
    /* renamed from: b */
    private String f26945b;
    /* renamed from: c */
    private String f26946c;
    /* renamed from: d */
    private String f26947d;
    /* renamed from: e */
    private String f26948e;

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26944a != null) {
            a += ady.m19010b(1, this.f26944a);
        }
        if (this.f26945b != null) {
            a += ady.m19010b(2, this.f26945b);
        }
        if (this.f26946c != null) {
            a += ady.m19010b(3, this.f26946c);
        }
        if (this.f26947d != null) {
            a += ady.m19010b(4, this.f26947d);
        }
        return this.f26948e != null ? a + ady.m19010b(5, this.f26948e) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f26944a = adx.m18989e();
            } else if (a == 18) {
                this.f26945b = adx.m18989e();
            } else if (a == 26) {
                this.f26946c = adx.m18989e();
            } else if (a == 34) {
                this.f26947d = adx.m18989e();
            } else if (a == 42) {
                this.f26948e = adx.m18989e();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26944a != null) {
            ady.m19024a(1, this.f26944a);
        }
        if (this.f26945b != null) {
            ady.m19024a(2, this.f26945b);
        }
        if (this.f26946c != null) {
            ady.m19024a(3, this.f26946c);
        }
        if (this.f26947d != null) {
            ady.m19024a(4, this.f26947d);
        }
        if (this.f26948e != null) {
            ady.m19024a(5, this.f26948e);
        }
        super.mo4218a(ady);
    }
}
