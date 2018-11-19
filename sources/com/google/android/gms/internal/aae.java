package com.google.android.gms.internal;

import java.util.concurrent.Callable;

public final class aae implements Callable {
    /* renamed from: a */
    private final ub f14952a;
    /* renamed from: b */
    private final nx f14953b;

    public aae(ub ubVar, nx nxVar) {
        this.f14952a = ubVar;
        this.f14953b = nxVar;
    }

    /* renamed from: a */
    private final java.lang.Void m18792a() throws java.lang.Exception {
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
        r3 = this;
        r0 = r3.f14952a;
        r0 = r0.m20219l();
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r3.f14952a;
        r0 = r0.m20219l();
        r0.get();
    L_0x0011:
        r0 = r3.f14952a;
        r0 = r0.m20218k();
        if (r0 == 0) goto L_0x002a;
    L_0x0019:
        r1 = r3.f14953b;	 Catch:{ zzfjr -> 0x002a }
        monitor-enter(r1);	 Catch:{ zzfjr -> 0x002a }
        r2 = r3.f14953b;	 Catch:{ all -> 0x0027 }
        r0 = com.google.android.gms.internal.aee.m19058a(r0);	 Catch:{ all -> 0x0027 }
        com.google.android.gms.internal.aee.m19056a(r2, r0);	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        goto L_0x002a;	 Catch:{ all -> 0x0027 }
    L_0x0027:
        r0 = move-exception;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r0;	 Catch:{ zzfjr -> 0x002a }
    L_0x002a:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aae.a():java.lang.Void");
    }

    public final /* synthetic */ Object call() throws Exception {
        return m18792a();
    }
}
