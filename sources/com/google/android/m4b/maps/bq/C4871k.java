package com.google.android.m4b.maps.bq;

import android.util.Log;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bs.C4904l;
import com.google.android.m4b.maps.bs.C6538c;
import java.io.File;
import java.util.Locale;

/* renamed from: com.google.android.m4b.maps.bq.k */
public final class C4871k {
    /* renamed from: a */
    C4904l f17880a;
    /* renamed from: b */
    C6538c f17881b;
    /* renamed from: c */
    private volatile boolean f17882c;
    /* renamed from: d */
    private int f17883d = -1;
    /* renamed from: e */
    private final boolean f17884e;
    /* renamed from: f */
    private Locale f17885f;
    /* renamed from: g */
    private final String f17886g;
    /* renamed from: h */
    private File f17887h;

    public C4871k(String str, C4904l c4904l, C6538c c6538c, boolean z, Locale locale, File file) {
        this.f17886g = str;
        this.f17880a = c4904l;
        this.f17881b = c6538c;
        this.f17884e = z;
        this.f17885f = locale;
        this.f17887h = file;
    }

    /* renamed from: a */
    final void m21822a() {
        if (!(this.f17881b == null || this.f17881b.mo7089a(this.f17887h))) {
            if (C4728u.m21050a(this.f17886g, 3)) {
                Log.d(this.f17886g, "Unable to init disk cache");
            }
            this.f17881b = null;
        }
        if (this.f17881b != null) {
            if (!this.f17885f.equals(this.f17881b.mo7094d())) {
                this.f17881b.mo7090a(this.f17885f);
            }
            this.f17882c = true;
        }
        synchronized (this) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final com.google.android.m4b.maps.bs.C6538c m21824b() {
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
        r0 = r1.f17881b;
        if (r0 == 0) goto L_0x0025;
    L_0x0004:
        r0 = r1.f17882c;
        if (r0 != 0) goto L_0x0025;
    L_0x0008:
        monitor-enter(r1);
    L_0x0009:
        r0 = r1.f17881b;	 Catch:{ InterruptedException -> 0x0019 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ InterruptedException -> 0x0019 }
    L_0x000d:
        r0 = r1.f17882c;	 Catch:{ InterruptedException -> 0x0019 }
        if (r0 != 0) goto L_0x0015;	 Catch:{ InterruptedException -> 0x0019 }
    L_0x0011:
        r1.wait();	 Catch:{ InterruptedException -> 0x0019 }
        goto L_0x0009;
    L_0x0015:
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
        goto L_0x0025;	 Catch:{ all -> 0x0017 }
    L_0x0017:
        r0 = move-exception;	 Catch:{ all -> 0x0017 }
        goto L_0x0023;	 Catch:{ all -> 0x0017 }
    L_0x0019:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0017 }
        r0.interrupt();	 Catch:{ all -> 0x0017 }
        r0 = 0;	 Catch:{ all -> 0x0017 }
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
        return r0;	 Catch:{ all -> 0x0017 }
    L_0x0023:
        monitor-exit(r1);	 Catch:{ all -> 0x0017 }
        throw r0;
    L_0x0025:
        r0 = r1.f17881b;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bq.k.b():com.google.android.m4b.maps.bs.c");
    }

    /* renamed from: c */
    protected final void m21825c() {
        if (this.f17880a != null) {
            this.f17880a.mo5154a();
        }
        C6538c b = m21824b();
        if (b != null && !b.mo5154a()) {
            b.mo7095e();
            if (C4728u.m21050a(this.f17886g, 6)) {
                Log.e(this.f17886g, "Unable to clear disk cache");
            }
            this.f17881b = null;
        }
    }

    /* renamed from: d */
    final int m21826d() {
        C6538c b = m21824b();
        if (b != null) {
            return b.mo7093c();
        }
        return this.f17883d;
    }

    /* renamed from: a */
    final boolean m21823a(int i) {
        C6538c b = m21824b();
        if (!(b == null || b.mo7088a(i))) {
            b = null;
        }
        this.f17883d = i;
        if (this.f17884e == 0) {
            return false;
        }
        if (b != null) {
            b.mo5154a();
        }
        if (this.f17880a != 0) {
            this.f17880a.mo5154a();
        }
        return true;
    }

    /* renamed from: e */
    final boolean m21827e() {
        return this.f17884e;
    }
}
