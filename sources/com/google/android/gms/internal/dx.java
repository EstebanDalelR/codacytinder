package com.google.android.gms.internal;

@zzzv
public final class dx {
    /* renamed from: a */
    private static final Object f16047a = new Object();
    /* renamed from: b */
    private static String f16048b;

    /* renamed from: a */
    public static String m19649a() {
        String str;
        synchronized (f16047a) {
            str = f16048b;
        }
        return str;
    }

    /* renamed from: a */
    public static java.lang.String m19650a(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
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
        r0 = f16047a;
        monitor-enter(r0);
        r1 = f16048b;	 Catch:{ all -> 0x0058 }
        if (r1 != 0) goto L_0x0054;	 Catch:{ all -> 0x0058 }
    L_0x0007:
        r1 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x0058 }
        if (r1 != 0) goto L_0x0054;
    L_0x000d:
        r1 = 3;
        r6 = r6.createPackageContext(r8, r1);	 Catch:{ Throwable -> 0x0051 }
        r6 = r6.getClassLoader();	 Catch:{ Throwable -> 0x0051 }
        r8 = "com.google.ads.mediation.MediationAdapter";	 Catch:{ Throwable -> 0x0051 }
        r1 = 0;	 Catch:{ Throwable -> 0x0051 }
        r8 = java.lang.Class.forName(r8, r1, r6);	 Catch:{ Throwable -> 0x0051 }
        r2 = new java.math.BigInteger;	 Catch:{ all -> 0x0058 }
        r3 = 1;	 Catch:{ all -> 0x0058 }
        r4 = new byte[r3];	 Catch:{ all -> 0x0058 }
        r2.<init>(r4);	 Catch:{ all -> 0x0058 }
        r4 = ",";	 Catch:{ all -> 0x0058 }
        r7 = r7.split(r4);	 Catch:{ all -> 0x0058 }
        r4 = r2;	 Catch:{ all -> 0x0058 }
        r2 = 0;	 Catch:{ all -> 0x0058 }
    L_0x002d:
        r5 = r7.length;	 Catch:{ all -> 0x0058 }
        if (r2 >= r5) goto L_0x0042;	 Catch:{ all -> 0x0058 }
    L_0x0030:
        com.google.android.gms.ads.internal.ar.e();	 Catch:{ all -> 0x0058 }
        r5 = r7[r2];	 Catch:{ all -> 0x0058 }
        r5 = com.google.android.gms.internal.fk.m19709a(r6, r8, r5);	 Catch:{ all -> 0x0058 }
        if (r5 == 0) goto L_0x003f;	 Catch:{ all -> 0x0058 }
    L_0x003b:
        r4 = r4.setBit(r2);	 Catch:{ all -> 0x0058 }
    L_0x003f:
        r2 = r2 + 1;	 Catch:{ all -> 0x0058 }
        goto L_0x002d;	 Catch:{ all -> 0x0058 }
    L_0x0042:
        r6 = java.util.Locale.US;	 Catch:{ all -> 0x0058 }
        r7 = "%X";	 Catch:{ all -> 0x0058 }
        r8 = new java.lang.Object[r3];	 Catch:{ all -> 0x0058 }
        r8[r1] = r4;	 Catch:{ all -> 0x0058 }
        r6 = java.lang.String.format(r6, r7, r8);	 Catch:{ all -> 0x0058 }
    L_0x004e:
        f16048b = r6;	 Catch:{ all -> 0x0058 }
        goto L_0x0054;	 Catch:{ all -> 0x0058 }
    L_0x0051:
        r6 = "err";	 Catch:{ all -> 0x0058 }
        goto L_0x004e;	 Catch:{ all -> 0x0058 }
    L_0x0054:
        r6 = f16048b;	 Catch:{ all -> 0x0058 }
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return r6;	 Catch:{ all -> 0x0058 }
    L_0x0058:
        r6 = move-exception;	 Catch:{ all -> 0x0058 }
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.dx.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }
}
