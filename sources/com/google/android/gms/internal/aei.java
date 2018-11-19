package com.google.android.gms.internal;

import java.io.IOException;

public final class aei extends adz<aei> {
    /* renamed from: a */
    public Integer f26552a;
    /* renamed from: b */
    public String f26553b;
    /* renamed from: c */
    public String f26554c;
    /* renamed from: d */
    public aej f26555d;
    /* renamed from: e */
    public aeq[] f26556e;
    /* renamed from: f */
    public String f26557f;
    /* renamed from: g */
    public aep f26558g;
    /* renamed from: h */
    public aer f26559h;
    /* renamed from: i */
    private Integer f26560i;
    /* renamed from: j */
    private String f26561j;
    /* renamed from: k */
    private Boolean f26562k;
    /* renamed from: l */
    private String[] f26563l;
    /* renamed from: m */
    private String f26564m;
    /* renamed from: n */
    private Boolean f26565n;
    /* renamed from: o */
    private Boolean f26566o;
    /* renamed from: p */
    private byte[] f26567p;

    public aei() {
        this.f26552a = null;
        this.f26560i = null;
        this.f26553b = null;
        this.f26554c = null;
        this.f26561j = null;
        this.f26555d = null;
        this.f26556e = aeq.m31377b();
        this.f26557f = null;
        this.f26558g = null;
        this.f26562k = null;
        this.f26563l = aeh.f15112f;
        this.f26564m = null;
        this.f26565n = null;
        this.f26566o = null;
        this.f26567p = null;
        this.f26559h = null;
        this.X = null;
        this.Y = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final com.google.android.gms.internal.aei m31349b(com.google.android.gms.internal.adx r7) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m18978a();
        r1 = 0;
        switch(r0) {
            case 0: goto L_0x0163;
            case 10: goto L_0x015b;
            case 18: goto L_0x0153;
            case 26: goto L_0x014b;
            case 34: goto L_0x010b;
            case 40: goto L_0x00ff;
            case 50: goto L_0x00cb;
            case 58: goto L_0x00c3;
            case 64: goto L_0x00b7;
            case 72: goto L_0x00ab;
            case 80: goto L_0x0076;
            case 88: goto L_0x004a;
            case 98: goto L_0x0039;
            case 106: goto L_0x0032;
            case 114: goto L_0x0024;
            case 122: goto L_0x001d;
            case 138: goto L_0x000f;
            default: goto L_0x0008;
        };
    L_0x0008:
        r0 = super.m27063a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000e:
        return r6;
    L_0x000f:
        r0 = r6.f26559h;
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new com.google.android.gms.internal.aer;
        r0.<init>();
        r6.f26559h = r0;
    L_0x001a:
        r0 = r6.f26559h;
        goto L_0x0046;
    L_0x001d:
        r0 = r7.m18991f();
        r6.f26567p = r0;
        goto L_0x0000;
    L_0x0024:
        r0 = r6.f26558g;
        if (r0 != 0) goto L_0x002f;
    L_0x0028:
        r0 = new com.google.android.gms.internal.aep;
        r0.<init>();
        r6.f26558g = r0;
    L_0x002f:
        r0 = r6.f26558g;
        goto L_0x0046;
    L_0x0032:
        r0 = r7.m18989e();
        r6.f26557f = r0;
        goto L_0x0000;
    L_0x0039:
        r0 = r6.f26555d;
        if (r0 != 0) goto L_0x0044;
    L_0x003d:
        r0 = new com.google.android.gms.internal.aej;
        r0.<init>();
        r6.f26555d = r0;
    L_0x0044:
        r0 = r6.f26555d;
    L_0x0046:
        r7.m18980a(r0);
        goto L_0x0000;
    L_0x004a:
        r1 = r7.m18998m();
        r2 = r7.m18985c();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        switch(r2) {
            case 0: goto L_0x0058;
            case 1: goto L_0x0058;
            case 2: goto L_0x0058;
            case 3: goto L_0x0058;
            case 4: goto L_0x0058;
            default: goto L_0x0055;
        };	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0055:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x005f;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0058:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r6.f26560i = r2;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x005f:
        r4 = 39;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = " is not a valid enum Verdict";	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0076:
        r1 = r7.m18998m();
        r2 = r7.m18985c();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        switch(r2) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0084;
            case 2: goto L_0x0084;
            case 3: goto L_0x0084;
            case 4: goto L_0x0084;
            case 5: goto L_0x0084;
            case 6: goto L_0x0084;
            case 7: goto L_0x0084;
            case 8: goto L_0x0084;
            case 9: goto L_0x0084;
            default: goto L_0x0081;
        };	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0081:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x008c;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x0084:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r6.f26552a = r2;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x008c:
        r4 = 42;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = " is not a valid enum ReportType";	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x00a3:
        r7.m18990e(r1);
        r6.m27063a(r7, r0);
        goto L_0x0000;
    L_0x00ab:
        r0 = r7.m18988d();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f26566o = r0;
        goto L_0x0000;
    L_0x00b7:
        r0 = r7.m18988d();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f26565n = r0;
        goto L_0x0000;
    L_0x00c3:
        r0 = r7.m18989e();
        r6.f26564m = r0;
        goto L_0x0000;
    L_0x00cb:
        r0 = 50;
        r0 = com.google.android.gms.internal.aeh.m19070a(r7, r0);
        r2 = r6.f26563l;
        if (r2 != 0) goto L_0x00d7;
    L_0x00d5:
        r2 = 0;
        goto L_0x00da;
    L_0x00d7:
        r2 = r6.f26563l;
        r2 = r2.length;
    L_0x00da:
        r0 = r0 + r2;
        r0 = new java.lang.String[r0];
        if (r2 == 0) goto L_0x00e4;
    L_0x00df:
        r3 = r6.f26563l;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x00e4:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x00f5;
    L_0x00e9:
        r1 = r7.m18989e();
        r0[r2] = r1;
        r7.m18978a();
        r2 = r2 + 1;
        goto L_0x00e4;
    L_0x00f5:
        r1 = r7.m18989e();
        r0[r2] = r1;
        r6.f26563l = r0;
        goto L_0x0000;
    L_0x00ff:
        r0 = r7.m18988d();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f26562k = r0;
        goto L_0x0000;
    L_0x010b:
        r0 = 34;
        r0 = com.google.android.gms.internal.aeh.m19070a(r7, r0);
        r2 = r6.f26556e;
        if (r2 != 0) goto L_0x0117;
    L_0x0115:
        r2 = 0;
        goto L_0x011a;
    L_0x0117:
        r2 = r6.f26556e;
        r2 = r2.length;
    L_0x011a:
        r0 = r0 + r2;
        r0 = new com.google.android.gms.internal.aeq[r0];
        if (r2 == 0) goto L_0x0124;
    L_0x011f:
        r3 = r6.f26556e;
        java.lang.System.arraycopy(r3, r1, r0, r1, r2);
    L_0x0124:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r2 >= r1) goto L_0x013b;
    L_0x0129:
        r1 = new com.google.android.gms.internal.aeq;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.m18980a(r1);
        r7.m18978a();
        r2 = r2 + 1;
        goto L_0x0124;
    L_0x013b:
        r1 = new com.google.android.gms.internal.aeq;
        r1.<init>();
        r0[r2] = r1;
        r1 = r0[r2];
        r7.m18980a(r1);
        r6.f26556e = r0;
        goto L_0x0000;
    L_0x014b:
        r0 = r7.m18989e();
        r6.f26561j = r0;
        goto L_0x0000;
    L_0x0153:
        r0 = r7.m18989e();
        r6.f26554c = r0;
        goto L_0x0000;
    L_0x015b:
        r0 = r7.m18989e();
        r6.f26553b = r0;
        goto L_0x0000;
    L_0x0163:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aei.b(com.google.android.gms.internal.adx):com.google.android.gms.internal.aei");
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int i;
        int a = super.mo4217a();
        if (this.f26553b != null) {
            a += ady.m19010b(1, this.f26553b);
        }
        if (this.f26554c != null) {
            a += ady.m19010b(2, this.f26554c);
        }
        if (this.f26561j != null) {
            a += ady.m19010b(3, this.f26561j);
        }
        if (this.f26556e != null && this.f26556e.length > 0) {
            i = a;
            for (aee aee : this.f26556e) {
                if (aee != null) {
                    i += ady.m19009b(4, aee);
                }
            }
            a = i;
        }
        if (this.f26562k != null) {
            this.f26562k.booleanValue();
            a += ady.m19007b(5) + 1;
        }
        if (this.f26563l != null && this.f26563l.length > 0) {
            i = 0;
            int i2 = 0;
            for (String str : this.f26563l) {
                if (str != null) {
                    i2++;
                    i += ady.m19003a(str);
                }
            }
            a = (a + i) + (i2 * 1);
        }
        if (this.f26564m != null) {
            a += ady.m19010b(7, this.f26564m);
        }
        if (this.f26565n != null) {
            this.f26565n.booleanValue();
            a += ady.m19007b(8) + 1;
        }
        if (this.f26566o != null) {
            this.f26566o.booleanValue();
            a += ady.m19007b(9) + 1;
        }
        if (this.f26552a != null) {
            a += ady.m19008b(10, this.f26552a.intValue());
        }
        if (this.f26560i != null) {
            a += ady.m19008b(11, this.f26560i.intValue());
        }
        if (this.f26555d != null) {
            a += ady.m19009b(12, this.f26555d);
        }
        if (this.f26557f != null) {
            a += ady.m19010b(13, this.f26557f);
        }
        if (this.f26558g != null) {
            a += ady.m19009b(14, this.f26558g);
        }
        if (this.f26567p != null) {
            a += ady.m19011b(15, this.f26567p);
        }
        return this.f26559h != null ? a + ady.m19009b(17, this.f26559h) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        return m31349b(adx);
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26553b != null) {
            ady.m19024a(1, this.f26553b);
        }
        if (this.f26554c != null) {
            ady.m19024a(2, this.f26554c);
        }
        if (this.f26561j != null) {
            ady.m19024a(3, this.f26561j);
        }
        if (this.f26556e != null && this.f26556e.length > 0) {
            for (aee aee : this.f26556e) {
                if (aee != null) {
                    ady.m19023a(4, aee);
                }
            }
        }
        if (this.f26562k != null) {
            ady.m19025a(5, this.f26562k.booleanValue());
        }
        if (this.f26563l != null && this.f26563l.length > 0) {
            for (String str : this.f26563l) {
                if (str != null) {
                    ady.m19024a(6, str);
                }
            }
        }
        if (this.f26564m != null) {
            ady.m19024a(7, this.f26564m);
        }
        if (this.f26565n != null) {
            ady.m19025a(8, this.f26565n.booleanValue());
        }
        if (this.f26566o != null) {
            ady.m19025a(9, this.f26566o.booleanValue());
        }
        if (this.f26552a != null) {
            ady.m19021a(10, this.f26552a.intValue());
        }
        if (this.f26560i != null) {
            ady.m19021a(11, this.f26560i.intValue());
        }
        if (this.f26555d != null) {
            ady.m19023a(12, this.f26555d);
        }
        if (this.f26557f != null) {
            ady.m19024a(13, this.f26557f);
        }
        if (this.f26558g != null) {
            ady.m19023a(14, this.f26558g);
        }
        if (this.f26567p != null) {
            ady.m19026a(15, this.f26567p);
        }
        if (this.f26559h != null) {
            ady.m19023a(17, this.f26559h);
        }
        super.mo4218a(ady);
    }
}
