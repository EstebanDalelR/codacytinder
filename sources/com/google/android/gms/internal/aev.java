package com.google.android.gms.internal;

import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.io.IOException;
import java.util.Arrays;

public final class aev extends adz<aev> implements Cloneable {
    /* renamed from: a */
    public long f26617a;
    /* renamed from: b */
    public long f26618b;
    /* renamed from: c */
    public byte[] f26619c;
    /* renamed from: d */
    public long f26620d;
    /* renamed from: e */
    public byte[] f26621e;
    /* renamed from: f */
    private long f26622f;
    /* renamed from: g */
    private String f26623g;
    /* renamed from: h */
    private int f26624h;
    /* renamed from: i */
    private int f26625i;
    /* renamed from: j */
    private boolean f26626j;
    /* renamed from: k */
    private aew[] f26627k;
    /* renamed from: l */
    private byte[] f26628l;
    /* renamed from: m */
    private aet f26629m;
    /* renamed from: n */
    private String f26630n;
    /* renamed from: o */
    private String f26631o;
    /* renamed from: p */
    private aes f26632p;
    /* renamed from: q */
    private String f26633q;
    /* renamed from: r */
    private aeu f26634r;
    /* renamed from: s */
    private String f26635s;
    /* renamed from: t */
    private int f26636t;
    /* renamed from: u */
    private int[] f26637u;
    /* renamed from: v */
    private long f26638v;
    /* renamed from: w */
    private aex f26639w;

    public aev() {
        this.f26617a = 0;
        this.f26618b = 0;
        this.f26622f = 0;
        this.f26623g = "";
        this.f26624h = 0;
        this.f26625i = 0;
        this.f26626j = false;
        this.f26627k = aew.m31409b();
        this.f26628l = aeh.f15114h;
        this.f26629m = null;
        this.f26619c = aeh.f15114h;
        this.f26630n = "";
        this.f26631o = "";
        this.f26632p = null;
        this.f26633q = "";
        this.f26620d = DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS;
        this.f26634r = null;
        this.f26621e = aeh.f15114h;
        this.f26635s = "";
        this.f26636t = 0;
        this.f26637u = aeh.f15107a;
        this.f26638v = 0;
        this.f26639w = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    private final aev m31402b() {
        try {
            aev aev = (aev) super.mo6840c();
            if (this.f26627k != null && this.f26627k.length > 0) {
                aev.f26627k = new aew[this.f26627k.length];
                for (int i = 0; i < this.f26627k.length; i++) {
                    if (this.f26627k[i] != null) {
                        aev.f26627k[i] = (aew) this.f26627k[i].clone();
                    }
                }
            }
            if (this.f26629m != null) {
                aev.f26629m = (aet) this.f26629m.clone();
            }
            if (this.f26632p != null) {
                aev.f26632p = (aes) this.f26632p.clone();
            }
            if (this.f26634r != null) {
                aev.f26634r = (aeu) this.f26634r.clone();
            }
            if (this.f26637u != null && this.f26637u.length > 0) {
                aev.f26637u = (int[]) this.f26637u.clone();
            }
            if (this.f26639w != null) {
                aev.f26639w = (aex) this.f26639w.clone();
            }
            return aev;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.aev m31403b(com.google.android.gms.internal.adx r7) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m18978a();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x01af;
            case 8: goto L_0x01a7;
            case 18: goto L_0x019f;
            case 26: goto L_0x015f;
            case 34: goto L_0x0157;
            case 50: goto L_0x014f;
            case 58: goto L_0x013d;
            case 66: goto L_0x0135;
            case 74: goto L_0x0127;
            case 80: goto L_0x011f;
            case 88: goto L_0x0117;
            case 96: goto L_0x010f;
            case 106: goto L_0x0107;
            case 114: goto L_0x00ff;
            case 120: goto L_0x00f7;
            case 130: goto L_0x00e9;
            case 136: goto L_0x00e1;
            case 146: goto L_0x00d9;
            case 152: goto L_0x00a8;
            case 160: goto L_0x0074;
            case 162: goto L_0x0033;
            case 168: goto L_0x002c;
            case 176: goto L_0x0025;
            case 186: goto L_0x0016;
            case 194: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m27063a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = r7.m18989e();
        r6.f26635s = r0;
        goto L_0x0000;
    L_0x0016:
        r0 = r6.f26639w;
        if (r0 != 0) goto L_0x0021;
    L_0x001a:
        r0 = new com.google.android.gms.internal.aex;
        r0.<init>();
        r6.f26639w = r0;
    L_0x0021:
        r0 = r6.f26639w;
        goto L_0x014a;
    L_0x0025:
        r0 = r7.m18982b();
        r6.f26638v = r0;
        goto L_0x0000;
    L_0x002c:
        r0 = r7.m18982b();
        r6.f26622f = r0;
        goto L_0x0000;
    L_0x0033:
        r0 = r7.m18993h();
        r0 = r7.m18986c(r0);
        r2 = r7.m18998m();
        r3 = 0;
    L_0x0040:
        r4 = r7.m18997l();
        if (r4 <= 0) goto L_0x004c;
    L_0x0046:
        r7.m18985c();
        r3 = r3 + 1;
        goto L_0x0040;
    L_0x004c:
        r7.m18990e(r2);
        r2 = r6.f26637u;
        if (r2 != 0) goto L_0x0055;
    L_0x0053:
        r2 = 0;
        goto L_0x0058;
    L_0x0055:
        r2 = r6.f26637u;
        r2 = r2.length;
    L_0x0058:
        r3 = r3 + r2;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x0062;
    L_0x005d:
        r4 = r6.f26637u;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x0062:
        r1 = r3.length;
        if (r2 >= r1) goto L_0x006e;
    L_0x0065:
        r1 = r7.m18985c();
        r3[r2] = r1;
        r2 = r2 + 1;
        goto L_0x0062;
    L_0x006e:
        r6.f26637u = r3;
        r7.m18987d(r0);
        goto L_0x0000;
    L_0x0074:
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0 = com.google.android.gms.internal.aeh.m19070a(r7, r0);
        r2 = r6.f26637u;
        if (r2 != 0) goto L_0x0080;
    L_0x007e:
        r2 = 0;
        goto L_0x0083;
    L_0x0080:
        r2 = r6.f26637u;
        r2 = r2.length;
    L_0x0083:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x008d;
    L_0x0088:
        r3 = r6.f26637u;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x008d:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x009e;
    L_0x0092:
        r1 = r7.m18985c();
        r0[r2] = r1;
        r7.m18978a();
        r2 = r2 + 1;
        goto L_0x008d;
    L_0x009e:
        r1 = r7.m18985c();
        r0[r2] = r1;
        r6.f26637u = r0;
        goto L_0x0000;
    L_0x00a8:
        r1 = r7.m18998m();
        r2 = r7.m18985c();	 Catch:{ IllegalArgumentException -> 0x00d1 }
        switch(r2) {
            case 0: goto L_0x00b6;
            case 1: goto L_0x00b6;
            case 2: goto L_0x00b6;
            default: goto L_0x00b3;
        };	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00b3:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        goto L_0x00ba;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00b6:
        r6.f26636t = r2;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00ba:
        r4 = 45;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r2 = " is not a valid enum InternalEvent";	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00d1:
        r7.m18990e(r1);
        r6.m27063a(r7, r0);
        goto L_0x0000;
    L_0x00d9:
        r0 = r7.m18991f();
        r6.f26621e = r0;
        goto L_0x0000;
    L_0x00e1:
        r0 = r7.m18982b();
        r6.f26618b = r0;
        goto L_0x0000;
    L_0x00e9:
        r0 = r6.f26634r;
        if (r0 != 0) goto L_0x00f4;
    L_0x00ed:
        r0 = new com.google.android.gms.internal.aeu;
        r0.<init>();
        r6.f26634r = r0;
    L_0x00f4:
        r0 = r6.f26634r;
        goto L_0x014a;
    L_0x00f7:
        r0 = r7.m18992g();
        r6.f26620d = r0;
        goto L_0x0000;
    L_0x00ff:
        r0 = r7.m18989e();
        r6.f26633q = r0;
        goto L_0x0000;
    L_0x0107:
        r0 = r7.m18989e();
        r6.f26631o = r0;
        goto L_0x0000;
    L_0x010f:
        r0 = r7.m18985c();
        r6.f26625i = r0;
        goto L_0x0000;
    L_0x0117:
        r0 = r7.m18985c();
        r6.f26624h = r0;
        goto L_0x0000;
    L_0x011f:
        r0 = r7.m18988d();
        r6.f26626j = r0;
        goto L_0x0000;
    L_0x0127:
        r0 = r6.f26629m;
        if (r0 != 0) goto L_0x0132;
    L_0x012b:
        r0 = new com.google.android.gms.internal.aet;
        r0.<init>();
        r6.f26629m = r0;
    L_0x0132:
        r0 = r6.f26629m;
        goto L_0x014a;
    L_0x0135:
        r0 = r7.m18989e();
        r6.f26630n = r0;
        goto L_0x0000;
    L_0x013d:
        r0 = r6.f26632p;
        if (r0 != 0) goto L_0x0148;
    L_0x0141:
        r0 = new com.google.android.gms.internal.aes;
        r0.<init>();
        r6.f26632p = r0;
    L_0x0148:
        r0 = r6.f26632p;
    L_0x014a:
        r7.m18980a(r0);
        goto L_0x0000;
    L_0x014f:
        r0 = r7.m18991f();
        r6.f26619c = r0;
        goto L_0x0000;
    L_0x0157:
        r0 = r7.m18991f();
        r6.f26628l = r0;
        goto L_0x0000;
    L_0x015f:
        r0 = 26;
        r0 = com.google.android.gms.internal.aeh.m19070a(r7, r0);
        r2 = r6.f26627k;
        if (r2 != 0) goto L_0x016b;
    L_0x0169:
        r2 = 0;
        goto L_0x016e;
    L_0x016b:
        r2 = r6.f26627k;
        r2 = r2.length;
    L_0x016e:
        r0 = r0 + r2;
        r0 = new com.google.android.gms.internal.aew[r0];
        if (r2 == 0) goto L_0x0178;
    L_0x0173:
        r3 = r6.f26627k;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0178:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x018f;
    L_0x017d:
        r1 = new com.google.android.gms.internal.aew;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.m18980a(r1);
        r7.m18978a();
        r2 = r2 + 1;
        goto L_0x0178;
    L_0x018f:
        r1 = new com.google.android.gms.internal.aew;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.m18980a(r1);
        r6.f26627k = r0;
        goto L_0x0000;
    L_0x019f:
        r0 = r7.m18989e();
        r6.f26623g = r0;
        goto L_0x0000;
    L_0x01a7:
        r0 = r7.m18982b();
        r6.f26617a = r0;
        goto L_0x0000;
    L_0x01af:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aev.b(com.google.android.gms.internal.adx):com.google.android.gms.internal.aev");
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int i;
        int a = super.mo4217a();
        if (this.f26617a != 0) {
            a += ady.m19017d(1, this.f26617a);
        }
        if (!(this.f26623g == null || this.f26623g.equals(""))) {
            a += ady.m19010b(2, this.f26623g);
        }
        if (this.f26627k != null && this.f26627k.length > 0) {
            i = a;
            for (aee aee : this.f26627k) {
                if (aee != null) {
                    i += ady.m19009b(3, aee);
                }
            }
            a = i;
        }
        if (!Arrays.equals(this.f26628l, aeh.f15114h)) {
            a += ady.m19011b(4, this.f26628l);
        }
        if (!Arrays.equals(this.f26619c, aeh.f15114h)) {
            a += ady.m19011b(6, this.f26619c);
        }
        if (this.f26632p != null) {
            a += ady.m19009b(7, this.f26632p);
        }
        if (!(this.f26630n == null || this.f26630n.equals(""))) {
            a += ady.m19010b(8, this.f26630n);
        }
        if (this.f26629m != null) {
            a += ady.m19009b(9, this.f26629m);
        }
        if (this.f26626j) {
            a += ady.m19007b(10) + 1;
        }
        if (this.f26624h != 0) {
            a += ady.m19008b(11, this.f26624h);
        }
        if (this.f26625i != 0) {
            a += ady.m19008b(12, this.f26625i);
        }
        if (!(this.f26631o == null || this.f26631o.equals(""))) {
            a += ady.m19010b(13, this.f26631o);
        }
        if (!(this.f26633q == null || this.f26633q.equals(""))) {
            a += ady.m19010b(14, this.f26633q);
        }
        if (this.f26620d != DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS) {
            a += ady.m19018e(15, this.f26620d);
        }
        if (this.f26634r != null) {
            a += ady.m19009b(16, this.f26634r);
        }
        if (this.f26618b != 0) {
            a += ady.m19017d(17, this.f26618b);
        }
        if (!Arrays.equals(this.f26621e, aeh.f15114h)) {
            a += ady.m19011b(18, this.f26621e);
        }
        if (this.f26636t != 0) {
            a += ady.m19008b(19, this.f26636t);
        }
        if (this.f26637u != null && this.f26637u.length > 0) {
            int i2 = 0;
            for (int i3 : this.f26637u) {
                i2 += ady.m18999a(i3);
            }
            a = (a + i2) + (this.f26637u.length * 2);
        }
        if (this.f26622f != 0) {
            a += ady.m19017d(21, this.f26622f);
        }
        if (this.f26638v != 0) {
            a += ady.m19017d(22, this.f26638v);
        }
        if (this.f26639w != null) {
            a += ady.m19009b(23, this.f26639w);
        }
        return (this.f26635s == null || this.f26635s.equals("")) ? a : a + ady.m19010b(24, this.f26635s);
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        return m31403b(adx);
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26617a != 0) {
            ady.m19028b(1, this.f26617a);
        }
        if (!(this.f26623g == null || this.f26623g.equals(""))) {
            ady.m19024a(2, this.f26623g);
        }
        if (this.f26627k != null && this.f26627k.length > 0) {
            for (aee aee : this.f26627k) {
                if (aee != null) {
                    ady.m19023a(3, aee);
                }
            }
        }
        if (!Arrays.equals(this.f26628l, aeh.f15114h)) {
            ady.m19026a(4, this.f26628l);
        }
        if (!Arrays.equals(this.f26619c, aeh.f15114h)) {
            ady.m19026a(6, this.f26619c);
        }
        if (this.f26632p != null) {
            ady.m19023a(7, this.f26632p);
        }
        if (!(this.f26630n == null || this.f26630n.equals(""))) {
            ady.m19024a(8, this.f26630n);
        }
        if (this.f26629m != null) {
            ady.m19023a(9, this.f26629m);
        }
        if (this.f26626j) {
            ady.m19025a(10, this.f26626j);
        }
        if (this.f26624h != 0) {
            ady.m19021a(11, this.f26624h);
        }
        if (this.f26625i != 0) {
            ady.m19021a(12, this.f26625i);
        }
        if (!(this.f26631o == null || this.f26631o.equals(""))) {
            ady.m19024a(13, this.f26631o);
        }
        if (!(this.f26633q == null || this.f26633q.equals(""))) {
            ady.m19024a(14, this.f26633q);
        }
        if (this.f26620d != DefaultFastMatchValues.PREVIEW_MIN_TIME_IN_MILLIS) {
            ady.m19031c(15, this.f26620d);
        }
        if (this.f26634r != null) {
            ady.m19023a(16, this.f26634r);
        }
        if (this.f26618b != 0) {
            ady.m19028b(17, this.f26618b);
        }
        if (!Arrays.equals(this.f26621e, aeh.f15114h)) {
            ady.m19026a(18, this.f26621e);
        }
        if (this.f26636t != 0) {
            ady.m19021a(19, this.f26636t);
        }
        if (this.f26637u != null && this.f26637u.length > 0) {
            for (int a : this.f26637u) {
                ady.m19021a(20, a);
            }
        }
        if (this.f26622f != 0) {
            ady.m19028b(21, this.f26622f);
        }
        if (this.f26638v != 0) {
            ady.m19028b(22, this.f26638v);
        }
        if (this.f26639w != null) {
            ady.m19023a(23, this.f26639w);
        }
        if (!(this.f26635s == null || this.f26635s.equals(""))) {
            ady.m19024a(24, this.f26635s);
        }
        super.mo4218a(ady);
    }

    /* renamed from: c */
    public final /* synthetic */ adz mo6840c() throws CloneNotSupportedException {
        return (aev) clone();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m31402b();
    }

    /* renamed from: d */
    public final /* synthetic */ aee mo4220d() throws CloneNotSupportedException {
        return (aev) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aev)) {
            return false;
        }
        aev aev = (aev) obj;
        if (this.f26617a != aev.f26617a || this.f26618b != aev.f26618b || this.f26622f != aev.f26622f) {
            return false;
        }
        if (this.f26623g == null) {
            if (aev.f26623g != null) {
                return false;
            }
        } else if (!this.f26623g.equals(aev.f26623g)) {
            return false;
        }
        if (this.f26624h != aev.f26624h || this.f26625i != aev.f26625i || this.f26626j != aev.f26626j || !aed.m19054a(this.f26627k, aev.f26627k) || !Arrays.equals(this.f26628l, aev.f26628l)) {
            return false;
        }
        if (this.f26629m == null) {
            if (aev.f26629m != null) {
                return false;
            }
        } else if (!this.f26629m.equals(aev.f26629m)) {
            return false;
        }
        if (!Arrays.equals(this.f26619c, aev.f26619c)) {
            return false;
        }
        if (this.f26630n == null) {
            if (aev.f26630n != null) {
                return false;
            }
        } else if (!this.f26630n.equals(aev.f26630n)) {
            return false;
        }
        if (this.f26631o == null) {
            if (aev.f26631o != null) {
                return false;
            }
        } else if (!this.f26631o.equals(aev.f26631o)) {
            return false;
        }
        if (this.f26632p == null) {
            if (aev.f26632p != null) {
                return false;
            }
        } else if (!this.f26632p.equals(aev.f26632p)) {
            return false;
        }
        if (this.f26633q == null) {
            if (aev.f26633q != null) {
                return false;
            }
        } else if (!this.f26633q.equals(aev.f26633q)) {
            return false;
        }
        if (this.f26620d != aev.f26620d) {
            return false;
        }
        if (this.f26634r == null) {
            if (aev.f26634r != null) {
                return false;
            }
        } else if (!this.f26634r.equals(aev.f26634r)) {
            return false;
        }
        if (!Arrays.equals(this.f26621e, aev.f26621e)) {
            return false;
        }
        if (this.f26635s == null) {
            if (aev.f26635s != null) {
                return false;
            }
        } else if (!this.f26635s.equals(aev.f26635s)) {
            return false;
        }
        if (this.f26636t != aev.f26636t || !aed.m19052a(this.f26637u, aev.f26637u) || this.f26638v != aev.f26638v) {
            return false;
        }
        if (this.f26639w == null) {
            if (aev.f26639w != null) {
                return false;
            }
        } else if (!this.f26639w.equals(aev.f26639w)) {
            return false;
        }
        if (this.X != null) {
            if (!this.X.m19041b()) {
                return this.X.equals(aev.X);
            }
        }
        return aev.X == null || aev.X.m19041b();
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + ((int) (this.f26617a ^ (this.f26617a >>> 32)))) * 31) + ((int) (this.f26618b ^ (this.f26618b >>> 32)))) * 31) + ((int) (this.f26622f ^ (this.f26622f >>> 32)))) * 31) + (this.f26623g == null ? 0 : this.f26623g.hashCode())) * 31) + this.f26624h) * 31) + this.f26625i) * 31) + (this.f26626j ? 1231 : 1237)) * 31) + aed.m19049a(this.f26627k)) * 31) + Arrays.hashCode(this.f26628l);
        aet aet = this.f26629m;
        hashCode = (((((((hashCode * 31) + (aet == null ? 0 : aet.hashCode())) * 31) + Arrays.hashCode(this.f26619c)) * 31) + (this.f26630n == null ? 0 : this.f26630n.hashCode())) * 31) + (this.f26631o == null ? 0 : this.f26631o.hashCode());
        aes aes = this.f26632p;
        hashCode = (((((hashCode * 31) + (aes == null ? 0 : aes.hashCode())) * 31) + (this.f26633q == null ? 0 : this.f26633q.hashCode())) * 31) + ((int) (this.f26620d ^ (this.f26620d >>> 32)));
        aeu aeu = this.f26634r;
        hashCode = (((((((((((hashCode * 31) + (aeu == null ? 0 : aeu.hashCode())) * 31) + Arrays.hashCode(this.f26621e)) * 31) + (this.f26635s == null ? 0 : this.f26635s.hashCode())) * 31) + this.f26636t) * 31) + aed.m19047a(this.f26637u)) * 31) + ((int) (this.f26638v ^ (this.f26638v >>> 32)));
        aex aex = this.f26639w;
        hashCode = ((hashCode * 31) + (aex == null ? 0 : aex.hashCode())) * 31;
        if (this.X != null) {
            if (!this.X.m19041b()) {
                i = this.X.hashCode();
            }
        }
        return hashCode + i;
    }
}
