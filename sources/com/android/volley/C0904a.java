package com.android.volley;

import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.a */
public class C0904a extends Thread {
    /* renamed from: a */
    private static final boolean f2362a = C0911f.f2387b;
    /* renamed from: b */
    private final BlockingQueue<Request<?>> f2363b;
    /* renamed from: c */
    private final BlockingQueue<Request<?>> f2364c;
    /* renamed from: d */
    private final Cache f2365d;
    /* renamed from: e */
    private final ResponseDelivery f2366e;
    /* renamed from: f */
    private volatile boolean f2367f = false;

    public C0904a(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, Cache cache, ResponseDelivery responseDelivery) {
        this.f2363b = blockingQueue;
        this.f2364c = blockingQueue2;
        this.f2365d = cache;
        this.f2366e = responseDelivery;
    }

    /* renamed from: a */
    public void m3046a() {
        this.f2367f = true;
        interrupt();
    }

    public void run() {
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
        r7 = this;
        r0 = f2362a;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r0 = "start new dispatcher";
        r2 = new java.lang.Object[r1];
        com.android.volley.C0911f.m3055a(r0, r2);
    L_0x000c:
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
        r0 = r7.f2365d;
        r0.initialize();
    L_0x0016:
        r0 = r7.f2363b;	 Catch:{ InterruptedException -> 0x00a3 }
        r0 = r0.take();	 Catch:{ InterruptedException -> 0x00a3 }
        r0 = (com.android.volley.Request) r0;	 Catch:{ InterruptedException -> 0x00a3 }
        r2 = 1;
        r3 = "cache-queue-take";	 Catch:{ Exception -> 0x0093 }
        r0.addMarker(r3);	 Catch:{ Exception -> 0x0093 }
        r3 = r0.isCanceled();	 Catch:{ Exception -> 0x0093 }
        if (r3 == 0) goto L_0x0030;	 Catch:{ Exception -> 0x0093 }
    L_0x002a:
        r3 = "cache-discard-canceled";	 Catch:{ Exception -> 0x0093 }
        r0.finish(r3);	 Catch:{ Exception -> 0x0093 }
        goto L_0x0016;	 Catch:{ Exception -> 0x0093 }
    L_0x0030:
        r3 = r7.f2365d;	 Catch:{ Exception -> 0x0093 }
        r4 = r0.getCacheKey();	 Catch:{ Exception -> 0x0093 }
        r3 = r3.get(r4);	 Catch:{ Exception -> 0x0093 }
        if (r3 != 0) goto L_0x0047;	 Catch:{ Exception -> 0x0093 }
    L_0x003c:
        r3 = "cache-miss";	 Catch:{ Exception -> 0x0093 }
        r0.addMarker(r3);	 Catch:{ Exception -> 0x0093 }
        r3 = r7.f2364c;	 Catch:{ Exception -> 0x0093 }
        r3.put(r0);	 Catch:{ Exception -> 0x0093 }
        goto L_0x0016;	 Catch:{ Exception -> 0x0093 }
    L_0x0047:
        r4 = r3.m3031a();	 Catch:{ Exception -> 0x0093 }
        if (r4 == 0) goto L_0x005b;	 Catch:{ Exception -> 0x0093 }
    L_0x004d:
        r4 = "cache-hit-expired";	 Catch:{ Exception -> 0x0093 }
        r0.addMarker(r4);	 Catch:{ Exception -> 0x0093 }
        r0.setCacheEntry(r3);	 Catch:{ Exception -> 0x0093 }
        r3 = r7.f2364c;	 Catch:{ Exception -> 0x0093 }
        r3.put(r0);	 Catch:{ Exception -> 0x0093 }
        goto L_0x0016;	 Catch:{ Exception -> 0x0093 }
    L_0x005b:
        r4 = "cache-hit";	 Catch:{ Exception -> 0x0093 }
        r0.addMarker(r4);	 Catch:{ Exception -> 0x0093 }
        r4 = new com.android.volley.NetworkResponse;	 Catch:{ Exception -> 0x0093 }
        r5 = r3.f2328a;	 Catch:{ Exception -> 0x0093 }
        r6 = r3.f2334g;	 Catch:{ Exception -> 0x0093 }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x0093 }
        r4 = r0.parseNetworkResponse(r4);	 Catch:{ Exception -> 0x0093 }
        r5 = "cache-hit-parsed";	 Catch:{ Exception -> 0x0093 }
        r0.addMarker(r5);	 Catch:{ Exception -> 0x0093 }
        r5 = r3.m3032b();	 Catch:{ Exception -> 0x0093 }
        if (r5 != 0) goto L_0x007e;	 Catch:{ Exception -> 0x0093 }
    L_0x0078:
        r3 = r7.f2366e;	 Catch:{ Exception -> 0x0093 }
        r3.postResponse(r0, r4);	 Catch:{ Exception -> 0x0093 }
        goto L_0x0016;	 Catch:{ Exception -> 0x0093 }
    L_0x007e:
        r5 = "cache-hit-refresh-needed";	 Catch:{ Exception -> 0x0093 }
        r0.addMarker(r5);	 Catch:{ Exception -> 0x0093 }
        r0.setCacheEntry(r3);	 Catch:{ Exception -> 0x0093 }
        r4.f2357d = r2;	 Catch:{ Exception -> 0x0093 }
        r3 = r7.f2366e;	 Catch:{ Exception -> 0x0093 }
        r5 = new com.android.volley.a$1;	 Catch:{ Exception -> 0x0093 }
        r5.<init>(r7, r0);	 Catch:{ Exception -> 0x0093 }
        r3.postResponse(r0, r4, r5);	 Catch:{ Exception -> 0x0093 }
        goto L_0x0016;
    L_0x0093:
        r0 = move-exception;
        r3 = "Unhandled exception %s";
        r2 = new java.lang.Object[r2];
        r4 = r0.toString();
        r2[r1] = r4;
        com.android.volley.C0911f.m3056a(r0, r3, r2);
        goto L_0x0016;
    L_0x00a3:
        r0 = r7.f2367f;
        if (r0 == 0) goto L_0x0016;
    L_0x00a7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.a.run():void");
    }
}
