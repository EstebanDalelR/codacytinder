package com.google.android.gms.internal;

import android.content.Context;

@zzzv
public final class ce extends dy implements zzaee, zzaeh {
    /* renamed from: a */
    private final dm f26858a;
    /* renamed from: b */
    private final Context f26859b;
    /* renamed from: c */
    private final cp f26860c;
    /* renamed from: d */
    private final zzaeh f26861d;
    /* renamed from: e */
    private final Object f26862e;
    /* renamed from: f */
    private final String f26863f;
    /* renamed from: g */
    private final String f26864g;
    /* renamed from: h */
    private final ari f26865h;
    /* renamed from: i */
    private final long f26866i;
    /* renamed from: j */
    private int f26867j = 0;
    /* renamed from: k */
    private int f26868k = 3;
    /* renamed from: l */
    private ci f26869l;

    public ce(Context context, String str, String str2, ari ari, dm dmVar, cp cpVar, zzaeh zzaeh, long j) {
        this.f26859b = context;
        this.f26863f = str;
        this.f26864g = str2;
        this.f26865h = ari;
        this.f26858a = dmVar;
        this.f26860c = cpVar;
        this.f26862e = new Object();
        this.f26861d = zzaeh;
        this.f26866i = j;
    }

    /* renamed from: a */
    private final void m31542a(zzjj zzjj, zzva zzva) {
        this.f26860c.m19582b().m31551a((zzaeh) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f26863f)) {
                zzva.zza(zzjj, this.f26864g, this.f26865h.f15622a);
            } else {
                zzva.zzc(zzjj, this.f26864g);
            }
        } catch (Throwable e) {
            hx.m19914c("Fail to load ad from adapter.", e);
            zza(this.f26863f, 0);
        }
    }

    /* renamed from: a */
    private final boolean m31543a(long r7) {
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
        r6 = this;
        r0 = r6.f26866i;
        r2 = com.google.android.gms.ads.internal.ar.k();
        r2 = r2.elapsedRealtime();
        r4 = r2 - r7;
        r7 = r0 - r4;
        r0 = 0;
        r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1));
        r0 = 0;
        if (r2 > 0) goto L_0x0019;
    L_0x0015:
        r7 = 4;
    L_0x0016:
        r6.f26868k = r7;
        return r0;
    L_0x0019:
        r1 = r6.f26862e;	 Catch:{ InterruptedException -> 0x0020 }
        r1.wait(r7);	 Catch:{ InterruptedException -> 0x0020 }
        r7 = 1;
        return r7;
    L_0x0020:
        r7 = java.lang.Thread.currentThread();
        r7.interrupt();
        r7 = 5;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ce.a(long):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo6837a() {
        /*
        r11 = this;
        r0 = r11.f26860c;
        if (r0 == 0) goto L_0x00f0;
    L_0x0004:
        r0 = r11.f26860c;
        r0 = r0.m19582b();
        if (r0 == 0) goto L_0x00f0;
    L_0x000c:
        r0 = r11.f26860c;
        r0 = r0.m19581a();
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        return;
    L_0x0015:
        r0 = r11.f26860c;
        r0 = r0.m19582b();
        r1 = 0;
        r0.m31551a(r1);
        r0.m31550a(r11);
        r2 = r11.f26858a;
        r2 = r2.f15995a;
        r2 = r2.zzcnd;
        r3 = r11.f26860c;
        r3 = r3.m19581a();
        r4 = r3.isInitialized();	 Catch:{ RemoteException -> 0x0047 }
        if (r4 == 0) goto L_0x003f;
    L_0x0034:
        r4 = com.google.android.gms.internal.hn.f16157a;	 Catch:{ RemoteException -> 0x0047 }
        r5 = new com.google.android.gms.internal.cf;	 Catch:{ RemoteException -> 0x0047 }
        r5.<init>(r11, r2, r3);	 Catch:{ RemoteException -> 0x0047 }
    L_0x003b:
        r4.post(r5);	 Catch:{ RemoteException -> 0x0047 }
        goto L_0x0053;
    L_0x003f:
        r4 = com.google.android.gms.internal.hn.f16157a;	 Catch:{ RemoteException -> 0x0047 }
        r5 = new com.google.android.gms.internal.ch;	 Catch:{ RemoteException -> 0x0047 }
        r5.<init>(r11, r3, r2, r0);	 Catch:{ RemoteException -> 0x0047 }
        goto L_0x003b;
    L_0x0047:
        r2 = move-exception;
        r3 = "Fail to check if adapter is initialized.";
        com.google.android.gms.internal.hx.m19914c(r3, r2);
        r2 = r11.f26863f;
        r3 = 0;
        r11.zza(r2, r3);
    L_0x0053:
        r2 = com.google.android.gms.ads.internal.ar.k();
        r2 = r2.elapsedRealtime();
    L_0x005b:
        r4 = r11.f26862e;
        monitor-enter(r4);
        r5 = r11.f26867j;	 Catch:{ all -> 0x00ed }
        r6 = 1;
        if (r5 == 0) goto L_0x0099;
    L_0x0063:
        r5 = new com.google.android.gms.internal.ck;	 Catch:{ all -> 0x00ed }
        r5.<init>();	 Catch:{ all -> 0x00ed }
        r7 = com.google.android.gms.ads.internal.ar.k();	 Catch:{ all -> 0x00ed }
        r7 = r7.elapsedRealtime();	 Catch:{ all -> 0x00ed }
        r9 = 0;
        r9 = r7 - r2;
        r2 = r5.m19578a(r9);	 Catch:{ all -> 0x00ed }
        r3 = r11.f26867j;	 Catch:{ all -> 0x00ed }
        if (r6 != r3) goto L_0x007d;
    L_0x007b:
        r3 = 6;
        goto L_0x007f;
    L_0x007d:
        r3 = r11.f26868k;	 Catch:{ all -> 0x00ed }
    L_0x007f:
        r2 = r2.m19577a(r3);	 Catch:{ all -> 0x00ed }
        r3 = r11.f26863f;	 Catch:{ all -> 0x00ed }
        r2 = r2.m19579a(r3);	 Catch:{ all -> 0x00ed }
        r3 = r11.f26865h;	 Catch:{ all -> 0x00ed }
        r3 = r3.f15625d;	 Catch:{ all -> 0x00ed }
        r2 = r2.m19580b(r3);	 Catch:{ all -> 0x00ed }
        r2 = r2.m19576a();	 Catch:{ all -> 0x00ed }
        r11.f26869l = r2;	 Catch:{ all -> 0x00ed }
    L_0x0097:
        monitor-exit(r4);	 Catch:{ all -> 0x00ed }
        goto L_0x00ce;
    L_0x0099:
        r5 = r11.m31543a(r2);	 Catch:{ all -> 0x00ed }
        if (r5 != 0) goto L_0x00ea;
    L_0x009f:
        r5 = new com.google.android.gms.internal.ck;	 Catch:{ all -> 0x00ed }
        r5.<init>();	 Catch:{ all -> 0x00ed }
        r7 = r11.f26868k;	 Catch:{ all -> 0x00ed }
        r5 = r5.m19577a(r7);	 Catch:{ all -> 0x00ed }
        r7 = com.google.android.gms.ads.internal.ar.k();	 Catch:{ all -> 0x00ed }
        r7 = r7.elapsedRealtime();	 Catch:{ all -> 0x00ed }
        r9 = 0;
        r9 = r7 - r2;
        r2 = r5.m19578a(r9);	 Catch:{ all -> 0x00ed }
        r3 = r11.f26863f;	 Catch:{ all -> 0x00ed }
        r2 = r2.m19579a(r3);	 Catch:{ all -> 0x00ed }
        r3 = r11.f26865h;	 Catch:{ all -> 0x00ed }
        r3 = r3.f15625d;	 Catch:{ all -> 0x00ed }
        r2 = r2.m19580b(r3);	 Catch:{ all -> 0x00ed }
        r2 = r2.m19576a();	 Catch:{ all -> 0x00ed }
        r11.f26869l = r2;	 Catch:{ all -> 0x00ed }
        goto L_0x0097;
    L_0x00ce:
        r0.m31551a(r1);
        r0.m31550a(r1);
        r0 = r11.f26867j;
        if (r0 != r6) goto L_0x00e0;
    L_0x00d8:
        r0 = r11.f26861d;
        r1 = r11.f26863f;
        r0.zzbr(r1);
        return;
    L_0x00e0:
        r0 = r11.f26861d;
        r1 = r11.f26863f;
        r2 = r11.f26868k;
        r0.zza(r1, r2);
        return;
    L_0x00ea:
        monitor-exit(r4);	 Catch:{ all -> 0x00ed }
        goto L_0x005b;
    L_0x00ed:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00ed }
        throw r0;
    L_0x00f0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ce.a():void");
    }

    /* renamed from: b */
    public final void mo6838b() {
    }

    /* renamed from: c */
    public final ci m31548c() {
        ci ciVar;
        synchronized (this.f26862e) {
            ciVar = this.f26869l;
        }
        return ciVar;
    }

    /* renamed from: d */
    public final ari m31549d() {
        return this.f26865h;
    }

    public final void zza(String str, int i) {
        synchronized (this.f26862e) {
            this.f26867j = 2;
            this.f26868k = i;
            this.f26862e.notify();
        }
    }

    public final void zzaa(int i) {
        zza(this.f26863f, 0);
    }

    public final void zzbr(String str) {
        synchronized (this.f26862e) {
            this.f26867j = 1;
            this.f26862e.notify();
        }
    }

    public final void zzof() {
        m31542a(this.f26858a.f15995a.zzcnd, this.f26860c.m19581a());
    }
}
