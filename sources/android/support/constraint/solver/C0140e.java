package android.support.constraint.solver;

import android.support.constraint.solver.SolverVariable.Type;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.solver.e */
public class C0140e {
    /* renamed from: g */
    public static C0141f f418g = null;
    /* renamed from: h */
    private static int f419h = 1000;
    /* renamed from: a */
    int f420a;
    /* renamed from: b */
    C2733b[] f421b;
    /* renamed from: c */
    public boolean f422c;
    /* renamed from: d */
    int f423d;
    /* renamed from: e */
    int f424e;
    /* renamed from: f */
    final C0138c f425f;
    /* renamed from: i */
    private HashMap<String, SolverVariable> f426i;
    /* renamed from: j */
    private C0139a f427j;
    /* renamed from: k */
    private int f428k;
    /* renamed from: l */
    private int f429l;
    /* renamed from: m */
    private boolean[] f430m;
    /* renamed from: n */
    private int f431n;
    /* renamed from: o */
    private SolverVariable[] f432o;
    /* renamed from: p */
    private int f433p;
    /* renamed from: q */
    private C2733b[] f434q;
    /* renamed from: r */
    private final C0139a f435r;

    /* renamed from: android.support.constraint.solver.e$a */
    interface C0139a {
        /* renamed from: a */
        SolverVariable mo143a(C0140e c0140e, boolean[] zArr);

        /* renamed from: a */
        void mo144a(C0139a c0139a);

        /* renamed from: d */
        void mo145d(SolverVariable solverVariable);

        /* renamed from: f */
        void mo146f();

        /* renamed from: g */
        SolverVariable mo147g();
    }

    public C0140e() {
        this.f420a = 0;
        this.f426i = null;
        this.f428k = 32;
        this.f429l = this.f428k;
        this.f421b = null;
        this.f422c = false;
        this.f430m = new boolean[this.f428k];
        this.f423d = 1;
        this.f424e = 0;
        this.f431n = this.f428k;
        this.f432o = new SolverVariable[f419h];
        this.f433p = 0;
        this.f434q = new C2733b[this.f428k];
        this.f421b = new C2733b[this.f428k];
        m435i();
        this.f425f = new C0138c();
        this.f427j = new C3985d(this.f425f);
        this.f435r = new C2733b(this.f425f);
    }

    /* renamed from: a */
    public void m447a(C0141f c0141f) {
        f418g = c0141f;
    }

    /* renamed from: a */
    public static C0141f m429a() {
        return f418g;
    }

    /* renamed from: h */
    private void m434h() {
        this.f428k *= 2;
        this.f421b = (C2733b[]) Arrays.copyOf(this.f421b, this.f428k);
        this.f425f.f417c = (SolverVariable[]) Arrays.copyOf(this.f425f.f417c, this.f428k);
        this.f430m = new boolean[this.f428k];
        this.f429l = this.f428k;
        this.f431n = this.f428k;
        if (f418g != null) {
            C0141f c0141f = f418g;
            c0141f.f443d++;
            f418g.f455p = Math.max(f418g.f455p, (long) this.f428k);
            f418g.f439D = f418g.f455p;
        }
    }

    /* renamed from: i */
    private void m435i() {
        for (int i = 0; i < this.f421b.length; i++) {
            Object obj = this.f421b[i];
            if (obj != null) {
                this.f425f.f415a.mo150a(obj);
            }
            this.f421b[i] = null;
        }
    }

    /* renamed from: b */
    public void m450b() {
        int i;
        for (SolverVariable solverVariable : this.f425f.f417c) {
            if (solverVariable != null) {
                solverVariable.m403b();
            }
        }
        this.f425f.f416b.mo149a(this.f432o, this.f433p);
        this.f433p = 0;
        Arrays.fill(this.f425f.f417c, null);
        if (this.f426i != null) {
            this.f426i.clear();
        }
        this.f420a = 0;
        this.f427j.mo146f();
        this.f423d = 1;
        for (i = 0; i < this.f424e; i++) {
            this.f421b[i].f8594c = false;
        }
        m435i();
        this.f424e = 0;
    }

    /* renamed from: a */
    public SolverVariable m438a(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f423d + 1 >= this.f429l) {
            m434h();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.m468b();
            if (solverVariable == null) {
                constraintAnchor.m463a(this.f425f);
                solverVariable = constraintAnchor.m468b();
            }
            if (solverVariable.f394a == -1 || solverVariable.f394a > this.f420a || this.f425f.f417c[solverVariable.f394a] == null) {
                if (solverVariable.f394a != -1) {
                    solverVariable.m403b();
                }
                this.f420a++;
                this.f423d++;
                solverVariable.f394a = this.f420a;
                solverVariable.f399f = Type.UNRESTRICTED;
                this.f425f.f417c[this.f420a] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* renamed from: c */
    public C2733b m453c() {
        C2733b c2733b = (C2733b) this.f425f.f415a.mo148a();
        if (c2733b == null) {
            c2733b = new C2733b(this.f425f);
        } else {
            c2733b.m10622c();
        }
        SolverVariable.m400a();
        return c2733b;
    }

    /* renamed from: d */
    public SolverVariable m455d() {
        if (f418g != null) {
            C0141f c0141f = f418g;
            c0141f.f453n++;
        }
        if (this.f423d + 1 >= this.f429l) {
            m434h();
        }
        SolverVariable a = m427a(Type.SLACK, null);
        this.f420a++;
        this.f423d++;
        a.f394a = this.f420a;
        this.f425f.f417c[this.f420a] = a;
        return a;
    }

    /* renamed from: e */
    public SolverVariable m456e() {
        if (f418g != null) {
            C0141f c0141f = f418g;
            c0141f.f454o++;
        }
        if (this.f423d + 1 >= this.f429l) {
            m434h();
        }
        SolverVariable a = m427a(Type.SLACK, null);
        this.f420a++;
        this.f423d++;
        a.f394a = this.f420a;
        this.f425f.f417c[this.f420a] = a;
        return a;
    }

    /* renamed from: b */
    private void m431b(C2733b c2733b) {
        c2733b.m10611a(this, 0);
    }

    /* renamed from: a */
    void m445a(C2733b c2733b, int i, int i2) {
        c2733b.m10621c(m437a(i2, null), i);
    }

    /* renamed from: a */
    public SolverVariable m437a(int i, String str) {
        if (f418g != null) {
            C0141f c0141f = f418g;
            c0141f.f452m++;
        }
        if (this.f423d + 1 >= this.f429l) {
            m434h();
        }
        str = m427a(Type.ERROR, str);
        this.f420a++;
        this.f423d++;
        str.f394a = this.f420a;
        str.f396c = i;
        this.f425f.f417c[this.f420a] = str;
        this.f427j.mo145d(str);
        return str;
    }

    /* renamed from: a */
    private SolverVariable m427a(Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f425f.f416b.mo148a();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type, str);
            solverVariable.m401a(type, str);
        } else {
            solverVariable.m403b();
            solverVariable.m401a(type, str);
        }
        if (this.f433p >= f419h) {
            f419h *= 2;
            this.f432o = (SolverVariable[]) Arrays.copyOf(this.f432o, f419h);
        }
        type = this.f432o;
        str = this.f433p;
        this.f433p = str + 1;
        type[str] = solverVariable;
        return solverVariable;
    }

    /* renamed from: b */
    public int m449b(Object obj) {
        obj = ((ConstraintAnchor) obj).m468b();
        return obj != null ? (int) (obj.f397d + 0.5f) : null;
    }

    /* renamed from: f */
    public void m457f() throws Exception {
        if (f418g != null) {
            C0141f c0141f = f418g;
            c0141f.f444e++;
        }
        if (this.f422c) {
            if (f418g != null) {
                c0141f = f418g;
                c0141f.f457r++;
            }
            Object obj = null;
            for (int i = 0; i < this.f424e; i++) {
                if (!this.f421b[i].f8596e) {
                    break;
                }
            }
            obj = 1;
            if (obj == null) {
                m446a(this.f427j);
                return;
            }
            if (f418g != null) {
                c0141f = f418g;
                c0141f.f456q++;
            }
            m436j();
            return;
        }
        m446a(this.f427j);
    }

    /* renamed from: a */
    void m446a(C0139a c0139a) throws Exception {
        if (f418g != null) {
            C0141f c0141f = f418g;
            c0141f.f459t++;
            f418g.f460u = Math.max(f418g.f460u, (long) this.f423d);
            f418g.f461v = Math.max(f418g.f461v, (long) this.f424e);
        }
        m432c((C2733b) c0139a);
        m430b(c0139a);
        m426a(c0139a, false);
        m436j();
    }

    /* renamed from: c */
    private final void m432c(C2733b c2733b) {
        if (this.f424e > 0) {
            c2733b.f8595d.m416a(c2733b, this.f421b);
            if (c2733b.f8595d.f404a == 0) {
                c2733b.f8596e = true;
            }
        }
    }

    /* renamed from: a */
    public void m444a(C2733b c2733b) {
        if (c2733b != null) {
            if (f418g != null) {
                C0141f c0141f = f418g;
                c0141f.f445f++;
                if (c2733b.f8596e) {
                    c0141f = f418g;
                    c0141f.f446g++;
                }
            }
            if (this.f424e + 1 >= this.f431n || this.f423d + 1 >= this.f429l) {
                m434h();
            }
            Object obj = null;
            if (!c2733b.f8596e) {
                m432c(c2733b);
                if (!c2733b.m10626e()) {
                    c2733b.m10624d();
                    if (c2733b.m10615a(this)) {
                        SolverVariable e = m456e();
                        c2733b.f8592a = e;
                        m433d(c2733b);
                        this.f435r.mo144a(c2733b);
                        m426a(this.f435r, true);
                        if (e.f395b == -1) {
                            if (c2733b.f8592a == e) {
                                e = c2733b.m10616b(e);
                                if (e != null) {
                                    if (f418g != null) {
                                        C0141f c0141f2 = f418g;
                                        c0141f2.f449j++;
                                    }
                                    c2733b.m10623c(e);
                                }
                            }
                            if (!c2733b.f8596e) {
                                c2733b.f8592a.m405c(c2733b);
                            }
                            this.f424e--;
                        }
                        obj = 1;
                    }
                    if (!c2733b.m10613a()) {
                        return;
                    }
                }
                return;
            }
            if (obj == null) {
                m433d(c2733b);
            }
        }
    }

    /* renamed from: d */
    private final void m433d(C2733b c2733b) {
        if (this.f421b[this.f424e] != null) {
            this.f425f.f415a.mo150a(this.f421b[this.f424e]);
        }
        this.f421b[this.f424e] = c2733b;
        c2733b.f8592a.f395b = this.f424e;
        this.f424e++;
        c2733b.f8592a.m405c(c2733b);
    }

    /* renamed from: a */
    private final int m426a(C0139a c0139a, boolean z) {
        if (f418g) {
            z = f418g;
            z.f447h++;
        }
        for (int i = 0; i < this.f423d; i++) {
            this.f430m[i] = false;
        }
        Object obj = null;
        int i2 = 0;
        while (obj == null) {
            if (f418g != null) {
                C0141f c0141f = f418g;
                c0141f.f448i++;
            }
            i2++;
            if (i2 >= this.f423d * 2) {
                return i2;
            }
            if (c0139a.mo147g() != null) {
                this.f430m[c0139a.mo147g().f394a] = true;
            }
            SolverVariable a = c0139a.mo143a(this, this.f430m);
            if (a != null) {
                if (this.f430m[a.f394a]) {
                    return i2;
                }
                this.f430m[a.f394a] = true;
            }
            if (a != null) {
                int i3 = -1;
                float f = Float.MAX_VALUE;
                for (int i4 = 0; i4 < this.f424e; i4++) {
                    C2733b c2733b = this.f421b[i4];
                    if (c2733b.f8592a.f399f != Type.UNRESTRICTED) {
                        if (!c2733b.f8596e) {
                            if (c2733b.m10614a(a)) {
                                float b = c2733b.f8595d.m419b(a);
                                if (b < 0.0f) {
                                    float f2 = (-c2733b.f8593b) / b;
                                    if (f2 < f) {
                                        i3 = i4;
                                        f = f2;
                                    }
                                }
                            }
                        }
                    }
                }
                if (i3 > -1) {
                    C2733b c2733b2 = this.f421b[i3];
                    c2733b2.f8592a.f395b = -1;
                    if (f418g != null) {
                        C0141f c0141f2 = f418g;
                        c0141f2.f449j++;
                    }
                    c2733b2.m10623c(a);
                    c2733b2.f8592a.f395b = i3;
                    c2733b2.f8592a.m405c(c2733b2);
                }
            }
            obj = 1;
        }
        return i2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private int m430b(android.support.constraint.solver.C0140e.C0139a r20) throws java.lang.Exception {
        /*
        r19 = this;
        r0 = r19;
        r2 = 0;
    L_0x0003:
        r3 = r0.f424e;
        r4 = 0;
        if (r2 >= r3) goto L_0x0024;
    L_0x0008:
        r3 = r0.f421b;
        r3 = r3[r2];
        r3 = r3.f8592a;
        r3 = r3.f399f;
        r6 = android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED;
        if (r3 != r6) goto L_0x0015;
    L_0x0014:
        goto L_0x0021;
    L_0x0015:
        r3 = r0.f421b;
        r3 = r3[r2];
        r3 = r3.f8593b;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 >= 0) goto L_0x0021;
    L_0x001f:
        r2 = 1;
        goto L_0x0025;
    L_0x0021:
        r2 = r2 + 1;
        goto L_0x0003;
    L_0x0024:
        r2 = 0;
    L_0x0025:
        if (r2 == 0) goto L_0x00dd;
    L_0x0027:
        r2 = 0;
        r3 = 0;
    L_0x0029:
        if (r2 != 0) goto L_0x00da;
    L_0x002b:
        r6 = f418g;
        r7 = 1;
        if (r6 == 0) goto L_0x0039;
    L_0x0031:
        r6 = f418g;
        r9 = r6.f450k;
        r11 = r9 + r7;
        r6.f450k = r11;
    L_0x0039:
        r3 = r3 + 1;
        r6 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r9 = -1;
        r6 = 0;
        r10 = -1;
        r11 = -1;
        r12 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r13 = 0;
    L_0x0046:
        r14 = r0.f424e;
        if (r6 >= r14) goto L_0x00a4;
    L_0x004a:
        r14 = r0.f421b;
        r14 = r14[r6];
        r15 = r14.f8592a;
        r15 = r15.f399f;
        r1 = android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED;
        if (r15 != r1) goto L_0x0057;
    L_0x0056:
        goto L_0x009e;
    L_0x0057:
        r1 = r14.f8596e;
        if (r1 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x009e;
    L_0x005c:
        r1 = r14.f8593b;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x009e;
    L_0x0062:
        r1 = 1;
    L_0x0063:
        r15 = r0.f423d;
        if (r1 >= r15) goto L_0x009e;
    L_0x0067:
        r15 = r0.f425f;
        r15 = r15.f417c;
        r15 = r15[r1];
        r5 = r14.f8595d;
        r5 = r5.m419b(r15);
        r17 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1));
        if (r17 > 0) goto L_0x0078;
    L_0x0077:
        goto L_0x0098;
    L_0x0078:
        r4 = r13;
        r13 = r12;
        r12 = r11;
        r11 = r10;
        r10 = 0;
    L_0x007d:
        r7 = 7;
        if (r10 >= r7) goto L_0x0094;
    L_0x0080:
        r7 = r15.f398e;
        r7 = r7[r10];
        r7 = r7 / r5;
        r8 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1));
        if (r8 >= 0) goto L_0x008b;
    L_0x0089:
        if (r10 == r4) goto L_0x008d;
    L_0x008b:
        if (r10 <= r4) goto L_0x0091;
    L_0x008d:
        r12 = r1;
        r11 = r6;
        r13 = r7;
        r4 = r10;
    L_0x0091:
        r10 = r10 + 1;
        goto L_0x007d;
    L_0x0094:
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r4;
    L_0x0098:
        r1 = r1 + 1;
        r4 = 0;
        r7 = 1;
        goto L_0x0063;
    L_0x009e:
        r6 = r6 + 1;
        r4 = 0;
        r7 = 1;
        goto L_0x0046;
    L_0x00a4:
        if (r10 == r9) goto L_0x00cf;
    L_0x00a6:
        r1 = r0.f421b;
        r1 = r1[r10];
        r4 = r1.f8592a;
        r4.f395b = r9;
        r4 = f418g;
        if (r4 == 0) goto L_0x00bc;
    L_0x00b2:
        r4 = f418g;
        r5 = r4.f449j;
        r7 = 1;
        r12 = r5 + r7;
        r4.f449j = r12;
    L_0x00bc:
        r4 = r0.f425f;
        r4 = r4.f417c;
        r4 = r4[r11];
        r1.m10623c(r4);
        r4 = r1.f8592a;
        r4.f395b = r10;
        r4 = r1.f8592a;
        r4.m405c(r1);
        goto L_0x00d0;
    L_0x00cf:
        r2 = 1;
    L_0x00d0:
        r1 = r0.f423d;
        r1 = r1 / 2;
        if (r3 <= r1) goto L_0x00d7;
    L_0x00d6:
        r2 = 1;
    L_0x00d7:
        r4 = 0;
        goto L_0x0029;
    L_0x00da:
        r16 = r3;
        goto L_0x00df;
    L_0x00dd:
        r16 = 0;
    L_0x00df:
        return r16;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.e.b(android.support.constraint.solver.e$a):int");
    }

    /* renamed from: j */
    private void m436j() {
        for (int i = 0; i < this.f424e; i++) {
            C2733b c2733b = this.f421b[i];
            c2733b.f8592a.f397d = c2733b.f8593b;
        }
    }

    /* renamed from: g */
    public C0138c m458g() {
        return this.f425f;
    }

    /* renamed from: a */
    public void m441a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C2733b c = m453c();
        SolverVariable d = m455d();
        d.f396c = 0;
        c.m10609a(solverVariable, solverVariable2, d, i);
        if (i2 != 6) {
            m445a(c, (int) (c.f8595d.m419b(d) * -1082130432), i2);
        }
        m444a(c);
    }

    /* renamed from: a */
    public void m443a(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C2733b c = m453c();
        SolverVariable d = m455d();
        d.f396c = 0;
        c.m10609a(solverVariable, solverVariable2, d, 0);
        if (z) {
            m445a(c, (int) (c.f8595d.m419b(d) * -1082130432), 1);
        }
        m444a(c);
    }

    /* renamed from: b */
    public void m451b(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C2733b c = m453c();
        SolverVariable d = m455d();
        d.f396c = 0;
        c.m10618b(solverVariable, solverVariable2, d, i);
        if (i2 != 6) {
            m445a(c, (int) (c.f8595d.m419b(d) * -1082130432), i2);
        }
        m444a(c);
    }

    /* renamed from: b */
    public void m452b(SolverVariable solverVariable, SolverVariable solverVariable2, boolean z) {
        C2733b c = m453c();
        SolverVariable d = m455d();
        d.f396c = 0;
        c.m10618b(solverVariable, solverVariable2, d, 0);
        if (z) {
            m445a(c, (int) (c.f8595d.m419b(d) * -1082130432), 1);
        }
        m444a(c);
    }

    /* renamed from: a */
    public void m440a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        int i4 = i3;
        C2733b c = m453c();
        c.m10607a(solverVariable, solverVariable2, i, f, solverVariable3, solverVariable4, i2);
        if (i4 != 6) {
            c.m10611a(r0, i4);
        }
        m444a(c);
    }

    /* renamed from: a */
    public void m442a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f, int i) {
        C2733b c = m453c();
        c.m10610a(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        if (i != 6) {
            c.m10611a(this, i);
        }
        m444a(c);
    }

    /* renamed from: c */
    public C2733b m454c(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        C2733b c = m453c();
        c.m10606a(solverVariable, solverVariable2, i);
        if (i2 != 6) {
            c.m10611a(this, i2);
        }
        m444a(c);
        return c;
    }

    /* renamed from: a */
    public void m439a(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f395b;
        C2733b c2733b;
        if (solverVariable.f395b != -1) {
            c2733b = this.f421b[i2];
            if (c2733b.f8596e) {
                c2733b.f8593b = (float) i;
                return;
            } else if (c2733b.f8595d.f404a == 0) {
                c2733b.f8596e = true;
                c2733b.f8593b = (float) i;
                return;
            } else {
                c2733b = m453c();
                c2733b.m10617b(solverVariable, i);
                m444a(c2733b);
                return;
            }
        }
        c2733b = m453c();
        c2733b.m10605a(solverVariable, i);
        m444a(c2733b);
    }

    /* renamed from: a */
    public static C2733b m428a(C0140e c0140e, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f, boolean z) {
        C2733b c = c0140e.m453c();
        if (z) {
            c0140e.m431b(c);
        }
        return c.m10608a(solverVariable, solverVariable2, solverVariable3, f);
    }

    /* renamed from: a */
    public void m448a(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f, int i) {
        ConstraintWidget constraintWidget3 = constraintWidget;
        ConstraintWidget constraintWidget4 = constraintWidget2;
        SolverVariable a = m438a(constraintWidget3.mo153a(ConstraintAnchor.Type.LEFT));
        SolverVariable a2 = m438a(constraintWidget3.mo153a(ConstraintAnchor.Type.TOP));
        SolverVariable a3 = m438a(constraintWidget3.mo153a(ConstraintAnchor.Type.RIGHT));
        SolverVariable a4 = m438a(constraintWidget3.mo153a(ConstraintAnchor.Type.BOTTOM));
        SolverVariable a5 = m438a(constraintWidget4.mo153a(ConstraintAnchor.Type.LEFT));
        SolverVariable a6 = m438a(constraintWidget4.mo153a(ConstraintAnchor.Type.TOP));
        SolverVariable a7 = m438a(constraintWidget4.mo153a(ConstraintAnchor.Type.RIGHT));
        SolverVariable a8 = m438a(constraintWidget4.mo153a(ConstraintAnchor.Type.BOTTOM));
        C2733b c = m453c();
        double d = (double) f;
        SolverVariable solverVariable = a3;
        double d2 = (double) i;
        SolverVariable solverVariable2 = a7;
        c.m10619b(a2, a4, a6, a8, (float) (Math.sin(d) * d2));
        m444a(c);
        c = m453c();
        c.m10619b(a, solverVariable, a5, solverVariable2, (float) (Math.cos(d) * d2));
        m444a(c);
    }
}
