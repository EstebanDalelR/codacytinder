package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.e */
public class C0908e extends Thread {
    /* renamed from: a */
    private final BlockingQueue<Request<?>> f2375a;
    /* renamed from: b */
    private final Network f2376b;
    /* renamed from: c */
    private final Cache f2377c;
    /* renamed from: d */
    private final ResponseDelivery f2378d;
    /* renamed from: e */
    private volatile boolean f2379e = false;

    public C0908e(BlockingQueue<Request<?>> blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.f2375a = blockingQueue;
        this.f2376b = network;
        this.f2377c = cache;
        this.f2378d = responseDelivery;
    }

    /* renamed from: a */
    public void m3051a() {
        this.f2379e = true;
        interrupt();
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m3049a(Request<?> request) {
        if (VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
        }
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
        r9 = this;
        r0 = 10;
        android.os.Process.setThreadPriority(r0);
    L_0x0005:
        r0 = android.os.SystemClock.elapsedRealtime();
        r2 = r9.f2375a;	 Catch:{ InterruptedException -> 0x00a0 }
        r2 = r2.take();	 Catch:{ InterruptedException -> 0x00a0 }
        r2 = (com.android.volley.Request) r2;	 Catch:{ InterruptedException -> 0x00a0 }
        r3 = "network-queue-take";	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r2.addMarker(r3);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r3 = r2.isCanceled();	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        if (r3 == 0) goto L_0x0022;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
    L_0x001c:
        r3 = "network-discard-cancelled";	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r2.finish(r3);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        goto L_0x0005;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
    L_0x0022:
        r9.m3049a(r2);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r3 = r9.f2376b;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r3 = r3.performRequest(r2);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r4 = "network-http-complete";	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r2.addMarker(r4);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r4 = r3.f2338d;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        if (r4 == 0) goto L_0x0040;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
    L_0x0034:
        r4 = r2.hasHadResponseDelivered();	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        if (r4 == 0) goto L_0x0040;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
    L_0x003a:
        r3 = "not-modified";	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r2.finish(r3);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        goto L_0x0005;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
    L_0x0040:
        r3 = r2.parseNetworkResponse(r3);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r4 = "network-parse-complete";	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r2.addMarker(r4);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r4 = r2.shouldCache();	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        if (r4 == 0) goto L_0x0063;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
    L_0x004f:
        r4 = r3.f2355b;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        if (r4 == 0) goto L_0x0063;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
    L_0x0053:
        r4 = r9.f2377c;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r5 = r2.getCacheKey();	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r6 = r3.f2355b;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r4.put(r5, r6);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r4 = "network-cache-written";	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r2.addMarker(r4);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
    L_0x0063:
        r2.markDelivered();	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r4 = r9.f2378d;	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        r4.postResponse(r2, r3);	 Catch:{ VolleyError -> 0x0091, Exception -> 0x006c }
        goto L_0x0005;
    L_0x006c:
        r3 = move-exception;
        r4 = "Unhandled exception %s";
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r7 = r3.toString();
        r5[r6] = r7;
        com.android.volley.C0911f.m3056a(r3, r4, r5);
        r4 = new com.android.volley.VolleyError;
        r4.<init>(r3);
        r5 = android.os.SystemClock.elapsedRealtime();
        r7 = r5 - r0;
        r4.m3044a(r7);
        r0 = r9.f2378d;
        r0.postError(r2, r4);
        goto L_0x0005;
    L_0x0091:
        r3 = move-exception;
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = r4 - r0;
        r3.m3044a(r6);
        r9.m3050a(r2, r3);
        goto L_0x0005;
    L_0x00a0:
        r0 = r9.f2379e;
        if (r0 == 0) goto L_0x0005;
    L_0x00a4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.e.run():void");
    }

    /* renamed from: a */
    private void m3050a(Request<?> request, VolleyError volleyError) {
        this.f2378d.postError(request, request.parseNetworkError(volleyError));
    }
}
