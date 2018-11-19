package com.google.android.gms.internal;

import java.io.IOException;

public final class aen extends adz<aen> {
    /* renamed from: a */
    private aeo f26580a;
    /* renamed from: b */
    private aek[] f26581b;
    /* renamed from: c */
    private byte[] f26582c;
    /* renamed from: d */
    private byte[] f26583d;
    /* renamed from: e */
    private Integer f26584e;
    /* renamed from: f */
    private byte[] f26585f;

    public aen() {
        this.f26580a = null;
        this.f26581b = aek.m31356b();
        this.f26582c = null;
        this.f26583d = null;
        this.f26584e = null;
        this.f26585f = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26580a != null) {
            a += ady.m19009b(1, this.f26580a);
        }
        if (this.f26581b != null && this.f26581b.length > 0) {
            for (aee aee : this.f26581b) {
                if (aee != null) {
                    a += ady.m19009b(2, aee);
                }
            }
        }
        if (this.f26582c != null) {
            a += ady.m19011b(3, this.f26582c);
        }
        if (this.f26583d != null) {
            a += ady.m19011b(4, this.f26583d);
        }
        if (this.f26584e != null) {
            a += ady.m19008b(5, this.f26584e.intValue());
        }
        return this.f26585f != null ? a + ady.m19011b(6, this.f26585f) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f26580a == null) {
                    this.f26580a = new aeo();
                }
                adx.m18980a(this.f26580a);
            } else if (a == 18) {
                a = aeh.m19070a(adx, 18);
                int length = this.f26581b == null ? 0 : this.f26581b.length;
                Object obj = new aek[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f26581b, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new aek();
                    adx.m18980a(obj[length]);
                    adx.m18978a();
                    length++;
                }
                obj[length] = new aek();
                adx.m18980a(obj[length]);
                this.f26581b = obj;
            } else if (a == 26) {
                this.f26582c = adx.m18991f();
            } else if (a == 34) {
                this.f26583d = adx.m18991f();
            } else if (a == 40) {
                this.f26584e = Integer.valueOf(adx.m18985c());
            } else if (a == 50) {
                this.f26585f = adx.m18991f();
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26580a != null) {
            ady.m19023a(1, this.f26580a);
        }
        if (this.f26581b != null && this.f26581b.length > 0) {
            for (aee aee : this.f26581b) {
                if (aee != null) {
                    ady.m19023a(2, aee);
                }
            }
        }
        if (this.f26582c != null) {
            ady.m19026a(3, this.f26582c);
        }
        if (this.f26583d != null) {
            ady.m19026a(4, this.f26583d);
        }
        if (this.f26584e != null) {
            ady.m19021a(5, this.f26584e.intValue());
        }
        if (this.f26585f != null) {
            ady.m19026a(6, this.f26585f);
        }
        super.mo4218a(ady);
    }
}
