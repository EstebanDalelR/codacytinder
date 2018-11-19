package com.facebook.accountkit.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.accountkit.C1196d.C1195h;

public final class AspectFrameLayout extends FrameLayout {
    /* renamed from: a */
    private int f3378a;
    /* renamed from: b */
    private int f3379b;
    /* renamed from: c */
    private Point f3380c;

    public AspectFrameLayout(Context context) {
        super(context);
    }

    public AspectFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m4545a(context, attributeSet);
    }

    public AspectFrameLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4545a(context, attributeSet);
    }

    @TargetApi(21)
    public AspectFrameLayout(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4545a(context, attributeSet);
    }

    /* renamed from: a */
    private void m4545a(Context context, @Nullable AttributeSet attributeSet) {
        context = context.obtainStyledAttributes(attributeSet, C1195h.AspectFrameLayout);
        try {
            this.f3379b = context.getDimensionPixelSize(C1195h.AspectFrameLayout_com_accountkit_aspect_width, 0);
            this.f3378a = context.getDimensionPixelSize(C1195h.AspectFrameLayout_com_accountkit_aspect_height, 0);
        } finally {
            context.recycle();
        }
    }

    public float getAspectHeight() {
        return (float) this.f3378a;
    }

    public void setAspectHeight(int i) {
        if (this.f3378a != i) {
            this.f3378a = i;
            requestLayout();
        }
    }

    public float getAspectWidth() {
        return (float) this.f3379b;
    }

    public void setAspectWidth(int i) {
        if (this.f3379b != i) {
            this.f3379b = i;
            requestLayout();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point point = new Point();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
        this.f3380c = point;
    }

    protected void onMeasure(int i, int i2) {
        if (!(this.f3379b == 0 || this.f3378a == 0)) {
            if (this.f3380c != null) {
                i = (this.f3380c.x * this.f3378a) / this.f3379b;
                if (i > this.f3380c.y) {
                    i2 = this.f3380c.x;
                } else {
                    i2 = (this.f3380c.y * this.f3379b) / this.f3378a;
                    i = this.f3380c.y;
                }
                super.onMeasure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(i, 1073741824));
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
