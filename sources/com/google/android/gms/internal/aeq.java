package com.google.android.gms.internal;

import java.io.IOException;

public final class aeq extends adz<aeq> {
    /* renamed from: f */
    private static volatile aeq[] f26592f;
    /* renamed from: a */
    public Integer f26593a;
    /* renamed from: b */
    public String f26594b;
    /* renamed from: c */
    public ael f26595c;
    /* renamed from: d */
    public Integer f26596d;
    /* renamed from: e */
    public String[] f26597e;
    /* renamed from: g */
    private aen f26598g;
    /* renamed from: h */
    private Integer f26599h;
    /* renamed from: i */
    private int[] f26600i;
    /* renamed from: j */
    private String f26601j;

    public aeq() {
        this.f26593a = null;
        this.f26594b = null;
        this.f26595c = null;
        this.f26598g = null;
        this.f26599h = null;
        this.f26600i = aeh.f15107a;
        this.f26601j = null;
        this.f26596d = null;
        this.f26597e = aeh.f15112f;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.aeq m31376b(com.google.android.gms.internal.adx r7) throws java.io.IOException {
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
            case 0: goto L_0x0132;
            case 8: goto L_0x0126;
            case 18: goto L_0x011e;
            case 26: goto L_0x010c;
            case 34: goto L_0x00fe;
            case 40: goto L_0x00f2;
            case 48: goto L_0x00be;
            case 50: goto L_0x007c;
            case 58: goto L_0x0075;
            case 64: goto L_0x0042;
            case 74: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m27063a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = 74;
        r0 = com.google.android.gms.internal.aeh.m19070a(r7, r0);
        r2 = r6.f26597e;
        if (r2 != 0) goto L_0x001b;
    L_0x0019:
        r2 = 0;
        goto L_0x001e;
    L_0x001b:
        r2 = r6.f26597e;
        r2 = r2.length;
    L_0x001e:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x0028;
    L_0x0023:
        r3 = r6.f26597e;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0028:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x0039;
    L_0x002d:
        r1 = r7.m18989e();
        r0[r2] = r1;
        r7.m18978a();
        r2 = r2 + 1;
        goto L_0x0028;
    L_0x0039:
        r1 = r7.m18989e();
        r0[r2] = r1;
        r6.f26597e = r0;
        goto L_0x0000;
    L_0x0042:
        r1 = r7.m18998m();
        r2 = r7.m18985c();	 Catch:{ IllegalArgumentException -> 0x006e }
        switch(r2) {
            case 0: goto L_0x0050;
            case 1: goto L_0x0050;
            case 2: goto L_0x0050;
            case 3: goto L_0x0050;
            default: goto L_0x004d;
        };	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x004d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006e }
        goto L_0x0057;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x0050:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r6.f26596d = r2;	 Catch:{ IllegalArgumentException -> 0x006e }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x0057:
        r4 = 46;	 Catch:{ IllegalArgumentException -> 0x006e }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r2 = " is not a valid enum AdResourceType";	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x006e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x006e:
        r7.m18990e(r1);
        r6.m27063a(r7, r0);
        goto L_0x0000;
    L_0x0075:
        r0 = r7.m18989e();
        r6.f26601j = r0;
        goto L_0x0000;
    L_0x007c:
        r0 = r7.m18993h();
        r0 = r7.m18986c(r0);
        r2 = r7.m18998m();
        r3 = 0;
    L_0x0089:
        r4 = r7.m18997l();
        if (r4 <= 0) goto L_0x0095;
    L_0x008f:
        r7.m18985c();
        r3 = r3 + 1;
        goto L_0x0089;
    L_0x0095:
        r7.m18990e(r2);
        r2 = r6.f26600i;
        if (r2 != 0) goto L_0x009e;
    L_0x009c:
        r2 = 0;
        goto L_0x00a1;
    L_0x009e:
        r2 = r6.f26600i;
        r2 = r2.length;
    L_0x00a1:
        r3 = r3 + r2;
        r3 = new int[r3];
        if (r2 == 0) goto L_0x00ab;
    L_0x00a6:
        r4 = r6.f26600i;
        java.lang.System.arraycopy(r4, r1, r3, r1, r2);
    L_0x00ab:
        r1 = r3.length;
        if (r2 >= r1) goto L_0x00b7;
    L_0x00ae:
        r1 = r7.m18985c();
        r3[r2] = r1;
        r2 = r2 + 1;
        goto L_0x00ab;
    L_0x00b7:
        r6.f26600i = r3;
        r7.m18987d(r0);
        goto L_0x0000;
    L_0x00be:
        r0 = 48;
        r0 = com.google.android.gms.internal.aeh.m19070a(r7, r0);
        r2 = r6.f26600i;
        if (r2 != 0) goto L_0x00ca;
    L_0x00c8:
        r2 = 0;
        goto L_0x00cd;
    L_0x00ca:
        r2 = r6.f26600i;
        r2 = r2.length;
    L_0x00cd:
        r0 = r0 + r2;
        r0 = new int[r0];
        if (r2 == 0) goto L_0x00d7;
    L_0x00d2:
        r3 = r6.f26600i;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00d7:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00e8;
    L_0x00dc:
        r1 = r7.m18985c();
        r0[r2] = r1;
        r7.m18978a();
        r2 = r2 + 1;
        goto L_0x00d7;
    L_0x00e8:
        r1 = r7.m18985c();
        r0[r2] = r1;
        r6.f26600i = r0;
        goto L_0x0000;
    L_0x00f2:
        r0 = r7.m18985c();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f26599h = r0;
        goto L_0x0000;
    L_0x00fe:
        r0 = r6.f26598g;
        if (r0 != 0) goto L_0x0109;
    L_0x0102:
        r0 = new com.google.android.gms.internal.aen;
        r0.<init>();
        r6.f26598g = r0;
    L_0x0109:
        r0 = r6.f26598g;
        goto L_0x0119;
    L_0x010c:
        r0 = r6.f26595c;
        if (r0 != 0) goto L_0x0117;
    L_0x0110:
        r0 = new com.google.android.gms.internal.ael;
        r0.<init>();
        r6.f26595c = r0;
    L_0x0117:
        r0 = r6.f26595c;
    L_0x0119:
        r7.m18980a(r0);
        goto L_0x0000;
    L_0x011e:
        r0 = r7.m18989e();
        r6.f26594b = r0;
        goto L_0x0000;
    L_0x0126:
        r0 = r7.m18985c();
        r0 = java.lang.Integer.valueOf(r0);
        r6.f26593a = r0;
        goto L_0x0000;
    L_0x0132:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aeq.b(com.google.android.gms.internal.adx):com.google.android.gms.internal.aeq");
    }

    /* renamed from: b */
    public static aeq[] m31377b() {
        if (f26592f == null) {
            synchronized (aed.f15102b) {
                if (f26592f == null) {
                    f26592f = new aeq[0];
                }
            }
        }
        return f26592f;
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int i;
        int i2;
        int a = super.mo4217a() + ady.m19008b(1, this.f26593a.intValue());
        if (this.f26594b != null) {
            a += ady.m19010b(2, this.f26594b);
        }
        if (this.f26595c != null) {
            a += ady.m19009b(3, this.f26595c);
        }
        if (this.f26598g != null) {
            a += ady.m19009b(4, this.f26598g);
        }
        if (this.f26599h != null) {
            a += ady.m19008b(5, this.f26599h.intValue());
        }
        if (this.f26600i != null && this.f26600i.length > 0) {
            i = 0;
            for (int a2 : this.f26600i) {
                i += ady.m18999a(a2);
            }
            a = (a + i) + (this.f26600i.length * 1);
        }
        if (this.f26601j != null) {
            a += ady.m19010b(7, this.f26601j);
        }
        if (this.f26596d != null) {
            a += ady.m19008b(8, this.f26596d.intValue());
        }
        if (this.f26597e == null || this.f26597e.length <= 0) {
            return a;
        }
        i2 = 0;
        i = 0;
        for (String str : this.f26597e) {
            if (str != null) {
                i++;
                i2 += ady.m19003a(str);
            }
        }
        return (a + i2) + (i * 1);
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        return m31376b(adx);
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        ady.m19021a(1, this.f26593a.intValue());
        if (this.f26594b != null) {
            ady.m19024a(2, this.f26594b);
        }
        if (this.f26595c != null) {
            ady.m19023a(3, this.f26595c);
        }
        if (this.f26598g != null) {
            ady.m19023a(4, this.f26598g);
        }
        if (this.f26599h != null) {
            ady.m19021a(5, this.f26599h.intValue());
        }
        if (this.f26600i != null && this.f26600i.length > 0) {
            for (int a : this.f26600i) {
                ady.m19021a(6, a);
            }
        }
        if (this.f26601j != null) {
            ady.m19024a(7, this.f26601j);
        }
        if (this.f26596d != null) {
            ady.m19021a(8, this.f26596d.intValue());
        }
        if (this.f26597e != null && this.f26597e.length > 0) {
            for (String str : this.f26597e) {
                if (str != null) {
                    ady.m19024a(9, str);
                }
            }
        }
        super.mo4218a(ady);
    }
}
