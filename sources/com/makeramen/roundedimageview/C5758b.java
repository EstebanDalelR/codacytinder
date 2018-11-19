package com.makeramen.roundedimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.ImageView.ScaleType;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.makeramen.roundedimageview.b */
public class C5758b extends Drawable {
    /* renamed from: a */
    private final RectF f21479a = new RectF();
    /* renamed from: b */
    private final RectF f21480b = new RectF();
    /* renamed from: c */
    private final RectF f21481c = new RectF();
    /* renamed from: d */
    private final Bitmap f21482d;
    /* renamed from: e */
    private final Paint f21483e;
    /* renamed from: f */
    private final int f21484f;
    /* renamed from: g */
    private final int f21485g;
    /* renamed from: h */
    private final RectF f21486h = new RectF();
    /* renamed from: i */
    private final Paint f21487i;
    /* renamed from: j */
    private final Matrix f21488j = new Matrix();
    /* renamed from: k */
    private final RectF f21489k = new RectF();
    /* renamed from: l */
    private TileMode f21490l = TileMode.CLAMP;
    /* renamed from: m */
    private TileMode f21491m = TileMode.CLAMP;
    /* renamed from: n */
    private boolean f21492n = true;
    /* renamed from: o */
    private float f21493o = 0.0f;
    /* renamed from: p */
    private final boolean[] f21494p = new boolean[]{true, true, true, true};
    /* renamed from: q */
    private boolean f21495q = false;
    /* renamed from: r */
    private float f21496r = 0.0f;
    /* renamed from: s */
    private ColorStateList f21497s = ColorStateList.valueOf(-16777216);
    /* renamed from: t */
    private ScaleType f21498t = ScaleType.FIT_CENTER;

    /* renamed from: com.makeramen.roundedimageview.b$1 */
    static /* synthetic */ class C57571 {
        /* renamed from: a */
        static final /* synthetic */ int[] f21478a = new int[ScaleType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = android.widget.ImageView.ScaleType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f21478a = r0;
            r0 = f21478a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f21478a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f21478a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f21478a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.widget.ImageView.ScaleType.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f21478a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = android.widget.ImageView.ScaleType.FIT_END;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = f21478a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = android.widget.ImageView.ScaleType.FIT_START;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = f21478a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.makeramen.roundedimageview.b.1.<clinit>():void");
        }
    }

    public int getOpacity() {
        return -3;
    }

    public C5758b(Bitmap bitmap) {
        this.f21482d = bitmap;
        this.f21484f = bitmap.getWidth();
        this.f21485g = bitmap.getHeight();
        this.f21481c.set(0.0f, 0.0f, (float) this.f21484f, (float) this.f21485g);
        this.f21483e = new Paint();
        this.f21483e.setStyle(Style.FILL);
        this.f21483e.setAntiAlias(true);
        this.f21487i = new Paint();
        this.f21487i.setStyle(Style.STROKE);
        this.f21487i.setAntiAlias(true);
        this.f21487i.setColor(this.f21497s.getColorForState(getState(), -16777216));
        this.f21487i.setStrokeWidth(this.f21496r);
    }

    /* renamed from: a */
    public static C5758b m25309a(Bitmap bitmap) {
        return bitmap != null ? new C5758b(bitmap) : null;
    }

    /* renamed from: a */
    public static Drawable m25308a(Drawable drawable) {
        if (drawable == null || (drawable instanceof C5758b)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), C5758b.m25308a(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        Bitmap b = C5758b.m25313b(drawable);
        if (b != null) {
            return new C5758b(b);
        }
        return drawable;
    }

    /* renamed from: b */
    public static Bitmap m25313b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap;
        try {
            createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        } catch (Drawable drawable2) {
            drawable2.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            createBitmap = null;
        }
        return createBitmap;
    }

    public boolean isStateful() {
        return this.f21497s.isStateful();
    }

    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f21497s.getColorForState(iArr, 0);
        if (this.f21487i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f21487i.setColor(colorForState);
        return 1;
    }

    /* renamed from: a */
    private void m25310a() {
        float f;
        float height;
        switch (C57571.f21478a[this.f21498t.ordinal()]) {
            case 1:
                this.f21486h.set(this.f21479a);
                this.f21486h.inset(this.f21496r / 2.0f, this.f21496r / 2.0f);
                this.f21488j.reset();
                this.f21488j.setTranslate((float) ((int) (((this.f21486h.width() - ((float) this.f21484f)) * 0.5f) + 0.5f)), (float) ((int) (((this.f21486h.height() - ((float) this.f21485g)) * 0.5f) + 0.5f)));
                break;
            case 2:
                float f2;
                this.f21486h.set(this.f21479a);
                this.f21486h.inset(this.f21496r / 2.0f, this.f21496r / 2.0f);
                this.f21488j.reset();
                f = 0.0f;
                if (((float) this.f21484f) * this.f21486h.height() > this.f21486h.width() * ((float) this.f21485g)) {
                    height = this.f21486h.height() / ((float) this.f21485g);
                    f = (this.f21486h.width() - (((float) this.f21484f) * height)) * 0.5f;
                    f2 = 0.0f;
                } else {
                    height = this.f21486h.width() / ((float) this.f21484f);
                    f2 = (this.f21486h.height() - (((float) this.f21485g) * height)) * 0.5f;
                }
                this.f21488j.setScale(height, height);
                this.f21488j.postTranslate(((float) ((int) (f + 0.5f))) + (this.f21496r / 2.0f), ((float) ((int) (f2 + 0.5f))) + (this.f21496r / 2.0f));
                break;
            case 3:
                this.f21488j.reset();
                if (((float) this.f21484f) > this.f21479a.width() || ((float) this.f21485g) > this.f21479a.height()) {
                    height = Math.min(this.f21479a.width() / ((float) this.f21484f), this.f21479a.height() / ((float) this.f21485g));
                } else {
                    height = 1.0f;
                }
                f = (float) ((int) (((this.f21479a.width() - (((float) this.f21484f) * height)) * 0.5f) + 0.5f));
                float height2 = (float) ((int) (((this.f21479a.height() - (((float) this.f21485g) * height)) * 0.5f) + 0.5f));
                this.f21488j.setScale(height, height);
                this.f21488j.postTranslate(f, height2);
                this.f21486h.set(this.f21481c);
                this.f21488j.mapRect(this.f21486h);
                this.f21486h.inset(this.f21496r / 2.0f, this.f21496r / 2.0f);
                this.f21488j.setRectToRect(this.f21481c, this.f21486h, ScaleToFit.FILL);
                break;
            case 5:
                this.f21486h.set(this.f21481c);
                this.f21488j.setRectToRect(this.f21481c, this.f21479a, ScaleToFit.END);
                this.f21488j.mapRect(this.f21486h);
                this.f21486h.inset(this.f21496r / 2.0f, this.f21496r / 2.0f);
                this.f21488j.setRectToRect(this.f21481c, this.f21486h, ScaleToFit.FILL);
                break;
            case 6:
                this.f21486h.set(this.f21481c);
                this.f21488j.setRectToRect(this.f21481c, this.f21479a, ScaleToFit.START);
                this.f21488j.mapRect(this.f21486h);
                this.f21486h.inset(this.f21496r / 2.0f, this.f21496r / 2.0f);
                this.f21488j.setRectToRect(this.f21481c, this.f21486h, ScaleToFit.FILL);
                break;
            case 7:
                this.f21486h.set(this.f21479a);
                this.f21486h.inset(this.f21496r / 2.0f, this.f21496r / 2.0f);
                this.f21488j.reset();
                this.f21488j.setRectToRect(this.f21481c, this.f21486h, ScaleToFit.FILL);
                break;
            default:
                this.f21486h.set(this.f21481c);
                this.f21488j.setRectToRect(this.f21481c, this.f21479a, ScaleToFit.CENTER);
                this.f21488j.mapRect(this.f21486h);
                this.f21486h.inset(this.f21496r / 2.0f, this.f21496r / 2.0f);
                this.f21488j.setRectToRect(this.f21481c, this.f21486h, ScaleToFit.FILL);
                break;
        }
        this.f21480b.set(this.f21486h);
    }

    protected void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f21479a.set(rect);
        m25310a();
    }

    public void draw(@NonNull Canvas canvas) {
        if (this.f21492n) {
            Shader bitmapShader = new BitmapShader(this.f21482d, this.f21490l, this.f21491m);
            if (this.f21490l == TileMode.CLAMP && this.f21491m == TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.f21488j);
            }
            this.f21483e.setShader(bitmapShader);
            this.f21492n = false;
        }
        if (this.f21495q) {
            if (this.f21496r > 0.0f) {
                canvas.drawOval(this.f21480b, this.f21483e);
                canvas.drawOval(this.f21486h, this.f21487i);
                return;
            }
            canvas.drawOval(this.f21480b, this.f21483e);
        } else if (C5758b.m25312a(this.f21494p)) {
            float f = this.f21493o;
            if (this.f21496r > 0.0f) {
                canvas.drawRoundRect(this.f21480b, f, f, this.f21483e);
                canvas.drawRoundRect(this.f21486h, f, f, this.f21487i);
                m25311a(canvas);
                m25314b(canvas);
                return;
            }
            canvas.drawRoundRect(this.f21480b, f, f, this.f21483e);
            m25311a(canvas);
        } else {
            canvas.drawRect(this.f21480b, this.f21483e);
            if (this.f21496r > 0.0f) {
                canvas.drawRect(this.f21486h, this.f21487i);
            }
        }
    }

    /* renamed from: a */
    private void m25311a(Canvas canvas) {
        if (!C5758b.m25315b(this.f21494p) && this.f21493o != 0.0f) {
            float f = this.f21480b.left;
            float f2 = this.f21480b.top;
            float width = this.f21480b.width() + f;
            float height = this.f21480b.height() + f2;
            float f3 = this.f21493o;
            if (!this.f21494p[0]) {
                this.f21489k.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.f21489k, this.f21483e);
            }
            if (!this.f21494p[1]) {
                this.f21489k.set(width - f3, f2, width, f3);
                canvas.drawRect(this.f21489k, this.f21483e);
            }
            if (!this.f21494p[2]) {
                this.f21489k.set(width - f3, height - f3, width, height);
                canvas.drawRect(this.f21489k, this.f21483e);
            }
            if (!this.f21494p[3]) {
                this.f21489k.set(f, height - f3, f3 + f, height);
                canvas.drawRect(this.f21489k, this.f21483e);
            }
        }
    }

    /* renamed from: b */
    private void m25314b(Canvas canvas) {
        if (!C5758b.m25315b(this.f21494p) && this.f21493o != 0.0f) {
            Canvas canvas2;
            float f = this.f21480b.left;
            float f2 = this.f21480b.top;
            float width = f + this.f21480b.width();
            float height = f2 + this.f21480b.height();
            float f3 = this.f21493o;
            float f4 = this.f21496r / 2.0f;
            if (!this.f21494p[0]) {
                canvas.drawLine(f - f4, f2, f + f3, f2, this.f21487i);
                canvas.drawLine(f, f2 - f4, f, f2 + f3, this.f21487i);
            }
            if (!this.f21494p[1]) {
                canvas2 = canvas;
                float f5 = width;
                canvas2.drawLine((width - f3) - f4, f2, f5, f2, this.f21487i);
                canvas2.drawLine(width, f2 - f4, f5, f2 + f3, this.f21487i);
            }
            if (!this.f21494p[2]) {
                canvas2 = canvas;
                float f6 = height;
                canvas2.drawLine((width - f3) - f4, height, width + f4, f6, this.f21487i);
                canvas2.drawLine(width, height - f3, width, f6, this.f21487i);
            }
            if (!this.f21494p[3]) {
                canvas.drawLine(f - f4, height, f + f3, height, this.f21487i);
                canvas.drawLine(f, height - f3, f, height, this.f21487i);
            }
        }
    }

    public int getAlpha() {
        return this.f21483e.getAlpha();
    }

    public void setAlpha(int i) {
        this.f21483e.setAlpha(i);
        invalidateSelf();
    }

    public ColorFilter getColorFilter() {
        return this.f21483e.getColorFilter();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f21483e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f21483e.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f21483e.setFilterBitmap(z);
        invalidateSelf();
    }

    public int getIntrinsicWidth() {
        return this.f21484f;
    }

    public int getIntrinsicHeight() {
        return this.f21485g;
    }

    /* renamed from: a */
    public C5758b m25317a(float f, float f2, float f3, float f4) {
        Set hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (hashSet.isEmpty()) {
            this.f21493o = 0.0f;
        } else {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (!(Float.isInfinite(floatValue) || Float.isNaN(floatValue))) {
                if (floatValue >= 0.0f) {
                    this.f21493o = floatValue;
                }
            }
            f2 = new StringBuilder();
            f2.append("Invalid radius value: ");
            f2.append(floatValue);
            throw new IllegalArgumentException(f2.toString());
        }
        boolean z = false;
        this.f21494p[0] = f > 0.0f ? Float.MIN_VALUE : 0.0f;
        this.f21494p[1] = f2 > 0.0f ? Float.MIN_VALUE : 0.0f;
        this.f21494p[2] = f3 > 0.0f ? Float.MIN_VALUE : 0.0f;
        f = this.f21494p;
        if (f4 > 0.0f) {
            z = true;
        }
        f[3] = z;
        return this;
    }

    /* renamed from: a */
    public C5758b m25316a(float f) {
        this.f21496r = f;
        this.f21487i.setStrokeWidth(this.f21496r);
        return this;
    }

    /* renamed from: a */
    public C5758b m25318a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(null);
        }
        this.f21497s = colorStateList;
        this.f21487i.setColor(this.f21497s.getColorForState(getState(), -16777216));
        return this;
    }

    /* renamed from: a */
    public C5758b m25321a(boolean z) {
        this.f21495q = z;
        return this;
    }

    /* renamed from: a */
    public C5758b m25320a(ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ScaleType.FIT_CENTER;
        }
        if (this.f21498t != scaleType) {
            this.f21498t = scaleType;
            m25310a();
        }
        return this;
    }

    /* renamed from: a */
    public C5758b m25319a(TileMode tileMode) {
        if (this.f21490l != tileMode) {
            this.f21490l = tileMode;
            this.f21492n = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: b */
    public C5758b m25322b(TileMode tileMode) {
        if (this.f21491m != tileMode) {
            this.f21491m = tileMode;
            this.f21492n = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: a */
    private static boolean m25312a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return 1;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m25315b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return 1;
    }
}
