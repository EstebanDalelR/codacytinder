package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0140e;
import android.support.constraint.solver.C0141f;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: android.support.constraint.solver.widgets.d */
public class C3987d extends C2739m {
    protected C0140e ac = new C0140e();
    int ad;
    int ae;
    int af;
    int ag;
    int ah = 0;
    int ai = 0;
    C0147c[] aj = new C0147c[4];
    C0147c[] ak = new C0147c[4];
    int al = 0;
    private boolean an = false;
    private C0153l ao;
    private int ap = 3;
    private boolean aq = false;
    private boolean ar = false;

    /* renamed from: Q */
    public boolean m15594Q() {
        return false;
    }

    /* renamed from: a */
    public void m15597a(C0141f c0141f) {
        this.ac.m447a(c0141f);
    }

    /* renamed from: a */
    public void m15595a(int i) {
        this.ap = i;
    }

    /* renamed from: H */
    public int mo152H() {
        return this.ap;
    }

    /* renamed from: q */
    public boolean m15604q(int i) {
        return (this.ap & i) == i;
    }

    /* renamed from: f */
    public void mo163f() {
        this.ac.m450b();
        this.ad = 0;
        this.af = 0;
        this.ae = 0;
        this.ag = 0;
        super.mo163f();
    }

    /* renamed from: I */
    public boolean m15586I() {
        return this.aq;
    }

    /* renamed from: J */
    public boolean m15587J() {
        return this.ar;
    }

    /* renamed from: d */
    public boolean m15601d(C0140e c0140e) {
        mo154a(c0140e);
        int size = this.am.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.am.get(i);
            if (constraintWidget instanceof C3987d) {
                DimensionBehaviour dimensionBehaviour = constraintWidget.f481B[0];
                DimensionBehaviour dimensionBehaviour2 = constraintWidget.f481B[1];
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.m498a(DimensionBehaviour.FIXED);
                }
                if (dimensionBehaviour2 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.m511b(DimensionBehaviour.FIXED);
                }
                constraintWidget.mo154a(c0140e);
                if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.m498a(dimensionBehaviour);
                }
                if (dimensionBehaviour2 == DimensionBehaviour.WRAP_CONTENT) {
                    constraintWidget.m511b(dimensionBehaviour2);
                }
            } else {
                C0149g.m565a(this, c0140e, constraintWidget);
                constraintWidget.mo154a(c0140e);
            }
        }
        if (this.ah > 0) {
            C0146b.m559a(this, c0140e, 0);
        }
        if (this.ai > 0) {
            C0146b.m559a(this, c0140e, 1);
        }
        return true;
    }

    /* renamed from: a */
    public void m15596a(C0140e c0140e, boolean[] zArr) {
        zArr[2] = false;
        mo157c(c0140e);
        int size = this.am.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.am.get(i);
            constraintWidget.mo157c(c0140e);
            if (constraintWidget.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.m545o() < constraintWidget.m547p()) {
                zArr[2] = true;
            }
            if (constraintWidget.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.m549q() < constraintWidget.m550r()) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: a */
    public void m15599a(boolean z) {
        this.an = z;
    }

    /* renamed from: K */
    public boolean m15588K() {
        return this.an;
    }

    /* renamed from: b */
    public void mo156b(int i) {
        super.mo156b(i);
        int size = this.am.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.am.get(i2)).mo156b(i);
        }
    }

    /* renamed from: L */
    public void mo2977L() {
        int i;
        boolean d;
        Exception e;
        Exception exception;
        PrintStream printStream;
        StringBuilder stringBuilder;
        ConstraintWidget constraintWidget;
        Object obj;
        boolean z;
        int i2 = this.H;
        int i3 = this.I;
        int max = Math.max(0, m545o());
        int max2 = Math.max(0, m549q());
        this.aq = false;
        this.ar = false;
        if (this.C != null) {
            if (r1.ao == null) {
                r1.ao = new C0153l(r1);
            }
            r1.ao.m576a(r1);
            m528f(r1.ad);
            m530g(r1.ae);
            m484E();
            mo161a(r1.ac.m458g());
        } else {
            r1.H = 0;
            r1.I = 0;
        }
        int i4 = 1;
        if (r1.ap != 0) {
            if (!m15604q(8)) {
                m15592O();
            }
            m15593P();
            r1.ac.f422c = true;
        } else {
            r1.ac.f422c = false;
        }
        DimensionBehaviour dimensionBehaviour = r1.B[1];
        DimensionBehaviour dimensionBehaviour2 = r1.B[0];
        m15582T();
        int size = r1.am.size();
        for (i = 0; i < size; i++) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget) r1.am.get(i);
            if (constraintWidget2 instanceof C2739m) {
                ((C2739m) constraintWidget2).mo2977L();
            }
        }
        boolean z2 = true;
        int i5 = 0;
        Object obj2 = null;
        while (z2) {
            int i6;
            int i7;
            i5 += i4;
            try {
                r1.ac.m450b();
                m510b(r1.ac);
                for (int i8 = 0; i8 < size; i8++) {
                    ((ConstraintWidget) r1.am.get(i8)).m510b(r1.ac);
                }
                d = m15601d(r1.ac);
                if (d) {
                    try {
                        r1.ac.m457f();
                    } catch (Exception e2) {
                        e = e2;
                        z2 = d;
                        exception = e;
                        exception.printStackTrace();
                        printStream = System.out;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("EXCEPTION : ");
                        stringBuilder.append(exception);
                        printStream.println(stringBuilder.toString());
                        d = z2;
                        i6 = 2;
                        if (d) {
                            mo157c(r1.ac);
                            i7 = 0;
                            while (i7 < size) {
                                constraintWidget = (ConstraintWidget) r1.am.get(i7);
                                if (constraintWidget.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                                }
                                if (constraintWidget.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
                                }
                                i7++;
                                i6 = 2;
                            }
                            i4 = 2;
                            i6 = 8;
                            if (i5 < i6) {
                            }
                            obj = obj2;
                            z = false;
                            i7 = Math.max(r1.M, m545o());
                            if (i7 > m545o()) {
                                m532h(i7);
                                r1.B[0] = DimensionBehaviour.FIXED;
                                z = true;
                                obj = 1;
                            }
                            i7 = Math.max(r1.N, m549q());
                            if (i7 <= m549q()) {
                                m534i(i7);
                                z2 = true;
                                r1.B[1] = DimensionBehaviour.FIXED;
                                z = true;
                                obj = 1;
                            } else {
                                z2 = true;
                            }
                            if (obj == null) {
                                r1.aq = z2;
                                r1.B[0] = DimensionBehaviour.FIXED;
                                m532h(max);
                                z = true;
                                obj = 1;
                                r1.ar = z2;
                                r1.B[z2] = DimensionBehaviour.FIXED;
                                m534i(max2);
                                z2 = true;
                                obj2 = 1;
                                i4 = 1;
                            }
                            z2 = z;
                            obj2 = obj;
                            i4 = 1;
                        } else {
                            m15596a(r1.ac, C0149g.f549a);
                        }
                        i6 = 8;
                        i4 = 2;
                        if (i5 < i6) {
                        }
                        obj = obj2;
                        z = false;
                        i7 = Math.max(r1.M, m545o());
                        if (i7 > m545o()) {
                            m532h(i7);
                            r1.B[0] = DimensionBehaviour.FIXED;
                            z = true;
                            obj = 1;
                        }
                        i7 = Math.max(r1.N, m549q());
                        if (i7 <= m549q()) {
                            z2 = true;
                        } else {
                            m534i(i7);
                            z2 = true;
                            r1.B[1] = DimensionBehaviour.FIXED;
                            z = true;
                            obj = 1;
                        }
                        if (obj == null) {
                            r1.aq = z2;
                            r1.B[0] = DimensionBehaviour.FIXED;
                            m532h(max);
                            z = true;
                            obj = 1;
                            r1.ar = z2;
                            r1.B[z2] = DimensionBehaviour.FIXED;
                            m534i(max2);
                            z2 = true;
                            obj2 = 1;
                            i4 = 1;
                        }
                        z2 = z;
                        obj2 = obj;
                        i4 = 1;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                exception = e;
                exception.printStackTrace();
                printStream = System.out;
                stringBuilder = new StringBuilder();
                stringBuilder.append("EXCEPTION : ");
                stringBuilder.append(exception);
                printStream.println(stringBuilder.toString());
                d = z2;
                i6 = 2;
                if (d) {
                    m15596a(r1.ac, C0149g.f549a);
                } else {
                    mo157c(r1.ac);
                    i7 = 0;
                    while (i7 < size) {
                        constraintWidget = (ConstraintWidget) r1.am.get(i7);
                        if (constraintWidget.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
                        }
                        if (constraintWidget.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
                        }
                        i7++;
                        i6 = 2;
                    }
                    i4 = 2;
                    i6 = 8;
                    if (i5 < i6) {
                    }
                    obj = obj2;
                    z = false;
                    i7 = Math.max(r1.M, m545o());
                    if (i7 > m545o()) {
                        m532h(i7);
                        r1.B[0] = DimensionBehaviour.FIXED;
                        z = true;
                        obj = 1;
                    }
                    i7 = Math.max(r1.N, m549q());
                    if (i7 <= m549q()) {
                        m534i(i7);
                        z2 = true;
                        r1.B[1] = DimensionBehaviour.FIXED;
                        z = true;
                        obj = 1;
                    } else {
                        z2 = true;
                    }
                    if (obj == null) {
                        r1.aq = z2;
                        r1.B[0] = DimensionBehaviour.FIXED;
                        m532h(max);
                        z = true;
                        obj = 1;
                        r1.ar = z2;
                        r1.B[z2] = DimensionBehaviour.FIXED;
                        m534i(max2);
                        z2 = true;
                        obj2 = 1;
                        i4 = 1;
                    }
                    z2 = z;
                    obj2 = obj;
                    i4 = 1;
                }
                i6 = 8;
                i4 = 2;
                if (i5 < i6) {
                }
                obj = obj2;
                z = false;
                i7 = Math.max(r1.M, m545o());
                if (i7 > m545o()) {
                    m532h(i7);
                    r1.B[0] = DimensionBehaviour.FIXED;
                    z = true;
                    obj = 1;
                }
                i7 = Math.max(r1.N, m549q());
                if (i7 <= m549q()) {
                    z2 = true;
                } else {
                    m534i(i7);
                    z2 = true;
                    r1.B[1] = DimensionBehaviour.FIXED;
                    z = true;
                    obj = 1;
                }
                if (obj == null) {
                    r1.aq = z2;
                    r1.B[0] = DimensionBehaviour.FIXED;
                    m532h(max);
                    z = true;
                    obj = 1;
                    r1.ar = z2;
                    r1.B[z2] = DimensionBehaviour.FIXED;
                    m534i(max2);
                    z2 = true;
                    obj2 = 1;
                    i4 = 1;
                }
                z2 = z;
                obj2 = obj;
                i4 = 1;
            }
            i6 = 2;
            if (d) {
                m15596a(r1.ac, C0149g.f549a);
            } else {
                mo157c(r1.ac);
                i7 = 0;
                while (i7 < size) {
                    constraintWidget = (ConstraintWidget) r1.am.get(i7);
                    if (constraintWidget.f481B[0] == DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.m545o() >= constraintWidget.m547p()) {
                        if (constraintWidget.f481B[1] == DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.m549q() < constraintWidget.m550r()) {
                            i4 = 2;
                            C0149g.f549a[2] = true;
                            break;
                        }
                        i7++;
                        i6 = 2;
                    } else {
                        C0149g.f549a[i6] = true;
                    }
                }
                i4 = 2;
                i6 = 8;
                if (i5 < i6 || !C0149g.f549a[r9]) {
                    obj = obj2;
                    z = false;
                } else {
                    i4 = 0;
                    i = 0;
                    for (i7 = 0; i7 < size; i7++) {
                        ConstraintWidget constraintWidget3 = (ConstraintWidget) r1.am.get(i7);
                        i4 = Math.max(i4, constraintWidget3.f487H + constraintWidget3.m545o());
                        i = Math.max(i, constraintWidget3.f488I + constraintWidget3.m549q());
                    }
                    i6 = Math.max(r1.M, i4);
                    i7 = Math.max(r1.N, i);
                    if (dimensionBehaviour2 != DimensionBehaviour.WRAP_CONTENT || m545o() >= i6) {
                        obj = obj2;
                        z = false;
                    } else {
                        m532h(i6);
                        r1.B[0] = DimensionBehaviour.WRAP_CONTENT;
                        z = true;
                        obj = 1;
                    }
                    if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT && m549q() < i7) {
                        m534i(i7);
                        r1.B[1] = DimensionBehaviour.WRAP_CONTENT;
                        z = true;
                        obj = 1;
                    }
                }
                i7 = Math.max(r1.M, m545o());
                if (i7 > m545o()) {
                    m532h(i7);
                    r1.B[0] = DimensionBehaviour.FIXED;
                    z = true;
                    obj = 1;
                }
                i7 = Math.max(r1.N, m549q());
                if (i7 <= m549q()) {
                    m534i(i7);
                    z2 = true;
                    r1.B[1] = DimensionBehaviour.FIXED;
                    z = true;
                    obj = 1;
                } else {
                    z2 = true;
                }
                if (obj == null) {
                    if (r1.B[0] == DimensionBehaviour.WRAP_CONTENT && max > 0 && m545o() > max) {
                        r1.aq = z2;
                        r1.B[0] = DimensionBehaviour.FIXED;
                        m532h(max);
                        z = true;
                        obj = 1;
                    }
                    if (r1.B[z2] == DimensionBehaviour.WRAP_CONTENT && max2 > 0 && m549q() > max2) {
                        r1.ar = z2;
                        r1.B[z2] = DimensionBehaviour.FIXED;
                        m534i(max2);
                        z2 = true;
                        obj2 = 1;
                        i4 = 1;
                    }
                }
                z2 = z;
                obj2 = obj;
                i4 = 1;
            }
            i6 = 8;
            i4 = 2;
            if (i5 < i6) {
            }
            obj = obj2;
            z = false;
            i7 = Math.max(r1.M, m545o());
            if (i7 > m545o()) {
                m532h(i7);
                r1.B[0] = DimensionBehaviour.FIXED;
                z = true;
                obj = 1;
            }
            i7 = Math.max(r1.N, m549q());
            if (i7 <= m549q()) {
                z2 = true;
            } else {
                m534i(i7);
                z2 = true;
                r1.B[1] = DimensionBehaviour.FIXED;
                z = true;
                obj = 1;
            }
            if (obj == null) {
                r1.aq = z2;
                r1.B[0] = DimensionBehaviour.FIXED;
                m532h(max);
                z = true;
                obj = 1;
                r1.ar = z2;
                r1.B[z2] = DimensionBehaviour.FIXED;
                m534i(max2);
                z2 = true;
                obj2 = 1;
                i4 = 1;
            }
            z2 = z;
            obj2 = obj;
            i4 = 1;
        }
        if (r1.C != null) {
            i2 = Math.max(r1.M, m545o());
            i3 = Math.max(r1.N, m549q());
            r1.ao.m577b(r1);
            m532h((i2 + r1.ad) + r1.af);
            m534i((i3 + r1.ae) + r1.ag);
        } else {
            r1.H = i2;
            r1.I = i3;
        }
        if (obj2 != null) {
            r1.B[0] = dimensionBehaviour2;
            r1.B[1] = dimensionBehaviour;
        }
        mo161a(r1.ac.m458g());
        if (r1 == m10663R()) {
            mo160D();
        }
    }

    /* renamed from: M */
    public void m15590M() {
        m15592O();
        mo156b(this.ap);
    }

    /* renamed from: N */
    public void m15591N() {
        C2737i a = mo153a(Type.LEFT).m462a();
        C2737i a2 = mo153a(Type.TOP).m462a();
        a.m10649a(null, 0.0f);
        a2.m10649a(null, 0.0f);
    }

    /* renamed from: e */
    public void m15602e(int i, int i2) {
        if (!(this.B[0] == DimensionBehaviour.WRAP_CONTENT || this.c == null)) {
            this.c.m10658a(i);
        }
        if (this.B[1] != DimensionBehaviour.WRAP_CONTENT && this.d != 0) {
            this.d.m10658a(i2);
        }
    }

    /* renamed from: O */
    public void m15592O() {
        int size = this.am.size();
        mo2975b();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.am.get(i)).mo2975b();
        }
    }

    /* renamed from: P */
    public void m15593P() {
        if (!m15604q(8)) {
            mo156b(this.ap);
        }
        m15591N();
    }

    /* renamed from: T */
    private void m15582T() {
        this.ah = 0;
        this.ai = 0;
    }

    /* renamed from: a */
    void m15598a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            m15583e(constraintWidget);
        } else if (i == 1) {
            m15584f(constraintWidget);
        }
    }

    /* renamed from: e */
    private void m15583e(ConstraintWidget constraintWidget) {
        if (this.ah + 1 >= this.ak.length) {
            this.ak = (C0147c[]) Arrays.copyOf(this.ak, this.ak.length * 2);
        }
        this.ak[this.ah] = new C0147c(constraintWidget, 0, m15588K());
        this.ah++;
    }

    /* renamed from: f */
    private void m15584f(ConstraintWidget constraintWidget) {
        if (this.ai + 1 >= this.aj.length) {
            this.aj = (C0147c[]) Arrays.copyOf(this.aj, this.aj.length * 2);
        }
        this.aj[this.ai] = new C0147c(constraintWidget, 1, m15588K());
        this.ai += 1;
    }
}
