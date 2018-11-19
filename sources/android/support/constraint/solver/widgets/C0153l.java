package android.support.constraint.solver.widgets;

import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import java.util.ArrayList;

/* renamed from: android.support.constraint.solver.widgets.l */
public class C0153l {
    /* renamed from: a */
    private int f557a;
    /* renamed from: b */
    private int f558b;
    /* renamed from: c */
    private int f559c;
    /* renamed from: d */
    private int f560d;
    /* renamed from: e */
    private ArrayList<C0152a> f561e = new ArrayList();

    /* renamed from: android.support.constraint.solver.widgets.l$a */
    static class C0152a {
        /* renamed from: a */
        private ConstraintAnchor f552a;
        /* renamed from: b */
        private ConstraintAnchor f553b;
        /* renamed from: c */
        private int f554c;
        /* renamed from: d */
        private Strength f555d;
        /* renamed from: e */
        private int f556e;

        public C0152a(ConstraintAnchor constraintAnchor) {
            this.f552a = constraintAnchor;
            this.f553b = constraintAnchor.m473g();
            this.f554c = constraintAnchor.m471e();
            this.f555d = constraintAnchor.m472f();
            this.f556e = constraintAnchor.m474h();
        }

        /* renamed from: a */
        public void m574a(ConstraintWidget constraintWidget) {
            this.f552a = constraintWidget.mo153a(this.f552a.m470d());
            if (this.f552a != null) {
                this.f553b = this.f552a.m473g();
                this.f554c = this.f552a.m471e();
                this.f555d = this.f552a.m472f();
                this.f556e = this.f552a.m474h();
                return;
            }
            this.f553b = null;
            this.f554c = 0;
            this.f555d = Strength.STRONG;
            this.f556e = 0;
        }

        /* renamed from: b */
        public void m575b(ConstraintWidget constraintWidget) {
            constraintWidget.mo153a(this.f552a.m470d()).m467a(this.f553b, this.f554c, this.f555d, this.f556e);
        }
    }

    public C0153l(ConstraintWidget constraintWidget) {
        this.f557a = constraintWidget.m541m();
        this.f558b = constraintWidget.m543n();
        this.f559c = constraintWidget.m545o();
        this.f560d = constraintWidget.m549q();
        constraintWidget = constraintWidget.mo151C();
        int size = constraintWidget.size();
        for (int i = 0; i < size; i++) {
            this.f561e.add(new C0152a((ConstraintAnchor) constraintWidget.get(i)));
        }
    }

    /* renamed from: a */
    public void m576a(ConstraintWidget constraintWidget) {
        this.f557a = constraintWidget.m541m();
        this.f558b = constraintWidget.m543n();
        this.f559c = constraintWidget.m545o();
        this.f560d = constraintWidget.m549q();
        int size = this.f561e.size();
        for (int i = 0; i < size; i++) {
            ((C0152a) this.f561e.get(i)).m574a(constraintWidget);
        }
    }

    /* renamed from: b */
    public void m577b(ConstraintWidget constraintWidget) {
        constraintWidget.m528f(this.f557a);
        constraintWidget.m530g(this.f558b);
        constraintWidget.m532h(this.f559c);
        constraintWidget.m534i(this.f560d);
        int size = this.f561e.size();
        for (int i = 0; i < size; i++) {
            ((C0152a) this.f561e.get(i)).m575b(constraintWidget);
        }
    }
}
