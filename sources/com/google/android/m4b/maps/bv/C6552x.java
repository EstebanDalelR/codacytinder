package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.Matrix;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.bv.C4952u.C4951c;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.bw;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.concurrent.Semaphore;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bv.x */
final class C6552x extends Thread implements Callback, C4951c {
    /* renamed from: a */
    private static final double f24362a = Math.tan((double) bp.m23007o(45.0f));
    /* renamed from: b */
    private static final Semaphore f24363b = new Semaphore(1);
    /* renamed from: A */
    private boolean f24364A;
    /* renamed from: B */
    private C4935k f24365B;
    /* renamed from: C */
    private boolean f24366C;
    /* renamed from: D */
    private volatile boolean f24367D;
    /* renamed from: E */
    private ag f24368E = null;
    /* renamed from: F */
    private ag f24369F = null;
    /* renamed from: G */
    private String f24370G = null;
    /* renamed from: H */
    private C4963i f24371H;
    /* renamed from: I */
    private C4962h f24372I;
    /* renamed from: J */
    private final ai f24373J;
    /* renamed from: K */
    private final C4952u f24374K;
    /* renamed from: c */
    private Context f24375c;
    /* renamed from: d */
    private SurfaceHolder f24376d;
    /* renamed from: e */
    private boolean f24377e;
    /* renamed from: f */
    private EGL10 f24378f;
    /* renamed from: g */
    private EGLContext f24379g;
    /* renamed from: h */
    private EGLDisplay f24380h;
    /* renamed from: i */
    private EGLSurface f24381i;
    /* renamed from: j */
    private EGLConfig f24382j;
    /* renamed from: k */
    private GL10 f24383k;
    /* renamed from: l */
    private boolean f24384l;
    /* renamed from: m */
    private boolean f24385m;
    /* renamed from: n */
    private bw f24386n;
    /* renamed from: o */
    private af f24387o;
    /* renamed from: p */
    private C4944q f24388p;
    /* renamed from: q */
    private C4957c f24389q;
    /* renamed from: r */
    private C4954w f24390r;
    /* renamed from: s */
    private C7474p f24391s;
    /* renamed from: t */
    private C4960f f24392t;
    /* renamed from: u */
    private int f24393u;
    /* renamed from: v */
    private C4961g f24394v;
    /* renamed from: w */
    private int f24395w;
    /* renamed from: x */
    private int f24396x;
    /* renamed from: y */
    private int f24397y;
    /* renamed from: z */
    private C4956b f24398z;

    /* renamed from: com.google.android.m4b.maps.bv.x$a */
    static class C4955a {
        /* renamed from: a */
        C4955a f18310a;
        /* renamed from: b */
        int f18311b;
        /* renamed from: c */
        int f18312c;
        /* renamed from: d */
        int f18313d;
        /* renamed from: e */
        Object f18314e;

        C4955a() {
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$b */
    static class C4956b {
        /* renamed from: a */
        C4955a f18315a;
        /* renamed from: b */
        C4955a f18316b;
        /* renamed from: c */
        C4955a f18317c;

        private C4956b() {
        }

        /* renamed from: a */
        final boolean m22210a() {
            return this.f18316b == null;
        }

        /* renamed from: a */
        final void m22209a(int i, int i2, int i3, Object obj) {
            C4955a c4955a = this.f18315a;
            if (c4955a != null) {
                this.f18315a = c4955a.f18310a;
                c4955a.f18310a = null;
            } else {
                c4955a = new C4955a();
            }
            c4955a.f18311b = i;
            c4955a.f18312c = i2;
            c4955a.f18313d = i3;
            c4955a.f18314e = obj;
            if (this.f18317c == 0) {
                this.f18317c = c4955a;
                this.f18316b = c4955a;
                return;
            }
            this.f18317c.f18310a = c4955a;
            this.f18317c = c4955a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$c */
    interface C4957c {
        /* renamed from: a */
        void mo7099a(C4944q c4944q, af afVar, int i, int i2);

        /* renamed from: a */
        void mo5202a(GL10 gl10, bw bwVar, C4960f c4960f, C4963i c4963i);
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$d */
    static class C4958d {
        /* renamed from: a */
        public final C4946s f18318a;
        /* renamed from: b */
        public final Bitmap f18319b;

        public C4958d(C4946s c4946s, Bitmap bitmap) {
            this.f18318a = c4946s;
            this.f18319b = bitmap;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$e */
    static class C4959e {
        /* renamed from: a */
        public final float f18320a;
        /* renamed from: b */
        public final float f18321b;
        /* renamed from: c */
        public final boolean f18322c;
        /* renamed from: d */
        public boolean f18323d;
        /* renamed from: e */
        public float[] f18324e;

        C4959e(float f, float f2, boolean z) {
            this.f18320a = f;
            this.f18321b = f2;
            this.f18322c = z;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$f */
    static class C4960f {
        /* renamed from: a */
        public float f18325a;
        /* renamed from: b */
        public int f18326b;

        C4960f() {
        }

        /* renamed from: a */
        public final void m22213a(float f) {
            this.f18326b++;
            this.f18325a += f;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$g */
    interface C4961g {
        /* renamed from: a */
        void mo5173a(int i);

        /* renamed from: b */
        void mo5188b(int i);
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$h */
    static class C4962h {
        /* renamed from: a */
        public final C4944q f18327a;

        public C4962h(C4944q c4944q) {
            this.f18327a = c4944q;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$i */
    public static class C4963i {
        /* renamed from: a */
        public final bw f18328a;
        /* renamed from: b */
        private float f18329b;
        /* renamed from: c */
        private float f18330c;
        /* renamed from: d */
        private float f18331d;
        /* renamed from: e */
        private float f18332e;
        /* renamed from: f */
        private final long f18333f = System.currentTimeMillis();
        /* renamed from: g */
        private final int f18334g = AdError.NETWORK_ERROR_CODE;

        public C4963i(float f, float f2, bw bwVar, int i) {
            this.f18329b = f;
            this.f18330c = f2;
            this.f18331d = f;
            this.f18332e = f2;
            this.f18328a = new bw(bwVar);
        }

        /* renamed from: b */
        public final boolean m22218b() {
            return this.f18333f + ((long) this.f18334g) < System.currentTimeMillis();
        }

        /* renamed from: a */
        public final boolean m22217a(C4922b c4922b) {
            float[] fArr = new float[2];
            bp.m22989a(this.f18329b, 0.0f, -this.f18330c, fArr);
            c4922b = c4922b.m22060a(fArr[0], fArr[1], null) * 0.9f;
            this.f18331d = this.f18329b;
            this.f18332e = this.f18330c;
            float sqrt = (float) Math.sqrt((double) ((this.f18329b * this.f18329b) + (this.f18330c * this.f18330c)));
            if (c4922b <= null || sqrt <= c4922b) {
                return false;
            }
            c4922b /= sqrt;
            this.f18331d *= c4922b;
            this.f18332e *= c4922b;
            return true;
        }

        /* renamed from: c */
        public final float m22219c() {
            return this.f18331d;
        }

        /* renamed from: d */
        public final float m22220d() {
            return this.f18332e;
        }

        /* renamed from: a */
        public final float m22216a() {
            return Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f18333f)) / ((float) this.f18334g));
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.x$j */
    static class C4964j {
        /* renamed from: a */
        public final float f18335a;
        /* renamed from: b */
        public final float f18336b;
        /* renamed from: c */
        public boolean f18337c;
        /* renamed from: d */
        public float[] f18338d;

        C4964j(float f, float f2) {
            this.f18335a = f;
            this.f18336b = f2;
        }
    }

    /* renamed from: c */
    private static boolean m28955c(float f) {
        return f >= 1.0f;
    }

    C6552x(C4952u c4952u, C6413m c6413m) {
        this.f24374K = c4952u;
        this.f24395w = 0;
        this.f24396x = 0;
        this.f24365B = new C4935k(true, 512, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        this.f24366C = true;
        this.f24392t = new C4960f();
        this.f24398z = new C4956b();
        this.f24390r = new C4954w();
        this.f24373J = new ai(c6413m);
    }

    /* renamed from: a */
    public static float m28941a(float f) {
        return C6552x.m28955c(f) ? bp.m23006n(((float) Math.atan(f24362a / ((double) f))) * 2.0f) : 90.0f;
    }

    /* renamed from: b */
    public static float m28952b(float f) {
        if (C6552x.m28955c(f)) {
            return 90.0f;
        }
        return bp.m23006n(((float) Math.atan(f24362a * ((double) f))) * 2.0f);
    }

    /* renamed from: a */
    public final void m28968a(ag agVar) {
        this.f24369F = agVar;
    }

    /* renamed from: a */
    public final void m28967a(android.content.Context r1, android.content.res.Resources r2, android.view.SurfaceHolder r3, com.google.android.m4b.maps.bv.C6552x.C4961g r4, android.view.View r5) {
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
        r0 = this;
        r0.f24375c = r1;
        r0.f24376d = r3;
        r1 = r0.f24376d;
        r1.addCallback(r0);
        r1 = new com.google.android.m4b.maps.bv.af;
        r3 = 17;
        r1.<init>(r3);
        r0.f24387o = r1;
        r0.f24394v = r4;
        r1 = 0;
        r0.f24389q = r1;
        r1 = r0.f24376d;
        r3 = 2;
        r1.setType(r3);
        r1 = new com.google.android.m4b.maps.bv.p;
        r3 = r0.f24375c;
        r4 = r0.f24390r;
        r1.<init>(r3, r2, r4, r5);
        r0.f24391s = r1;
        r1 = "Renderer";
        r0.setName(r1);
        r1 = 6;
        r0.setPriority(r1);
        r0.start();
        monitor-enter(r0);
    L_0x0035:
        r1 = r0.f24364A;	 Catch:{ all -> 0x003f }
        if (r1 != 0) goto L_0x003d;
    L_0x0039:
        r0.wait();	 Catch:{ InterruptedException -> 0x0035 }
        goto L_0x0035;
    L_0x003d:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        return;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r1 = move-exception;	 Catch:{ all -> 0x003f }
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.x.a(android.content.Context, android.content.res.Resources, android.view.SurfaceHolder, com.google.android.m4b.maps.bv.x$g, android.view.View):void");
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
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r11 = this;
        monitor-enter(r11);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r0 = 1;
        r11.f24364A = r0;	 Catch:{ all -> 0x0189 }
        r11.notifyAll();	 Catch:{ all -> 0x0189 }
        monitor-exit(r11);	 Catch:{ all -> 0x0189 }
        r1 = 0;
        r2 = r1;
    L_0x000a:
        r3 = r11.f24367D;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r3 != 0) goto L_0x0185;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x000e:
        r2 = r11.m28942a(r2);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r2 == 0) goto L_0x0175;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0014:
        r3 = r2.f18311b;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = 3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r5 = 2;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r6 = 0;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        switch(r3) {
            case 0: goto L_0x0155;
            case 1: goto L_0x014e;
            case 2: goto L_0x00f7;
            case 3: goto L_0x00ee;
            case 4: goto L_0x00e4;
            case 5: goto L_0x00d1;
            case 6: goto L_0x00ba;
            case 7: goto L_0x000e;
            case 8: goto L_0x00b5;
            case 9: goto L_0x00ae;
            case 10: goto L_0x00a5;
            case 11: goto L_0x0098;
            case 12: goto L_0x0091;
            case 13: goto L_0x008d;
            case 14: goto L_0x000e;
            case 15: goto L_0x0085;
            case 16: goto L_0x0031;
            case 17: goto L_0x000e;
            case 18: goto L_0x0028;
            case 19: goto L_0x0020;
            default: goto L_0x001c;
        };	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x001c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x015c;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0020:
        r3 = r2.f18314e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = (com.google.android.m4b.maps.bv.C6552x.C4964j) r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.m28949a(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0028:
        r3 = r2.f18314e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = (com.google.android.m4b.maps.bv.C6552x.C4963i) r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.f24371H = r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.f24372I = r1;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0031:
        r3 = r2.f18312c;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = java.lang.Float.intBitsToFloat(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r2.f18313d;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = java.lang.Float.intBitsToFloat(r7);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r8 = r11.f24388p;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r8 = r8.f18286z;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r8 == 0) goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0043:
        r8 = new com.google.android.m4b.maps.bv.x$e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r8.<init>(r3, r7, r6);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.m28947a(r8);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = new float[r5];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r11.f24388p;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9 = r8.f18324e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9 = r9[r6];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r8 = r8.f18324e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r8 = r8[r0];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7.m22175a(r9, r8, r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = new float[r4];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r11.f24388p;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r7.f18286z;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7.m22063a();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r11.f24388p;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r7.f18286z;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r8 = r3[r6];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9 = r3[r0];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7.m22060a(r8, r9, r4);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r11.f24388p;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r7.f18286z;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r8 = r3[r6];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = r3[r0];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7.m22067c(r8, r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = r11.f24388p;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r6 = r4[r6];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r4[r0];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r5 = r4[r5];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3.m22174a(r6, r7, r5, r4);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0085:
        r3 = r2.f18314e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = (com.google.android.m4b.maps.bv.C6552x.C4959e) r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.m28947a(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x008d:
        r11.f24367D = r0;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0091:
        r3 = r2.f18314e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        com.google.android.m4b.maps.bv.C6552x.m28950a(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0098:
        r3 = r2.f18312c;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = r11.f24391s;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r5 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4.m32388a(r3, r5);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00a5:
        r3 = r2.f18312c;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = r11.f24391s;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4.m32402f(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00ae:
        r11.m28959h();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.f24384l = r0;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00b5:
        r11.m28960i();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00ba:
        r3 = r2.f18314e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = (com.google.android.m4b.maps.bv.C6552x.C4958d) r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = r3.f18318a;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = r3.f18319b;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r5 = r11.f24387o;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r5 = r5.m22104a(r4);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r5 != 0) goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00ca:
        r5 = r11.f24387o;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r5.m28930a(r4, r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00d1:
        r3 = r2.f18314e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = (com.google.android.m4b.maps.cg.bw) r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = r11.f24371H;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r4 != 0) goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00d9:
        r11.f24386n = r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = r11.f24373J;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = r11.f24386n;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3.m22047a(r4);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00e4:
        r3 = r2.f18312c;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = r11.f24371H;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r4 != 0) goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00ea:
        r11.f24397y = r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00ee:
        r3 = r2.f18314e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = (com.google.android.m4b.maps.bv.C6552x.C4962h) r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.m28948a(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00f7:
        r3 = r2.f18312c;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r7 = r2.f18313d;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r8 = r11.f24395w;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r8 != 0) goto L_0x0105;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x00ff:
        r8 = r11.f24396x;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r8 != 0) goto L_0x0105;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0103:
        r8 = 1;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x0106;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0105:
        r8 = 0;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0106:
        if (r8 != 0) goto L_0x0136;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0108:
        r8 = "Window changed size: %d,%d -> %d,%d Recreating OpenGL surface";	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9 = 4;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9 = new java.lang.Object[r9];	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r10 = r11.f24395w;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9[r6] = r10;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r6 = r11.f24396x;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9[r0] = r6;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r6 = java.lang.Integer.valueOf(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9[r5] = r6;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r5 = java.lang.Integer.valueOf(r7);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r9[r4] = r5;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = java.lang.String.format(r8, r9);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        com.google.android.m4b.maps.bv.ac.m22036a(r4);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.m28961j();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.m28961j();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0136:
        r11.f24395w = r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.f24396x = r7;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.f24384l = r0;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = r11.f24395w;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = (float) r3;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = r11.f24396x;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = (float) r4;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = r3 / r4;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = com.google.android.m4b.maps.bv.C6552x.m28952b(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4 = r11.f24373J;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r4.m22045a(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x014e:
        r11.m28960i();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.f24377e = r6;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0155:
        r11.f24377e = r0;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.m28959h();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000e;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x015c:
        r1 = r2.f18311b;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r2 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = 30;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r2.<init>(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r3 = "Unknown message id ";	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r2.append(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r2.append(r1);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r1 = r2.toString();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        throw r0;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0175:
        r3 = r11.f24379g;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        if (r3 == 0) goto L_0x0180;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0179:
        r3 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        r11.m28946a(r3);	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x0180:
        r11.m28957f();	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
        goto L_0x000a;
    L_0x0185:
        r11.m28958g();
        return;
    L_0x0189:
        r0 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0189 }
        throw r0;	 Catch:{ InterruptedException -> 0x0191, all -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        r11.m28958g();
        throw r0;
    L_0x0191:
        r11.m28958g();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.x.run():void");
    }

    /* renamed from: a */
    private C4955a m28942a(C4955a c4955a) {
        C4955a c4955a2;
        synchronized (this.f24398z) {
            if (c4955a != null) {
                C4956b c4956b = this.f24398z;
                c4955a.f18310a = c4956b.f18315a;
                c4955a.f18314e = null;
                c4956b.f18315a = c4955a;
            }
            c4955a = this.f24398z;
            c4955a2 = c4955a.f18316b;
            if (c4955a2 != null) {
                c4955a.f18316b = c4955a2.f18310a;
                c4955a2.f18310a = null;
                if (c4955a.f18316b == null) {
                    c4955a.f18317c = null;
                }
            }
        }
        return c4955a2;
    }

    /* renamed from: f */
    private void m28957f() {
        if (this.f24371H == null) {
            synchronized (this.f24398z) {
                while (this.f24398z.m22210a()) {
                    long b = this.f24379g == null ? 0 : this.f24391s.m32396b();
                    if (b != 0) {
                        long currentTimeMillis = b - System.currentTimeMillis();
                        if (currentTimeMillis <= 0) {
                            break;
                        }
                        this.f24398z.wait(currentTimeMillis);
                    } else {
                        this.f24398z.wait();
                    }
                }
            }
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        m28956e(null);
    }

    public final void surfaceDestroyed(android.view.SurfaceHolder r2) {
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
        r2 = 1;
        r1.m28956e(r2);
        r2 = r1.f24367D;	 Catch:{ InterruptedException -> 0x0020 }
        if (r2 == 0) goto L_0x000c;	 Catch:{ InterruptedException -> 0x0020 }
    L_0x0008:
        r1.join();	 Catch:{ InterruptedException -> 0x0020 }
        goto L_0x0020;	 Catch:{ InterruptedException -> 0x0020 }
    L_0x000c:
        r2 = new java.lang.Integer;	 Catch:{ InterruptedException -> 0x0020 }
        r0 = 0;	 Catch:{ InterruptedException -> 0x0020 }
        r2.<init>(r0);	 Catch:{ InterruptedException -> 0x0020 }
        monitor-enter(r2);	 Catch:{ InterruptedException -> 0x0020 }
        r0 = 12;
        r1.m28945a(r0, r2);	 Catch:{ all -> 0x001d }
        r2.wait();	 Catch:{ all -> 0x001d }
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        goto L_0x0020;	 Catch:{ all -> 0x001d }
    L_0x001d:
        r0 = move-exception;	 Catch:{ all -> 0x001d }
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;	 Catch:{ InterruptedException -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.x.surfaceDestroyed(android.view.SurfaceHolder):void");
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        m28943a(2, i2, i3);
    }

    /* renamed from: a */
    public final void m28969a(C4944q c4944q) {
        m28954b(3, new C4962h(c4944q));
    }

    /* renamed from: a */
    public final void m28972a(bw bwVar) {
        m28954b(5, (Object) bwVar);
    }

    /* renamed from: a */
    public final void m28971a(C4963i c4963i) {
        m28954b(18, (Object) c4963i);
    }

    /* renamed from: a */
    public final void m28966a(int i) {
        m28953b(4, i);
    }

    /* renamed from: a */
    public final void mo5206a(C4946s c4946s, Bitmap bitmap) {
        m28945a(6, new C4958d(c4946s, bitmap));
    }

    /* renamed from: a */
    public final void m28964a() {
        m28956e(8);
    }

    /* renamed from: b */
    public final void m28975b() {
        m28956e(7);
    }

    /* renamed from: c */
    public final void m28979c() {
        m28956e(9);
    }

    /* renamed from: b */
    public final void m28976b(int i) {
        m28953b(10, i);
    }

    /* renamed from: c */
    public final void m28980c(int i) {
        m28953b(11, i);
    }

    /* renamed from: a */
    public final void m28965a(float f, float f2) {
        m28943a(14, -1, -1);
    }

    /* renamed from: a */
    public final int m28963a(int i, int i2) {
        return this.f24391s.m32399c(i, (this.f24396x - 1) - i2);
    }

    /* renamed from: a */
    public final float[] m28974a(float r2, float r3, boolean r4) {
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
        r1.m28962k();
        r4 = new com.google.android.m4b.maps.bv.x$e;
        r0 = 0;
        r4.<init>(r2, r3, r0);
        monitor-enter(r4);
        r2 = 15;
        r1.m28945a(r2, r4);	 Catch:{ all -> 0x001a }
    L_0x000f:
        r4.wait();	 Catch:{ InterruptedException -> 0x0012 }
    L_0x0012:
        r2 = r4.f18323d;	 Catch:{ all -> 0x001a }
        if (r2 == 0) goto L_0x000f;	 Catch:{ all -> 0x001a }
    L_0x0016:
        monitor-exit(r4);	 Catch:{ all -> 0x001a }
        r2 = r4.f18324e;
        return r2;
    L_0x001a:
        r2 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x001a }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.x.a(float, float, boolean):float[]");
    }

    /* renamed from: b */
    public final float[] m28978b(float r2, float r3) {
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
        r1.m28962k();
        r0 = new com.google.android.m4b.maps.bv.x$j;
        r0.<init>(r2, r3);
        monitor-enter(r0);
        r2 = 19;
        r1.m28945a(r2, r0);	 Catch:{ all -> 0x0019 }
    L_0x000e:
        r0.wait();	 Catch:{ InterruptedException -> 0x0011 }
    L_0x0011:
        r2 = r0.f18337c;	 Catch:{ all -> 0x0019 }
        if (r2 == 0) goto L_0x000e;	 Catch:{ all -> 0x0019 }
    L_0x0015:
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        r2 = r0.f18338d;
        return r2;
    L_0x0019:
        r2 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.x.b(float, float):float[]");
    }

    /* renamed from: d */
    public final C4948t m28981d(int i) {
        return this.f24391s.m32401e(i);
    }

    /* renamed from: g */
    private void m28958g() {
        m28960i();
        this.f24376d.removeCallback(this);
    }

    /* renamed from: a */
    private void m28947a(C4959e c4959e) {
        float[] fArr = null;
        if (this.f24386n != null) {
            float[] fArr2;
            this.f24390r.m22204a(this.f24383k);
            if (c4959e.f18322c) {
                fArr2 = new float[16];
                Matrix.multiplyMM(fArr2, 0, this.f24386n.m23048a(), 0, this.f24388p.m22179d(), 0);
                Matrix.rotateM(fArr2, 0, -this.f24388p.f18280t, 0.0f, 1.0f, 0.0f);
            } else {
                fArr2 = this.f24386n.m23048a();
            }
            float[] fArr3 = fArr2;
            fArr2 = new float[4];
            this.f24390r.m22208b(new float[]{c4959e.f18320a, ((float) this.f24396x) - c4959e.f18321b, 1.0f}, 0, fArr3, fArr2, 0);
            float[] fArr4 = new float[2];
            bp.m22989a(fArr2[0], fArr2[1], fArr2[2], fArr4);
            if (!c4959e.f18322c) {
                fArr4[0] = bp.m22991b(fArr4[0] + 0.5f);
            }
            if (!Float.isNaN(fArr4[0])) {
                if (!Float.isNaN(fArr4[1])) {
                    fArr = fArr4;
                }
            }
        }
        c4959e.f18324e = fArr;
        synchronized (c4959e) {
            c4959e.f18323d = true;
            c4959e.notify();
        }
    }

    /* renamed from: a */
    private void m28949a(C4964j c4964j) {
        float[] fArr = null;
        if (this.f24386n != null) {
            float[] fArr2 = new float[3];
            bp.m22990a(bp.m22991b(c4964j.f18335a - 0.5f), c4964j.f18336b, fArr2, 0);
            this.f24390r.m22204a(this.f24383k);
            float[] fArr3 = new float[4];
            this.f24390r.m22206a(fArr2, 0, this.f24386n.m23048a(), fArr3, 0);
            if (!(Float.isNaN(fArr3[0]) || Float.isNaN(fArr3[1]))) {
                if (fArr3[2] <= 1.0f) {
                    fArr = new float[]{fArr3[0], (float) (this.f24396x - ((int) fArr3[1]))};
                }
            }
        }
        c4964j.f18338d = fArr;
        synchronized (c4964j) {
            c4964j.f18337c = true;
            c4964j.notify();
        }
    }

    /* renamed from: e */
    private final void m28956e(int i) {
        m28944a(i, 0, 0, null);
    }

    /* renamed from: b */
    private final void m28954b(int i, Object obj) {
        m28944a(i, 0, 0, obj);
    }

    /* renamed from: b */
    private final void m28953b(int i, int i2) {
        m28944a(i, i2, 0, null);
    }

    /* renamed from: a */
    private final void m28943a(int i, int i2, int i3) {
        m28944a(i, i2, i3, null);
    }

    /* renamed from: a */
    private final void m28944a(int i, int i2, int i3, Object obj) {
        synchronized (this.f24398z) {
            if (this.f24398z.m22210a()) {
                this.f24398z.notify();
            }
            C4956b c4956b = this.f24398z;
            C4955a c4955a = c4956b.f18317c;
            if (c4955a == null || c4955a.f18311b != i) {
                c4956b.m22209a(i, i2, i3, obj);
            } else {
                c4955a.f18312c = i2;
                c4955a.f18313d = i3;
                c4955a.f18314e = obj;
            }
        }
    }

    /* renamed from: h */
    private void m28959h() {
        if (this.f24379g == null && this.f24377e) {
            f24363b.acquire();
            this.f24378f = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = this.f24378f.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f24378f.eglInitialize(eglGetDisplay, new int[2]);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            this.f24378f.eglChooseConfig(eglGetDisplay, new int[]{12325, 16, 12344}, eGLConfigArr, 1, new int[1]);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eglCreateContext = this.f24378f.eglCreateContext(eglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, null);
            this.f24380h = eglGetDisplay;
            this.f24382j = eGLConfig;
            this.f24379g = eglCreateContext;
            if (m28951a(this.f24378f)) {
                this.f24383k = null;
                f24363b.release();
                return;
            }
            this.f24383k = (GL10) eglCreateContext.getGL();
            this.f24383k = new C4923c(this.f24383k);
            GL10 gl10 = this.f24383k;
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eGLDisplay = this.f24380h;
            this.f24381i = egl10.eglCreateWindowSurface(eGLDisplay, this.f24382j, this.f24376d, null);
            egl10.eglMakeCurrent(eGLDisplay, this.f24381i, this.f24381i, this.f24379g);
            this.f24387o.m28932a(gl10);
            this.f24365B.m22113a(gl10);
            this.f24366C = true;
            gl10.glDisable(2929);
            gl10.glDisable(3089);
            gl10.glDisable(3024);
            gl10.glDisable(2896);
            gl10.glDisable(3042);
            gl10.glHint(3152, 4354);
            gl10.glShadeModel(7424);
            gl10.glDisable(2884);
            gl10.glFrontFace(2305);
            gl10.glDepthFunc(515);
        }
    }

    /* renamed from: a */
    private boolean m28951a(EGL10 egl10) {
        if (egl10.eglGetError() == 12288) {
            return false;
        }
        ac.m22036a(String.format("EGL error: %d", new Object[]{Integer.valueOf(egl10.eglGetError())}));
        this.f24383k = null;
        return true;
    }

    /* renamed from: i */
    private void m28960i() {
        EGLContext eGLContext = this.f24379g;
        GL10 gl10 = this.f24383k;
        EGLDisplay eGLDisplay = this.f24380h;
        EGLSurface eGLSurface = this.f24381i;
        if (eGLContext != null) {
            this.f24387o.m28929a();
            this.f24365B.m22116b(gl10);
            this.f24391s.m32393a(gl10);
            if (eGLDisplay != null) {
                this.f24378f.eglMakeCurrent(eGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                this.f24378f.eglDestroyContext(eGLDisplay, eGLContext);
                if (eGLSurface != null) {
                    this.f24378f.eglDestroySurface(eGLDisplay, eGLSurface);
                }
                this.f24378f.eglTerminate(eGLDisplay);
            }
            this.f24378f = null;
            this.f24379g = null;
            f24363b.release();
        }
    }

    /* renamed from: j */
    private void m28961j() {
        EGL10 egl10 = this.f24378f;
        if (egl10 != null) {
            EGLDisplay eGLDisplay = this.f24380h;
            EGLSurface eGLSurface = this.f24381i;
            egl10.eglMakeCurrent(eGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
            this.f24381i = egl10.eglCreateWindowSurface(eGLDisplay, this.f24382j, this.f24376d, null);
            egl10.eglMakeCurrent(eGLDisplay, this.f24381i, this.f24381i, this.f24379g);
            m28951a(egl10);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private synchronized void m28948a(com.google.android.m4b.maps.bv.C6552x.C4962h r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f24371H;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0009;
    L_0x0005:
        r2.f24372I = r3;	 Catch:{ all -> 0x0032 }
        monitor-exit(r2);
        return;
    L_0x0009:
        r0 = r2.f24388p;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x001a;
    L_0x000d:
        r0 = r2.f24388p;	 Catch:{ all -> 0x0032 }
        r0 = r0.f18286z;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x001a;
    L_0x0013:
        r0 = r2.f24388p;	 Catch:{ all -> 0x0032 }
        r0 = r0.f18286z;	 Catch:{ all -> 0x0032 }
        r0.m22066b();	 Catch:{ all -> 0x0032 }
    L_0x001a:
        r3 = r3.f18327a;	 Catch:{ all -> 0x0032 }
        r2.f24388p = r3;	 Catch:{ all -> 0x0032 }
        r3 = 1;
        r2.f24385m = r3;	 Catch:{ all -> 0x0032 }
        r2.f24366C = r3;	 Catch:{ all -> 0x0032 }
        r3 = r2.f24388p;	 Catch:{ all -> 0x0032 }
        if (r3 == 0) goto L_0x0030;
    L_0x0027:
        r3 = r2.f24373J;	 Catch:{ all -> 0x0032 }
        r0 = r2.f24388p;	 Catch:{ all -> 0x0032 }
        r1 = r2.f24386n;	 Catch:{ all -> 0x0032 }
        r3.m22046a(r0, r1);	 Catch:{ all -> 0x0032 }
    L_0x0030:
        monitor-exit(r2);
        return;
    L_0x0032:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.x.a(com.google.android.m4b.maps.bv.x$h):void");
    }

    /* renamed from: a */
    private static void m28950a(Object obj) {
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* renamed from: a */
    private void m28946a(long j) {
        if (!(this.f24395w == 0 || this.f24396x == 0)) {
            if (this.f24379g != null) {
                int i = this.f24384l ? 2 : 1;
                for (int i2 = 0; i2 < i; i2++) {
                    GL10 gl10 = this.f24383k;
                    if (gl10 != null) {
                        Object obj;
                        int i3;
                        int i4;
                        bw bwVar;
                        C4960f c4960f;
                        int i5;
                        if (this.f24385m && this.f24388p != null) {
                            if (this.f24388p.f18278r != 1) {
                                this.f24389q = new ab(this.f24374K, this);
                            } else {
                                this.f24389q = new C7473a(this.f24374K, this);
                            }
                        }
                        if (!(this.f24388p == null || this.f24372I == null)) {
                            Object obj2;
                            boolean z;
                            obj = (this.f24371H == null || !this.f24371H.m22218b()) ? null : 1;
                            if (this.f24372I == null || this.f24372I.f18327a == null) {
                                obj2 = null;
                                z = false;
                            } else {
                                if (!this.f24372I.f18327a.f18276p) {
                                    for (C4946s a : this.f24372I.f18327a.f18279s) {
                                        if (this.f24387o.m22104a((Object) a) == null) {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                }
                                obj2 = 1;
                                z = this.f24372I.f18327a.f18262b;
                            }
                            obj = (obj == null || !(obj2 != null || z || this.f24372I == null || this.f24372I.f18327a == null)) ? null : 1;
                            if (obj != null) {
                                if (this.f24388p.f18286z != null) {
                                    this.f24388p.f18286z.m22066b();
                                }
                                this.f24386n = this.f24371H.f18328a;
                                this.f24371H = null;
                                m28948a(this.f24372I);
                                this.f24372I = null;
                                obj = 1;
                                i3 = this.f24395w;
                                i4 = this.f24396x;
                                if ((this.f24384l || this.f24385m) && this.f24388p != null) {
                                    this.f24389q.mo7099a(this.f24388p, this.f24387o, i3, i4);
                                    this.f24390r.m22203a(0, 0, i3, i4);
                                    this.f24391s.m32391a(this.f24388p, i3, i4);
                                }
                                if (this.f24388p == null || r5 == null) {
                                    gl10.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                    gl10.glClear(16384);
                                    if (this.f24388p != null && ((this.f24388p == null || !this.f24388p.m22177b()) && this.f24386n != null)) {
                                        if (this.f24389q == null) {
                                            gl10.glViewport(0, 0, i3, i4);
                                            if (this.f24371H != null) {
                                                bwVar = this.f24386n;
                                            } else {
                                                bwVar = new bw(this.f24386n.m23049b() + (bp.m22992b(this.f24371H.f18328a.m23049b(), this.f24386n.m23049b()) * this.f24371H.m22216a()), this.f24386n.m23051c() + ((this.f24371H.f18328a.m23051c() - this.f24386n.m23051c()) * this.f24371H.m22216a()), 0.0f);
                                            }
                                            this.f24389q.mo5202a(gl10, bwVar, this.f24392t, this.f24371H);
                                            if (this.f24394v != null) {
                                                if (this.f24388p.m22178c()) {
                                                    c4960f = this.f24392t;
                                                    if (c4960f.f18326b != 0) {
                                                        i5 = 0;
                                                    } else {
                                                        i5 = (int) ((c4960f.f18325a * 10000.0f) / ((float) c4960f.f18326b));
                                                    }
                                                } else {
                                                    i5 = 10000;
                                                }
                                                if (i5 != this.f24393u) {
                                                    this.f24394v.mo5173a(i5);
                                                    this.f24393u = i5;
                                                }
                                            }
                                            if (this.f24371H == null) {
                                                this.f24391s.m32394a(gl10, this.f24386n, j);
                                            }
                                            if (this.f24388p.f18276p || !this.f24388p.f18277q) {
                                                this.f24394v.mo5188b(-2);
                                                this.f24388p.f18276p = false;
                                                this.f24388p.f18277q = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        obj = null;
                        i3 = this.f24395w;
                        i4 = this.f24396x;
                        this.f24389q.mo7099a(this.f24388p, this.f24387o, i3, i4);
                        this.f24390r.m22203a(0, 0, i3, i4);
                        this.f24391s.m32391a(this.f24388p, i3, i4);
                        if (this.f24388p == null) {
                        }
                        gl10.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                        gl10.glClear(16384);
                        if (this.f24389q == null) {
                            gl10.glViewport(0, 0, i3, i4);
                            if (this.f24371H != null) {
                                bwVar = new bw(this.f24386n.m23049b() + (bp.m22992b(this.f24371H.f18328a.m23049b(), this.f24386n.m23049b()) * this.f24371H.m22216a()), this.f24386n.m23051c() + ((this.f24371H.f18328a.m23051c() - this.f24386n.m23051c()) * this.f24371H.m22216a()), 0.0f);
                            } else {
                                bwVar = this.f24386n;
                            }
                            this.f24389q.mo5202a(gl10, bwVar, this.f24392t, this.f24371H);
                            if (this.f24394v != null) {
                                if (this.f24388p.m22178c()) {
                                    c4960f = this.f24392t;
                                    if (c4960f.f18326b != 0) {
                                        i5 = (int) ((c4960f.f18325a * 10000.0f) / ((float) c4960f.f18326b));
                                    } else {
                                        i5 = 0;
                                    }
                                } else {
                                    i5 = 10000;
                                }
                                if (i5 != this.f24393u) {
                                    this.f24394v.mo5173a(i5);
                                    this.f24393u = i5;
                                }
                            }
                            if (this.f24371H == null) {
                                this.f24391s.m32394a(gl10, this.f24386n, j);
                            }
                            if (!this.f24388p.f18276p) {
                            }
                            this.f24394v.mo5188b(-2);
                            this.f24388p.f18276p = false;
                            this.f24388p.f18277q = true;
                        }
                    }
                    this.f24366C = false;
                    this.f24384l = false;
                    this.f24385m = false;
                    ((EGL10) EGLContext.getEGL()).eglSwapBuffers(this.f24380h, this.f24381i);
                }
            }
        }
    }

    /* renamed from: k */
    private void m28962k() {
        if (this == Thread.currentThread()) {
            throw new IllegalStateException("This code can only be called outside the rendering thread.");
        }
    }

    /* renamed from: a */
    public final void m28973a(boolean z) {
        this.f24391s.m32395a(z);
    }

    /* renamed from: d */
    public final boolean m28982d() {
        return this.f24391s.m32400c();
    }

    /* renamed from: b */
    public final void m28977b(boolean z) {
        this.f24391s.m32397b(z);
    }

    /* renamed from: e */
    public final C7474p m28983e() {
        return this.f24391s;
    }

    /* renamed from: a */
    private final void m28945a(int i, Object obj) {
        synchronized (this.f24398z) {
            if (this.f24398z.m22210a()) {
                this.f24398z.notify();
            }
            this.f24398z.m22209a(i, 0, 0, obj);
        }
    }
}
