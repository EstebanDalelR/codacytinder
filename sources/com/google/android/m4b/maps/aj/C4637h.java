package com.google.android.m4b.maps.aj;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.aj.h */
public abstract class C4637h implements ExecutorService {
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r11, long r12, java.util.concurrent.TimeUnit r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Incorrect nodes count for selectOther: B:64:0x00d6 in [B:46:0x00cc, B:64:0x00d6, B:52:0x0066]
	at jadx.core.utils.BlockUtils.selectOther(BlockUtils.java:53)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:64)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
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
        if (r11 == 0) goto L_0x00d7;
    L_0x0002:
        if (r14 != 0) goto L_0x0006;
    L_0x0004:
        goto L_0x00d7;
    L_0x0006:
        r12 = r14.toNanos(r12);
        r14 = new java.util.ArrayList;
        r0 = r11.size();
        r14.<init>(r0);
        r0 = 1;
        r11 = r11.iterator();	 Catch:{ all -> 0x00c1 }
    L_0x0018:
        r1 = r11.hasNext();	 Catch:{ all -> 0x00c1 }
        if (r1 == 0) goto L_0x002c;	 Catch:{ all -> 0x00c1 }
    L_0x001e:
        r1 = r11.next();	 Catch:{ all -> 0x00c1 }
        r1 = (java.util.concurrent.Callable) r1;	 Catch:{ all -> 0x00c1 }
        r1 = com.google.android.m4b.maps.aj.C6397g.m27915a(r1);	 Catch:{ all -> 0x00c1 }
        r14.add(r1);	 Catch:{ all -> 0x00c1 }
        goto L_0x0018;	 Catch:{ all -> 0x00c1 }
    L_0x002c:
        r1 = java.lang.System.nanoTime();	 Catch:{ all -> 0x00c1 }
        r11 = r14.iterator();	 Catch:{ all -> 0x00c1 }
    L_0x0034:
        r3 = r11.hasNext();	 Catch:{ all -> 0x00c1 }
        r4 = 0;	 Catch:{ all -> 0x00c1 }
        if (r3 == 0) goto L_0x006a;	 Catch:{ all -> 0x00c1 }
    L_0x003c:
        r3 = r11.next();	 Catch:{ all -> 0x00c1 }
        r3 = (java.lang.Runnable) r3;	 Catch:{ all -> 0x00c1 }
        r10.execute(r3);	 Catch:{ all -> 0x00c1 }
        r6 = java.lang.System.nanoTime();	 Catch:{ all -> 0x00c1 }
        r3 = 0;
        r8 = r6 - r1;
        r1 = r12 - r8;
        r12 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r12 > 0) goto L_0x0067;
    L_0x0052:
        r11 = r14.iterator();
    L_0x0056:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x0066;
    L_0x005c:
        r12 = r11.next();
        r12 = (java.util.concurrent.Future) r12;
        r12.cancel(r0);
        goto L_0x0056;
    L_0x0066:
        return r14;
    L_0x0067:
        r12 = r1;
        r1 = r6;
        goto L_0x0034;
    L_0x006a:
        r11 = r14.iterator();	 Catch:{ all -> 0x00c1 }
    L_0x006e:
        r3 = r11.hasNext();	 Catch:{ all -> 0x00c1 }
        if (r3 == 0) goto L_0x00c0;	 Catch:{ all -> 0x00c1 }
    L_0x0074:
        r3 = r11.next();	 Catch:{ all -> 0x00c1 }
        r3 = (java.util.concurrent.Future) r3;	 Catch:{ all -> 0x00c1 }
        r6 = r3.isDone();	 Catch:{ all -> 0x00c1 }
        if (r6 != 0) goto L_0x006e;
    L_0x0080:
        r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r6 > 0) goto L_0x0099;
    L_0x0084:
        r11 = r14.iterator();
    L_0x0088:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x0098;
    L_0x008e:
        r12 = r11.next();
        r12 = (java.util.concurrent.Future) r12;
        r12.cancel(r0);
        goto L_0x0088;
    L_0x0098:
        return r14;
    L_0x0099:
        r6 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ CancellationException -> 0x00b4, CancellationException -> 0x00b4, TimeoutException -> 0x009f }
        r3.get(r12, r6);	 Catch:{ CancellationException -> 0x00b4, CancellationException -> 0x00b4, TimeoutException -> 0x009f }
        goto L_0x00b4;
    L_0x009f:
        r11 = r14.iterator();
    L_0x00a3:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x00b3;
    L_0x00a9:
        r12 = r11.next();
        r12 = (java.util.concurrent.Future) r12;
        r12.cancel(r0);
        goto L_0x00a3;
    L_0x00b3:
        return r14;
    L_0x00b4:
        r6 = java.lang.System.nanoTime();	 Catch:{ all -> 0x00c1 }
        r3 = 0;
        r8 = r6 - r1;
        r1 = r12 - r8;
        r12 = r1;
        r1 = r6;
        goto L_0x006e;
    L_0x00c0:
        return r14;
    L_0x00c1:
        r11 = move-exception;
        r12 = r14.iterator();
    L_0x00c6:
        r13 = r12.hasNext();
        if (r13 == 0) goto L_0x00d6;
    L_0x00cc:
        r13 = r12.next();
        r13 = (java.util.concurrent.Future) r13;
        r13.cancel(r0);
        goto L_0x00c6;
    L_0x00d6:
        throw r11;
    L_0x00d7:
        r11 = new java.lang.NullPointerException;
        r11.<init>();
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aj.h.invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit):java.util.List<java.util.concurrent.Future<T>>");
    }

    /* renamed from: a */
    public <T> C4636f<T> m20762a(Callable<T> callable) {
        callable = C6397g.m27915a(callable);
        execute(callable);
        return callable;
    }

    /* renamed from: a */
    public C4636f<?> m20760a(Runnable runnable) {
        runnable = C6397g.m27914a(runnable, null);
        execute(runnable);
        return runnable;
    }

    /* renamed from: a */
    public <T> C4636f<T> m20761a(Runnable runnable, T t) {
        runnable = C6397g.m27914a(runnable, (Object) t);
        execute(runnable);
        return runnable;
    }

    public <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> r4) {
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
        r0 = 0;
        r1 = 0;
        r4 = com.google.android.m4b.maps.aj.C4639i.m20765a(r3, r4, r0, r1);	 Catch:{ TimeoutException -> 0x0008 }
        return r4;
    L_0x0008:
        r4 = new java.lang.AssertionError;
        r4.<init>();
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aj.h.invokeAny(java.util.Collection):T");
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return C4639i.m20765a(this, collection, true, timeUnit.toNanos(j));
    }

    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r4) {
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
        if (r4 != 0) goto L_0x0008;
    L_0x0002:
        r4 = new java.lang.NullPointerException;
        r4.<init>();
        throw r4;
    L_0x0008:
        r0 = new java.util.ArrayList;
        r1 = r4.size();
        r0.<init>(r1);
        r4 = r4.iterator();	 Catch:{ all -> 0x0047 }
    L_0x0015:
        r1 = r4.hasNext();	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x002c;	 Catch:{ all -> 0x0047 }
    L_0x001b:
        r1 = r4.next();	 Catch:{ all -> 0x0047 }
        r1 = (java.util.concurrent.Callable) r1;	 Catch:{ all -> 0x0047 }
        r1 = com.google.android.m4b.maps.aj.C6397g.m27915a(r1);	 Catch:{ all -> 0x0047 }
        r0.add(r1);	 Catch:{ all -> 0x0047 }
        r3.execute(r1);	 Catch:{ all -> 0x0047 }
        goto L_0x0015;	 Catch:{ all -> 0x0047 }
    L_0x002c:
        r4 = r0.iterator();	 Catch:{ all -> 0x0047 }
    L_0x0030:
        r1 = r4.hasNext();	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x0046;	 Catch:{ all -> 0x0047 }
    L_0x0036:
        r1 = r4.next();	 Catch:{ all -> 0x0047 }
        r1 = (java.util.concurrent.Future) r1;	 Catch:{ all -> 0x0047 }
        r2 = r1.isDone();	 Catch:{ all -> 0x0047 }
        if (r2 != 0) goto L_0x0030;
    L_0x0042:
        r1.get();	 Catch:{ CancellationException -> 0x0030, CancellationException -> 0x0030 }
        goto L_0x0030;
    L_0x0046:
        return r0;
    L_0x0047:
        r4 = move-exception;
        r0 = r0.iterator();
    L_0x004c:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x005d;
    L_0x0052:
        r1 = r0.next();
        r1 = (java.util.concurrent.Future) r1;
        r2 = 1;
        r1.cancel(r2);
        goto L_0x004c;
    L_0x005d:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aj.h.invokeAll(java.util.Collection):java.util.List<java.util.concurrent.Future<T>>");
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return m20760a(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return m20761a(runnable, obj);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return m20762a(callable);
    }
}
