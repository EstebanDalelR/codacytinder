package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.design.C0181a.C0172c;
import android.support.v4.content.C0432b;
import android.support.v7.graphics.drawable.DrawableWrapper;

/* renamed from: android.support.design.widget.i */
class C2781i extends DrawableWrapper {
    /* renamed from: a */
    static final double f8799a = Math.cos(Math.toRadians(45.0d));
    /* renamed from: b */
    final Paint f8800b;
    /* renamed from: c */
    final Paint f8801c;
    /* renamed from: d */
    final RectF f8802d;
    /* renamed from: e */
    float f8803e;
    /* renamed from: f */
    Path f8804f;
    /* renamed from: g */
    float f8805g;
    /* renamed from: h */
    float f8806h;
    /* renamed from: i */
    float f8807i;
    /* renamed from: j */
    float f8808j;
    /* renamed from: k */
    private boolean f8809k = true;
    /* renamed from: l */
    private final int f8810l;
    /* renamed from: m */
    private final int f8811m;
    /* renamed from: n */
    private final int f8812n;
    /* renamed from: o */
    private boolean f8813o = true;
    /* renamed from: p */
    private float f8814p;
    /* renamed from: q */
    private boolean f8815q = false;

    public int getOpacity() {
        return -3;
    }

    public C2781i(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f8810l = C0432b.m1647c(context, C0172c.design_fab_shadow_start_color);
        this.f8811m = C0432b.m1647c(context, C0172c.design_fab_shadow_mid_color);
        this.f8812n = C0432b.m1647c(context, C0172c.design_fab_shadow_end_color);
        this.f8800b = new Paint(5);
        this.f8800b.setStyle(Style.FILL);
        this.f8803e = (float) Math.round(f);
        this.f8802d = new RectF();
        this.f8801c = new Paint(this.f8800b);
        this.f8801c.setAntiAlias(false);
        m10836a(f2, f3);
    }

    /* renamed from: c */
    private static int m10833c(float f) {
        f = Math.round(f);
        return f % 2 == 1 ? f - 1 : f;
    }

    /* renamed from: a */
    public void m10837a(boolean z) {
        this.f8813o = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f8800b.setAlpha(i);
        this.f8801c.setAlpha(i);
    }

    protected void onBoundsChange(Rect rect) {
        this.f8809k = true;
    }

    /* renamed from: a */
    void m10836a(float f, float f2) {
        if (f >= 0.0f) {
            if (f2 >= 0.0f) {
                f = (float) C2781i.m10833c(f);
                f2 = (float) C2781i.m10833c(f2);
                if (f > f2) {
                    if (this.f8815q == null) {
                        this.f8815q = true;
                    }
                    f = f2;
                }
                if (this.f8808j != f || this.f8806h != f2) {
                    this.f8808j = f;
                    this.f8806h = f2;
                    this.f8807i = (float) Math.round(f * 1.5f);
                    this.f8805g = f2;
                    this.f8809k = true;
                    invalidateSelf();
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) C2781i.m10828a(this.f8806h, this.f8803e, this.f8813o));
        int ceil2 = (int) Math.ceil((double) C2781i.m10831b(this.f8806h, this.f8803e, this.f8813o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* renamed from: a */
    public static float m10828a(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f8799a) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: b */
    public static float m10831b(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f8799a) * ((double) f2))) : f;
    }

    public void draw(Canvas canvas) {
        if (this.f8809k) {
            m10830a(getBounds());
            this.f8809k = false;
        }
        m10829a(canvas);
        super.draw(canvas);
    }

    /* renamed from: a */
    final void m10835a(float f) {
        if (this.f8814p != f) {
            this.f8814p = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m10829a(Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.rotate(this.f8814p, this.f8802d.centerX(), this.f8802d.centerY());
        float f4 = (-this.f8803e) - this.f8807i;
        float f5 = this.f8803e;
        float f6 = f5 * 2.0f;
        Object obj = this.f8802d.width() - f6 > 0.0f ? 1 : null;
        Object obj2 = r0.f8802d.height() - f6 > 0.0f ? 1 : null;
        float f7 = f5 / ((r0.f8808j - (r0.f8808j * 0.5f)) + f5);
        float f8 = f5 / ((r0.f8808j - (r0.f8808j * 0.25f)) + f5);
        float f9 = f5 / ((r0.f8808j - (r0.f8808j * 1.0f)) + f5);
        int save2 = canvas.save();
        canvas2.translate(r0.f8802d.left + f5, r0.f8802d.top + f5);
        canvas2.scale(f7, f8);
        canvas2.drawPath(r0.f8804f, r0.f8800b);
        if (obj != null) {
            canvas2.scale(1.0f / f7, 1.0f);
            i = save2;
            f = f9;
            i2 = save;
            f2 = f8;
            canvas2.drawRect(0.0f, f4, r0.f8802d.width() - f6, -r0.f8803e, r0.f8801c);
        } else {
            i = save2;
            f = f9;
            i2 = save;
            f2 = f8;
        }
        canvas2.restoreToCount(i);
        i = canvas.save();
        canvas2.translate(r0.f8802d.right - f5, r0.f8802d.bottom - f5);
        f8 = f;
        canvas2.scale(f7, f8);
        canvas2.rotate(180.0f);
        canvas2.drawPath(r0.f8804f, r0.f8800b);
        if (obj != null) {
            canvas2.scale(1.0f / f7, 1.0f);
            f3 = f2;
            f2 = f8;
            canvas2.drawRect(0.0f, f4, r0.f8802d.width() - f6, (-r0.f8803e) + r0.f8807i, r0.f8801c);
        } else {
            f3 = f2;
            f2 = f8;
        }
        canvas2.restoreToCount(i);
        int save3 = canvas.save();
        canvas2.translate(r0.f8802d.left + f5, r0.f8802d.bottom - f5);
        canvas2.scale(f7, f2);
        canvas2.rotate(270.0f);
        canvas2.drawPath(r0.f8804f, r0.f8800b);
        if (obj2 != null) {
            canvas2.scale(1.0f / f2, 1.0f);
            canvas2.drawRect(0.0f, f4, r0.f8802d.height() - f6, -r0.f8803e, r0.f8801c);
        }
        canvas2.restoreToCount(save3);
        save = canvas.save();
        canvas2.translate(r0.f8802d.right - f5, r0.f8802d.top + f5);
        f5 = f3;
        canvas2.scale(f7, f5);
        canvas2.rotate(90.0f);
        canvas2.drawPath(r0.f8804f, r0.f8800b);
        if (obj2 != null) {
            canvas2.scale(1.0f / f5, 1.0f);
            canvas2.drawRect(0.0f, f4, r0.f8802d.height() - f6, -r0.f8803e, r0.f8801c);
        }
        canvas2.restoreToCount(save);
        canvas2.restoreToCount(i2);
    }

    /* renamed from: b */
    private void m10832b() {
        RectF rectF = new RectF(-this.f8803e, -this.f8803e, this.f8803e, this.f8803e);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f8807i, -this.f8807i);
        if (this.f8804f == null) {
            r0.f8804f = new Path();
        } else {
            r0.f8804f.reset();
        }
        r0.f8804f.setFillType(FillType.EVEN_ODD);
        r0.f8804f.moveTo(-r0.f8803e, 0.0f);
        r0.f8804f.rLineTo(-r0.f8807i, 0.0f);
        r0.f8804f.arcTo(rectF2, 180.0f, 90.0f, false);
        r0.f8804f.arcTo(rectF, 270.0f, -90.0f, false);
        r0.f8804f.close();
        float f = -rectF2.top;
        if (f > 0.0f) {
            float f2 = r0.f8803e / f;
            float f3 = ((1.0f - f2) / 2.0f) + f2;
            Shader shader = r8;
            float[] fArr = new float[]{0.0f, f2, f3, 1.0f};
            Paint paint = r0.f8800b;
            Shader radialGradient = new RadialGradient(0.0f, 0.0f, f, new int[]{0, r0.f8810l, r0.f8811m, r0.f8812n}, fArr, TileMode.CLAMP);
            paint.setShader(shader);
        }
        Paint paint2 = r0.f8801c;
        float f4 = rectF.top;
        paint2.setShader(new LinearGradient(0.0f, f4, 0.0f, rectF2.top, new int[]{r0.f8810l, r0.f8811m, r0.f8812n}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        r0.f8801c.setAntiAlias(false);
    }

    /* renamed from: a */
    private void m10830a(Rect rect) {
        float f = this.f8806h * 1.5f;
        this.f8802d.set(((float) rect.left) + this.f8806h, ((float) rect.top) + f, ((float) rect.right) - this.f8806h, ((float) rect.bottom) - f);
        getWrappedDrawable().setBounds((int) this.f8802d.left, (int) this.f8802d.top, (int) this.f8802d.right, (int) this.f8802d.bottom);
        m10832b();
    }

    /* renamed from: b */
    public void m10838b(float f) {
        m10836a(f, this.f8806h);
    }

    /* renamed from: a */
    public float m10834a() {
        return this.f8808j;
    }
}
