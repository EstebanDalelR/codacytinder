package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.ad.C4597a.C7425a;
import com.google.android.m4b.maps.cg.cb.C5164a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class cc implements Runnable {
    /* renamed from: a */
    private final List<C5164a> f19218a = new ArrayList();
    /* renamed from: b */
    private final C5166b f19219b;
    /* renamed from: c */
    private final C5165a f19220c;
    /* renamed from: d */
    private final long f19221d;
    /* renamed from: e */
    private boolean f19222e;
    /* renamed from: f */
    private C7425a f19223f;
    /* renamed from: g */
    private final Executor f19224g;
    /* renamed from: h */
    private final C5167c f19225h;

    /* renamed from: com.google.android.m4b.maps.cg.cc$a */
    public interface C5165a {
        /* renamed from: a */
        void mo5304a(List<C7425a> list);
    }

    /* renamed from: com.google.android.m4b.maps.cg.cc$b */
    public interface C5166b {
        /* renamed from: a */
        C7425a mo5303a();
    }

    /* renamed from: com.google.android.m4b.maps.cg.cc$c */
    public static class C5167c {
    }

    public cc(C5166b c5166b, C5165a c5165a, long j, Executor executor, C5167c c5167c) {
        boolean z = false;
        this.f19222e = false;
        if (j > 0) {
            z = true;
        }
        C5571j.m24298a(z, (Object) "Delay cannot be 0");
        this.f19219b = c5166b;
        this.f19220c = c5165a;
        this.f19221d = j;
        this.f19224g = executor;
        this.f19225h = c5167c;
    }

    /* renamed from: a */
    public final void m23089a(C5164a c5164a) {
        synchronized (this.f19218a) {
            this.f19218a.add(c5164a);
            if (this.f19222e == null) {
                this.f19222e = true;
                this.f19224g.execute(this);
            }
        }
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
        r7 = this;
        r0 = 0;
        r1 = r7.f19221d;	 Catch:{ InterruptedException -> 0x006c }
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x006c }
        r1 = r7.f19223f;
        if (r1 != 0) goto L_0x0012;
    L_0x000a:
        r1 = r7.f19219b;
        r1 = r1.mo5303a();
        r7.f19223f = r1;
    L_0x0012:
        r1 = r7.f19218a;
        monitor-enter(r1);
        r2 = r7.f19218a;	 Catch:{ all -> 0x0069 }
        r2 = r2.size();	 Catch:{ all -> 0x0069 }
        r2 = new com.google.android.m4b.maps.cg.cb.C5164a[r2];	 Catch:{ all -> 0x0069 }
        r3 = r7.f19218a;	 Catch:{ all -> 0x0069 }
        r3.toArray(r2);	 Catch:{ all -> 0x0069 }
        r3 = r7.f19218a;	 Catch:{ all -> 0x0069 }
        r3.clear();	 Catch:{ all -> 0x0069 }
        r7.f19222e = r0;	 Catch:{ all -> 0x0069 }
        monitor-exit(r1);	 Catch:{ all -> 0x0069 }
        r1 = new java.util.HashMap;
        r1.<init>();
        r3 = r2.length;
    L_0x0030:
        if (r0 >= r3) goto L_0x005b;
    L_0x0032:
        r4 = r2[r0];
        r4 = r4.cj;
        r4 = java.lang.Integer.valueOf(r4);
        r5 = r1.get(r4);
        r5 = (com.google.android.m4b.maps.ad.C4597a.C7425a) r5;
        if (r5 == 0) goto L_0x0049;
    L_0x0042:
        r4 = r5.f27223a;
        r4 = r4 + 1;
        r5.f27223a = r4;
        goto L_0x0058;
    L_0x0049:
        r5 = r7.f19223f;
        r5 = r5.m31998a();
        r6 = r4.intValue();
        r5.f27234l = r6;
        r1.put(r4, r5);
    L_0x0058:
        r0 = r0 + 1;
        goto L_0x0030;
    L_0x005b:
        r0 = r1.values();
        r0 = com.google.android.m4b.maps.aa.au.m20525a(r0);
        r1 = r7.f19220c;
        r1.mo5304a(r0);
        return;
    L_0x0069:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0069 }
        throw r0;
    L_0x006c:
        r1 = r7.f19218a;
        monitor-enter(r1);
        r7.f19222e = r0;	 Catch:{ all -> 0x0073 }
        monitor-exit(r1);	 Catch:{ all -> 0x0073 }
        return;	 Catch:{ all -> 0x0073 }
    L_0x0073:
        r0 = move-exception;	 Catch:{ all -> 0x0073 }
        monitor-exit(r1);	 Catch:{ all -> 0x0073 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.cg.cc.run():void");
    }
}
