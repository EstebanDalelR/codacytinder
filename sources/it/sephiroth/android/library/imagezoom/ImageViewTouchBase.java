package it.sephiroth.android.library.imagezoom;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import it.sephiroth.android.library.imagezoom.graphics.C17534a;
import it.sephiroth.android.library.imagezoom.utils.IDisposable;

public abstract class ImageViewTouchBase extends ImageView implements IDisposable {
    /* renamed from: l */
    protected static boolean f54170l = false;
    /* renamed from: A */
    protected int f54171A;
    /* renamed from: B */
    protected int f54172B;
    /* renamed from: C */
    protected int f54173C;
    /* renamed from: D */
    protected PointF f54174D;
    /* renamed from: E */
    protected RectF f54175E;
    /* renamed from: F */
    protected RectF f54176F;
    /* renamed from: G */
    protected RectF f54177G;
    /* renamed from: H */
    protected PointF f54178H;
    /* renamed from: I */
    protected RectF f54179I;
    /* renamed from: J */
    protected RectF f54180J;
    /* renamed from: a */
    private Animator f54181a;
    /* renamed from: b */
    private OnDrawableChangeListener f54182b;
    /* renamed from: c */
    private OnLayoutChangeListener f54183c;
    /* renamed from: m */
    protected Matrix f54184m;
    /* renamed from: n */
    protected Matrix f54185n;
    /* renamed from: o */
    protected Matrix f54186o;
    /* renamed from: p */
    protected Runnable f54187p;
    /* renamed from: q */
    protected boolean f54188q;
    /* renamed from: r */
    protected float f54189r;
    /* renamed from: s */
    protected float f54190s;
    /* renamed from: t */
    protected boolean f54191t;
    /* renamed from: u */
    protected boolean f54192u;
    /* renamed from: v */
    protected final Matrix f54193v;
    /* renamed from: w */
    protected final float[] f54194w;
    /* renamed from: x */
    protected DisplayType f54195x;
    /* renamed from: y */
    protected boolean f54196y;
    /* renamed from: z */
    protected boolean f54197z;

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouchBase$3 */
    class C157623 implements AnimatorListener {
        /* renamed from: a */
        final /* synthetic */ ImageViewTouchBase f48698a;

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        C157623(ImageViewTouchBase imageViewTouchBase) {
            this.f48698a = imageViewTouchBase;
        }

        public void onAnimationEnd(Animator animator) {
            animator = this.f48698a.m63769a(this.f48698a.f54185n, true, true);
            if (animator.left != 0.0f || animator.top != 0.0f) {
                this.f48698a.m63786b(animator.left, animator.top);
            }
        }
    }

    public enum DisplayType {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER,
        FIT_HEIGHT,
        FIT_WIDTH
    }

    public interface OnDrawableChangeListener {
        void onDrawableChanged(Drawable drawable);
    }

    public interface OnLayoutChangeListener {
        void onLayoutChanged(boolean z, int i, int i2, int i3, int i4);
    }

    /* renamed from: a */
    protected void m63780a(RectF rectF, PointF pointF) {
        if (rectF != null) {
        }
    }

    /* renamed from: b */
    protected void m63785b(float f) {
    }

    /* renamed from: f */
    protected void m63801f() {
    }

    @SuppressLint({"Override"})
    public float getRotation() {
        return 0.0f;
    }

    public ImageViewTouchBase(Context context) {
        this(context, null);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54184m = new Matrix();
        this.f54185n = new Matrix();
        this.f54187p = null;
        this.f54188q = false;
        this.f54189r = -1.0f;
        this.f54190s = -1.0f;
        this.f54193v = new Matrix();
        this.f54194w = new float[9];
        this.f54195x = DisplayType.FIT_IF_BIGGER;
        this.f54174D = new PointF();
        this.f54175E = new RectF();
        this.f54176F = new RectF();
        this.f54177G = new RectF();
        this.f54178H = new PointF();
        this.f54179I = new RectF();
        this.f54180J = new RectF();
        mo13595a(context, attributeSet, i);
    }

    public boolean getBitmapChanged() {
        return this.f54197z;
    }

    public void setOnDrawableChangedListener(OnDrawableChangeListener onDrawableChangeListener) {
        this.f54182b = onDrawableChangeListener;
    }

    public void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
        this.f54183c = onLayoutChangeListener;
    }

    /* renamed from: a */
    protected void mo13595a(Context context, AttributeSet attributeSet, int i) {
        context = ViewConfiguration.get(context);
        this.f54172B = context.getScaledMinimumFlingVelocity();
        this.f54173C = context.getScaledMaximumFlingVelocity();
        this.f54171A = getResources().getInteger(17694720);
        setScaleType(ScaleType.MATRIX);
    }

    /* renamed from: c */
    public void m63793c() {
        setImageBitmap(null);
    }

    public void setDisplayType(DisplayType displayType) {
        if (displayType != this.f54195x) {
            if (f54170l) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("setDisplayType: ");
                stringBuilder.append(displayType);
                Log.i("ImageViewTouchBase", stringBuilder.toString());
            }
            this.f54188q = false;
            this.f54195x = displayType;
            this.f54196y = true;
            requestLayout();
        }
    }

    public DisplayType getDisplayType() {
        return this.f54195x;
    }

    protected void setMinScale(float f) {
        if (f54170l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setMinZoom: ");
            stringBuilder.append(f);
            Log.d("ImageViewTouchBase", stringBuilder.toString());
        }
        this.f54190s = f;
    }

    protected void setMaxScale(float f) {
        if (f54170l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setMaxZoom: ");
            stringBuilder.append(f);
            Log.d("ImageViewTouchBase", stringBuilder.toString());
        }
        this.f54189r = f;
    }

    /* renamed from: a */
    protected void m63773a(float f, float f2, float f3, float f4) {
        this.f54179I.set(f, f2, f3, f4);
        this.f54174D.x = this.f54179I.centerX();
        this.f54174D.y = this.f54179I.centerY();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float height;
        ImageViewTouchBase imageViewTouchBase = this;
        boolean z2 = z;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (f54170l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onLayout: ");
            stringBuilder.append(z2);
            stringBuilder.append(", bitmapChanged: ");
            stringBuilder.append(imageViewTouchBase.f54197z);
            stringBuilder.append(", scaleChanged: ");
            stringBuilder.append(imageViewTouchBase.f54196y);
            Log.e("ImageViewTouchBase", stringBuilder.toString());
        }
        float f = 0.0f;
        if (z2) {
            imageViewTouchBase.f54180J.set(imageViewTouchBase.f54179I);
            m63773a((float) i5, (float) i6, (float) i7, (float) i8);
            f = imageViewTouchBase.f54179I.width() - imageViewTouchBase.f54180J.width();
            height = imageViewTouchBase.f54179I.height() - imageViewTouchBase.f54180J.height();
        } else {
            height = 0.0f;
        }
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = imageViewTouchBase.f54187p;
        if (runnable != null) {
            imageViewTouchBase.f54187p = null;
            runnable.run();
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            if (imageViewTouchBase.f54197z) {
                m63790b(drawable);
            }
            if (z2 || imageViewTouchBase.f54197z || imageViewTouchBase.f54196y) {
                mo13594a(i5, i6, i7, i8);
            }
            if (imageViewTouchBase.f54197z) {
                z2 = false;
                imageViewTouchBase.f54197z = false;
            } else {
                z2 = false;
            }
            if (imageViewTouchBase.f54196y) {
                imageViewTouchBase.f54196y = z2;
            }
        } else if (z2 || imageViewTouchBase.f54196y || imageViewTouchBase.f54197z) {
            float f2;
            float f3;
            StringBuilder stringBuilder2;
            StringBuilder stringBuilder3;
            if (imageViewTouchBase.f54197z) {
                imageViewTouchBase.f54188q = false;
                imageViewTouchBase.f54184m.reset();
                if (!imageViewTouchBase.f54192u) {
                    imageViewTouchBase.f54190s = -1.0f;
                }
                if (!imageViewTouchBase.f54191t) {
                    imageViewTouchBase.f54189r = -1.0f;
                }
            }
            float a = m63767a(getDisplayType());
            float f4 = m63800f(imageViewTouchBase.f54184m);
            float scale = getScale();
            float min = Math.min(1.0f, 1.0f / f4);
            m63783a(drawable, imageViewTouchBase.f54184m, imageViewTouchBase.f54179I);
            float f5 = m63800f(imageViewTouchBase.f54184m);
            if (f54170l) {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("old matrix scale: ");
                stringBuilder4.append(f4);
                Log.d("ImageViewTouchBase", stringBuilder4.toString());
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append("new matrix scale: ");
                stringBuilder4.append(f5);
                Log.d("ImageViewTouchBase", stringBuilder4.toString());
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append("old min scale: ");
                stringBuilder4.append(min);
                Log.d("ImageViewTouchBase", stringBuilder4.toString());
                stringBuilder4 = new StringBuilder();
                stringBuilder4.append("old scale: ");
                stringBuilder4.append(scale);
                Log.d("ImageViewTouchBase", stringBuilder4.toString());
            }
            if (!imageViewTouchBase.f54197z) {
                if (!imageViewTouchBase.f54196y) {
                    if (z2) {
                        if (imageViewTouchBase.f54192u) {
                            f2 = -1.0f;
                        } else {
                            f2 = -1.0f;
                            imageViewTouchBase.f54190s = -1.0f;
                        }
                        if (!imageViewTouchBase.f54191t) {
                            imageViewTouchBase.f54189r = f2;
                        }
                        setImageMatrix(getImageViewMatrix());
                        m63772a(-f, -height);
                        if (imageViewTouchBase.f54188q) {
                            f3 = Math.abs(scale - min) > 0.1f ? (f4 / f5) * scale : 1.0f;
                            if (f54170l) {
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("userScaled. scale=");
                                stringBuilder2.append(f3);
                                Log.v("ImageViewTouchBase", stringBuilder2.toString());
                            }
                            m63771a(f3);
                        } else {
                            f2 = m63767a(getDisplayType());
                            if (f54170l) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("!userScaled. scale=");
                                stringBuilder.append(f2);
                                Log.v("ImageViewTouchBase", stringBuilder.toString());
                            }
                            m63771a(f2);
                            f3 = f2;
                        }
                        if (f54170l) {
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("old min scale: ");
                            stringBuilder2.append(a);
                            Log.d("ImageViewTouchBase", stringBuilder2.toString());
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("old scale: ");
                            stringBuilder2.append(scale);
                            Log.d("ImageViewTouchBase", stringBuilder2.toString());
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("new scale: ");
                            stringBuilder2.append(f3);
                            Log.d("ImageViewTouchBase", stringBuilder2.toString());
                        }
                    } else {
                        f3 = 1.0f;
                    }
                    if (f3 > getMaxScale() || f3 < getMinScale()) {
                        m63771a(f3);
                    }
                    m63784a(true, true);
                    if (imageViewTouchBase.f54197z) {
                        m63790b(drawable);
                    }
                    if (z2 || imageViewTouchBase.f54197z || imageViewTouchBase.f54196y) {
                        mo13594a(i, i6, i7, i8);
                    }
                    if (imageViewTouchBase.f54196y) {
                        z2 = false;
                    } else {
                        z2 = false;
                        imageViewTouchBase.f54196y = false;
                    }
                    if (imageViewTouchBase.f54197z) {
                        imageViewTouchBase.f54197z = z2;
                    }
                    if (f54170l) {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("scale: ");
                        stringBuilder3.append(getScale());
                        stringBuilder3.append(", minScale: ");
                        stringBuilder3.append(getMinScale());
                        stringBuilder3.append(", maxScale: ");
                        stringBuilder3.append(getMaxScale());
                        Log.d("ImageViewTouchBase", stringBuilder3.toString());
                    }
                }
            }
            if (f54170l) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("display type: ");
                stringBuilder2.append(getDisplayType());
                Log.d("ImageViewTouchBase", stringBuilder2.toString());
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("newMatrix: ");
                stringBuilder2.append(imageViewTouchBase.f54186o);
                Log.d("ImageViewTouchBase", stringBuilder2.toString());
            }
            if (imageViewTouchBase.f54186o != null) {
                imageViewTouchBase.f54185n.set(imageViewTouchBase.f54186o);
                imageViewTouchBase.f54186o = null;
                f2 = getScale();
            } else {
                imageViewTouchBase.f54185n.reset();
                f2 = m63767a(getDisplayType());
            }
            f3 = f2;
            setImageMatrix(getImageViewMatrix());
            if (f3 != getScale()) {
                if (f54170l) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("scale != getScale: ");
                    stringBuilder2.append(f3);
                    stringBuilder2.append(" != ");
                    stringBuilder2.append(getScale());
                    Log.v("ImageViewTouchBase", stringBuilder2.toString());
                }
                m63771a(f3);
            }
            m63771a(f3);
            m63784a(true, true);
            if (imageViewTouchBase.f54197z) {
                m63790b(drawable);
            }
            mo13594a(i, i6, i7, i8);
            if (imageViewTouchBase.f54196y) {
                z2 = false;
            } else {
                z2 = false;
                imageViewTouchBase.f54196y = false;
            }
            if (imageViewTouchBase.f54197z) {
                imageViewTouchBase.f54197z = z2;
            }
            if (f54170l) {
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append("scale: ");
                stringBuilder3.append(getScale());
                stringBuilder3.append(", minScale: ");
                stringBuilder3.append(getMinScale());
                stringBuilder3.append(", maxScale: ");
                stringBuilder3.append(getMaxScale());
                Log.d("ImageViewTouchBase", stringBuilder3.toString());
            }
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (f54170l != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onConfigurationChanged. scale: ");
            stringBuilder.append(getScale());
            stringBuilder.append(", minScale: ");
            stringBuilder.append(getMinScale());
            stringBuilder.append(", mUserScaled: ");
            stringBuilder.append(this.f54188q);
            Log.i("ImageViewTouchBase", stringBuilder.toString());
        }
        if (this.f54188q != null) {
            this.f54188q = Math.abs(getScale() - getMinScale()) > 0.1f ? true : null;
        }
        if (f54170l != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("mUserScaled: ");
            stringBuilder.append(this.f54188q);
            Log.v("ImageViewTouchBase", stringBuilder.toString());
        }
    }

    /* renamed from: a */
    protected float m63767a(DisplayType displayType) {
        if (displayType == DisplayType.FIT_TO_SCREEN) {
            return 1.0f;
        }
        if (displayType == DisplayType.FIT_IF_BIGGER) {
            return Math.min(1.0f, 1065353216 / m63800f(this.f54184m));
        }
        if (displayType == DisplayType.FIT_HEIGHT) {
            return ((float) getHeight()) / (m63797d(this.f54184m) * this.f54175E.height());
        }
        if (displayType == DisplayType.FIT_WIDTH) {
            return ((float) getWidth()) / (m63799e(this.f54184m) * this.f54175E.width());
        }
        return 1.0f / m63800f(this.f54184m);
    }

    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    public void setImageBitmap(Bitmap bitmap) {
        m63779a(bitmap, null, -1.0f, -1.0f);
    }

    /* renamed from: a */
    public void m63779a(Bitmap bitmap, Matrix matrix, float f, float f2) {
        if (bitmap != null) {
            m63782a(new C17534a(bitmap), matrix, f, f2);
        } else {
            m63782a((Drawable) null, matrix, f, f2);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        m63782a(drawable, null, -1.0f, -1.0f);
    }

    /* renamed from: a */
    public void m63782a(Drawable drawable, Matrix matrix, float f, float f2) {
        if (getWidth() <= 0) {
            final Drawable drawable2 = drawable;
            final Matrix matrix2 = matrix;
            final float f3 = f;
            final float f4 = f2;
            this.f54187p = new Runnable(this) {
                /* renamed from: e */
                final /* synthetic */ ImageViewTouchBase f48692e;

                public void run() {
                    this.f48692e.m63782a(drawable2, matrix2, f3, f4);
                }
            };
            return;
        }
        m63791b(drawable, matrix, f, f2);
    }

    /* renamed from: b */
    protected void m63791b(Drawable drawable, Matrix matrix, float f, float f2) {
        this.f54184m.reset();
        super.setImageDrawable(drawable);
        if (f == -1.0f || f2 == -1.0f) {
            this.f54190s = -1.0f;
            this.f54189r = -1.0f;
            this.f54192u = false;
            this.f54191t = false;
        } else {
            f = Math.min(f, f2);
            f2 = Math.max(f, f2);
            this.f54190s = f;
            this.f54189r = f2;
            this.f54192u = true;
            this.f54191t = true;
            if (getDisplayType() == DisplayType.FIT_TO_SCREEN || getDisplayType() == DisplayType.FIT_IF_BIGGER) {
                if (this.f54190s >= 1.0f) {
                    this.f54192u = false;
                    this.f54190s = -1.0f;
                }
                if (this.f54189r <= 1.0f) {
                    this.f54191t = true;
                    this.f54189r = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.f54186o = new Matrix(matrix);
        }
        if (f54170l != null) {
            f = new StringBuilder();
            f.append("mMinZoom: ");
            f.append(this.f54190s);
            f.append(", mMaxZoom: ");
            f.append(this.f54189r);
            Log.v("ImageViewTouchBase", f.toString());
        }
        this.f54197z = true;
        m63781a(drawable);
        requestLayout();
    }

    /* renamed from: a */
    protected void m63781a(Drawable drawable) {
        if (drawable != null) {
            this.f54175E.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        } else {
            this.f54175E.setEmpty();
        }
    }

    /* renamed from: b */
    protected void m63790b(Drawable drawable) {
        if (f54170l) {
            Log.i("ImageViewTouchBase", "onDrawableChanged");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("scale: ");
            stringBuilder.append(getScale());
            stringBuilder.append(", minScale: ");
            stringBuilder.append(getMinScale());
            Log.v("ImageViewTouchBase", stringBuilder.toString());
        }
        m63795c(drawable);
    }

    /* renamed from: b */
    protected void m63788b(int i, int i2, int i3, int i4) {
        if (this.f54183c != null) {
            this.f54183c.onLayoutChanged(true, i, i2, i3, i4);
        }
    }

    /* renamed from: c */
    protected void m63795c(Drawable drawable) {
        if (this.f54182b != null) {
            this.f54182b.onDrawableChanged(drawable);
        }
    }

    /* renamed from: a */
    protected void mo13594a(int i, int i2, int i3, int i4) {
        if (f54170l) {
            Log.i("ImageViewTouchBase", "onLayoutChanged");
        }
        m63788b(i, i2, i3, i4);
    }

    /* renamed from: d */
    protected float m63796d() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        float max = Math.max(this.f54175E.width() / this.f54179I.width(), this.f54175E.height() / this.f54179I.height()) * 4.0f;
        if (f54170l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("computeMaxZoom: ");
            stringBuilder.append(max);
            Log.i("ImageViewTouchBase", stringBuilder.toString());
        }
        return max;
    }

    /* renamed from: e */
    protected float m63798e() {
        if (f54170l) {
            Log.i("ImageViewTouchBase", "computeMinZoom");
        }
        if (getDrawable() == null) {
            return 1.0f;
        }
        float min = Math.min(1.0f, 1.0f / m63800f(this.f54184m));
        if (f54170l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("computeMinZoom: ");
            stringBuilder.append(min);
            Log.i("ImageViewTouchBase", stringBuilder.toString());
        }
        return min;
    }

    public float getMaxScale() {
        if (this.f54189r == -1.0f) {
            this.f54189r = m63796d();
        }
        return this.f54189r;
    }

    public float getMinScale() {
        if (f54170l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getMinScale, mMinZoom: ");
            stringBuilder.append(this.f54190s);
            Log.i("ImageViewTouchBase", stringBuilder.toString());
        }
        if (this.f54190s == -1.0f) {
            this.f54190s = m63798e();
        }
        if (f54170l) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("mMinZoom: ");
            stringBuilder.append(this.f54190s);
            Log.v("ImageViewTouchBase", stringBuilder.toString());
        }
        return this.f54190s;
    }

    public Matrix getImageViewMatrix() {
        return m63768a(this.f54185n);
    }

    /* renamed from: a */
    public Matrix m63768a(Matrix matrix) {
        this.f54193v.set(this.f54184m);
        this.f54193v.postConcat(matrix);
        return this.f54193v;
    }

    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        Object obj = ((matrix != null || imageMatrix.isIdentity()) && (matrix == null || imageMatrix.equals(matrix))) ? null : 1;
        super.setImageMatrix(matrix);
        if (obj != null) {
            m63801f();
        }
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.f54185n);
    }

    /* renamed from: a */
    protected void m63783a(Drawable drawable, Matrix matrix, RectF rectF) {
        drawable = this.f54175E.width();
        float height = this.f54175E.height();
        matrix.reset();
        float min = Math.min(rectF.width() / drawable, rectF.height() / height);
        matrix.postScale(min, min);
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.postTranslate((rectF.width() - (drawable * min)) / 2.0f, (rectF.height() - (height * min)) / 1073741824);
        m63789b(matrix);
    }

    /* renamed from: a */
    protected float m63766a(Matrix matrix, int i) {
        matrix.getValues(this.f54194w);
        return this.f54194w[i];
    }

    /* renamed from: b */
    public void m63789b(Matrix matrix) {
        float a = m63766a(matrix, 0);
        float a2 = m63766a(matrix, 4);
        float a3 = m63766a(matrix, 2);
        matrix = m63766a(matrix, 5);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("matrix: { x: ");
        stringBuilder.append(a3);
        stringBuilder.append(", y: ");
        stringBuilder.append(matrix);
        stringBuilder.append(", scalex: ");
        stringBuilder.append(a);
        stringBuilder.append(", scaley: ");
        stringBuilder.append(a2);
        stringBuilder.append(" }");
        Log.d("ImageViewTouchBase", stringBuilder.toString());
    }

    public RectF getBitmapRect() {
        return m63792c(this.f54185n);
    }

    /* renamed from: c */
    protected RectF m63792c(Matrix matrix) {
        m63768a(matrix).mapRect(this.f54176F, this.f54175E);
        return this.f54176F;
    }

    /* renamed from: d */
    protected float m63797d(Matrix matrix) {
        return m63766a(matrix, 4);
    }

    /* renamed from: e */
    protected float m63799e(Matrix matrix) {
        return m63766a(matrix, 0);
    }

    /* renamed from: f */
    protected float m63800f(Matrix matrix) {
        return m63766a(matrix, 0);
    }

    public float getScale() {
        return m63800f(this.f54185n);
    }

    public float getBaseScale() {
        return m63800f(this.f54184m);
    }

    /* renamed from: a */
    protected void m63784a(boolean z, boolean z2) {
        if (getDrawable() != null) {
            z = m63769a(this.f54185n, z, z2);
            if (z.left || z.top) {
                m63772a(z.left, z.top);
            }
        }
    }

    /* renamed from: a */
    protected RectF m63769a(Matrix matrix, boolean z, boolean z2) {
        if (getDrawable() == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.f54177G.set(0.0f, 0.0f, 0.0f, 0.0f);
        matrix = m63792c(matrix);
        float height = matrix.height();
        float width = matrix.width();
        if (z2) {
            if (height < this.f54179I.height()) {
                z2 = ((this.f54179I.height() - height) / true) - (matrix.top - this.f54179I.top);
            } else if (matrix.top > this.f54179I.top) {
                z2 = -(matrix.top - this.f54179I.top);
            } else if (matrix.bottom < this.f54179I.bottom) {
                z2 = this.f54179I.bottom - matrix.bottom;
            }
            if (z) {
                if (width < this.f54179I.width()) {
                    matrix = ((this.f54179I.width() - width) / true) - (matrix.left - this.f54179I.left);
                } else if (matrix.left > this.f54179I.left) {
                    matrix = -(matrix.left - this.f54179I.left);
                } else if (matrix.right < this.f54179I.right) {
                    matrix = this.f54179I.right - matrix.right;
                }
                this.f54177G.set(matrix, z2, 0.0f, 0.0f);
                return this.f54177G;
            }
            matrix = null;
            this.f54177G.set(matrix, z2, 0.0f, 0.0f);
            return this.f54177G;
        }
        z2 = false;
        if (z) {
            if (width < this.f54179I.width()) {
                matrix = ((this.f54179I.width() - width) / true) - (matrix.left - this.f54179I.left);
            } else if (matrix.left > this.f54179I.left) {
                matrix = -(matrix.left - this.f54179I.left);
            } else if (matrix.right < this.f54179I.right) {
                matrix = this.f54179I.right - matrix.right;
            }
            this.f54177G.set(matrix, z2, 0.0f, 0.0f);
            return this.f54177G;
        }
        matrix = null;
        this.f54177G.set(matrix, z2, 0.0f, 0.0f);
        return this.f54177G;
    }

    /* renamed from: a */
    protected void m63772a(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f54185n.postTranslate(f, f2);
            setImageMatrix(getImageViewMatrix());
        }
    }

    /* renamed from: b */
    protected void m63787b(float f, float f2, float f3) {
        this.f54185n.postScale(f, f, f2, f3);
        setImageMatrix(getImageViewMatrix());
    }

    protected PointF getCenter() {
        return this.f54174D;
    }

    /* renamed from: a */
    protected void m63771a(float f) {
        if (f54170l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("zoomTo: ");
            stringBuilder.append(f);
            Log.i("ImageViewTouchBase", stringBuilder.toString());
        }
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        if (f < getMinScale()) {
            f = getMinScale();
        }
        if (f54170l) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("sanitized scale: ");
            stringBuilder.append(f);
            Log.d("ImageViewTouchBase", stringBuilder.toString());
        }
        PointF center = getCenter();
        m63794c(f, center.x, center.y);
    }

    /* renamed from: a */
    public void m63776a(float f, long j) {
        PointF center = getCenter();
        m63774a(f, center.x, center.y, j);
    }

    /* renamed from: c */
    protected void m63794c(float f, float f2, float f3) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        m63787b(f / getScale(), f2, f3);
        m63785b(getScale());
        m63784a(true, true);
    }

    /* renamed from: b */
    public void m63786b(float f, float f2) {
        m63770a((double) f, (double) f2);
    }

    /* renamed from: a */
    protected void m63770a(double d, double d2) {
        RectF bitmapRect = getBitmapRect();
        this.f54178H.set((float) d, (float) d2);
        m63780a(bitmapRect, this.f54178H);
        if (this.f54178H.x != 0.0d || this.f54178H.y != 0.0d) {
            m63772a(this.f54178H.x, this.f54178H.y);
            m63784a(true, true);
        }
    }

    /* renamed from: g */
    protected void m63802g() {
        if (this.f54181a != null) {
            this.f54181a.cancel();
            this.f54181a = null;
        }
    }

    /* renamed from: a */
    protected void m63775a(float f, float f2, long j) {
        f = ValueAnimator.ofFloat(new float[]{0.0f, f}).setDuration(j);
        f2 = ValueAnimator.ofFloat(new float[]{0.0f, f2}).setDuration(j);
        m63802g();
        this.f54181a = new AnimatorSet();
        ((AnimatorSet) this.f54181a).playTogether(new Animator[]{f, f2});
        this.f54181a.setDuration(j);
        this.f54181a.setInterpolator(new DecelerateInterpolator());
        this.f54181a.start();
        f2.addUpdateListener(new AnimatorUpdateListener(this) {
            /* renamed from: a */
            float f48693a = 0.0f;
            /* renamed from: b */
            float f48694b = 0.0f;
            /* renamed from: e */
            final /* synthetic */ ImageViewTouchBase f48697e;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator = ((Float) f.getAnimatedValue()).floatValue();
                float floatValue = ((Float) f2.getAnimatedValue()).floatValue();
                this.f48697e.m63770a((double) (valueAnimator - this.f48693a), (double) (floatValue - this.f48694b));
                this.f48693a = valueAnimator;
                this.f48694b = floatValue;
                this.f48697e.postInvalidateOnAnimation();
            }
        });
        this.f54181a.addListener(new C157623(this));
    }

    /* renamed from: a */
    protected void m63774a(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float scale = getScale();
        Matrix matrix = new Matrix(this.f54185n);
        matrix.postScale(f, f, f2, f3);
        RectF a = m63769a(matrix, true, true);
        f2 += a.left * f;
        f3 += a.top * f;
        m63802g();
        f = ValueAnimator.ofFloat(new float[]{scale, f});
        f.setDuration(j);
        f.setInterpolator(new DecelerateInterpolator(1.0f));
        f.addUpdateListener(new AnimatorUpdateListener(this) {
            /* renamed from: c */
            final /* synthetic */ ImageViewTouchBase f48701c;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f48701c.m63794c(((Float) valueAnimator.getAnimatedValue()).floatValue(), f2, f3);
                this.f48701c.postInvalidateOnAnimation();
            }
        });
        f.start();
    }

    public void dispose() {
        m63793c();
    }

    protected void onDraw(Canvas canvas) {
        if (getScaleType() == ScaleType.FIT_XY) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }
}
