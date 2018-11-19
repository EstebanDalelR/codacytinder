package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.C0443a;

/* renamed from: android.support.design.widget.c */
class C0229c extends Drawable {
    /* renamed from: a */
    final Paint f787a = new Paint(1);
    /* renamed from: b */
    final Rect f788b = new Rect();
    /* renamed from: c */
    final RectF f789c = new RectF();
    /* renamed from: d */
    float f790d;
    /* renamed from: e */
    private int f791e;
    /* renamed from: f */
    private int f792f;
    /* renamed from: g */
    private int f793g;
    /* renamed from: h */
    private int f794h;
    /* renamed from: i */
    private ColorStateList f795i;
    /* renamed from: j */
    private int f796j;
    /* renamed from: k */
    private boolean f797k = true;
    /* renamed from: l */
    private float f798l;

    public C0229c() {
        this.f787a.setStyle(Style.STROKE);
    }

    /* renamed from: a */
    void m805a(int i, int i2, int i3, int i4) {
        this.f791e = i;
        this.f792f = i2;
        this.f793g = i3;
        this.f794h = i4;
    }

    /* renamed from: a */
    void m804a(float f) {
        if (this.f790d != f) {
            this.f790d = f;
            this.f787a.setStrokeWidth(f * 1.3333f);
            this.f797k = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f797k) {
            this.f787a.setShader(m803a());
            this.f797k = false;
        }
        float strokeWidth = this.f787a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f789c;
        copyBounds(this.f788b);
        rectF.set(this.f788b);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f798l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f787a);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f790d);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(int i) {
        this.f787a.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: a */
    void m806a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f796j = colorStateList.getColorForState(getState(), this.f796j);
        }
        this.f795i = colorStateList;
        this.f797k = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f787a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f790d > 0.0f ? -3 : -2;
    }

    /* renamed from: b */
    final void m807b(float f) {
        if (f != this.f798l) {
            this.f798l = f;
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        this.f797k = true;
    }

    public boolean isStateful() {
        return (this.f795i != null && this.f795i.isStateful()) || super.isStateful();
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.f795i != null) {
            iArr = this.f795i.getColorForState(iArr, this.f796j);
            if (iArr != this.f796j) {
                this.f797k = true;
                this.f796j = iArr;
            }
        }
        if (this.f797k != null) {
            invalidateSelf();
        }
        return this.f797k;
    }

    /* renamed from: a */
    private Shader m803a() {
        Rect rect = this.f788b;
        copyBounds(rect);
        float height = this.f790d / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C0443a.m1681a(this.f791e, this.f796j), C0443a.m1681a(this.f792f, this.f796j), C0443a.m1681a(C0443a.m1688c(this.f792f, 0), this.f796j), C0443a.m1681a(C0443a.m1688c(this.f794h, 0), this.f796j), C0443a.m1681a(this.f794h, this.f796j), C0443a.m1681a(this.f793g, this.f796j)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
    }
}
