package com.google.android.m4b.maps.ci;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import android.widget.TextView;
import com.google.android.m4b.maps.aa.af;
import com.google.android.m4b.maps.ar.C4662a;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.cg.C5162c;
import com.google.android.m4b.maps.cg.an;
import com.google.android.m4b.maps.ch.C5203e;
import com.google.android.m4b.maps.ch.C5203e.C5201a;
import com.google.android.m4b.maps.p101a.C4526l;
import com.google.android.m4b.maps.p101a.C4529m.C4527a;
import com.google.android.m4b.maps.p101a.C4529m.C4528b;
import com.google.android.m4b.maps.p101a.C4532r;
import com.google.android.m4b.maps.p102b.C6424g;
import com.google.android.m4b.maps.p102b.C6426j;
import com.google.android.m4b.maps.p125y.C5566g;
import com.google.android.m4b.maps.p125y.C5579p;
import java.util.Calendar;
import java.util.Map;

/* renamed from: com.google.android.m4b.maps.ci.a */
class C5206a {
    /* renamed from: a */
    private static final String f19382a = "a";
    /* renamed from: b */
    private static final C4527a f19383b = new C66361();
    /* renamed from: c */
    private final C5207b f19384c;
    /* renamed from: d */
    private final TextView f19385d;
    /* renamed from: e */
    private final C4526l f19386e;
    /* renamed from: f */
    private final C6641c f19387f;
    /* renamed from: g */
    private final Calendar f19388g;
    /* renamed from: h */
    private final boolean f19389h;
    /* renamed from: i */
    private final an f19390i;
    /* renamed from: j */
    private final String f19391j;
    /* renamed from: k */
    private int f19392k = 1;
    /* renamed from: l */
    private C5162c f19393l;
    /* renamed from: m */
    private C4662a f19394m;
    /* renamed from: n */
    private String f19395n;
    /* renamed from: o */
    private C6424g f19396o;
    /* renamed from: p */
    private C6426j f19397p;
    /* renamed from: q */
    private C6647k f19398q;
    /* renamed from: r */
    private Bitmap f19399r;
    /* renamed from: s */
    private String f19400s;
    /* renamed from: t */
    private Bitmap f19401t;

    /* renamed from: com.google.android.m4b.maps.ci.a$1 */
    class C66361 implements C4527a {
        C66361() {
        }

        /* renamed from: a */
        public final void mo4905a(C4532r c4532r) {
            if (!C5579p.m24319b(c4532r.getMessage()) && C4728u.m21050a(C5206a.f19382a, 6)) {
                Log.e(C5206a.f19382a, c4532r.getMessage());
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ci.a$3 */
    class C66383 implements C4528b<Bitmap> {
        /* renamed from: a */
        private /* synthetic */ C5206a f24860a;

        C66383(C5206a c5206a) {
            this.f24860a = c5206a;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4906a(Object obj) {
            this.f24860a.f19399r = (Bitmap) obj;
            if (this.f24860a.f19393l == null || this.f24860a.f19393l.m23077a() == null) {
                this.f24860a.m23242g();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ci.a$4 */
    class C66394 implements C4528b<String> {
        /* renamed from: a */
        private /* synthetic */ C5206a f24861a;

        C66394(C5206a c5206a) {
            this.f24861a = c5206a;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4906a(Object obj) {
            String str = (String) obj;
            C5206a c5206a = this.f24861a;
            Calendar c = this.f24861a.f19388g;
            Object[] split = str.replace("[", "").replace("]", "").replace("\"", "").split(",");
            int i = c.get(1);
            obj = String.valueOf(C5566g.m24266a(", ").m24271a(split));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 13);
            stringBuilder.append("©");
            stringBuilder.append(i);
            stringBuilder.append(" ");
            stringBuilder.append(obj);
            c5206a.f19400s = stringBuilder.toString().trim();
            this.f24861a.m23242g();
        }
    }

    /* renamed from: com.google.android.m4b.maps.ci.a$5 */
    class C66405 implements C4528b<Bitmap> {
        /* renamed from: a */
        private /* synthetic */ C5206a f24862a;

        C66405(C5206a c5206a) {
            this.f24862a = c5206a;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo4906a(Object obj) {
            this.f24862a.f19401t = (Bitmap) obj;
            if (this.f24862a.f19393l.m23077a() != null) {
                this.f24862a.m23242g();
            }
        }
    }

    /* renamed from: com.google.android.m4b.maps.ci.a$a */
    static class C7523a extends C6424g {
        /* renamed from: a */
        private final String f28123a;

        C7523a(String str, C4528b<Bitmap> c4528b, String str2) {
            super(str, c4528b, 0, 0, Config.ARGB_8888, C5206a.f19383b);
            this.f28123a = str2;
        }

        /* renamed from: h */
        public final Map<String, String> mo4887h() {
            return af.m20488a("User-Agent", this.f28123a);
        }
    }

    /* renamed from: com.google.android.m4b.maps.ci.a$b */
    static class C7524b extends C6426j {
        /* renamed from: a */
        private final String f28124a;

        C7524b(String str, C4528b<String> c4528b, String str2) {
            super(str, c4528b, C5206a.f19383b);
            this.f28124a = str2;
        }

        /* renamed from: h */
        public final Map<String, String> mo4887h() {
            return af.m20488a("User-Agent", this.f28124a);
        }
    }

    C5206a(C5207b c5207b, TextView textView, C4526l c4526l, C6641c c6641c, Calendar calendar, boolean z, an anVar, final C5203e c5203e, C5162c c5162c, String str) {
        this.f19384c = c5207b;
        this.f19385d = textView;
        this.f19386e = c4526l;
        this.f19387f = c6641c;
        this.f19388g = calendar;
        this.f19389h = z;
        this.f19390i = anVar;
        this.f19393l = c5162c;
        this.f19391j = str;
        c5203e.m23225a(new C5201a(this) {
            /* renamed from: b */
            private /* synthetic */ C5206a f24859b;

            /* renamed from: a */
            public final void mo5330a() {
                this.f24859b.m23246a(c5203e.m23227c().m23233d(), c5203e.m23229e());
            }
        });
    }

    /* renamed from: a */
    final void m23246a(String str, C4662a c4662a) {
        this.f19395n = str;
        this.f19394m = c4662a.m20842g(1);
        m23248c();
    }

    /* renamed from: a */
    final void m23245a(int i) {
        this.f19392k = i;
        m23248c();
    }

    /* renamed from: a */
    final C5162c m23244a() {
        return this.f19393l;
    }

    /* renamed from: b */
    final void m23247b() {
        if (this.f19393l != null) {
            if (m23243h()) {
                this.f19384c.m23252a(this.f19393l.m23077a() ? this.f19401t : this.f19399r, this.f19398q);
            } else {
                m23248c();
            }
        }
    }

    /* renamed from: c */
    final void m23248c() {
        boolean z = false;
        this.f19390i.m22861a(false);
        C6647k b = this.f19387f.m29585b();
        Object obj = (b.f24923f <= 0 || b.f24924g <= 0) ? null : 1;
        if (!(obj == null || this.f19394m == null || C5579p.m24319b(this.f19395n))) {
            z = true;
        }
        if (z) {
            C4662a g = this.f19394m.m20842g(10);
            this.f19398q = new C6647k(b.f24922e, b.f24923f, b.f24924g, (double) g.m20842g(5).m20840f(5), b.f24918a, b.f24919b, b.f24920c, b.f24921d);
            if (this.f19392k == 0) {
                m23249d();
                m23242g();
                return;
            }
            String a = C5210i.m23255a(g, this.f19398q, this.f19392k, null, this.f19395n);
            if (this.f19396o == null || !a.equals(this.f19396o.m20434c())) {
                m23249d();
                this.f19396o = (C6424g) this.f19386e.mo4884a(new C7523a(a, new C66383(this), this.f19391j));
                if (this.f19389h) {
                    this.f19397p = (C6426j) this.f19386e.mo4884a(new C7524b(C5210i.m23256a(g, this.f19398q, this.f19392k, this.f19395n), new C66394(this), this.f19391j));
                }
                if (this.f19393l != null) {
                    this.f19386e.mo4884a(new C7523a(C5210i.m23255a(g, this.f19398q, this.f19392k, this.f19393l, this.f19395n), new C66405(this), this.f19391j));
                }
            } else {
                if (m23243h()) {
                    this.f19390i.m22861a(true);
                }
            }
        }
    }

    /* renamed from: g */
    private void m23242g() {
        if (m23243h()) {
            Bitmap bitmap = (this.f19393l == null || !this.f19393l.m23077a()) ? this.f19399r : this.f19401t;
            this.f19384c.m23252a(bitmap, this.f19398q);
            if (this.f19400s != null) {
                this.f19385d.setText(this.f19400s);
            } else {
                this.f19385d.setText("");
            }
            this.f19390i.m22861a(true);
        }
    }

    /* renamed from: d */
    final void m23249d() {
        if (this.f19396o != null) {
            this.f19396o.m20437f();
            this.f19396o = null;
            this.f19399r = null;
            this.f19401t = null;
        }
        if (this.f19397p != null) {
            this.f19397p.m20437f();
            this.f19397p = null;
            this.f19400s = null;
        }
    }

    /* renamed from: h */
    private boolean m23243h() {
        if (this.f19396o == null) {
            return true;
        }
        Bitmap bitmap = (this.f19393l == null || !this.f19393l.m23077a()) ? this.f19399r : this.f19401t;
        if (bitmap == null || (this.f19389h && this.f19400s == null)) {
            return false;
        }
        return true;
    }
}
