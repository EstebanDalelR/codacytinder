package com.facebook.ads.internal.p047k;

/* renamed from: com.facebook.ads.internal.k.f */
public enum C1486f {
    NONE,
    INSTALLED,
    NOT_INSTALLED;

    /* renamed from: a */
    public static com.facebook.ads.internal.p047k.C1486f m5229a(java.lang.String r1) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        r1 = NONE;
        return r1;
    L_0x0009:
        r0 = java.util.Locale.US;	 Catch:{ IllegalArgumentException -> 0x0014 }
        r1 = r1.toUpperCase(r0);	 Catch:{ IllegalArgumentException -> 0x0014 }
        r1 = com.facebook.ads.internal.p047k.C1486f.valueOf(r1);	 Catch:{ IllegalArgumentException -> 0x0014 }
        return r1;
    L_0x0014:
        r1 = NONE;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.f.a(java.lang.String):com.facebook.ads.internal.k.f");
    }
}
