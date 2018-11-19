package android.support.design.internal;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.design.C0181a.C0173d;
import android.support.design.C0181a.C0175f;
import android.support.design.C0181a.C0180k;
import android.support.design.widget.BaseTransientBottomBar.ContentViewCallback;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

@RestrictTo({Scope.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    /* renamed from: a */
    private TextView f8640a;
    /* renamed from: b */
    private Button f8641b;
    /* renamed from: c */
    private int f8642c;
    /* renamed from: d */
    private int f8643d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, C0180k.SnackbarLayout);
        this.f8642c = context.getDimensionPixelSize(C0180k.SnackbarLayout_android_maxWidth, -1);
        this.f8643d = context.getDimensionPixelSize(C0180k.SnackbarLayout_maxActionInlineWidth, -1);
        context.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f8640a = (TextView) findViewById(C0175f.snackbar_text);
        this.f8641b = (Button) findViewById(C0175f.snackbar_action);
    }

    public TextView getMessageView() {
        return this.f8640a;
    }

    public Button getActionView() {
        return this.f8641b;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f8642c > 0 && getMeasuredWidth() > this.f8642c) {
            i = MeasureSpec.makeMeasureSpec(this.f8642c, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0173d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0173d.design_snackbar_padding_vertical);
        int i3 = 1;
        Object obj = this.f8640a.getLayout().getLineCount() > 1 ? 1 : null;
        if (obj == null || this.f8643d <= 0 || this.f8641b.getMeasuredWidth() <= this.f8643d) {
            if (obj == null) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (m10679a(0, dimensionPixelSize, dimensionPixelSize)) {
                if (i3 == 0) {
                    super.onMeasure(i, i2);
                }
            }
        } else if (m10679a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            if (i3 == 0) {
                super.onMeasure(i, i2);
            }
        }
        i3 = 0;
        if (i3 == 0) {
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: a */
    private boolean m10679a(int i, int i2, int i3) {
        if (i != getOrientation()) {
            setOrientation(i);
            i = 1;
        } else {
            i = 0;
        }
        if (this.f8640a.getPaddingTop() == i2 && this.f8640a.getPaddingBottom() == i3) {
            return i;
        }
        m10678a(this.f8640a, i2, i3);
        return true;
    }

    /* renamed from: a */
    private static void m10678a(View view, int i, int i2) {
        if (ViewCompat.m2229u(view)) {
            ViewCompat.m2197b(view, ViewCompat.m2210g(view), i, ViewCompat.m2212h(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    public void animateContentIn(int i, int i2) {
        this.f8640a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f8640a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f8641b.getVisibility() == 0) {
            this.f8641b.setAlpha(0.0f);
            this.f8641b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void animateContentOut(int i, int i2) {
        this.f8640a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f8640a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f8641b.getVisibility() == 0) {
            this.f8641b.setAlpha(1.0f);
            this.f8641b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
