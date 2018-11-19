package com.google.android.gms.internal;

import java.io.IOException;

public final class og extends adz<og> {
    /* renamed from: a */
    public byte[][] f27041a;
    /* renamed from: b */
    public byte[] f27042b;
    /* renamed from: c */
    public Integer f27043c;
    /* renamed from: d */
    private Integer f27044d;

    public og() {
        this.f27041a = aeh.f15113g;
        this.f27042b = null;
        this.Y = -1;
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.og m31644b(com.google.android.gms.internal.adx r7) throws java.io.IOException {
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
        if (r0 == 0) goto L_0x00b7;
    L_0x0006:
        r1 = 10;
        if (r0 == r1) goto L_0x0084;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x007c;
    L_0x000e:
        r1 = 24;
        if (r0 == r1) goto L_0x0049;
    L_0x0012:
        r1 = 32;
        if (r0 == r1) goto L_0x001d;
    L_0x0016:
        r0 = super.m27063a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x001c:
        return r6;
    L_0x001d:
        r1 = r7.m18998m();
        r2 = r7.m18993h();	 Catch:{ IllegalArgumentException -> 0x0075 }
        switch(r2) {
            case 0: goto L_0x002b;
            case 1: goto L_0x002b;
            case 2: goto L_0x002b;
            default: goto L_0x0028;
        };	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0028:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0032;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x002b:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r6.f27043c = r2;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0032:
        r4 = 48;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = " is not a valid enum EncryptionMethod";	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0049:
        r1 = r7.m18998m();
        r2 = r7.m18993h();	 Catch:{ IllegalArgumentException -> 0x0075 }
        switch(r2) {
            case 0: goto L_0x0057;
            case 1: goto L_0x0057;
            default: goto L_0x0054;
        };	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0054:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x005e;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0057:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r6.f27044d = r2;	 Catch:{ IllegalArgumentException -> 0x0075 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x005e:
        r4 = 41;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = " is not a valid enum ProtoName";	 Catch:{ IllegalArgumentException -> 0x0075 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0075 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0075 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0075 }
    L_0x0075:
        r7.m18990e(r1);
        r6.m27063a(r7, r0);
        goto L_0x0000;
    L_0x007c:
        r0 = r7.m18991f();
        r6.f27042b = r0;
        goto L_0x0000;
    L_0x0084:
        r0 = com.google.android.gms.internal.aeh.m19070a(r7, r1);
        r1 = r6.f27041a;
        r2 = 0;
        if (r1 != 0) goto L_0x008f;
    L_0x008d:
        r1 = 0;
        goto L_0x0092;
    L_0x008f:
        r1 = r6.f27041a;
        r1 = r1.length;
    L_0x0092:
        r0 = r0 + r1;
        r0 = new byte[r0][];
        if (r1 == 0) goto L_0x009c;
    L_0x0097:
        r3 = r6.f27041a;
        java.lang.System.arraycopy(r3, r2, r0, r2, r1);
    L_0x009c:
        r2 = r0.length;
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x00ad;
    L_0x00a1:
        r2 = r7.m18991f();
        r0[r1] = r2;
        r7.m18978a();
        r1 = r1 + 1;
        goto L_0x009c;
    L_0x00ad:
        r2 = r7.m18991f();
        r0[r1] = r2;
        r6.f27041a = r0;
        goto L_0x0000;
    L_0x00b7:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.og.b(com.google.android.gms.internal.adx):com.google.android.gms.internal.og");
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f27041a != null && this.f27041a.length > 0) {
            int i = 0;
            int i2 = 0;
            for (byte[] bArr : this.f27041a) {
                if (bArr != null) {
                    i2++;
                    i += ady.m19012b(bArr);
                }
            }
            a = (a + i) + (i2 * 1);
        }
        if (this.f27042b != null) {
            a += ady.m19011b(2, this.f27042b);
        }
        if (this.f27044d != null) {
            a += ady.m19008b(3, this.f27044d.intValue());
        }
        return this.f27043c != null ? a + ady.m19008b(4, this.f27043c.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        return m31644b(adx);
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f27041a != null && this.f27041a.length > 0) {
            for (byte[] bArr : this.f27041a) {
                if (bArr != null) {
                    ady.m19026a(1, bArr);
                }
            }
        }
        if (this.f27042b != null) {
            ady.m19026a(2, this.f27042b);
        }
        if (this.f27044d != null) {
            ady.m19021a(3, this.f27044d.intValue());
        }
        if (this.f27043c != null) {
            ady.m19021a(4, this.f27043c.intValue());
        }
        super.mo4218a(ady);
    }
}
