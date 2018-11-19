package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.m4b.maps.ay.C4723n;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.az.C4733b;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bq.C4870j;
import com.google.android.m4b.maps.bq.C4872l;
import com.google.android.m4b.maps.ch.C5203e;
import java.util.Locale;

public final class ao {
    /* renamed from: a */
    private static bg[] f18441a = new bg[]{bg.f17746b, bg.f17748d, bg.f17751g, bg.f17752h, bg.f17753i};
    /* renamed from: b */
    private static bg[] f18442b = new bg[]{bg.f17745a, bg.f17747c, bg.f17748d, bg.f17750f, bg.f17749e, bg.f17754j, bg.f17756l, bg.f17755k, bg.f17757m, bg.f17758n, bg.f17759o, bg.f17760p};
    /* renamed from: c */
    private static boolean f18443c = false;
    /* renamed from: d */
    private static volatile int f18444d = 10;
    /* renamed from: e */
    private static volatile int f18445e = -1;

    /* renamed from: a */
    public static synchronized void m22332a(android.content.Context r14, android.content.res.Resources r15, com.google.android.m4b.maps.bo.bg[] r16, int r17, com.google.android.m4b.maps.ay.C6413m r18, com.google.android.m4b.maps.ch.C5203e r19, com.google.android.m4b.maps.bw.C4981g r20) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 13, insn: 0x0068: MOVE  (r3 ?[OBJECT, ARRAY]) = (r13 ?[OBJECT, ARRAY]), block:B:21:0x0065, method: com.google.android.m4b.maps.bx.ao.a(android.content.Context, android.content.res.Resources, com.google.android.m4b.maps.bo.bg[], int, com.google.android.m4b.maps.ay.m, com.google.android.m4b.maps.ch.e, com.google.android.m4b.maps.bw.g):void
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:168)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVar(SSATransform.java:197)
	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:132)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:52)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        r1 = r17;
        r7 = r18;
        r8 = r19;
        r9 = com.google.android.m4b.maps.bx.ao.class;
        monitor-enter(r9);
        r2 = f18443c;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        if (r2 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r9);
        return;
    L_0x000f:
        r10 = android.os.SystemClock.uptimeMillis();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        com.google.android.m4b.maps.bh.C4784a.m21186a();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = "activity";	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r3 = r14;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = r3.getSystemService(r2);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = (android.app.ActivityManager) r2;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = r2.getMemoryClass();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        f18445e = r2;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = com.google.android.m4b.maps.az.C4733b.m21065a(r3);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2.mkdirs();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = com.google.android.m4b.maps.az.C4733b.m21069b(r3);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2.mkdir();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = com.google.android.m4b.maps.az.C4733b.m21070c(r3);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2.mkdir();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r12 = com.google.android.m4b.maps.az.C4733b.m21070c(r3);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        com.google.android.m4b.maps.bu.C7472c.m32366a(r7, r12, r8);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r13 = java.util.Locale.getDefault();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = -1;
        if (r1 == r2) goto L_0x0064;
    L_0x0048:
        r5 = r15;
        r1 = r5.openRawResource(r1);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        com.google.android.m4b.maps.bq.C4868i.m21807a(r1);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        goto L_0x0065;
    L_0x0051:
        r0 = move-exception;
        r1 = r0;
        r2 = "VectorGlobalState";	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r3 = 6;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r3);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        if (r2 == 0) goto L_0x0065;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
    L_0x005c:
        r2 = "VectorGlobalState";	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r3 = "Could not load encryption key";	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        android.util.Log.e(r2, r3, r1);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        goto L_0x0065;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
    L_0x0064:
        r5 = r15;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
    L_0x0065:
        r1 = r16;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = r7;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r3 = r13;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r4 = r12;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r6 = r8;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        m22333a(r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1 = new com.google.android.m4b.maps.ay.d;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1.<init>();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1 = com.google.android.m4b.maps.bq.C6534d.m28803a(r7, r12, r13, r1, r8);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        if (r1 == 0) goto L_0x0081;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
    L_0x0079:
        r1.m28813b();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = r20;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        com.google.android.m4b.maps.bm.C6487i.m28477a(r1, r2);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
    L_0x0081:
        r1 = android.os.SystemClock.uptimeMillis();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r3 = "VectorGlobalState";	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r4 = 3;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r3 = com.google.android.m4b.maps.ay.C4728u.m21050a(r3, r4);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        if (r3 == 0) goto L_0x00ae;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
    L_0x008e:
        r3 = "VectorGlobalState";	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r4 = 0;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r4 = r1 - r10;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = 42;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = "Initialization took ";	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1.append(r2);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1.append(r4);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r2 = "ms";	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1.append(r2);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        android.util.Log.d(r3, r1);	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
    L_0x00ae:
        r1 = 1;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        f18443c = r1;	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        com.google.android.m4b.maps.bh.C4784a.m21187b();	 Catch:{ IOException -> 0x0051, all -> 0x00b6 }
        monitor-exit(r9);
        return;
    L_0x00b6:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r9);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.ao.a(android.content.Context, android.content.res.Resources, com.google.android.m4b.maps.bo.bg[], int, com.google.android.m4b.maps.ay.m, com.google.android.m4b.maps.ch.e, com.google.android.m4b.maps.bw.g):void");
    }

    /* renamed from: a */
    public static boolean m22334a() {
        return C4725p.m21034k();
    }

    /* renamed from: a */
    public static synchronized C4870j m22330a(bg bgVar, Context context, Resources resources, C6413m c6413m, C5203e c5203e) {
        synchronized (ao.class) {
            bgVar = m22331a(bgVar, (C4723n) c6413m, context, resources, c5203e);
        }
        return bgVar;
    }

    /* renamed from: a */
    public static synchronized C4870j m22331a(bg bgVar, C4723n c4723n, Context context, Resources resources, C5203e c5203e) {
        synchronized (ao.class) {
            if (f18443c) {
                m22333a(new bg[]{bgVar}, c4723n, Locale.getDefault(), C4733b.m21070c(context), resources, c5203e);
                bgVar = C4872l.m21830b(bgVar);
            } else {
                throw new IllegalStateException("VectorGlobalState.initialize() must be called first");
            }
        }
        return bgVar;
    }

    /* renamed from: a */
    private static synchronized void m22333a(com.google.android.m4b.maps.bo.bg[] r13, com.google.android.m4b.maps.ay.C4723n r14, java.util.Locale r15, java.io.File r16, android.content.res.Resources r17, com.google.android.m4b.maps.ch.C5203e r18) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
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
        r1 = r13;
        r2 = com.google.android.m4b.maps.bx.ao.class;
        monitor-enter(r2);
        r3 = r1.length;	 Catch:{ all -> 0x002b }
        r4 = 0;	 Catch:{ all -> 0x002b }
    L_0x0006:
        if (r4 >= r3) goto L_0x0029;	 Catch:{ all -> 0x002b }
    L_0x0008:
        r12 = r1[r4];	 Catch:{ all -> 0x002b }
        r5 = com.google.android.m4b.maps.bq.C4872l.m21829a(r12);	 Catch:{ all -> 0x002b }
        if (r5 != 0) goto L_0x0026;	 Catch:{ all -> 0x002b }
    L_0x0010:
        r10 = 0;	 Catch:{ all -> 0x002b }
        r5 = r12;	 Catch:{ all -> 0x002b }
        r6 = r14;	 Catch:{ all -> 0x002b }
        r7 = r17;	 Catch:{ all -> 0x002b }
        r8 = r15;	 Catch:{ all -> 0x002b }
        r9 = r16;	 Catch:{ all -> 0x002b }
        r11 = r18;	 Catch:{ all -> 0x002b }
        r5 = r5.mo5121a(r6, r7, r8, r9, r10, r11);	 Catch:{ all -> 0x002b }
        if (r5 == 0) goto L_0x0026;	 Catch:{ all -> 0x002b }
    L_0x0020:
        r5.mo7081b();	 Catch:{ all -> 0x002b }
        com.google.android.m4b.maps.bq.C4872l.m21828a(r12, r5);	 Catch:{ all -> 0x002b }
    L_0x0026:
        r4 = r4 + 1;
        goto L_0x0006;
    L_0x0029:
        monitor-exit(r2);
        return;
    L_0x002b:
        r0 = move-exception;
        r1 = r0;
        monitor-exit(r2);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.ao.a(com.google.android.m4b.maps.bo.bg[], com.google.android.m4b.maps.ay.n, java.util.Locale, java.io.File, android.content.res.Resources, com.google.android.m4b.maps.ch.e):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public static synchronized void m22335b() {
        /*
        r0 = com.google.android.m4b.maps.bx.ao.class;
        monitor-enter(r0);
        r1 = f18443c;	 Catch:{ all -> 0x0048 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);
        return;
    L_0x0009:
        r1 = com.google.android.m4b.maps.bo.bg.m21672c();	 Catch:{ all -> 0x0048 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0048 }
    L_0x0011:
        r2 = r1.hasNext();	 Catch:{ all -> 0x0048 }
        if (r2 == 0) goto L_0x002b;
    L_0x0017:
        r2 = r1.next();	 Catch:{ all -> 0x0048 }
        r2 = (com.google.android.m4b.maps.bo.bg) r2;	 Catch:{ all -> 0x0048 }
        r3 = com.google.android.m4b.maps.bq.C4872l.m21829a(r2);	 Catch:{ all -> 0x0048 }
        if (r3 == 0) goto L_0x0011;
    L_0x0023:
        r2 = com.google.android.m4b.maps.bq.C4872l.m21830b(r2);	 Catch:{ all -> 0x0048 }
        r2.mo7083c();	 Catch:{ all -> 0x0048 }
        goto L_0x0011;
    L_0x002b:
        r1 = com.google.android.m4b.maps.bu.C7472c.m32365a();	 Catch:{ all -> 0x0048 }
        if (r1 == 0) goto L_0x0039;
    L_0x0031:
        r1 = com.google.android.m4b.maps.bu.C7472c.m32365a();	 Catch:{ all -> 0x0048 }
        r2 = 0;
        r1.m32370a(r2);	 Catch:{ all -> 0x0048 }
    L_0x0039:
        r1 = com.google.android.m4b.maps.bq.C6534d.m28802a();	 Catch:{ all -> 0x0048 }
        if (r1 == 0) goto L_0x0046;
    L_0x003f:
        r1 = com.google.android.m4b.maps.bq.C6534d.m28802a();	 Catch:{ all -> 0x0048 }
        r1.m28817c();	 Catch:{ all -> 0x0048 }
    L_0x0046:
        monitor-exit(r0);
        return;
    L_0x0048:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.ao.b():void");
    }

    /* renamed from: c */
    public static int m22336c() {
        return f18444d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public static synchronized void m22337d() {
        /*
        r0 = com.google.android.m4b.maps.bx.ao.class;
        monitor-enter(r0);
        r1 = f18443c;	 Catch:{ all -> 0x0042 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);
        return;
    L_0x0009:
        r1 = com.google.android.m4b.maps.bo.bg.m21672c();	 Catch:{ all -> 0x0042 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0042 }
    L_0x0011:
        r2 = r1.hasNext();	 Catch:{ all -> 0x0042 }
        if (r2 == 0) goto L_0x002b;
    L_0x0017:
        r2 = r1.next();	 Catch:{ all -> 0x0042 }
        r2 = (com.google.android.m4b.maps.bo.bg) r2;	 Catch:{ all -> 0x0042 }
        r3 = com.google.android.m4b.maps.bq.C4872l.m21829a(r2);	 Catch:{ all -> 0x0042 }
        if (r3 == 0) goto L_0x0011;
    L_0x0023:
        r2 = com.google.android.m4b.maps.bq.C4872l.m21830b(r2);	 Catch:{ all -> 0x0042 }
        r2.mo7078a();	 Catch:{ all -> 0x0042 }
        goto L_0x0011;
    L_0x002b:
        r1 = com.google.android.m4b.maps.bu.C7472c.m32365a();	 Catch:{ all -> 0x0042 }
        r2 = 1;
        r1.m32370a(r2);	 Catch:{ all -> 0x0042 }
        r1 = com.google.android.m4b.maps.bq.C6534d.m28802a();	 Catch:{ all -> 0x0042 }
        if (r1 == 0) goto L_0x0040;
    L_0x0039:
        r1 = com.google.android.m4b.maps.bq.C6534d.m28802a();	 Catch:{ all -> 0x0042 }
        r1.m28818d();	 Catch:{ all -> 0x0042 }
    L_0x0040:
        monitor-exit(r0);
        return;
    L_0x0042:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.ao.d():void");
    }

    /* renamed from: e */
    public static int m22338e() {
        return f18445e;
    }
}
