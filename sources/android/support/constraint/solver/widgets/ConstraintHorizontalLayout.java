package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0140e;
import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;

public class ConstraintHorizontalLayout extends C3987d {
    private ContentAlignment an;

    public enum ContentAlignment {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    /* renamed from: a */
    public void mo154a(C0140e c0140e) {
        if (this.am.size() != 0) {
            int i = 0;
            int size = this.am.size();
            ConstraintWidget constraintWidget = this;
            while (i < size) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.am.get(i);
                if (constraintWidget != this) {
                    constraintWidget2.m494a(Type.LEFT, constraintWidget, Type.RIGHT);
                    constraintWidget.m494a(Type.RIGHT, constraintWidget2, Type.LEFT);
                } else {
                    Strength strength = Strength.STRONG;
                    if (this.an == ContentAlignment.END) {
                        strength = Strength.WEAK;
                    }
                    Strength strength2 = strength;
                    constraintWidget2.m496a(Type.LEFT, constraintWidget, Type.LEFT, 0, strength2);
                }
                constraintWidget2.m494a(Type.TOP, (ConstraintWidget) this, Type.TOP);
                constraintWidget2.m494a(Type.BOTTOM, (ConstraintWidget) this, Type.BOTTOM);
                i++;
                constraintWidget = constraintWidget2;
            }
            if (constraintWidget != this) {
                Strength strength3 = Strength.STRONG;
                if (this.an == ContentAlignment.BEGIN) {
                    strength3 = Strength.WEAK;
                }
                ConstraintWidget constraintWidget3 = constraintWidget;
                constraintWidget3.m496a(Type.RIGHT, (ConstraintWidget) this, Type.RIGHT, 0, strength3);
            }
        }
        super.mo154a(c0140e);
    }
}
