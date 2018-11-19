package com.google.android.m4b.maps.bc;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ay.aa;
import com.google.android.m4b.maps.bx.C5003c;
import com.google.android.m4b.maps.bx.C5006e;
import com.google.android.m4b.maps.bx.C6561r;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.C7478d.C5004a;
import com.google.android.m4b.maps.bx.C7481o;
import com.google.android.m4b.maps.bx.C7481o.C5014a;
import com.google.android.m4b.maps.bx.C8076q;
import com.google.android.m4b.maps.bx.C8076q.C5015a;
import com.google.android.m4b.maps.cc.C6586m;
import com.google.android.m4b.maps.cg.az;
import com.google.android.m4b.maps.cg.az.C5143a;
import com.google.android.m4b.maps.cg.ba.C5145a;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.bc.c */
public final class C6430c implements C5004a, C5014a, C5015a, C5145a {
    /* renamed from: a */
    private final Map<String, az> f23859a = ax.m20623b();
    /* renamed from: b */
    private final C4769u f23860b;
    /* renamed from: c */
    private final C6450v f23861c;
    /* renamed from: d */
    private final C8076q f23862d;
    /* renamed from: e */
    private final C7481o f23863e;
    /* renamed from: f */
    private final aa f23864f;

    private C6430c(C6450v c6450v, C4769u c4769u, C8076q c8076q, C7481o c7481o, aa aaVar) {
        this.f23861c = c6450v;
        this.f23860b = c4769u;
        this.f23862d = c8076q;
        this.f23863e = c7481o;
        this.f23864f = aaVar;
        this.f23862d.m32462a((C5004a) this);
        this.f23862d.m34331a((C5015a) this);
        c7481o.m32477a((C5014a) this);
    }

    /* renamed from: a */
    public static C6430c m28111a(C6450v c6450v, C4769u c4769u, aa aaVar) {
        return new C6430c(c6450v, c4769u, c6450v.m28290a(C5016a.LAYER_MARKERS), c6450v.mo7053c(), aaVar);
    }

    /* renamed from: a */
    protected final void m28118a() {
        this.f23861c.mo7052b();
    }

    /* renamed from: b */
    protected final void m28122b() {
        this.f23862d.m34344f();
    }

    /* renamed from: a */
    protected final void m28119a(C6431d c6431d) {
        this.f23862d.m34335a(c6431d.m28140g());
        c6431d = c6431d.m28141h();
        this.f23859a.put(c6431d.getId(), c6431d);
        m28118a();
    }

    /* renamed from: a */
    public final void m28121a(C6586m c6586m) {
        this.f23859a.remove(c6586m.m29426l());
        this.f23862d.m34338b(c6586m);
    }

    /* renamed from: b */
    public final void m28123b(final C6431d c6431d) {
        if (!m28116e()) {
            ViewTreeObserver viewTreeObserver = this.f23861c.mo5339d().getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                    /* renamed from: b */
                    private /* synthetic */ C6430c f17425b;

                    @SuppressLint({"NewApi"})
                    public final void onGlobalLayout() {
                        if (this.f17425b.m28116e()) {
                            this.f17425b.m28123b(c6431d);
                            ViewTreeObserver viewTreeObserver = this.f17425b.f23861c.mo5339d().getViewTreeObserver();
                            if (VERSION.SDK_INT < 16) {
                                viewTreeObserver.removeGlobalOnLayoutListener(this);
                                return;
                            }
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        }
                    }
                });
            }
        }
        C5003c g = c6431d.m28140g();
        az h = c6431d.m28141h();
        if (g.m29418d()) {
            try {
                c6431d = h.m32886s().m22931b().mo7149a(c6431d.m28141h(), this.f23861c.getWidth(), this.f23861c.getHeight());
            } catch (C6431d c6431d2) {
                c6431d2.printStackTrace();
                c6431d2 = null;
            }
            if (c6431d2 != null) {
                this.f23861c.m28293a(g, new C5006e(c6431d2));
            }
        }
    }

    /* renamed from: e */
    private boolean m28116e() {
        if (this.f23861c.getWidth() == 0) {
            if (this.f23861c.getHeight() == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void m28127c(C6431d c6431d) {
        c6431d = c6431d.m28140g();
        if (c6431d.m29418d()) {
            synchronized (this.f23863e) {
                if (c6431d.m29425k() != null) {
                    this.f23861c.m28300n();
                }
            }
        }
    }

    /* renamed from: b */
    protected final boolean m28125b(C6586m c6586m) {
        synchronized (this.f23863e) {
            c6586m = c6586m.m29425k();
        }
        return c6586m;
    }

    /* renamed from: c */
    public final C6561r m28126c() {
        return this.f23862d;
    }

    /* renamed from: a */
    public final void mo4934a(C5003c c5003c) {
        this.f23864f.mo4875a();
        az c = m28114c(c5003c);
        if (!(c == null || c.m32886s().m22937g(c))) {
            c5003c = C6430c.m28115d(c5003c);
            if (c5003c != null) {
                this.f23860b.m21133a(c5003c.mo5283c(), (int) MapboxConstants.ANIMATION_DURATION);
            }
        }
    }

    /* renamed from: c */
    public final void mo4936c(C6586m c6586m) {
        this.f23864f.mo4875a();
        c6586m = m28114c((C5003c) c6586m);
        if (c6586m != null) {
            c6586m.m32886s().m22934d(c6586m);
        }
    }

    /* renamed from: d */
    public final void mo4938d(C6586m c6586m) {
        this.f23864f.mo4875a();
        c6586m = m28114c((C5003c) c6586m);
        if (c6586m != null) {
            c6586m.m32886s().m22935e(c6586m);
        }
    }

    /* renamed from: e */
    public final void mo4939e(C6586m c6586m) {
        this.f23864f.mo4875a();
        c6586m = m28114c((C5003c) c6586m);
        if (c6586m != null) {
            c6586m.m32886s().m22936f(c6586m);
        }
    }

    /* renamed from: b */
    public final void mo4935b(C5003c c5003c) {
        this.f23864f.mo4875a();
        c5003c = m28114c(c5003c);
        if (c5003c != null) {
            c5003c.m32886s().m22938h(c5003c);
        }
    }

    /* renamed from: c */
    private az m28114c(C5003c c5003c) {
        c5003c = C6430c.m28115d(c5003c);
        if (c5003c == null) {
            return null;
        }
        c5003c = c5003c.m29426l();
        this.f23864f.mo4875a();
        return (az) this.f23859a.get(c5003c);
    }

    /* renamed from: d */
    private static C6586m m28115d(C5003c c5003c) {
        if (c5003c instanceof C6586m) {
            return (C6586m) c5003c;
        }
        return null;
    }

    /* renamed from: d */
    public final List<az> mo4937d() {
        return this.f23862d.m34346m();
    }

    /* renamed from: a */
    public final C5143a mo4933a(az azVar) {
        return new C6431d(azVar, this);
    }
}
