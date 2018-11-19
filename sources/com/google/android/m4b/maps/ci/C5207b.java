package com.google.android.m4b.maps.ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.m4b.maps.C4513R;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: com.google.android.m4b.maps.ci.b */
final class C5207b {
    /* renamed from: a */
    private final View f19402a;
    /* renamed from: b */
    private Bitmap f19403b;
    /* renamed from: c */
    private C6647k f19404c;

    C5207b(View view) {
        this.f19402a = view;
    }

    /* renamed from: a */
    final void m23252a(Bitmap bitmap, C6647k c6647k) {
        this.f19403b = bitmap;
        this.f19404c = c6647k;
        this.f19402a.invalidate();
    }

    /* renamed from: a */
    final C6647k m23251a(Canvas canvas, int i, int i2) {
        if (this.f19403b != null) {
            i = ((float) (i - this.f19403b.getWidth())) / 1073741824;
            i2 = ((float) (i2 - this.f19403b.getHeight())) / 1073741824;
            canvas.drawBitmap(this.f19403b, i, i2, new Paint());
        } else {
            m23250a(canvas);
        }
        return this.f19404c;
    }

    /* renamed from: a */
    private void m23250a(Canvas canvas) {
        Paint paint = new Paint();
        int dimensionPixelSize = this.f19402a.getResources().getDimensionPixelSize(C4513R.dimen.maps_lite_mode_grid_spacing);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        paint.setARGB(50, ProfileEditingConfig.DEFAULT_MAX_LENGTH, ProfileEditingConfig.DEFAULT_MAX_LENGTH, ProfileEditingConfig.DEFAULT_MAX_LENGTH);
        int i = dimensionPixelSize / 2;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            float f = 1.0f;
            if (i3 >= width) {
                break;
            }
            if ((i4 + 7) % 8 == 0) {
                f = 2.0f;
            }
            paint.setStrokeWidth(f);
            float f2 = (float) i3;
            canvas.drawLine(f2, 0.0f, f2, (float) height, paint);
            i4++;
            i3 += dimensionPixelSize;
        }
        while (i < height) {
            paint.setStrokeWidth((i2 + 7) % 8 == 0 ? 2.0f : 1.0f);
            float f3 = (float) i;
            canvas.drawLine(0.0f, f3, (float) width, f3, paint);
            i2++;
            i += dimensionPixelSize;
        }
    }
}
