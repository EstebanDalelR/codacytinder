package com.google.android.gms.internal;

final class zz implements Runnable {
    /* renamed from: a */
    private /* synthetic */ aom f16677a;
    /* renamed from: b */
    private /* synthetic */ tq f16678b;

    zz(tq tqVar, aom aom) {
        this.f16678b = tqVar;
        this.f16677a = aom;
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
        r2 = this;
        r0 = r2.f16678b;	 Catch:{ InterruptedException -> 0x000c }
        r0 = r0.f16540c;	 Catch:{ InterruptedException -> 0x000c }
        r1 = r2.f16677a;	 Catch:{ InterruptedException -> 0x000c }
        r0.put(r1);	 Catch:{ InterruptedException -> 0x000c }
        return;
    L_0x000c:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zz.run():void");
    }
}
