package com.google.android.gms.internal;

import java.io.IOException;

public final class ael extends adz<ael> {
    /* renamed from: a */
    public aek[] f26572a;
    /* renamed from: b */
    private aem f26573b;
    /* renamed from: c */
    private byte[] f26574c;
    /* renamed from: d */
    private byte[] f26575d;
    /* renamed from: e */
    private Integer f26576e;

    public ael() {
        this.f26573b = null;
        this.f26572a = aek.m31356b();
        this.f26574c = null;
        this.f26575d = null;
        this.f26576e = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26573b != null) {
            a += ady.m19009b(1, this.f26573b);
        }
        if (this.f26572a != null && this.f26572a.length > 0) {
            for (aee aee : this.f26572a) {
                if (aee != null) {
                    a += ady.m19009b(2, aee);
                }
            }
        }
        if (this.f26574c != null) {
            a += ady.m19011b(3, this.f26574c);
        }
        if (this.f26575d != null) {
            a += ady.m19011b(4, this.f26575d);
        }
        return this.f26576e != null ? a + ady.m19008b(5, this.f26576e.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f26573b == null) {
                    this.f26573b = new aem();
                }
                adx.m18980a(this.f26573b);
            } else if (a == 18) {
                a = aeh.m19070a(adx, 18);
                int length = this.f26572a == null ? 0 : this.f26572a.length;
                Object obj = new aek[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f26572a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new aek();
                    adx.m18980a(obj[length]);
                    adx.m18978a();
                    length++;
                }
                obj[length] = new aek();
                adx.m18980a(obj[length]);
                this.f26572a = obj;
            } else if (a == 26) {
                this.f26574c = adx.m18991f();
            } else if (a == 34) {
                this.f26575d = adx.m18991f();
            } else if (a == 40) {
                this.f26576e = Integer.valueOf(adx.m18985c());
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26573b != null) {
            ady.m19023a(1, this.f26573b);
        }
        if (this.f26572a != null && this.f26572a.length > 0) {
            for (aee aee : this.f26572a) {
                if (aee != null) {
                    ady.m19023a(2, aee);
                }
            }
        }
        if (this.f26574c != null) {
            ady.m19026a(3, this.f26574c);
        }
        if (this.f26575d != null) {
            ady.m19026a(4, this.f26575d);
        }
        if (this.f26576e != null) {
            ady.m19021a(5, this.f26576e.intValue());
        }
        super.mo4218a(ady);
    }
}
