package com.facebook.accountkit.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.facebook.accountkit.C1196d.C1195h;

public final class ConstrainedLinearLayout extends LinearLayout {
    /* renamed from: a */
    private int f3388a = -1;
    /* renamed from: b */
    private int f3389b = -1;
    /* renamed from: c */
    private int f3390c = -1;

    public ConstrainedLinearLayout(Context context) {
        super(context);
    }

    public ConstrainedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4549a(context, attributeSet);
    }

    public ConstrainedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4549a(context, attributeSet);
    }

    @TargetApi(21)
    public ConstrainedLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4549a(context, attributeSet);
    }

    /* renamed from: a */
    private void m4549a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (!isInEditMode()) {
                context = context.obtainStyledAttributes(attributeSet, C1195h.ConstrainedLinearLayout);
                try {
                    this.f3388a = context.getDimensionPixelSize(C1195h.ConstrainedLinearLayout_com_accountkit_max_height, this.f3388a);
                    this.f3389b = context.getDimensionPixelSize(C1195h.ConstrainedLinearLayout_com_accountkit_max_width, this.f3389b);
                    this.f3390c = context.getDimensionPixelSize(C1195h.ConstrainedLinearLayout_com_accountkit_min_height, this.f3390c);
                } finally {
                    context.recycle();
                }
            }
        }
    }

    public int getMinHeight() {
        return this.f3390c;
    }

    public void setMinHeight(int i) {
        this.f3390c = i;
        requestLayout();
    }

    protected void onMeasure(int i, int i2) {
        Object obj;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f3389b < 0 || measuredWidth <= this.f3389b) {
            obj = null;
        } else {
            i = MeasureSpec.makeMeasureSpec(this.f3389b, 1073741824);
            obj = 1;
        }
        if (this.f3388a >= 0 && measuredHeight > this.f3388a) {
            i2 = MeasureSpec.makeMeasureSpec(this.f3388a, 1073741824);
            obj = 1;
        }
        if (this.f3390c >= 0 && measuredHeight < this.f3390c) {
            i2 = MeasureSpec.makeMeasureSpec(this.f3390c, 1073741824);
            obj = 1;
        }
        if (obj != null) {
            super.onMeasure(i, i2);
        }
    }
}
