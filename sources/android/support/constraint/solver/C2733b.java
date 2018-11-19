package android.support.constraint.solver;

import android.support.constraint.solver.C0140e.C0139a;
import android.support.constraint.solver.SolverVariable.Type;

/* renamed from: android.support.constraint.solver.b */
public class C2733b implements C0139a {
    /* renamed from: a */
    SolverVariable f8592a = null;
    /* renamed from: b */
    float f8593b = 0.0f;
    /* renamed from: c */
    boolean f8594c = false;
    /* renamed from: d */
    public final C0137a f8595d;
    /* renamed from: e */
    boolean f8596e = false;

    public C2733b(C0138c c0138c) {
        this.f8595d = new C0137a(this, c0138c);
    }

    /* renamed from: a */
    boolean m10613a() {
        return this.f8592a != null && (this.f8592a.f399f == Type.UNRESTRICTED || this.f8593b >= 0.0f);
    }

    public String toString() {
        return m10620b();
    }

    /* renamed from: b */
    String m10620b() {
        StringBuilder stringBuilder;
        Object obj;
        String str = "";
        if (this.f8592a == null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("0");
            str = stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f8592a);
            str = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" = ");
        str = stringBuilder.toString();
        if (this.f8593b != 0.0f) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.f8593b);
            str = stringBuilder.toString();
            obj = 1;
        } else {
            obj = null;
        }
        int i = this.f8595d.f404a;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable a = this.f8595d.m408a(i2);
            if (a != null) {
                float b = this.f8595d.m418b(i2);
                if (b != 0.0f) {
                    String solverVariable = a.toString();
                    if (obj == null) {
                        if (b < 0.0f) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append("- ");
                            str = stringBuilder.toString();
                            b *= -1.0f;
                        }
                    } else if (b > 0.0f) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" + ");
                        str = stringBuilder.toString();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" - ");
                        str = stringBuilder.toString();
                        b *= -1.0f;
                    }
                    if (b == 1.0f) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(solverVariable);
                        str = stringBuilder.toString();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(b);
                        stringBuilder.append(" ");
                        stringBuilder.append(solverVariable);
                        str = stringBuilder.toString();
                    }
                    obj = 1;
                }
            }
        }
        if (obj != null) {
            return str;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("0.0");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public void m10622c() {
        this.f8592a = null;
        this.f8595d.m411a();
        this.f8593b = 0.0f;
        this.f8596e = false;
    }

    /* renamed from: a */
    boolean m10614a(SolverVariable solverVariable) {
        return this.f8595d.m417a(solverVariable);
    }

    /* renamed from: a */
    C2733b m10605a(SolverVariable solverVariable, int i) {
        this.f8592a = solverVariable;
        i = (float) i;
        solverVariable.f397d = i;
        this.f8593b = i;
        this.f8596e = true;
        return this;
    }

    /* renamed from: b */
    public C2733b m10617b(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f8593b = (float) (i * -1);
            this.f8595d.m413a(solverVariable, 1.0f);
        } else {
            this.f8593b = (float) i;
            this.f8595d.m413a(solverVariable, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C2733b m10606a(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f8593b = (float) i;
        }
        if (obj == null) {
            this.f8595d.m413a(solverVariable, -1.0f);
            this.f8595d.m413a(solverVariable2, 1.0f);
        } else {
            this.f8595d.m413a(solverVariable, 1.0f);
            this.f8595d.m413a(solverVariable2, -1.0f);
        }
        return this;
    }

    /* renamed from: c */
    C2733b m10621c(SolverVariable solverVariable, int i) {
        this.f8595d.m413a(solverVariable, (float) i);
        return this;
    }

    /* renamed from: a */
    public C2733b m10609a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f8593b = (float) i;
        }
        if (obj == null) {
            this.f8595d.m413a(solverVariable, -1.0f);
            this.f8595d.m413a(solverVariable2, 1.0f);
            this.f8595d.m413a(solverVariable3, 1.0f);
        } else {
            this.f8595d.m413a(solverVariable, 1.0f);
            this.f8595d.m413a(solverVariable2, -1.0f);
            this.f8595d.m413a(solverVariable3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C2733b m10618b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        Object obj = null;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                obj = 1;
            }
            this.f8593b = (float) i;
        }
        if (obj == null) {
            this.f8595d.m413a(solverVariable, -1.0f);
            this.f8595d.m413a(solverVariable2, 1.0f);
            this.f8595d.m413a(solverVariable3, -1.0f);
        } else {
            this.f8595d.m413a(solverVariable, 1.0f);
            this.f8595d.m413a(solverVariable2, -1.0f);
            this.f8595d.m413a(solverVariable3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C2733b m10604a(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f8593b = 0.0f;
        if (f2 != 0.0f) {
            if (f != f3) {
                if (f == 0.0f) {
                    this.f8595d.m413a(solverVariable, 1.0f);
                    this.f8595d.m413a(solverVariable2, -1.0f);
                } else if (f3 == 0.0f) {
                    this.f8595d.m413a(solverVariable3, 1.0f);
                    this.f8595d.m413a(solverVariable4, -1.0f);
                } else {
                    f = (f / f2) / (f3 / f2);
                    this.f8595d.m413a(solverVariable, 1.0f);
                    this.f8595d.m413a(solverVariable2, -1.0f);
                    this.f8595d.m413a(solverVariable4, f);
                    this.f8595d.m413a(solverVariable3, -f);
                }
                return this;
            }
        }
        this.f8595d.m413a(solverVariable, 1.0f);
        this.f8595d.m413a(solverVariable2, -1.0f);
        this.f8595d.m413a(solverVariable4, 1.0f);
        this.f8595d.m413a(solverVariable3, -1.0f);
        return this;
    }

    /* renamed from: a */
    C2733b m10607a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f8595d.m413a(solverVariable, 1.0f);
            this.f8595d.m413a(solverVariable4, 1.0f);
            this.f8595d.m413a(solverVariable2, (float) -1073741824);
            return this;
        }
        if (f == 0.5f) {
            this.f8595d.m413a(solverVariable, 1.0f);
            this.f8595d.m413a(solverVariable2, -1.0f);
            this.f8595d.m413a(solverVariable3, -1.0f);
            this.f8595d.m413a(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f8593b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f8595d.m413a(solverVariable, -1.0f);
            this.f8595d.m413a(solverVariable2, 1.0f);
            this.f8593b = (float) i;
        } else if (f >= 1.0f) {
            this.f8595d.m413a(solverVariable3, -1.0f);
            this.f8595d.m413a(solverVariable4, 1.0f);
            this.f8593b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f8595d.m413a(solverVariable, f2 * 1.0f);
            this.f8595d.m413a(solverVariable2, f2 * -1.0f);
            this.f8595d.m413a(solverVariable3, -1.0f * f);
            this.f8595d.m413a(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f8593b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C2733b m10611a(C0140e c0140e, int i) {
        this.f8595d.m413a(c0140e.m437a(i, "ep"), 1.0f);
        this.f8595d.m413a(c0140e.m437a(i, "em"), (float) -1082130432);
        return this;
    }

    /* renamed from: a */
    C2733b m10608a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, float f) {
        this.f8595d.m413a(solverVariable, -1.0f);
        this.f8595d.m413a(solverVariable2, 1.0f - f);
        this.f8595d.m413a(solverVariable3, f);
        return this;
    }

    /* renamed from: a */
    public C2733b m10610a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f8595d.m413a(solverVariable, -1.0f);
        this.f8595d.m413a(solverVariable2, 1.0f);
        this.f8595d.m413a(solverVariable3, f);
        this.f8595d.m413a(solverVariable4, -f);
        return this;
    }

    /* renamed from: b */
    public C2733b m10619b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f8595d.m413a(solverVariable3, 0.5f);
        this.f8595d.m413a(solverVariable4, 0.5f);
        this.f8595d.m413a(solverVariable, -0.5f);
        this.f8595d.m413a(solverVariable2, -0.5f);
        this.f8593b = -f;
        return this;
    }

    /* renamed from: d */
    void m10624d() {
        if (this.f8593b < 0.0f) {
            this.f8593b *= -1.0f;
            this.f8595d.m420b();
        }
    }

    /* renamed from: a */
    boolean m10615a(C0140e c0140e) {
        c0140e = this.f8595d.m409a(c0140e);
        if (c0140e == null) {
            c0140e = true;
        } else {
            m10623c(c0140e);
            c0140e = null;
        }
        if (this.f8595d.f404a == 0) {
            this.f8596e = true;
        }
        return c0140e;
    }

    /* renamed from: b */
    SolverVariable m10616b(SolverVariable solverVariable) {
        return this.f8595d.m410a(null, solverVariable);
    }

    /* renamed from: c */
    void m10623c(SolverVariable solverVariable) {
        if (this.f8592a != null) {
            this.f8595d.m413a(this.f8592a, -1.0f);
            this.f8592a = null;
        }
        float a = this.f8595d.m407a(solverVariable, true) * -1.0f;
        this.f8592a = solverVariable;
        if (a != 1.0f) {
            this.f8593b /= a;
            this.f8595d.m412a(a);
        }
    }

    /* renamed from: e */
    public boolean m10626e() {
        return this.f8592a == null && this.f8593b == 0.0f && this.f8595d.f404a == 0;
    }

    /* renamed from: a */
    public SolverVariable mo143a(C0140e c0140e, boolean[] zArr) {
        return this.f8595d.m410a(zArr, null);
    }

    /* renamed from: f */
    public void mo146f() {
        this.f8595d.m411a();
        this.f8592a = null;
        this.f8593b = 0.0f;
    }

    /* renamed from: a */
    public void mo144a(C0139a c0139a) {
        if (c0139a instanceof C2733b) {
            C2733b c2733b = (C2733b) c0139a;
            this.f8592a = null;
            this.f8595d.m411a();
            for (int i = 0; i < c2733b.f8595d.f404a; i++) {
                this.f8595d.m414a(c2733b.f8595d.m408a(i), c2733b.f8595d.m418b(i), true);
            }
        }
    }

    /* renamed from: d */
    public void mo145d(SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.f396c != 1) {
            if (solverVariable.f396c == 2) {
                f = 1000.0f;
            } else if (solverVariable.f396c == 3) {
                f = 1000000.0f;
            } else if (solverVariable.f396c == 4) {
                f = 1.0E9f;
            } else if (solverVariable.f396c == 5) {
                f = 1.0E12f;
            }
        }
        this.f8595d.m413a(solverVariable, f);
    }

    /* renamed from: g */
    public SolverVariable mo147g() {
        return this.f8592a;
    }
}
