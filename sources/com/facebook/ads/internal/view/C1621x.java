package com.facebook.ads.internal.view;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.internal.view.x */
public class C1621x extends ImageView {
    public C1621x(Context context) {
        super(context);
    }

    protected void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == 1073741824) {
            i2 = i;
        } else if (MeasureSpec.getMode(i2) == 1073741824) {
            i = i2;
        }
        super.onMeasure(i, i2);
    }
}
