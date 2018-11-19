package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.widget.TextView;

/* renamed from: com.facebook.ads.internal.view.t */
public class C1616t extends TextView {
    /* renamed from: a */
    private int f4477a;
    /* renamed from: b */
    private float f4478b;
    /* renamed from: c */
    private float f4479c = 8.0f;

    public C1616t(Context context, int i) {
        super(context);
        setMaxLines(i);
        setEllipsize(TruncateAt.END);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.setMaxLines(this.f4477a + 1);
        super.setTextSize(this.f4478b);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), MeasureSpec.makeMeasureSpec(i6, 0));
        if (getMeasuredHeight() > i6) {
            float f = this.f4478b;
            while (f > this.f4479c) {
                f -= 0.5f;
                super.setTextSize(f);
                measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), 0);
                if (getMeasuredHeight() <= i6 && getLineCount() <= this.f4477a) {
                    break;
                }
            }
        }
        super.setMaxLines(this.f4477a);
        setMeasuredDimension(i5, i6);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setMaxLines(int i) {
        this.f4477a = i;
        super.setMaxLines(i);
    }

    public void setMinTextSize(float f) {
        this.f4479c = f;
    }

    public void setTextSize(float f) {
        this.f4478b = f;
        super.setTextSize(f);
    }
}
