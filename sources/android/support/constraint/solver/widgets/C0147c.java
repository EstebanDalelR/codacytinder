package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.c */
public class C0147c {
    /* renamed from: a */
    protected ConstraintWidget f531a;
    /* renamed from: b */
    protected ConstraintWidget f532b;
    /* renamed from: c */
    protected ConstraintWidget f533c;
    /* renamed from: d */
    protected ConstraintWidget f534d;
    /* renamed from: e */
    protected ConstraintWidget f535e;
    /* renamed from: f */
    protected ConstraintWidget f536f;
    /* renamed from: g */
    protected ConstraintWidget f537g;
    /* renamed from: h */
    protected ArrayList<ConstraintWidget> f538h;
    /* renamed from: i */
    protected int f539i;
    /* renamed from: j */
    protected int f540j;
    /* renamed from: k */
    protected float f541k = 0.0f;
    /* renamed from: l */
    protected boolean f542l;
    /* renamed from: m */
    protected boolean f543m;
    /* renamed from: n */
    protected boolean f544n;
    /* renamed from: o */
    private int f545o;
    /* renamed from: p */
    private boolean f546p = false;
    /* renamed from: q */
    private boolean f547q;

    public C0147c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f531a = constraintWidget;
        this.f545o = i;
        this.f546p = z;
    }

    /* renamed from: a */
    private static boolean m561a(ConstraintWidget constraintWidget, int i) {
        return (constraintWidget.m537k() != 8 && constraintWidget.f481B[i] == DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.f511g[i] == 0 || constraintWidget.f511g[i] == 3)) ? true : null;
    }

    /* renamed from: b */
    private void m562b() {
        int i = this.f545o * 2;
        ConstraintWidget constraintWidget = this.f531a;
        ConstraintWidget constraintWidget2 = this.f531a;
        boolean z = false;
        ConstraintWidget constraintWidget3 = constraintWidget;
        Object obj = null;
        while (obj == null) {
            this.f539i++;
            ConstraintWidget constraintWidget4 = null;
            constraintWidget3.f504Z[this.f545o] = null;
            constraintWidget3.f503Y[this.f545o] = null;
            if (constraintWidget3.m537k() != 8) {
                if (this.f532b == null) {
                    this.f532b = constraintWidget3;
                }
                if (this.f534d != null) {
                    this.f534d.f504Z[this.f545o] = constraintWidget3;
                }
                this.f534d = constraintWidget3;
                if (constraintWidget3.f481B[this.f545o] == DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget3.f511g[this.f545o] == 0 || constraintWidget3.f511g[this.f545o] == 3 || constraintWidget3.f511g[this.f545o] == 2)) {
                    this.f540j++;
                    float f = constraintWidget3.f502X[this.f545o];
                    if (f > 0.0f) {
                        this.f541k += constraintWidget3.f502X[this.f545o];
                    }
                    if (C0147c.m561a(constraintWidget3, this.f545o)) {
                        if (f < 0.0f) {
                            this.f542l = true;
                        } else {
                            this.f543m = true;
                        }
                        if (this.f538h == null) {
                            this.f538h = new ArrayList();
                        }
                        this.f538h.add(constraintWidget3);
                    }
                    if (this.f536f == null) {
                        this.f536f = constraintWidget3;
                    }
                    if (this.f537g != null) {
                        this.f537g.f503Y[this.f545o] = constraintWidget3;
                    }
                    this.f537g = constraintWidget3;
                }
            }
            ConstraintAnchor constraintAnchor = constraintWidget3.f530z[i + 1].f469c;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f467a;
                if (constraintWidget5.f530z[i].f469c != null) {
                    if (constraintWidget5.f530z[i].f469c.f467a == constraintWidget3) {
                        constraintWidget4 = constraintWidget5;
                    }
                }
            }
            if (constraintWidget4 != null) {
                constraintWidget3 = constraintWidget4;
            } else {
                obj = 1;
            }
        }
        this.f533c = constraintWidget3;
        if (this.f545o == 0 && this.f546p) {
            this.f535e = this.f533c;
        } else {
            this.f535e = this.f531a;
        }
        if (this.f543m && this.f542l) {
            z = true;
        }
        this.f544n = z;
    }

    /* renamed from: a */
    public void m563a() {
        if (!this.f547q) {
            m562b();
        }
        this.f547q = true;
    }
}
