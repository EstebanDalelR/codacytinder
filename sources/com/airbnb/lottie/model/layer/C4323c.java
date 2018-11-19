package com.airbnb.lottie.model.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;

/* renamed from: com.airbnb.lottie.model.layer.c */
public class C4323c extends C4077a {
    /* renamed from: e */
    private final Paint f14167e = new Paint(3);
    /* renamed from: f */
    private final Rect f14168f = new Rect();
    /* renamed from: g */
    private final Rect f14169g = new Rect();
    /* renamed from: h */
    private final float f14170h;

    C4323c(C0792d c0792d, Layer layer, float f) {
        super(c0792d, layer);
        this.f14170h = f;
    }

    /* renamed from: a */
    public void mo3687a(@NonNull Canvas canvas, Matrix matrix, int i) {
        Bitmap d = m17500d();
        if (d != null) {
            this.f14167e.setAlpha(i);
            canvas.save();
            canvas.concat(matrix);
            this.f14168f.set(0, 0, d.getWidth(), d.getHeight());
            this.f14169g.set(0, 0, (int) (((float) d.getWidth()) * this.f14170h), (int) (((float) d.getHeight()) * this.f14170h));
            canvas.drawBitmap(d, this.f14168f, this.f14169g, this.f14167e);
            canvas.restore();
        }
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        super.getBounds(rectF, matrix);
        matrix = m17500d();
        if (matrix != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) matrix.getWidth()), Math.min(rectF.bottom, (float) matrix.getHeight()));
            this.a.mapRect(rectF);
        }
    }

    @Nullable
    /* renamed from: d */
    private Bitmap m17500d() {
        return this.b.m2840b(this.c.m2943g());
    }

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        this.f14167e.setColorFilter(colorFilter);
    }
}
