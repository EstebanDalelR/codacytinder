package com.google.android.gms.internal;

public class acc {
    /* renamed from: a */
    private static final abq f15009a = abq.m18839a();
    /* renamed from: b */
    private zzfes f15010b;
    /* renamed from: c */
    private volatile zzfhe f15011c;
    /* renamed from: d */
    private volatile zzfes f15012d;

    /* renamed from: b */
    private com.google.android.gms.internal.zzfhe m18863b(com.google.android.gms.internal.zzfhe r2) {
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
        r0 = r1.f15011c;
        if (r0 != 0) goto L_0x001c;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.f15011c;	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x000b;	 Catch:{ all -> 0x0019 }
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        goto L_0x001c;
    L_0x000b:
        r1.f15011c = r2;	 Catch:{ zzfge -> 0x0012 }
        r0 = com.google.android.gms.internal.zzfes.f16682a;	 Catch:{ zzfge -> 0x0012 }
        r1.f15012d = r0;	 Catch:{ zzfge -> 0x0012 }
        goto L_0x0009;
    L_0x0012:
        r1.f15011c = r2;	 Catch:{ all -> 0x0019 }
        r2 = com.google.android.gms.internal.zzfes.f16682a;	 Catch:{ all -> 0x0019 }
        r1.f15012d = r2;	 Catch:{ all -> 0x0019 }
        goto L_0x0009;	 Catch:{ all -> 0x0019 }
    L_0x0019:
        r2 = move-exception;	 Catch:{ all -> 0x0019 }
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        throw r2;
    L_0x001c:
        r2 = r1.f15011c;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.acc.b(com.google.android.gms.internal.zzfhe):com.google.android.gms.internal.zzfhe");
    }

    /* renamed from: a */
    public final zzfhe m18864a(zzfhe zzfhe) {
        zzfhe zzfhe2 = this.f15011c;
        this.f15010b = null;
        this.f15012d = null;
        this.f15011c = zzfhe;
        return zzfhe2;
    }

    /* renamed from: b */
    public final int m18865b() {
        return this.f15012d != null ? this.f15012d.mo6930a() : this.f15011c != null ? this.f15011c.zzho() : 0;
    }

    /* renamed from: c */
    public final zzfes m18866c() {
        if (this.f15012d != null) {
            return this.f15012d;
        }
        synchronized (this) {
            if (this.f15012d != null) {
                zzfes zzfes = this.f15012d;
                return zzfes;
            }
            this.f15012d = this.f15011c == null ? zzfes.f16682a : this.f15011c.toByteString();
            zzfes = this.f15012d;
            return zzfes;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acc)) {
            return false;
        }
        acc acc = (acc) obj;
        zzfhe zzfhe = this.f15011c;
        zzfhe zzfhe2 = acc.f15011c;
        return (zzfhe == null && zzfhe2 == null) ? m18866c().equals(acc.m18866c()) : (zzfhe == null || zzfhe2 == null) ? zzfhe != null ? zzfhe.equals(acc.m18863b(zzfhe.zzcxq())) : m18863b(zzfhe2.zzcxq()).equals(zzfhe2) : zzfhe.equals(zzfhe2);
    }

    public int hashCode() {
        return 1;
    }
}
