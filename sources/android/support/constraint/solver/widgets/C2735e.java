package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0140e;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.e */
public class C2735e extends ConstraintWidget {
    protected float ac = -1.0f;
    protected int ad = -1;
    protected int ae = -1;
    private ConstraintAnchor af = this.s;
    private int ag;
    private boolean ah;
    private int ai;
    private C0150h aj;
    private int ak;

    /* renamed from: a */
    public boolean mo155a() {
        return true;
    }

    public C2735e() {
        int i = 0;
        this.ag = 0;
        this.ah = false;
        this.ai = 0;
        this.aj = new C0150h();
        this.ak = 8;
        this.A.clear();
        this.A.add(this.af);
        int length = this.z.length;
        while (i < length) {
            this.z[i] = this.af;
            i++;
        }
    }

    /* renamed from: a */
    public void m10635a(int i) {
        if (this.ag != i) {
            this.ag = i;
            this.A.clear();
            if (this.ag == 1) {
                this.af = this.r;
            } else {
                this.af = this.s;
            }
            this.A.add(this.af);
            i = this.z.length;
            for (int i2 = 0; i2 < i; i2++) {
                this.z[i2] = this.af;
            }
        }
    }

    /* renamed from: H */
    public int mo152H() {
        return this.ag;
    }

    /* renamed from: a */
    public ConstraintAnchor mo153a(Type type) {
        switch (type) {
            case LEFT:
            case RIGHT:
                if (this.ag == 1) {
                    return this.af;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.ag == 0) {
                    return this.af;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            default:
                break;
        }
        throw new AssertionError(type.name());
    }

    /* renamed from: C */
    public ArrayList<ConstraintAnchor> mo151C() {
        return this.A;
    }

    /* renamed from: e */
    public void m10640e(float f) {
        if (f > -1.0f) {
            this.ac = f;
            this.ad = -1;
            this.ae = -1;
        }
    }

    /* renamed from: q */
    public void m10641q(int i) {
        if (i > -1) {
            this.ac = -1.0f;
            this.ad = i;
            this.ae = -1;
        }
    }

    /* renamed from: r */
    public void m10642r(int i) {
        if (i > -1) {
            this.ac = -1.0f;
            this.ad = -1;
            this.ae = i;
        }
    }

    /* renamed from: b */
    public void mo156b(int i) {
        i = m535j();
        if (i != 0) {
            int i2;
            if (mo152H() == 1) {
                this.s.m462a().m10647a(1, i.f523s.m462a(), 0);
                this.u.m462a().m10647a(1, i.f523s.m462a(), 0);
                if (this.ad != -1) {
                    this.r.m462a().m10647a(1, i.f522r.m462a(), this.ad);
                    this.t.m462a().m10647a(1, i.f522r.m462a(), this.ad);
                } else if (this.ae != -1) {
                    this.r.m462a().m10647a(1, i.f524t.m462a(), -this.ae);
                    this.t.m462a().m10647a(1, i.f524t.m462a(), -this.ae);
                } else if (this.ac != -1.0f && i.m485F() == DimensionBehaviour.FIXED) {
                    i2 = (int) (((float) i.f483D) * this.ac);
                    this.r.m462a().m10647a(1, i.f522r.m462a(), i2);
                    this.t.m462a().m10647a(1, i.f522r.m462a(), i2);
                }
            } else {
                this.r.m462a().m10647a(1, i.f522r.m462a(), 0);
                this.t.m462a().m10647a(1, i.f522r.m462a(), 0);
                if (this.ad != -1) {
                    this.s.m462a().m10647a(1, i.f523s.m462a(), this.ad);
                    this.u.m462a().m10647a(1, i.f523s.m462a(), this.ad);
                } else if (this.ae != -1) {
                    this.s.m462a().m10647a(1, i.f525u.m462a(), -this.ae);
                    this.u.m462a().m10647a(1, i.f525u.m462a(), -this.ae);
                } else if (this.ac != -1.0f && i.m486G() == DimensionBehaviour.FIXED) {
                    i2 = (int) (((float) i.f484E) * this.ac);
                    this.s.m462a().m10647a(1, i.f523s.m462a(), i2);
                    this.u.m462a().m10647a(1, i.f523s.m462a(), i2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo154a(C0140e c0140e) {
        C3987d c3987d = (C3987d) m535j();
        if (c3987d != null) {
            Object a = c3987d.mo153a(Type.LEFT);
            Object a2 = c3987d.mo153a(Type.RIGHT);
            Object obj = (this.C == null || this.C.f481B[0] != DimensionBehaviour.WRAP_CONTENT) ? null : 1;
            if (this.ag == 0) {
                a = c3987d.mo153a(Type.TOP);
                a2 = c3987d.mo153a(Type.BOTTOM);
                obj = (this.C == null || this.C.f481B[1] != DimensionBehaviour.WRAP_CONTENT) ? null : 1;
            }
            SolverVariable a3;
            if (this.ad != -1) {
                a3 = c0140e.m438a(this.af);
                c0140e.m454c(a3, c0140e.m438a(a), this.ad, 6);
                if (obj != null) {
                    c0140e.m441a(c0140e.m438a(a2), a3, 0, 5);
                }
            } else if (this.ae != -1) {
                a3 = c0140e.m438a(this.af);
                SolverVariable a4 = c0140e.m438a(a2);
                c0140e.m454c(a3, a4, -this.ae, 6);
                if (obj != null) {
                    c0140e.m441a(a3, c0140e.m438a(a), 0, 5);
                    c0140e.m441a(a4, a3, 0, 5);
                }
            } else if (this.ac != -1.0f) {
                c0140e.m444a(C0140e.m428a(c0140e, c0140e.m438a(this.af), c0140e.m438a(a), c0140e.m438a(a2), this.ac, this.ah));
            }
        }
    }

    /* renamed from: c */
    public void mo157c(C0140e c0140e) {
        if (m535j() != null) {
            c0140e = c0140e.m449b(this.af);
            if (this.ag == 1) {
                m528f(c0140e);
                m530g(0);
                m534i(m535j().m549q());
                m532h(0);
            } else {
                m528f(0);
                m530g(c0140e);
                m532h(m535j().m545o());
                m534i(0);
            }
        }
    }
}
