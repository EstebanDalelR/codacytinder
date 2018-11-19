package com.bumptech.glide.load.resource.gif;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.view.Gravity;
import com.bumptech.glide.gifdecoder.C0992b;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback;
import com.bumptech.glide.load.resource.p028a.C1041b;

/* renamed from: com.bumptech.glide.load.resource.gif.b */
public class C3101b extends C1041b implements FrameCallback {
    /* renamed from: a */
    private final Paint f9596a;
    /* renamed from: b */
    private final Rect f9597b;
    /* renamed from: c */
    private final C1054a f9598c;
    /* renamed from: d */
    private final GifDecoder f9599d;
    /* renamed from: e */
    private final GifFrameLoader f9600e;
    /* renamed from: f */
    private boolean f9601f;
    /* renamed from: g */
    private boolean f9602g;
    /* renamed from: h */
    private boolean f9603h;
    /* renamed from: i */
    private boolean f9604i;
    /* renamed from: j */
    private int f9605j;
    /* renamed from: k */
    private int f9606k;
    /* renamed from: l */
    private boolean f9607l;

    /* renamed from: com.bumptech.glide.load.resource.gif.b$a */
    static class C1054a extends ConstantState {
        /* renamed from: a */
        C0992b f2886a;
        /* renamed from: b */
        byte[] f2887b;
        /* renamed from: c */
        Context f2888c;
        /* renamed from: d */
        Transformation<Bitmap> f2889d;
        /* renamed from: e */
        int f2890e;
        /* renamed from: f */
        int f2891f;
        /* renamed from: g */
        BitmapProvider f2892g;
        /* renamed from: h */
        BitmapPool f2893h;
        /* renamed from: i */
        Bitmap f2894i;

        public int getChangingConfigurations() {
            return 0;
        }

        public C1054a(C0992b c0992b, byte[] bArr, Context context, Transformation<Bitmap> transformation, int i, int i2, BitmapProvider bitmapProvider, BitmapPool bitmapPool, Bitmap bitmap) {
            if (bitmap == null) {
                throw new NullPointerException("The first frame of the GIF must not be null");
            }
            this.f2886a = c0992b;
            this.f2887b = bArr;
            this.f2893h = bitmapPool;
            this.f2894i = bitmap;
            this.f2888c = context.getApplicationContext();
            this.f2889d = transformation;
            this.f2890e = i;
            this.f2891f = i2;
            this.f2892g = bitmapProvider;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C3101b(this);
        }
    }

    /* renamed from: a */
    public boolean mo1328a() {
        return true;
    }

    public int getOpacity() {
        return -2;
    }

    public C3101b(Context context, BitmapProvider bitmapProvider, BitmapPool bitmapPool, Transformation<Bitmap> transformation, int i, int i2, C0992b c0992b, byte[] bArr, Bitmap bitmap) {
        this(new C1054a(c0992b, bArr, context, transformation, i, i2, bitmapProvider, bitmapPool, bitmap));
    }

    public C3101b(C3101b c3101b, Bitmap bitmap, Transformation<Bitmap> transformation) {
        this(new C1054a(c3101b.f9598c.f2886a, c3101b.f9598c.f2887b, c3101b.f9598c.f2888c, transformation, c3101b.f9598c.f2890e, c3101b.f9598c.f2891f, c3101b.f9598c.f2892g, c3101b.f9598c.f2893h, bitmap));
    }

    C3101b(C1054a c1054a) {
        this.f9597b = new Rect();
        this.f9604i = true;
        this.f9606k = -1;
        if (c1054a == null) {
            throw new NullPointerException("GifState must not be null");
        }
        this.f9598c = c1054a;
        this.f9599d = new GifDecoder(c1054a.f2892g);
        this.f9596a = new Paint();
        this.f9599d.m3452a(c1054a.f2886a, c1054a.f2887b);
        this.f9600e = new GifFrameLoader(c1054a.f2888c, this, this.f9599d, c1054a.f2890e, c1054a.f2891f);
        this.f9600e.m3631a(c1054a.f2889d);
    }

    /* renamed from: b */
    public Bitmap m12060b() {
        return this.f9598c.f2894i;
    }

    /* renamed from: c */
    public Transformation<Bitmap> m12061c() {
        return this.f9598c.f2889d;
    }

    /* renamed from: d */
    public byte[] m12062d() {
        return this.f9598c.f2887b;
    }

    /* renamed from: e */
    public int m12063e() {
        return this.f9599d.m3454c();
    }

    /* renamed from: g */
    private void m12054g() {
        this.f9605j = 0;
    }

    public void start() {
        this.f9602g = true;
        m12054g();
        if (this.f9604i) {
            m12056i();
        }
    }

    public void stop() {
        this.f9602g = false;
        m12057j();
        if (VERSION.SDK_INT < 11) {
            m12055h();
        }
    }

    /* renamed from: h */
    private void m12055h() {
        this.f9600e.m3634c();
        invalidateSelf();
    }

    /* renamed from: i */
    private void m12056i() {
        if (this.f9599d.m3454c() == 1) {
            invalidateSelf();
        } else if (!this.f9601f) {
            this.f9601f = true;
            this.f9600e.m3630a();
            invalidateSelf();
        }
    }

    /* renamed from: j */
    private void m12057j() {
        this.f9601f = false;
        this.f9600e.m3633b();
    }

    public boolean setVisible(boolean z, boolean z2) {
        this.f9604i = z;
        if (!z) {
            m12057j();
        } else if (this.f9602g) {
            m12056i();
        }
        return super.setVisible(z, z2);
    }

    public int getIntrinsicWidth() {
        return this.f9598c.f2894i.getWidth();
    }

    public int getIntrinsicHeight() {
        return this.f9598c.f2894i.getHeight();
    }

    public boolean isRunning() {
        return this.f9601f;
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9607l = true;
    }

    public void draw(Canvas canvas) {
        if (!this.f9603h) {
            if (this.f9607l) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f9597b);
                this.f9607l = false;
            }
            Bitmap d = this.f9600e.m3635d();
            if (d == null) {
                d = this.f9598c.f2894i;
            }
            canvas.drawBitmap(d, null, this.f9597b, this.f9596a);
        }
    }

    public void setAlpha(int i) {
        this.f9596a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9596a.setColorFilter(colorFilter);
    }

    @TargetApi(11)
    public void onFrameReady(int i) {
        if (VERSION.SDK_INT < 11 || getCallback() != null) {
            invalidateSelf();
            if (i == this.f9599d.m3454c() - 1) {
                this.f9605j++;
            }
            if (this.f9606k != -1 && this.f9605j >= this.f9606k) {
                stop();
            }
            return;
        }
        stop();
        m12055h();
    }

    public ConstantState getConstantState() {
        return this.f9598c;
    }

    /* renamed from: f */
    public void m12064f() {
        this.f9603h = true;
        this.f9598c.f2893h.put(this.f9598c.f2894i);
        this.f9600e.m3634c();
        this.f9600e.m3633b();
    }

    /* renamed from: a */
    public void mo1327a(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            i = this.f9599d.m3456e();
            if (i == 0) {
                i = -1;
            }
            this.f9606k = i;
        } else {
            this.f9606k = i;
        }
    }
}
