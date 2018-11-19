package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.C2480j;
import java.lang.ref.WeakReference;

final class ca implements DeathRecipient, cb {
    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f11955a;
    /* renamed from: b */
    private final WeakReference<C2480j> f11956b;
    /* renamed from: c */
    private final WeakReference<IBinder> f11957c;

    private ca(BasePendingResult<?> basePendingResult, C2480j c2480j, IBinder iBinder) {
        this.f11956b = new WeakReference(c2480j);
        this.f11955a = new WeakReference(basePendingResult);
        this.f11957c = new WeakReference(iBinder);
    }

    /* renamed from: a */
    private final void m14326a() {
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
        r0 = r2.f11955a;
        r0 = r0.get();
        r0 = (com.google.android.gms.common.api.internal.BasePendingResult) r0;
        r1 = r2.f11956b;
        r1 = r1.get();
        r1 = (com.google.android.gms.common.api.C2480j) r1;
        if (r1 == 0) goto L_0x001f;
    L_0x0012:
        if (r0 == 0) goto L_0x001f;
    L_0x0014:
        r0 = r0.mo2489c();
        r0 = r0.intValue();
        r1.m9015a(r0);
    L_0x001f:
        r0 = r2.f11957c;
        r0 = r0.get();
        r0 = (android.os.IBinder) r0;
        if (r0 == 0) goto L_0x002d;
    L_0x0029:
        r1 = 0;
        r0.unlinkToDeath(r2, r1);	 Catch:{ NoSuchElementException -> 0x002d }
    L_0x002d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ca.a():void");
    }

    /* renamed from: a */
    public final void mo2545a(BasePendingResult<?> basePendingResult) {
        m14326a();
    }

    public final void binderDied() {
        m14326a();
    }
}
