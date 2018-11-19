package com.google.android.m4b.maps.ct;

/* renamed from: com.google.android.m4b.maps.ct.o */
public class C5277o {
    /* renamed from: b */
    private static final C5262h f19599b = C5262h.m23371a();
    /* renamed from: a */
    protected volatile C6656q f19600a;
    /* renamed from: c */
    private C5255d f19601c;
    /* renamed from: d */
    private C5262h f19602d;
    /* renamed from: e */
    private volatile C5255d f19603e;

    /* renamed from: a */
    public boolean mo5377a() {
        if (this.f19603e != C5255d.f19541a) {
            if (this.f19600a == null) {
                if (this.f19601c != null) {
                    if (this.f19601c == C5255d.f19541a) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void m23426c() {
        this.f19601c = null;
        this.f19600a = null;
        this.f19603e = null;
    }

    /* renamed from: b */
    public final C6656q m23425b(C6656q c6656q) {
        C6656q c6656q2 = this.f19600a;
        this.f19601c = null;
        this.f19603e = null;
        this.f19600a = c6656q;
        return c6656q2;
    }

    /* renamed from: a */
    public final void m23423a(C5277o c5277o) {
        if (!c5277o.mo5377a()) {
            if (mo5377a()) {
                this.f19601c = c5277o.f19601c;
                this.f19600a = c5277o.f19600a;
                this.f19603e = c5277o.f19603e;
                if (c5277o.f19602d != null) {
                    this.f19602d = c5277o.f19602d;
                }
                return;
            }
            if (this.f19602d == null) {
                this.f19602d = c5277o.f19602d;
            }
            if (this.f19601c != null && c5277o.f19601c != null) {
                C5255d c5255d = this.f19601c;
                c5277o = c5277o.f19601c;
                int b = c5255d.mo5381b();
                int b2 = c5277o.mo5381b();
                if (((long) b) + ((long) b2) >= 2147483647L) {
                    StringBuilder stringBuilder = new StringBuilder(53);
                    stringBuilder.append("ByteString would be too long: ");
                    stringBuilder.append(b);
                    stringBuilder.append("+");
                    stringBuilder.append(b2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.f19601c = C6658u.m29710a(c5255d, c5277o);
            } else if (this.f19600a == null && c5277o.f19600a != null) {
                m23425b(C5277o.m23420a(c5277o.f19600a, this.f19601c, this.f19602d));
            } else if (this.f19600a != null && c5277o.f19600a == null) {
                m23425b(C5277o.m23420a(this.f19600a, c5277o.f19601c, c5277o.f19602d));
            } else if (c5277o.f19602d != null) {
                m23425b(C5277o.m23420a(this.f19600a, c5277o.m23428e(), c5277o.f19602d));
            } else if (this.f19602d != null) {
                m23425b(C5277o.m23420a(c5277o.f19600a, m23428e(), this.f19602d));
            } else {
                m23425b(C5277o.m23420a(this.f19600a, c5277o.m23428e(), f19599b));
            }
        }
    }

    /* renamed from: a */
    private static com.google.android.m4b.maps.ct.C6656q m23420a(com.google.android.m4b.maps.ct.C6656q r1, com.google.android.m4b.maps.ct.C5255d r2, com.google.android.m4b.maps.ct.C5262h r3) {
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
        r0 = r1.mo7580l();	 Catch:{ m -> 0x000d }
        r2 = r0.mo7221a(r2, r3);	 Catch:{ m -> 0x000d }
        r2 = r2.mo7577g();	 Catch:{ m -> 0x000d }
        return r2;
    L_0x000d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ct.o.a(com.google.android.m4b.maps.ct.q, com.google.android.m4b.maps.ct.d, com.google.android.m4b.maps.ct.h):com.google.android.m4b.maps.ct.q");
    }

    /* renamed from: d */
    public final int m23427d() {
        if (this.f19601c != null) {
            return this.f19601c.mo5381b();
        }
        if (this.f19603e != null) {
            return this.f19603e.mo5381b();
        }
        return this.f19600a != null ? this.f19600a.mo7634a() : 0;
    }

    /* renamed from: e */
    public final C5255d m23428e() {
        if (this.f19601c != null) {
            return this.f19601c;
        }
        if (this.f19603e != null) {
            return this.f19603e;
        }
        synchronized (this) {
            if (this.f19603e != null) {
                C5255d c5255d = this.f19603e;
                return c5255d;
            }
            if (this.f19600a == null) {
                this.f19603e = C5255d.f19541a;
            } else {
                this.f19603e = this.f19600a.mo7224e();
            }
            c5255d = this.f19603e;
            return c5255d;
        }
    }

    /* renamed from: a */
    public final com.google.android.m4b.maps.ct.C6656q m23421a(com.google.android.m4b.maps.ct.C6656q r5) {
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
        r4 = this;
        r0 = r4.f19600a;
        if (r0 != 0) goto L_0x003d;
    L_0x0004:
        monitor-enter(r4);
        r0 = r4.f19600a;	 Catch:{ all -> 0x003a }
        if (r0 == 0) goto L_0x000b;	 Catch:{ all -> 0x003a }
    L_0x0009:
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        goto L_0x003d;
    L_0x000b:
        r0 = 0;
        r1 = r4.f19601c;	 Catch:{ m -> 0x0030 }
        if (r1 == 0) goto L_0x0027;	 Catch:{ m -> 0x0030 }
    L_0x0010:
        r1 = r5.mo7579g();	 Catch:{ m -> 0x0030 }
        r2 = r4.f19601c;	 Catch:{ m -> 0x0030 }
        r3 = r4.f19602d;	 Catch:{ m -> 0x0030 }
        r1 = r1.mo5369a(r2, r3);	 Catch:{ m -> 0x0030 }
        r1 = (com.google.android.m4b.maps.ct.C6656q) r1;	 Catch:{ m -> 0x0030 }
        r4.f19600a = r1;	 Catch:{ m -> 0x0030 }
        r1 = r4.f19601c;	 Catch:{ m -> 0x0030 }
        r4.f19603e = r1;	 Catch:{ m -> 0x0030 }
        r4.f19601c = r0;	 Catch:{ m -> 0x0030 }
        goto L_0x0038;	 Catch:{ m -> 0x0030 }
    L_0x0027:
        r4.f19600a = r5;	 Catch:{ m -> 0x0030 }
        r1 = com.google.android.m4b.maps.ct.C5255d.f19541a;	 Catch:{ m -> 0x0030 }
        r4.f19603e = r1;	 Catch:{ m -> 0x0030 }
        r4.f19601c = r0;	 Catch:{ m -> 0x0030 }
        goto L_0x0038;
    L_0x0030:
        r4.f19600a = r5;	 Catch:{ all -> 0x003a }
        r5 = com.google.android.m4b.maps.ct.C5255d.f19541a;	 Catch:{ all -> 0x003a }
        r4.f19603e = r5;	 Catch:{ all -> 0x003a }
        r4.f19601c = r0;	 Catch:{ all -> 0x003a }
    L_0x0038:
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        goto L_0x003d;	 Catch:{ all -> 0x003a }
    L_0x003a:
        r5 = move-exception;	 Catch:{ all -> 0x003a }
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        throw r5;
    L_0x003d:
        r5 = r4.f19600a;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ct.o.a(com.google.android.m4b.maps.ct.q):com.google.android.m4b.maps.ct.q");
    }

    /* renamed from: a */
    public final void m23422a(C5255d c5255d, C5262h c5262h) {
        if (c5262h == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        } else if (c5255d == null) {
            throw new NullPointerException("found null ByteString");
        } else {
            this.f19601c = c5255d;
            this.f19602d = c5262h;
            this.f19600a = null;
            this.f19603e = null;
        }
    }
}
