package com.google.android.gms.internal;

import java.io.IOException;

public final class aid extends adz<aid> {
    /* renamed from: a */
    public Integer f26645a;

    public aid() {
        this.f26645a = null;
        this.X = null;
        this.Y = -1;
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.aid m31423b(com.google.android.gms.internal.adx r7) throws java.io.IOException {
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
        if (r0 == 0) goto L_0x0044;
    L_0x0006:
        r1 = 56;
        if (r0 == r1) goto L_0x0011;
    L_0x000a:
        r0 = super.m27063a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0010:
        return r6;
    L_0x0011:
        r1 = r7.m18998m();
        r2 = r7.m18993h();	 Catch:{ IllegalArgumentException -> 0x003d }
        switch(r2) {
            case 0: goto L_0x001f;
            case 1: goto L_0x001f;
            case 2: goto L_0x001f;
            case 3: goto L_0x001f;
            case 4: goto L_0x001f;
            case 5: goto L_0x001f;
            case 6: goto L_0x001f;
            case 7: goto L_0x001f;
            case 8: goto L_0x001f;
            case 9: goto L_0x001f;
            default: goto L_0x001c;
        };	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x001c:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003d }
        goto L_0x0026;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x001f:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        r6.f26645a = r2;	 Catch:{ IllegalArgumentException -> 0x003d }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x0026:
        r4 = 43;	 Catch:{ IllegalArgumentException -> 0x003d }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003d }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x003d }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = " is not a valid enum AdInitiater";	 Catch:{ IllegalArgumentException -> 0x003d }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x003d }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003d }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003d }
    L_0x003d:
        r7.m18990e(r1);
        r6.m27063a(r7, r0);
        goto L_0x0000;
    L_0x0044:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aid.b(com.google.android.gms.internal.adx):com.google.android.gms.internal.aid");
    }

    /* renamed from: a */
    protected final int mo4217a() {
        int a = super.mo4217a();
        return this.f26645a != null ? a + ady.m19008b(7, this.f26645a.intValue()) : a;
    }

    /* renamed from: a */
    public final /* synthetic */ aee mo6839a(adx adx) throws IOException {
        return m31423b(adx);
    }

    /* renamed from: a */
    public final void mo4218a(ady ady) throws IOException {
        if (this.f26645a != null) {
            ady.m19021a(7, this.f26645a.intValue());
        }
        super.mo4218a(ady);
    }
}
