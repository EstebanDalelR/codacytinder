package com.google.android.m4b.maps.p101a;

import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.m4b.maps.a.f */
public final class C4521f extends Thread {
    /* renamed from: a */
    private final BlockingQueue<C4525k<?>> f16791a;
    /* renamed from: b */
    private final C4520e f16792b;
    /* renamed from: c */
    private final C4515b f16793c;
    /* renamed from: d */
    private final C4530n f16794d;
    /* renamed from: e */
    private volatile boolean f16795e = false;

    public C4521f(BlockingQueue<C4525k<?>> blockingQueue, C4520e c4520e, C4515b c4515b, C4530n c4530n) {
        this.f16791a = blockingQueue;
        this.f16792b = c4520e;
        this.f16793c = c4515b;
        this.f16794d = c4530n;
    }

    /* renamed from: a */
    public final void m20418a() {
        this.f16795e = true;
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
        r9 = this;
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
    L_0x0005:
        r0 = android.os.SystemClock.elapsedRealtime();
        r2 = r9.f16791a;	 Catch:{ InterruptedException -> 0x00b0 }
        r2 = r2.take();	 Catch:{ InterruptedException -> 0x00b0 }
        r2 = (com.google.android.m4b.maps.p101a.C4525k) r2;	 Catch:{ InterruptedException -> 0x00b0 }
        r3 = "network-queue-take";	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r2.m20430a(r3);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r3 = r2.m20438g();	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        if (r3 == 0) goto L_0x0022;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x001c:
        r3 = "network-discard-cancelled";	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r2.m20433b(r3);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        goto L_0x0005;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x0022:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4 = 14;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        if (r3 < r4) goto L_0x002f;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x0028:
        r3 = r2.m20431b();	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        android.net.TrafficStats.setThreadStatsTag(r3);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x002f:
        r3 = r9.f16792b;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r3 = r3.mo4899a(r2);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4 = "network-http-complete";	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r2.m20430a(r4);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4 = r3.f16799d;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        if (r4 == 0) goto L_0x004a;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x003e:
        r4 = r2.m20448q();	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        if (r4 == 0) goto L_0x004a;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x0044:
        r3 = "not-modified";	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r2.m20433b(r3);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        goto L_0x0005;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x004a:
        r3 = r2.mo4885a(r3);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4 = "network-parse-complete";	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r2.m20430a(r4);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4 = r2.m20443l();	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        if (r4 == 0) goto L_0x006d;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x0059:
        r4 = r3.f16834b;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        if (r4 == 0) goto L_0x006d;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x005d:
        r4 = r9.f16793c;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r5 = r2.m20435d();	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r6 = r3.f16834b;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4.mo4902a(r5, r6);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4 = "network-cache-written";	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r2.m20430a(r4);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
    L_0x006d:
        r2.m20447p();	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4 = r9.f16794d;	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        r4.mo4769a(r2, r3);	 Catch:{ r -> 0x009b, Exception -> 0x0076 }
        goto L_0x0005;
    L_0x0076:
        r3 = move-exception;
        r4 = "Unhandled exception %s";
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r3.toString();
        r5[r6] = r7;
        com.google.android.m4b.maps.p101a.C4535s.m20468a(r3, r4, r5);
        r4 = new com.google.android.m4b.maps.a.r;
        r4.<init>(r3);
        r5 = android.os.SystemClock.elapsedRealtime();
        r7 = r5 - r0;
        r4.m20464a(r7);
        r0 = r9.f16794d;
        r0.mo4771a(r2, r4);
        goto L_0x0005;
    L_0x009b:
        r3 = move-exception;
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = r4 - r0;
        r3.m20464a(r6);
        r0 = com.google.android.m4b.maps.p101a.C4525k.m20419a(r3);
        r1 = r9.f16794d;
        r1.mo4771a(r2, r0);
        goto L_0x0005;
    L_0x00b0:
        r0 = r9.f16795e;
        if (r0 == 0) goto L_0x0005;
    L_0x00b4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.a.f.run():void");
    }
}
