package android.support.v4.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0561l;
import android.support.v4.view.p011a.C2890b;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable extends Drawable implements Animatable {
    /* renamed from: a */
    private static final Interpolator f1844a = new LinearInterpolator();
    /* renamed from: b */
    private static final Interpolator f1845b = new C2890b();
    /* renamed from: c */
    private static final int[] f1846c = new int[]{-16777216};
    /* renamed from: d */
    private final C0613a f1847d = new C0613a();
    /* renamed from: e */
    private float f1848e;
    /* renamed from: f */
    private Resources f1849f;
    /* renamed from: g */
    private Animator f1850g;
    /* renamed from: h */
    private float f1851h;
    /* renamed from: i */
    private boolean f1852i;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    /* renamed from: android.support.v4.widget.CircularProgressDrawable$a */
    private static class C0613a {
        /* renamed from: a */
        final RectF f1823a = new RectF();
        /* renamed from: b */
        final Paint f1824b = new Paint();
        /* renamed from: c */
        final Paint f1825c = new Paint();
        /* renamed from: d */
        final Paint f1826d = new Paint();
        /* renamed from: e */
        float f1827e = 0.0f;
        /* renamed from: f */
        float f1828f = 0.0f;
        /* renamed from: g */
        float f1829g = 0.0f;
        /* renamed from: h */
        float f1830h = 5.0f;
        /* renamed from: i */
        int[] f1831i;
        /* renamed from: j */
        int f1832j;
        /* renamed from: k */
        float f1833k;
        /* renamed from: l */
        float f1834l;
        /* renamed from: m */
        float f1835m;
        /* renamed from: n */
        boolean f1836n;
        /* renamed from: o */
        Path f1837o;
        /* renamed from: p */
        float f1838p = 1.0f;
        /* renamed from: q */
        float f1839q;
        /* renamed from: r */
        int f1840r;
        /* renamed from: s */
        int f1841s;
        /* renamed from: t */
        int f1842t = 255;
        /* renamed from: u */
        int f1843u;

        C0613a() {
            this.f1824b.setStrokeCap(Cap.SQUARE);
            this.f1824b.setAntiAlias(true);
            this.f1824b.setStyle(Style.STROKE);
            this.f1825c.setStyle(Style.FILL);
            this.f1825c.setAntiAlias(true);
            this.f1826d.setColor(0);
        }

        /* renamed from: a */
        void m2397a(float f, float f2) {
            this.f1840r = (int) f;
            this.f1841s = (int) f2;
        }

        /* renamed from: a */
        void m2400a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1823a;
            float f = this.f1839q + (this.f1830h / 2.0f);
            if (this.f1839q <= 0.0f) {
                f = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f1840r) * this.f1838p) / 2.0f, this.f1830h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f, ((float) rect.centerY()) - f, ((float) rect.centerX()) + f, ((float) rect.centerY()) + f);
            rect = (this.f1827e + this.f1829g) * 1135869952;
            float f2 = ((this.f1828f + this.f1829g) * 360.0f) - rect;
            this.f1824b.setColor(this.f1843u);
            this.f1824b.setAlpha(this.f1842t);
            f = this.f1830h / 2.0f;
            rectF.inset(f, f);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1826d);
            f = -f;
            rectF.inset(f, f);
            canvas.drawArc(rectF, rect, f2, false, this.f1824b);
            m2399a(canvas, rect, f2, rectF);
        }

        /* renamed from: a */
        void m2399a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f1836n) {
                if (this.f1837o == null) {
                    this.f1837o = new Path();
                    this.f1837o.setFillType(FillType.EVEN_ODD);
                } else {
                    this.f1837o.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f1840r) * this.f1838p) / 2.0f;
                this.f1837o.moveTo(0.0f, 0.0f);
                this.f1837o.lineTo(((float) this.f1840r) * this.f1838p, 0.0f);
                this.f1837o.lineTo((((float) this.f1840r) * this.f1838p) / 2.0f, ((float) this.f1841s) * this.f1838p);
                this.f1837o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f1830h / 2.0f));
                this.f1837o.close();
                this.f1825c.setColor(this.f1843u);
                this.f1825c.setAlpha(this.f1842t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f1837o, this.f1825c);
                canvas.restore();
            }
        }

        /* renamed from: a */
        void m2403a(@NonNull int[] iArr) {
            this.f1831i = iArr;
            m2406b((int) null);
        }

        /* renamed from: a */
        void m2398a(int i) {
            this.f1843u = i;
        }

        /* renamed from: b */
        void m2406b(int i) {
            this.f1832j = i;
            this.f1843u = this.f1831i[this.f1832j];
        }

        /* renamed from: a */
        int m2395a() {
            return this.f1831i[m2404b()];
        }

        /* renamed from: b */
        int m2404b() {
            return (this.f1832j + 1) % this.f1831i.length;
        }

        /* renamed from: c */
        void m2407c() {
            m2406b(m2404b());
        }

        /* renamed from: a */
        void m2401a(ColorFilter colorFilter) {
            this.f1824b.setColorFilter(colorFilter);
        }

        /* renamed from: c */
        void m2409c(int i) {
            this.f1842t = i;
        }

        /* renamed from: d */
        int m2410d() {
            return this.f1842t;
        }

        /* renamed from: a */
        void m2396a(float f) {
            this.f1830h = f;
            this.f1824b.setStrokeWidth(f);
        }

        /* renamed from: b */
        void m2405b(float f) {
            this.f1827e = f;
        }

        /* renamed from: e */
        float m2412e() {
            return this.f1827e;
        }

        /* renamed from: f */
        float m2414f() {
            return this.f1833k;
        }

        /* renamed from: g */
        float m2416g() {
            return this.f1834l;
        }

        /* renamed from: h */
        int m2417h() {
            return this.f1831i[this.f1832j];
        }

        /* renamed from: c */
        void m2408c(float f) {
            this.f1828f = f;
        }

        /* renamed from: i */
        float m2418i() {
            return this.f1828f;
        }

        /* renamed from: d */
        void m2411d(float f) {
            this.f1829g = f;
        }

        /* renamed from: e */
        void m2413e(float f) {
            this.f1839q = f;
        }

        /* renamed from: a */
        void m2402a(boolean z) {
            if (this.f1836n != z) {
                this.f1836n = z;
            }
        }

        /* renamed from: f */
        void m2415f(float f) {
            if (f != this.f1838p) {
                this.f1838p = f;
            }
        }

        /* renamed from: j */
        float m2419j() {
            return this.f1835m;
        }

        /* renamed from: k */
        void m2420k() {
            this.f1833k = this.f1827e;
            this.f1834l = this.f1828f;
            this.f1835m = this.f1829g;
        }

        /* renamed from: l */
        void m2421l() {
            this.f1833k = 0.0f;
            this.f1834l = 0.0f;
            this.f1835m = 0.0f;
            m2405b(0.0f);
            m2408c(0.0f);
            m2411d(0.0f);
        }
    }

    /* renamed from: a */
    private int m2423a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        i &= 255;
        return ((((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16)) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8)) | (i + ((int) (f * ((float) ((i2 & 255) - i)))));
    }

    public int getOpacity() {
        return -3;
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.f1849f = ((Context) C0561l.m2061a(context)).getResources();
        this.f1847d.m2403a(f1846c);
        m2435a(2.5f);
        m2424a();
    }

    /* renamed from: a */
    private void m2425a(float f, float f2, float f3, float f4) {
        C0613a c0613a = this.f1847d;
        float f5 = this.f1849f.getDisplayMetrics().density;
        c0613a.m2396a(f2 * f5);
        c0613a.m2413e(f * f5);
        c0613a.m2406b((int) 0.0f);
        c0613a.m2397a(f3 * f5, f4 * f5);
    }

    /* renamed from: a */
    public void m2437a(int i) {
        if (i == 0) {
            m2425a((float) 1093664768, 3.0f, 12.0f, 6.0f);
        } else {
            m2425a((float) 1089470464, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public void m2435a(float f) {
        this.f1847d.m2396a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m2438a(boolean z) {
        this.f1847d.m2402a(z);
        invalidateSelf();
    }

    /* renamed from: b */
    public void m2440b(float f) {
        this.f1847d.m2415f(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m2436a(float f, float f2) {
        this.f1847d.m2405b(f);
        this.f1847d.m2408c(f2);
        invalidateSelf();
    }

    /* renamed from: c */
    public void m2441c(float f) {
        this.f1847d.m2411d(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void m2439a(@NonNull int... iArr) {
        this.f1847d.m2403a(iArr);
        this.f1847d.m2406b(0);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1848e, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1847d.m2400a(canvas, bounds);
        canvas.restore();
    }

    public void setAlpha(int i) {
        this.f1847d.m2409c(i);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f1847d.m2410d();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1847d.m2401a(colorFilter);
        invalidateSelf();
    }

    /* renamed from: d */
    private void m2434d(float f) {
        this.f1848e = f;
    }

    public boolean isRunning() {
        return this.f1850g.isRunning();
    }

    public void start() {
        this.f1850g.cancel();
        this.f1847d.m2420k();
        if (this.f1847d.m2418i() != this.f1847d.m2412e()) {
            this.f1852i = true;
            this.f1850g.setDuration(666);
            this.f1850g.start();
            return;
        }
        this.f1847d.m2406b(0);
        this.f1847d.m2421l();
        this.f1850g.setDuration(1332);
        this.f1850g.start();
    }

    public void stop() {
        this.f1850g.cancel();
        m2434d(0.0f);
        this.f1847d.m2402a(false);
        this.f1847d.m2406b(0);
        this.f1847d.m2421l();
        invalidateSelf();
    }

    /* renamed from: a */
    private void m2426a(float f, C0613a c0613a) {
        if (f > 0.75f) {
            c0613a.m2398a(m2423a((f - 0.75f) / 0.25f, c0613a.m2417h(), c0613a.m2395a()));
        } else {
            c0613a.m2398a(c0613a.m2417h());
        }
    }

    /* renamed from: b */
    private void m2433b(float f, C0613a c0613a) {
        m2426a(f, c0613a);
        float floor = (float) (Math.floor((double) (c0613a.m2419j() / 0.8f)) + 1.0d);
        c0613a.m2405b(c0613a.m2414f() + (((c0613a.m2416g() - 0.01f) - c0613a.m2414f()) * f));
        c0613a.m2408c(c0613a.m2416g());
        c0613a.m2411d(c0613a.m2419j() + ((floor - c0613a.m2419j()) * f));
    }

    /* renamed from: a */
    private void m2427a(float f, C0613a c0613a, boolean z) {
        if (this.f1852i) {
            m2433b(f, c0613a);
        } else if (f != 1.0f || z) {
            float f2;
            float f3;
            z = c0613a.m2419j();
            if (f < 0.5f) {
                f2 = f / 0.5f;
                f3 = c0613a.m2414f();
                float f4 = f3;
                f3 = ((f1845b.getInterpolation(f2) * 0.79f) + 0.01f) + f3;
                f2 = f4;
            } else {
                f3 = c0613a.m2414f() + 0.79f;
                f2 = f3 - (((1.0f - f1845b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            z += 0.20999998f * f;
            f = (f + this.f1851h) * 216.0f;
            c0613a.m2405b(f2);
            c0613a.m2408c(f3);
            c0613a.m2411d(z);
            m2434d(f);
        }
    }

    /* renamed from: a */
    private void m2424a() {
        final C0613a c0613a = this.f1847d;
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener(this) {
            /* renamed from: b */
            final /* synthetic */ CircularProgressDrawable f1820b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                this.f1820b.m2426a(floatValue, c0613a);
                this.f1820b.m2427a(floatValue, c0613a, false);
                this.f1820b.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1844a);
        ofFloat.addListener(new AnimatorListener(this) {
            /* renamed from: b */
            final /* synthetic */ CircularProgressDrawable f1822b;

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                this.f1822b.f1851h = 0.0f;
            }

            public void onAnimationRepeat(Animator animator) {
                this.f1822b.m2427a(1.0f, c0613a, true);
                c0613a.m2420k();
                c0613a.m2407c();
                if (this.f1822b.f1852i) {
                    this.f1822b.f1852i = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    c0613a.m2402a(false);
                    return;
                }
                this.f1822b.f1851h = this.f1822b.f1851h + 1.0f;
            }
        });
        this.f1850g = ofFloat;
    }
}
