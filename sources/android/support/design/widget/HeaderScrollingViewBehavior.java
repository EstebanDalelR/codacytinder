package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout.C0205b;
import android.support.v4.p010a.C0360a;
import android.support.v4.view.C0593c;
import android.support.v4.view.C0610p;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    /* renamed from: a */
    final Rect f12716a = new Rect();
    /* renamed from: b */
    final Rect f12717b = new Rect();
    /* renamed from: c */
    private int f12718c = 0;
    /* renamed from: d */
    private int f12719d;

    /* renamed from: c */
    private static int m15666c(int i) {
        return i == 0 ? 8388659 : i;
    }

    /* renamed from: a */
    float mo3658a(View view) {
        return 1.0f;
    }

    /* renamed from: b */
    abstract View mo3662b(List<View> list);

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo2987a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        HeaderScrollingViewBehavior headerScrollingViewBehavior = this;
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View b = mo3662b(coordinatorLayout.m15650c(view));
            if (b != null) {
                View view2;
                if (!ViewCompat.m2227s(b) || ViewCompat.m2227s(view)) {
                    view2 = view;
                } else {
                    view2 = view;
                    ViewCompat.m2198b(view2, true);
                    if (ViewCompat.m2227s(view2)) {
                        view2.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.m15641a(view2, i, i2, MeasureSpec.makeMeasureSpec((size - b.getMeasuredHeight()) + mo3661b(b), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    protected void mo2988b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View b = mo3662b(coordinatorLayout.m15650c(view));
        if (b != null) {
            C0205b c0205b = (C0205b) view.getLayoutParams();
            Rect rect = this.f12716a;
            rect.set(coordinatorLayout.getPaddingLeft() + c0205b.leftMargin, b.getBottom() + c0205b.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - c0205b.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - c0205b.bottomMargin);
            C0610p lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (!(lastWindowInsets == null || ViewCompat.m2227s(coordinatorLayout) == null || ViewCompat.m2227s(view) != null)) {
                rect.left += lastWindowInsets.m2388a();
                rect.right -= lastWindowInsets.m2391c();
            }
            coordinatorLayout = this.f12717b;
            C0593c.m2314a(m15666c(c0205b.f684c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, coordinatorLayout, i);
            i = m15674c(b);
            view.layout(coordinatorLayout.left, coordinatorLayout.top - i, coordinatorLayout.right, coordinatorLayout.bottom - i);
            this.f12718c = coordinatorLayout.top - b.getBottom();
            return;
        }
        super.mo2988b(coordinatorLayout, view, i);
        this.f12718c = null;
    }

    /* renamed from: c */
    final int m15674c(View view) {
        return this.f12719d == 0 ? 0 : C0360a.m1309a((int) (mo3658a(view) * ((float) this.f12719d)), 0, this.f12719d);
    }

    /* renamed from: b */
    int mo3661b(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: a */
    final int m15668a() {
        return this.f12718c;
    }

    /* renamed from: b */
    public final void m15672b(int i) {
        this.f12719d = i;
    }

    /* renamed from: d */
    public final int m15675d() {
        return this.f12719d;
    }
}
