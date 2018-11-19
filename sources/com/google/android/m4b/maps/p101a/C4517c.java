package com.google.android.m4b.maps.p101a;

import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.m4b.maps.a.c */
public final class C4517c extends Thread {
    /* renamed from: a */
    private static final boolean f16779a = C4535s.f16849a;
    /* renamed from: b */
    private final BlockingQueue<C4525k<?>> f16780b;
    /* renamed from: c */
    private final BlockingQueue<C4525k<?>> f16781c;
    /* renamed from: d */
    private final C4515b f16782d;
    /* renamed from: e */
    private final C4530n f16783e;
    /* renamed from: f */
    private volatile boolean f16784f = false;

    public C4517c(BlockingQueue<C4525k<?>> blockingQueue, BlockingQueue<C4525k<?>> blockingQueue2, C4515b c4515b, C4530n c4530n) {
        this.f16780b = blockingQueue;
        this.f16781c = blockingQueue2;
        this.f16782d = c4515b;
        this.f16783e = c4530n;
    }

    /* renamed from: a */
    public final void m20416a() {
        this.f16784f = true;
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r10 = this;
        r0 = f16779a;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = "start new dispatcher";
        r2 = new java.lang.Object[r1];
        com.google.android.m4b.maps.p101a.C4535s.m20467a(r0, r2);
    L_0x000c:
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
        r0 = r10.f16782d;
        r0.mo4901a();
    L_0x0016:
        r0 = r10.f16780b;	 Catch:{ InterruptedException -> 0x00a6 }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x00a6 }
        r0 = (com.google.android.m4b.maps.p101a.C4525k) r0;	 Catch:{ InterruptedException -> 0x00a6 }
        r2 = "cache-queue-take";	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20430a(r2);	 Catch:{ InterruptedException -> 0x00a6 }
        r2 = r0.m20438g();	 Catch:{ InterruptedException -> 0x00a6 }
        if (r2 == 0) goto L_0x002f;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0029:
        r2 = "cache-discard-canceled";	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20433b(r2);	 Catch:{ InterruptedException -> 0x00a6 }
        goto L_0x0016;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x002f:
        r2 = r10.f16782d;	 Catch:{ InterruptedException -> 0x00a6 }
        r3 = r0.m20435d();	 Catch:{ InterruptedException -> 0x00a6 }
        r2 = r2.mo4900a(r3);	 Catch:{ InterruptedException -> 0x00a6 }
        if (r2 != 0) goto L_0x0046;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x003b:
        r2 = "cache-miss";	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20430a(r2);	 Catch:{ InterruptedException -> 0x00a6 }
        r2 = r10.f16781c;	 Catch:{ InterruptedException -> 0x00a6 }
        r2.put(r0);	 Catch:{ InterruptedException -> 0x00a6 }
        goto L_0x0016;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0046:
        r3 = r2.f16774e;	 Catch:{ InterruptedException -> 0x00a6 }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00a6 }
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));	 Catch:{ InterruptedException -> 0x00a6 }
        r3 = 1;	 Catch:{ InterruptedException -> 0x00a6 }
        if (r7 >= 0) goto L_0x0053;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0051:
        r4 = 1;	 Catch:{ InterruptedException -> 0x00a6 }
        goto L_0x0054;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0053:
        r4 = 0;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0054:
        if (r4 == 0) goto L_0x0064;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0056:
        r3 = "cache-hit-expired";	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20430a(r3);	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20424a(r2);	 Catch:{ InterruptedException -> 0x00a6 }
        r2 = r10.f16781c;	 Catch:{ InterruptedException -> 0x00a6 }
        r2.put(r0);	 Catch:{ InterruptedException -> 0x00a6 }
        goto L_0x0016;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0064:
        r4 = "cache-hit";	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20430a(r4);	 Catch:{ InterruptedException -> 0x00a6 }
        r4 = new com.google.android.m4b.maps.a.h;	 Catch:{ InterruptedException -> 0x00a6 }
        r5 = r2.f16770a;	 Catch:{ InterruptedException -> 0x00a6 }
        r6 = r2.f16776g;	 Catch:{ InterruptedException -> 0x00a6 }
        r4.<init>(r5, r6);	 Catch:{ InterruptedException -> 0x00a6 }
        r4 = r0.mo4885a(r4);	 Catch:{ InterruptedException -> 0x00a6 }
        r5 = "cache-hit-parsed";	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20430a(r5);	 Catch:{ InterruptedException -> 0x00a6 }
        r5 = r2.f16775f;	 Catch:{ InterruptedException -> 0x00a6 }
        r7 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00a6 }
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));	 Catch:{ InterruptedException -> 0x00a6 }
        if (r9 >= 0) goto L_0x0087;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0085:
        r5 = 1;	 Catch:{ InterruptedException -> 0x00a6 }
        goto L_0x0088;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0087:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0088:
        if (r5 != 0) goto L_0x0090;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x008a:
        r2 = r10.f16783e;	 Catch:{ InterruptedException -> 0x00a6 }
        r2.mo4769a(r0, r4);	 Catch:{ InterruptedException -> 0x00a6 }
        goto L_0x0016;	 Catch:{ InterruptedException -> 0x00a6 }
    L_0x0090:
        r5 = "cache-hit-refresh-needed";	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20430a(r5);	 Catch:{ InterruptedException -> 0x00a6 }
        r0.m20424a(r2);	 Catch:{ InterruptedException -> 0x00a6 }
        r4.f16836d = r3;	 Catch:{ InterruptedException -> 0x00a6 }
        r2 = r10.f16783e;	 Catch:{ InterruptedException -> 0x00a6 }
        r3 = new com.google.android.m4b.maps.a.c$1;	 Catch:{ InterruptedException -> 0x00a6 }
        r3.<init>(r10, r0);	 Catch:{ InterruptedException -> 0x00a6 }
        r2.mo4770a(r0, r4, r3);	 Catch:{ InterruptedException -> 0x00a6 }
        goto L_0x0016;
    L_0x00a6:
        r0 = r10.f16784f;
        if (r0 == 0) goto L_0x0016;
    L_0x00aa:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.a.c.run():void");
    }
}
