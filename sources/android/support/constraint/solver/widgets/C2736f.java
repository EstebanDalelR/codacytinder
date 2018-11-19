package android.support.constraint.solver.widgets;

import java.util.Arrays;

/* renamed from: android.support.constraint.solver.widgets.f */
public class C2736f extends ConstraintWidget {
    protected ConstraintWidget[] ac = new ConstraintWidget[4];
    protected int ad = 0;

    /* renamed from: c */
    public void m10644c(ConstraintWidget constraintWidget) {
        if (this.ad + 1 > this.ac.length) {
            this.ac = (ConstraintWidget[]) Arrays.copyOf(this.ac, this.ac.length * 2);
        }
        this.ac[this.ad] = constraintWidget;
        this.ad++;
    }

    /* renamed from: H */
    public void mo152H() {
        this.ad = 0;
    }
}
