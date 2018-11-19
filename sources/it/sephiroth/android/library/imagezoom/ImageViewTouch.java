package it.sephiroth.android.library.imagezoom;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ViewConfiguration;

public class ImageViewTouch extends ImageViewTouchBase {
    /* renamed from: K */
    private OnImageViewTouchDoubleTapListener f57447K;
    /* renamed from: L */
    private OnImageViewTouchSingleTapListener f57448L;
    /* renamed from: a */
    private float f57449a;
    /* renamed from: b */
    protected ScaleGestureDetector f57450b;
    /* renamed from: c */
    protected GestureDetector f57451c;
    /* renamed from: d */
    protected int f57452d;
    /* renamed from: e */
    protected int f57453e;
    /* renamed from: f */
    protected OnGestureListener f57454f;
    /* renamed from: g */
    protected OnScaleGestureListener f57455g;
    /* renamed from: h */
    protected boolean f57456h = true;
    /* renamed from: i */
    protected boolean f57457i = true;
    /* renamed from: j */
    protected boolean f57458j = true;
    /* renamed from: k */
    long f57459k;

    public interface OnImageViewTouchDoubleTapListener {
        void onDoubleTap();
    }

    public interface OnImageViewTouchSingleTapListener {
        void onSingleTapConfirmed();
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$a */
    public class C15758a extends SimpleOnGestureListener {
        /* renamed from: a */
        final /* synthetic */ ImageViewTouch f48685a;

        public C15758a(ImageViewTouch imageViewTouch) {
            this.f48685a = imageViewTouch;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (this.f48685a.f57448L != null) {
                this.f48685a.f57448L.onSingleTapConfirmed();
            }
            return this.f48685a.m66621a(motionEvent);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouchBase.f54170l) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onDoubleTap. double tap enabled? ");
                stringBuilder.append(this.f48685a.f57456h);
                Log.i("ImageViewTouchBase", stringBuilder.toString());
            }
            if (this.f48685a.f57456h) {
                if (VERSION.SDK_INT >= 19 && this.f48685a.f57450b.isQuickScaleEnabled()) {
                    return true;
                }
                this.f48685a.q = true;
                this.f48685a.m63774a(Math.min(this.f48685a.getMaxScale(), Math.max(this.f48685a.m66618a(this.f48685a.getScale(), this.f48685a.getMaxScale(), this.f48685a.getMinScale()), this.f48685a.getMinScale())), motionEvent.getX(), motionEvent.getY(), (long) this.f48685a.A);
            }
            if (this.f48685a.f57447K != null) {
                this.f48685a.f57447K.onDoubleTap();
            }
            return super.onDoubleTap(motionEvent);
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.f48685a.isLongClickable() != null && this.f48685a.f57450b.isInProgress() == null) {
                this.f48685a.setPressed(true);
                this.f48685a.performLongClick();
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.f48685a.f57458j && motionEvent != null) {
                if (motionEvent2 != null) {
                    if (motionEvent.getPointerCount() <= 1) {
                        if (motionEvent2.getPointerCount() <= 1) {
                            if (this.f48685a.f57450b.isInProgress()) {
                                return false;
                            }
                            return this.f48685a.m66622a(motionEvent, motionEvent2, f, f2);
                        }
                    }
                    return false;
                }
            }
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.f48685a.f57458j && motionEvent != null) {
                if (motionEvent2 != null) {
                    if (motionEvent.getPointerCount() <= 1) {
                        if (motionEvent2.getPointerCount() <= 1) {
                            if (!this.f48685a.f57450b.isInProgress() && SystemClock.uptimeMillis() - this.f48685a.f57459k > 150) {
                                return this.f48685a.m66625b(motionEvent, motionEvent2, f, f2);
                            }
                            return false;
                        }
                    }
                    return false;
                }
            }
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return this.f48685a.m66627d(motionEvent);
        }

        public boolean onDown(MotionEvent motionEvent) {
            if (ImageViewTouchBase.f54170l) {
                Log.i("ImageViewTouchBase", "onDown");
            }
            this.f48685a.m63802g();
            return this.f48685a.m66624b(motionEvent);
        }
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$b */
    public class C15759b extends SimpleOnScaleGestureListener {
        /* renamed from: a */
        protected boolean f48686a = null;
        /* renamed from: b */
        final /* synthetic */ ImageViewTouch f48687b;

        public C15759b(ImageViewTouch imageViewTouch) {
            this.f48687b = imageViewTouch;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = this.f48687b.getScale() * scaleGestureDetector.getScaleFactor();
            if (this.f48687b.f57457i) {
                if (this.f48686a && currentSpan != 0.0f) {
                    this.f48687b.q = true;
                    this.f48687b.m63794c(Math.min(this.f48687b.getMaxScale(), Math.max(scale, this.f48687b.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    this.f48687b.f57453e = 1;
                    this.f48687b.invalidate();
                    return true;
                } else if (this.f48686a == null) {
                    this.f48686a = true;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public boolean m66621a(MotionEvent motionEvent) {
        return true;
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    protected void mo13595a(Context context, AttributeSet attributeSet, int i) {
        super.mo13595a(context, attributeSet, i);
        this.f57452d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f57454f = getGestureListener();
        this.f57455g = getScaleListener();
        this.f57450b = new ScaleGestureDetector(getContext(), this.f57455g);
        this.f57451c = new GestureDetector(getContext(), this.f57454f, null, true);
        this.f57453e = 1;
        setQuickScaleEnabled(null);
    }

    @TargetApi(19)
    public void setQuickScaleEnabled(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f57450b.setQuickScaleEnabled(z);
        }
    }

    @TargetApi(19)
    public boolean getQuickScaleEnabled() {
        return VERSION.SDK_INT >= 19 ? this.f57450b.isQuickScaleEnabled() : false;
    }

    public float getScaleFactor() {
        return this.f57449a;
    }

    public void setDoubleTapListener(OnImageViewTouchDoubleTapListener onImageViewTouchDoubleTapListener) {
        this.f57447K = onImageViewTouchDoubleTapListener;
    }

    public void setSingleTapListener(OnImageViewTouchSingleTapListener onImageViewTouchSingleTapListener) {
        this.f57448L = onImageViewTouchSingleTapListener;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f57456h = z;
    }

    public void setScaleEnabled(boolean z) {
        this.f57457i = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f57458j = z;
    }

    public boolean getDoubleTapEnabled() {
        return this.f57456h;
    }

    protected OnGestureListener getGestureListener() {
        return new C15758a(this);
    }

    protected OnScaleGestureListener getScaleListener() {
        return new C15759b(this);
    }

    /* renamed from: a */
    protected void mo13594a(int i, int i2, int i3, int i4) {
        super.mo13594a(i, i2, i3, i4);
        i2 = new StringBuilder();
        i2.append("min: ");
        i2.append(getMinScale());
        i2.append(", max: ");
        i2.append(getMaxScale());
        i2.append(", result: ");
        i2.append((getMaxScale() - getMinScale()) / 1073741824);
        Log.v("ImageViewTouchBase", i2.toString());
        this.f57449a = ((getMaxScale() - getMinScale()) / 1073741824) + 1056964608;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return null;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6) {
            this.f57459k = motionEvent.getEventTime();
        }
        this.f57450b.onTouchEvent(motionEvent);
        if (!this.f57450b.isInProgress()) {
            this.f57451c.onTouchEvent(motionEvent);
        }
        if (actionMasked != 1) {
            return true;
        }
        return m66626c(motionEvent);
    }

    /* renamed from: a */
    protected float m66618a(float f, float f2, float f3) {
        return this.f57449a + f <= f2 ? f + this.f57449a : f3;
    }

    /* renamed from: a */
    public boolean m66622a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (m66623b() == null) {
            return null;
        }
        this.q = true;
        m63786b(-f, -f2);
        invalidate();
        return true;
    }

    /* renamed from: b */
    public boolean m66625b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!m66623b()) {
            return false;
        }
        if (l) {
            Log.i("ImageViewTouchBase", "onFling");
        }
        if (Math.abs(f) <= ((float) (this.B * 4))) {
            if (Math.abs(f2) <= ((float) (this.B * 4))) {
                return false;
            }
        }
        if (l) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("velocity: ");
            stringBuilder.append(f2);
            Log.v("ImageViewTouchBase", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("diff: ");
            stringBuilder.append(motionEvent2.getY() - motionEvent.getY());
            Log.v("ImageViewTouchBase", stringBuilder.toString());
        }
        motionEvent = Math.min(Math.max(2.0f, getScale() / 1073741824), 3.0f);
        f = (f / ((float) this.C)) * (((float) getWidth()) * motionEvent);
        f2 = (f2 / ((float) this.C)) * (((float) getHeight()) * motionEvent);
        if (l != null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("scale: ");
            stringBuilder2.append(getScale());
            stringBuilder2.append(", scale_final: ");
            stringBuilder2.append(motionEvent);
            Log.v("ImageViewTouchBase", stringBuilder2.toString());
            motionEvent2 = new StringBuilder();
            motionEvent2.append("scaledDistanceX: ");
            motionEvent2.append(f);
            Log.v("ImageViewTouchBase", motionEvent2.toString());
            motionEvent2 = new StringBuilder();
            motionEvent2.append("scaledDistanceY: ");
            motionEvent2.append(f2);
            Log.v("ImageViewTouchBase", motionEvent2.toString());
        }
        this.q = true;
        m63775a(f, f2, (long) Math.min(Math.max(300.0d, Math.sqrt(Math.pow((double) f, 2.0d) + Math.pow((double) f2, 2.0d)) / 5.0d), 800.0d));
        postInvalidate();
        return true;
    }

    /* renamed from: b */
    public boolean m66624b(MotionEvent motionEvent) {
        return getBitmapChanged() != null ? null : true;
    }

    /* renamed from: c */
    public boolean m66626c(MotionEvent motionEvent) {
        if (getBitmapChanged() != null) {
            return null;
        }
        if (getScale() < getMinScale()) {
            m63776a((float) getMinScale(), 50);
        }
        return true;
    }

    /* renamed from: d */
    public boolean m66627d(MotionEvent motionEvent) {
        return getBitmapChanged() != null ? null : true;
    }

    /* renamed from: b */
    public boolean m66623b() {
        if (getScale() > 1.0f) {
            return true;
        }
        return this.I.contains(getBitmapRect()) ^ true;
    }
}
