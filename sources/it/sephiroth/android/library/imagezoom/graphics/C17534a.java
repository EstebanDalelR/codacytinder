package it.sephiroth.android.library.imagezoom.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: it.sephiroth.android.library.imagezoom.graphics.a */
public class C17534a extends Drawable implements IBitmapDrawable {
    /* renamed from: a */
    protected Bitmap f54198a;
    /* renamed from: b */
    protected Paint f54199b;
    /* renamed from: c */
    protected int f54200c;
    /* renamed from: d */
    protected int f54201d;

    public int getOpacity() {
        return -3;
    }

    public C17534a(Bitmap bitmap) {
        this.f54198a = bitmap;
        if (this.f54198a != null) {
            this.f54200c = this.f54198a.getWidth();
            this.f54201d = this.f54198a.getHeight();
        } else {
            this.f54200c = 0;
            this.f54201d = 0;
        }
        this.f54199b = new Paint();
        this.f54199b.setDither(true);
        this.f54199b.setFilterBitmap(true);
    }

    public void draw(Canvas canvas) {
        if (this.f54198a != null && !this.f54198a.isRecycled()) {
            Rect bounds = getBounds();
            if (bounds.isEmpty()) {
                canvas.drawBitmap(this.f54198a, 0.0f, 0.0f, this.f54199b);
            } else {
                canvas.drawBitmap(this.f54198a, null, bounds, this.f54199b);
            }
        }
    }

    public void setAlpha(int i) {
        this.f54199b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f54199b.setColorFilter(colorFilter);
    }

    public int getIntrinsicWidth() {
        return this.f54200c;
    }

    public int getIntrinsicHeight() {
        return this.f54201d;
    }

    public int getMinimumWidth() {
        return this.f54200c;
    }

    public int getMinimumHeight() {
        return this.f54201d;
    }

    public Bitmap getBitmap() {
        return this.f54198a;
    }
}
