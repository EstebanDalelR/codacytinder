package com.facebook.ads.internal.view;

import android.content.Context;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.internal.view.w */
public class C1620w extends RelativeLayout {
    /* renamed from: a */
    private int f4484a = 0;
    /* renamed from: b */
    private int f4485b = 0;

    public C1620w(Context context) {
        super(context);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4485b > 0 && getMeasuredWidth() > this.f4485b) {
            i = this.f4485b;
        } else if (getMeasuredWidth() < this.f4484a) {
            i = this.f4484a;
        } else {
            return;
        }
        setMeasuredDimension(i, getMeasuredHeight());
    }

    protected void setMaxWidth(int i) {
        this.f4485b = i;
    }

    public void setMinWidth(int i) {
        this.f4484a = i;
    }
}
