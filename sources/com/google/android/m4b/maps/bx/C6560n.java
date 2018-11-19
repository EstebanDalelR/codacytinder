package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.Format;
import com.google.android.m4b.maps.ba.C4742a;
import com.google.android.m4b.maps.p113m.C5475a;

/* renamed from: com.google.android.m4b.maps.bx.n */
public final class C6560n implements aj {
    /* renamed from: a */
    final C5013b f24501a;
    /* renamed from: b */
    private final int f24502b;
    /* renamed from: c */
    private int f24503c;
    /* renamed from: d */
    private long f24504d;
    /* renamed from: e */
    private int f24505e;
    /* renamed from: f */
    private boolean f24506f;
    /* renamed from: g */
    private boolean f24507g;
    /* renamed from: h */
    private boolean f24508h;
    /* renamed from: i */
    private int f24509i;
    /* renamed from: j */
    private int f24510j;
    /* renamed from: k */
    private int f24511k;
    /* renamed from: l */
    private C5012a f24512l;
    /* renamed from: m */
    private boolean f24513m = false;

    /* renamed from: com.google.android.m4b.maps.bx.n$a */
    class C5012a extends Thread {
        /* renamed from: a */
        private volatile boolean f18506a = true;
        /* renamed from: b */
        private volatile int f18507b = this.f18511f.f24502b;
        /* renamed from: c */
        private volatile boolean f18508c = false;
        /* renamed from: d */
        private boolean f18509d = false;
        /* renamed from: e */
        private long f18510e = Format.OFFSET_SAMPLE_RELATIVE;
        /* renamed from: f */
        private /* synthetic */ C6560n f18511f;

        public C5012a(C6560n c6560n) {
            this.f18511f = c6560n;
            super("RenderDrive");
        }

        public final void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
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
        L_0x0000:
            r0 = r6.f18506a;
            if (r0 == 0) goto L_0x0035;
        L_0x0004:
            r0 = 0;
            r6.f18508c = r0;	 Catch:{ InterruptedException -> 0x000d }
            r1 = r6.f18507b;	 Catch:{ InterruptedException -> 0x000d }
            r1 = (long) r1;	 Catch:{ InterruptedException -> 0x000d }
            com.google.android.m4b.maps.bx.C6560n.C5012a.sleep(r1);	 Catch:{ InterruptedException -> 0x000d }
        L_0x000d:
            r1 = r6.f18508c;
            if (r1 != 0) goto L_0x0004;
        L_0x0011:
            monitor-enter(r6);
            r1 = r6.f18509d;	 Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0020;	 Catch:{ all -> 0x0032 }
        L_0x0016:
            r1 = r6.f18510e;	 Catch:{ all -> 0x0032 }
            r3 = android.os.SystemClock.uptimeMillis();	 Catch:{ all -> 0x0032 }
            r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ all -> 0x0032 }
            if (r5 > 0) goto L_0x0030;	 Catch:{ all -> 0x0032 }
        L_0x0020:
            r6.f18509d = r0;	 Catch:{ all -> 0x0032 }
            r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;	 Catch:{ all -> 0x0032 }
            r6.f18510e = r0;	 Catch:{ all -> 0x0032 }
            r0 = r6.f18511f;	 Catch:{ all -> 0x0032 }
            r0 = r0.f24501a;	 Catch:{ all -> 0x0032 }
            r0.mo5233p();	 Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r6);	 Catch:{ all -> 0x0032 }
            goto L_0x0000;	 Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception;	 Catch:{ all -> 0x0032 }
            monitor-exit(r6);	 Catch:{ all -> 0x0032 }
            throw r0;
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.n.a.run():void");
        }

        /* renamed from: a */
        public final synchronized void m22399a() {
            this.f18511f.f24501a.mo5233p();
        }

        /* renamed from: b */
        public final void m22402b() {
            this.f18506a = false;
            interrupt();
        }

        /* renamed from: a */
        public final void m22400a(int i) {
            if (this.f18507b != i && i > 15) {
                this.f18507b = i;
                this.f18508c = true;
                interrupt();
            }
        }

        /* renamed from: c */
        public final int m22403c() {
            return this.f18507b;
        }

        /* renamed from: d */
        public final void m22404d() {
            m22405e();
            interrupt();
        }

        /* renamed from: e */
        public final synchronized void m22405e() {
            if (this.f18511f.f24501a != null) {
                this.f18511f.f24501a.mo5234q();
            }
            this.f18509d = true;
        }

        /* renamed from: a */
        public final synchronized void m22401a(long j) {
            this.f18510e = j;
        }

        /* renamed from: f */
        public final synchronized long m22406f() {
            return this.f18510e;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.n$b */
    public interface C5013b {
        /* renamed from: p */
        void mo5233p();

        /* renamed from: q */
        void mo5234q();
    }

    public C6560n(Context context, C5013b c5013b) {
        boolean z = false;
        if (!(context == null || C5475a.m23830a(context) == null)) {
            z = true;
        }
        context = z ? 30 : C4742a.m21084a() != null ? 60 : 50;
        this.f24502b = AdError.NETWORK_ERROR_CODE / context;
        m29081c(this.f24502b);
        this.f24501a = c5013b;
    }

    /* renamed from: a */
    public final boolean m29086a(int i) {
        i += this.f24503c;
        if (this.f24503c != 0) {
            if (i > 35000) {
                return false;
            }
        }
        this.f24503c = i;
        return true;
    }

    /* renamed from: b */
    public final void m29088b(int i) {
        this.f24503c += i;
    }

    /* renamed from: a */
    public final void m29082a() {
        this.f24503c = 0;
        this.f24504d = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void m29084a(boolean z) {
        this.f24506f = z;
    }

    /* renamed from: b */
    public final void m29089b(boolean z) {
        this.f24507g = z;
    }

    /* renamed from: c */
    public final synchronized void m29090c() {
        this.f24508h = true;
        if (this.f24512l != null) {
            this.f24512l.m22404d();
        }
    }

    /* renamed from: c */
    private void m29081c(int i) {
        this.f24505e = Math.max(this.f24502b, i);
    }

    /* renamed from: a */
    public final void mo5221a(boolean z, boolean z2) {
        synchronized (this) {
            if (z) {
                m29091c(true);
            }
            if (this.f24512l) {
                if (z2) {
                    this.f24512l.m22404d();
                }
                this.f24512l.m22405e();
            }
        }
    }

    /* renamed from: d */
    public final void m29092d() {
        synchronized (this) {
            if (this.f24512l != null) {
                this.f24512l.m22399a();
            } else {
                this.f24501a.mo5233p();
            }
        }
    }

    /* renamed from: e */
    public final void m29093e() {
        synchronized (this) {
            this.f24512l = new C5012a(this);
            this.f24512l.start();
        }
    }

    /* renamed from: f */
    public final void m29094f() {
        synchronized (this) {
            if (this.f24512l != null) {
                this.f24512l.m22402b();
                this.f24512l = null;
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m29091c(boolean z) {
        this.f24513m = true;
    }

    /* renamed from: g */
    public final synchronized boolean m29095g() {
        boolean z;
        z = this.f24513m;
        this.f24513m = false;
        return z;
    }

    /* renamed from: a */
    public final void m29083a(long j) {
        synchronized (this) {
            if (this.f24512l != null) {
                this.f24512l.m22401a(j);
            }
        }
    }

    /* renamed from: h */
    public final boolean m29096h() {
        synchronized (this) {
            C5012a c5012a = this.f24512l;
        }
        if (c5012a != null) {
            if (!c5012a.f18509d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m29087b() {
        int elapsedRealtime = ((int) (SystemClock.elapsedRealtime() - this.f24504d)) + 5;
        int i = this.f24506f ? this.f24502b : this.f24505e;
        if (this.f24507g) {
            i += 500;
        }
        i = Math.max(i, 15);
        synchronized (this) {
            if (this.f24512l != null) {
                this.f24512l.m22403c();
                if (this.f24508h) {
                    this.f24512l.m22404d();
                    this.f24508h = false;
                } else {
                    if (this.f24506f) {
                        this.f24512l.m22405e();
                    } else if (this.f24512l.m22406f() != Format.OFFSET_SAMPLE_RELATIVE) {
                        i = (int) (this.f24512l.m22406f() - SystemClock.uptimeMillis());
                    }
                    this.f24512l.m22400a(i);
                }
            }
        }
        if (!this.f24507g && !this.f24506f) {
            this.f24509i += elapsedRealtime;
            this.f24510j += i;
            elapsedRealtime = this.f24511k + 1;
            this.f24511k = elapsedRealtime;
            if (elapsedRealtime == 20) {
                float f = ((float) (this.f24510j - this.f24509i)) / ((float) this.f24510j);
                if (f < 0.23000002f) {
                    m29081c((int) (((float) this.f24505e) * 1.1f));
                } else if (f > 0.37f) {
                    m29081c((int) (((float) this.f24505e) * 0.9f));
                }
                this.f24511k = 0;
                this.f24509i = 0;
                this.f24510j = 0;
            }
        }
    }
}
