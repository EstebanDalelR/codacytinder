package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.Nullable;

public interface DrawingContent extends Content {
    void addColorFilter(@Nullable String str, @Nullable String str2, @Nullable ColorFilter colorFilter);

    void draw(Canvas canvas, Matrix matrix, int i);

    void getBounds(RectF rectF, Matrix matrix);
}
