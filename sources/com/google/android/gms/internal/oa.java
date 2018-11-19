package com.google.android.gms.internal;

import java.io.IOException;

public final class oa extends adz<oa> {
    /* renamed from: a */
    private Long f27029a;
    /* renamed from: b */
    private Integer f27030b;
    /* renamed from: c */
    private Boolean f27031c;
    /* renamed from: d */
    private int[] f27032d;
    /* renamed from: e */
    private Long f27033e;

    public oa() {
        this.f27029a = null;
        this.f27030b = null;
        this.f27031c = null;
        this.f27032d = aeh.f15107a;
        this.f27033e = null;
        this.Y = -1;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f27029a != null) {
            a += ady.m19017d(1, this.f27029a.longValue());
        }
        if (this.f27030b != null) {
            a += ady.m19008b(2, this.f27030b.intValue());
        }
        if (this.f27031c != null) {
            this.f27031c.booleanValue();
            a += ady.m19007b(3) + 1;
        }
        if (this.f27032d != null && this.f27032d.length > 0) {
            int i = 0;
            for (int a2 : this.f27032d) {
                i += ady.m18999a(a2);
            }
            a = (a + i) + (this.f27032d.length * 1);
        }
        if (this.f27033e == null) {
            return a;
        }
        return a + (ady.m19007b(5) + ady.m19000a(this.f27033e.longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        while (true) {
            int a = adx.m18978a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f27029a = Long.valueOf(adx.m18994i());
            } else if (a == 16) {
                this.f27030b = Integer.valueOf(adx.m18993h());
            } else if (a == 24) {
                this.f27031c = Boolean.valueOf(adx.m18988d());
            } else if (a == 32) {
                a = aeh.m19070a(adx, 32);
                r1 = this.f27032d == null ? 0 : this.f27032d.length;
                Object obj = new int[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f27032d, 0, obj, 0, r1);
                }
                while (r1 < obj.length - 1) {
                    obj[r1] = adx.m18993h();
                    adx.m18978a();
                    r1++;
                }
                obj[r1] = adx.m18993h();
                this.f27032d = obj;
            } else if (a == 34) {
                a = adx.m18986c(adx.m18993h());
                r1 = adx.m18998m();
                int i = 0;
                while (adx.m18997l() > 0) {
                    adx.m18993h();
                    i++;
                }
                adx.m18990e(r1);
                r1 = this.f27032d == null ? 0 : this.f27032d.length;
                Object obj2 = new int[(i + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f27032d, 0, obj2, 0, r1);
                }
                while (r1 < obj2.length) {
                    obj2[r1] = adx.m18993h();
                    r1++;
                }
                this.f27032d = obj2;
                adx.m18987d(a);
            } else if (a == 40) {
                this.f27033e = Long.valueOf(adx.m18994i());
            } else if (!super.m27063a(adx, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f27029a != null) {
            ady.m19028b(1, this.f27029a.longValue());
        }
        if (this.f27030b != null) {
            ady.m19021a(2, this.f27030b.intValue());
        }
        if (this.f27031c != null) {
            ady.m19025a(3, this.f27031c.booleanValue());
        }
        if (this.f27032d != null && this.f27032d.length > 0) {
            for (int a : this.f27032d) {
                ady.m19021a(4, a);
            }
        }
        if (this.f27033e != null) {
            ady.m19022a(5, this.f27033e.longValue());
        }
        super.mo4218a(ady);
    }
}
