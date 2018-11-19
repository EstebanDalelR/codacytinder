package com.appsflyer;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.appsflyer.s */
final class C0949s implements ServiceConnection {
    /* renamed from: a */
    boolean f2517a;
    /* renamed from: b */
    private final LinkedBlockingQueue<IBinder> f2518b;

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    private C0949s() {
        this.f2517a = false;
        this.f2518b = new LinkedBlockingQueue(1);
    }

    public final void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
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
        r0 = this;
        r1 = r0.f2518b;	 Catch:{ InterruptedException -> 0x0006 }
        r1.put(r2);	 Catch:{ InterruptedException -> 0x0006 }
        return;
    L_0x0006:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.s.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    /* renamed from: a */
    public final IBinder m3244a() throws InterruptedException {
        if (this.f2517a) {
            throw new IllegalStateException();
        }
        this.f2517a = true;
        return (IBinder) this.f2518b.take();
    }
}
