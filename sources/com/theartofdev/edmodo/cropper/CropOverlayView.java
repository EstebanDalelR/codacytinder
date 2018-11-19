package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImageView.CropShape;
import com.theartofdev.edmodo.cropper.CropImageView.Guidelines;
import java.util.Arrays;

public class CropOverlayView extends View {
    /* renamed from: A */
    private final Rect f22550A;
    /* renamed from: B */
    private boolean f22551B;
    /* renamed from: C */
    private Integer f22552C;
    /* renamed from: a */
    private ScaleGestureDetector f22553a;
    /* renamed from: b */
    private boolean f22554b;
    /* renamed from: c */
    private final C6141e f22555c;
    /* renamed from: d */
    private CropWindowChangeListener f22556d;
    /* renamed from: e */
    private final RectF f22557e;
    /* renamed from: f */
    private Paint f22558f;
    /* renamed from: g */
    private Paint f22559g;
    /* renamed from: h */
    private Paint f22560h;
    /* renamed from: i */
    private Paint f22561i;
    /* renamed from: j */
    private Path f22562j;
    /* renamed from: k */
    private final float[] f22563k;
    /* renamed from: l */
    private final RectF f22564l;
    /* renamed from: m */
    private int f22565m;
    /* renamed from: n */
    private int f22566n;
    /* renamed from: o */
    private float f22567o;
    /* renamed from: p */
    private float f22568p;
    /* renamed from: q */
    private float f22569q;
    /* renamed from: r */
    private float f22570r;
    /* renamed from: s */
    private float f22571s;
    /* renamed from: t */
    private CropWindowMoveHandler f22572t;
    /* renamed from: u */
    private boolean f22573u;
    /* renamed from: v */
    private int f22574v;
    /* renamed from: w */
    private int f22575w;
    /* renamed from: x */
    private float f22576x;
    /* renamed from: y */
    private Guidelines f22577y;
    /* renamed from: z */
    private CropShape f22578z;

    public interface CropWindowChangeListener {
        void onCropWindowChanged(boolean z);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$a */
    private class C6131a extends SimpleOnScaleGestureListener {
        /* renamed from: a */
        final /* synthetic */ CropOverlayView f22549a;

        private C6131a(CropOverlayView cropOverlayView) {
            this.f22549a = cropOverlayView;
        }

        @TargetApi(11)
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF a = this.f22549a.f22555c.m26728a();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            scaleGestureDetector = scaleGestureDetector.getCurrentSpanX() / 1073741824;
            float f = focusY - currentSpanY;
            float f2 = focusX - scaleGestureDetector;
            focusX += scaleGestureDetector;
            focusY += currentSpanY;
            if (f2 < focusX && f <= focusY && f2 >= 0.0f && focusX <= this.f22549a.f22555c.m26735d() && f >= 0.0f && focusY <= this.f22549a.f22555c.m26736e()) {
                a.set(f2, f, focusX, focusY);
                this.f22549a.f22555c.m26731a(a);
                this.f22549a.invalidate();
            }
            return true;
        }
    }

    public CropOverlayView(Context context) {
        this(context, null);
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22555c = new C6141e();
        this.f22557e = new RectF();
        this.f22562j = new Path();
        this.f22563k = new float[8];
        this.f22564l = new RectF();
        this.f22576x = ((float) this.f22574v) / ((float) this.f22575w);
        this.f22550A = new Rect();
    }

    public void setCropWindowChangeListener(CropWindowChangeListener cropWindowChangeListener) {
        this.f22556d = cropWindowChangeListener;
    }

    public RectF getCropWindowRect() {
        return this.f22555c.m26728a();
    }

    public void setCropWindowRect(RectF rectF) {
        this.f22555c.m26731a(rectF);
    }

    /* renamed from: a */
    public void m26662a() {
        RectF cropWindowRect = getCropWindowRect();
        m26652a(cropWindowRect);
        this.f22555c.m26731a(cropWindowRect);
    }

    /* renamed from: a */
    public void m26664a(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f22563k, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f22563k, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f22563k, 0, fArr.length);
            }
            this.f22565m = i;
            this.f22566n = i2;
            fArr = this.f22555c.m26728a();
            if (fArr.width() == 0 || fArr.height() == null) {
                m26658d();
            }
        }
    }

    /* renamed from: b */
    public void m26666b() {
        if (this.f22551B) {
            setCropWindowRect(C6139c.f22624b);
            m26658d();
            invalidate();
        }
    }

    public CropShape getCropShape() {
        return this.f22578z;
    }

    public void setCropShape(CropShape cropShape) {
        if (this.f22578z != cropShape) {
            this.f22578z = cropShape;
            if (VERSION.SDK_INT >= 11 && VERSION.SDK_INT <= 17) {
                if (this.f22578z == CropShape.OVAL) {
                    this.f22552C = Integer.valueOf(getLayerType());
                    if (this.f22552C.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.f22552C = null;
                    }
                } else if (this.f22552C != null) {
                    setLayerType(this.f22552C.intValue(), null);
                    this.f22552C = null;
                }
            }
            invalidate();
        }
    }

    public Guidelines getGuidelines() {
        return this.f22577y;
    }

    public void setGuidelines(Guidelines guidelines) {
        if (this.f22577y != guidelines) {
            this.f22577y = guidelines;
            if (this.f22551B != null) {
                invalidate();
            }
        }
    }

    /* renamed from: c */
    public boolean m26667c() {
        return this.f22573u;
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f22573u != z) {
            this.f22573u = z;
            if (this.f22551B) {
                m26658d();
                invalidate();
            }
        }
    }

    public int getAspectRatioX() {
        return this.f22574v;
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f22574v != i) {
            this.f22574v = i;
            this.f22576x = ((float) this.f22574v) / ((float) this.f22575w);
            if (this.f22551B != 0) {
                m26658d();
                invalidate();
            }
        }
    }

    public int getAspectRatioY() {
        return this.f22575w;
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f22575w != i) {
            this.f22575w = i;
            this.f22576x = ((float) this.f22574v) / ((float) this.f22575w);
            if (this.f22551B != 0) {
                m26658d();
                invalidate();
            }
        }
    }

    public void setSnapRadius(float f) {
        this.f22571s = f;
    }

    /* renamed from: a */
    public boolean m26665a(boolean z) {
        if (VERSION.SDK_INT < 11 || this.f22554b == z) {
            return false;
        }
        this.f22554b = z;
        if (this.f22554b && !this.f22553a) {
            this.f22553a = new ScaleGestureDetector(getContext(), new C6131a());
        }
        return true;
    }

    /* renamed from: a */
    public void m26663a(float f, float f2, float f3, float f4) {
        this.f22555c.m26730a(f, f2, f3, f4);
    }

    public Rect getInitialCropWindowRect() {
        return this.f22550A;
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f22550A;
        if (rect == null) {
            rect = C6139c.f22623a;
        }
        rect2.set(rect);
        if (this.f22551B != null) {
            m26658d();
            invalidate();
            m26655b((boolean) null);
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.f22555c.m26732a(cropImageOptions);
        setCropShape(cropImageOptions.cropShape);
        setSnapRadius(cropImageOptions.snapRadius);
        setGuidelines(cropImageOptions.guidelines);
        setFixedAspectRatio(cropImageOptions.fixAspectRatio);
        setAspectRatioX(cropImageOptions.aspectRatioX);
        setAspectRatioY(cropImageOptions.aspectRatioY);
        m26665a(cropImageOptions.multiTouchEnabled);
        this.f22570r = cropImageOptions.touchRadius;
        this.f22569q = cropImageOptions.initialCropWindowPaddingRatio;
        this.f22558f = m26647a(cropImageOptions.borderLineThickness, cropImageOptions.borderLineColor);
        this.f22567o = cropImageOptions.borderCornerOffset;
        this.f22568p = cropImageOptions.borderCornerLength;
        this.f22559g = m26647a(cropImageOptions.borderCornerThickness, cropImageOptions.borderCornerColor);
        this.f22560h = m26647a(cropImageOptions.guidelinesThickness, cropImageOptions.guidelinesColor);
        this.f22561i = m26648a(cropImageOptions.backgroundColor);
    }

    /* renamed from: d */
    private void m26658d() {
        float max = Math.max(C6139c.m26690a(this.f22563k), 0.0f);
        float max2 = Math.max(C6139c.m26712b(this.f22563k), 0.0f);
        float min = Math.min(C6139c.m26713c(this.f22563k), (float) getWidth());
        float min2 = Math.min(C6139c.m26714d(this.f22563k), (float) getHeight());
        if (min > max) {
            if (min2 > max2) {
                RectF rectF = new RectF();
                this.f22551B = true;
                float f = min - max;
                float f2 = this.f22569q * f;
                float f3 = min2 - max2;
                float f4 = this.f22569q * f3;
                if (this.f22550A.width() > 0 && this.f22550A.height() > 0) {
                    rectF.left = (((float) this.f22550A.left) / this.f22555c.m26737f()) + max;
                    rectF.top = (((float) this.f22550A.top) / this.f22555c.m26738g()) + max2;
                    rectF.right = rectF.left + (((float) this.f22550A.width()) / this.f22555c.m26737f());
                    rectF.bottom = rectF.top + (((float) this.f22550A.height()) / this.f22555c.m26738g());
                    rectF.left = Math.max(max, rectF.left);
                    rectF.top = Math.max(max2, rectF.top);
                    rectF.right = Math.min(min, rectF.right);
                    rectF.bottom = Math.min(min2, rectF.bottom);
                } else if (!this.f22573u || min <= max || min2 <= max2) {
                    rectF.left = max + f2;
                    rectF.top = max2 + f4;
                    rectF.right = min - f2;
                    rectF.bottom = min2 - f4;
                } else if (f / f3 > this.f22576x) {
                    rectF.top = max2 + f4;
                    rectF.bottom = min2 - f4;
                    max = ((float) getWidth()) / 2.0f;
                    this.f22576x = ((float) this.f22574v) / ((float) this.f22575w);
                    max2 = Math.max(this.f22555c.m26733b(), rectF.height() * this.f22576x) / 2.0f;
                    rectF.left = max - max2;
                    rectF.right = max + max2;
                } else {
                    rectF.left = max + f2;
                    rectF.right = min - f2;
                    max = ((float) getHeight()) / 2.0f;
                    max2 = Math.max(this.f22555c.m26734c(), rectF.width() / this.f22576x) / 2.0f;
                    rectF.top = max - max2;
                    rectF.bottom = max + max2;
                }
                m26652a(rectF);
                this.f22555c.m26731a(rectF);
            }
        }
    }

    /* renamed from: a */
    private void m26652a(RectF rectF) {
        if (rectF.width() < this.f22555c.m26733b()) {
            float b = (this.f22555c.m26733b() - rectF.width()) / 2.0f;
            rectF.left -= b;
            rectF.right += b;
        }
        if (rectF.height() < this.f22555c.m26734c()) {
            b = (this.f22555c.m26734c() - rectF.height()) / 2.0f;
            rectF.top -= b;
            rectF.bottom += b;
        }
        if (rectF.width() > this.f22555c.m26735d()) {
            b = (rectF.width() - this.f22555c.m26735d()) / 2.0f;
            rectF.left += b;
            rectF.right -= b;
        }
        if (rectF.height() > this.f22555c.m26736e()) {
            b = (rectF.height() - this.f22555c.m26736e()) / 2.0f;
            rectF.top += b;
            rectF.bottom -= b;
        }
        m26656b(rectF);
        if (this.f22564l.width() > 0.0f && this.f22564l.height() > 0.0f) {
            b = Math.max(this.f22564l.left, 0.0f);
            float max = Math.max(this.f22564l.top, 0.0f);
            float min = Math.min(this.f22564l.right, (float) getWidth());
            float min2 = Math.min(this.f22564l.bottom, (float) getHeight());
            if (rectF.left < b) {
                rectF.left = b;
            }
            if (rectF.top < max) {
                rectF.top = max;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.f22573u && ((double) Math.abs(rectF.width() - (rectF.height() * this.f22576x))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f22576x) {
                b = Math.abs((rectF.height() * this.f22576x) - rectF.width()) / 2.0f;
                rectF.left += b;
                rectF.right -= b;
                return;
            }
            b = Math.abs((rectF.width() / this.f22576x) - rectF.height()) / 2.0f;
            rectF.top += b;
            rectF.bottom -= b;
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m26651a(canvas);
        if (this.f22555c.m26739h()) {
            if (this.f22577y == Guidelines.ON) {
                m26654b(canvas);
            } else if (this.f22577y == Guidelines.ON_TOUCH && this.f22572t != null) {
                m26654b(canvas);
            }
        }
        m26657c(canvas);
        m26659d(canvas);
    }

    /* renamed from: a */
    private void m26651a(Canvas canvas) {
        RectF a = this.f22555c.m26728a();
        float max = Math.max(C6139c.m26690a(this.f22563k), 0.0f);
        float max2 = Math.max(C6139c.m26712b(this.f22563k), 0.0f);
        float min = Math.min(C6139c.m26713c(this.f22563k), (float) getWidth());
        float min2 = Math.min(C6139c.m26714d(this.f22563k), (float) getHeight());
        if (this.f22578z == CropShape.RECTANGLE) {
            if (m26661f()) {
                if (VERSION.SDK_INT > 17) {
                    this.f22562j.reset();
                    this.f22562j.moveTo(this.f22563k[0], this.f22563k[1]);
                    this.f22562j.lineTo(this.f22563k[2], this.f22563k[3]);
                    this.f22562j.lineTo(this.f22563k[4], this.f22563k[5]);
                    this.f22562j.lineTo(this.f22563k[6], this.f22563k[7]);
                    this.f22562j.close();
                    canvas.save();
                    canvas.clipPath(this.f22562j, Op.INTERSECT);
                    canvas.clipRect(a, Op.XOR);
                    canvas.drawRect(max, max2, min, min2, this.f22561i);
                    canvas.restore();
                    return;
                }
            }
            Canvas canvas2 = canvas;
            float f = max;
            float f2 = min;
            canvas2.drawRect(f, max2, f2, a.top, this.f22561i);
            canvas2.drawRect(f, a.bottom, f2, min2, this.f22561i);
            canvas2.drawRect(f, a.top, a.left, a.bottom, this.f22561i);
            canvas.drawRect(a.right, a.top, min, a.bottom, this.f22561i);
            return;
        }
        this.f22562j.reset();
        if (VERSION.SDK_INT < 11 || VERSION.SDK_INT > 17 || this.f22578z != CropShape.OVAL) {
            this.f22557e.set(a.left, a.top, a.right, a.bottom);
        } else {
            this.f22557e.set(a.left + 2.0f, a.top + 2.0f, a.right - 2.0f, a.bottom - 2.0f);
        }
        this.f22562j.addOval(this.f22557e, Direction.CW);
        canvas.save();
        canvas.clipPath(this.f22562j, Op.XOR);
        canvas.drawRect(max, max2, min, min2, this.f22561i);
        canvas.restore();
    }

    /* renamed from: b */
    private void m26654b(Canvas canvas) {
        if (this.f22560h != null) {
            float strokeWidth = r0.f22558f != null ? r0.f22558f.getStrokeWidth() : 0.0f;
            RectF a = r0.f22555c.m26728a();
            a.inset(strokeWidth, strokeWidth);
            float width = a.width() / 3.0f;
            float height = a.height() / 3.0f;
            float f;
            if (r0.f22578z == CropShape.OVAL) {
                float width2 = (a.width() / 2.0f) - strokeWidth;
                float height2 = (a.height() / 2.0f) - strokeWidth;
                float f2 = a.left + width;
                f = a.right - width;
                strokeWidth = (float) (((double) height2) * Math.sin(Math.acos((double) ((width2 - width) / width2))));
                canvas.drawLine(f2, (a.top + height2) - strokeWidth, f2, (a.bottom - height2) + strokeWidth, r0.f22560h);
                canvas.drawLine(f, (a.top + height2) - strokeWidth, f, (a.bottom - height2) + strokeWidth, r0.f22560h);
                float f3 = a.top + height;
                float f4 = a.bottom - height;
                strokeWidth = (float) (((double) width2) * Math.cos(Math.asin((double) ((height2 - height) / height2))));
                canvas.drawLine((a.left + width2) - strokeWidth, f3, (a.right - width2) + strokeWidth, f3, r0.f22560h);
                canvas.drawLine((a.left + width2) - strokeWidth, f4, (a.right - width2) + strokeWidth, f4, r0.f22560h);
                return;
            }
            float f5 = a.left + width;
            float f6 = a.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f5, a.top, f5, a.bottom, r0.f22560h);
            canvas.drawLine(f6, a.top, f6, a.bottom, r0.f22560h);
            float f7 = a.top + height;
            f = a.bottom - height;
            canvas2.drawLine(a.left, f7, a.right, f7, r0.f22560h);
            canvas.drawLine(a.left, f, a.right, f, r0.f22560h);
        }
    }

    /* renamed from: c */
    private void m26657c(Canvas canvas) {
        if (this.f22558f != null) {
            float strokeWidth = this.f22558f.getStrokeWidth();
            RectF a = this.f22555c.m26728a();
            strokeWidth /= 2.0f;
            a.inset(strokeWidth, strokeWidth);
            if (this.f22578z == CropShape.RECTANGLE) {
                canvas.drawRect(a, this.f22558f);
            } else {
                canvas.drawOval(a, this.f22558f);
            }
        }
    }

    /* renamed from: d */
    private void m26659d(Canvas canvas) {
        if (this.f22559g != null) {
            float strokeWidth = this.f22558f != null ? this.f22558f.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.f22559g.getStrokeWidth();
            float f = strokeWidth2 / 2.0f;
            float f2 = this.f22567o + f;
            RectF a = this.f22555c.m26728a();
            a.inset(f2, f2);
            strokeWidth2 = (strokeWidth2 - strokeWidth) / 2.0f;
            f += strokeWidth2;
            Canvas canvas2 = canvas;
            canvas2.drawLine(a.left - strokeWidth2, a.top - f, a.left - strokeWidth2, a.top + this.f22568p, this.f22559g);
            canvas2.drawLine(a.left - f, a.top - strokeWidth2, a.left + this.f22568p, a.top - strokeWidth2, this.f22559g);
            canvas2.drawLine(a.right + strokeWidth2, a.top - f, a.right + strokeWidth2, a.top + this.f22568p, this.f22559g);
            canvas2.drawLine(a.right + f, a.top - strokeWidth2, a.right - this.f22568p, a.top - strokeWidth2, this.f22559g);
            canvas2.drawLine(a.left - strokeWidth2, a.bottom + f, a.left - strokeWidth2, a.bottom - this.f22568p, this.f22559g);
            canvas2.drawLine(a.left - f, a.bottom + strokeWidth2, a.left + this.f22568p, a.bottom + strokeWidth2, this.f22559g);
            canvas2.drawLine(a.right + strokeWidth2, a.bottom + f, a.right + strokeWidth2, a.bottom - this.f22568p, this.f22559g);
            canvas2.drawLine(a.right + f, a.bottom + strokeWidth2, a.right - this.f22568p, a.bottom + strokeWidth2, this.f22559g);
        }
    }

    /* renamed from: a */
    private static Paint m26648a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    /* renamed from: a */
    private static Paint m26647a(float f, int i) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Style.STROKE);
        paint.setAntiAlias(Float.MIN_VALUE);
        return paint;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f22554b) {
            this.f22553a.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 0:
                m26650a(motionEvent.getX(), motionEvent.getY());
                return true;
            case 1:
            case 3:
                getParent().requestDisallowInterceptTouchEvent(false);
                m26660e();
                return true;
            case 2:
                m26653b(motionEvent.getX(), motionEvent.getY());
                getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private void m26650a(float f, float f2) {
        this.f22572t = this.f22555c.m26729a(f, f2, this.f22570r, this.f22578z);
        if (this.f22572t != null) {
            invalidate();
        }
    }

    /* renamed from: e */
    private void m26660e() {
        if (this.f22572t != null) {
            this.f22572t = null;
            m26655b(false);
            invalidate();
        }
    }

    /* renamed from: b */
    private void m26653b(float f, float f2) {
        if (this.f22572t != null) {
            float f3 = this.f22571s;
            RectF a = this.f22555c.m26728a();
            this.f22572t.m26684a(a, f, f2, this.f22564l, this.f22565m, this.f22566n, m26656b(a) ? 0.0f : f3, this.f22573u, this.f22576x);
            this.f22555c.m26731a(a);
            m26655b((boolean) Float.MIN_VALUE);
            invalidate();
        }
    }

    /* renamed from: b */
    private boolean m26656b(RectF rectF) {
        RectF rectF2 = rectF;
        float a = C6139c.m26690a(this.f22563k);
        float b = C6139c.m26712b(this.f22563k);
        float c = C6139c.m26713c(this.f22563k);
        float d = C6139c.m26714d(this.f22563k);
        if (m26661f()) {
            float f = r0.f22563k[0];
            float f2 = r0.f22563k[1];
            float f3 = r0.f22563k[4];
            float f4 = r0.f22563k[5];
            float f5 = r0.f22563k[6];
            float f6 = r0.f22563k[7];
            if (r0.f22563k[7] < r0.f22563k[1]) {
                if (r0.f22563k[1] < r0.f22563k[3]) {
                    f = r0.f22563k[6];
                    f2 = r0.f22563k[7];
                    f3 = r0.f22563k[2];
                    f4 = r0.f22563k[3];
                    f5 = r0.f22563k[4];
                    f6 = r0.f22563k[5];
                } else {
                    f = r0.f22563k[4];
                    f2 = r0.f22563k[5];
                    f3 = r0.f22563k[0];
                    f4 = r0.f22563k[1];
                    f5 = r0.f22563k[2];
                    f6 = r0.f22563k[3];
                }
            } else if (r0.f22563k[1] > r0.f22563k[3]) {
                f = r0.f22563k[2];
                f2 = r0.f22563k[3];
                f3 = r0.f22563k[6];
                f4 = r0.f22563k[7];
                f5 = r0.f22563k[0];
                f6 = r0.f22563k[1];
            }
            f6 = (f6 - f2) / (f5 - f);
            float f7 = -1.0f / f6;
            float f8 = f2 - (f6 * f);
            f2 -= f * f7;
            f = f4 - (f6 * f3);
            f4 -= f3 * f7;
            f3 = (rectF.centerY() - rectF2.top) / (rectF.centerX() - rectF2.left);
            float f9 = -f3;
            f5 = rectF2.top - (rectF2.left * f3);
            float f10 = rectF2.top - (rectF2.right * f9);
            float f11 = f6 - f3;
            float f12 = (f5 - f8) / f11;
            float f13 = d;
            if (f12 >= rectF2.right) {
                f12 = a;
            }
            f12 = Math.max(a, f12);
            a = (f5 - f2) / (f7 - f3);
            if (a >= rectF2.right) {
                a = f12;
            }
            f12 = Math.max(f12, a);
            d = f7 - f9;
            a = (f10 - f4) / d;
            if (a >= rectF2.right) {
                a = f12;
            }
            f12 = Math.max(f12, a);
            a = (f10 - f2) / d;
            if (a <= rectF2.left) {
                a = c;
            }
            a = Math.min(c, a);
            c = (f10 - f) / (f6 - f9);
            if (c <= rectF2.left) {
                c = a;
            }
            a = Math.min(a, c);
            c = (f5 - f) / f11;
            if (c <= rectF2.left) {
                c = a;
            }
            float min = Math.min(a, c);
            a = Math.max(b, Math.max((f6 * f12) + f8, (f7 * min) + f2));
            b = Math.min(f13, Math.min((f7 * f12) + f4, (f6 * min) + f));
            this.f22564l.left = f12;
            this.f22564l.top = a;
            this.f22564l.right = min;
            this.f22564l.bottom = b;
            return true;
        }
        r0.f22564l.set(a, b, c, d);
        return false;
    }

    /* renamed from: f */
    private boolean m26661f() {
        return (this.f22563k[0] == this.f22563k[6] || this.f22563k[1] == this.f22563k[7]) ? false : true;
    }

    /* renamed from: b */
    private void m26655b(boolean z) {
        try {
            if (this.f22556d != null) {
                this.f22556d.onCropWindowChanged(z);
            }
        } catch (boolean z2) {
            Log.e("AIC", "Exception in crop window changed", z2);
        }
    }
}
