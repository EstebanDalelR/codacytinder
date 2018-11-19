package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.m4b.maps.ba.C4742a;
import com.google.android.m4b.maps.bl.C6473f;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.C6560n.C5013b;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.C6564x.C5022a;
import com.google.android.m4b.maps.bx.aq.C4997b;
import com.google.android.m4b.maps.by.C5043a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.bz.C6571c;
import com.google.android.m4b.maps.cd.C7507b;
import com.google.android.m4b.maps.ce.C5095c;
import com.google.android.m4b.maps.cf.C5111g;
import com.google.android.m4b.maps.cg.C5162c;
import com.google.android.m4b.maps.cg.ap;
import com.google.android.m4b.maps.ch.C5203e;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.m4b.maps.bx.w */
public class C6563w extends C5032y implements C4997b, C5013b {
    /* renamed from: a */
    private final C5010k f24531a = new C5010k();
    /* renamed from: b */
    private final Resources f24532b;
    /* renamed from: c */
    private ai f24533c;
    /* renamed from: d */
    private C6473f f24534d;
    /* renamed from: e */
    private C5021b f24535e;
    /* renamed from: f */
    private C5020a f24536f;
    /* renamed from: g */
    private aq f24537g;
    /* renamed from: h */
    private ap f24538h;
    /* renamed from: i */
    private C6561r f24539i;
    /* renamed from: j */
    private boolean f24540j;
    /* renamed from: k */
    private C6571c f24541k;
    /* renamed from: l */
    private long f24542l = Long.MIN_VALUE;
    /* renamed from: m */
    private boolean f24543m = false;
    /* renamed from: n */
    private C6560n f24544n;
    /* renamed from: o */
    private C5111g f24545o;
    /* renamed from: p */
    private ap f24546p;
    /* renamed from: q */
    private af f24547q;

    /* renamed from: com.google.android.m4b.maps.bx.w$a */
    public interface C5020a {
        /* renamed from: a */
        boolean mo5013a(af afVar);

        /* renamed from: b */
        boolean mo5014b(af afVar);
    }

    /* renamed from: com.google.android.m4b.maps.bx.w$b */
    public interface C5021b {
        /* renamed from: a */
        void mo5011a(af afVar);

        /* renamed from: b */
        void mo5012b(af afVar);
    }

    /* renamed from: a */
    public void mo5226a(float f, float f2) {
    }

    public boolean isOpaque() {
        return true;
    }

    public C6563w(Context context, Resources resources, TextView textView, ap apVar, C5203e c5203e, C4981g c4981g, C5162c c5162c) {
        al a;
        C5203e c5203e2 = c5203e;
        C4981g c4981g2 = c4981g;
        super(context);
        this.f24532b = resources;
        this.f24546p = apVar;
        this.f24545o = null;
        m22484i(true);
        this.f24537g = new aq(this);
        this.f24534d = new C6473f();
        this.f24534d.m28392a(getContext(), this.f24537g);
        setFocusable(true);
        setClickable(true);
        float f = this.f24532b.getDisplayMetrics().density;
        this.f24544n = new C6560n(getContext(), this);
        List<C5022a> arrayList = new ArrayList();
        if (C4742a.m21084a()) {
            arrayList.add(new C5022a(8, 8, 8, 0, 16, 8));
        }
        arrayList.add(new C5022a(5, 6, 5, 0, 16, 8));
        arrayList.add(new C5022a(5, 6, 5, 0, 16, 0));
        for (C5022a a2 : arrayList) {
            a2.m22427a(false);
        }
        m22481a(new C6564x((C5022a[]) arrayList.toArray(new C5022a[arrayList.size()])));
        C6570b c6570b = new C6570b(C6570b.f24562a, 256, 256, f, null);
        if (c5162c == null) {
            a = al.m32430a(bg.f17745a, r0.f24532b, c5203e2, c4981g2);
        } else {
            a = al.m32431a(bg.f17745a, c5162c.m23079c(), r0.f24532b, c5203e2, c4981g2);
        }
        r0.f24533c = new ai(r0.f24544n, r0.f24532b, c6570b, a, null, null, textView, c4981g2);
        m22482a(r0.f24533c);
        m22483b(0);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* renamed from: a */
    public void mo7051a(boolean z, boolean z2) {
        this.f24544n.mo5221a(z, z2);
    }

    /* renamed from: a */
    public final void m29169a(ap apVar) {
        this.f24538h = apVar;
        this.f24538h.m29057a(this.f24544n);
        this.f24538h.m29062a(this.f24533c);
        this.f24533c.m29018a(this.f24538h);
    }

    /* renamed from: a */
    public final void m29173a(C5020a c5020a) {
        this.f24536f = c5020a;
    }

    /* renamed from: a */
    public final void m29174a(C5021b c5021b) {
        this.f24535e = c5021b;
    }

    /* renamed from: a */
    public final void m29172a(C6561r c6561r) {
        this.f24533c.m29020a(c6561r);
    }

    /* renamed from: b */
    public final void m29178b(C6561r c6561r) {
        this.f24533c.m29028b(c6561r);
        if (this.f24539i == c6561r) {
            mo5238v();
        }
    }

    /* renamed from: a */
    public final C8076q m29164a(C5016a c5016a) {
        return this.f24533c.m29014a(c5016a);
    }

    /* renamed from: d */
    public final ac m29181d(boolean z) {
        return this.f24533c.m29025b(true);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f24533c.m29024a(z ^ 1);
    }

    /* renamed from: r */
    public final void mo5240r() {
        mo5238v();
        this.f24544n.m29094f();
        super.mo5240r();
        C5043a a = C5043a.m22547a();
        if (a != null && this.f24533c != null) {
            a.m22562b(this.f24533c.m29037i());
        }
    }

    /* renamed from: s */
    public final void mo5241s() {
        super.mo5241s();
        this.f24544n.m29093e();
    }

    /* renamed from: a */
    public void mo5239a() {
        this.f24533c.m29026b();
    }

    /* renamed from: t */
    public final void m29195t() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f24542l < DefaultFastMatchValues.NEW_COUNT_FETCH_INTERVAL) {
            this.f24533c.m29031c(true);
        } else {
            this.f24533c.m29031c(false);
        }
        this.f24542l = uptimeMillis;
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* renamed from: u */
    public final ap mo5237u() {
        return this.f24538h;
    }

    /* renamed from: a */
    public final void m29171a(C5008i c5008i) {
        this.f24533c.m29027b(c5008i);
    }

    /* renamed from: a */
    public final void m29175a(C5095c c5095c) {
        this.f24533c.m29021a(c5095c);
    }

    /* renamed from: a */
    public final Bitmap m29163a(Bitmap bitmap) {
        synchronized (this.f24533c) {
            mo5233p();
            bitmap = this.f24533c.m29013a(bitmap);
        }
        return bitmap;
    }

    /* renamed from: o */
    public final C6570b m29190o() {
        return new C6570b(this.f24538h.m29064b(), getWidth(), getHeight(), mo7052b());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (isEnabled() && isClickable() && this.f24534d.m28393a(motionEvent) != null) ? true : null;
    }

    /* renamed from: a */
    public final boolean mo5227a(MotionEvent motionEvent) {
        if (this.f24538h == null) {
            return false;
        }
        C7507b g = this.f24533c.m29035g();
        C6570b c6570b = null;
        if (g.f_() && g.mo7145c(motionEvent.getX(), motionEvent.getY(), null)) {
            mo7051a(false, true);
            return true;
        }
        ArrayList c = this.f24533c.m29030c();
        for (int size = c.size() - 1; size >= 0; size--) {
            C6561r c6561r = (C6561r) c.get(size);
            if (c6561r.f_()) {
                if (c6570b == null) {
                    c6570b = new C6570b(this.f24538h.m29064b(), getWidth(), getHeight(), mo7052b());
                }
                if (c6561r.mo7145c(motionEvent.getX(), motionEvent.getY(), c6570b)) {
                    mo7051a(false, true);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo5228b(float f, float f2) {
        if (this.f24538h == null || this.f24533c.m29034f() == null) {
            return false;
        }
        C6570b c6570b = new C6570b(this.f24538h.m29064b(), getWidth(), getHeight(), mo7052b());
        c6570b.m29247d(f, f2);
        return this.f24533c.m29034f().a_(f, f2, c6570b);
    }

    /* renamed from: c */
    public final void mo5229c(float f, float f2) {
        if (this.f24538h != null) {
            C6570b c6570b = new C6570b(this.f24538h.m29064b(), getWidth(), getHeight(), mo7052b());
            af d = c6570b.m29247d(f, f2);
            boolean z = false;
            boolean z2 = this.f24540j;
            if (this.f24533c.m29035g() != null) {
                z = this.f24533c.m29035g().mo7043a(f, f2, d, c6570b);
            }
            if (!(z || this.f24533c.m29034f() == null)) {
                z = this.f24533c.m29034f().mo7043a(f, f2, d, c6570b);
            }
            if (!(this.f24536f == null || r1)) {
                z = this.f24536f.mo5013a(d);
            }
            ArrayList c = this.f24533c.m29030c();
            int size = c.size();
            List arrayList = new ArrayList();
            int i = size - 1;
            boolean z3 = z;
            int i2 = i;
            while (!z3 && i2 >= 0) {
                C6561r c6561r = (C6561r) c.get(i2);
                if (c6561r.b_()) {
                    arrayList.add((C7478d) c6561r);
                } else if (arrayList.isEmpty() && c6561r != this.f24533c.m29034f() && c6561r.mo7043a(f, f2, d, c6570b)) {
                    z3 = true;
                }
                i2--;
            }
            if (!(z3 || arrayList.isEmpty())) {
                if (!(z2 && this.f24538h.m29064b().equals(this.f24541k))) {
                    this.f24531a.m22391a(true);
                }
                if (this.f24531a.m22392a(f, f2, d, c6570b, arrayList)) {
                    z3 = true;
                }
            }
            if (!z3) {
                this.f24546p.m32833b();
            }
            while (!z3 && i >= 0) {
                C6561r c6561r2 = (C6561r) c.get(i);
                if (!(c6561r2.b_() || c6561r2 == this.f24533c.m29034f() || !c6561r2.mo7043a(f, f2, d, c6570b))) {
                    z3 = true;
                }
                i--;
            }
            if (!(z3 || this.f24535e == null)) {
                this.f24535e.mo5012b(d);
            }
            this.f24541k = this.f24538h.m29064b();
            mo5233p();
        }
    }

    /* renamed from: d */
    public final void mo5230d(float f, float f2) {
        if (this.f24538h != null) {
            C6570b c6570b = new C6570b(this.f24538h.m29064b(), getWidth(), getHeight(), mo7052b());
            af d = c6570b.m29247d(f, f2);
            boolean z = false;
            if (this.f24533c.m29034f() != null) {
                z = this.f24533c.m29034f().mo7104b(f, f2, d, c6570b);
            }
            if (!(this.f24536f == null || r2)) {
                z = this.f24536f.mo5014b(d);
            }
            ArrayList c = this.f24533c.m29030c();
            for (int size = c.size() - 1; size >= 0; size--) {
                C6561r c6561r = (C6561r) c.get(size);
                if (c6561r != this.f24533c.m29034f() && c6561r.mo7104b(f, f2, d, c6570b)) {
                    z = true;
                    break;
                }
            }
            if (!(z || this.f24535e == null)) {
                this.f24535e.mo5011a(d);
            }
            mo5233p();
        }
    }

    /* renamed from: e */
    public final void mo5231e(float f, float f2) {
        if (this.f24538h != null) {
            C6570b c6570b = new C6570b(this.f24538h.m29064b(), getWidth(), getHeight(), mo7052b());
            ArrayList c = this.f24533c.m29030c();
            for (int size = c.size() - 1; size >= 0; size--) {
                C6561r c6561r = (C6561r) c.get(size);
                if (c6561r.mo7105b(f, f2, c6570b)) {
                    this.f24539i = c6561r;
                    mo5233p();
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo5232f(float f, float f2) {
        if (this.f24538h == null) {
            return false;
        }
        ArrayList c = this.f24533c.m29030c();
        int size = c.size();
        C7507b g = this.f24533c.m29035g();
        Object obj = null;
        if (g.f_() && g.mo7144c(f, f2, null, null)) {
            mo7051a(false, true);
            return true;
        }
        af afVar = null;
        for (size--; size >= 0; size--) {
            C6561r c6561r = (C6561r) c.get(size);
            if (c6561r.f_()) {
                if (obj == null) {
                    obj = new C6570b(this.f24538h.m29064b(), getWidth(), getHeight(), mo7052b());
                    afVar = obj.m29247d(f, f2);
                }
                if (c6561r.mo7144c(f, f2, afVar, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void mo5238v() {
        if (this.f24539i != null) {
            this.f24539i.a_();
            this.f24539i = null;
            mo5233p();
        }
    }

    /* renamed from: a */
    public final void m29170a(C5003c c5003c, C5006e c5006e) {
        this.f24540j = true;
        this.f24533c.m29019a(c5003c, c5006e);
    }

    /* renamed from: n */
    public final void m29189n() {
        this.f24540j = false;
        this.f24533c.m29033e();
    }

    /* renamed from: a */
    public final void m29167a(af afVar) {
        if (this.f24533c != null) {
            this.f24533c.m29016a(afVar);
        }
        this.f24547q = afVar;
    }

    /* renamed from: p */
    public final void mo5233p() {
        if (this.f24547q != null) {
            this.f24547q.mo4978c();
        }
        super.mo5233p();
    }

    /* renamed from: q */
    public final void mo5234q() {
        if (this.f24547q != null) {
            this.f24547q.mo4977b();
        }
    }

    /* renamed from: b */
    private float mo7052b() {
        return this.f24532b.getDisplayMetrics().density;
    }

    /* renamed from: e */
    public final void m29184e(boolean z) {
        this.f24537g.m29069a(z);
    }

    /* renamed from: w */
    public final boolean m29198w() {
        return this.f24537g.m29070a();
    }

    /* renamed from: f */
    public final void m29185f(boolean z) {
        this.f24537g.m29074b(z);
    }

    /* renamed from: x */
    public final boolean m29199x() {
        return this.f24537g.m29075b();
    }

    /* renamed from: g */
    public final void m29187g(boolean z) {
        this.f24537g.m29076c(z);
    }

    /* renamed from: y */
    public final boolean m29200y() {
        return this.f24537g.m29077c();
    }

    /* renamed from: h */
    public final void m29188h(boolean z) {
        this.f24537g.m29078d(z);
    }

    /* renamed from: z */
    public final boolean m29201z() {
        return this.f24537g.m29079d();
    }

    /* renamed from: A */
    public final ai m29161A() {
        return this.f24533c;
    }

    /* renamed from: B */
    public final al m29162B() {
        return this.f24533c.m29036h();
    }

    /* renamed from: a */
    public final void m29168a(al alVar) {
        this.f24533c.m29017a(alVar);
    }

    public Resources getResources() {
        return this.f24532b;
    }
}
