package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: com.squareup.picasso.m */
final class C6099m extends BitmapDrawable {
    /* renamed from: e */
    private static final Paint f22402e = new Paint();
    /* renamed from: a */
    Drawable f22403a;
    /* renamed from: b */
    long f22404b;
    /* renamed from: c */
    boolean f22405c;
    /* renamed from: d */
    int f22406d = 255;
    /* renamed from: f */
    private final boolean f22407f;
    /* renamed from: g */
    private final float f22408g;
    /* renamed from: h */
    private final LoadedFrom f22409h;

    /* renamed from: a */
    static void m26508a(ImageView imageView, Context context, Bitmap bitmap, LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new C6099m(context, bitmap, drawable, loadedFrom, z, z2));
    }

    /* renamed from: a */
    static void m26509a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if ((imageView.getDrawable() instanceof AnimationDrawable) != null) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    C6099m(Context context, Bitmap bitmap, Drawable drawable, LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f22407f = z2;
        this.f22408g = context.getResources().getDisplayMetrics().density;
        this.f22409h = loadedFrom;
        context = (loadedFrom == LoadedFrom.MEMORY || z) ? null : true;
        if (context != null) {
            this.f22403a = drawable;
            this.f22405c = true;
            this.f22404b = SystemClock.uptimeMillis();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f22405c) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f22404b)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f22405c = false;
                this.f22403a = null;
                super.draw(canvas);
            } else {
                if (this.f22403a != null) {
                    this.f22403a.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f22406d) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f22406d);
                if (VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        } else {
            super.draw(canvas);
        }
        if (this.f22407f) {
            m26507a(canvas);
        }
    }

    public void setAlpha(int i) {
        this.f22406d = i;
        if (this.f22403a != null) {
            this.f22403a.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f22403a != null) {
            this.f22403a.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    protected void onBoundsChange(Rect rect) {
        if (this.f22403a != null) {
            this.f22403a.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    /* renamed from: a */
    private void m26507a(Canvas canvas) {
        f22402e.setColor(-1);
        canvas.drawPath(C6099m.m26506a(new Point(0, 0), (int) (this.f22408g * 16.0f)), f22402e);
        f22402e.setColor(this.f22409h.debugColor);
        canvas.drawPath(C6099m.m26506a(new Point(0, 0), (int) (this.f22408g * 15.0f)), f22402e);
    }

    /* renamed from: a */
    private static Path m26506a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        i = new Path();
        i.moveTo((float) point.x, (float) point.y);
        i.lineTo((float) point2.x, (float) point2.y);
        i.lineTo((float) point3.x, (float) point3.y);
        return i;
    }
}
