package com.google.android.m4b.maps.bc;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.SurfaceView;
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
import com.google.android.m4b.maps.bx.C6562v;
import com.google.android.m4b.maps.bx.C6562v.C5018a;
import com.google.android.m4b.maps.bx.C6562v.C5019b;
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

/* renamed from: com.google.android.m4b.maps.bc.r */
public final class C7448r extends C6562v implements C6450v {
    /* renamed from: a */
    private final ap f27286a;
    /* renamed from: b */
    private final C4769u f27287b;
    /* renamed from: c */
    private final C6429a f27288c;
    /* renamed from: d */
    private final C7446m f27289d;
    /* renamed from: e */
    private final C6430c f27290e;
    /* renamed from: f */
    private final ar f27291f;
    /* renamed from: g */
    private final C5195w f27292g;
    /* renamed from: h */
    private final C5019b f27293h;
    /* renamed from: i */
    private final C6436h f27294i;
    /* renamed from: j */
    private final C4766a f27295j;
    /* renamed from: k */
    private final C6435g f27296k;
    /* renamed from: l */
    private final C6438k f27297l;
    /* renamed from: m */
    private final C7447q f27298m;
    /* renamed from: n */
    private C5549q f27299n;
    /* renamed from: o */
    private C5551s f27300o;
    /* renamed from: p */
    private C6561r f27301p;
    /* renamed from: q */
    private C6561r f27302q;
    /* renamed from: r */
    private C6561r f27303r;
    /* renamed from: s */
    private aa f27304s;
    /* renamed from: t */
    private com.google.android.m4b.maps.ay.aa f27305t;
    /* renamed from: u */
    private C7519u f27306u;
    /* renamed from: v */
    private int f27307v = 1;
    /* renamed from: w */
    private C5162c f27308w;

    /* renamed from: com.google.android.m4b.maps.bc.r$1 */
    class C47641 implements Runnable {
        C47641() {
        }

        public final void run() {
            C4728u.m21049a("Failed to load map. Error contacting Google servers. This is probably an authentication issue (but could be due to network errors).");
        }
    }

    /* renamed from: com.google.android.m4b.maps.bc.r$5 */
    class C47655 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ C7448r f17439a;

        C47655(C7448r c7448r) {
            this.f17439a = c7448r;
        }

        public final void run() {
            super.mo7051a(true, false);
        }
    }

    /* renamed from: com.google.android.m4b.maps.bc.r$a */
    interface C4766a {
        /* renamed from: a */
        aa mo4989a(Resources resources);

        /* renamed from: a */
        al mo4990a(bg bgVar, Resources resources);

        /* renamed from: a */
        al mo4991a(al alVar, Resources resources);

        /* renamed from: b */
        al mo4992b(Resources resources);

        /* renamed from: b */
        al mo4993b(bg bgVar, Resources resources);

        /* renamed from: c */
        al mo4994c(bg bgVar, Resources resources);
    }

    /* renamed from: com.google.android.m4b.maps.bc.r$2 */
    class C64432 implements C4766a {
        /* renamed from: a */
        private /* synthetic */ C5203e f23922a;
        /* renamed from: b */
        private /* synthetic */ C4981g f23923b;
        /* renamed from: c */
        private /* synthetic */ String f23924c;
        /* renamed from: d */
        private /* synthetic */ C6435g f23925d;

        C64432(C5203e c5203e, C4981g c4981g, String str, C6435g c6435g) {
            this.f23922a = c5203e;
            this.f23923b = c4981g;
            this.f23924c = str;
            this.f23925d = c6435g;
        }

        /* renamed from: a */
        public final al mo4990a(bg bgVar, Resources resources) {
            return al.m32436c(bgVar, resources, this.f23922a, this.f23923b);
        }

        /* renamed from: b */
        public final al mo4993b(bg bgVar, Resources resources) {
            al a = al.m32430a(bgVar, resources, this.f23922a, this.f23923b);
            C7448r.m32103a(a, this.f23924c);
            return a;
        }

        /* renamed from: a */
        public final aa mo4989a(Resources resources) {
            return (aa) al.m32428a(resources, this.f23925d.m28180e(), this.f23922a, this.f23923b);
        }

        /* renamed from: a */
        public final al mo4991a(al alVar, Resources resources) {
            alVar = al.m32429a(alVar.m32461m(), bg.f17745a, resources, this.f23922a, this.f23923b);
            C7448r.m32103a(alVar, this.f23924c);
            return alVar;
        }

        /* renamed from: c */
        public final al mo4994c(bg bgVar, Resources resources) {
            return al.m32435b(bgVar, resources, this.f23922a, this.f23923b);
        }

        /* renamed from: b */
        public final /* synthetic */ al mo4992b(Resources resources) {
            al a = al.m32432a(resources, bg.f17750f, this.f23922a, this.f23923b);
            C7448r.m32103a(a, this.f23924c);
            return a;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bc.r$3 */
    class C64443 implements C5000b {
        /* renamed from: a */
        private /* synthetic */ C7448r f23926a;

        C64443(C7448r c7448r) {
            this.f23926a = c7448r;
        }
    }

    /* renamed from: com.google.android.m4b.maps.bc.r$4 */
    class C64454 implements C5019b {
        /* renamed from: a */
        private /* synthetic */ C7448r f23927a;

        C64454(C7448r c7448r) {
            this.f23927a = c7448r;
        }

        /* renamed from: a */
        public final void mo4995a(af afVar) {
            if (this.f23927a.f27300o != null) {
                try {
                    this.f23927a.f27300o.mo5802a(C4754b.m21097a(afVar));
                } catch (af afVar2) {
                    throw new RuntimeRemoteException(afVar2);
                }
            }
        }

        /* renamed from: b */
        public final void mo4996b(af afVar) {
            if (this.f23927a.f27299n != null) {
                try {
                    this.f23927a.f27299n.mo5800a(C4754b.m21097a(afVar));
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
    public static C6450v m32100a(C5173d c5173d, ScheduledExecutorService scheduledExecutorService, View view, C5177h c5177h, String str, boolean z, TextView textView, an anVar, cb cbVar, C5162c c5162c) {
        Context c = c5173d.m23113c();
        Resources d = c5173d.m23114d();
        C6413m a = c5173d.m23111a().m23167a();
        C5203e i = c5173d.m23119i();
        C4981g c4981g = new C4981g(c, a, new C47641(), i, c5173d.m23111a());
        C4756e.m21101a(c5173d, c4981g);
        ap apVar = new ap(c5173d.m23114d());
        ar arVar = new ar(a);
        C6435g a2 = C6435g.m28162a(C6487i.m28476a(), new Handler(Looper.getMainLooper()), cbVar);
        String str2 = str;
        C4766a c64432 = new C64432(i, c4981g, str2, a2);
        if (!C5579p.m24319b(str)) {
            ao.m22330a(bg.f17754j, c, d, a, i);
            ao.m22330a(bg.f17757m, c, d, a, i);
        }
        if (c5162c != null) {
            ao.m22330a(c5162c.m23079c(), c, d, a, i);
        }
        C5203e c5203e = i;
        C6413m c6413m = a;
        return new C7448r(c, d, apVar, arVar, c64432, a2, scheduledExecutorService, view, c5177h, str2, z, textView, anVar, c5173d.m23116f(), c5173d.m23112b(), c6413m, c5203e, c4981g, c5162c);
    }

    private C7448r(Context context, Resources resources, ap apVar, ar arVar, C4766a c4766a, C6435g c6435g, ScheduledExecutorService scheduledExecutorService, View view, C5177h c5177h, String str, boolean z, TextView textView, an anVar, com.google.android.m4b.maps.ay.aa aaVar, ce ceVar, C6413m c6413m, C5203e c5203e, C4981g c4981g, C5162c c5162c) {
        super(context, resources, textView, c5177h.m23140e(), c5203e, c4981g, c5162c);
        this.f27305t = aaVar;
        this.f27286a = apVar;
        this.f27286a.m29054a(67.5f);
        this.f27287b = new C4769u(this.f27286a, this);
        m29127a(this.f27286a);
        m22539i(true);
        m22540j(z ^ 1);
        this.f27291f = arVar;
        this.f27291f.m22351a(new C64443(this));
        this.f27286a.m29059a(this.f27291f);
        this.f27289d = new C7446m(this, scheduledExecutorService, c6413m, c5203e, c4981g);
        this.f27290e = C6430c.m28111a(this, this.f27287b, this.f27305t);
        this.f27306u = new C7519u(this, this.f27290e);
        ViewCompat.a(this, this.f27306u);
        this.f27288c = new C6429a(this, this.f27287b, new Handler(Looper.getMainLooper()));
        this.f27297l = new C6438k(this);
        this.f27294i = C6436h.m28181a(this, anVar);
        this.f27296k = c6435g;
        this.f27295j = c4766a;
        this.f27308w = c5162c;
        if (!C5579p.m24319b(str)) {
            m29126a(r8.f27295j.mo4993b(bg.f17745a, getResources()));
        }
        r8.f27298m = new C7447q(r8, view, c5177h.m23135a(), !(r8 instanceof SurfaceView), by.m23061a(), ceVar);
        r8.f27293h = new C64454(r8);
        r8.f27292g = new C5195w(new C47655(r8));
        m29130a(r8.f27295j.mo4993b(bg.f17759o, getResources()));
        m29133a(C4774a.m21152a(resources) ? C5095c.f18880u : C5095c.f18879t);
        m29130a(r8.f27290e.m28126c());
        m29130a(r8.f27289d);
    }

    /* renamed from: D */
    private void m32098D() {
        if (this.f27299n == null && this.f27300o == null) {
            m29132a(null);
        } else {
            m29132a(this.f27293h);
        }
    }

    /* renamed from: a */
    public final void mo5225a() {
        mo5337b(false);
        m22540j(false);
        super.mo5225a();
    }

    /* renamed from: b */
    public final void mo7052b() {
        this.f27294i.m28183a();
        this.f27292g.m23190a();
    }

    /* renamed from: a */
    public final void mo5333a(C5549q c5549q) {
        this.f27299n = c5549q;
        m32098D();
    }

    /* renamed from: a */
    public final void mo5334a(C5551s c5551s) {
        this.f27300o = c5551s;
        m32098D();
    }

    /* renamed from: a */
    public final void mo7050a(final C4770a c4770a) {
        if (c4770a == null) {
            m29131a((C5018a) null);
        } else {
            m29131a(new C5018a(this) {
                /* renamed from: b */
                private /* synthetic */ C7448r f23929b;

                /* renamed from: b */
                public final boolean mo4998b(af afVar) {
                    return false;
                }

                /* renamed from: a */
                public final boolean mo4997a(af afVar) {
                    return c4770a.mo7048f();
                }
            });
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return m29156w();
    }

    public final boolean canScrollVertically(int i) {
        return m29156w();
    }

    /* renamed from: c */
    public final C7481o mo7053c() {
        return m29119A().m29034f();
    }

    /* renamed from: e */
    public final C5180j mo5340e() {
        return this.f27288c;
    }

    /* renamed from: f */
    public final C5145a mo5342f() {
        return this.f27290e;
    }

    /* renamed from: g */
    public final be mo5344g() {
        return this.f27289d;
    }

    /* renamed from: h */
    public final C5146a mo5346h() {
        return this.f27297l;
    }

    /* renamed from: i */
    public final ac mo5348i() {
        return this.f27296k;
    }

    /* renamed from: j */
    public final bo mo5349j() {
        return this.f27298m;
    }

    /* renamed from: a */
    public final boolean mo5336a(boolean z) {
        if (z) {
            if (this.f27301p == null) {
                this.f27301p = this.f27295j.mo4992b(getResources());
                m29130a(this.f27301p);
            }
        } else if (this.f27301p != null) {
            m29136b(this.f27301p);
            this.f27301p = null;
        }
        return z;
    }

    /* renamed from: E */
    private boolean m32099E() {
        return this.f27296k != null && this.f27296k.m28179d();
    }

    /* renamed from: b */
    public final boolean mo5337b(boolean z) {
        if (!(this.f27296k == null || m32099E() == z)) {
            if (!z) {
                this.f27291f.m22350a(null);
                m29136b(this.f27304s);
                this.f27304s.m34276f();
                this.f27304s = null;
                this.f27296k.m28174b();
            } else if (this.f27296k.m28172a()) {
                z = this.f27295j;
                getContext();
                this.f27304s = z.mo4989a(getResources());
                m29130a((C6561r) this.f27304s);
            }
        }
        return m32099E();
    }

    /* renamed from: c */
    public final boolean mo5338c(boolean z) {
        if (z) {
            if (this.f27302q == null) {
                this.f27302q = this.f27295j.mo4991a(m29120B(), getResources());
                m29130a(this.f27302q);
            }
        } else if (this.f27302q != null) {
            m29136b(this.f27302q);
            this.f27302q = null;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo5332a(int i) {
        bg c;
        C5008i c5008i;
        if (this.f27308w != null && this.f27308w.m23077a()) {
            c = this.f27308w.m23079c();
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
        if (this.f27303r != null) {
            m29136b(this.f27303r);
            this.f27303r = null;
        }
        if (!(c == null || c == bg.f17745a)) {
            if (this.f27308w == null || c != this.f27308w.m23079c()) {
                this.f27303r = this.f27295j.mo4990a(c, getResources());
            } else {
                this.f27303r = this.f27295j.mo4994c(c, getResources());
            }
            m29130a(this.f27303r);
        }
        this.f27307v = i;
        m29129a(c5008i);
    }

    /* renamed from: k */
    public final void mo5350k() {
        ao.m22337d();
    }

    /* renamed from: a */
    public final void mo7051a(boolean z, boolean z2) {
        this.f27306u.m33161b();
        super.mo7051a(z, z2);
    }

    /* renamed from: a */
    public final void mo5226a(float f, float f2) {
        this.f27306u.m33161b();
        super.mo5226a(f, f2);
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f27306u.a(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    /* renamed from: l */
    public final C5162c mo5351l() {
        return this.f27308w;
    }

    /* renamed from: m */
    public final void mo5352m() {
        if (this.f27308w != null) {
            mo5332a(this.f27307v);
        }
    }

    /* renamed from: a */
    public final void mo5335a(final C5558z c5558z) {
        if (c5558z == null) {
            m29119A().m29038j().m32462a(null);
        } else {
            m29119A().m29038j().m32462a(new C5004a(this) {
                /* renamed from: b */
                private /* synthetic */ C7448r f23931b;

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
    static /* synthetic */ void m32103a(al alVar, String str) {
        if (!C5579p.m24319b(str)) {
            alVar.m32452a(new C4844a().m21738a(str).m21739a());
        }
    }
}
