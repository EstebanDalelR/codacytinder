package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

public class aar {
    /* renamed from: a */
    private static String f14954a = "aar";
    /* renamed from: b */
    private final ub f14955b;
    /* renamed from: c */
    private final String f14956c;
    /* renamed from: d */
    private final String f14957d;
    /* renamed from: e */
    private final int f14958e = 2;
    /* renamed from: f */
    private volatile Method f14959f = null;
    /* renamed from: g */
    private final Class<?>[] f14960g;
    /* renamed from: h */
    private CountDownLatch f14961h = new CountDownLatch(1);

    public aar(ub ubVar, String str, String str2, Class<?>... clsArr) {
        this.f14955b = ubVar;
        this.f14956c = str;
        this.f14957d = str2;
        this.f14960g = clsArr;
        this.f14955b.m20210c().submit(new aas(this));
    }

    /* renamed from: a */
    private final String m18793a(byte[] bArr, String str) throws zzcy, UnsupportedEncodingException {
        return new String(this.f14955b.m20212e().m20187a(bArr, str), "UTF-8");
    }

    /* renamed from: b */
    private final void m18795b() {
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
        r0 = r3.f14955b;	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r0 = r0.m20211d();	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r1 = r3.f14955b;	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r1 = r1.m20213f();	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r2 = r3.f14956c;	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r1 = r3.m18793a(r1, r2);	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r0 = r0.loadClass(r1);	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        if (r0 != 0) goto L_0x001e;
    L_0x0018:
        r0 = r3.f14961h;
        r0.countDown();
        return;
    L_0x001e:
        r1 = r3.f14955b;	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r1 = r1.m20213f();	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r2 = r3.f14957d;	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r1 = r3.m18793a(r1, r2);	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r2 = r3.f14960g;	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r3.f14959f = r0;	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        r0 = r3.f14959f;	 Catch:{ zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, zzcy -> 0x0018, all -> 0x0035 }
        goto L_0x0018;
    L_0x0035:
        r0 = move-exception;
        r1 = r3.f14961h;
        r1.countDown();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aar.b():void");
    }

    /* renamed from: a */
    public final java.lang.reflect.Method m18796a() {
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
        r5 = this;
        r0 = r5.f14959f;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0 = r5.f14959f;
        return r0;
    L_0x0007:
        r0 = 0;
        r1 = r5.f14961h;	 Catch:{ InterruptedException -> 0x0018 }
        r2 = 2;	 Catch:{ InterruptedException -> 0x0018 }
        r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x0018 }
        r1 = r1.await(r2, r4);	 Catch:{ InterruptedException -> 0x0018 }
        if (r1 != 0) goto L_0x0015;	 Catch:{ InterruptedException -> 0x0018 }
    L_0x0014:
        return r0;	 Catch:{ InterruptedException -> 0x0018 }
    L_0x0015:
        r1 = r5.f14959f;	 Catch:{ InterruptedException -> 0x0018 }
        return r1;
    L_0x0018:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aar.a():java.lang.reflect.Method");
    }
}
