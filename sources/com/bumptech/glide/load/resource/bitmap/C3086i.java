package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import com.bumptech.glide.load.resource.p028a.C1041b;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
public class C3086i extends C1041b {
    /* renamed from: a */
    private final Rect f9553a;
    /* renamed from: b */
    private int f9554b;
    /* renamed from: c */
    private int f9555c;
    /* renamed from: d */
    private boolean f9556d;
    /* renamed from: e */
    private boolean f9557e;
    /* renamed from: f */
    private C1046a f9558f;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$a */
    static class C1046a extends ConstantState {
        /* renamed from: d */
        private static final Paint f2871d = new Paint(6);
        /* renamed from: a */
        final Bitmap f2872a;
        /* renamed from: b */
        int f2873b;
        /* renamed from: c */
        Paint f2874c;

        public int getChangingConfigurations() {
            return 0;
        }

        public C1046a(Bitmap bitmap) {
            this.f2874c = f2871d;
            this.f2872a = bitmap;
        }

        C1046a(C1046a c1046a) {
            this(c1046a.f2872a);
            this.f2873b = c1046a.f2873b;
        }

        /* renamed from: a */
        void m3614a(ColorFilter colorFilter) {
            m3612a();
            this.f2874c.setColorFilter(colorFilter);
        }

        /* renamed from: a */
        void m3613a(int i) {
            m3612a();
            this.f2874c.setAlpha(i);
        }

        /* renamed from: a */
        void m3612a() {
            if (f2871d == this.f2874c) {
                this.f2874c = new Paint(6);
            }
        }

        public Drawable newDrawable() {
            return new C3086i(null, this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C3086i(resources, this);
        }
    }

    /* renamed from: a */
    public void mo1327a(int i) {
    }

    /* renamed from: a */
    public boolean mo1328a() {
        return false;
    }

    public boolean isRunning() {
        return false;
    }

    public void start() {
    }

    public void stop() {
    }

    public C3086i(Resources resources, Bitmap bitmap) {
        this(resources, new C1046a(bitmap));
    }

    C3086i(Resources resources, C1046a c1046a) {
        this.f9553a = new Rect();
        if (c1046a == null) {
            throw new NullPointerException("BitmapState must not be null");
        }
        this.f9558f = c1046a;
        if (resources != null) {
            resources = resources.getDisplayMetrics().densityDpi;
            if (resources == null) {
                resources = 160;
            }
            c1046a.f2873b = resources;
        } else {
            resources = c1046a.f2873b;
        }
        this.f9554b = c1046a.f2872a.getScaledWidth(resources);
        this.f9555c = c1046a.f2872a.getScaledHeight(resources);
    }

    public int getIntrinsicWidth() {
        return this.f9554b;
    }

    public int getIntrinsicHeight() {
        return this.f9555c;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9556d = true;
    }

    public ConstantState getConstantState() {
        return this.f9558f;
    }

    public void draw(Canvas canvas) {
        if (this.f9556d) {
            Gravity.apply(119, this.f9554b, this.f9555c, getBounds(), this.f9553a);
            this.f9556d = false;
        }
        canvas.drawBitmap(this.f9558f.f2872a, null, this.f9553a, this.f9558f.f2874c);
    }

    public void setAlpha(int i) {
        if (this.f9558f.f2874c.getAlpha() != i) {
            this.f9558f.m3613a(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9558f.m3614a(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        Bitmap bitmap = this.f9558f.f2872a;
        if (!(bitmap == null || bitmap.hasAlpha())) {
            if (this.f9558f.f2874c.getAlpha() >= 255) {
                return -1;
            }
        }
        return -3;
    }

    public Drawable mutate() {
        if (!this.f9557e && super.mutate() == this) {
            this.f9558f = new C1046a(this.f9558f);
            this.f9557e = true;
        }
        return this;
    }

    /* renamed from: b */
    public Bitmap m12042b() {
        return this.f9558f.f2872a;
    }
}
