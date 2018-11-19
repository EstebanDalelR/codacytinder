package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;

/* renamed from: com.airbnb.lottie.model.layer.f */
public class C4326f extends C4077a {
    /* renamed from: e */
    private final RectF f14172e = new RectF();
    /* renamed from: f */
    private final Paint f14173f = new Paint();
    /* renamed from: g */
    private final Layer f14174g;

    C4326f(C0792d c0792d, Layer layer) {
        super(c0792d, layer);
        this.f14174g = layer;
        this.f14173f.setAlpha(0);
        this.f14173f.setStyle(Style.FILL);
        this.f14173f.setColor(layer.m2952p());
    }

    /* renamed from: a */
    public void mo3687a(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f14174g.m2952p());
        if (alpha != 0) {
            i = (int) (((((float) i) / 1132396544) * (((((float) alpha) / 255.0f) * ((float) ((Integer) this.d.m2730a().mo1163b()).intValue())) / 100.0f)) * 1132396544);
            this.f14173f.setAlpha(i);
            if (i > 0) {
                m17504a(matrix);
                canvas.drawRect(this.f14172e, this.f14173f);
            }
        }
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        super.getBounds(rectF, matrix);
        m17504a(this.a);
        rectF.set(this.f14172e);
    }

    /* renamed from: a */
    private void m17504a(Matrix matrix) {
        this.f14172e.set(0.0f, 0.0f, (float) this.f14174g.m2954r(), (float) this.f14174g.m2953q());
        matrix.mapRect(this.f14172e);
    }

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        this.f14173f.setColorFilter(colorFilter);
    }
}
