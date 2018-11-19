package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0140e;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;

/* renamed from: android.support.constraint.solver.widgets.i */
public class C2737i extends C0151k {
    /* renamed from: a */
    ConstraintAnchor f8599a;
    /* renamed from: b */
    float f8600b;
    /* renamed from: c */
    C2737i f8601c;
    /* renamed from: d */
    float f8602d;
    /* renamed from: e */
    C2737i f8603e;
    /* renamed from: f */
    float f8604f;
    /* renamed from: g */
    int f8605g = 0;
    /* renamed from: j */
    private C2737i f8606j;
    /* renamed from: k */
    private float f8607k;
    /* renamed from: l */
    private C2738j f8608l = null;
    /* renamed from: m */
    private int f8609m = 1;
    /* renamed from: n */
    private C2738j f8610n = null;
    /* renamed from: o */
    private int f8611o = 1;

    /* renamed from: a */
    String m10645a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public C2737i(ConstraintAnchor constraintAnchor) {
        this.f8599a = constraintAnchor;
    }

    public String toString() {
        StringBuilder stringBuilder;
        if (this.i != 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("{ ");
            stringBuilder.append(this.f8599a);
            stringBuilder.append(" UNRESOLVED} type: ");
            stringBuilder.append(m10645a(this.f8605g));
            return stringBuilder.toString();
        } else if (this.f8603e == this) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f8599a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f8604f);
            stringBuilder.append("]  type: ");
            stringBuilder.append(m10645a(this.f8605g));
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.f8599a);
            stringBuilder.append(", RESOLVED: ");
            stringBuilder.append(this.f8603e);
            stringBuilder.append(":");
            stringBuilder.append(this.f8604f);
            stringBuilder.append("] type: ");
            stringBuilder.append(m10645a(this.f8605g));
            return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public void m10649a(C2737i c2737i, float f) {
        if (this.i == 0 || !(this.f8603e == c2737i || this.f8604f == f)) {
            this.f8603e = c2737i;
            this.f8604f = f;
            if (this.i == Float.MIN_VALUE) {
                m571e();
            }
            m572f();
        }
    }

    /* renamed from: a */
    public void mo158a() {
        Object obj = 1;
        if (this.i != 1 && this.f8605g != 4) {
            if (this.f8608l != null) {
                if (this.f8608l.i == 1) {
                    this.f8602d = ((float) this.f8609m) * this.f8608l.f8612a;
                } else {
                    return;
                }
            }
            if (this.f8610n != null) {
                if (this.f8610n.i == 1) {
                    this.f8607k = ((float) this.f8611o) * this.f8610n.f8612a;
                } else {
                    return;
                }
            }
            if (this.f8605g == 1 && (this.f8601c == null || this.f8601c.i == 1)) {
                if (this.f8601c == null) {
                    this.f8603e = this;
                    this.f8604f = this.f8602d;
                } else {
                    this.f8603e = this.f8601c.f8603e;
                    this.f8604f = this.f8601c.f8604f + this.f8602d;
                }
                m572f();
            } else if (this.f8605g == 2 && this.f8601c != null && this.f8601c.i == 1 && this.f8606j != null && this.f8606j.f8601c != null && this.f8606j.f8601c.i == 1) {
                float f;
                float f2;
                int e;
                int e2;
                float f3;
                float f4;
                if (C0140e.m429a() != null) {
                    r0 = C0140e.m429a();
                    r0.f462w++;
                }
                this.f8603e = this.f8601c.f8603e;
                this.f8606j.f8603e = this.f8606j.f8601c.f8603e;
                int i = 0;
                if (this.f8599a.f468b != Type.RIGHT) {
                    if (this.f8599a.f468b != Type.BOTTOM) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    f = this.f8601c.f8604f - this.f8606j.f8601c.f8604f;
                } else {
                    f = this.f8606j.f8601c.f8604f - this.f8601c.f8604f;
                }
                if (this.f8599a.f468b != Type.LEFT) {
                    if (this.f8599a.f468b != Type.RIGHT) {
                        f -= (float) this.f8599a.f467a.m549q();
                        f2 = this.f8599a.f467a.f495Q;
                        e = this.f8599a.m471e();
                        e2 = this.f8606j.f8599a.m471e();
                        if (this.f8599a.m473g() != this.f8606j.f8599a.m473g()) {
                            f2 = 0.5f;
                            e2 = 0;
                        } else {
                            i = e;
                        }
                        f3 = (float) i;
                        f4 = (float) e2;
                        f = (f - f3) - f4;
                        if (obj == null) {
                            this.f8606j.f8604f = (this.f8606j.f8601c.f8604f + f4) + (f * f2);
                            this.f8604f = (this.f8601c.f8604f - f3) - (f * (1.0f - f2));
                        } else {
                            this.f8604f = (this.f8601c.f8604f + f3) + (f * f2);
                            this.f8606j.f8604f = (this.f8606j.f8601c.f8604f - f4) - (f * (1.0f - f2));
                        }
                        m572f();
                        this.f8606j.m572f();
                    }
                }
                f -= (float) this.f8599a.f467a.m545o();
                f2 = this.f8599a.f467a.f494P;
                e = this.f8599a.m471e();
                e2 = this.f8606j.f8599a.m471e();
                if (this.f8599a.m473g() != this.f8606j.f8599a.m473g()) {
                    i = e;
                } else {
                    f2 = 0.5f;
                    e2 = 0;
                }
                f3 = (float) i;
                f4 = (float) e2;
                f = (f - f3) - f4;
                if (obj == null) {
                    this.f8604f = (this.f8601c.f8604f + f3) + (f * f2);
                    this.f8606j.f8604f = (this.f8606j.f8601c.f8604f - f4) - (f * (1.0f - f2));
                } else {
                    this.f8606j.f8604f = (this.f8606j.f8601c.f8604f + f4) + (f * f2);
                    this.f8604f = (this.f8601c.f8604f - f3) - (f * (1.0f - f2));
                }
                m572f();
                this.f8606j.m572f();
            } else if (this.f8605g == 3 && this.f8601c != null && this.f8601c.i == 1 && this.f8606j != null && this.f8606j.f8601c != null && this.f8606j.f8601c.i == 1) {
                if (C0140e.m429a() != null) {
                    r0 = C0140e.m429a();
                    r0.f463x++;
                }
                this.f8603e = this.f8601c.f8603e;
                this.f8606j.f8603e = this.f8606j.f8601c.f8603e;
                this.f8604f = this.f8601c.f8604f + this.f8602d;
                this.f8606j.f8604f = this.f8606j.f8601c.f8604f + this.f8606j.f8602d;
                m572f();
                this.f8606j.m572f();
            } else if (this.f8605g == 5) {
                this.f8599a.f467a.mo2976c();
            }
        }
    }

    /* renamed from: b */
    public void m10653b(int i) {
        this.f8605g = i;
    }

    /* renamed from: b */
    public void mo159b() {
        super.mo159b();
        this.f8601c = null;
        this.f8602d = 0.0f;
        this.f8608l = null;
        this.f8609m = 1;
        this.f8610n = null;
        this.f8611o = 1;
        this.f8603e = null;
        this.f8604f = 0.0f;
        this.f8600b = 0.0f;
        this.f8606j = null;
        this.f8607k = 0.0f;
        this.f8605g = 0;
    }

    /* renamed from: c */
    public void m10656c() {
        ConstraintAnchor g = this.f8599a.m473g();
        if (g != null) {
            if (g.m473g() == this.f8599a) {
                this.f8605g = 4;
                g.m462a().f8605g = 4;
            }
            int e = this.f8599a.m471e();
            if (this.f8599a.f468b == Type.RIGHT || this.f8599a.f468b == Type.BOTTOM) {
                e = -e;
            }
            m10650a(g.m462a(), e);
        }
    }

    /* renamed from: a */
    public void m10647a(int i, C2737i c2737i, int i2) {
        this.f8605g = i;
        this.f8601c = c2737i;
        this.f8602d = (float) i2;
        this.f8601c.m569a(this);
    }

    /* renamed from: a */
    public void m10650a(C2737i c2737i, int i) {
        this.f8601c = c2737i;
        this.f8602d = (float) i;
        this.f8601c.m569a(this);
    }

    /* renamed from: a */
    public void m10651a(C2737i c2737i, int i, C2738j c2738j) {
        this.f8601c = c2737i;
        this.f8601c.m569a(this);
        this.f8608l = c2738j;
        this.f8609m = i;
        this.f8608l.m569a(this);
    }

    /* renamed from: b */
    public void m10654b(C2737i c2737i, float f) {
        this.f8606j = c2737i;
        this.f8607k = f;
    }

    /* renamed from: b */
    public void m10655b(C2737i c2737i, int i, C2738j c2738j) {
        this.f8606j = c2737i;
        this.f8610n = c2738j;
        this.f8611o = i;
    }

    /* renamed from: a */
    void m10648a(C0140e c0140e) {
        SolverVariable b = this.f8599a.m468b();
        if (this.f8603e == null) {
            c0140e.m439a(b, (int) this.f8604f);
        } else {
            c0140e.m454c(b, c0140e.m438a(this.f8603e.f8599a), (int) this.f8604f, 6);
        }
    }

    /* renamed from: d */
    public float m10657d() {
        return this.f8604f;
    }
}
