package com.facebook.ads.internal.p037d;

import android.content.Context;
import android.support.annotation.Nullable;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.facebook.ads.internal.d.b */
public class C1390b implements UncaughtExceptionHandler {
    /* renamed from: a */
    private final UncaughtExceptionHandler f3778a;
    /* renamed from: b */
    private final Context f3779b;

    public C1390b(@Nullable UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        this.f3778a = uncaughtExceptionHandler;
        if (context == null) {
            throw new IllegalArgumentException("Missing Context");
        }
        this.f3779b = context.getApplicationContext();
    }

    /* renamed from: a */
    private void m4828a(java.lang.Thread r2, java.lang.Throwable r3) {
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
        r1 = this;
        r0 = r1.f3778a;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r1.f3778a;
        r0.uncaughtException(r2, r3);
        return;
    L_0x000a:
        r2 = android.os.Process.myPid();	 Catch:{ Throwable -> 0x0011 }
        android.os.Process.killProcess(r2);	 Catch:{ Throwable -> 0x0011 }
    L_0x0011:
        r2 = 10;
        java.lang.System.exit(r2);	 Catch:{ Throwable -> 0x0016 }
    L_0x0016:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.d.b.a(java.lang.Thread, java.lang.Throwable):void");
    }

    public void uncaughtException(java.lang.Thread r6, java.lang.Throwable r7) {
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
        r0 = com.facebook.ads.internal.p047k.ah.m5181a(r7);	 Catch:{ Exception -> 0x0031 }
        if (r0 == 0) goto L_0x0031;	 Catch:{ Exception -> 0x0031 }
    L_0x0006:
        r1 = "com.facebook.ads";	 Catch:{ Exception -> 0x0031 }
        r1 = r0.contains(r1);	 Catch:{ Exception -> 0x0031 }
        if (r1 == 0) goto L_0x0031;	 Catch:{ Exception -> 0x0031 }
    L_0x000e:
        r1 = new com.facebook.ads.internal.g.i;	 Catch:{ Exception -> 0x0031 }
        r2 = r5.f3779b;	 Catch:{ Exception -> 0x0031 }
        r3 = 0;	 Catch:{ Exception -> 0x0031 }
        r1.<init>(r2, r3);	 Catch:{ Exception -> 0x0031 }
        r1 = r1.m4929b();	 Catch:{ Exception -> 0x0031 }
        r2 = new com.facebook.ads.internal.k.o;	 Catch:{ Exception -> 0x0031 }
        r2.<init>(r0, r1);	 Catch:{ Exception -> 0x0031 }
        r0 = new com.facebook.ads.internal.h.p;	 Catch:{ Exception -> 0x0031 }
        r3 = com.facebook.ads.internal.p040g.C1414h.m4921b();	 Catch:{ Exception -> 0x0031 }
        r1 = com.facebook.ads.internal.p040g.C1414h.m4922c();	 Catch:{ Exception -> 0x0031 }
        r0.<init>(r3, r1, r2);	 Catch:{ Exception -> 0x0031 }
        r1 = r5.f3779b;	 Catch:{ Exception -> 0x0031 }
        com.facebook.ads.internal.p047k.C1502p.m5288a(r0, r1);	 Catch:{ Exception -> 0x0031 }
    L_0x0031:
        r5.m4828a(r6, r7);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.d.b.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
