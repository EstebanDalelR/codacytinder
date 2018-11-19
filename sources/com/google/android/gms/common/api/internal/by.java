package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.C2462b;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class by {
    /* renamed from: a */
    public static final Status f7510a = new Status(8, "The connection to Google Play services was lost");
    /* renamed from: c */
    private static final BasePendingResult<?>[] f7511c = new BasePendingResult[0];
    /* renamed from: b */
    final Set<BasePendingResult<?>> f7512b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    /* renamed from: d */
    private final cb f7513d = new bz(this);
    /* renamed from: e */
    private final Map<C2462b<?>, zze> f7514e;

    public by(Map<C2462b<?>, zze> map) {
        this.f7514e = map;
    }

    /* renamed from: a */
    public final void m8985a() {
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
        r8 = this;
        r0 = r8.f7512b;
        r1 = f7511c;
        r0 = r0.toArray(r1);
        r0 = (com.google.android.gms.common.api.internal.BasePendingResult[]) r0;
        r1 = r0.length;
        r2 = 0;
        r3 = 0;
    L_0x000d:
        if (r3 >= r1) goto L_0x0075;
    L_0x000f:
        r4 = r0[r3];
        r5 = 0;
        r4.m14225a(r5);
        r6 = r4.mo2489c();
        if (r6 != 0) goto L_0x0027;
    L_0x001b:
        r5 = r4.m14230e();
        if (r5 == 0) goto L_0x0072;
    L_0x0021:
        r5 = r8.f7512b;
        r5.remove(r4);
        goto L_0x0072;
    L_0x0027:
        r4.mo2487a(r5);
        r6 = r8.f7514e;
        r7 = r4;
        r7 = (com.google.android.gms.common.api.internal.ck) r7;
        r7 = r7.mo3575g();
        r6 = r6.get(r7);
        r6 = (com.google.android.gms.common.api.Api.zze) r6;
        r6 = r6.zzagh();
        r7 = r4.m14229d();
        if (r7 == 0) goto L_0x004c;
    L_0x0043:
        r7 = new com.google.android.gms.common.api.internal.ca;
        r7.<init>(r4, r5, r6, r5);
        r4.m14225a(r7);
        goto L_0x0021;
    L_0x004c:
        if (r6 == 0) goto L_0x0060;
    L_0x004e:
        r7 = r6.isBinderAlive();
        if (r7 == 0) goto L_0x0060;
    L_0x0054:
        r7 = new com.google.android.gms.common.api.internal.ca;
        r7.<init>(r4, r5, r6, r5);
        r4.m14225a(r7);
        r6.linkToDeath(r7, r2);	 Catch:{ RemoteException -> 0x0063 }
        goto L_0x0021;
    L_0x0060:
        r4.m14225a(r5);
    L_0x0063:
        r4.mo2485a();
        r6 = r4.mo2489c();
        r6 = r6.intValue();
        r5.m9015a(r6);
        goto L_0x0021;
    L_0x0072:
        r3 = r3 + 1;
        goto L_0x000d;
    L_0x0075:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.by.a():void");
    }

    /* renamed from: a */
    final void m8986a(BasePendingResult<? extends Result> basePendingResult) {
        this.f7512b.add(basePendingResult);
        basePendingResult.m14225a(this.f7513d);
    }

    /* renamed from: b */
    public final void m8987b() {
        for (BasePendingResult b : (BasePendingResult[]) this.f7512b.toArray(f7511c)) {
            b.m14226b(f7510a);
        }
    }
}
