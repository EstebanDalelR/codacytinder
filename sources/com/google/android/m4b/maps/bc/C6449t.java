package com.google.android.m4b.maps.bc;

import android.content.res.Resources;
import android.util.Log;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.bc.C6448s.C4767a;
import com.google.android.m4b.maps.bj.C4787f;
import com.google.android.m4b.maps.bj.C4788h;
import com.google.android.m4b.maps.bj.C6463g;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ba;
import com.google.android.m4b.maps.bo.bf;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C5009j;
import com.google.android.m4b.maps.bx.aj;
import com.google.android.m4b.maps.bx.al;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.cc.C6587q;
import com.google.android.m4b.maps.cg.bz;
import com.google.android.m4b.maps.cg.bz.C5160b;
import com.google.android.m4b.maps.cg.ca;
import com.google.android.m4b.maps.cg.ca.C5163a;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.m4b.maps.bc.t */
public final class C6449t implements C4761l, C4767a, C5163a {
    /* renamed from: n */
    private static final C4788h f23941n = new C6463g();
    /* renamed from: a */
    private final int f23942a;
    /* renamed from: b */
    private final int f23943b;
    /* renamed from: c */
    private final boolean f23944c;
    /* renamed from: d */
    private final C6448s f23945d;
    /* renamed from: e */
    private final ArrayList<C6587q> f23946e = new ArrayList();
    /* renamed from: f */
    private final C4768a f23947f = new C4768a();
    /* renamed from: g */
    private C4787f f23948g;
    /* renamed from: h */
    private volatile aj f23949h;
    /* renamed from: i */
    private boolean f23950i;
    /* renamed from: j */
    private volatile boolean f23951j;
    /* renamed from: k */
    private boolean f23952k;
    /* renamed from: l */
    private volatile boolean f23953l = false;
    /* renamed from: m */
    private final C4788h f23954m;
    /* renamed from: o */
    private final Set<C6587q> f23955o = bo.m20654a();
    /* renamed from: p */
    private final bf f23956p;
    /* renamed from: q */
    private WeakReference<C5052d> f23957q;
    /* renamed from: r */
    private float f23958r;
    /* renamed from: s */
    private final C7446m f23959s;
    /* renamed from: t */
    private final ca f23960t;
    /* renamed from: u */
    private final C4981g f23961u;

    /* renamed from: com.google.android.m4b.maps.bc.t$a */
    public static class C4768a implements Comparator<ba> {
        /* renamed from: a */
        private int f17440a;
        /* renamed from: b */
        private int f17441b;

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ba baVar = (ba) obj;
            ba baVar2 = (ba) obj2;
            int b = baVar.m21619b();
            int b2 = baVar2.m21619b();
            if (b != b2) {
                return b2 - b;
            }
            b = 536870912 >> b;
            return (Math.abs((baVar.m21622e() + b) - this.f17440a) + Math.abs((baVar.m21623f() + b) - this.f17441b)) - (Math.abs((baVar2.m21622e() + b) - this.f17440a) + Math.abs((baVar2.m21623f() + b) - this.f17441b));
        }

        /* renamed from: a */
        public final void m21124a(af afVar) {
            this.f17440a = afVar.m21490f();
            this.f17441b = afVar.m21492g();
        }
    }

    /* renamed from: a */
    public final void mo4951a(long j) {
    }

    /* renamed from: a */
    public final boolean mo4957a(float f, float f2, af afVar, C6570b c6570b) {
        return false;
    }

    /* renamed from: a */
    public static C6449t m28271a(ca caVar, Resources resources, C7446m c7446m, ScheduledExecutorService scheduledExecutorService, C5203e c5203e, C4981g c4981g) {
        int a = al.m32425a(resources, 332);
        C5571j.m24298a(caVar.m33006b() != null ? true : null, (Object) "TileOverlay.Options must specify a TileProvider");
        resources = new C6448s(new bz(scheduledExecutorService, new Random(), caVar.m33006b()), caVar.getId(), c5203e);
        C4767a c6449t = new C6449t(c7446m, caVar, resources, f23941n, a, 332, false, c4981g);
        resources.m28259a(c6449t);
        return c6449t;
    }

    /* renamed from: a */
    public final void mo4954a(C5052d c5052d, aj ajVar) {
        this.f23957q = new WeakReference(c5052d);
        this.f23945d.m28260a(c5052d);
        this.f23949h = ajVar;
        if (this.f23948g == null) {
            this.f23948g = this.f23954m.mo5022a(bg.f17748d, this.f23943b, this.f23944c, this.f23956p, this.f23961u);
        }
    }

    /* renamed from: a */
    public final void mo4953a(C5052d c5052d) {
        this.f23957q = null;
        this.f23949h = null;
        this.f23945d.m28269c();
        c5052d = this.f23945d;
        synchronized (c5052d.f23933a) {
            for (C5160b a : c5052d.f23933a) {
                a.m23066a();
            }
            c5052d.f23933a.clear();
        }
        this.f23951j = true;
    }

    /* renamed from: a */
    public final void mo4956a(boolean z) {
        this.f23945d.m28268b(z);
        this.f23951j = true;
    }

    /* renamed from: b */
    public final void mo4958b() {
        this.f23945d.m28270d();
        this.f23951j = true;
    }

    private C6449t(C7446m c7446m, ca caVar, C6448s c6448s, C4788h c4788h, int i, int i2, boolean z, C4981g c4981g) {
        this.f23959s = c7446m;
        this.f23960t = caVar;
        this.f23945d = c6448s;
        this.f23954m = c4788h;
        this.f23942a = i;
        this.f23943b = 332;
        this.f23944c = false;
        this.f23956p = new bf();
        this.f23961u = c4981g;
        mo5002a(-1);
    }

    /* renamed from: a */
    public final void mo5001a() {
        synchronized (this.f23959s) {
            this.f23959s.m32082a((C4761l) this);
        }
        this.f23959s.m32092b();
    }

    /* renamed from: b */
    public final void mo5003b(boolean z) {
        aj ajVar = this.f23949h;
        if (ajVar != null && z) {
            ajVar.mo5221a(true, false);
        }
    }

    /* renamed from: b */
    public final void mo4959b(int i) {
        this.f23950i = (i & 2) != 0 ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo4952a(C6570b c6570b, C5052d c5052d) {
        this.f23953l = false;
        if (this.f23960t.m33008d()) {
            boolean z = true;
            this.f23952k = true;
            List<ba> a = this.f23948g.mo5020a(c6570b);
            if (a.size() > 1) {
                this.f23947f.m21124a(c6570b.m29245c());
                Collections.sort(a, this.f23947f);
            }
            this.f23955o.addAll(this.f23946e);
            this.f23946e.clear();
            this.f23945d.m28258a();
            c6570b = this.f23950i;
            for (ba baVar : a) {
                C6587q a2;
                if (c6570b != null) {
                    a2 = this.f23945d.m28257a(baVar);
                } else {
                    a2 = this.f23945d.m28265b(baVar);
                }
                if (a2 != null) {
                    this.f23946e.add(a2);
                    this.f23957q.get();
                    if (!this.f23955o.remove(a2)) {
                        a2.mo7132a(true);
                    }
                    this.f23946e.size();
                    if (this.f23946e.size() == this.f23942a) {
                        break;
                    }
                }
                this.f23945d.m28266b();
            }
            if (C4728u.m21050a("TileOverlayRendererImpl", 3) != null) {
                String id = this.f23960t.getId();
                int size = a.size();
                int size2 = this.f23946e.size();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(id).length() + 55);
                stringBuilder.append("ID: ");
                stringBuilder.append(id);
                stringBuilder.append(", expected: ");
                stringBuilder.append(size);
                stringBuilder.append(", mTiles.size(): ");
                stringBuilder.append(size2);
                Log.d("TileOverlayRendererImpl", stringBuilder.toString());
            }
            if (this.f23946e.size() != a.size()) {
                z = false;
            }
            this.f23953l = z;
            this.f23951j = this.f23950i;
            for (C6587q a3 : this.f23955o) {
                a3.mo7132a(false);
            }
            this.f23955o.clear();
        }
    }

    /* renamed from: a */
    public final void mo4955a(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        if (this.f23960t.m33008d() && c5009j.m22388b() <= 0) {
            C5009j c5009j2 = new C5009j(c5009j);
            if (this.f23951j != null && this.f23950i == null) {
                mo4952a(c6570b, c5052d);
            }
            if (this.f23952k != null) {
                this.f23945d.m28263a(this.f23946e);
            }
            if (this.f23946e.size() > null) {
                c5052d.m22637z();
                c5009j2.m22386a(1);
                ((C6587q) this.f23946e.get(0)).mo7137b(c5052d, c6570b, c5009j2);
                c5009j = this.f23946e.iterator();
                while (c5009j.hasNext()) {
                    C6587q c6587q = (C6587q) c5009j.next();
                    if (!this.f23960t.m33009e()) {
                        c6587q.mo7140d();
                    }
                    c6587q.mo5222a(c5052d, c6570b, c5009j2);
                }
                c5052d.m22597A();
            }
            if (this.f23952k != null) {
                this.f23945d.m28267b(this.f23946e);
                this.f23952k = false;
            }
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo4960c() {
        boolean z;
        if (this.f23960t.m33008d()) {
            if (!this.f23953l) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: e */
    public final String mo4962e() {
        return this.f23960t.getId();
    }

    /* renamed from: d */
    public final synchronized void mo4961d() {
        this.f23949h = null;
        this.f23945d.m28269c();
        this.f23945d.m28259a(null);
    }

    /* renamed from: g */
    public final void mo5004g() {
        this.f23945d.m28264a(false);
        this.f23959s.m32092b();
    }

    /* renamed from: f */
    public final float mo4963f() {
        return this.f23958r;
    }

    public final String toString() {
        return C5569h.m24283a(this).m24281a("id", this.f23960t.getId()).toString();
    }

    /* renamed from: a */
    public final void mo5002a(int i) {
        if ((i & 2) != 0) {
            synchronized (this.f23959s) {
                this.f23958r = this.f23960t.m33007c();
                this.f23959s.m32093c();
            }
        }
        if ((i & 4) != 0) {
            this.f23959s.m32092b();
        }
    }
}
