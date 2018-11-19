package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

public final class tq extends Thread {
    /* renamed from: a */
    private static final boolean f16538a = cg.f15916a;
    /* renamed from: b */
    private final BlockingQueue<aom<?>> f16539b;
    /* renamed from: c */
    private final BlockingQueue<aom<?>> f16540c;
    /* renamed from: d */
    private final zzb f16541d;
    /* renamed from: e */
    private final zzz f16542e;
    /* renamed from: f */
    private volatile boolean f16543f = false;
    /* renamed from: g */
    private final aax f16544g;

    public tq(BlockingQueue<aom<?>> blockingQueue, BlockingQueue<aom<?>> blockingQueue2, zzb zzb, zzz zzz) {
        this.f16539b = blockingQueue;
        this.f16540c = blockingQueue2;
        this.f16541d = zzb;
        this.f16542e = zzz;
        this.f16544g = new aax(this);
    }

    /* renamed from: a */
    public final void m20190a() {
        this.f16543f = true;
        interrupt();
    }

    public final void run() {
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
        r9 = this;
        r0 = f16538a;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = "start new dispatcher";
        r2 = new java.lang.Object[r1];
        com.google.android.gms.internal.cg.m19567a(r0, r2);
    L_0x000c:
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
        r0 = r9.f16541d;
        r0.initialize();
    L_0x0016:
        r0 = r9.f16539b;	 Catch:{ InterruptedException -> 0x00a4 }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x00a4 }
        r0 = (com.google.android.gms.internal.aom) r0;	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = "cache-queue-take";	 Catch:{ InterruptedException -> 0x00a4 }
        r0.m19388b(r2);	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r9.f16541d;	 Catch:{ InterruptedException -> 0x00a4 }
        r3 = r0.m19392e();	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r2.zza(r3);	 Catch:{ InterruptedException -> 0x00a4 }
        if (r2 != 0) goto L_0x0042;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x002f:
        r2 = "cache-miss";	 Catch:{ InterruptedException -> 0x00a4 }
        r0.m19388b(r2);	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r9.f16544g;	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r2.m26981b(r0);	 Catch:{ InterruptedException -> 0x00a4 }
        if (r2 != 0) goto L_0x0016;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x003c:
        r2 = r9.f16540c;	 Catch:{ InterruptedException -> 0x00a4 }
        r2.put(r0);	 Catch:{ InterruptedException -> 0x00a4 }
        goto L_0x0016;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x0042:
        r3 = r2.m20148a();	 Catch:{ InterruptedException -> 0x00a4 }
        if (r3 == 0) goto L_0x0059;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x0048:
        r3 = "cache-hit-expired";	 Catch:{ InterruptedException -> 0x00a4 }
        r0.m19388b(r3);	 Catch:{ InterruptedException -> 0x00a4 }
        r0.m19380a(r2);	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r9.f16544g;	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r2.m26981b(r0);	 Catch:{ InterruptedException -> 0x00a4 }
        if (r2 != 0) goto L_0x0016;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x0058:
        goto L_0x003c;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x0059:
        r3 = "cache-hit";	 Catch:{ InterruptedException -> 0x00a4 }
        r0.m19388b(r3);	 Catch:{ InterruptedException -> 0x00a4 }
        r3 = new com.google.android.gms.internal.amz;	 Catch:{ InterruptedException -> 0x00a4 }
        r4 = r2.f16398a;	 Catch:{ InterruptedException -> 0x00a4 }
        r5 = r2.f16404g;	 Catch:{ InterruptedException -> 0x00a4 }
        r3.<init>(r4, r5);	 Catch:{ InterruptedException -> 0x00a4 }
        r3 = r0.mo4623a(r3);	 Catch:{ InterruptedException -> 0x00a4 }
        r4 = "cache-hit-parsed";	 Catch:{ InterruptedException -> 0x00a4 }
        r0.m19388b(r4);	 Catch:{ InterruptedException -> 0x00a4 }
        r4 = r2.f16403f;	 Catch:{ InterruptedException -> 0x00a4 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00a4 }
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ InterruptedException -> 0x00a4 }
        r4 = 1;	 Catch:{ InterruptedException -> 0x00a4 }
        if (r8 >= 0) goto L_0x007d;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x007b:
        r5 = 1;	 Catch:{ InterruptedException -> 0x00a4 }
        goto L_0x007e;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x007d:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x007e:
        if (r5 != 0) goto L_0x0086;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x0080:
        r2 = r9.f16542e;	 Catch:{ InterruptedException -> 0x00a4 }
        r2.zzb(r0, r3);	 Catch:{ InterruptedException -> 0x00a4 }
        goto L_0x0016;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x0086:
        r5 = "cache-hit-refresh-needed";	 Catch:{ InterruptedException -> 0x00a4 }
        r0.m19388b(r5);	 Catch:{ InterruptedException -> 0x00a4 }
        r0.m19380a(r2);	 Catch:{ InterruptedException -> 0x00a4 }
        r3.f15692d = r4;	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r9.f16544g;	 Catch:{ InterruptedException -> 0x00a4 }
        r2 = r2.m26981b(r0);	 Catch:{ InterruptedException -> 0x00a4 }
        if (r2 != 0) goto L_0x0080;	 Catch:{ InterruptedException -> 0x00a4 }
    L_0x0098:
        r2 = r9.f16542e;	 Catch:{ InterruptedException -> 0x00a4 }
        r4 = new com.google.android.gms.internal.zz;	 Catch:{ InterruptedException -> 0x00a4 }
        r4.<init>(r9, r0);	 Catch:{ InterruptedException -> 0x00a4 }
        r2.zza(r0, r3, r4);	 Catch:{ InterruptedException -> 0x00a4 }
        goto L_0x0016;
    L_0x00a4:
        r0 = r9.f16543f;
        if (r0 == 0) goto L_0x0016;
    L_0x00a8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tq.run():void");
    }
}
