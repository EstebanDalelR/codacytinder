package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.aa;
import java.util.concurrent.Future;

@zzzv
public final class aut extends dy {
    /* renamed from: a */
    private final zzyb f26820a;
    /* renamed from: b */
    private final zzaax f26821b;
    /* renamed from: c */
    private final dm f26822c;
    /* renamed from: d */
    private final aux f26823d;
    /* renamed from: e */
    private final Object f26824e;
    /* renamed from: f */
    private Future<dl> f26825f;

    public aut(Context context, aa aaVar, dm dmVar, tb tbVar, zzyb zzyb, amb amb) {
        this(dmVar, zzyb, new aux(context, aaVar, new gr(context), tbVar, dmVar, amb));
    }

    private aut(dm dmVar, zzyb zzyb, aux aux) {
        this.f26824e = new Object();
        this.f26822c = dmVar;
        this.f26821b = dmVar.f15996b;
        this.f26820a = zzyb;
        this.f26823d = aux;
    }

    /* renamed from: a */
    public final void mo6837a() {
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
        r53 = this;
        r1 = r53;
        r2 = 0;
        r3 = 0;
        r4 = r1.f26824e;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        monitor-enter(r4);	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r5 = r1.f26823d;	 Catch:{ all -> 0x0023 }
        r6 = com.google.android.gms.internal.fe.f16050a;	 Catch:{ all -> 0x0023 }
        r5 = com.google.android.gms.internal.fe.m19677a(r6, r5);	 Catch:{ all -> 0x0023 }
        r1.f26825f = r5;	 Catch:{ all -> 0x0023 }
        monitor-exit(r4);	 Catch:{ all -> 0x0023 }
        r4 = r1.f26825f;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r5 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r7 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r4 = r4.get(r5, r7);	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r4 = (com.google.android.gms.internal.dl) r4;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
        r2 = -2;
        r3 = r4;
        r8 = -2;
        goto L_0x0036;
    L_0x0023:
        r0 = move-exception;
        r5 = r0;
        monitor-exit(r4);	 Catch:{ all -> 0x0023 }
        throw r5;	 Catch:{ TimeoutException -> 0x0029, ExecutionException -> 0x0027, ExecutionException -> 0x0027, ExecutionException -> 0x0027 }
    L_0x0027:
        r8 = 0;
        goto L_0x0036;
    L_0x0029:
        r2 = "Timed out waiting for native ad.";
        com.google.android.gms.internal.hx.m19916e(r2);
        r2 = 2;
        r4 = r1.f26825f;
        r5 = 1;
        r4.cancel(r5);
        r8 = 2;
    L_0x0036:
        if (r3 == 0) goto L_0x003b;
    L_0x0038:
        r2 = r3;
        goto L_0x00ce;
    L_0x003b:
        r2 = new com.google.android.gms.internal.dl;
        r3 = r1.f26822c;
        r3 = r3.f15995a;
        r5 = r3.zzcnd;
        r3 = r1.f26821b;
        r11 = r3.orientation;
        r3 = r1.f26821b;
        r12 = r3.zzcdq;
        r3 = r1.f26822c;
        r3 = r3.f15995a;
        r14 = r3.zzcng;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r3 = r1.f26821b;
        r3 = r3.zzcox;
        r15 = r1.f26822c;
        r15 = r15.f15998d;
        r10 = r1.f26821b;
        r44 = r11;
        r10 = r10.zzcov;
        r9 = r1.f26822c;
        r45 = r10;
        r10 = r9.f16000f;
        r9 = r1.f26821b;
        r47 = r10;
        r10 = r9.zzcpa;
        r9 = r1.f26821b;
        r9 = r9.zzcpb;
        r7 = r1.f26822c;
        r7 = r7.f16002h;
        r32 = 0;
        r33 = 0;
        r34 = 0;
        r35 = 0;
        r6 = r1.f26822c;
        r6 = r6.f15996b;
        r6 = r6.zzcpo;
        r49 = r3;
        r3 = r1.f26822c;
        r3 = r3.f15996b;
        r3 = r3.zzcpp;
        r38 = 0;
        r39 = 0;
        r4 = r1.f26821b;
        r4 = r4.zzcps;
        r51 = r4;
        r4 = r1.f26822c;
        r4 = r4.f16003i;
        r52 = r4;
        r4 = r1.f26822c;
        r4 = r4.f15996b;
        r4 = r4.zzaqv;
        r43 = 0;
        r42 = r4;
        r21 = r49;
        r40 = r51;
        r41 = r52;
        r4 = r2;
        r36 = r6;
        r6 = 0;
        r31 = r7;
        r7 = 0;
        r30 = r9;
        r9 = 0;
        r28 = r10;
        r24 = r45;
        r26 = r47;
        r10 = 0;
        r11 = r44;
        r23 = r15;
        r15 = 0;
        r37 = r3;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43);
    L_0x00ce:
        r3 = com.google.android.gms.internal.fk.f16060a;
        r4 = new com.google.android.gms.internal.auu;
        r4.<init>(r1, r2);
        r3.post(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aut.a():void");
    }

    /* renamed from: b */
    public final void mo6838b() {
        synchronized (this.f26824e) {
            if (this.f26825f != null) {
                this.f26825f.cancel(true);
            }
        }
    }
}
