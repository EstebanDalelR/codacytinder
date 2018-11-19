package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0138c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.m */
public class C2739m extends ConstraintWidget {
    protected ArrayList<ConstraintWidget> am = new ArrayList();

    /* renamed from: f */
    public void mo163f() {
        this.am.clear();
        super.mo163f();
    }

    /* renamed from: c */
    public void m10667c(ConstraintWidget constraintWidget) {
        this.am.add(constraintWidget);
        if (constraintWidget.m535j() != null) {
            ((C2739m) constraintWidget.m535j()).m10668d(constraintWidget);
        }
        constraintWidget.m499a((ConstraintWidget) this);
    }

    /* renamed from: d */
    public void m10668d(ConstraintWidget constraintWidget) {
        this.am.remove(constraintWidget);
        constraintWidget.m499a(null);
    }

    /* renamed from: R */
    public C3987d m10663R() {
        ConstraintWidget j = m535j();
        C3987d c3987d = this instanceof C3987d ? (C3987d) this : null;
        while (j != null) {
            ConstraintWidget j2 = j.m535j();
            if (j instanceof C3987d) {
                c3987d = (C3987d) j;
            }
            j = j2;
        }
        return c3987d;
    }

    /* renamed from: b */
    public void mo162b(int i, int i2) {
        super.mo162b(i, i2);
        i = this.am.size();
        for (i2 = 0; i2 < i; i2++) {
            ((ConstraintWidget) this.am.get(i2)).mo162b(m553u(), m554v());
        }
    }

    /* renamed from: D */
    public void mo160D() {
        super.mo160D();
        if (this.am != null) {
            int size = this.am.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.am.get(i);
                constraintWidget.mo162b(m551s(), m552t());
                if (!(constraintWidget instanceof C3987d)) {
                    constraintWidget.mo160D();
                }
            }
        }
    }

    /* renamed from: L */
    public void mo2977L() {
        mo160D();
        if (this.am != null) {
            int size = this.am.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.am.get(i);
                if (constraintWidget instanceof C2739m) {
                    ((C2739m) constraintWidget).mo2977L();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo161a(C0138c c0138c) {
        super.mo161a(c0138c);
        int size = this.am.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.am.get(i)).mo161a(c0138c);
        }
    }

    /* renamed from: S */
    public void m10664S() {
        this.am.clear();
    }
}
