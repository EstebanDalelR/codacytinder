package com.appsflyer;

import android.os.Build.VERSION;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.appsflyer.a */
public class C0919a {
    /* renamed from: a */
    private static C0919a f2406a;
    /* renamed from: b */
    private Executor f2407b;
    /* renamed from: c */
    private ScheduledExecutorService f2408c;

    private C0919a() {
    }

    /* renamed from: a */
    public static C0919a m3116a() {
        if (f2406a == null) {
            f2406a = new C0919a();
        }
        return f2406a;
    }

    /* renamed from: b */
    public Executor m3118b() {
        Object obj;
        if (this.f2407b != null) {
            if (this.f2407b instanceof ThreadPoolExecutor) {
                if (!(((ThreadPoolExecutor) this.f2407b).isShutdown() || ((ThreadPoolExecutor) this.f2407b).isTerminated())) {
                    if (((ThreadPoolExecutor) this.f2407b).isTerminating()) {
                    }
                }
            }
            obj = null;
            if (obj != null) {
                if (VERSION.SDK_INT >= 11) {
                    return Executors.newSingleThreadExecutor();
                }
                this.f2407b = Executors.newFixedThreadPool(2);
            }
            return this.f2407b;
        }
        obj = 1;
        if (obj != null) {
            if (VERSION.SDK_INT >= 11) {
                return Executors.newSingleThreadExecutor();
            }
            this.f2407b = Executors.newFixedThreadPool(2);
        }
        return this.f2407b;
    }

    /* renamed from: c */
    ScheduledThreadPoolExecutor m3119c() {
        Object obj;
        if (!(this.f2408c == null || this.f2408c.isShutdown())) {
            if (!this.f2408c.isTerminated()) {
                obj = null;
                if (obj != null) {
                    this.f2408c = Executors.newScheduledThreadPool(2);
                }
                return (ScheduledThreadPoolExecutor) this.f2408c;
            }
        }
        obj = 1;
        if (obj != null) {
            this.f2408c = Executors.newScheduledThreadPool(2);
        }
        return (ScheduledThreadPoolExecutor) this.f2408c;
    }

    /* renamed from: d */
    void m3120d() {
        try {
            m3117a(this.f2408c);
            if (this.f2407b instanceof ThreadPoolExecutor) {
                m3117a((ThreadPoolExecutor) this.f2407b);
            }
        } catch (Throwable th) {
            AFLogger.m3073a("failed to stop Executors", th);
        }
    }

    /* renamed from: a */
    private void m3117a(java.util.concurrent.ExecutorService r4) {
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
        r0 = "shut downing executor ...";	 Catch:{ InterruptedException -> 0x0020 }
        com.appsflyer.AFLogger.m3072a(r0);	 Catch:{ InterruptedException -> 0x0020 }
        r4.shutdown();	 Catch:{ InterruptedException -> 0x0020 }
        r0 = 10;	 Catch:{ InterruptedException -> 0x0020 }
        r2 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0020 }
        r4.awaitTermination(r0, r2);	 Catch:{ InterruptedException -> 0x0020 }
        r0 = r4.isTerminated();
        if (r0 != 0) goto L_0x001a;
    L_0x0015:
        r0 = "killing non-finished tasks";
        com.appsflyer.AFLogger.m3072a(r0);
    L_0x001a:
        r4.shutdownNow();
        return;
    L_0x001e:
        r0 = move-exception;
        goto L_0x0034;
    L_0x0020:
        r0 = "InterruptedException!!!";	 Catch:{ all -> 0x001e }
        com.appsflyer.AFLogger.m3072a(r0);	 Catch:{ all -> 0x001e }
        r0 = r4.isTerminated();
        if (r0 != 0) goto L_0x0030;
    L_0x002b:
        r0 = "killing non-finished tasks";
        com.appsflyer.AFLogger.m3072a(r0);
    L_0x0030:
        r4.shutdownNow();
        return;
    L_0x0034:
        r1 = r4.isTerminated();
        if (r1 != 0) goto L_0x003f;
    L_0x003a:
        r1 = "killing non-finished tasks";
        com.appsflyer.AFLogger.m3072a(r1);
    L_0x003f:
        r4.shutdownNow();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.a.a(java.util.concurrent.ExecutorService):void");
    }
}
