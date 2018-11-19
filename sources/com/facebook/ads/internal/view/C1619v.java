package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.facebook.ads.internal.p047k.an;

/* renamed from: com.facebook.ads.internal.view.v */
public class C1619v extends TextView {
    /* renamed from: a */
    private float f4482a;
    /* renamed from: b */
    private float f4483b = 8.0f;

    public C1619v(Context context) {
        super(context);
        super.setSingleLine();
        super.setMaxLines(1);
        this.f4482a = getTextSize() / an.f4090b;
        setEllipsize(TruncateAt.END);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        for (float f = this.f4482a; f >= this.f4483b; f -= 0.5f) {
            super.setTextSize(f);
            measure(0, 0);
            if (getMeasuredWidth() <= i5) {
                break;
            }
        }
        if (getMeasuredWidth() > i5) {
            measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setMaxLines(int i) {
    }

    public void setMinTextSize(float f) {
        if (f <= this.f4482a) {
            this.f4483b = f;
        }
    }

    public void setSingleLine(boolean z) {
    }

    public void setTextSize(float f) {
        this.f4482a = f;
        super.setTextSize(f);
    }
}
