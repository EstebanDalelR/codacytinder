package com.google.android.gms.internal;

import android.os.ConditionVariable;
import java.util.Random;

public class sp {
    /* renamed from: a */
    protected static volatile ahz f16514a;
    /* renamed from: d */
    private static final ConditionVariable f16515d = new ConditionVariable();
    /* renamed from: e */
    private static volatile Random f16516e;
    /* renamed from: b */
    protected volatile Boolean f16517b;
    /* renamed from: c */
    private ub f16518c;

    public sp(ub ubVar) {
        this.f16518c = ubVar;
        ubVar.m20210c().execute(new sq(this));
    }

    /* renamed from: a */
    public static int m20170a() {
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
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0018 }
        r1 = 21;	 Catch:{ RuntimeException -> 0x0018 }
        if (r0 < r1) goto L_0x000f;	 Catch:{ RuntimeException -> 0x0018 }
    L_0x0006:
        r0 = java.util.concurrent.ThreadLocalRandom.current();	 Catch:{ RuntimeException -> 0x0018 }
        r0 = r0.nextInt();	 Catch:{ RuntimeException -> 0x0018 }
        return r0;	 Catch:{ RuntimeException -> 0x0018 }
    L_0x000f:
        r0 = m20173c();	 Catch:{ RuntimeException -> 0x0018 }
        r0 = r0.nextInt();	 Catch:{ RuntimeException -> 0x0018 }
        return r0;
    L_0x0018:
        r0 = m20173c();
        r0 = r0.nextInt();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.sp.a():int");
    }

    /* renamed from: c */
    private static Random m20173c() {
        if (f16516e == null) {
            synchronized (sp.class) {
                if (f16516e == null) {
                    f16516e = new Random();
                }
            }
        }
        return f16516e;
    }

    /* renamed from: a */
    public final void m20174a(int r3, int r4, long r5) throws java.io.IOException {
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
        r0 = f16515d;	 Catch:{ Exception -> 0x0039 }
        r0.block();	 Catch:{ Exception -> 0x0039 }
        r0 = r2.f16517b;	 Catch:{ Exception -> 0x0039 }
        r0 = r0.booleanValue();	 Catch:{ Exception -> 0x0039 }
        if (r0 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x0039 }
    L_0x000d:
        r0 = f16514a;	 Catch:{ Exception -> 0x0039 }
        if (r0 == 0) goto L_0x0039;	 Catch:{ Exception -> 0x0039 }
    L_0x0011:
        r0 = new com.google.android.gms.internal.mi;	 Catch:{ Exception -> 0x0039 }
        r0.<init>();	 Catch:{ Exception -> 0x0039 }
        r1 = r2.f16518c;	 Catch:{ Exception -> 0x0039 }
        r1 = r1.f16550a;	 Catch:{ Exception -> 0x0039 }
        r1 = r1.getPackageName();	 Catch:{ Exception -> 0x0039 }
        r0.f26931a = r1;	 Catch:{ Exception -> 0x0039 }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ Exception -> 0x0039 }
        r0.f26932b = r5;	 Catch:{ Exception -> 0x0039 }
        r5 = f16514a;	 Catch:{ Exception -> 0x0039 }
        r6 = com.google.android.gms.internal.aee.m19058a(r0);	 Catch:{ Exception -> 0x0039 }
        r5 = r5.m19190a(r6);	 Catch:{ Exception -> 0x0039 }
        r5.m19191a(r4);	 Catch:{ Exception -> 0x0039 }
        r5.m19193b(r3);	 Catch:{ Exception -> 0x0039 }
        r5.m19192a();	 Catch:{ Exception -> 0x0039 }
    L_0x0039:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.sp.a(int, int, long):void");
    }
}
