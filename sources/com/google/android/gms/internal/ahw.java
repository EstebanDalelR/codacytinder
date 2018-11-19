package com.google.android.gms.internal;

import com.google.android.gms.internal.zziu.zza.zzb;

@zzzv
public final class ahw {
    /* renamed from: a */
    private final ahz f15280a;
    /* renamed from: b */
    private final aif f15281b;
    /* renamed from: c */
    private final boolean f15282c;

    private ahw() {
        this.f15282c = false;
        this.f15280a = new ahz();
        this.f15281b = new aif();
        m19186b();
    }

    public ahw(ahz ahz, boolean z) {
        this.f15280a = ahz;
        this.f15282c = z;
        this.f15281b = new aif();
        m19186b();
    }

    /* renamed from: a */
    public static ahw m19185a() {
        return new ahw();
    }

    /* renamed from: b */
    private final synchronized void m19186b() {
        this.f15281b.f26651d = new aid();
        this.f15281b.f26650c = new aie();
    }

    /* renamed from: c */
    private static long[] m19187c() {
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
        r0 = com.google.android.gms.internal.alo.m19339b();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0 = r0.iterator();
    L_0x000d:
        r2 = r0.hasNext();
        r3 = 0;
        if (r2 == 0) goto L_0x0035;
    L_0x0014:
        r2 = r0.next();
        r2 = (java.lang.String) r2;
        r4 = ",";
        r2 = r2.split(r4);
        r4 = r2.length;
    L_0x0021:
        if (r3 >= r4) goto L_0x000d;
    L_0x0023:
        r5 = r2[r3];
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ NumberFormatException -> 0x002d }
        r1.add(r5);	 Catch:{ NumberFormatException -> 0x002d }
        goto L_0x0032;
    L_0x002d:
        r5 = "Experiment ID is not a number";
        com.google.android.gms.internal.ec.m27332a(r5);
    L_0x0032:
        r3 = r3 + 1;
        goto L_0x0021;
    L_0x0035:
        r0 = r1.size();
        r0 = new long[r0];
        r1 = (java.util.ArrayList) r1;
        r2 = r1.size();
        r4 = 0;
    L_0x0042:
        if (r3 >= r2) goto L_0x0055;
    L_0x0044:
        r5 = r1.get(r3);
        r3 = r3 + 1;
        r5 = (java.lang.Long) r5;
        r5 = r5.longValue();
        r0[r4] = r5;
        r4 = r4 + 1;
        goto L_0x0042;
    L_0x0055:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ahw.c():long[]");
    }

    /* renamed from: a */
    public final synchronized void m19188a(zzit zzit) {
        if (this.f15282c) {
            zzit.zza(this.f15281b);
        }
    }

    /* renamed from: a */
    public final synchronized void m19189a(zzb zzb) {
        if (this.f15282c) {
            this.f15281b.f26649b = m19187c();
            this.f15280a.m19190a(aee.m19058a(this.f15281b)).m19193b(zzb.zzhq()).m19192a();
            String str = "Logging Event with event code : ";
            String valueOf = String.valueOf(Integer.toString(zzb.zzhq(), 10));
            ec.m27332a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }
}
