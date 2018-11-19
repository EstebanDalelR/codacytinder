package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.view.ViewCompat;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Toast;
import com.facebook.ads.AdError;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.bc.C4754b;
import com.google.android.m4b.maps.bc.C4756e;
import com.google.android.m4b.maps.bv.C4922b.C4921b;
import com.google.android.m4b.maps.bv.C4952u.C4950b;
import com.google.android.m4b.maps.bv.C6552x.C4961g;
import com.google.android.m4b.maps.bv.C6552x.C4963i;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.cg.C5144b;
import com.google.android.m4b.maps.cg.C5173d;
import com.google.android.m4b.maps.cg.C5184n;
import com.google.android.m4b.maps.cg.bn;
import com.google.android.m4b.maps.cg.bn.C5151a;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.cg.br.C5156a;
import com.google.android.m4b.maps.cg.bt;
import com.google.android.m4b.maps.cg.bw;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.model.StreetViewPanoramaCamera;
import com.google.android.m4b.maps.model.StreetViewPanoramaLocation;
import com.google.android.m4b.maps.model.StreetViewPanoramaOrientation;
import com.google.android.m4b.maps.p124x.aa;
import com.google.android.m4b.maps.p124x.ab;
import com.google.android.m4b.maps.p124x.ac;
import com.google.android.m4b.maps.p124x.ad;

public final class ae extends SurfaceView implements OnDoubleTapListener, OnGestureListener, C4950b, C4961g, C4966z, bt {
    /* renamed from: A */
    private int f24287A;
    /* renamed from: B */
    private Integer f24288B;
    /* renamed from: C */
    private int f24289C;
    /* renamed from: D */
    private float f24290D;
    /* renamed from: E */
    private float f24291E;
    /* renamed from: F */
    private float f24292F;
    /* renamed from: G */
    private String f24293G;
    /* renamed from: H */
    private Toast f24294H;
    /* renamed from: I */
    private boolean f24295I = true;
    /* renamed from: J */
    private boolean f24296J = true;
    /* renamed from: K */
    private boolean f24297K = true;
    /* renamed from: L */
    private final Handler f24298L = new Handler();
    /* renamed from: M */
    private Runnable f24299M;
    /* renamed from: N */
    private final Handler f24300N = new C49141(this);
    /* renamed from: O */
    private final Object f24301O = new Object();
    /* renamed from: P */
    private C4917a f24302P = null;
    /* renamed from: Q */
    private float f24303Q;
    /* renamed from: R */
    private float f24304R;
    /* renamed from: S */
    private float f24305S;
    /* renamed from: T */
    private float f24306T;
    /* renamed from: U */
    private boolean f24307U;
    /* renamed from: V */
    private final C6413m f24308V;
    /* renamed from: W */
    private final Resources f24309W;
    /* renamed from: a */
    private float f24310a;
    /* renamed from: b */
    private final ag f24311b = null;
    /* renamed from: c */
    private C6552x f24312c;
    /* renamed from: d */
    private C4952u f24313d;
    /* renamed from: e */
    private String f24314e;
    /* renamed from: f */
    private C4938m f24315f;
    /* renamed from: g */
    private C4948t f24316g;
    /* renamed from: h */
    private boolean f24317h;
    /* renamed from: i */
    private C4944q f24318i;
    /* renamed from: j */
    private C4945r f24319j;
    /* renamed from: k */
    private bw f24320k;
    /* renamed from: l */
    private LatLng f24321l;
    /* renamed from: m */
    private bw f24322m;
    /* renamed from: n */
    private float f24323n;
    /* renamed from: o */
    private float f24324o;
    /* renamed from: p */
    private ad f24325p;
    /* renamed from: q */
    private ab f24326q;
    /* renamed from: r */
    private C5156a f24327r;
    /* renamed from: s */
    private aa f24328s;
    /* renamed from: t */
    private ac f24329t;
    /* renamed from: u */
    private ad f24330u;
    /* renamed from: v */
    private boolean f24331v = true;
    /* renamed from: w */
    private int f24332w = 0;
    /* renamed from: x */
    private boolean f24333x = false;
    /* renamed from: y */
    private C4927g f24334y;
    /* renamed from: z */
    private C4918b f24335z;

    /* renamed from: com.google.android.m4b.maps.bv.ae$1 */
    class C49141 extends Handler {
        /* renamed from: a */
        private /* synthetic */ ae f18081a;

        C49141(ae aeVar) {
            this.f18081a = aeVar;
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ae.m28874a(this.f18081a, message.arg1 != 0, (C4944q) message.obj);
                    return;
                case 1:
                    message = message.arg1;
                    return;
                case 2:
                    this.f18081a.m28917c(message.arg1);
                    return;
                case 3:
                    this.f18081a.m28913b();
                    return;
                default:
                    message = message.what;
                    StringBuilder stringBuilder = new StringBuilder(30);
                    stringBuilder.append("Unknown message id ");
                    stringBuilder.append(message);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.ae$2 */
    class C49152 implements Runnable {
        C49152() {
        }

        public final void run() {
            C4728u.m21049a("Failed to load map. Error contacting Google servers. This is probably an authentication issue (but could be due to network errors).");
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.ae$a */
    class C4917a implements Runnable {
        /* renamed from: a */
        private final boolean f18090a;
        /* renamed from: b */
        private float f18091b;
        /* renamed from: c */
        private final boolean f18092c;
        /* renamed from: d */
        private float f18093d;
        /* renamed from: e */
        private /* synthetic */ ae f18094e;

        C4917a(ae aeVar, float f, float f2) {
            this.f18094e = aeVar;
            boolean z = false;
            this.f18090a = f > 0.0f;
            if (!this.f18090a) {
                f = -f;
            }
            this.f18091b = f;
            if (f2 > 0.0f) {
                z = true;
            }
            this.f18092c = z;
            if (this.f18092c == null) {
                f2 = -f2;
            }
            this.f18093d = f2;
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
            r5 = this;
            r0 = r5.f18094e;
            r0 = r0.f24301O;
            monitor-enter(r0);
        L_0x0007:
            r1 = r5.f18094e;	 Catch:{ InterruptedException -> 0x0015 }
            r1 = r1.f24301O;	 Catch:{ InterruptedException -> 0x0015 }
            r2 = 30;	 Catch:{ InterruptedException -> 0x0015 }
            r1.wait(r2);	 Catch:{ InterruptedException -> 0x0015 }
            goto L_0x0015;
        L_0x0013:
            r1 = move-exception;
            goto L_0x0066;
        L_0x0015:
            r1 = r5.f18094e;	 Catch:{ all -> 0x0013 }
            r1 = r1.f24318i;	 Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0064;	 Catch:{ all -> 0x0013 }
        L_0x001d:
            r1 = r5.f18091b;	 Catch:{ all -> 0x0013 }
            r2 = 0;	 Catch:{ all -> 0x0013 }
            r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));	 Catch:{ all -> 0x0013 }
            if (r1 > 0) goto L_0x002a;	 Catch:{ all -> 0x0013 }
        L_0x0024:
            r1 = r5.f18093d;	 Catch:{ all -> 0x0013 }
            r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));	 Catch:{ all -> 0x0013 }
            if (r1 <= 0) goto L_0x0064;	 Catch:{ all -> 0x0013 }
        L_0x002a:
            r1 = r5.f18094e;	 Catch:{ all -> 0x0013 }
            r3 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;	 Catch:{ all -> 0x0013 }
            r4 = r5.f18090a;	 Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0035;	 Catch:{ all -> 0x0013 }
        L_0x0032:
            r4 = r5.f18091b;	 Catch:{ all -> 0x0013 }
            goto L_0x0038;	 Catch:{ all -> 0x0013 }
        L_0x0035:
            r4 = r5.f18091b;	 Catch:{ all -> 0x0013 }
            r4 = -r4;	 Catch:{ all -> 0x0013 }
        L_0x0038:
            r4 = r4 * r3;	 Catch:{ all -> 0x0013 }
            r3 = r5.f18092c;	 Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0041;	 Catch:{ all -> 0x0013 }
        L_0x003e:
            r3 = r5.f18093d;	 Catch:{ all -> 0x0013 }
            goto L_0x0044;	 Catch:{ all -> 0x0013 }
        L_0x0041:
            r3 = r5.f18093d;	 Catch:{ all -> 0x0013 }
            r3 = -r3;	 Catch:{ all -> 0x0013 }
        L_0x0044:
            r1.m28896a(r4, r3);	 Catch:{ all -> 0x0013 }
            r1 = r5.f18091b;	 Catch:{ all -> 0x0013 }
            r3 = 1063172178; // 0x3f5eb852 float:0.87 double:5.25276849E-315;	 Catch:{ all -> 0x0013 }
            r1 = r1 * r3;	 Catch:{ all -> 0x0013 }
            r4 = 1000593162; // 0x3ba3d70a float:0.005 double:4.94358707E-315;	 Catch:{ all -> 0x0013 }
            r1 = r1 - r4;	 Catch:{ all -> 0x0013 }
            r1 = java.lang.Math.max(r1, r2);	 Catch:{ all -> 0x0013 }
            r5.f18091b = r1;	 Catch:{ all -> 0x0013 }
            r1 = r5.f18093d;	 Catch:{ all -> 0x0013 }
            r1 = r1 * r3;	 Catch:{ all -> 0x0013 }
            r1 = r1 - r4;	 Catch:{ all -> 0x0013 }
            r1 = java.lang.Math.max(r1, r2);	 Catch:{ all -> 0x0013 }
            r5.f18093d = r1;	 Catch:{ all -> 0x0013 }
            goto L_0x0007;	 Catch:{ all -> 0x0013 }
        L_0x0064:
            monitor-exit(r0);	 Catch:{ all -> 0x0013 }
            return;	 Catch:{ all -> 0x0013 }
        L_0x0066:
            monitor-exit(r0);	 Catch:{ all -> 0x0013 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.ae.a.run():void");
        }

        /* renamed from: a */
        final void m22039a() {
            synchronized (this.f18094e.f24301O) {
                this.f18091b = 0.0f;
                this.f18093d = 0.0f;
                this.f18094e.f24301O.notify();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.bv.ae$b */
    public static class C4918b {
        /* renamed from: a */
        public boolean f18095a;
        /* renamed from: b */
        public boolean f18096b;
        /* renamed from: c */
        public boolean f18097c;
        /* renamed from: d */
        public boolean f18098d;
        /* renamed from: e */
        public boolean f18099e;
    }

    /* renamed from: com.google.android.m4b.maps.bv.ae$3 */
    class C65483 implements C5151a {
        /* renamed from: a */
        private /* synthetic */ ae f24286a;

        C65483(ae aeVar) {
            this.f24286a = aeVar;
        }

        /* renamed from: a */
        public final void mo5169a(bn bnVar) {
            if (bnVar.mo7075h() > 0) {
                bnVar = bnVar.m32938a(0);
                String valueOf = String.valueOf(this.f24286a.f24309W.getString(C4513R.string.maps_YOUR_LOCATION));
                bnVar = bnVar.m22981a();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(bnVar).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(": ");
                stringBuilder.append(bnVar);
                this.f24286a.setContentDescription(stringBuilder.toString());
            }
        }
    }

    /* renamed from: e */
    private static float m28885e(float f) {
        return 0.5f - (f * 0.0055555557f);
    }

    /* renamed from: k */
    public final View mo5200k() {
        return this;
    }

    protected final void onDetachedFromWindow() {
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public static ae m28869a(C5173d c5173d) {
        Context c = c5173d.m23113c();
        C5184n a = c5173d.m23111a();
        Context context = c;
        C4756e.m21101a(c5173d, new C4981g(context, a.m23167a(), new C49152(), c5173d.m23119i(), a));
        View aeVar = new ae(c, c5173d.m23114d(), a.m23167a());
        aeVar.f24313d = new C4952u(new C4930h(3, c.getCacheDir().getAbsolutePath(), 100), a.m23167a());
        aeVar.f24307U = null;
        aeVar.setFocusable(true);
        aeVar.setFocusableInTouchMode(true);
        aeVar.setClickable(true);
        if (aeVar.f24312c != null) {
            throw new IllegalArgumentException("mRenderer already exists");
        }
        aeVar.f24312c = new C6552x(aeVar.f24313d, aeVar.f24308V);
        aeVar.f24312c.m28967a(aeVar.getContext(), aeVar.f24309W, aeVar.getHolder(), aeVar, aeVar);
        aeVar.f24312c.m28968a(null);
        aeVar.f24334y.m22085a(aeVar.f24312c);
        ViewCompat.a(aeVar, aeVar.f24312c.m28983e());
        aeVar.f24333x = true;
        return aeVar;
    }

    private ae(Context context, Resources resources, C6413m c6413m) {
        super(context);
        this.f24308V = c6413m;
        this.f24309W = resources;
        resources = this.f24309W.getDisplayMetrics();
        this.f24310a = resources.density;
        c6413m = this.f24310a;
        resources = resources.densityDpi;
        StringBuilder stringBuilder = new StringBuilder(51);
        stringBuilder.append("SV ScreenDensity: ");
        stringBuilder.append(c6413m);
        stringBuilder.append(", DPI: ");
        stringBuilder.append(resources);
        ac.m22036a(stringBuilder.toString());
        this.f24322m = new bw();
        this.f24319j = new C4945r(50);
        this.f24335z = new C4918b();
        this.f24325p = new ad(context, this, this, this);
        this.f24334y = new C4927g();
    }

    /* renamed from: l */
    private void m28888l() {
        if (this.f24312c != null) {
            this.f24312c.m28972a(new bw(this.f24322m));
            this.f24300N.sendMessage(Message.obtain(this.f24300N, 3));
        }
    }

    /* renamed from: b */
    final void m28913b() {
        if (this.f24328s != null && this.f24331v) {
            try {
                this.f24328s.mo5687a(C4754b.m21098a(this.f24322m));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        this.f24331v = true;
    }

    public final void invalidate() {
        super.invalidate();
        if (this.f24312c != null) {
            int i;
            C4918b c4918b;
            if (this.f24294H != null) {
                this.f24294H.cancel();
                this.f24294H = null;
            }
            String str = this.f24316g != null ? this.f24316g.f18296c : this.f24314e;
            int i2 = 0;
            if (str == null) {
                if (this.f24315f == null) {
                    if (this.f24318i != null) {
                        m28891o();
                    } else if (this.f24317h) {
                        i = C4513R.string.maps_invalid_panorama_data;
                    } else {
                        i = C4513R.string.maps_no_panorama_data;
                    }
                    c4918b = this.f24335z;
                    c4918b.f18095a = true;
                    c4918b.f18096b = false;
                    c4918b.f18097c = this.f24317h;
                    c4918b.f18098d = false;
                    c4918b.f18099e = false;
                    if (this.f24318i != null && this.f24316g == null) {
                        c4918b.f18096b = true;
                        c4918b.f18098d = this.f24318i.m22178c();
                        c4918b.f18099e = this.f24318i.f18262b;
                    }
                    c4918b = this.f24335z;
                    if (!(c4918b.f18097c || c4918b.f18098d)) {
                        if (c4918b.f18099e) {
                            if (!c4918b.f18095a) {
                                i2 = c4918b.f18096b ? AdError.NETWORK_ERROR_CODE : 2000;
                            }
                            if (i2 == this.f24287A) {
                                this.f24287A = i2;
                            }
                        }
                    }
                    i2 = 10000;
                    if (i2 == this.f24287A) {
                        this.f24287A = i2;
                    }
                }
            }
            C4944q a = this.f24319j.m22180a(str);
            if (a != null) {
                a.f18276p = true;
                this.f24313d.m22196a(a.f18269i);
                m28875a(a);
                i = a.f18279s.size();
                int i3 = 0;
                while (i3 < i) {
                    this.f24313d.m22198a(this.f24312c, (C4946s) a.f18279s.get(i3), i3 == i + -1);
                    i3++;
                }
                m28891o();
            } else {
                this.f24313d.m22197a(this, str, this.f24315f, this.f24288B, str == null, this.f24333x);
                if (str != null) {
                    String str2 = str;
                    this.f24313d.m22199a(this.f24312c, str2, 0, 0, 0, 1, false);
                    this.f24313d.m22199a(this.f24312c, str2, 0, 0, 0, 2, false);
                    this.f24313d.m22199a(this.f24312c, str2, 0, 0, 0, 3, false);
                    this.f24313d.m22199a(this.f24312c, str2, 0, 0, 0, 4, false);
                    this.f24313d.m22199a(this.f24312c, str2, 0, 0, 0, 5, false);
                    this.f24313d.m22199a(this.f24312c, str2, 0, 0, 0, 6, false);
                    this.f24313d.m22199a(this.f24312c, str2, 0, 0, 0, -1, true);
                }
            }
            c4918b = this.f24335z;
            c4918b.f18095a = true;
            c4918b.f18096b = false;
            c4918b.f18097c = this.f24317h;
            c4918b.f18098d = false;
            c4918b.f18099e = false;
            c4918b.f18096b = true;
            c4918b.f18098d = this.f24318i.m22178c();
            c4918b.f18099e = this.f24318i.f18262b;
            c4918b = this.f24335z;
            if (c4918b.f18099e) {
                if (!c4918b.f18095a) {
                    if (c4918b.f18096b) {
                    }
                }
                if (i2 == this.f24287A) {
                    this.f24287A = i2;
                }
            }
            i2 = 10000;
            if (i2 == this.f24287A) {
                this.f24287A = i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo5178a(StreetViewPanoramaCamera streetViewPanoramaCamera, String str) {
        if (str.equals("")) {
            m28899a(bw.m23045a(streetViewPanoramaCamera));
        } else {
            mo5184a(str, null, null, bw.m23045a(streetViewPanoramaCamera));
        }
    }

    /* renamed from: c */
    public final void mo5190c() {
        if (this.f24312c != null) {
            this.f24312c.m28964a();
        }
    }

    /* renamed from: d */
    public final void mo5192d() {
        if (this.f24312c != null) {
            this.f24312c.m28979c();
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f24312c.m28983e().a(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f24332w = 0;
        if (m28892p()) {
            if (this.f24299M != null) {
                this.f24298L.removeCallbacks(this.f24299M);
            }
            this.f24312c.m28980c(1);
            if (this.f24325p.m28864a(motionEvent) && motionEvent.getAction() == 1) {
                this.f24332w++;
                m28873a(motionEvent);
            }
            return true;
        }
        return true;
    }

    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r7, android.view.KeyEvent r8) {
        /*
        r6 = this;
        r0 = r6.m28892p();
        r1 = 4;
        r2 = 0;
        r3 = 1;
        if (r7 == r1) goto L_0x0020;
    L_0x0009:
        r1 = 35;
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r7 == r1) goto L_0x006c;
    L_0x000f:
        r1 = 45;
        if (r7 == r1) goto L_0x0066;
    L_0x0013:
        r1 = 48;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r7 == r1) goto L_0x004c;
    L_0x0019:
        r1 = 62;
        if (r7 == r1) goto L_0x006c;
    L_0x001d:
        switch(r7) {
            case 19: goto L_0x0041;
            case 20: goto L_0x0037;
            case 21: goto L_0x002d;
            case 22: goto L_0x0023;
            case 23: goto L_0x004c;
            default: goto L_0x0020;
        };
    L_0x0020:
        r0 = 0;
        r3 = 0;
        goto L_0x007a;
    L_0x0023:
        if (r0 == 0) goto L_0x0079;
    L_0x0025:
        r0 = r6.f24296J;
        if (r0 == 0) goto L_0x0079;
    L_0x0029:
        r6.m28872a(r5);
        goto L_0x004a;
    L_0x002d:
        if (r0 == 0) goto L_0x0079;
    L_0x002f:
        r0 = r6.f24296J;
        if (r0 == 0) goto L_0x0079;
    L_0x0033:
        r6.m28872a(r4);
        goto L_0x004a;
    L_0x0037:
        if (r0 == 0) goto L_0x0079;
    L_0x0039:
        r0 = r6.f24296J;
        if (r0 == 0) goto L_0x0079;
    L_0x003d:
        r6.m28877b(r4);
        goto L_0x004a;
    L_0x0041:
        if (r0 == 0) goto L_0x0079;
    L_0x0043:
        r0 = r6.f24296J;
        if (r0 == 0) goto L_0x0079;
    L_0x0047:
        r6.m28877b(r5);
    L_0x004a:
        r0 = 1;
        goto L_0x007a;
    L_0x004c:
        if (r0 == 0) goto L_0x0079;
    L_0x004e:
        r0 = r6.f24295I;
        if (r0 == 0) goto L_0x0079;
    L_0x0052:
        r0 = r6.f24322m;
        r0 = r0.m23054e();
        r1 = r6.f24289C;
        r1 = r1 - r3;
        r1 = (float) r1;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 >= 0) goto L_0x0061;
    L_0x0060:
        goto L_0x0062;
    L_0x0061:
        r5 = -r0;
    L_0x0062:
        r6.m28882c(r5);
        goto L_0x0079;
    L_0x0066:
        if (r0 == 0) goto L_0x0079;
    L_0x0068:
        r6.m28890n();
        goto L_0x0079;
    L_0x006c:
        if (r0 == 0) goto L_0x0079;
    L_0x006e:
        r0 = r6.f24295I;
        if (r0 == 0) goto L_0x0079;
    L_0x0072:
        r6.m28882c(r4);
        r0 = 0;
        r6.m28877b(r0);
    L_0x0079:
        r0 = 0;
    L_0x007a:
        if (r3 == 0) goto L_0x0088;
    L_0x007c:
        if (r0 == 0) goto L_0x008c;
    L_0x007e:
        r7 = r6.f24312c;
        if (r7 == 0) goto L_0x008c;
    L_0x0082:
        r7 = r6.f24312c;
        r7.m28980c(r2);
        goto L_0x008c;
    L_0x0088:
        r3 = super.onKeyDown(r7, r8);
    L_0x008c:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.ae.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m28873a(motionEvent);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        int c = this.f24334y.m22089c(motionEvent.getX(), motionEvent.getY());
        if ((c == -1 || c == -2) && this.f24330u != null) {
            try {
                this.f24330u.mo5690a(mo5171a((int) motionEvent.getX(), (int) motionEvent.getY()));
            } catch (MotionEvent motionEvent2) {
                throw new RuntimeRemoteException(motionEvent2);
            }
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!(m28892p() == null || this.f24334y.m22088b(motionEvent2.getX(), motionEvent2.getY()) != null || this.f24296J == null)) {
            this.f24323n = 1017370378 * f;
            this.f24324o = -1138501878 * f2;
            m28896a((f * this.f24292F) / ((float) getWidth()), (f2 * this.f24291E) / (((float) getHeight()) * -1045168128));
        }
        return true;
    }

    /* renamed from: a */
    public final StreetViewPanoramaOrientation mo5171a(int i, int i2) {
        if (this.f24318i == null) {
            return null;
        }
        i = this.f24312c.m28974a((float) i, (float) i2, false);
        if (i == 0) {
            return null;
        }
        return new StreetViewPanoramaOrientation(bp.m23005m(i[1]) - 90.0f, bp.m23005m(i[0]));
    }

    /* renamed from: a */
    public final Point mo5170a(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        if (this.f24318i == null) {
            return null;
        }
        streetViewPanoramaOrientation = this.f24312c.m28978b(bp.m23004l(streetViewPanoramaOrientation.bearing), bp.m23004l(streetViewPanoramaOrientation.tilt + 90.0f));
        if (streetViewPanoramaOrientation == null) {
            return null;
        }
        return new Point((int) streetViewPanoramaOrientation[0], (int) streetViewPanoramaOrientation[1]);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f24334y.m22086a() != null) {
            return null;
        }
        if (this.f24296J != null) {
            motionEvent = bp.m22985a(this.f24323n, -2.5f, 2.5f) * 0.8f;
            motionEvent2 = bp.m22985a(this.f24324o, -2.5f, 2.5f) * 0.5f;
            synchronized (this.f24301O) {
                if (this.f24302P != null) {
                    this.f24302P.m22039a();
                }
                this.f24302P = new C4917a(this, motionEvent, motionEvent2);
                new Thread(this.f24302P, "Flinger").start();
            }
        }
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        synchronized (this.f24301O) {
            if (this.f24302P != null) {
                this.f24302P.m22039a();
            }
        }
        this.f24334y.m22087a(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f24318i.f18286z != null && this.f24297K) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f24318i.f18286z != null) {
                float[] a = this.f24312c.m28974a(x, y, false);
                this.f24318i.m22175a(a[0], a[1], a);
                float[] fArr = new float[2];
                this.f24318i.f18286z.m22063a();
                String b = this.f24318i.f18286z.m22065b(a[0], a[1], fArr);
                if (b != null) {
                    if (!b.equals(this.f24318i.f18269i)) {
                        C4944q c4944q = this.f24318i;
                        float f = fArr[0];
                        float f2 = fArr[1];
                        fArr[0] = (f + bp.m23004l(c4944q.f18280t)) + 0.5f;
                        fArr[1] = f2 + (((float) Math.cos((double) (bp.m23003k(fArr[0]) - bp.m23007o(c4944q.f18281u)))) * bp.m23002j(c4944q.f18257A));
                        if (!this.f24318i.f18286z.m22061a(a[0], a[1]).m22052a()) {
                            this.f24322m.m23046a(bp.m23005m(bp.m22991b(fArr[0])));
                            this.f24322m.m23050b(bp.m22991b(fArr[1]) * 2.0f);
                        }
                        motionEvent = this.f24318i.f18286z.m22064b(a[0], a[1]);
                        C4963i c4963i = new C4963i(motionEvent.f18121a, motionEvent.f18122b, this.f24322m, AdError.NETWORK_ERROR_CODE);
                        c4963i.m22217a(this.f24318i.f18286z);
                        this.f24312c.m28971a(c4963i);
                        mo5184a(b, null, null, this.f24322m);
                    }
                }
            }
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f24332w++;
        if (this.f24329t != null && this.f24332w == 3) {
            try {
                this.f24329t.mo5689a(mo5171a((int) motionEvent.getX(), (int) motionEvent.getY()));
                this.f24332w = 0;
            } catch (MotionEvent motionEvent2) {
                throw new RuntimeRemoteException(motionEvent2);
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m28873a(MotionEvent motionEvent) {
        motionEvent = this.f24334y.m22089c(motionEvent.getX(), motionEvent.getY());
        if (!(motionEvent == -1 || motionEvent == -2)) {
            this.f24332w = 0;
            motionEvent = this.f24312c.m28981d(motionEvent);
            if (motionEvent != null) {
                if (motionEvent.f18296c != null) {
                    if (motionEvent.f18296c.length() != 0) {
                        this.f24317h = false;
                        this.f24314e = null;
                        this.f24315f = null;
                        this.f24316g = motionEvent;
                        String str = "SV step to panorama ";
                        String valueOf = String.valueOf(this.f24316g.f18296c);
                        ac.m22038b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                        this.f24293G = null;
                        this.f24312c.m28965a(-1.0f, -1.0f);
                        this.f24318i.f18286z.m22063a();
                        C4921b a = this.f24318i.f18286z.m22062a(motionEvent.f18296c);
                        if (a != null) {
                            C4963i c4963i = new C4963i(a.f18121a, a.f18122b, this.f24322m, AdError.NETWORK_ERROR_CODE);
                            c4963i.m22217a(this.f24318i.f18286z);
                            this.f24312c.m28971a(c4963i);
                        } else {
                            this.f24333x = true;
                        }
                        mo5184a(motionEvent.f18296c, null, null, this.f24322m);
                    }
                }
                Toast.makeText(getContext(), this.f24309W.getString(C4513R.string.maps_panorama_disabled), 0).show();
            }
        }
    }

    /* renamed from: a */
    public final void mo5173a(int i) {
        m28879b(1, (int) ((((double) i) * 0.8d) + 2000.0d));
    }

    /* renamed from: b */
    public final void mo5188b(int i) {
        m28879b(2, -2);
    }

    /* renamed from: c */
    final void m28917c(int i) {
        if (i == -2) {
            try {
                if (C5144b.m22921a(getContext()) != 0) {
                    if (this.f24318i != 0) {
                        if (this.f24318i.f18270j != 0) {
                            C4718l bnVar = new bn(this.f24318i.f18270j, 21.0f);
                            bnVar.m32939a(new C65483(this));
                            this.f24308V.mo4893c(bnVar);
                        }
                    }
                    setContentDescription(String.valueOf(this.f24309W.getString(C4513R.string.maps_YOUR_LOCATION)).concat(": invalid point"));
                }
                if (this.f24327r != 0) {
                    this.f24327r.mo5299a(this.f24318i != 0 ? this.f24318i.f18272l : "", mo5194e());
                }
                if (this.f24326q != 0) {
                    this.f24326q.mo5688a(mo5194e());
                }
                this.f24333x = false;
            } catch (int i2) {
                throw new RuntimeRemoteException(i2);
            }
        }
    }

    /* renamed from: e */
    public final StreetViewPanoramaLocation mo5194e() {
        if (this.f24318i == null) {
            return null;
        }
        C4944q c4944q = this.f24318i;
        return new StreetViewPanoramaLocation(C4754b.m21099a(c4944q.f18285y), c4944q.f18270j, c4944q.f18269i);
    }

    /* renamed from: f */
    public final StreetViewPanoramaCamera mo5195f() {
        return C4754b.m21098a(m28889m());
    }

    /* renamed from: m */
    private bw m28889m() {
        if (this.f24322m == null) {
            return this.f24320k;
        }
        return this.f24322m;
    }

    /* renamed from: b */
    private final void m28879b(int i, int i2) {
        this.f24300N.sendMessage(Message.obtain(this.f24300N, i, i2, 0));
    }

    /* renamed from: a */
    public final void mo5184a(String str, LatLng latLng, Integer num, bw bwVar) {
        m28880b(str, latLng, num, bwVar);
    }

    /* renamed from: n */
    private void m28890n() {
        float f;
        if (this.f24320k != null) {
            this.f24322m = this.f24320k;
            this.f24320k = null;
        } else if (!this.f24333x) {
            float b;
            if (this.f24316g != null) {
                float f2;
                f = this.f24316g.f18294a;
                if (this.f24318i != null) {
                    C4948t[] c4948tArr = this.f24318i.f18285y;
                    if (c4948tArr != null) {
                        f2 = 0.0f;
                        float f3 = Float.POSITIVE_INFINITY;
                        for (C4948t c4948t : c4948tArr) {
                            float f4 = (c4948t.f18294a - f) + 180.0f;
                            f4 = (f4 - (((float) Math.floor((double) (0.0027777778f * f4))) * 360.0f)) - 180.0f;
                            float abs = Math.abs(f4);
                            if (abs <= 25.0f && abs <= r7) {
                                f2 = f4;
                                f3 = abs;
                            }
                        }
                        b = this.f24322m.m23049b() + f2;
                    }
                }
                f2 = 0.0f;
                b = this.f24322m.m23049b() + f2;
            } else {
                b = this.f24318i != null ? this.f24318i.f18280t : 0.0f;
            }
            this.f24322m = new bw(b, 0.5f, this.f24322m.m23054e());
        } else {
            return;
        }
        f = (float) getHeight();
        this.f24290D = ((float) getWidth()) / f;
        this.f24291E = C6552x.m28941a(this.f24290D);
        this.f24292F = C6552x.m28952b(this.f24290D);
        this.f24289C = Math.min(this.f24318i.f18271k, Math.max(0, (int) bp.m22995d(((((float) this.f24318i.f18266f) / f) * this.f24291E) * 0.0055555557f)) + 2);
        if (this.f24312c != null) {
            this.f24312c.m28966a(this.f24289C);
        }
        this.f24331v = false;
        m28878b(0.0f, 0.0f);
        m28882c(0.0f);
    }

    /* renamed from: a */
    public final synchronized void m28896a(float f, float f2) {
        m28878b(f, f2);
        m28888l();
    }

    /* renamed from: b */
    private synchronized void m28877b(float f) {
        m28887f(f);
        m28888l();
    }

    /* renamed from: c */
    private void m28882c(float f) {
        m28884d(f);
        m28888l();
    }

    /* renamed from: b */
    private void m28878b(float f, float f2) {
        if (this.f24296J) {
            this.f24322m.m23046a(bp.m22983a(this.f24322m.m23049b() + (f * this.f24322m.m23055f())));
            m28887f(f2);
        }
    }

    /* renamed from: d */
    private void m28884d(float f) {
        if (this.f24295I) {
            this.f24322m.m23047a(f, this.f24289C - 1);
        }
    }

    /* renamed from: f */
    private void m28887f(float f) {
        if (this.f24296J) {
            float f2 = this.f24322m.m23055f() * 0.125f;
            float e = m28885e(this.f24318i.f18284x) + f2;
            float e2 = m28885e(this.f24318i.f18283w) - f2;
            if (e > e2) {
                e = (e + e2) * 0.5f;
                e2 = e;
            }
            this.f24322m.m23050b(bp.m22985a(this.f24322m.m23051c() + (f * f2), e, e2));
        }
    }

    /* renamed from: b */
    private void m28880b(String str, LatLng latLng, Integer num, bw bwVar) {
        this.f24317h = false;
        this.f24316g = null;
        this.f24314e = str;
        this.f24315f = latLng != null ? new C4938m(latLng.latitude, latLng.longitude) : null;
        this.f24288B = num;
        this.f24321l = null;
        this.f24320k = bwVar;
        invalidate();
    }

    /* renamed from: o */
    private CharSequence m28891o() {
        if (this.f24318i == null) {
            return "";
        }
        int i;
        if (this.f24318i.f18262b) {
            i = C4513R.string.maps_panorama_disabled;
            return null;
        } else if (this.f24318i.m22177b()) {
            i = C4513R.string.maps_service_unavailable;
            return null;
        } else {
            CharSequence charSequence = this.f24318i.f18274n;
            CharSequence charSequence2 = this.f24318i.f18273m;
            if (charSequence == null) {
                return charSequence2 == null ? "" : charSequence2;
            } else {
                if (charSequence2 == null) {
                    return charSequence;
                }
                return String.format(this.f24309W.getString(C4513R.string.maps_street_range_name_format), new Object[]{charSequence, charSequence2});
            }
        }
    }

    /* renamed from: a */
    private void m28875a(C4944q c4944q) {
        if (c4944q != null && this.f24333x) {
            String str = c4944q.f18269i;
            if (!(this.f24318i == null || this.f24318i.f18286z == null || this.f24318i.f18269i.equals(str))) {
                this.f24333x = false;
                this.f24318i.f18286z.m22063a();
                C4921b a = this.f24318i.f18286z.m22062a(str);
                if (!(a == null || this.f24312c == null)) {
                    C4963i c4963i = new C4963i(a.f18121a, a.f18122b, m28889m(), AdError.NETWORK_ERROR_CODE);
                    c4963i.m22217a(this.f24318i.f18286z);
                    this.f24312c.m28971a(c4963i);
                }
            }
        }
        this.f24318i = c4944q;
        if (!(this.f24318i == null || this.f24318i.f18286z == null)) {
            this.f24318i.f18286z.m22063a();
        }
        if (this.f24312c != null) {
            this.f24312c.m28969a(this.f24318i);
        }
        if (this.f24318i != null) {
            this.f24319j.m22181a(c4944q);
            m28890n();
            this.f24316g = null;
            this.f24314e = null;
            this.f24315f = null;
        }
    }

    /* renamed from: p */
    private boolean m28892p() {
        return (this.f24318i == null || this.f24312c == null) ? false : true;
    }

    /* renamed from: a */
    public final boolean mo5187a(C4965y c4965y) {
        if (this.f24295I) {
            float[] a = this.f24312c.m28974a(c4965y.m22221a(), c4965y.m22222b(), false);
            if (a == null) {
                return false;
            }
            float f = a[0];
            float f2 = a[1];
            float l = bp.m23004l(this.f24322m.m23049b());
            float c = this.f24322m.m23051c() / 2.0f;
            float f3 = this.f24322m.m23055f();
            this.f24305S = f;
            this.f24306T = f2;
            this.f24303Q = bp.m22998f(bp.m22994c(l, f)) / bp.m22998f(bp.m23004l(this.f24292F / 2.0f) * f3);
            this.f24304R = bp.m22998f(bp.m22994c(c, f2)) / bp.m22998f(bp.m23004l(this.f24291E / 2.0f) * f3);
            m28884d(((c4965y.m22223c() - c4965y.m22224d()) / 180.0f) / this.f24310a);
            c4965y = this.f24322m.m23055f();
            f = this.f24306T + bp.m22999g(this.f24304R * bp.m22998f(bp.m23004l(this.f24291E / 2.0f) * c4965y));
            this.f24322m.m23046a(bp.m23005m(this.f24305S + bp.m22999g(this.f24303Q * bp.m22998f(bp.m23004l(this.f24292F / 2.0f) * c4965y))));
            this.f24322m.m23050b(f * 2.0f);
            m28888l();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo5185a(boolean z) {
        this.f24295I = z;
    }

    /* renamed from: g */
    public final boolean mo5196g() {
        return this.f24295I;
    }

    /* renamed from: b */
    public final void mo5189b(boolean z) {
        this.f24296J = z;
    }

    /* renamed from: h */
    public final boolean mo5197h() {
        return this.f24296J;
    }

    /* renamed from: c */
    public final void mo5191c(boolean z) {
        this.f24297K = z;
        if (this.f24312c != null) {
            this.f24312c.m28977b(z);
            this.f24312c.m28975b();
        }
    }

    /* renamed from: i */
    public final boolean mo5198i() {
        return this.f24297K;
    }

    /* renamed from: d */
    public final void mo5193d(boolean z) {
        if (this.f24312c != null) {
            this.f24312c.m28973a(z);
            this.f24312c.m28975b();
        }
    }

    /* renamed from: j */
    public final boolean mo5199j() {
        if (this.f24312c == null) {
            return false;
        }
        return this.f24312c.m28982d();
    }

    /* renamed from: a */
    public final void m28899a(bw bwVar) {
        if (this.f24322m != null) {
            this.f24331v = this.f24322m.equals(bwVar) ^ 1;
        }
        this.f24322m = bwVar;
        m28888l();
    }

    /* renamed from: a */
    public final void mo5177a(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) {
        bw a = bw.m23045a(streetViewPanoramaCamera);
        if (this.f24299M != null) {
            r11.f24298L.removeCallbacks(r11.f24299M);
        }
        a.m23052c(bp.m22985a(a.m23054e(), 0.0f, (float) r11.f24289C));
        if (j == 0) {
            m28899a(a);
            return;
        }
        final bw m = m28889m();
        final float b = bp.m22992b(a.m23049b(), m.m23049b());
        final float c = a.m23051c() - m.m23051c();
        final float e = a.m23054e() - m.m23054e();
        final long uptimeMillis = SystemClock.uptimeMillis();
        final Interpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        final long j2 = j;
        r11.f24299M = new Runnable(r11) {
            /* renamed from: h */
            private /* synthetic */ ae f18089h;

            public final void run() {
                long uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis;
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(((float) uptimeMillis) / ((float) j2));
                this.f18089h.m28899a(new bw(bp.m22983a(m.m23049b() + (b * interpolation)), bp.m22993c(m.m23051c() + (c * interpolation)), m.m23054e() + (interpolation * e)));
                if (uptimeMillis < j2) {
                    this.f18089h.f24298L.postDelayed(this, 16);
                    return;
                }
                this.f18089h.f24298L.removeCallbacks(this.f18089h.f24299M);
                this.f18089h.f24299M = null;
            }
        };
        r11.f24298L.post(r11.f24299M);
    }

    /* renamed from: a */
    public final void mo5174a(C5156a c5156a) {
        this.f24327r = c5156a;
    }

    /* renamed from: a */
    public final void mo5180a(ab abVar) {
        this.f24326q = abVar;
    }

    /* renamed from: a */
    public final void mo5179a(aa aaVar) {
        this.f24328s = aaVar;
    }

    /* renamed from: a */
    public final void mo5181a(ac acVar) {
        this.f24329t = acVar;
    }

    /* renamed from: a */
    public final void mo5182a(ad adVar) {
        this.f24330u = adVar;
    }

    /* renamed from: a */
    public final void mo5186a(boolean z, C4944q c4944q) {
        this.f24300N.sendMessage(Message.obtain(this.f24300N, 0, z, 0, c4944q));
        if (c4944q == null && this.f24333x) {
            m28879b((int) true, -2);
        }
    }

    /* renamed from: a */
    private synchronized void m28872a(float f) {
        m28878b(f, 0.0f);
        m28888l();
    }

    /* renamed from: a */
    public final void mo5172a() {
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
        r3 = this;
        r0 = 0;
    L_0x0001:
        r1 = 5;
        if (r0 >= r1) goto L_0x0019;
    L_0x0004:
        r1 = -1102263091; // 0xffffffffbe4ccccd float:-0.2 double:NaN;
        r3.m28882c(r1);
        monitor-enter(r3);
        r1 = 30;
        r3.wait(r1);	 Catch:{ InterruptedException -> 0x0013 }
        goto L_0x0013;
    L_0x0011:
        r0 = move-exception;
        goto L_0x0017;
    L_0x0013:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0011 }
        goto L_0x0001;	 Catch:{ all -> 0x0011 }
    L_0x0017:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        throw r0;
    L_0x0019:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bv.ae.a():void");
    }

    public final boolean canScrollHorizontally(int i) {
        return this.f24296J;
    }

    public final boolean canScrollVertically(int i) {
        return this.f24296J;
    }

    /* renamed from: a */
    public final void mo5183a(String str) {
        this.f24333x = true;
        m28880b(str, null, null, m28889m());
    }

    /* renamed from: a */
    public final void mo5175a(LatLng latLng) {
        this.f24333x = true;
        m28880b(null, latLng, null, m28889m());
    }

    /* renamed from: a */
    public final void mo5176a(LatLng latLng, int i) {
        this.f24333x = true;
        m28880b(null, latLng, Integer.valueOf(i), m28889m());
    }

    /* renamed from: a */
    static /* synthetic */ void m28874a(ae aeVar, boolean z, C4944q c4944q) {
        if (z) {
            ac.m22036a("SV panorama config request was interrupted");
        } else if (c4944q == null) {
            String valueOf = String.valueOf(c4944q);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("SV received panorama ");
            stringBuilder.append(valueOf);
            ac.m22036a(stringBuilder.toString());
        }
        if (!z || aeVar.f24333x) {
            aeVar.f24317h = c4944q == null;
            aeVar.m28875a(c4944q);
        }
        if (!z) {
            aeVar.invalidate();
        }
    }
}
