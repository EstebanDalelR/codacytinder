package com.google.android.gms.internal;

import java.io.IOException;

public final class aif extends adz<aif> {
    /* renamed from: a */
    public String f26648a;
    /* renamed from: b */
    public long[] f26649b;
    /* renamed from: c */
    public aie f26650c;
    /* renamed from: d */
    public aid f26651d;

    public aif() {
        this.f26648a = null;
        this.f26649b = aeh.f15108b;
        this.f26650c = null;
        this.f26651d = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26648a != null) {
            a += ady.m19010b(10, this.f26648a);
        }
        if (this.f26649b != null && this.f26649b.length > 0) {
            int i = 0;
            for (long a2 : this.f26649b) {
                i += ady.m19000a(a2);
            }
            a = (a + i) + (this.f26649b.length * 1);
        }
        if (this.f26650c != null) {
            a += ady.m19009b(15, this.f26650c);
        }
        return this.f26651d != null ? a + ady.m19009b(18, this.f26651d) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 82) {
                this.f26648a = adx.m18989e();
            } else if (a == 112) {
                a = aeh.m19070a(adx, 112);
                r1 = this.f26649b == null ? 0 : this.f26649b.length;
                Object obj = new long[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f26649b, 0, obj, 0, r1);
                }
                while (r1 < obj.length - 1) {
                    obj[r1] = adx.m18994i();
                    adx.m18978a();
                    r1++;
                }
                obj[r1] = adx.m18994i();
                this.f26649b = obj;
            } else if (a != 114) {
                aee aee;
                if (a == 122) {
                    if (this.f26650c == null) {
                        this.f26650c = new aie();
                    }
                    aee = this.f26650c;
                } else if (a == 146) {
                    if (this.f26651d == null) {
                        this.f26651d = new aid();
                    }
                    aee = this.f26651d;
                } else if (!super.m27063a(adx, a)) {
                    return this;
                }
                adx.m18980a(aee);
            } else {
                a = adx.m18986c(adx.m18993h());
                r1 = adx.m18998m();
                int i = 0;
                while (adx.m18997l() > 0) {
                    adx.m18994i();
                    i++;
                }
                adx.m18990e(r1);
                r1 = this.f26649b == null ? 0 : this.f26649b.length;
                Object obj2 = new long[(i + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f26649b, 0, obj2, 0, r1);
                }
                while (r1 < obj2.length) {
                    obj2[r1] = adx.m18994i();
                    r1++;
                }
                this.f26649b = obj2;
                adx.m18987d(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26648a != null) {
            ady.m19024a(10, this.f26648a);
        }
        if (this.f26649b != null && this.f26649b.length > 0) {
            for (long a : this.f26649b) {
                ady.m19022a(14, a);
            }
        }
        if (this.f26650c != null) {
            ady.m19023a(15, this.f26650c);
        }
        if (this.f26651d != null) {
            ady.m19023a(18, this.f26651d);
        }
        super.mo4218a(ady);
    }
}
