package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C0792d;

/* renamed from: com.airbnb.lottie.model.layer.d */
public class C4324d extends C4077a {
    /* renamed from: a */
    void mo3687a(Canvas canvas, Matrix matrix, int i) {
    }

    C4324d(C0792d c0792d, Layer layer) {
        super(c0792d, layer);
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        super.getBounds(rectF, matrix);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
