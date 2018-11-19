package com.google.android.m4b.maps.bx;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.opengl.GLUtils;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.util.Log;
import android.widget.TextView;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.az.C4732a;
import com.google.android.m4b.maps.ba.C4743b;
import com.google.android.m4b.maps.bh.C4784a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bw.C4981g.C4980b;
import com.google.android.m4b.maps.bx.C5032y.C5031l;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.al.C4993a;
import com.google.android.m4b.maps.by.C5043a;
import com.google.android.m4b.maps.bz.C5046e.C5045a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.bz.C6571c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C5055g;
import com.google.android.m4b.maps.ca.C5056h;
import com.google.android.m4b.maps.cc.C7498h;
import com.google.android.m4b.maps.cc.C7499j;
import com.google.android.m4b.maps.cc.C7500l;
import com.google.android.m4b.maps.cd.C5093c;
import com.google.android.m4b.maps.cd.C7507b;
import com.google.android.m4b.maps.ce.C5095c;
import com.google.android.m4b.maps.ce.C5099e;
import com.google.android.m4b.maps.cf.C5111g;
import com.google.android.m4b.maps.cf.C7508j;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.opengles.GL10;

public final class ai implements C4980b, C5031l, C5045a {
    /* renamed from: a */
    public static volatile boolean f24417a = false;
    /* renamed from: b */
    public static final ThreadLocal<C5056h> f24418b = new C49851();
    /* renamed from: c */
    private static final int[] f24419c = new int[]{60672, 59904, 57856, 65536};
    /* renamed from: d */
    private static final int[] f24420d = new int[]{32768, 32768, 32768, 65536};
    /* renamed from: e */
    private static final int[] f24421e = new int[]{32768, 32768, 32768, 65536};
    /* renamed from: f */
    private static final int[] f24422f = new int[]{0, 0, 0, 65536};
    /* renamed from: g */
    private static final int[] f24423g = new int[]{0, 0, 0, 0};
    /* renamed from: j */
    private static final Comparator<C6561r> f24424j = new C49862();
    /* renamed from: A */
    private final C7481o f24425A;
    /* renamed from: B */
    private final C7507b f24426B;
    /* renamed from: C */
    private C5093c f24427C;
    /* renamed from: D */
    private final HashSet<String> f24428D = new HashSet();
    /* renamed from: E */
    private final HashSet<String> f24429E = new HashSet();
    /* renamed from: F */
    private final int[] f24430F = new int[1];
    /* renamed from: G */
    private final List<C7498h> f24431G = new ArrayList();
    /* renamed from: H */
    private long f24432H = 0;
    /* renamed from: I */
    private boolean f24433I;
    /* renamed from: J */
    private final C4993a f24434J = new C65583(this);
    /* renamed from: K */
    private boolean f24435K;
    /* renamed from: L */
    private Bitmap f24436L;
    /* renamed from: M */
    private boolean f24437M;
    /* renamed from: N */
    private float f24438N;
    /* renamed from: O */
    private long f24439O;
    /* renamed from: P */
    private volatile C5008i f24440P = C5008i.NORMAL;
    /* renamed from: Q */
    private final List<C5002b> f24441Q = new CopyOnWriteArrayList();
    /* renamed from: R */
    private final List<Object> f24442R = new ArrayList();
    /* renamed from: S */
    private af f24443S;
    /* renamed from: T */
    private volatile af f24444T;
    /* renamed from: U */
    private volatile af f24445U;
    /* renamed from: V */
    private volatile boolean f24446V;
    /* renamed from: W */
    private long f24447W;
    /* renamed from: X */
    private int f24448X;
    /* renamed from: Y */
    private volatile al f24449Y;
    /* renamed from: Z */
    private boolean f24450Z;
    private volatile float aa;
    private boolean ab = false;
    private volatile int ac = 0;
    private boolean ad = false;
    private int ae = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    private long af = 0;
    private Map<C6561r, List<ag>> ag = new WeakHashMap();
    private List<ag> ah = new ArrayList();
    private boolean ai = true;
    private boolean aj;
    private final C7508j ak;
    private final C5111g al;
    private volatile long am = -1;
    private final Object an = new Object();
    private final C4981g ao;
    /* renamed from: h */
    private volatile C5095c f24451h = C5095c.f18878s;
    /* renamed from: i */
    private volatile C6571c f24452i;
    /* renamed from: k */
    private C5052d f24453k;
    /* renamed from: l */
    private volatile int f24454l;
    /* renamed from: m */
    private volatile int f24455m = 1;
    /* renamed from: n */
    private final LinkedList<C6561r> f24456n;
    /* renamed from: o */
    private final ArrayList<C4990b> f24457o;
    /* renamed from: p */
    private final ArrayList<al> f24458p;
    /* renamed from: q */
    private final ArrayList<bg> f24459q;
    /* renamed from: r */
    private final C6570b f24460r;
    /* renamed from: s */
    private final C6560n f24461s;
    /* renamed from: t */
    private final C5055g f24462t;
    /* renamed from: u */
    private final Resources f24463u;
    /* renamed from: v */
    private final float f24464v;
    /* renamed from: w */
    private C5099e f24465w;
    /* renamed from: x */
    private final ab f24466x;
    /* renamed from: y */
    private final ab f24467y;
    /* renamed from: z */
    private final C7479h f24468z;

    /* renamed from: com.google.android.m4b.maps.bx.ai$1 */
    class C49851 extends ThreadLocal<C5056h> {
        C49851() {
        }

        protected final /* synthetic */ Object initialValue() {
            return new C5056h();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.ai$2 */
    class C49862 implements Comparator<C6561r> {
        C49862() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C6561r) obj).mo7046d().ordinal() - ((C6561r) obj2).mo7046d().ordinal();
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.ai$a */
    static class C4988a {
        /* renamed from: a */
        private final C6561r[] f18415a;
        /* renamed from: b */
        private final al[] f18416b;

        public C4988a(List<C6561r> list, List<al> list2) {
            this.f18415a = (C6561r[]) list.toArray(new C6561r[list.size()]);
            this.f18416b = (al[]) list2.toArray(new al[list2.size()]);
        }

        /* renamed from: a */
        public final C6561r[] m22310a() {
            return this.f18415a;
        }

        /* renamed from: b */
        public final al[] m22311b() {
            return this.f18416b;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.ai$b */
    static class C4990b {
        /* renamed from: a */
        C6561r f18421a;
        /* renamed from: b */
        C4989a f18422b;

        /* renamed from: com.google.android.m4b.maps.bx.ai$b$a */
        public enum C4989a {
            ADD,
            REMOVE,
            REPLACE_BASE_TILE
        }

        C4990b(C4989a c4989a, C6561r c6561r) {
            this.f18422b = c4989a;
            this.f18421a = c6561r;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bx.ai$3 */
    class C65583 implements C4993a {
        /* renamed from: a */
        private /* synthetic */ ai f24416a;

        C65583(ai aiVar) {
            this.f24416a = aiVar;
        }

        /* renamed from: a */
        public final boolean mo5208a() {
            if (this.f24416a.f24427C != null) {
                synchronized (this.f24416a) {
                    this.f24416a.f24433I = true;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static int[] m29003a(C5008i c5008i) {
        switch (c5008i) {
            case NORMAL:
                return f24419c;
            case TERRAIN:
                return f24419c;
            case RASTER_ONLY:
                return f24419c;
            case HYBRID:
                return f24420d;
            case NIGHT:
                return f24421e;
            case AMBIENT:
                return f24422f;
            default:
                return f24423g;
        }
    }

    public ai(C6560n c6560n, Resources resources, C6570b c6570b, al alVar, C5111g c5111g, C7508j c7508j, TextView textView, C4981g c4981g) {
        this.f24461s = c6560n;
        this.f24462t = new C5055g(this);
        this.f24463u = resources;
        this.f24464v = resources.getDisplayMetrics().density;
        C7500l.m32681a(this.f24464v);
        C7499j.m32668a(this.f24464v);
        this.f24460r = c6570b;
        this.f24456n = new LinkedList();
        this.f24457o = new ArrayList();
        this.f24449Y = alVar;
        this.f24458p = new ArrayList();
        this.f24458p.add(this.f24449Y);
        this.f24459q = new ArrayList();
        this.f24425A = new C7481o(resources);
        this.f24466x = new ab(2, this.f24425A);
        this.f24467y = new ab(1, this.f24425A);
        this.f24468z = new C7479h();
        this.f24426B = new C7507b();
        m29004c(this.f24449Y);
        m29004c(this.f24466x);
        m29004c(this.f24425A);
        m29004c(this.f24426B);
        m29004c(this.f24468z);
        C6561r c7485u = new C7485u(C5016a.NIGHT_DIMMER);
        c7485u.m32525a(C5008i.NIGHT, Integer.MIN_VALUE);
        m29004c(c7485u);
        m29004c(new C7484t());
        if (ao.m22334a() != null) {
            this.f24427C = new C5093c(resources, textView);
        } else {
            this.f24427C = null;
        }
        this.f24449Y.m32444a(this.f24434J);
        this.f24449Y.m32455b(true);
        this.f24439O = SystemClock.uptimeMillis();
        this.al = null;
        this.ak = null;
        this.ao = c4981g;
    }

    /* renamed from: b */
    public final void m29026b() {
        C5043a a = C5043a.m22547a();
        if (a != null) {
            a.m22556a(this.f24453k);
        }
    }

    /* renamed from: a */
    public final void mo5211a(GL10 gl10) {
        C4784a.m21186a();
        this.f24454l = Process.myTid();
        m29007k();
        C4743b.m21085a(gl10.glGetString(7937));
        synchronized (this.f24456n) {
            Iterator it = this.f24456n.iterator();
            while (it.hasNext()) {
                ((C6561r) it.next()).mo7040a(null);
            }
            this.ad = false;
        }
        if (!(this.f24453k == null || this.f24453k.m22635x() == gl10)) {
            if (this.f24465w != null) {
                this.f24465w.m22768a();
            }
            if (this.f24453k != null) {
                this.f24453k.m22601E().m22580a();
                this.f24453k.m22607a().m22654a();
                this.f24453k.m22598B();
                C5052d c5052d = this.f24453k;
                c5052d.f18689g.m29354c(c5052d);
                c5052d.f18686d.m22685c(c5052d);
                c5052d.f18685c.m29340c(c5052d);
                c5052d.f18691i.m29354c(c5052d);
                c5052d.f18687e.m29354c(c5052d);
                c5052d.f18690h.m29354c(c5052d);
                c5052d.f18688f.m29354c(c5052d);
            }
            this.f24453k = null;
        }
        if (this.f24453k == null) {
            this.f24447W = SystemClock.uptimeMillis();
            this.f24453k = new C5052d(gl10, this.f24462t, this.f24461s, this.al, this.f24463u);
            this.f24453k.m22636y().m29089b(this.f24450Z);
            C7500l.m32682a(this.f24453k.m22600D());
            this.f24465w = new C5099e(this.f24451h, this.f24453k, this.f24463u, this.ao);
            this.f24466x.m34279a(this.f24465w);
            this.f24467y.m34279a(this.f24465w);
        }
        this.f24461s.m29091c(true);
        this.f24437M = true;
        if (this.ab != null) {
            this.ac = 2;
        }
        this.ab = true;
        if (C4728u.m21050a("Renderer", 3) != null) {
            Log.d("Renderer", "Surface created");
        }
        C4784a.m21187b();
    }

    /* renamed from: a */
    public final void mo5212a(GL10 gl10, int i, int i2) {
        if (this.f24453k.m22635x() != gl10) {
            gl10 = new IllegalStateException("GL object has changed since onSurfaceCreated");
            if (C4728u.m21050a("Renderer", 6)) {
                Log.e("Renderer", "OpenGL error during initialization.", gl10);
            }
        }
        if (i > 0) {
            if (i2 > 0) {
                this.f24460r.m29236a(i, i2, this.f24464v);
                m29000a(this.f24460r);
                this.f24438N = this.f24460r.m29252h();
                this.aa = Math.max(2.0f, (float) Math.ceil((double) C6570b.m29226a(((float) Math.ceil((double) (((float) ((int) Math.ceil(Math.hypot((double) i, (double) i2)))) / (this.f24464v * 256.0f)))) + 1.0f)));
                if (C4728u.m21050a("Renderer", 3) != null) {
                    StringBuilder stringBuilder = new StringBuilder(40);
                    stringBuilder.append("Surface changed: ");
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(i2);
                    Log.d("Renderer", stringBuilder.toString());
                }
                this.f24461s.mo5221a(1, 0);
            }
        }
    }

    /* renamed from: b */
    public final void mo5213b(GL10 gl10) {
        if (this.f24453k.m22635x() != gl10) {
            gl10 = new IllegalStateException("GL object has changed since onSurfaceCreated");
            if (C4728u.m21050a("Renderer", 6)) {
                Log.e("Renderer", "OpenGL error during initialization.", gl10);
            }
        }
        gl10 = this.f24453k;
        C4732a.m21058a();
        gl10.m22609a(C4732a.m21059b());
        C5008i c5008i = this.f24440P;
        GL10 x = this.f24453k.m22635x();
        gl10 = m29003a(c5008i);
        boolean z = true;
        x.glClearColorx(gl10[0], gl10[1], gl10[2], gl10[3]);
        gl10 = 16384;
        if (this.f24453k.m22619h()) {
            gl10 = 16640;
            this.f24453k.m22620i();
        }
        if (this.f24453k.m22621j()) {
            x.glClearStencil(0);
            gl10 |= 1024;
            this.f24453k.m22622k();
        }
        x.glClear(gl10);
        if (this.ac > null) {
            this.ac -= 1;
            this.f24461s.mo5221a(true, true);
            return;
        }
        if (this.am != -1) {
            synchronized (this.an) {
                if (this.am < System.currentTimeMillis()) {
                    this.am = -1;
                }
            }
            this.f24461s.m29092d();
        }
        if (this.ao.m22276b() == null) {
            this.ao.m22275a((C4980b) this);
            return;
        }
        boolean z2;
        boolean z3;
        af afVar;
        boolean z4;
        int f;
        Bitmap bitmap;
        Bitmap bitmap2;
        long uptimeMillis;
        int l = m29008l();
        int i = l & 2;
        if (i == 0) {
            if (!this.f24453k.m22615d()) {
                z2 = false;
                this.f24453k.m22636y().m29084a(z2);
                z2 = this.f24461s.m29095g();
                z3 = this.f24460r.mo5248a() == this.f24432H;
                if (z3) {
                    this.f24432H = this.f24460r.mo5248a();
                    z2 = true;
                }
                m29006d(z3);
                this.f24453k.m22617f();
                m29011o();
                this.f24443S = this.f24444T;
                if (this.f24443S != null) {
                    this.f24443S.m22289a(this);
                    this.f24443S.mo4979d();
                }
                afVar = this.f24445U;
                if (this.f24460r.m29253i() > 1.0f) {
                    m29001a(this.f24460r, l, z2);
                    this.f24453k.m22618g();
                }
                Object obj = (this.f24461s.m29096h() || i == 0) ? null : 1;
                if (this.aj || ((this.f24465w.m22776c() && m29005c(this.f24440P)) || this.f24453k.m22615d() || obj != null)) {
                    z = false;
                }
                if (this.f24443S != null) {
                    this.f24443S.m22292b(z);
                    if (this.f24443S.m22295e()) {
                        this.f24461s.mo5221a(false, false);
                    }
                }
                synchronized (this) {
                    z4 = this.f24435K;
                }
                if (z4) {
                    GL10 x2 = this.f24453k.m22635x();
                    i = this.f24460r.m29249e();
                    f = this.f24460r.m29250f();
                    bitmap = this.f24436L;
                    if (!(bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == f)) {
                        bitmap = this.f24462t.m22649a(i, f, Config.ARGB_8888);
                    }
                    bitmap2 = bitmap;
                    int internalFormat = GLUtils.getInternalFormat(bitmap2);
                    int type = GLUtils.getType(bitmap2);
                    Buffer allocate = IntBuffer.allocate(i * f);
                    x2.glReadPixels(0, 0, i, f, internalFormat, type, allocate);
                    bitmap2.setPixels(allocate.array(), 0, i, 0, 0, i, f);
                    synchronized (this) {
                        this.f24436L = bitmap2;
                        this.f24435K = false;
                        notifyAll();
                    }
                }
                if (!this.f24465w.m22776c()) {
                    if (this.f24453k.m22615d()) {
                        if (VERSION.SDK_INT < 9 && !z2 && l == 0) {
                            uptimeMillis = SystemClock.uptimeMillis();
                            if (uptimeMillis - this.f24439O > 10000) {
                                System.gc();
                                this.f24439O = uptimeMillis;
                            }
                        }
                        if (this.f24453k.m22613c() >= 0) {
                            this.f24461s.mo5221a(false, false);
                        }
                        return;
                    }
                }
                this.f24461s.mo5221a(false, false);
            }
        }
        z2 = true;
        this.f24453k.m22636y().m29084a(z2);
        z2 = this.f24461s.m29095g();
        if (this.f24460r.mo5248a() == this.f24432H) {
        }
        if (z3) {
            this.f24432H = this.f24460r.mo5248a();
            z2 = true;
        }
        m29006d(z3);
        this.f24453k.m22617f();
        m29011o();
        this.f24443S = this.f24444T;
        if (this.f24443S != null) {
            this.f24443S.m22289a(this);
            this.f24443S.mo4979d();
        }
        afVar = this.f24445U;
        if (this.f24460r.m29253i() > 1.0f) {
            m29001a(this.f24460r, l, z2);
            this.f24453k.m22618g();
        }
        if (this.f24461s.m29096h()) {
        }
        if (this.aj) {
        }
        z = false;
        if (this.f24443S != null) {
            this.f24443S.m22292b(z);
            if (this.f24443S.m22295e()) {
                this.f24461s.mo5221a(false, false);
            }
        }
        synchronized (this) {
            z4 = this.f24435K;
        }
        if (z4) {
            GL10 x22 = this.f24453k.m22635x();
            i = this.f24460r.m29249e();
            f = this.f24460r.m29250f();
            bitmap = this.f24436L;
            bitmap = this.f24462t.m22649a(i, f, Config.ARGB_8888);
            bitmap2 = bitmap;
            int internalFormat2 = GLUtils.getInternalFormat(bitmap2);
            int type2 = GLUtils.getType(bitmap2);
            Buffer allocate2 = IntBuffer.allocate(i * f);
            x22.glReadPixels(0, 0, i, f, internalFormat2, type2, allocate2);
            bitmap2.setPixels(allocate2.array(), 0, i, 0, 0, i, f);
            synchronized (this) {
                this.f24436L = bitmap2;
                this.f24435K = false;
                notifyAll();
            }
        }
        if (this.f24465w.m22776c()) {
            if (this.f24453k.m22615d()) {
                uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis - this.f24439O > 10000) {
                    System.gc();
                    this.f24439O = uptimeMillis;
                }
                if (this.f24453k.m22613c() >= 0) {
                    this.f24461s.mo5221a(false, false);
                }
                return;
            }
        }
        this.f24461s.mo5221a(false, false);
    }

    /* renamed from: a */
    public final synchronized void m29024a(boolean z) {
        this.f24450Z = z;
        if (this.f24453k != null) {
            this.f24453k.m22636y().m29089b(z);
            if (!z) {
                this.f24453k.m22636y().m29090c();
            }
        }
        m29007k();
    }

    /* renamed from: k */
    private void m29007k() {
        StringBuilder stringBuilder;
        if (this.f24454l >= 0) {
            int i = this.f24450Z ? 10 : this.f24455m;
            try {
                Process.setThreadPriority(this.f24454l, i);
                if (C4728u.m21050a("Renderer", 3)) {
                    stringBuilder = new StringBuilder(21);
                    stringBuilder.append("Priority: ");
                    stringBuilder.append(i);
                    Log.d("Renderer", stringBuilder.toString());
                }
            } catch (RuntimeException e) {
                if (C4728u.m21050a("Renderer", 6)) {
                    String valueOf = String.valueOf(e);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    stringBuilder.append("Could not set thread priority: ");
                    stringBuilder.append(valueOf);
                    Log.e("Renderer", stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void m29016a(af afVar) {
        this.f24444T = afVar;
    }

    /* renamed from: a */
    public final C8076q m29014a(C5016a c5016a) {
        return new C8076q(c5016a, this.f24425A);
    }

    /* renamed from: b */
    public final ac m29025b(boolean z) {
        return new ac(this.f24463u, this.f24425A, z);
    }

    /* renamed from: a */
    public final void m29020a(C6561r c6561r) {
        synchronized (this.f24456n) {
            this.f24457o.add(new C4990b(C4989a.ADD, c6561r));
        }
        this.f24461s.mo5221a(true, false);
    }

    /* renamed from: b */
    public final void m29028b(C6561r c6561r) {
        synchronized (this.f24456n) {
            this.f24457o.add(new C4990b(C4989a.REMOVE, c6561r));
        }
        this.f24461s.mo5221a(true, false);
    }

    /* renamed from: c */
    public final ArrayList<C6561r> m29030c() {
        ArrayList<C6561r> arrayList = new ArrayList(this.f24456n.size());
        synchronized (this.f24456n) {
            arrayList.addAll(this.f24456n);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m29018a(C5002b c5002b) {
        this.f24441Q.add(c5002b);
    }

    /* renamed from: a */
    public final float mo5209a(af afVar) {
        float f;
        synchronized (this.f24456n) {
            Iterator it = this.f24458p.iterator();
            f = 21.0f;
            while (it.hasNext()) {
                f = Math.min(f, ((al) it.next()).m32438a(afVar));
            }
        }
        return f;
    }

    /* renamed from: d */
    public final float mo5214d() {
        return this.aa;
    }

    /* renamed from: l */
    private int m29008l() {
        boolean z = false;
        C6571c c6571c = null;
        int i = 0;
        for (C5002b c5002b : this.f24441Q) {
            int a = c5002b.mo5216a(this.f24460r);
            if (!(a == 0 || c5002b.mo5217e() == null)) {
                c6571c = c5002b.mo5217e();
            }
            i |= a;
        }
        if (i != 0) {
            if (!(c6571c == null || c6571c.equals(this.f24452i))) {
                this.f24449Y.m32446a(c6571c);
                this.f24452i = c6571c;
            }
            this.f24461s.mo5221a(false, false);
        } else {
            this.f24449Y.m32446a(null);
            this.f24452i = null;
        }
        C6570b c6570b = this.f24460r;
        if (i != 0) {
            z = true;
        }
        c6570b.m29240a(z);
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m28999a(com.google.android.m4b.maps.bx.ai.C4988a r9, boolean r10) {
        /*
        r8 = this;
        r0 = r8.f24456n;
        monitor-enter(r0);
        r1 = r8.ai;	 Catch:{ all -> 0x00c5 }
        if (r1 != 0) goto L_0x000b;
    L_0x0007:
        if (r10 != 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r0);	 Catch:{ all -> 0x00c5 }
        return;
    L_0x000b:
        r10 = r8.ai;	 Catch:{ all -> 0x00c5 }
        r1 = 0;
        r8.ai = r1;	 Catch:{ all -> 0x00c5 }
        r2 = r9.m22310a();	 Catch:{ all -> 0x00c5 }
        r3 = r2.length;	 Catch:{ all -> 0x00c5 }
        r4 = r10;
        r10 = 0;
    L_0x0017:
        r5 = 1;
        if (r10 >= r3) goto L_0x0039;
    L_0x001a:
        r6 = r2[r10];	 Catch:{ all -> 0x00c5 }
        r7 = r8.ag;	 Catch:{ all -> 0x00c5 }
        r7 = r7.get(r6);	 Catch:{ all -> 0x00c5 }
        r7 = (java.util.List) r7;	 Catch:{ all -> 0x00c5 }
        if (r7 != 0) goto L_0x0031;
    L_0x0026:
        r7 = new java.util.ArrayList;	 Catch:{ all -> 0x00c5 }
        r7.<init>();	 Catch:{ all -> 0x00c5 }
        r4 = r8.ag;	 Catch:{ all -> 0x00c5 }
        r4.put(r6, r7);	 Catch:{ all -> 0x00c5 }
        r4 = 1;
    L_0x0031:
        r5 = r6.mo7558a(r7);	 Catch:{ all -> 0x00c5 }
        r4 = r4 | r5;
        r10 = r10 + 1;
        goto L_0x0017;
    L_0x0039:
        if (r4 == 0) goto L_0x00c3;
    L_0x003b:
        r10 = r8.ah;	 Catch:{ all -> 0x00c5 }
        r10.clear();	 Catch:{ all -> 0x00c5 }
        r9 = r9.m22310a();	 Catch:{ all -> 0x00c5 }
        r10 = r9.length;	 Catch:{ all -> 0x00c5 }
        r2 = 0;
    L_0x0046:
        if (r2 >= r10) goto L_0x005c;
    L_0x0048:
        r3 = r9[r2];	 Catch:{ all -> 0x00c5 }
        r4 = r8.ag;	 Catch:{ all -> 0x00c5 }
        r3 = r4.get(r3);	 Catch:{ all -> 0x00c5 }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x00c5 }
        if (r3 == 0) goto L_0x0059;
    L_0x0054:
        r4 = r8.ah;	 Catch:{ all -> 0x00c5 }
        r4.addAll(r3);	 Catch:{ all -> 0x00c5 }
    L_0x0059:
        r2 = r2 + 1;
        goto L_0x0046;
    L_0x005c:
        r9 = r8.ah;	 Catch:{ all -> 0x00c5 }
        java.util.Collections.sort(r9);	 Catch:{ all -> 0x00c5 }
        r9 = new java.util.HashSet;	 Catch:{ all -> 0x00c5 }
        r9.<init>();	 Catch:{ all -> 0x00c5 }
        r10 = r8.ah;	 Catch:{ all -> 0x00c5 }
        r10 = r10.iterator();	 Catch:{ all -> 0x00c5 }
    L_0x006c:
        r2 = r10.hasNext();	 Catch:{ all -> 0x00c5 }
        if (r2 == 0) goto L_0x0091;
    L_0x0072:
        r2 = r10.next();	 Catch:{ all -> 0x00c5 }
        r2 = (com.google.android.m4b.maps.bx.ag) r2;	 Catch:{ all -> 0x00c5 }
        r3 = r2.m22297a();	 Catch:{ all -> 0x00c5 }
        r3 = r9.contains(r3);	 Catch:{ all -> 0x00c5 }
        if (r3 != 0) goto L_0x008d;
    L_0x0082:
        r2.m22298a(r5);	 Catch:{ all -> 0x00c5 }
        r2 = r2.m22297a();	 Catch:{ all -> 0x00c5 }
        r9.add(r2);	 Catch:{ all -> 0x00c5 }
        goto L_0x006c;
    L_0x008d:
        r2.m22298a(r1);	 Catch:{ all -> 0x00c5 }
        goto L_0x006c;
    L_0x0091:
        r9.clear();	 Catch:{ all -> 0x00c5 }
        r10 = r8.ah;	 Catch:{ all -> 0x00c5 }
        r10 = com.google.android.m4b.maps.aa.au.m20528a(r10);	 Catch:{ all -> 0x00c5 }
        r10 = r10.iterator();	 Catch:{ all -> 0x00c5 }
    L_0x009e:
        r2 = r10.hasNext();	 Catch:{ all -> 0x00c5 }
        if (r2 == 0) goto L_0x00c3;
    L_0x00a4:
        r2 = r10.next();	 Catch:{ all -> 0x00c5 }
        r2 = (com.google.android.m4b.maps.bx.ag) r2;	 Catch:{ all -> 0x00c5 }
        r3 = r2.m22297a();	 Catch:{ all -> 0x00c5 }
        r3 = r9.contains(r3);	 Catch:{ all -> 0x00c5 }
        if (r3 != 0) goto L_0x00bf;
    L_0x00b4:
        r2.m22301b(r5);	 Catch:{ all -> 0x00c5 }
        r2 = r2.m22297a();	 Catch:{ all -> 0x00c5 }
        r9.add(r2);	 Catch:{ all -> 0x00c5 }
        goto L_0x009e;
    L_0x00bf:
        r2.m22301b(r1);	 Catch:{ all -> 0x00c5 }
        goto L_0x009e;
    L_0x00c3:
        monitor-exit(r0);	 Catch:{ all -> 0x00c5 }
        return;
    L_0x00c5:
        r9 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00c5 }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.ai.a(com.google.android.m4b.maps.bx.ai$a, boolean):void");
    }

    /* renamed from: a */
    private void m29001a(C6570b c6570b, int i, boolean z) {
        int i2;
        boolean z2;
        boolean hashSet;
        C4988a c4988a;
        C5009j c5009j;
        C6561r a;
        StringBuilder stringBuilder;
        long uptimeMillis;
        String valueOf;
        StringBuilder stringBuilder2;
        boolean z3;
        C6570b c6570b2 = c6570b;
        C4988a c4988a2 = i;
        int n = m29010n();
        this.f24453k.m22598B();
        int i3 = this.f24440P;
        if (c6570b.m29252h() != this.f24438N) {
            m29000a(c6570b);
            r1.f24438N = c6570b.m29252h();
        }
        GL10 x = r1.f24453k.m22635x();
        x.glMatrixMode(5888);
        x.glLoadIdentity();
        int i4 = 0;
        x.glMultMatrixf(c6570b.m29263s(), 0);
        for (C6561r a2 : n.m22310a()) {
            a2.mo7038a((int) c4988a2);
        }
        if (z) {
            for (C6561r a22 : n.m22310a()) {
                a22.mo7044a(c6570b2, r1.f24453k);
            }
            r1.f24431G.clear();
            z2 = f24417a;
            r1.f24468z.m32468b(r1.f24431G);
        }
        al[] alVarArr = true;
        if (m29005c((C5008i) i3)) {
            al[] b = n.m22311b();
            Object obj = (c4988a2 & 2) != 0 ? 1 : null;
            r1.f24465w.m22769a((int) c4988a2);
            if (obj != null) {
                r1.f24465w.m22770a(c6570b.m29266v());
                r1.f24437M = true;
            } else if (z || r1.f24437M) {
                ae aeVar = new ae();
                hashSet = new HashSet();
                bp v = c6570b.m29266v();
                obj = (c6570b.m29255k() == 0.0f && c6570b.m29254j() == 0.0f) ? 1 : null;
                bp bpVar = obj != null ? null : v;
                Set hashSet2 = new HashSet();
                Map b2 = ax.m20623b();
                boolean length = b.length;
                C5008i c5008i = i3;
                i3 = 0;
                while (i4 < length) {
                    al[] alVarArr2;
                    boolean z4 = length;
                    al alVar = b[i4];
                    if (alVar.d_()) {
                        alVarArr2 = b;
                        i3 = Math.max(i3, alVar.mo7552a(bpVar, aeVar, (Set) hashSet));
                        alVar.mo7557a(hashSet2, b2);
                    } else {
                        alVarArr2 = b;
                    }
                    i4++;
                    length = z4;
                    b = alVarArr2;
                }
                synchronized (this) {
                    try {
                        C5099e c5099e = r1.f24465w;
                        alVarArr = false;
                        bg j = r1.f24449Y.m32458j();
                    } finally {
                        C6570b c6570b3 = 
/*
Method generation error in method: com.google.android.m4b.maps.bx.ai.a(com.google.android.m4b.maps.bz.b, int, boolean):void, dex: classes2.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: MERGE  (r0_2 'c6570b3' com.google.android.m4b.maps.bz.b) = (r0_1 'c6570b3' com.google.android.m4b.maps.bz.b), (r13_0 'c6570b2' com.google.android.m4b.maps.bz.b) in method: com.google.android.m4b.maps.bx.ai.a(com.google.android.m4b.maps.bz.b, int, boolean):void, dex: classes2.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:203)
	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:100)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:50)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:299)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:229)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:146)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:124)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: MERGE can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 41 more

*/

                        @SuppressLint({"WrongCall"})
                        /* renamed from: d */
                        private synchronized void m29006d(boolean z) {
                            z = this.f24442R.iterator();
                            while (z.hasNext()) {
                                z.next();
                            }
                        }

                        /* renamed from: m */
                        private synchronized android.graphics.Bitmap m29009m() {
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
                            r2 = this;
                            monitor-enter(r2);
                            r0 = 1;
                            r2.f24435K = r0;	 Catch:{ all -> 0x0013 }
                        L_0x0004:
                            r0 = r2.f24435K;	 Catch:{ all -> 0x0013 }
                            if (r0 == 0) goto L_0x000c;
                        L_0x0008:
                            r2.wait();	 Catch:{ InterruptedException -> 0x0004 }
                            goto L_0x0004;
                        L_0x000c:
                            r0 = r2.f24436L;	 Catch:{ all -> 0x0013 }
                            r1 = 0;	 Catch:{ all -> 0x0013 }
                            r2.f24436L = r1;	 Catch:{ all -> 0x0013 }
                            monitor-exit(r2);
                            return r0;
                        L_0x0013:
                            r0 = move-exception;
                            monitor-exit(r2);
                            throw r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.ai.m():android.graphics.Bitmap");
                        }

                        /* renamed from: a */
                        public final synchronized Bitmap m29013a(Bitmap bitmap) {
                            this.f24436L = bitmap;
                            return m29009m();
                        }

                        /* renamed from: c */
                        private void m29004c(C6561r c6561r) {
                            this.ai = true;
                            this.f24456n.add(c6561r);
                        }

                        /* renamed from: n */
                        private C4988a m29010n() {
                            C4988a c4988a;
                            synchronized (this.f24456n) {
                                if (!this.ad) {
                                    Iterator it = this.f24456n.iterator();
                                    while (it.hasNext()) {
                                        ((C6561r) it.next()).mo7041a(this.f24453k, this.f24461s);
                                    }
                                    this.ad = true;
                                }
                                int i = 0;
                                Object obj = null;
                                Object obj2 = null;
                                while (true) {
                                    al alVar = null;
                                    if (i < this.f24457o.size()) {
                                        this.ai = true;
                                        C4990b c4990b = (C4990b) this.f24457o.get(i);
                                        switch (c4990b.f18422b) {
                                            case ADD:
                                                if (!this.f24456n.contains(c4990b.f18421a)) {
                                                    c4990b.f18421a.mo7040a(null);
                                                    if (c4990b.f18421a instanceof al) {
                                                        al alVar2 = (al) c4990b.f18421a;
                                                        alVar2.m32444a(this.f24434J);
                                                        this.f24458p.add(alVar2);
                                                        if (alVar2.mo7046d().ordinal() < this.ae) {
                                                            obj = 1;
                                                        } else {
                                                            alVar2.m32455b(false);
                                                        }
                                                        if (alVar2.m32457i()) {
                                                            Iterator it2 = this.f24459q.iterator();
                                                            while (it2.hasNext()) {
                                                                alVar2.m32443a((bg) it2.next());
                                                            }
                                                        }
                                                    }
                                                    m29004c(c4990b.f18421a);
                                                    C5002b g = c4990b.f18421a.mo7561g();
                                                    if (g != null) {
                                                        m29018a(g);
                                                    }
                                                    c4990b.f18421a.mo7041a(this.f24453k, this.f24461s);
                                                    obj2 = 1;
                                                    break;
                                                }
                                                break;
                                            case REMOVE:
                                                if (!this.f24456n.remove(c4990b.f18421a)) {
                                                    break;
                                                }
                                                if (c4990b.f18421a instanceof al) {
                                                    if (c4990b.f18421a.mo7046d().ordinal() == this.ae) {
                                                        obj = 1;
                                                    }
                                                    this.f24458p.remove(c4990b.f18421a);
                                                }
                                                this.ag.remove(c4990b.f18421a);
                                                c4990b.f18421a.mo7040a(this.f24453k);
                                                C5002b g2 = c4990b.f18421a.mo7561g();
                                                if (g2 == null) {
                                                    break;
                                                }
                                                this.f24441Q.remove(g2);
                                                break;
                                            case REPLACE_BASE_TILE:
                                                this.f24449Y = (al) c4990b.f18421a;
                                                break;
                                            default:
                                                break;
                                        }
                                        i++;
                                    } else {
                                        this.f24457o.clear();
                                        if (obj != null) {
                                            this.ae = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                                            Iterator it3 = this.f24458p.iterator();
                                            while (it3.hasNext()) {
                                                al alVar3 = (al) it3.next();
                                                alVar3.m32455b(false);
                                                if (alVar3.mo7046d().ordinal() < this.ae) {
                                                    this.ae = alVar3.mo7046d().ordinal();
                                                    alVar = alVar3;
                                                }
                                            }
                                            if (alVar != null) {
                                                alVar.m32455b(true);
                                            }
                                        }
                                        if (obj2 != null && this.f24456n.size() > 1) {
                                            Collections.sort(this.f24456n, f24424j);
                                        }
                                        c4988a = new C4988a(this.f24456n, this.f24458p);
                                    }
                                }
                            }
                            return c4988a;
                        }

                        /* renamed from: a */
                        private void m29000a(C6570b c6570b) {
                            int e = c6570b.m29249e();
                            int f = c6570b.m29250f();
                            if (e > 0 && f > 0) {
                                GL10 x = this.f24453k.m22635x();
                                x.glMatrixMode(5889);
                                x.glLoadIdentity();
                                x.glViewport(0, 0, e, f);
                                x.glMultMatrixf(c6570b.m29264t(), 0);
                                x.glEnable(3089);
                                x.glScissor(0, 0, e, f);
                            }
                        }

                        /* renamed from: b */
                        public final void m29027b(C5008i c5008i) {
                            if (c5008i != this.f24440P) {
                                this.f24440P = c5008i;
                                synchronized (this) {
                                    this.f24433I = true;
                                }
                                if (this.f24465w != null) {
                                    this.f24465w.m22774b();
                                    this.f24461s.mo5221a(true, false);
                                }
                            }
                        }

                        /* renamed from: a */
                        public final void m29021a(C5095c c5095c) {
                            if (c5095c != this.f24451h) {
                                this.f24451h = c5095c;
                                if (this.f24465w != null) {
                                    this.f24465w.m22772a(c5095c);
                                    this.f24461s.mo5221a(true, false);
                                }
                            }
                        }

                        /* renamed from: c */
                        public final void m29031c(boolean z) {
                            synchronized (this) {
                                this.f24448X = z ? true : true;
                            }
                            this.f24461s.mo5221a(false, false);
                        }

                        /* renamed from: o */
                        private void m29011o() {
                            synchronized (this) {
                                int i = this.f24448X;
                                boolean z = false;
                                this.f24448X = 0;
                            }
                            if (i != 0) {
                                if (i == 2) {
                                    z = true;
                                }
                                if (C4728u.m21050a("Renderer", 3)) {
                                    String str = "Renderer";
                                    String str2 = "onLowMemory";
                                    String valueOf = String.valueOf(z ? " critical" : "");
                                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                                }
                                this.f24465w.m22773a(z);
                                synchronized (this.f24456n) {
                                    Iterator it = this.f24456n.iterator();
                                    while (it.hasNext()) {
                                        ((C6561r) it.next()).mo7042a(z);
                                    }
                                }
                            }
                        }

                        /* renamed from: a */
                        public final void m29019a(C5003c c5003c, C5006e c5006e) {
                            this.f24425A.m32476a(c5003c, c5006e);
                        }

                        /* renamed from: e */
                        public final void m29033e() {
                            this.f24425A.m32486f();
                        }

                        /* renamed from: f */
                        public final C7481o m29034f() {
                            return this.f24425A;
                        }

                        /* renamed from: g */
                        public final C7507b m29035g() {
                            return this.f24426B;
                        }

                        /* renamed from: h */
                        public final al m29036h() {
                            return this.f24449Y;
                        }

                        /* renamed from: i */
                        public final C5052d m29037i() {
                            return this.f24453k;
                        }

                        /* renamed from: j */
                        public final ab m29038j() {
                            return this.f24466x;
                        }

                        /* renamed from: a */
                        public final void mo5210a() {
                            this.f24461s.mo5221a(false, false);
                        }

                        /* renamed from: c */
                        private static boolean m29005c(C5008i c5008i) {
                            return (c5008i == C5008i.NONE || c5008i == C5008i.RASTER_ONLY) ? null : true;
                        }

                        /* renamed from: a */
                        public final void m29017a(al alVar) {
                            synchronized (this.f24456n) {
                                this.f24457o.add(new C4990b(C4989a.ADD, alVar));
                                this.f24457o.add(new C4990b(C4989a.REPLACE_BASE_TILE, alVar));
                                this.f24457o.add(new C4990b(C4989a.REMOVE, this.f24449Y));
                            }
                            if (this.f24465w != null) {
                                this.f24465w.m22774b();
                            }
                            this.f24461s.mo5221a(true, false);
                        }
                    }
