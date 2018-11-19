package com.facebook.internal;

import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.q */
public class C1737q<T> {
    /* renamed from: a */
    private T f4797a;
    /* renamed from: b */
    private CountDownLatch f4798b = new CountDownLatch(1);

    public C1737q(final Callable<T> callable) {
        FacebookSdk.m3990c().execute(new FutureTask(new Callable<Void>(this) {
            /* renamed from: b */
            final /* synthetic */ C1737q f4796b;

            public /* synthetic */ Object call() throws Exception {
                return m5971a();
            }

            /* renamed from: a */
            public Void m5971a() throws Exception {
                try {
                    this.f4796b.f4797a = callable.call();
                    return null;
                } finally {
                    this.f4796b.f4798b.countDown();
                }
            }
        }));
    }

    /* renamed from: a */
    public T m5975a() {
        m5974b();
        return this.f4797a;
    }

    /* renamed from: b */
    private void m5974b() {
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
        r1 = this;
        r0 = r1.f4798b;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r1.f4798b;	 Catch:{ InterruptedException -> 0x000a }
        r0.await();	 Catch:{ InterruptedException -> 0x000a }
    L_0x000a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.q.b():void");
    }
}
