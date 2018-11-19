package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.airbnb.lottie.C0792d;
import com.airbnb.lottie.animation.content.C4050b;
import com.airbnb.lottie.model.content.C2993i;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.model.layer.e */
public class C4325e extends C4077a {
    /* renamed from: e */
    private final C4050b f14171e;

    C4325e(C0792d c0792d, Layer layer) {
        super(c0792d, layer);
        this.f14171e = new C4050b(c0792d, this, new C2993i(layer.m2942f(), layer.m2950n()));
        this.f14171e.setContents(Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    void mo3687a(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.f14171e.draw(canvas, matrix, i);
    }

    public void getBounds(RectF rectF, Matrix matrix) {
        super.getBounds(rectF, matrix);
        this.f14171e.getBounds(rectF, this.a);
    }

    public void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter) {
        this.f14171e.addColorFilter(str, str2, colorFilter);
    }
}
