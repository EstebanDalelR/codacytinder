package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;

@RequiresApi(9)
/* renamed from: android.support.v4.graphics.drawable.b */
public abstract class C0451b extends Drawable {
    /* renamed from: a */
    final Bitmap f1496a;
    /* renamed from: b */
    final Rect f1497b = new Rect();
    /* renamed from: c */
    private int f1498c = 160;
    /* renamed from: d */
    private int f1499d = 119;
    /* renamed from: e */
    private final Paint f1500e = new Paint(3);
    /* renamed from: f */
    private final BitmapShader f1501f;
    /* renamed from: g */
    private final Matrix f1502g = new Matrix();
    /* renamed from: h */
    private float f1503h;
    /* renamed from: i */
    private final RectF f1504i = new RectF();
    /* renamed from: j */
    private boolean f1505j = true;
    /* renamed from: k */
    private boolean f1506k;
    /* renamed from: l */
    private int f1507l;
    /* renamed from: m */
    private int f1508m;

    /* renamed from: b */
    private static boolean m1733b(float f) {
        return f > 0.05f;
    }

    /* renamed from: c */
    private void m1734c() {
        this.f1507l = this.f1496a.getScaledWidth(this.f1498c);
        this.f1508m = this.f1496a.getScaledHeight(this.f1498c);
    }

    public void setFilterBitmap(boolean z) {
        this.f1500e.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f1500e.setDither(z);
        invalidateSelf();
    }

    /* renamed from: a */
    void mo459a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    void m1736a() {
        if (this.f1505j) {
            if (this.f1506k) {
                int min = Math.min(this.f1507l, this.f1508m);
                mo459a(this.f1499d, min, min, getBounds(), this.f1497b);
                int min2 = Math.min(this.f1497b.width(), this.f1497b.height());
                this.f1497b.inset(Math.max(0, (this.f1497b.width() - min2) / 2), Math.max(0, (this.f1497b.height() - min2) / 2));
                this.f1503h = ((float) min2) * 0.5f;
            } else {
                mo459a(this.f1499d, this.f1507l, this.f1508m, getBounds(), this.f1497b);
            }
            this.f1504i.set(this.f1497b);
            if (this.f1501f != null) {
                this.f1502g.setTranslate(this.f1504i.left, this.f1504i.top);
                this.f1502g.preScale(this.f1504i.width() / ((float) this.f1496a.getWidth()), this.f1504i.height() / ((float) this.f1496a.getHeight()));
                this.f1501f.setLocalMatrix(this.f1502g);
                this.f1500e.setShader(this.f1501f);
            }
            this.f1505j = false;
        }
    }

    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f1496a;
        if (bitmap != null) {
            m1736a();
            if (this.f1500e.getShader() == null) {
                canvas.drawBitmap(bitmap, null, this.f1497b, this.f1500e);
            } else {
                canvas.drawRoundRect(this.f1504i, this.f1503h, this.f1503h, this.f1500e);
            }
        }
    }

    public void setAlpha(int i) {
        if (i != this.f1500e.getAlpha()) {
            this.f1500e.setAlpha(i);
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f1500e.getAlpha();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1500e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public ColorFilter getColorFilter() {
        return this.f1500e.getColorFilter();
    }

    /* renamed from: d */
    private void m1735d() {
        this.f1503h = (float) (Math.min(this.f1508m, this.f1507l) / 2);
    }

    /* renamed from: a */
    public void m1737a(float f) {
        if (this.f1503h != f) {
            this.f1506k = false;
            if (C0451b.m1733b(f)) {
                this.f1500e.setShader(this.f1501f);
            } else {
                this.f1500e.setShader(null);
            }
            this.f1503h = f;
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f1506k != null) {
            m1735d();
        }
        this.f1505j = true;
    }

    /* renamed from: b */
    public float m1739b() {
        return this.f1503h;
    }

    public int getIntrinsicWidth() {
        return this.f1507l;
    }

    public int getIntrinsicHeight() {
        return this.f1508m;
    }

    public int getOpacity() {
        int i = -3;
        if (this.f1499d == 119) {
            if (!this.f1506k) {
                Bitmap bitmap = this.f1496a;
                if (!(bitmap == null || bitmap.hasAlpha() || this.f1500e.getAlpha() < 255)) {
                    if (!C0451b.m1733b(this.f1503h)) {
                        i = -1;
                    }
                }
                return i;
            }
        }
        return -3;
    }

    C0451b(Resources resources, Bitmap bitmap) {
        if (resources != null) {
            this.f1498c = resources.getDisplayMetrics().densityDpi;
        }
        this.f1496a = bitmap;
        if (this.f1496a != null) {
            m1734c();
            this.f1501f = new BitmapShader(this.f1496a, TileMode.CLAMP, TileMode.CLAMP);
            return;
        }
        this.f1508m = -1;
        this.f1507l = -1;
        this.f1501f = null;
    }
}
