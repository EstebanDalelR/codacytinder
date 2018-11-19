package com.google.android.m4b.maps.bc;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.bc.C6450v.C4770a;
import com.google.android.m4b.maps.bd.C4774a;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.C6516c.C4844a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C5003c;
import com.google.android.m4b.maps.bx.C5008i;
import com.google.android.m4b.maps.bx.C6561r;
import com.google.android.m4b.maps.bx.C6563w;
import com.google.android.m4b.maps.bx.C6563w.C5020a;
import com.google.android.m4b.maps.bx.C6563w.C5021b;
import com.google.android.m4b.maps.bx.C7478d.C5004a;
import com.google.android.m4b.maps.bx.C7481o;
import com.google.android.m4b.maps.bx.aa;
import com.google.android.m4b.maps.bx.al;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.bx.ap;
import com.google.android.m4b.maps.bx.ar;
import com.google.android.m4b.maps.bx.ar.C5000b;
import com.google.android.m4b.maps.cc.C8206g;
import com.google.android.m4b.maps.ce.C5095c;
import com.google.android.m4b.maps.cg.C5162c;
import com.google.android.m4b.maps.cg.C5173d;
import com.google.android.m4b.maps.cg.C5177h;
import com.google.android.m4b.maps.cg.C5180j;
import com.google.android.m4b.maps.cg.C5195w;
import com.google.android.m4b.maps.cg.C7519u;
import com.google.android.m4b.maps.cg.ac;
import com.google.android.m4b.maps.cg.an;
import com.google.android.m4b.maps.cg.ba.C5145a;
import com.google.android.m4b.maps.cg.bc.C5146a;
import com.google.android.m4b.maps.cg.be;
import com.google.android.m4b.maps.cg.bo;
import com.google.android.m4b.maps.cg.by;
import com.google.android.m4b.maps.cg.cb;
import com.google.android.m4b.maps.cg.ce;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.PointOfInterest;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p124x.C5549q;
import com.google.android.m4b.maps.p124x.C5551s;
import com.google.android.m4b.maps.p124x.C5558z;
import com.google.android.m4b.maps.p125y.C5579p;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.m4b.maps.bc.w */
public final class C7449w extends C6563w implements C6450v {
    /* renamed from: a */
    private final ap f27309a;
    /* renamed from: b */
    private final C4769u f27310b;
    /* renamed from: c */
    private final C6429a f27311c;
    /* renamed from: d */
    private final C7446m f27312d;
    /* renamed from: e */
    private final C6430c f27313e;
    /* renamed from: f */
    private final ar f27314f;
    /* renamed from: g */
    private final C5195w f27315g;
    /* renamed from: h */
    private final C5021b f27316h;
    /* renamed from: i */
    private final C6436h f27317i;
    /* renamed from: j */
    private final C4773a f27318j;
    /* renamed from: k */
    private final C6435g f27319k;
    /* renamed from: l */
    private final C6438k f27320l;
    /* renamed from: m */
    private final C7447q f27321m;
    /* renamed from: n */
    private C5549q f27322n;
    /* renamed from: o */
    private C5551s f27323o;
    /* renamed from: p */
    private C6561r f27324p;
    /* renamed from: q */
    private C6561r f27325q;
    /* renamed from: r */
    private C6561r f27326r;
    /* renamed from: s */
    private aa f27327s;
    /* renamed from: t */
    private com.google.android.m4b.maps.ay.aa f27328t;
    /* renamed from: u */
    private C7519u f27329u;
    /* renamed from: v */
    private int f27330v = 1;
    /* renamed from: w */
    private C5162c f27331w;

    /* renamed from: com.google.android.m4b.maps.bc.w$1 */
    class C47711 implements Runnable {
        C47711() {
        }

        public final void run() {
            C4728u.m21049a("Failed to load map. Error contacting Google servers. This is probably an authentication issue (but could be due to network errors).");
        }
    }

    /* renamed from: com.google.android.m4b.maps.bc.w$5 */
    class C47725 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ C7449w f17449a;

        C47725(C7449w c7449w) {
            this.f17449a = c7449w;
        }

        public final void run() {
            super.mo7051a(true, false);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bc.w$a */
    interface C4773a {
        /* renamed from: a */
        aa mo5005a(Resources resources);

        /* renamed from: a */
        al mo5006a(bg bgVar, Resources resources);

        /* renamed from: a */
        al mo5007a(al alVar, Resources resources);

        /* renamed from: b */
        al mo5008b(Resources resources);

        /* renamed from: b */
        al mo5009b(bg bgVar, Resources resources);

        /* renamed from: c */
        al mo5010c(bg bgVar, Resources resources);
    }

    /* renamed from: com.google.android.m4b.maps.bc.w$2 */
    class C64512 implements C4773a {
        /* renamed from: a */
        private /* synthetic */ C5203e f23962a;
        /* renamed from: b */
        private /* synthetic */ C4981g f23963b;
        /* renamed from: c */
        private /* synthetic */ String f23964c;
        /* renamed from: d */
        private /* synthetic */ C6435g f23965d;

        C64512(C5203e c5203e, C4981g c4981g, String str, C6435g c6435g) {
            this.f23962a = c5203e;
            this.f23963b = c4981g;
            this.f23964c = str;
            this.f23965d = c6435g;
        }

        /* renamed from: a */
        public final al mo5006a(bg bgVar, Resources resources) {
            return al.m32436c(bgVar, resources, this.f23962a, this.f23963b);
        }

        /* renamed from: b */
        public final al mo5009b(bg bgVar, Resources resources) {
            al a = al.m32430a(bgVar, resources, this.f23962a, this.f23963b);
            C7449w.m32133a(a, this.f23964c);
            return a;
        }

        /* renamed from: a */
        public final aa mo5005a(Resources resources) {
            return (aa) al.m32428a(resources, this.f23965d.m28180e(), this.f23962a, this.f23963b);
        }

        /* renamed from: a */
        public final al mo5007a(al alVar, Resources resources) {
            alVar = al.m32429a(alVar.m32461m(), bg.f17745a, resources, this.f23962a, this.f23963b);
            C7449w.m32133a(alVar, this.f23964c);
            return alVar;
        }

        /* renamed from: c */
        public final al mo5010c(bg bgVar, Resources resources) {
            return al.m32435b(bgVar, resources, this.f23962a, this.f23963b);
        }

        /* renamed from: b */
        public final /* synthetic */ al mo5008b(Resources resources) {
            al a = al.m32432a(resources, bg.f17750f, this.f23962a, this.f23963b);
            C7449w.m32133a(a, this.f23964c);
            return a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bc.w$3 */
    class C64523 implements C5000b {
        /* renamed from: a */
        private /* synthetic */ C7449w f23966a;

        C64523(C7449w c7449w) {
            this.f23966a = c7449w;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bc.w$4 */
    class C64534 implements C5021b {
        /* renamed from: a */
        private /* synthetic */ C7449w f23967a;

        C64534(C7449w c7449w) {
            this.f23967a = c7449w;
        }

        /* renamed from: a */
        public final void mo5011a(af afVar) {
            if (this.f23967a.f27323o != null) {
                try {
                    this.f23967a.f27323o.mo5802a(C4754b.m21097a(afVar));
                } catch (af afVar2) {
                    throw new RuntimeRemoteException(afVar2);
                }
            }
        }

        /* renamed from: b */
        public final void mo5012b(af afVar) {
            if (this.f23967a.f27322n != null) {
                try {
                    this.f23967a.f27322n.mo5800a(C4754b.m21097a(afVar));
                } catch (af afVar2) {
                    throw new RuntimeRemoteException(afVar2);
                }
            }
        }
    }

    /* renamed from: d */
    public final View mo5339d() {
        return this;
    }

    /* renamed from: a */
    public static C6450v m32130a(C5173d c5173d, ScheduledExecutorService scheduledExecutorService, View view, C5177h c5177h, String str, boolean z, TextView textView, an anVar, cb cbVar, C5162c c5162c) {
        Context c = c5173d.m23113c();
        Resources d = c5173d.m23114d();
        C6413m a = c5173d.m23111a().m23167a();
        C5203e i = c5173d.m23119i();
        C4981g c4981g = new C4981g(c, a, new C47711(), i, c5173d.m23111a());
        C4756e.m21101a(c5173d, c4981g);
        ap apVar = new ap(c5173d.m23114d());
        ar arVar = new ar(a);
        C6435g a2 = C6435g.m28162a(C6487i.m28476a(), new Handler(Looper.getMainLooper()), cbVar);
        String str2 = str;
        C4773a c64512 = new C64512(i, c4981g, str2, a2);
        if (!C5579p.m24319b(str)) {
            ao.m22330a(bg.f17754j, c, d, a, i);
            ao.m22330a(bg.f17757m, c, d, a, i);
        }
        if (c5162c != null) {
            ao.m22330a(c5162c.m23079c(), c, d, a, i);
        }
        C5203e c5203e = i;
        C6413m c6413m = a;
        return new C7449w(c, d, apVar, arVar, c64512, a2, scheduledExecutorService, view, c5177h, str2, z, textView, anVar, c5173d.m23116f(), c5173d.m23112b(), c6413m, c5203e, c4981g, c5162c);
    }

    private C7449w(Context context, Resources resources, ap apVar, ar arVar, C4773a c4773a, C6435g c6435g, ScheduledExecutorService scheduledExecutorService, View view, C5177h c5177h, String str, boolean z, TextView textView, an anVar, com.google.android.m4b.maps.ay.aa aaVar, ce ceVar, C6413m c6413m, C5203e c5203e, C4981g c4981g, C5162c c5162c) {
        super(context, resources, textView, c5177h.m23140e(), c5203e, c4981g, c5162c);
        this.f27328t = aaVar;
        this.f27309a = apVar;
        this.f27309a.m29054a(67.5f);
        this.f27310b = new C4769u(this.f27309a, this);
        m29169a(this.f27309a);
        m22484i(true);
        m22485j(z ^ 1);
        this.f27314f = arVar;
        this.f27314f.m22351a(new C64523(this));
        this.f27309a.m29059a(this.f27314f);
        this.f27312d = new C7446m(this, scheduledExecutorService, c6413m, c5203e, c4981g);
        this.f27313e = C6430c.m28111a(this, this.f27310b, this.f27328t);
        this.f27329u = new C7519u(this, this.f27313e);
        ViewCompat.a(this, this.f27329u);
        this.f27311c = new C6429a(this, this.f27310b, new Handler(Looper.getMainLooper()));
        this.f27320l = new C6438k(this);
        this.f27317i = C6436h.m28181a(this, anVar);
        this.f27319k = c6435g;
        this.f27318j = c4773a;
        this.f27331w = c5162c;
        if (!C5579p.m24319b(str)) {
            m29168a(r8.f27318j.mo5009b(bg.f17745a, getResources()));
        }
        r8.f27321m = new C7447q(r8, view, c5177h.m23135a(), false, by.m23061a(), ceVar);
        r8.f27316h = new C64534(r8);
        r8.f27315g = new C5195w(new C47725(r8));
        m29172a(r8.f27318j.mo5009b(bg.f17759o, getResources()));
        m29175a(C4774a.m21152a(resources) ? C5095c.f18880u : C5095c.f18879t);
        m29172a(r8.f27313e.m28126c());
        m29172a(r8.f27312d);
    }

    /* renamed from: D */
    private void m32128D() {
        if (this.f27322n == null && this.f27323o == null) {
            m29174a(null);
        } else {
            m29174a(this.f27316h);
        }
    }

    /* renamed from: a */
    public final void mo5239a() {
        mo5337b(false);
        m22485j(false);
        super.mo5239a();
    }

    /* renamed from: b */
    public final void mo7052b() {
        this.f27317i.m28183a();
        this.f27315g.m23190a();
    }

    /* renamed from: a */
    public final void mo5333a(C5549q c5549q) {
        this.f27322n = c5549q;
        m32128D();
    }

    /* renamed from: a */
    public final void mo5334a(C5551s c5551s) {
        this.f27323o = c5551s;
        m32128D();
    }

    /* renamed from: a */
    public final void mo7050a(final C4770a c4770a) {
        if (c4770a == null) {
            m29173a((C5020a) null);
        } else {
            m29173a(new C5020a(this) {
                /* renamed from: b */
                private /* synthetic */ C7449w f23969b;

                /* renamed from: b */
                public final boolean mo5014b(af afVar) {
                    return false;
                }

                /* renamed from: a */
                public final boolean mo5013a(af afVar) {
                    return c4770a.mo7048f();
                }
            });
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return m29198w();
    }

    public final boolean canScrollVertically(int i) {
        return m29198w();
    }

    /* renamed from: c */
    public final C7481o mo7053c() {
        return m29161A().m29034f();
    }

    /* renamed from: e */
    public final C5180j mo5340e() {
        return this.f27311c;
    }

    /* renamed from: f */
    public final C5145a mo5342f() {
        return this.f27313e;
    }

    /* renamed from: g */
    public final be mo5344g() {
        return this.f27312d;
    }

    /* renamed from: h */
    public final C5146a mo5346h() {
        return this.f27320l;
    }

    /* renamed from: i */
    public final ac mo5348i() {
        return this.f27319k;
    }

    /* renamed from: j */
    public final bo mo5349j() {
        return this.f27321m;
    }

    /* renamed from: a */
    public final boolean mo5336a(boolean z) {
        if (z) {
            if (this.f27324p == null) {
                this.f27324p = this.f27318j.mo5008b(getResources());
                m29172a(this.f27324p);
            }
        } else if (this.f27324p != null) {
            m29178b(this.f27324p);
            this.f27324p = null;
        }
        return z;
    }

    /* renamed from: E */
    private boolean m32129E() {
        return this.f27319k != null && this.f27319k.m28179d();
    }

    /* renamed from: b */
    public final boolean mo5337b(boolean z) {
        if (!(this.f27319k == null || m32129E() == z)) {
            if (!z) {
                this.f27314f.m22350a(null);
                m29178b(this.f27327s);
                this.f27327s.m34276f();
                this.f27327s = null;
                this.f27319k.m28174b();
            } else if (this.f27319k.m28172a()) {
                z = this.f27318j;
                getContext();
                this.f27327s = z.mo5005a(getResources());
                m29172a((C6561r) this.f27327s);
            }
        }
        return m32129E();
    }

    /* renamed from: c */
    public final boolean mo5338c(boolean z) {
        if (z) {
            if (this.f27325q == null) {
                this.f27325q = this.f27318j.mo5007a(m29162B(), getResources());
                m29172a(this.f27325q);
            }
        } else if (this.f27325q != null) {
            m29178b(this.f27325q);
            this.f27325q = null;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo5332a(int i) {
        bg c;
        C5008i c5008i;
        if (this.f27331w != null && this.f27331w.m23077a()) {
            c = this.f27331w.m23079c();
            c5008i = C5008i.AMBIENT;
        } else if (i != 0) {
            switch (i) {
                case 2:
                    c = bg.f17748d;
                    c5008i = C5008i.RASTER_ONLY;
                    break;
                case 3:
                    c = bg.f17749e;
                    c5008i = C5008i.TERRAIN;
                    break;
                case 4:
                    c = bg.f17748d;
                    c5008i = C5008i.HYBRID;
                    break;
                default:
                    c = bg.f17745a;
                    c5008i = C5008i.NORMAL;
                    break;
            }
        } else {
            c5008i = C5008i.RASTER_ONLY;
            c = null;
        }
        if (this.f27326r != null) {
            m29178b(this.f27326r);
            this.f27326r = null;
        }
        if (!(c == null || c == bg.f17745a)) {
            if (this.f27331w == null || c != this.f27331w.m23079c()) {
                this.f27326r = this.f27318j.mo5006a(c, getResources());
            } else {
                this.f27326r = this.f27318j.mo5010c(c, getResources());
            }
            m29172a(this.f27326r);
        }
        this.f27330v = i;
        m29171a(c5008i);
    }

    /* renamed from: k */
    public final void mo5350k() {
        ao.m22337d();
    }

    /* renamed from: a */
    public final void mo7051a(boolean z, boolean z2) {
        this.f27329u.m33161b();
        super.mo7051a(z, z2);
    }

    /* renamed from: a */
    public final void mo5226a(float f, float f2) {
        this.f27329u.m33161b();
        super.mo5226a(f, f2);
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f27329u.a(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* renamed from: l */
    public final C5162c mo5351l() {
        return this.f27331w;
    }

    /* renamed from: m */
    public final void mo5352m() {
        if (this.f27331w != null) {
            mo5332a(this.f27330v);
        }
    }

    /* renamed from: a */
    public final void mo5335a(final C5558z c5558z) {
        if (c5558z == null) {
            m29161A().m29038j().m32462a(null);
        } else {
            m29161A().m29038j().m32462a(new C5004a(this) {
                /* renamed from: b */
                private /* synthetic */ C7449w f23971b;

                /* renamed from: a */
                public final void mo4934a(C5003c c5003c) {
                    ab.m27951d();
                    if (c5003c instanceof C8206g) {
                        ag j = ((C8206g) c5003c).m34997j();
                        String f = j.m28547f();
                        af c = j.m28544c();
                        try {
                            c5558z.mo5812a(new PointOfInterest(new LatLng(c.m21481b(), c.m21485d()), f, c5003c.mo5285h()));
                        } catch (C5003c c5003c2) {
                            throw new RuntimeRemoteException(c5003c2);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m32133a(al alVar, String str) {
        if (!C5579p.m24319b(str)) {
            alVar.m32452a(new C4844a().m21738a(str).m21739a());
        }
    }
}
