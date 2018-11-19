package com.google.android.m4b.maps.bc;

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.util.TypedValue;
import com.google.android.m4b.maps.aa.au;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.bc.C6450v.C4770a;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.C6561r;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.aj;
import com.google.android.m4b.maps.bx.al;
import com.google.android.m4b.maps.bx.ao;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cg.C7520v;
import com.google.android.m4b.maps.cg.C7520v.C5193a;
import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cg.ar.C5137a;
import com.google.android.m4b.maps.cg.as;
import com.google.android.m4b.maps.cg.av;
import com.google.android.m4b.maps.cg.ax;
import com.google.android.m4b.maps.cg.ax.C6602a;
import com.google.android.m4b.maps.cg.be;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.cg.bg.C5148a;
import com.google.android.m4b.maps.cg.ca;
import com.google.android.m4b.maps.cg.ca.C5163a;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.p124x.C5544l;
import com.google.android.m4b.maps.p124x.C5553u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.m4b.maps.bc.m */
public final class C7446m extends C6561r implements C4770a, be {
    /* renamed from: a */
    private static final C5016a f27271a = C5016a.DESATURATE;
    /* renamed from: b */
    private static final Comparator<C4761l> f27272b = new C47621();
    /* renamed from: c */
    private final C6450v f27273c;
    /* renamed from: d */
    private final Set<C4761l> f27274d = new HashSet();
    /* renamed from: e */
    private final List<C4761l> f27275e = new ArrayList();
    /* renamed from: f */
    private final ScheduledExecutorService f27276f;
    /* renamed from: g */
    private aj f27277g;
    /* renamed from: h */
    private C5052d f27278h;
    /* renamed from: i */
    private C5553u f27279i;
    /* renamed from: j */
    private av f27280j;
    /* renamed from: k */
    private long f27281k;
    /* renamed from: l */
    private C5544l f27282l;
    /* renamed from: m */
    private final C6413m f27283m;
    /* renamed from: n */
    private final C5203e f27284n;
    /* renamed from: o */
    private final C4981g f27285o;

    /* renamed from: com.google.android.m4b.maps.bc.m$1 */
    class C47621 implements Comparator<C4761l> {
        C47621() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C4761l c4761l = (C4761l) obj;
            C4761l c4761l2 = (C4761l) obj2;
            int compare = Float.compare(c4761l.mo4963f(), c4761l2.mo4963f());
            if (compare != 0) {
                return compare;
            }
            return c4761l.mo4962e().compareTo(c4761l2.mo4962e());
        }
    }

    public C7446m(C6450v c6450v, ScheduledExecutorService scheduledExecutorService, C6413m c6413m, C5203e c5203e, C4981g c4981g) {
        this.f27273c = c6450v;
        this.f27276f = scheduledExecutorService;
        this.f27283m = c6413m;
        this.f27273c.mo7050a((C4770a) this);
        this.f27284n = c5203e;
        this.f27285o = c4981g;
    }

    /* renamed from: a */
    public final synchronized void mo7041a(C5052d c5052d, aj ajVar) {
        this.f27278h = c5052d;
        this.f27277g = ajVar;
        for (C4761l a : this.f27275e) {
            a.mo4954a(this.f27278h, this.f27277g);
        }
    }

    /* renamed from: a */
    public final synchronized void mo7040a(C5052d c5052d) {
        for (C4761l a : this.f27275e) {
            a.mo4953a(c5052d);
        }
    }

    /* renamed from: a */
    public final synchronized void mo7042a(boolean z) {
        for (C4761l a : this.f27275e) {
            a.mo4956a(z);
        }
    }

    public final synchronized void c_() {
        for (C4761l b : this.f27275e) {
            b.mo4958b();
        }
    }

    /* renamed from: a */
    public final synchronized void mo7038a(int i) {
        for (C4761l b : this.f27275e) {
            b.mo4959b(i);
        }
    }

    /* renamed from: b */
    final void m32092b() {
        this.f27273c.mo7052b();
    }

    /* renamed from: a */
    public final C5148a mo5361a(bg bgVar, boolean z) {
        if (z) {
            C4761l c6440n = new C6440n(this, bgVar);
            m32074b(c6440n);
            return c6440n;
        }
        c6440n = new C6441o(this, bgVar);
        m32074b(c6440n);
        return c6440n;
    }

    /* renamed from: a */
    public final C5193a mo5363a(C7520v c7520v) {
        C4761l c6433f = new C6433f(this, c7520v);
        m32074b(c6433f);
        return c6433f;
    }

    /* renamed from: a */
    public final C6602a mo5360a(ax axVar) {
        av avVar = this.f27280j;
        Context context = this.f27273c.getContext();
        Resources resources = this.f27273c.getResources();
        ScheduledExecutorService scheduledExecutorService = this.f27276f;
        C6413m c6413m = this.f27283m;
        C5203e c5203e = this.f27284n;
        C4981g c4981g = this.f27285o;
        ao.m22331a(com.google.android.m4b.maps.bo.bg.f17768x, new C6437i(c6413m, scheduledExecutorService), context, resources, c5203e);
        C4761l c7445j = new C7445j(axVar, avVar, al.m32437d(com.google.android.m4b.maps.bo.bg.f17768x, resources, c5203e, c4981g), this);
        m32074b(c7445j);
        return c7445j;
    }

    /* renamed from: a */
    public final C5163a mo5362a(ca caVar) {
        C4761l a = C6449t.m28271a(caVar, this.f27273c.getResources(), this, this.f27276f, this.f27284n, this.f27285o);
        m32074b(a);
        return a;
    }

    /* renamed from: b */
    private void m32074b(C4761l c4761l) {
        synchronized (this) {
            this.f27274d.add(c4761l);
            this.f27275e.add(c4761l);
            m32093c();
            if (this.f27278h != null) {
                c4761l.mo4954a(this.f27278h, this.f27277g);
            }
            c4761l.mo4951a(this.f27281k);
        }
        m32092b();
    }

    /* renamed from: a */
    public final void mo5364a(av avVar) {
        this.f27280j = avVar;
    }

    /* renamed from: a */
    public final void mo5366a(C5553u c5553u) {
        this.f27279i = c5553u;
    }

    /* renamed from: a */
    public final void mo5365a(C5544l c5544l) {
        this.f27282l = c5544l;
    }

    /* renamed from: a */
    final synchronized void m32082a(C4761l c4761l) {
        if (this.f27274d.contains(c4761l)) {
            this.f27275e.remove(c4761l);
            this.f27274d.remove(c4761l);
            c4761l.mo4961d();
        }
    }

    /* renamed from: c */
    final void m32093c() {
        Collections.sort(this.f27275e, f27272b);
        m32092b();
    }

    /* renamed from: a */
    public final synchronized boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        for (C4761l a : this.f27275e) {
            a.mo4952a(c6570b, c5052d);
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo5222a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        for (C4761l c4761l : this.f27275e) {
            c5052d.m22637z();
            c4761l.mo4955a(c5052d, c6570b, c5009j);
            c5052d.m22597A();
        }
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return f27271a;
    }

    /* renamed from: a */
    public final synchronized boolean mo7043a(float f, float f2, af afVar, C6570b c6570b) {
        for (C4761l a : au.m20528a(this.f27275e)) {
            if (a.mo4957a(f, f2, afVar, c6570b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo7039a(long j) {
        this.f27281k = j;
        for (C4761l a : this.f27275e) {
            a.mo4951a(j);
        }
    }

    public final synchronized boolean e_() {
        for (C4761l c : this.f27275e) {
            if (!c.mo4960c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo7048f() {
        if (this.f27280j != null) {
            this.f27280j.m22901b();
        }
        return false;
    }

    /* renamed from: a */
    public final void m32079a(float f, float f2, af afVar, C6570b c6570b, C7445j c7445j, final List<as> list) {
        final List arrayList = new ArrayList();
        if (c7445j.m32071g().m32863f()) {
            arrayList.addAll(list);
        }
        for (Object obj : au.m20528a(this.f27275e)) {
            if ((obj instanceof C7445j) && obj != c7445j) {
                ((C7445j) obj).m32055a(f, f2, afVar, c6570b, list, arrayList);
            }
        }
        if (arrayList.isEmpty() == null && this.f27280j != null) {
            f = this.f27280j;
            f2 = TypedValue.applyDimension(1, 52.0f, this.f27273c.getResources().getDisplayMetrics());
            c7445j = c6570b.m29231a(f2, c6570b.m29232a(afVar, true));
            f2 = c6570b.m29231a(f2, c6570b.m29232a(afVar, true));
            af afVar2 = new af((int) (((float) afVar.m21490f()) + c7445j), (int) (((float) afVar.m21492g()) - f2));
            af afVar3 = new af((int) (((float) afVar.m21490f()) - c7445j), (int) (((float) afVar.m21492g()) + f2));
            f2 = C4754b.m21097a(afVar2);
            afVar = C4754b.m21097a(afVar3);
            c6570b = LatLngBounds.builder();
            c6570b.m23861a(f2);
            c6570b.m23861a(afVar);
            f.m22899a(c6570b.m23862a(), arrayList);
        }
        if (this.f27279i != null) {
            f = au.m20524a(list.size());
            for (as add : list) {
                f.add(add);
            }
            try {
                this.f27279i.mo5804a(f);
            } catch (float f3) {
                throw new RuntimeRemoteException(f3);
            }
        }
        new ar(list, new C5137a(this) {
            /* renamed from: c */
            private /* synthetic */ C7446m f23903c;

            /* renamed from: a */
            public final void mo4983a() {
                if (this.f23903c.f27280j != null) {
                    this.f23903c.f27280j.m22900a(arrayList);
                }
                if (this.f23903c.f27279i != null) {
                    List a = au.m20524a(list.size());
                    for (as add : list) {
                        a.add(add);
                    }
                    try {
                        this.f23903c.f27279i.mo5805b(a);
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
            }
        }, this.f27283m).mo7075h();
    }
}
