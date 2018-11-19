package android.support.transition;

import android.graphics.Matrix;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.transition.C0351r.C0350a;
import android.view.View;
import android.view.ViewParent;

@RequiresApi(14)
class an implements as {
    an() {
    }

    /* renamed from: a */
    public al mo344a(@NonNull View view) {
        return aj.m10910d(view);
    }

    /* renamed from: b */
    public av mo348b(@NonNull View view) {
        return new at(view.getWindowToken());
    }

    /* renamed from: a */
    public void mo345a(@NonNull View view, float f) {
        Float f2 = (Float) view.getTag(C0350a.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: c */
    public float mo350c(@NonNull View view) {
        Float f = (Float) view.getTag(C0350a.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo351d(@NonNull View view) {
        if (view.getTag(C0350a.save_non_transition_alpha) == null) {
            view.setTag(C0350a.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo352e(@NonNull View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C0350a.save_non_transition_alpha, null);
        }
    }

    /* renamed from: a */
    public void mo347a(@NonNull View view, @NonNull Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo347a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        view = view.getMatrix();
        if (!view.isIdentity()) {
            matrix.preConcat(view);
        }
    }

    /* renamed from: b */
    public void mo349b(@NonNull View view, @NonNull Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo349b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        view = view.getMatrix();
        if (!view.isIdentity()) {
            Matrix matrix2 = new Matrix();
            if (view.invert(matrix2) != null) {
                matrix.postConcat(matrix2);
            }
        }
    }

    /* renamed from: a */
    public void mo346a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
