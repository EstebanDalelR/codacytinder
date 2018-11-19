package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.js.C2383k;
import com.google.android.gms.ads.internal.overlay.C2394a;
import com.google.android.gms.ads.internal.overlay.C2400j;
import com.google.android.gms.ads.internal.overlay.C2404n;
import com.google.android.gms.ads.internal.overlay.C2405o;
import com.google.android.gms.common.util.C3827e;
import com.google.android.gms.common.util.zzd;
import com.google.android.gms.internal.agp;
import com.google.android.gms.internal.ahk;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.ahv;
import com.google.android.gms.internal.alt;
import com.google.android.gms.internal.aqo;
import com.google.android.gms.internal.aqw;
import com.google.android.gms.internal.arp;
import com.google.android.gms.internal.aum;
import com.google.android.gms.internal.awd;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.de;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.fv;
import com.google.android.gms.internal.fw;
import com.google.android.gms.internal.fy;
import com.google.android.gms.internal.fz;
import com.google.android.gms.internal.ga;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gc;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.jb;
import com.google.android.gms.internal.km;
import com.google.android.gms.internal.kz;
import com.google.android.gms.internal.zzzv;

@zzzv
public final class ar {
    /* renamed from: a */
    private static final Object f7113a = new Object();
    /* renamed from: b */
    private static ar f7114b;
    /* renamed from: A */
    private final C2409y f7115A;
    /* renamed from: B */
    private final ahv f7116B;
    /* renamed from: C */
    private final de f7117C;
    /* renamed from: D */
    private final km f7118D;
    /* renamed from: E */
    private final jb f7119E;
    /* renamed from: F */
    private final C2383k f7120F;
    /* renamed from: G */
    private final gc f7121G;
    /* renamed from: H */
    private final hj f7122H;
    /* renamed from: c */
    private final C2394a f7123c = new C2394a();
    /* renamed from: d */
    private final awd f7124d = new awd();
    /* renamed from: e */
    private final C2400j f7125e = new C2400j();
    /* renamed from: f */
    private final aum f7126f = new aum();
    /* renamed from: g */
    private final fk f7127g = new fk();
    /* renamed from: h */
    private final kz f7128h = new kz();
    /* renamed from: i */
    private final fq f7129i;
    /* renamed from: j */
    private final agp f7130j;
    /* renamed from: k */
    private final dq f7131k;
    /* renamed from: l */
    private final ahk f7132l;
    /* renamed from: m */
    private final ahl f7133m;
    /* renamed from: n */
    private final zzd f7134n;
    /* renamed from: o */
    private final C2371d f7135o;
    /* renamed from: p */
    private final alt f7136p;
    /* renamed from: q */
    private final gj f7137q;
    /* renamed from: r */
    private final bd f7138r;
    /* renamed from: s */
    private final ix f7139s;
    /* renamed from: t */
    private final aqo f7140t;
    /* renamed from: u */
    private final aqw f7141u;
    /* renamed from: v */
    private final hb f7142v;
    /* renamed from: w */
    private final C2404n f7143w;
    /* renamed from: x */
    private final C2405o f7144x;
    /* renamed from: y */
    private final arp f7145y;
    /* renamed from: z */
    private final hc f7146z;

    static {
        ar arVar = new ar();
        synchronized (f7113a) {
            f7114b = arVar;
        }
    }

    protected ar() {
        int i = VERSION.SDK_INT;
        fq gbVar = i >= 21 ? new gb() : i >= 19 ? new ga() : i >= 18 ? new fy() : i >= 17 ? new fw() : i >= 16 ? new fz() : new fv();
        this.f7129i = gbVar;
        this.f7130j = new agp();
        this.f7131k = new dq(this.f7127g);
        this.f7132l = new ahk();
        this.f7133m = new ahl();
        this.f7134n = C3827e.m14460a();
        this.f7135o = new C2371d();
        this.f7136p = new alt();
        this.f7137q = new gj();
        this.f7138r = new bd();
        this.f7120F = new C2383k();
        this.f7139s = new ix();
        this.f7140t = new aqo();
        this.f7141u = new aqw();
        this.f7142v = new hb();
        this.f7143w = new C2404n();
        this.f7144x = new C2405o();
        this.f7145y = new arp();
        this.f7146z = new hc();
        this.f7115A = new C2409y();
        this.f7116B = new ahv();
        this.f7117C = new de();
        this.f7118D = new km();
        this.f7119E = new jb();
        this.f7121G = new gc();
        this.f7122H = new hj();
    }

    /* renamed from: A */
    public static C2383k m8640A() {
        return m8643D().f7120F;
    }

    /* renamed from: B */
    public static gc m8641B() {
        return m8643D().f7121G;
    }

    /* renamed from: C */
    public static hj m8642C() {
        return m8643D().f7122H;
    }

    /* renamed from: D */
    private static ar m8643D() {
        ar arVar;
        synchronized (f7113a) {
            arVar = f7114b;
        }
        return arVar;
    }

    /* renamed from: a */
    public static awd m8644a() {
        return m8643D().f7124d;
    }

    /* renamed from: b */
    public static C2394a m8645b() {
        return m8643D().f7123c;
    }

    /* renamed from: c */
    public static C2400j m8646c() {
        return m8643D().f7125e;
    }

    /* renamed from: d */
    public static aum m8647d() {
        return m8643D().f7126f;
    }

    /* renamed from: e */
    public static fk m8648e() {
        return m8643D().f7127g;
    }

    /* renamed from: f */
    public static kz m8649f() {
        return m8643D().f7128h;
    }

    /* renamed from: g */
    public static fq m8650g() {
        return m8643D().f7129i;
    }

    /* renamed from: h */
    public static agp m8651h() {
        return m8643D().f7130j;
    }

    /* renamed from: i */
    public static dq m8652i() {
        return m8643D().f7131k;
    }

    /* renamed from: j */
    public static ahl m8653j() {
        return m8643D().f7133m;
    }

    /* renamed from: k */
    public static zzd m8654k() {
        return m8643D().f7134n;
    }

    /* renamed from: l */
    public static C2371d m8655l() {
        return m8643D().f7135o;
    }

    /* renamed from: m */
    public static alt m8656m() {
        return m8643D().f7136p;
    }

    /* renamed from: n */
    public static gj m8657n() {
        return m8643D().f7137q;
    }

    /* renamed from: o */
    public static bd m8658o() {
        return m8643D().f7138r;
    }

    /* renamed from: p */
    public static ix m8659p() {
        return m8643D().f7139s;
    }

    /* renamed from: q */
    public static aqo m8660q() {
        return m8643D().f7140t;
    }

    /* renamed from: r */
    public static aqw m8661r() {
        return m8643D().f7141u;
    }

    /* renamed from: s */
    public static hb m8662s() {
        return m8643D().f7142v;
    }

    /* renamed from: t */
    public static C2404n m8663t() {
        return m8643D().f7143w;
    }

    /* renamed from: u */
    public static C2405o m8664u() {
        return m8643D().f7144x;
    }

    /* renamed from: v */
    public static arp m8665v() {
        return m8643D().f7145y;
    }

    /* renamed from: w */
    public static hc m8666w() {
        return m8643D().f7146z;
    }

    /* renamed from: x */
    public static km m8667x() {
        return m8643D().f7118D;
    }

    /* renamed from: y */
    public static jb m8668y() {
        return m8643D().f7119E;
    }

    /* renamed from: z */
    public static de m8669z() {
        return m8643D().f7117C;
    }
}
