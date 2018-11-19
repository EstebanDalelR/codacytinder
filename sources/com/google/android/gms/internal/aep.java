package com.google.android.gms.internal;

import java.io.IOException;

public final class aep extends adz<aep> {
    /* renamed from: a */
    public Integer f26589a;
    /* renamed from: b */
    public String f26590b;
    /* renamed from: c */
    public byte[] f26591c;

    public aep() {
        this.f26589a = null;
        this.f26590b = null;
        this.f26591c = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.aep m31372b(com.google.android.gms.internal.adx r7) throws java.io.IOException {
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
        if (r0 == 0) goto L_0x005a;
    L_0x0006:
        r1 = 8;
        if (r0 == r1) goto L_0x0027;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x0020;
    L_0x000e:
        r1 = 26;
        if (r0 == r1) goto L_0x0019;
    L_0x0012:
        r0 = super.m27063a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0018:
        return r6;
    L_0x0019:
        r0 = r7.m18991f();
        r6.f26591c = r0;
        goto L_0x0000;
    L_0x0020:
        r0 = r7.m18989e();
        r6.f26590b = r0;
        goto L_0x0000;
    L_0x0027:
        r1 = r7.m18998m();
        r2 = r7.m18985c();	 Catch:{ IllegalArgumentException -> 0x0053 }
        switch(r2) {
            case 0: goto L_0x0035;
            case 1: goto L_0x0035;
            default: goto L_0x0032;
        };	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0032:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0053 }
        goto L_0x003c;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0035:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r6.f26589a = r2;	 Catch:{ IllegalArgumentException -> 0x0053 }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x003c:
        r4 = 36;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r2 = " is not a valid enum Type";	 Catch:{ IllegalArgumentException -> 0x0053 }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0053 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0053 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0053 }
    L_0x0053:
        r7.m18990e(r1);
        r6.m27063a(r7, r0);
        goto L_0x0000;
    L_0x005a:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aep.b(com.google.android.gms.internal.adx):com.google.android.gms.internal.aep");
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        if (this.f26589a != null) {
            a += ady.m19008b(1, this.f26589a.intValue());
        }
        if (this.f26590b != null) {
            a += ady.m19010b(2, this.f26590b);
        }
        return this.f26591c != null ? a + ady.m19011b(3, this.f26591c) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        return m31372b(adx);
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26589a != null) {
            ady.m19021a(1, this.f26589a.intValue());
        }
        if (this.f26590b != null) {
            ady.m19024a(2, this.f26590b);
        }
        if (this.f26591c != null) {
            ady.m19026a(3, this.f26591c);
        }
        super.mo4218a(ady);
    }
}
