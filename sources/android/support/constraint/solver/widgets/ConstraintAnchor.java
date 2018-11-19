package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0138c;
import android.support.constraint.solver.SolverVariable;

public class ConstraintAnchor {
    /* renamed from: a */
    final ConstraintWidget f467a;
    /* renamed from: b */
    final Type f468b;
    /* renamed from: c */
    ConstraintAnchor f469c;
    /* renamed from: d */
    public int f470d = 0;
    /* renamed from: e */
    int f471e = -1;
    /* renamed from: f */
    SolverVariable f472f;
    /* renamed from: g */
    private C2737i f473g = new C2737i(this);
    /* renamed from: h */
    private Strength f474h = Strength.NONE;
    /* renamed from: i */
    private ConnectionType f475i = ConnectionType.RELAXED;
    /* renamed from: j */
    private int f476j = 0;

    public enum ConnectionType {
        RELAXED,
        STRICT
    }

    public enum Strength {
        NONE,
        STRONG,
        WEAK
    }

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: a */
    public C2737i m462a() {
        return this.f473g;
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f467a = constraintWidget;
        this.f468b = type;
    }

    /* renamed from: b */
    public SolverVariable m468b() {
        return this.f472f;
    }

    /* renamed from: a */
    public void m463a(C0138c c0138c) {
        if (this.f472f == null) {
            this.f472f = new SolverVariable(android.support.constraint.solver.SolverVariable.Type.UNRESTRICTED, null);
        } else {
            this.f472f.m403b();
        }
    }

    /* renamed from: c */
    public ConstraintWidget m469c() {
        return this.f467a;
    }

    /* renamed from: d */
    public Type m470d() {
        return this.f468b;
    }

    /* renamed from: e */
    public int m471e() {
        if (this.f467a.m537k() == 8) {
            return 0;
        }
        if (this.f471e <= -1 || this.f469c == null || this.f469c.f467a.m537k() != 8) {
            return this.f470d;
        }
        return this.f471e;
    }

    /* renamed from: f */
    public Strength m472f() {
        return this.f474h;
    }

    /* renamed from: g */
    public ConstraintAnchor m473g() {
        return this.f469c;
    }

    /* renamed from: h */
    public int m474h() {
        return this.f476j;
    }

    /* renamed from: i */
    public void m475i() {
        this.f469c = null;
        this.f470d = 0;
        this.f471e = -1;
        this.f474h = Strength.STRONG;
        this.f476j = 0;
        this.f475i = ConnectionType.RELAXED;
        this.f473g.mo159b();
    }

    /* renamed from: a */
    public boolean m467a(ConstraintAnchor constraintAnchor, int i, Strength strength, int i2) {
        return m466a(constraintAnchor, i, -1, strength, i2, false);
    }

    /* renamed from: a */
    public boolean m466a(ConstraintAnchor constraintAnchor, int i, int i2, Strength strength, int i3, boolean z) {
        if (constraintAnchor == null) {
            this.f469c = null;
            this.f470d = 0;
            this.f471e = -1;
            this.f474h = Strength.NONE;
            this.f476j = 2;
            return true;
        } else if (!z && !m464a(constraintAnchor)) {
            return false;
        } else {
            this.f469c = constraintAnchor;
            if (i > 0) {
                this.f470d = i;
            } else {
                this.f470d = 0;
            }
            this.f471e = i2;
            this.f474h = strength;
            this.f476j = i3;
            return true;
        }
    }

    /* renamed from: a */
    public boolean m465a(ConstraintAnchor constraintAnchor, int i, int i2) {
        return m466a(constraintAnchor, i, -1, Strength.STRONG, i2, false);
    }

    /* renamed from: j */
    public boolean m476j() {
        return this.f469c != null;
    }

    /* renamed from: a */
    public boolean m464a(ConstraintAnchor constraintAnchor) {
        boolean z = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type d = constraintAnchor.m470d();
        if (d != this.f468b) {
            boolean z2;
            switch (this.f468b) {
                case CENTER:
                    if (!(d == Type.BASELINE || d == Type.CENTER_X || d == Type.CENTER_Y)) {
                        z = true;
                    }
                    return z;
                case LEFT:
                case RIGHT:
                    if (d != Type.LEFT) {
                        if (d != Type.RIGHT) {
                            z2 = false;
                            if ((constraintAnchor.m469c() instanceof C2735e) != null) {
                                if (!z2) {
                                    if (d == Type.CENTER_X) {
                                        z2 = false;
                                    }
                                }
                                z2 = true;
                            }
                            return z2;
                        }
                    }
                    z2 = true;
                    if ((constraintAnchor.m469c() instanceof C2735e) != null) {
                        if (z2) {
                            if (d == Type.CENTER_X) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                    return z2;
                case TOP:
                case BOTTOM:
                    if (d != Type.TOP) {
                        if (d != Type.BOTTOM) {
                            z2 = false;
                            if ((constraintAnchor.m469c() instanceof C2735e) != null) {
                                if (!z2) {
                                    if (d == Type.CENTER_Y) {
                                        z2 = false;
                                    }
                                }
                                z2 = true;
                            }
                            return z2;
                        }
                    }
                    z2 = true;
                    if ((constraintAnchor.m469c() instanceof C2735e) != null) {
                        if (z2) {
                            if (d == Type.CENTER_Y) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                    return z2;
                case BASELINE:
                case CENTER_X:
                case CENTER_Y:
                case NONE:
                    return false;
                default:
                    throw new AssertionError(this.f468b.name());
            }
        } else if (this.f468b == Type.BASELINE && (constraintAnchor.m469c().m558z() == null || m469c().m558z() == null)) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f467a.m539l());
        stringBuilder.append(":");
        stringBuilder.append(this.f468b.toString());
        return stringBuilder.toString();
    }

    /* renamed from: k */
    public final ConstraintAnchor m477k() {
        switch (this.f468b) {
            case CENTER:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            case LEFT:
                return this.f467a.f524t;
            case RIGHT:
                return this.f467a.f522r;
            case TOP:
                return this.f467a.f525u;
            case BOTTOM:
                return this.f467a.f523s;
            default:
                throw new AssertionError(this.f468b.name());
        }
    }
}
