package android.support.v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

@RestrictTo({Scope.LIBRARY})
/* renamed from: android.support.v4.widget.o */
public class C0651o {
    /* renamed from: a */
    private static final ThreadLocal<Matrix> f2011a = new ThreadLocal();
    /* renamed from: b */
    private static final ThreadLocal<RectF> f2012b = new ThreadLocal();

    /* renamed from: a */
    static void m2648a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f2011a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f2011a.set(matrix);
        } else {
            matrix.reset();
        }
        C0651o.m2649a((ViewParent) viewGroup, view, matrix);
        viewGroup = (RectF) f2012b.get();
        if (viewGroup == null) {
            viewGroup = new RectF();
            f2012b.set(viewGroup);
        }
        viewGroup.set(rect);
        matrix.mapRect(viewGroup);
        rect.set((int) (viewGroup.left + 1056964608), (int) (viewGroup.top + 0.5f), (int) (viewGroup.right + 0.5f), (int) (viewGroup.bottom + 1056964608));
    }

    /* renamed from: b */
    public static void m2650b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        C0651o.m2648a(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m2649a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            C0651o.m2649a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (view.getMatrix().isIdentity() == null) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
