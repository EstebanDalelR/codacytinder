package com.google.android.m4b.maps.ce;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.aa.ax;
import com.google.android.m4b.maps.ab.C4590a;
import com.google.android.m4b.maps.ax.C4699a;
import com.google.android.m4b.maps.ax.C4699a.C6404a;
import com.google.android.m4b.maps.bo.C4846f;
import com.google.android.m4b.maps.bo.C4847g;
import com.google.android.m4b.maps.bo.C4848k;
import com.google.android.m4b.maps.bo.C4854s;
import com.google.android.m4b.maps.bo.C4854s.C4853a;
import com.google.android.m4b.maps.bo.C6519h;
import com.google.android.m4b.maps.bo.C6527u;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.ag;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.am;
import com.google.android.m4b.maps.bo.ao;
import com.google.android.m4b.maps.bo.as;
import com.google.android.m4b.maps.bo.bg;
import com.google.android.m4b.maps.bo.br;
import com.google.android.m4b.maps.bw.C4981g;
import com.google.android.m4b.maps.bx.ae;
import com.google.android.m4b.maps.bx.ak;
import com.google.android.m4b.maps.bx.ak.C4991a;
import com.google.android.m4b.maps.bz.C6570b;
import com.google.android.m4b.maps.ca.C5052d;
import com.google.android.m4b.maps.ca.C7490k.C6574a;
import com.google.android.m4b.maps.cc.C7498h;
import com.google.android.m4b.maps.cc.C8081k;
import com.google.android.m4b.maps.cc.C8082n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.ce.e */
public final class C5099e {
    /* renamed from: a */
    private static C5094b f18905a = new C5094b();
    /* renamed from: A */
    private Set<C5094b> f18906A;
    /* renamed from: B */
    private final List<C5096d> f18907B = new ArrayList();
    /* renamed from: C */
    private Iterator<C5096d> f18908C;
    /* renamed from: D */
    private final Comparator<C5096d> f18909D = new C5097a();
    /* renamed from: E */
    private C4590a f18910E;
    /* renamed from: F */
    private final Map<C5094b, C4847g> f18911F = ax.m20623b();
    /* renamed from: G */
    private final C4981g f18912G;
    /* renamed from: b */
    private final ak f18913b;
    /* renamed from: c */
    private volatile C5095c f18914c;
    /* renamed from: d */
    private final C6574a<Bitmap> f18915d;
    /* renamed from: e */
    private C4846f f18916e;
    /* renamed from: f */
    private C6570b f18917f;
    /* renamed from: g */
    private final C5052d f18918g;
    /* renamed from: h */
    private float f18919h;
    /* renamed from: i */
    private br f18920i;
    /* renamed from: j */
    private ae f18921j;
    /* renamed from: k */
    private Iterator<C4848k> f18922k;
    /* renamed from: l */
    private ArrayList<C7498h> f18923l;
    /* renamed from: m */
    private int f18924m;
    /* renamed from: n */
    private ArrayList<C7498h> f18925n;
    /* renamed from: o */
    private int f18926o;
    /* renamed from: p */
    private final Map<String, Integer> f18927p = ax.m20623b();
    /* renamed from: q */
    private int f18928q;
    /* renamed from: r */
    private float f18929r;
    /* renamed from: s */
    private int f18930s;
    /* renamed from: t */
    private int f18931t;
    /* renamed from: u */
    private boolean f18932u;
    /* renamed from: v */
    private boolean f18933v;
    /* renamed from: w */
    private volatile boolean f18934w;
    /* renamed from: x */
    private boolean f18935x;
    /* renamed from: y */
    private boolean f18936y;
    /* renamed from: z */
    private volatile boolean f18937z;

    /* renamed from: com.google.android.m4b.maps.ce.e$a */
    static final class C5097a implements Comparator<C5096d> {
        private C5097a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return C5099e.m22753a(((C5096d) obj2).m22748a()) - C5099e.m22753a(((C5096d) obj).m22748a());
        }
    }

    /* renamed from: com.google.android.m4b.maps.ce.e$b */
    public static final class C5098b implements Iterator<C7498h> {
        /* renamed from: a */
        private final ArrayList<C7498h> f18902a;
        /* renamed from: b */
        private final int f18903b;
        /* renamed from: c */
        private int f18904c = null;

        public final /* synthetic */ Object next() {
            return m22752a();
        }

        public C5098b(ArrayList<C7498h> arrayList) {
            this.f18902a = arrayList;
            this.f18903b = arrayList.size();
            while (this.f18904c < this.f18903b && this.f18902a.get(this.f18904c) == null) {
                this.f18904c++;
            }
        }

        public final boolean hasNext() {
            return this.f18904c < this.f18903b;
        }

        /* renamed from: a */
        public final C7498h m22752a() {
            ArrayList arrayList = this.f18902a;
            int i = this.f18904c;
            this.f18904c = i + 1;
            C7498h c7498h = (C7498h) arrayList.get(i);
            while (this.f18904c < this.f18903b && this.f18902a.get(this.f18904c) == null) {
                this.f18904c++;
            }
            return c7498h;
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5099e(C5095c c5095c, C5052d c5052d, Resources resources, C4981g c4981g) {
        this.f18913b = new ak(resources.getDisplayMetrics().density);
        this.f18914c = c5095c;
        this.f18918g = c5052d;
        this.f18915d = new C6574a(16);
        this.f18923l = new ArrayList();
        this.f18924m = -1;
        this.f18925n = new ArrayList();
        this.f18926o = -1;
        this.f18912G = c4981g;
    }

    /* renamed from: a */
    public final void m22768a() {
        for (int i = 0; i < this.f18923l.size(); i++) {
            if (((C7498h) this.f18923l.get(i)) != null) {
                ((C7498h) this.f18923l.get(i)).mo5224c(this.f18918g);
            }
        }
        this.f18913b.m22317a();
        this.f18915d.m22247a();
    }

    /* renamed from: b */
    public final void m22774b() {
        this.f18934w = true;
    }

    /* renamed from: a */
    public final void m22772a(C5095c c5095c) {
        if (c5095c != this.f18914c) {
            this.f18914c = c5095c;
            this.f18934w = true;
        }
    }

    /* renamed from: a */
    public final void m22773a(boolean z) {
        if (z) {
            this.f18913b.m22317a();
            this.f18915d.m22247a();
            return;
        }
        this.f18913b.m22321b();
    }

    /* renamed from: a */
    public final void m22770a(br brVar) {
        m22766e();
        brVar = brVar.mo5129a();
        int size = this.f18925n.size();
        for (int i = 0; i < size; i++) {
            C7498h c7498h = (C7498h) this.f18925n.get(i);
            if (c7498h != null) {
                if (c7498h.mo7044a(this.f18917f, this.f18918g) && brVar.mo5135b(c7498h.mo7569n().mo5089a())) {
                    m22764c(c7498h);
                } else {
                    c7498h.mo5224c(this.f18918g);
                }
            }
        }
        this.f18925n.clear();
        this.f18926o = -1;
        this.f18935x = true;
        this.f18936y = true;
        this.f18933v = false;
    }

    /* renamed from: a */
    private boolean m22758a(ag agVar) {
        return (agVar.m28542b().m21619b() != this.f18931t || this.f18932u == null) ? null : true;
    }

    /* renamed from: a */
    public final void m22769a(int i) {
        if (this.f18923l != null) {
            Iterator it = this.f18923l.iterator();
            while (it.hasNext()) {
                C7498h c7498h = (C7498h) it.next();
                if (c7498h != null) {
                    c7498h.mo7038a(i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m22771a(C6570b c6570b, br brVar, int i, Iterator<C4848k> it, ae aeVar, Set<C4699a> set, Set<C5094b> set2, Map<C5094b, C4847g> map, int i2, bg bgVar) {
        int size;
        long elapsedRealtime = SystemClock.elapsedRealtime() + 20;
        C6570b c6570b2 = c6570b;
        this.f18917f = c6570b2;
        this.f18922k = it;
        this.f18921j = aeVar;
        br brVar2 = brVar;
        this.f18920i = brVar2;
        this.f18931t = i;
        this.f18906A = set2;
        this.f18916e = new C4846f(brVar2.mo5133c());
        Map map2 = this.f18911F;
        map2.clear();
        if (!map.isEmpty()) {
            size = map.size();
            map2.put(f18905a, new C6519h(size));
            for (C5094b put : map.keySet()) {
                map2.put(put, new C6519h(size - 1));
            }
            for (C5094b c5094b : map.keySet()) {
                C4847g c4847g = (C4847g) map.get(c5094b);
                for (C5094b c5094b2 : map2.keySet()) {
                    if (!c5094b2.equals(c5094b)) {
                        ((C6519h) map2.get(c5094b2)).m28714a(c4847g);
                    }
                }
            }
        }
        float g = c6570b2.m29251g();
        float f = ((float) (c6570b2.m29250f() * c6570b2.m29249e())) / (g * g);
        int i3 = (int) (f > 200000.0f ? ((f - 200000.0f) * 1.0E-4f) + 44.0f : f * 2.2E-4f);
        if (i3 != r0.f18928q) {
            r0.f18928q = i3;
            r0.f18913b.m22318a(i3 * 2);
        }
        r0.f18929r = (r0.f18917f.m29251g() * r0.f18917f.m29251g()) * 200.0f;
        m22766e();
        r0.f18907B.clear();
        r0.f18908C = null;
        i3 = r0.f18925n.size();
        ArrayList arrayList = new ArrayList(i3);
        r0.f18919h = r0.f18917f.m29257m();
        r0.f18932u = r0.f18931t < r0.f18912G.m22274a().m22369a(r0.f18917f.m29242b(), bgVar).m22356b();
        for (size = 0; size < i3; size++) {
            C7498h c7498h = (C7498h) r0.f18925n.get(size);
            if (c7498h != null) {
                if (!set.contains(c7498h.m32665t().mo5107a())) {
                    Object obj;
                    boolean a;
                    if (r0.f18919h >= c7498h.m32661p()) {
                        if (m22760a(c7498h.m32660o())) {
                            if (((c7498h.m32665t() instanceof ag) && m22758a((ag) c7498h.m32665t())) || c7498h.m32662q() <= 0.0f || r0.f18919h < c7498h.m32662q()) {
                                obj = 1;
                                if (obj == null) {
                                    if (c7498h.mo7044a(r0.f18917f, r0.f18918g)) {
                                        if (r0.f18914c.f18899r) {
                                            a = c7498h.mo7566a(r0.f18920i);
                                        } else {
                                            a = r0.f18920i.mo5135b(c7498h.mo7569n().mo5089a());
                                        }
                                        if (a && !m22767e(c7498h)) {
                                            if (m22762b(c7498h)) {
                                                m22764c(c7498h);
                                            } else {
                                                c7498h.mo5224c(r0.f18918g);
                                            }
                                        }
                                    }
                                    arrayList.add(c7498h);
                                    c7498h.mo5224c(r0.f18918g);
                                }
                            }
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        if (c7498h.mo7044a(r0.f18917f, r0.f18918g)) {
                            if (r0.f18914c.f18899r) {
                                a = c7498h.mo7566a(r0.f18920i);
                            } else {
                                a = r0.f18920i.mo5135b(c7498h.mo7569n().mo5089a());
                            }
                            if (m22762b(c7498h)) {
                                c7498h.mo5224c(r0.f18918g);
                            } else {
                                m22764c(c7498h);
                            }
                        }
                        arrayList.add(c7498h);
                        c7498h.mo5224c(r0.f18918g);
                    }
                }
                c7498h.mo5224c(r0.f18918g);
            } else {
                Set<C4699a> set3 = set;
            }
        }
        i3 = arrayList.size();
        for (size = 0; size < i3; size++) {
            C7498h c7498h2 = (C7498h) arrayList.get(size);
            m22756a(c7498h2.m32665t(), c7498h2.m32660o(), c7498h2.m32666u(), false);
        }
        r0.f18925n.clear();
        r0.f18926o = -1;
        r0.f18935x = false;
        r0.f18936y = false;
        r0.f18933v = m22757a(elapsedRealtime);
    }

    /* renamed from: b */
    public final void m22775b(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + 20;
        if (!(this.f18935x == 0 && this.f18936y == 0)) {
            i = this.f18936y;
            m22766e();
            int size = this.f18925n.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7498h c7498h = (C7498h) this.f18925n.get(i2);
                if (c7498h != null) {
                    if ((i == 0 || (c7498h.mo7566a(this.f18920i) && !m22767e(c7498h))) && !m22762b(c7498h)) {
                        m22764c(c7498h);
                    } else {
                        c7498h.mo5224c(this.f18918g);
                    }
                }
            }
            this.f18925n.clear();
            this.f18926o = -1;
            this.f18935x = false;
            this.f18936y = false;
        }
        this.f18933v = m22757a(elapsedRealtime);
    }

    /* renamed from: c */
    public final boolean m22776c() {
        return this.f18933v;
    }

    /* renamed from: a */
    static int m22753a(C4848k c4848k) {
        int i = 0;
        int i2;
        switch (c4848k.mo5109h()) {
            case 2:
                ao aoVar = (ao) c4848k;
                i2 = 0;
                while (i < aoVar.m28580c()) {
                    i2 = Math.max(i2, C5099e.m22754a(aoVar.m28578a(i), aoVar.mo5108e()));
                    i++;
                }
                return i2;
            case 3:
            case 4:
            case 5:
                return 0;
            case 7:
                ag agVar = (ag) c4848k;
                return C5099e.m22754a(agVar.m28557p(), agVar.mo5108e()) + C5099e.m22754a(agVar.m28558q(), agVar.mo5108e());
            case 8:
            case 11:
                C6527u c6527u = (C6527u) c4848k;
                i2 = 0;
                while (i < c6527u.m28773c()) {
                    i2 = Math.max(i2, C5099e.m22754a(c6527u.m28771a(i), c6527u.mo5108e()));
                    i++;
                }
                return i2;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static int m22754a(C4854s c4854s, as asVar) {
        int i = 0;
        if (c4854s == null) {
            return 0;
        }
        asVar = (asVar == null || !asVar.m21561e()) ? 10 : asVar.m21565i().m21589f();
        int i2 = 0;
        while (i < c4854s.m21780b()) {
            C4853a a = c4854s.m21778a(i);
            if (a.m21766c()) {
                int f = (a.m21767d() && a.m21773j().m21561e()) ? a.m21773j().m21565i().m21589f() : asVar;
                i2 += a.m21772i().length() * f;
            }
            if (a.m21765b()) {
                i2 += 8;
            }
            if (a.m21768e()) {
                i2 = (int) (((float) i2) + a.m21774k());
            }
            i++;
        }
        return i2;
    }

    /* renamed from: d */
    public final C5098b m22777d() {
        return new C5098b(this.f18923l);
    }

    /* renamed from: a */
    private void m22756a(C4848k c4848k, C5094b c5094b, boolean z, boolean z2) {
        C4848k c4848k2 = c4848k;
        C5094b c5094b2 = c5094b;
        if (!m22760a(c5094b2)) {
            return;
        }
        if (c4848k2 instanceof ao) {
            ao aoVar = (ao) c4848k2;
            aj b = aoVar.m28579b();
            if (r0.f18920i.mo5135b(b.m21523a())) {
                aj a = m22755a(b);
                if (a != null && a.m21534d() > (r0.f18917f.m29262r() * r0.f18917f.m29251g()) * 40.0f) {
                    int i = 0;
                    while (i < aoVar.m28580c()) {
                        aj ajVar;
                        ao aoVar2;
                        int i2 = i;
                        C7498h a2 = C8082n.m34373a(aoVar, i, c5094b2, a.m21521a(0.7f), a.m21521a(0.3f), z, r0.f18914c, r0.f18917f, r0.f18915d);
                        if (a2 == null) {
                            float f = (float) r0.f18914c.f18884c;
                            float l = r0.f18917f.m29256l() - 14.5f;
                            if (l > 0.0f) {
                                f = (float) r0.f18914c.f18883b;
                                if (!r0.f18932u) {
                                    f += l;
                                }
                            }
                            float g = f * r0.f18917f.m29251g();
                            int i3 = r0.f18914c.f18896o ? 10 : 0;
                            C4854s a3 = aoVar.m28578a(i2);
                            float f2 = r0.f18914c.f18893l;
                            C4991a c4991a = r0.f18914c.f18882a;
                            C6570b c6570b = r0.f18917f;
                            ajVar = a;
                            C6570b c6570b2 = c6570b;
                            aoVar2 = aoVar;
                            a2 = C8081k.m34356a(aoVar, c5094b2, a3, a, i3, z, g, f2, c4991a, c6570b2, r0.f18913b, r0.f18914c.f18898q);
                        } else {
                            ajVar = a;
                            aoVar2 = aoVar;
                        }
                        if (m22759a(a2) && z2) {
                            a2.m32653b(true);
                        }
                        i = i2 + 1;
                        aoVar = aoVar2;
                        a = ajVar;
                        c5094b2 = c5094b;
                    }
                }
            }
            return;
        }
        int i4 = 0;
        C7498h c7498h = null;
        if (c4848k2 instanceof C6527u) {
            C6527u c6527u = (C6527u) c4848k2;
            if (c6527u.m28773c() != 0) {
                aj b2 = c6527u.m28772b();
                if (r0.f18920i.mo5135b(b2.m21523a())) {
                    aj a4 = m22755a(b2);
                    if (a4 != null) {
                        c7498h = C8081k.m34358a(c6527u, c5094b, c6527u.m28771a(0), a4, z, C7498h.m32643a(c6527u.mo5108e(), r0.f18914c.f18890i, r0.f18914c.f18891j, r0.f18914c.f18892k, r0.f18917f.m29251g()), r0.f18914c.f18889h, r0.f18914c.f18893l, r0.f18917f, r0.f18913b, r0.f18914c.f18898q);
                    }
                }
            }
            if (m22759a(c7498h) && z2) {
                c7498h.m32653b(true);
            }
            return;
        }
        C5094b c5094b3 = c5094b;
        if (c4848k2 instanceof ag) {
            ag agVar = (ag) c4848k2;
            af b3 = agVar.m28556o()[0].m21424b();
            if (r0.f18920i.mo5131a(b3)) {
                boolean a5;
                C4847g b4 = m22761b(c5094b3);
                if (b4 != null) {
                    a5 = b4.mo5090a(b3);
                } else {
                    a5 = false;
                }
                if (!a5) {
                    i4 = 1;
                }
            }
            if (i4 != 0 && agVar.m28552k() <= r0.f18919h) {
                if (agVar.m28555n() <= -1.0f || agVar.m28555n() > r0.f18919h || m22758a(agVar)) {
                    c7498h = C8082n.m34372a(agVar, c5094b3, z, r0.f18917f, r0.f18915d, r0.f18913b, r0.f18914c, r0.f18910E);
                }
            }
            if (m22759a(c7498h) && z2) {
                c7498h.m32653b(true);
            }
        }
    }

    /* renamed from: a */
    private aj m22755a(aj ajVar) {
        ArrayList arrayList = new ArrayList();
        this.f18916e.m21746a(ajVar, arrayList);
        ajVar = arrayList.size();
        if (ajVar == null) {
            return null;
        }
        int i = 1;
        if (ajVar == 1) {
            return (aj) arrayList.get(0);
        }
        aj ajVar2 = (aj) arrayList.get(0);
        float d = ajVar2.m21534d();
        while (i < ajVar) {
            float d2 = ((aj) arrayList.get(i)).m21534d();
            if (d2 > d) {
                ajVar2 = (aj) arrayList.get(i);
                d = d2;
            }
            i++;
        }
        return ajVar2;
    }

    /* renamed from: a */
    private boolean m22759a(C7498h c7498h) {
        if (c7498h != null) {
            Object obj;
            if (this.f18927p.containsKey(c7498h.mo7571s())) {
                int intValue = ((Integer) this.f18927p.get(c7498h.mo7571s())).intValue();
                C7498h c7498h2 = (C7498h) this.f18923l.get(intValue);
                if (c7498h2 != null) {
                    Object obj2 = ((c7498h2 instanceof C8082n) && (c7498h instanceof C8082n) && ((C8082n) c7498h).m34383v() && !((C8082n) c7498h2).m34383v()) ? 1 : null;
                    if (obj2 != null) {
                        m22763c(intValue);
                    }
                }
                c7498h.mo5224c(this.f18918g);
                return false;
            }
            c7498h.mo7044a(this.f18917f, this.f18918g);
            if (!m22767e(c7498h)) {
                if (m22762b(c7498h)) {
                }
                obj = null;
                if (obj == null && c7498h.mo7567b(this.f18917f, this.f18918g)) {
                    if (!m22767e(c7498h)) {
                        if (m22762b(c7498h)) {
                        }
                        obj = null;
                        if (obj == null) {
                        }
                        if (obj != null) {
                            m22764c(c7498h);
                            return true;
                        }
                        c7498h.mo5224c(this.f18918g);
                    }
                } else if (obj != null) {
                    c7498h.mo5224c(this.f18918g);
                } else {
                    m22764c(c7498h);
                    return true;
                }
            }
            obj = 1;
            if (obj == null) {
            }
            if (obj != null) {
                c7498h.mo5224c(this.f18918g);
            } else {
                m22764c(c7498h);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m22762b(C7498h c7498h) {
        int r = c7498h.mo7570r();
        boolean u = c7498h.m32666u();
        am n = c7498h.mo7569n();
        am a = n.mo5089a();
        int size = this.f18923l.size();
        for (int i = 0; i < size; i++) {
            C7498h c7498h2 = (C7498h) this.f18923l.get(i);
            if (c7498h2 != null) {
                C4699a a2 = c7498h.m32665t().mo5107a();
                C4699a a3 = c7498h2.m32665t().mo5107a();
                Object obj = (a2 == null || a3 == null || !(a2 instanceof C6404a) || !(a3 instanceof C6404a) || C4699a.f17284a.equals(a2) || !a2.equals(a3)) ? null : 1;
                if (obj != null) {
                    if (c7498h.m32661p() > c7498h2.m32661p()) {
                        m22763c(i);
                    } else if (c7498h.m32661p() < c7498h2.m32661p()) {
                        return true;
                    }
                }
                am n2 = c7498h2.mo7569n();
                if (n2.mo5089a().mo5091a(a) && n2.mo5091a(n)) {
                    boolean u2 = c7498h2.m32666u();
                    if (u <= u2) {
                        if (u != u2 || r <= c7498h2.mo7570r()) {
                            return true;
                        }
                    }
                    m22763c(i);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m22764c(C7498h c7498h) {
        if (m22765d(c7498h)) {
            this.f18930s++;
            if (this.f18924m < 0 || c7498h.mo7570r() < ((C7498h) this.f18923l.get(this.f18924m)).mo7570r()) {
                this.f18924m = this.f18923l.size();
            }
        }
        this.f18923l.add(c7498h);
        this.f18927p.put(c7498h.mo7571s(), Integer.valueOf(this.f18923l.size() - 1));
    }

    /* renamed from: c */
    private void m22763c(int i) {
        C7498h c7498h = (C7498h) this.f18923l.get(i);
        if (m22765d(c7498h)) {
            this.f18930s--;
        }
        c7498h.mo5224c(this.f18918g);
        this.f18923l.set(i, null);
        this.f18927p.remove(c7498h.mo7571s());
        if (i == this.f18924m) {
            i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f18924m = -1;
            for (int i2 = 0; i2 < this.f18923l.size(); i2++) {
                C7498h c7498h2 = (C7498h) this.f18923l.get(i2);
                if (c7498h2 != null && c7498h2.mo7570r() < r4 && m22765d(c7498h2)) {
                    i = c7498h2.mo7570r();
                    this.f18924m = i2;
                }
            }
        }
    }

    /* renamed from: d */
    private boolean m22765d(C7498h c7498h) {
        if (c7498h.mo7568m() < this.f18929r) {
            return false;
        }
        c7498h = c7498h.m32660o();
        if (c7498h == null || c7498h.m22747b() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m22766e() {
        int size;
        if (this.f18934w) {
            size = this.f18923l.size();
            for (int i = 0; i < size; i++) {
                C7498h c7498h = (C7498h) this.f18923l.get(i);
                if (c7498h != null) {
                    c7498h.mo5224c(this.f18918g);
                }
            }
            this.f18923l.clear();
            this.f18924m = -1;
            this.f18934w = false;
            this.f18935x = false;
            this.f18936y = false;
        }
        ArrayList arrayList = this.f18925n;
        this.f18925n = this.f18923l;
        this.f18923l = arrayList;
        size = this.f18926o;
        this.f18926o = this.f18924m;
        this.f18924m = size;
        this.f18930s = 0;
        this.f18927p.clear();
    }

    /* renamed from: a */
    private boolean m22760a(C5094b c5094b) {
        if (c5094b != null) {
            if (this.f18906A.contains(c5094b) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: e */
    private boolean m22767e(C7498h c7498h) {
        C4847g b = m22761b(c7498h.m32660o());
        return b != null ? b.mo5091a(c7498h.mo7569n()) : null;
    }

    /* renamed from: b */
    private C4847g m22761b(C5094b c5094b) {
        if (this.f18911F.isEmpty()) {
            return null;
        }
        if (c5094b == null) {
            c5094b = f18905a;
        }
        c5094b = (C4847g) this.f18911F.get(c5094b);
        if (c5094b == null) {
            c5094b = (C4847g) this.f18911F.get(f18905a);
        }
        return c5094b;
    }

    /* renamed from: a */
    private boolean m22757a(long r8) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = this;
        r0 = 0;
        r1 = r7.f18925n;	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r1.size();	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 <= 0) goto L_0x0011;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0009:
        r8 = new java.lang.IllegalStateException;	 Catch:{ RuntimeException -> 0x0116 }
        r9 = "Cannot run labeler loop until all previous labels have either been copied into new label table or destroyed.";	 Catch:{ RuntimeException -> 0x0116 }
        r8.<init>(r9);	 Catch:{ RuntimeException -> 0x0116 }
        throw r8;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0011:
        r1 = r7.f18922k;	 Catch:{ RuntimeException -> 0x0116 }
        r2 = 0;	 Catch:{ RuntimeException -> 0x0116 }
        r3 = 1;	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 == 0) goto L_0x0033;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0017:
        r1 = r7.f18922k;	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r1.hasNext();	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 == 0) goto L_0x0033;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x001f:
        r1 = r7.f18930s;	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r7.f18928q;	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 >= r4) goto L_0x0033;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0025:
        r1 = r7.f18937z;	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r7.f18922k;	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r1.next();	 Catch:{ RuntimeException -> 0x0116 }
        r1 = (com.google.android.m4b.maps.bo.C4848k) r1;	 Catch:{ RuntimeException -> 0x0116 }
        r7.m22756a(r1, r2, r3, r3);	 Catch:{ RuntimeException -> 0x0116 }
        goto L_0x0011;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0033:
        r1 = 0;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0034:
        r4 = r7.f18908C;	 Catch:{ RuntimeException -> 0x0116 }
        if (r4 != 0) goto L_0x0040;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0038:
        r4 = r7.f18921j;	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r4.hasNext();	 Catch:{ RuntimeException -> 0x0116 }
        if (r4 == 0) goto L_0x0069;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0040:
        r4 = r7.f18930s;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r7.f18928q;	 Catch:{ RuntimeException -> 0x0116 }
        if (r4 < r5) goto L_0x006a;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0046:
        r4 = r7.f18921j;	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r4.hasNext();	 Catch:{ RuntimeException -> 0x0116 }
        if (r4 == 0) goto L_0x0069;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x004e:
        r4 = r7.f18923l;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r7.f18924m;	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r4.get(r5);	 Catch:{ RuntimeException -> 0x0116 }
        r4 = (com.google.android.m4b.maps.cc.C7498h) r4;	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r4.mo7570r();	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r7.f18921j;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r5.m22288b();	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r5.m22749b();	 Catch:{ RuntimeException -> 0x0116 }
        if (r4 > r5) goto L_0x0069;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0068:
        goto L_0x006a;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0069:
        return r0;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x006a:
        r4 = r7.f18937z;	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 <= 0) goto L_0x0077;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x006e:
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ RuntimeException -> 0x0116 }
        r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));	 Catch:{ RuntimeException -> 0x0116 }
        if (r6 < 0) goto L_0x0077;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0076:
        return r3;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0077:
        r4 = r7.f18908C;	 Catch:{ RuntimeException -> 0x0116 }
        if (r4 != 0) goto L_0x00b9;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x007b:
        r4 = r7.f18921j;	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r4.m22286a();	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r7.f18907B;	 Catch:{ RuntimeException -> 0x0116 }
        r5.add(r4);	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0086:
        r5 = r7.f18921j;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r5.hasNext();	 Catch:{ RuntimeException -> 0x0116 }
        if (r5 == 0) goto L_0x00aa;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x008e:
        r5 = r7.f18921j;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r5.m22288b();	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r5.m22749b();	 Catch:{ RuntimeException -> 0x0116 }
        r6 = r4.m22749b();	 Catch:{ RuntimeException -> 0x0116 }
        if (r5 != r6) goto L_0x00aa;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x009e:
        r5 = r7.f18921j;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r5.m22286a();	 Catch:{ RuntimeException -> 0x0116 }
        r6 = r7.f18907B;	 Catch:{ RuntimeException -> 0x0116 }
        r6.add(r5);	 Catch:{ RuntimeException -> 0x0116 }
        goto L_0x0086;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00aa:
        r4 = r7.f18907B;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r7.f18909D;	 Catch:{ RuntimeException -> 0x0116 }
        java.util.Collections.sort(r4, r5);	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r7.f18907B;	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r4.listIterator();	 Catch:{ RuntimeException -> 0x0116 }
        r7.f18908C = r4;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00b9:
        r4 = r7.f18908C;	 Catch:{ RuntimeException -> 0x0116 }
        r4 = r4.hasNext();	 Catch:{ RuntimeException -> 0x0116 }
        if (r4 == 0) goto L_0x010d;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00c1:
        r4 = r1 + 1;	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 <= 0) goto L_0x00ce;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00c5:
        r5 = android.os.SystemClock.elapsedRealtime();	 Catch:{ RuntimeException -> 0x0116 }
        r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1));	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 < 0) goto L_0x00ce;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00cd:
        return r3;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00ce:
        r1 = r7.f18937z;	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r7.f18908C;	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r1.next();	 Catch:{ RuntimeException -> 0x0116 }
        r1 = (com.google.android.m4b.maps.ce.C5096d) r1;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r7.f18930s;	 Catch:{ RuntimeException -> 0x0116 }
        r6 = r7.f18928q;	 Catch:{ RuntimeException -> 0x0116 }
        if (r5 < r6) goto L_0x00f5;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00de:
        r5 = r7.f18923l;	 Catch:{ RuntimeException -> 0x0116 }
        r6 = r7.f18924m;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r5.get(r6);	 Catch:{ RuntimeException -> 0x0116 }
        r5 = (com.google.android.m4b.maps.cc.C7498h) r5;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r5.mo7570r();	 Catch:{ RuntimeException -> 0x0116 }
        r6 = r1.m22749b();	 Catch:{ RuntimeException -> 0x0116 }
        if (r5 >= r6) goto L_0x00f3;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00f2:
        goto L_0x00f5;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00f3:
        r1 = r4;	 Catch:{ RuntimeException -> 0x0116 }
        goto L_0x010d;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x00f5:
        r5 = r1.m22748a();	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r1.m22750c();	 Catch:{ RuntimeException -> 0x0116 }
        r7.m22756a(r5, r1, r0, r3);	 Catch:{ RuntimeException -> 0x0116 }
        r1 = r7.f18930s;	 Catch:{ RuntimeException -> 0x0116 }
        r5 = r7.f18928q;	 Catch:{ RuntimeException -> 0x0116 }
        if (r1 <= r5) goto L_0x010b;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x0106:
        r1 = r7.f18924m;	 Catch:{ RuntimeException -> 0x0116 }
        r7.m22763c(r1);	 Catch:{ RuntimeException -> 0x0116 }
    L_0x010b:
        r1 = r4;	 Catch:{ RuntimeException -> 0x0116 }
        goto L_0x00b9;	 Catch:{ RuntimeException -> 0x0116 }
    L_0x010d:
        r4 = r7.f18907B;	 Catch:{ RuntimeException -> 0x0116 }
        r4.clear();	 Catch:{ RuntimeException -> 0x0116 }
        r7.f18908C = r2;	 Catch:{ RuntimeException -> 0x0116 }
        goto L_0x0034;
    L_0x0116:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ce.e.a(long):boolean");
    }
}
