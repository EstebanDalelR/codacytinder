package com.viewpagerindicator;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: com.viewpagerindicator.a */
class C15502a extends LinearLayout {
    /* renamed from: a */
    private static final int[] f47941a = new int[]{16843049, 16843561, 16843562};
    /* renamed from: b */
    private Drawable f47942b;
    /* renamed from: c */
    private int f47943c;
    /* renamed from: d */
    private int f47944d;
    /* renamed from: e */
    private int f47945e;
    /* renamed from: f */
    private int f47946f;

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f47942b) {
            this.f47942b = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f47943c = drawable.getIntrinsicWidth();
                this.f47944d = drawable.getIntrinsicHeight();
            } else {
                this.f47943c = 0;
                this.f47944d = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (m57982a(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.f47944d;
            } else {
                layoutParams.leftMargin = this.f47943c;
            }
        }
        int childCount = getChildCount();
        if (indexOfChild == childCount - 1 && m57982a(childCount)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.f47944d;
            } else {
                layoutParams.rightMargin = this.f47943c;
            }
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f47942b != null) {
            if (getOrientation() == 1) {
                m57980a(canvas);
            } else {
                m57983b(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private void m57980a(Canvas canvas) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (!(childAt == null || childAt.getVisibility() == 8 || !m57982a(i))) {
                m57981a(canvas, childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin);
            }
            i++;
        }
        if (m57982a(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                childCount = (getHeight() - getPaddingBottom()) - this.f47944d;
            } else {
                childCount = childAt2.getBottom();
            }
            m57981a(canvas, childCount);
        }
    }

    /* renamed from: b */
    private void m57983b(Canvas canvas) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (!(childAt == null || childAt.getVisibility() == 8 || !m57982a(i))) {
                m57984b(canvas, childAt.getLeft() - ((LayoutParams) childAt.getLayoutParams()).leftMargin);
            }
            i++;
        }
        if (m57982a(childCount)) {
            View childAt2 = getChildAt(childCount - 1);
            if (childAt2 == null) {
                childCount = (getWidth() - getPaddingRight()) - this.f47943c;
            } else {
                childCount = childAt2.getRight();
            }
            m57984b(canvas, childCount);
        }
    }

    /* renamed from: a */
    private void m57981a(Canvas canvas, int i) {
        this.f47942b.setBounds(getPaddingLeft() + this.f47946f, i, (getWidth() - getPaddingRight()) - this.f47946f, this.f47944d + i);
        this.f47942b.draw(canvas);
    }

    /* renamed from: b */
    private void m57984b(Canvas canvas, int i) {
        this.f47942b.setBounds(i, getPaddingTop() + this.f47946f, this.f47943c + i, (getHeight() - getPaddingBottom()) - this.f47946f);
        this.f47942b.draw(canvas);
    }

    /* renamed from: a */
    private boolean m57982a(int i) {
        boolean z = false;
        if (i != 0) {
            if (i != getChildCount()) {
                if ((this.f47945e & 2) == 0) {
                    return false;
                }
                for (i--; i >= 0; i--) {
                    if (getChildAt(i).getVisibility() != 8) {
                        z = true;
                        break;
                    }
                }
                return z;
            }
        }
        return false;
    }
}
