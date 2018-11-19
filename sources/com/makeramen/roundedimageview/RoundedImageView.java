package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.makeramen.roundedimageview.C5756a.C5755a;

public class RoundedImageView extends ImageView {
    /* renamed from: a */
    public static final TileMode f21461a = TileMode.CLAMP;
    /* renamed from: b */
    static final /* synthetic */ boolean f21462b = true;
    /* renamed from: c */
    private static final ScaleType[] f21463c = new ScaleType[]{ScaleType.MATRIX, ScaleType.FIT_XY, ScaleType.FIT_START, ScaleType.FIT_CENTER, ScaleType.FIT_END, ScaleType.CENTER, ScaleType.CENTER_CROP, ScaleType.CENTER_INSIDE};
    /* renamed from: d */
    private final float[] f21464d;
    /* renamed from: e */
    private Drawable f21465e;
    /* renamed from: f */
    private ColorStateList f21466f;
    /* renamed from: g */
    private float f21467g;
    /* renamed from: h */
    private ColorFilter f21468h;
    /* renamed from: i */
    private boolean f21469i;
    /* renamed from: j */
    private Drawable f21470j;
    /* renamed from: k */
    private boolean f21471k;
    /* renamed from: l */
    private boolean f21472l;
    /* renamed from: m */
    private boolean f21473m;
    /* renamed from: n */
    private int f21474n;
    /* renamed from: o */
    private ScaleType f21475o;
    /* renamed from: p */
    private TileMode f21476p;
    /* renamed from: q */
    private TileMode f21477q;

    /* renamed from: com.makeramen.roundedimageview.RoundedImageView$1 */
    static /* synthetic */ class C57541 {
        /* renamed from: a */
        static final /* synthetic */ int[] f21460a = new int[ScaleType.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = android.widget.ImageView.ScaleType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f21460a = r0;
            r0 = f21460a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.widget.ImageView.ScaleType.CENTER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f21460a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.widget.ImageView.ScaleType.CENTER_CROP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f21460a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f21460a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.widget.ImageView.ScaleType.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f21460a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = android.widget.ImageView.ScaleType.FIT_START;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = f21460a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = android.widget.ImageView.ScaleType.FIT_END;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = f21460a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.makeramen.roundedimageview.RoundedImageView.1.<clinit>():void");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RoundedImageView(android.content.Context r1) {
        /*
        r0 = this;
        r0.<init>(r1);
        r1 = 4;
        r1 = new float[r1];
        r1 = {0, 0, 0, 0};
        r0.f21464d = r1;
        r1 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1 = android.content.res.ColorStateList.valueOf(r1);
        r0.f21466f = r1;
        r1 = 0;
        r0.f21467g = r1;
        r1 = 0;
        r0.f21468h = r1;
        r1 = 0;
        r0.f21469i = r1;
        r0.f21471k = r1;
        r0.f21472l = r1;
        r0.f21473m = r1;
        r1 = android.widget.ImageView.ScaleType.FIT_CENTER;
        r0.f21475o = r1;
        r1 = f21461a;
        r0.f21476p = r1;
        r1 = f21461a;
        r0.f21477q = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.makeramen.roundedimageview.RoundedImageView.<init>(android.content.Context):void");
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        this.f21464d = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f21466f = ColorStateList.valueOf(-16777216);
        this.f21467g = 0.0f;
        this.f21468h = null;
        this.f21469i = false;
        this.f21471k = false;
        this.f21472l = false;
        this.f21473m = false;
        this.f21475o = ScaleType.FIT_CENTER;
        this.f21476p = f21461a;
        this.f21477q = f21461a;
        context = context.obtainStyledAttributes(attributeSet, C5755a.RoundedImageView, i, 0);
        attributeSet = context.getInt(C5755a.RoundedImageView_android_scaleType, -1);
        if (attributeSet >= null) {
            setScaleType(f21463c[attributeSet]);
        } else {
            setScaleType(ScaleType.FIT_CENTER);
        }
        attributeSet = (float) context.getDimensionPixelSize(C5755a.RoundedImageView_riv_corner_radius, -1);
        this.f21464d[0] = (float) context.getDimensionPixelSize(C5755a.RoundedImageView_riv_corner_radius_top_left, -1);
        this.f21464d[1] = (float) context.getDimensionPixelSize(C5755a.RoundedImageView_riv_corner_radius_top_right, -1);
        this.f21464d[2] = (float) context.getDimensionPixelSize(C5755a.RoundedImageView_riv_corner_radius_bottom_right, -1);
        this.f21464d[3] = (float) context.getDimensionPixelSize(C5755a.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = this.f21464d.length;
        Object obj = null;
        for (i2 = 0; i2 < length; i2++) {
            if (this.f21464d[i2] < 0.0f) {
                this.f21464d[i2] = 0.0f;
            } else {
                obj = 1;
            }
        }
        if (obj == null) {
            if (attributeSet < null) {
                attributeSet = null;
            }
            length = this.f21464d.length;
            for (i2 = 0; i2 < length; i2++) {
                this.f21464d[i2] = attributeSet;
            }
        }
        this.f21467g = (float) context.getDimensionPixelSize(C5755a.RoundedImageView_riv_border_width, -1);
        if (this.f21467g < null) {
            this.f21467g = 0.0f;
        }
        this.f21466f = context.getColorStateList(C5755a.RoundedImageView_riv_border_color);
        if (this.f21466f == null) {
            this.f21466f = ColorStateList.valueOf(-16777216);
        }
        this.f21473m = context.getBoolean(C5755a.RoundedImageView_riv_mutate_background, false);
        this.f21472l = context.getBoolean(C5755a.RoundedImageView_riv_oval, false);
        int i3 = context.getInt(C5755a.RoundedImageView_riv_tile_mode, -2);
        if (i3 != -2) {
            setTileModeX(m25301a(i3));
            setTileModeY(m25301a(i3));
        }
        i3 = context.getInt(C5755a.RoundedImageView_riv_tile_mode_x, -2);
        if (i3 != -2) {
            setTileModeX(m25301a(i3));
        }
        i3 = context.getInt(C5755a.RoundedImageView_riv_tile_mode_y, -2);
        if (i3 != -2) {
            setTileModeY(m25301a(i3));
        }
        m25305b();
        m25304a((boolean) f21462b);
        context.recycle();
    }

    /* renamed from: a */
    private static TileMode m25301a(int i) {
        switch (i) {
            case 0:
                return TileMode.CLAMP;
            case 1:
                return TileMode.REPEAT;
            case 2:
                return TileMode.MIRROR;
            default:
                return 0;
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public ScaleType getScaleType() {
        return this.f21475o;
    }

    public void setScaleType(ScaleType scaleType) {
        if (!f21462b && scaleType == null) {
            throw new AssertionError();
        } else if (this.f21475o != scaleType) {
            this.f21475o = scaleType;
            switch (C57541.f21460a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            m25305b();
            m25304a((boolean) null);
            invalidate();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        this.f21474n = 0;
        this.f21470j = C5758b.m25308a(drawable);
        m25305b();
        super.setImageDrawable(this.f21470j);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f21474n = 0;
        this.f21470j = C5758b.m25309a(bitmap);
        m25305b();
        super.setImageDrawable(this.f21470j);
    }

    public void setImageResource(@DrawableRes int i) {
        if (this.f21474n != i) {
            this.f21474n = i;
            this.f21470j = m25302a();
            m25305b();
            super.setImageDrawable(this.f21470j);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    /* renamed from: a */
    private Drawable m25302a() {
        Resources resources = getResources();
        if (resources == null) {
            return null;
        }
        Drawable drawable;
        if (this.f21474n != 0) {
            try {
                drawable = resources.getDrawable(this.f21474n);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to find resource: ");
                stringBuilder.append(this.f21474n);
                Log.w("RoundedImageView", stringBuilder.toString(), e);
                this.f21474n = 0;
            }
            return C5758b.m25308a(drawable);
        }
        drawable = null;
        return C5758b.m25308a(drawable);
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    /* renamed from: b */
    private void m25305b() {
        m25303a(this.f21470j);
    }

    /* renamed from: a */
    private void m25304a(boolean z) {
        if (this.f21473m) {
            if (z) {
                this.f21465e = C5758b.m25308a(this.f21465e);
            }
            m25303a(this.f21465e);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f21468h != colorFilter) {
            this.f21468h = colorFilter;
            this.f21471k = f21462b;
            this.f21469i = f21462b;
            m25306c();
            invalidate();
        }
    }

    /* renamed from: c */
    private void m25306c() {
        if (this.f21470j != null && this.f21469i) {
            this.f21470j = this.f21470j.mutate();
            if (this.f21471k) {
                this.f21470j.setColorFilter(this.f21468h);
            }
        }
    }

    /* renamed from: a */
    private void m25303a(Drawable drawable) {
        if (drawable != null) {
            int i = 0;
            if (drawable instanceof C5758b) {
                C5758b c5758b = (C5758b) drawable;
                c5758b.m25320a(this.f21475o).m25316a(this.f21467g).m25318a(this.f21466f).m25321a(this.f21472l).m25319a(this.f21476p).m25322b(this.f21477q);
                if (this.f21464d != null) {
                    c5758b.m25317a(this.f21464d[0], this.f21464d[1], this.f21464d[2], this.f21464d[3]);
                }
                m25306c();
            } else if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                while (i < numberOfLayers) {
                    m25303a(layerDrawable.getDrawable(i));
                    i++;
                }
            }
        }
    }

    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f21465e = drawable;
        m25304a((boolean) f21462b);
        super.setBackgroundDrawable(this.f21465e);
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float max : this.f21464d) {
            f = Math.max(max, f);
        }
        return f;
    }

    public void setCornerRadiusDimen(@DimenRes int i) {
        i = getResources().getDimension(i);
        m25307a(i, i, i, i);
    }

    public void setCornerRadius(float f) {
        m25307a(f, f, f, f);
    }

    /* renamed from: a */
    public void m25307a(float f, float f2, float f3, float f4) {
        if (this.f21464d[0] != f || this.f21464d[1] != f2 || this.f21464d[2] != f4 || this.f21464d[3] != f3) {
            this.f21464d[0] = f;
            this.f21464d[1] = f2;
            this.f21464d[3] = f3;
            this.f21464d[2] = f4;
            m25305b();
            m25304a(false);
            invalidate();
        }
    }

    public float getBorderWidth() {
        return this.f21467g;
    }

    public void setBorderWidth(@DimenRes int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderWidth(float f) {
        if (this.f21467g != f) {
            this.f21467g = f;
            m25305b();
            m25304a((boolean) 0.0f);
            invalidate();
        }
    }

    @ColorInt
    public int getBorderColor() {
        return this.f21466f.getDefaultColor();
    }

    public void setBorderColor(@ColorInt int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public ColorStateList getBorderColors() {
        return this.f21466f;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (!this.f21466f.equals(colorStateList)) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(-16777216);
            }
            this.f21466f = colorStateList;
            m25305b();
            m25304a((boolean) null);
            if (this.f21467g > 0.0f) {
                invalidate();
            }
        }
    }

    public void setOval(boolean z) {
        this.f21472l = z;
        m25305b();
        m25304a(false);
        invalidate();
    }

    public TileMode getTileModeX() {
        return this.f21476p;
    }

    public void setTileModeX(TileMode tileMode) {
        if (this.f21476p != tileMode) {
            this.f21476p = tileMode;
            m25305b();
            m25304a((boolean) null);
            invalidate();
        }
    }

    public TileMode getTileModeY() {
        return this.f21477q;
    }

    public void setTileModeY(TileMode tileMode) {
        if (this.f21477q != tileMode) {
            this.f21477q = tileMode;
            m25305b();
            m25304a((boolean) null);
            invalidate();
        }
    }
}
