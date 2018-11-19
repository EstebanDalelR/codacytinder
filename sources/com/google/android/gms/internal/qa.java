package com.google.android.gms.internal;

import android.content.Context;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzg;
import java.util.concurrent.LinkedBlockingQueue;

final class qa implements zzf, zzg {
    /* renamed from: a */
    private qb f23420a;
    /* renamed from: b */
    private final String f23421b;
    /* renamed from: c */
    private final String f23422c;
    /* renamed from: d */
    private final LinkedBlockingQueue<nx> f23423d;
    /* renamed from: e */
    private final HandlerThread f23424e = new HandlerThread("GassClient");

    public qa(Context context, String str, String str2) {
        this.f23421b = str;
        this.f23422c = str2;
        this.f23424e.start();
        this.f23420a = new qb(context, this.f23424e.getLooper(), this, this);
        this.f23423d = new LinkedBlockingQueue();
        this.f23420a.i();
    }

    /* renamed from: a */
    private final com.google.android.gms.internal.zzcbt m27442a() {
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
        r0 = r1.f23420a;	 Catch:{ IllegalStateException -> 0x0007, IllegalStateException -> 0x0007 }
        r0 = r0.m27449c();	 Catch:{ IllegalStateException -> 0x0007, IllegalStateException -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qa.a():com.google.android.gms.internal.zzcbt");
    }

    /* renamed from: b */
    private final void m27443b() {
        if (this.f23420a == null) {
            return;
        }
        if (this.f23420a.isConnected() || this.f23420a.isConnecting()) {
            this.f23420a.disconnect();
        }
    }

    /* renamed from: c */
    private static nx m27444c() {
        nx nxVar = new nx();
        nxVar.f26985k = Long.valueOf(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return nxVar;
    }

    /* renamed from: a */
    public final com.google.android.gms.internal.nx m27445a(int r4) {
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
        r3 = this;
        r4 = r3.f23423d;	 Catch:{ InterruptedException -> 0x000d }
        r0 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ InterruptedException -> 0x000d }
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x000d }
        r4 = r4.poll(r0, r2);	 Catch:{ InterruptedException -> 0x000d }
        r4 = (com.google.android.gms.internal.nx) r4;	 Catch:{ InterruptedException -> 0x000d }
        goto L_0x000e;
    L_0x000d:
        r4 = 0;
    L_0x000e:
        if (r4 != 0) goto L_0x0014;
    L_0x0010:
        r4 = m27444c();
    L_0x0014:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qa.a(int):com.google.android.gms.internal.nx");
    }

    public final void onConnected(android.os.Bundle r4) {
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
        r3 = this;
        r4 = r3.m27442a();
        if (r4 == 0) goto L_0x003a;
    L_0x0006:
        r0 = new com.google.android.gms.internal.zzcbp;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r1 = r3.f23421b;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r2 = r3.f23422c;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0.<init>(r1, r2);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r4 = r4.zza(r0);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r4 = r4.zzaur();	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0 = r3.f23423d;	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        r0.put(r4);	 Catch:{ Throwable -> 0x0027, all -> 0x0025 }
    L_0x001c:
        r3.m27443b();
        r4 = r3.f23424e;
        r4.quit();
        return;
    L_0x0025:
        r4 = move-exception;
        goto L_0x0031;
    L_0x0027:
        r4 = r3.f23423d;	 Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
        r0 = m27444c();	 Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
        r4.put(r0);	 Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
        goto L_0x001c;
    L_0x0031:
        r3.m27443b();
        r0 = r3.f23424e;
        r0.quit();
        throw r4;
    L_0x003a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qa.onConnected(android.os.Bundle):void");
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult r2) {
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
        r2 = r1.f23423d;	 Catch:{ InterruptedException -> 0x0009 }
        r0 = m27444c();	 Catch:{ InterruptedException -> 0x0009 }
        r2.put(r0);	 Catch:{ InterruptedException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qa.onConnectionFailed(com.google.android.gms.common.ConnectionResult):void");
    }

    public final void onConnectionSuspended(int r2) {
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
        r2 = r1.f23423d;	 Catch:{ InterruptedException -> 0x0009 }
        r0 = m27444c();	 Catch:{ InterruptedException -> 0x0009 }
        r2.put(r0);	 Catch:{ InterruptedException -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.qa.onConnectionSuspended(int):void");
    }
}
