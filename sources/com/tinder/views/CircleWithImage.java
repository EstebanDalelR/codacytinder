package com.tinder.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tinder.C6250b.C6249b;
import com.tinder.R;
import com.tinder.utils.ad;

public class CircleWithImage extends ImageView {
    /* renamed from: a */
    private float f47722a = 0.0f;
    /* renamed from: b */
    private float f47723b = 0.0f;
    /* renamed from: c */
    private float f47724c = 30.0f;
    /* renamed from: d */
    private float f47725d;
    /* renamed from: e */
    private RectF f47726e = new RectF();
    /* renamed from: f */
    private Paint f47727f;
    /* renamed from: g */
    private BitmapShader f47728g;
    /* renamed from: h */
    private Bitmap f47729h;
    /* renamed from: i */
    private int f47730i;

    public CircleWithImage(Context context) {
        super(context);
        this.f47730i = C0432b.c(context, R.color.white);
    }

    public CircleWithImage(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        attributeSet = context.obtainStyledAttributes(attributeSet, C6249b.com_tinder_views_CircleWithImage, 0, 0);
        try {
            this.f47730i = attributeSet.getColor(0, 0);
            this.f47725d = attributeSet.getDimension(1, context.getResources().getDimension(R.dimen.dialog_padding_default));
        } catch (Context context2) {
            ad.c(context2.getMessage());
        } catch (Throwable th) {
            attributeSet.recycle();
        }
        attributeSet.recycle();
    }

    protected void onDraw(@Nullable Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            if (isInEditMode() == null) {
                ad.c("CircleWithImage drawable null - aborting onDraw...");
            }
            return;
        }
        if (canvas == null) {
            canvas = new Canvas();
        }
        m57838a(canvas);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Paint a = m57837a(m57836a(bitmap));
        if (bitmap == null || this.f47726e == null || a == null) {
            ad.b("Something important was null");
        } else {
            this.f47726e.top = 0.0f;
            this.f47726e.left = 0.0f;
            this.f47726e.bottom = (float) bitmap.getHeight();
            this.f47726e.right = (float) bitmap.getWidth();
            try {
                float f = (float) 20;
                canvas.drawRoundRect(this.f47726e, f, f, a);
            } catch (Canvas canvas2) {
                ad.a(canvas2.getMessage());
            }
            this.f47729h = bitmap;
        }
    }

    /* renamed from: a */
    private void m57838a(@NonNull Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Style.FILL);
        paint.setColor(this.f47730i);
        this.f47722a = (float) (getWidth() / 2);
        this.f47723b = (float) (getHeight() / 2);
        this.f47724c = this.f47722a > this.f47723b ? this.f47722a : this.f47723b;
        this.f47724c += this.f47725d;
        ad.a(String.format("drawing circle at x[%s] y[%s] with padding: [%s]", new Object[]{Float.valueOf(this.f47722a), Float.valueOf(this.f47723b), Float.valueOf(this.f47725d)}));
        canvas.drawCircle(this.f47722a, this.f47723b, this.f47724c, paint);
    }

    /* renamed from: a */
    private Paint m57837a(BitmapShader bitmapShader) {
        if (this.f47727f == null || this.f47727f.getShader() != bitmapShader) {
            this.f47727f = new Paint();
            this.f47727f.setAntiAlias(true);
            this.f47727f.setShader(bitmapShader);
            this.f47727f.setFilterBitmap(true);
        }
        return this.f47727f;
    }

    /* renamed from: a */
    private BitmapShader m57836a(Bitmap bitmap) {
        if (this.f47728g == null || this.f47729h != bitmap) {
            this.f47728g = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        }
        return this.f47728g;
    }
}
