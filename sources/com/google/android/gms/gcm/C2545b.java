package com.google.android.gms.gcm;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.gcm.b */
public class C2545b {
    /* renamed from: a */
    private static final AtomicInteger f7742a = new AtomicInteger(1);

    /* renamed from: a */
    public static int m9276a(android.content.Context r2) {
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
        r0 = com.google.android.gms.iid.C2562k.m9311a(r2);
        if (r0 == 0) goto L_0x0014;
    L_0x0006:
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0014 }
        r1 = 0;	 Catch:{ NameNotFoundException -> 0x0014 }
        r2 = r2.getPackageInfo(r0, r1);	 Catch:{ NameNotFoundException -> 0x0014 }
        if (r2 == 0) goto L_0x0014;	 Catch:{ NameNotFoundException -> 0x0014 }
    L_0x0011:
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x0014 }
        return r2;
    L_0x0014:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.b.a(android.content.Context):int");
    }
}
