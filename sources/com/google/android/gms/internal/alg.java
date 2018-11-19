package com.google.android.gms.internal;

import java.util.concurrent.BlockingQueue;

public final class alg extends Thread {
    /* renamed from: a */
    private final BlockingQueue<aom<?>> f15408a;
    /* renamed from: b */
    private final zzm f15409b;
    /* renamed from: c */
    private final zzb f15410c;
    /* renamed from: d */
    private final zzz f15411d;
    /* renamed from: e */
    private volatile boolean f15412e = false;

    public alg(BlockingQueue<aom<?>> blockingQueue, zzm zzm, zzb zzb, zzz zzz) {
        this.f15408a = blockingQueue;
        this.f15409b = zzm;
        this.f15410c = zzb;
        this.f15411d = zzz;
    }

    /* renamed from: a */
    public final void m19326a() {
        this.f15412e = true;
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
        r2 = r9.f15408a;	 Catch:{ InterruptedException -> 0x00a2 }
        r2 = r2.take();	 Catch:{ InterruptedException -> 0x00a2 }
        r2 = (com.google.android.gms.internal.aom) r2;	 Catch:{ InterruptedException -> 0x00a2 }
        r3 = "network-queue-take";	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r2.m19388b(r3);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r3 = r2.m19391d();	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        android.net.TrafficStats.setThreadStatsTag(r3);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r3 = r9.f15409b;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r3 = r3.zzc(r2);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r4 = "network-http-complete";	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r2.m19388b(r4);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r4 = r3.f15517e;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        if (r4 == 0) goto L_0x003b;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
    L_0x002c:
        r4 = r2.m19398k();	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        if (r4 == 0) goto L_0x003b;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
    L_0x0032:
        r3 = "not-modified";	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r2.m19390c(r3);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r2.m19399l();	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        goto L_0x0005;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
    L_0x003b:
        r3 = r2.mo4623a(r3);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r4 = "network-parse-complete";	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r2.m19388b(r4);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r4 = r2.m19394g();	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        if (r4 == 0) goto L_0x005e;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
    L_0x004a:
        r4 = r3.f15690b;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        if (r4 == 0) goto L_0x005e;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
    L_0x004e:
        r4 = r9.f15410c;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r5 = r2.m19392e();	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r6 = r3.f15690b;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r4.zza(r5, r6);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r4 = "network-cache-written";	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r2.m19388b(r4);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
    L_0x005e:
        r2.m19397j();	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r4 = r9.f15411d;	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r4.zzb(r2, r3);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        r2.m19383a(r3);	 Catch:{ zzad -> 0x008e, Exception -> 0x006a }
        goto L_0x0005;
    L_0x006a:
        r3 = move-exception;
        r4 = "Unhandled exception %s";
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r3.toString();
        r5[r6] = r7;
        com.google.android.gms.internal.cg.m19568a(r3, r4, r5);
        r4 = new com.google.android.gms.internal.zzad;
        r4.<init>(r3);
        r5 = android.os.SystemClock.elapsedRealtime();
        r7 = r5 - r0;
        r4.m20296a(r7);
        r0 = r9.f15411d;
        r0.zza(r2, r4);
        goto L_0x009d;
    L_0x008e:
        r3 = move-exception;
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = r4 - r0;
        r3.m20296a(r6);
        r0 = r9.f15411d;
        r0.zza(r2, r3);
    L_0x009d:
        r2.m19399l();
        goto L_0x0005;
    L_0x00a2:
        r0 = r9.f15412e;
        if (r0 == 0) goto L_0x0005;
    L_0x00a6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.alg.run():void");
    }
}
