package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class aat implements Callable {
    /* renamed from: a */
    protected final ub f14963a;
    /* renamed from: b */
    protected final nx f14964b;
    /* renamed from: c */
    protected Method f14965c;
    /* renamed from: d */
    private String f14966d = getClass().getSimpleName();
    /* renamed from: e */
    private String f14967e;
    /* renamed from: f */
    private String f14968f;
    /* renamed from: g */
    private int f14969g;
    /* renamed from: h */
    private int f14970h;

    public aat(ub ubVar, String str, String str2, nx nxVar, int i, int i2) {
        this.f14963a = ubVar;
        this.f14967e = str;
        this.f14968f = str2;
        this.f14964b = nxVar;
        this.f14969g = i;
        this.f14970h = i2;
    }

    /* renamed from: a */
    protected abstract void mo4165a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public java.lang.Void mo4166b() throws java.lang.Exception {
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
        r10 = this;
        r0 = 0;
        r1 = java.lang.System.nanoTime();	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r10.f14963a;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r4 = r10.f14967e;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r5 = r10.f14968f;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r3.m20205a(r4, r5);	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r10.f14965c = r3;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r10.f14965c;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        if (r3 != 0) goto L_0x0016;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0015:
        return r0;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0016:
        r10.mo4165a();	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r10.f14963a;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3 = r3.m20215h();	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        if (r3 == 0) goto L_0x0038;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0021:
        r4 = r10.f14969g;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        if (r4 == r5) goto L_0x0038;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0027:
        r4 = r10.f14970h;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r5 = r10.f14969g;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r6 = java.lang.System.nanoTime();	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r8 = 0;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r8 = r6 - r1;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r1 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r8 = r8 / r1;	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
        r3.m20174a(r4, r5, r8);	 Catch:{ IllegalAccessException -> 0x0038, IllegalAccessException -> 0x0038 }
    L_0x0038:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aat.b():java.lang.Void");
    }

    public /* synthetic */ Object call() throws Exception {
        return mo4166b();
    }
}
