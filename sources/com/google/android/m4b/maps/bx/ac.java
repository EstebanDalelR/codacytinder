package com.google.android.m4b.maps.bx;

import android.content.res.Resources;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.C4513R;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ax.C4701c;
import com.google.android.m4b.maps.bb.C4750h;
import com.google.android.m4b.maps.bb.C6427i;
import com.google.android.m4b.maps.bm.C6482f;
import com.google.android.m4b.maps.bm.C6487i;
import com.google.android.m4b.maps.bo.ae;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bx.C6561r.C5016a;
import com.google.android.m4b.maps.bx.ag.C4984a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.bz.C6571c;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7490k;
import com.google.android.m4b.maps.cb.C5062a;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;

public final class ac extends C7478d implements C5002b, C5003c {
    /* renamed from: w */
    private static C5062a f28911w;
    /* renamed from: b */
    private final Resources f28912b;
    /* renamed from: c */
    private final boolean f28913c;
    /* renamed from: d */
    private int f28914d;
    /* renamed from: e */
    private volatile aj f28915e;
    /* renamed from: f */
    private final Map<Integer, C7490k> f28916f = ax.m20623b();
    /* renamed from: g */
    private List<C4983a> f28917g;
    /* renamed from: h */
    private C4750h f28918h;
    /* renamed from: i */
    private C7477a f28919i;
    /* renamed from: j */
    private final ae f28920j = new ae();
    /* renamed from: k */
    private final ae f28921k = new ae();
    /* renamed from: l */
    private final ae f28922l = new ae();
    /* renamed from: m */
    private boolean f28923m = false;
    /* renamed from: n */
    private boolean f28924n;
    /* renamed from: o */
    private volatile C4701c f28925o;
    /* renamed from: p */
    private volatile boolean f28926p = true;
    /* renamed from: q */
    private float f28927q;
    /* renamed from: r */
    private float f28928r;
    /* renamed from: s */
    private float f28929s;
    /* renamed from: t */
    private final int f28930t;
    /* renamed from: u */
    private float f28931u;
    /* renamed from: v */
    private final af f28932v = new af();

    /* renamed from: com.google.android.m4b.maps.bx.ac$a */
    public static class C4983a {
        /* renamed from: a */
        public final boolean f18381a;
        /* renamed from: b */
        public final int f18382b;
        /* renamed from: c */
        public final int f18383c;
        /* renamed from: d */
        public final int f18384d;
        /* renamed from: e */
        public final int f18385e;
        /* renamed from: f */
        public final int f18386f;
        /* renamed from: g */
        public final int f18387g;
        /* renamed from: h */
        private final Boolean f18388h;
        /* renamed from: i */
        private final Boolean f18389i;
        /* renamed from: j */
        private final Boolean f18390j;

        /* renamed from: com.google.android.m4b.maps.bx.ac$a$a */
        public static class C4982a {
            /* renamed from: a */
            private Boolean f18375a;
            /* renamed from: b */
            private Integer f18376b;
            /* renamed from: c */
            private Integer f18377c;
            /* renamed from: d */
            private boolean f18378d;
            /* renamed from: e */
            private int f18379e;
            /* renamed from: f */
            private int f18380f;

            /* renamed from: a */
            public final C4982a m22280a(boolean z) {
                this.f18375a = Boolean.valueOf(z);
                return this;
            }

            /* renamed from: a */
            public final C4982a m22279a(int i, int i2) {
                this.f18379e = i;
                this.f18380f = i2;
                return this;
            }

            /* renamed from: a */
            public final C4982a m22277a() {
                this.f18378d = true;
                return this;
            }

            /* renamed from: b */
            public final C4982a m22281b() {
                this.f18378d = false;
                return this;
            }

            /* renamed from: c */
            public final C4983a m22282c() {
                C5571j.m24302b(this.f18377c != null, (Object) "Texture ID must be specified.");
                return new C4983a(this.f18375a, null, null, this.f18378d, this.f18376b.intValue(), this.f18377c.intValue(), 0, 0, this.f18379e, this.f18380f);
            }

            /* renamed from: a */
            public final C4982a m22278a(int i) {
                this.f18376b = Integer.valueOf(i);
                this.f18377c = Integer.valueOf(i);
                return this;
            }
        }

        public C4983a(Boolean bool, Boolean bool2, Boolean bool3, boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f18388h = bool;
            this.f18389i = bool2;
            this.f18390j = bool3;
            this.f18381a = z;
            this.f18382b = i;
            this.f18383c = i2;
            this.f18384d = i3;
            this.f18385e = i4;
            this.f18386f = i5;
            this.f18387g = i6;
        }

        /* renamed from: a */
        public final boolean m22283a(boolean z, boolean z2, boolean z3) {
            if (this.f18388h != null && this.f18388h.booleanValue() != z) {
                return false;
            }
            if (this.f18389i && this.f18389i.booleanValue() != z2) {
                return false;
            }
            if (!this.f18390j || this.f18390j.booleanValue() == z3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: e */
    public final C6571c mo5217e() {
        return null;
    }

    /* renamed from: g */
    public final C5002b mo7561g() {
        return this;
    }

    /* renamed from: h */
    public final String mo5285h() {
        return null;
    }

    static {
        C5062a c5062a = new C5062a(4);
        f28911w = c5062a;
        c5062a.m22672b(1931574222, 4);
    }

    public ac(Resources resources, C7481o c7481o, boolean z) {
        super(c7481o);
        this.f28912b = resources;
        this.f28913c = z;
        m34285a(new C4982a().m22280a(true).m22277a().m22278a(C4513R.drawable.maps_chevron).m22279a(resources.getColor(C4513R.color.maps_accuracy_circle_line_color), resources.getColor(C4513R.color.maps_accuracy_circle_fill_color)).m22282c(), new C4982a().m22280a(false).m22281b().m22278a(C4513R.drawable.maps_blue_dot).m22279a(resources.getColor(C4513R.color.maps_accuracy_circle_line_color), resources.getColor(C4513R.color.maps_accuracy_circle_fill_color)).m22282c());
        this.f28927q = 64.0f;
        this.f28928r = 0.5f;
        this.f28929s = 0.5f;
        this.f28930t = this.f28912b.getDimensionPixelSize(C4513R.dimen.maps_dav_my_location_bubble_y_offset);
        this.f28918h = new C6427i();
    }

    /* renamed from: a */
    public final void mo7041a(C5052d c5052d, aj ajVar) {
        this.f28915e = ajVar;
    }

    /* renamed from: d */
    public final C5016a mo7046d() {
        return C5016a.MY_LOCATION_OVERLAY_VECTORMAPS;
    }

    /* renamed from: a */
    public final boolean mo7044a(C6570b c6570b, C5052d c5052d) {
        c5052d = mo5283c();
        if (c5052d != null) {
            C7481o.m32471a(c6570b, c5052d, 0, Math.round(((float) this.f28930t) * this.f28931u), this.f28932v);
        }
        c6570b = c6570b.m29256l();
        float f = 0.8f;
        if (c6570b >= 1096810496) {
            f = 1.0f;
        } else if (c6570b >= 1092616192) {
            f = 0.8f + ((c6570b - 1092616192) * 1028443340);
        }
        this.f28931u = f;
        return true;
    }

    /* renamed from: a */
    public final synchronized void m34294a(ae aeVar) {
        if (!(this.f28920j.m21451k() == aeVar.m21451k() && C5569h.m24284a(this.f28920j.m21446f(), aeVar.m21446f()) && this.f28920j.m21447g() == aeVar.m21447g())) {
            this.f28926p = true;
        }
        this.f28920j.m21438a(aeVar);
        if (this.f28920j.m21451k() != null) {
            this.f28918h.mo4908b(this.f28920j);
        } else {
            this.f28918h = new C6427i();
        }
        if (this.f28915e != null) {
            this.f28915e.mo5221a(false, false);
        }
    }

    /* renamed from: a */
    private synchronized void m34285a(C4983a... c4983aArr) {
        this.f28917g = com.google.android.m4b.maps.aa.ae.m27682a((Object[]) c4983aArr);
        m34287l();
    }

    /* renamed from: l */
    private synchronized void m34287l() {
        for (C7490k f : this.f28916f.values()) {
            f.m32557f();
        }
        this.f28916f.clear();
    }

    /* renamed from: a */
    public final void m34293a(float f, int i, int i2) {
        this.f28927q = f * 0.5f;
        this.f28928r = ((float) i) / 100.0f;
        this.f28929s = ((float) i2) / 100.0f;
    }

    /* renamed from: a */
    public final void mo5281a() {
        this.f28924n = true;
    }

    public final void l_() {
        this.f28924n = false;
    }

    /* renamed from: c */
    public final synchronized af mo5283c() {
        return this.f28920j.m21436a();
    }

    /* renamed from: f */
    public final synchronized C4701c mo5284f() {
        return m34288m().m21446f();
    }

    /* renamed from: b */
    public final boolean mo5282b(C6570b c6570b) {
        af c = mo5283c();
        if (c == null) {
            return false;
        }
        int[] b = c6570b.m29243b(c);
        int ceil = (int) Math.ceil((double) ((this.f28927q * this.f28931u) * (m34289n().f18381a ? this.f28929s : this.f28928r)));
        int i = b[0] - ceil;
        int i2 = b[0] + ceil;
        int i3 = b[1] - ceil;
        int i4 = b[1] + ceil;
        if (i >= c6570b.m29249e() || i2 < 0 || i3 >= c6570b.m29250f() || i4 < 0) {
            return false;
        }
        return true;
    }

    public final af m_() {
        return this.f28932v;
    }

    /* renamed from: i */
    public final boolean mo5286i() {
        return this.f28913c;
    }

    /* renamed from: a */
    public final int mo5280a(float f, float f2, C6570b c6570b) {
        synchronized (this) {
            if (this.f28920j.m21451k()) {
                c6570b = c6570b.m29243b(this.f28920j.m21436a());
                return (int) (((f - ((float) c6570b[0])) * (f - ((float) c6570b[0]))) + ((f2 - ((float) c6570b[1])) * (f2 - ((float) c6570b[1]))));
            }
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    }

    /* renamed from: a */
    public final void mo7040a(C5052d c5052d) {
        m34287l();
        this.f28926p = true;
    }

    /* renamed from: a */
    public final boolean mo7558a(List<ag> list) {
        if (!this.f28926p) {
            return false;
        }
        this.f28926p = false;
        this.f28925o = mo5284f();
        C6482f c6482f = null;
        if (this.f28925o != null) {
            c6482f = C6487i.m28476a().m28504d(this.f28925o.m20902a());
        }
        list.clear();
        if (this.f28925o != null) {
            if (c6482f != null) {
                list.add(m29099a(C4984a.DEFAULT, c6482f));
                return true;
            }
        }
        return super.mo7558a((List) list);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo5222a(com.google.android.m4b.maps.ca.C5052d r7, com.google.android.m4b.maps.bz.C6570b r8, com.google.android.m4b.maps.bx.C5009j r9) {
        /*
        r6 = this;
        r0 = r9.m22388b();
        if (r0 > 0) goto L_0x0082;
    L_0x0006:
        r0 = r6.f28920j;
        r0 = r0.m21451k();
        if (r0 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0082;
    L_0x000f:
        monitor-enter(r6);
        r0 = 0;
        r6.f28914d = r0;	 Catch:{ all -> 0x007f }
        r0 = r6.f28914d;	 Catch:{ all -> 0x007f }
        if (r0 == 0) goto L_0x003c;
    L_0x0017:
        r0 = r6.f28918h;	 Catch:{ all -> 0x007f }
        r1 = r6.f28921k;	 Catch:{ all -> 0x007f }
        r0 = r0.mo4907a(r1);	 Catch:{ all -> 0x007f }
        if (r0 == 0) goto L_0x003c;
    L_0x0021:
        r0 = r6.f28921k;	 Catch:{ all -> 0x007f }
        r0 = r0.m21451k();	 Catch:{ all -> 0x007f }
        if (r0 == 0) goto L_0x003c;
    L_0x0029:
        r0 = r6.f28922l;	 Catch:{ all -> 0x007f }
        r1 = r6.f28921k;	 Catch:{ all -> 0x007f }
        r0.m21438a(r1);	 Catch:{ all -> 0x007f }
        r0 = r7.m22616e();	 Catch:{ all -> 0x007f }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r4 = r0 + r2;
        r7.m22608a(r4);	 Catch:{ all -> 0x007f }
        goto L_0x0043;
    L_0x003c:
        r0 = r6.f28922l;	 Catch:{ all -> 0x007f }
        r1 = r6.f28920j;	 Catch:{ all -> 0x007f }
        r0.m21438a(r1);	 Catch:{ all -> 0x007f }
    L_0x0043:
        r0 = r6.f28922l;	 Catch:{ all -> 0x007f }
        r0 = r0.m21451k();	 Catch:{ all -> 0x007f }
        if (r0 != 0) goto L_0x004d;
    L_0x004b:
        monitor-exit(r6);	 Catch:{ all -> 0x007f }
        return;
    L_0x004d:
        monitor-exit(r6);	 Catch:{ all -> 0x007f }
        r0 = r7.m22635x();
        r0.glPushMatrix();
        r1 = 0;
        r2 = r6.f28925o;
        if (r2 == 0) goto L_0x0073;
    L_0x005a:
        r1 = r9.m22389c();
        r2 = r6.f28925o;
        r2 = r2.m20902a();
        r1 = r1.m22296a(r2);
        if (r1 == 0) goto L_0x0073;
    L_0x006a:
        r2 = r6.f28922l;
        r2 = r2.m21436a();
        r1.mo5088a(r7, r8, r9, r2);
    L_0x0073:
        r6.m34286b(r7, r8, r9);
        if (r1 == 0) goto L_0x007b;
    L_0x0078:
        r1.mo5087a(r7, r9);
    L_0x007b:
        r0.glPopMatrix();
        return;
    L_0x007f:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x007f }
        throw r7;
    L_0x0082:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bx.ac.a(com.google.android.m4b.maps.ca.d, com.google.android.m4b.maps.bz.b, com.google.android.m4b.maps.bx.j):void");
    }

    /* renamed from: b */
    private synchronized void m34286b(C5052d c5052d, C6570b c6570b, C5009j c5009j) {
        ac acVar = this;
        C5052d c5052d2 = c5052d;
        C6570b c6570b2 = c6570b;
        synchronized (this) {
            try {
                C4983a n;
                if (acVar.f28922l.m21443c() > 0) {
                    if (acVar.f28919i == null) {
                        String str = "MyLocation";
                    }
                    acVar.f28919i.m32419a(acVar.f28922l.m21444d(), acVar.f28922l.m21443c() * 2);
                    n = m34289n();
                    acVar.f28919i.m32422b(n.f18386f);
                    acVar.f28919i.m32423c(n.f18387g);
                    acVar.f28919i.mo5222a(c5052d2, c6570b2, c5009j);
                }
                float a = c6570b2.m29231a(acVar.f28927q, c6570b2.m29232a(acVar.f28922l.m21436a(), true)) * acVar.f28931u;
                GL10 x = c5052d.m22635x();
                an.m22324a(c5052d2, c6570b2, acVar.f28922l.m21436a(), a);
                c5052d.m22627p();
                c5052d2.f18689g.mo7123d(c5052d2);
                c5052d2.f18685c.mo7118d(c5052d2);
                n = m34289n();
                Object obj = n.f18383c != n.f18382b ? 1 : null;
                x.glBlendFunc(1, 771);
                x.glTexEnvx(8960, 8704, 7681);
                x.glColor4x(65536, 65536, 65536, 65536);
                if (n.f18384d != 0) {
                    x.glTexEnvx(8960, 8704, 8448);
                    m34284a(c5052d2, n.f18384d).m32544a(x);
                    float h = (acVar.f28922l.m21448h() * 10.0f) + 1.0f;
                    float h2 = 1.0f - (acVar.f28922l.m21448h() * 3.0f);
                    float h3 = acVar.f28922l.m21448h() * 4.0f;
                    float h4 = acVar.f28922l.m21448h() * -4.0f;
                    x.glColor4f(h2, h2, h2, h2);
                    x.glTranslatef(h3, h4, 0.0f);
                    x.glScalef(h, h, h);
                    x.glDrawArrays(5, 0, 4);
                    h2 = 1.0f / h;
                    x.glScalef(h2, h2, h2);
                    x.glTranslatef(-h3, -h4, 0.0f);
                    x.glColor4x(65536, 65536, 65536, 65536);
                    x.glTexEnvx(8960, 8704, 7681);
                }
                if (acVar.f28922l.m21448h() != 0.0f) {
                    x.glTranslatef(0.0f, 0.0f, acVar.f28922l.m21448h() * ((float) acVar.f28922l.m21436a().m21488e()));
                }
                if (acVar.f28922l.m21445e() && n.f18385e != 0) {
                    x.glRotatef(-acVar.f28922l.m21442b(), 0.0f, 0.0f, 1.0f);
                    x.glScalef(2.0f, 2.0f, 2.0f);
                    m34284a(c5052d2, n.f18385e).m32544a(x);
                    x.glDrawArrays(5, 0, 4);
                    x.glScalef(0.5f, 0.5f, 0.5f);
                    x.glRotatef(acVar.f28922l.m21442b(), 0.0f, 0.0f, 1.0f);
                }
                if (m34289n().f18381a) {
                    x.glRotatef(-acVar.f28922l.m21442b(), 0.0f, 0.0f, 1.0f);
                } else {
                    x.glRotatef(-c6570b.m29254j(), 0.0f, 0.0f, 1.0f);
                    x.glRotatef(c6570b.m29255k(), 1.0f, 0.0f, 0.0f);
                }
                if (obj == null || acVar.f28922l.m21450j() != 1.0f) {
                    m34284a(c5052d2, n.f18382b).m32544a(x);
                } else {
                    m34284a(c5052d2, n.f18383c).m32544a(x);
                }
                x.glDrawArrays(5, 0, 4);
            } finally {
                c5052d2 = r0;
            }
        }
    }

    /* renamed from: a */
    public final int mo5216a(C6570b c6570b) {
        return this.f28914d;
    }

    /* renamed from: a */
    private synchronized C7490k m34284a(C5052d c5052d, int i) {
        C7490k c7490k;
        c7490k = (C7490k) this.f28916f.get(Integer.valueOf(i));
        if (c7490k == null) {
            c7490k = new C7490k(c5052d);
            c7490k.m32552c(true);
            c7490k.m32541a(this.f28912b, i);
            this.f28916f.put(Integer.valueOf(i), c7490k);
        }
        return c7490k;
    }

    /* renamed from: m */
    private synchronized ae m34288m() {
        return this.f28920j;
    }

    /* renamed from: n */
    private C4983a m34289n() {
        boolean e;
        boolean g;
        boolean i;
        synchronized (this) {
            ae m = m34288m();
            e = m.m21445e();
            g = m.m21447g();
            i = m.m21449i();
        }
        return m34283a(e, i, g);
    }

    /* renamed from: a */
    private synchronized C4983a m34283a(boolean z, boolean z2, boolean z3) {
        for (C4983a c4983a : this.f28917g) {
            if (c4983a.m22283a(z, z2, z3)) {
                return c4983a;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo7563a(List<C5011l> list, float f, float f2, af afVar, C6570b c6570b, int i) {
        if (this.f28913c != null) {
            int a = mo5280a(f, f2, c6570b);
            if (a < i) {
                list.add(new C5011l(this, this, a));
            }
        }
    }
}
