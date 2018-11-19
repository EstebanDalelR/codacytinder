package com.tinder.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import java.math.BigDecimal;

public class RangeSeekBar<T extends Number> extends ImageView {
    /* renamed from: a */
    public static final int f47796a = Color.argb(255, 51, 181, 229);
    /* renamed from: A */
    private int f47797A = -7829368;
    /* renamed from: B */
    private int f47798B = f47796a;
    /* renamed from: b */
    final double f47799b;
    /* renamed from: c */
    private final Paint f47800c = new Paint(1);
    /* renamed from: d */
    private final Paint f47801d = new Paint(1);
    /* renamed from: e */
    private Bitmap f47802e;
    /* renamed from: f */
    private Bitmap f47803f;
    /* renamed from: g */
    private float f47804g;
    /* renamed from: h */
    private float f47805h;
    /* renamed from: i */
    private float f47806i;
    /* renamed from: j */
    private float f47807j;
    @NonNull
    /* renamed from: k */
    private T f47808k;
    @NonNull
    /* renamed from: l */
    private T f47809l;
    @NonNull
    /* renamed from: m */
    private NumberType f47810m;
    /* renamed from: n */
    private double f47811n;
    /* renamed from: o */
    private double f47812o;
    /* renamed from: p */
    private int f47813p = 255;
    /* renamed from: q */
    private float f47814q;
    /* renamed from: r */
    private double f47815r = 0.0d;
    /* renamed from: s */
    private double f47816s = 1.0d;
    @Nullable
    /* renamed from: t */
    private Thumb f47817t = null;
    /* renamed from: u */
    private boolean f47818u = null;
    /* renamed from: v */
    private OnRangeSeekBarChangeListener<T> f47819v;
    /* renamed from: w */
    private RectF f47820w;
    /* renamed from: x */
    private float f47821x;
    /* renamed from: y */
    private int f47822y;
    /* renamed from: z */
    private boolean f47823z;

    private enum NumberType {
        LONG,
        DOUBLE,
        INTEGER,
        FLOAT,
        SHORT,
        BYTE,
        BIG_DECIMAL;

        @NonNull
        public static <E extends Number> NumberType fromNumber(E e) throws IllegalArgumentException {
            if (e instanceof Long) {
                return LONG;
            }
            if (e instanceof Double) {
                return DOUBLE;
            }
            if (e instanceof Integer) {
                return INTEGER;
            }
            if (e instanceof Float) {
                return FLOAT;
            }
            if (e instanceof Short) {
                return SHORT;
            }
            if (e instanceof Byte) {
                return BYTE;
            }
            if (e instanceof BigDecimal) {
                return BIG_DECIMAL;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Number class '");
            stringBuilder.append(e.getClass().getName());
            stringBuilder.append("' is not supported");
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Number toNumber(double d) {
            switch (this) {
                case LONG:
                    return Long.valueOf((long) d);
                case DOUBLE:
                    return Double.valueOf(d);
                case INTEGER:
                    return Integer.valueOf((int) d);
                case FLOAT:
                    return Float.valueOf((float) d);
                case SHORT:
                    return Short.valueOf((short) ((int) d));
                case BYTE:
                    return Byte.valueOf((byte) ((int) d));
                case BIG_DECIMAL:
                    return new BigDecimal(d);
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("can't convert ");
                    stringBuilder.append(this);
                    stringBuilder.append(" to a Number object");
                    throw new InstantiationError(stringBuilder.toString());
            }
        }
    }

    public interface OnRangeSeekBarChangeListener<T> {
        void onRangeSeekBarValuesChanged(RangeSeekBar<?> rangeSeekBar, T t, T t2);
    }

    private enum Thumb {
        MIN,
        MAX
    }

    public RangeSeekBar(@NonNull BitmapDrawable bitmapDrawable, @NonNull BitmapDrawable bitmapDrawable2, @NonNull T t, @NonNull T t2, @NonNull T t3, Context context) throws IllegalArgumentException {
        super(context);
        this.f47802e = m57908a(bitmapDrawable);
        this.f47803f = m57908a(bitmapDrawable2);
        this.f47804g = (float) this.f47802e.getWidth();
        this.f47805h = this.f47804g * 1056964608;
        this.f47807j = ((float) this.f47802e.getHeight()) * 1056964608;
        this.f47814q = this.f47807j * 1050253722;
        this.f47808k = t;
        this.f47809l = t2;
        this.f47811n = t.doubleValue();
        this.f47812o = t2.doubleValue();
        this.f47799b = m57907a((Number) t3);
        this.f47810m = NumberType.fromNumber(t);
        setFocusable(true);
        setFocusableInTouchMode(true);
        m57917c();
        this.f47820w = new RectF(this.f47806i, (((float) getHeight()) - this.f47814q) * 1056964608, ((float) getWidth()) - this.f47806i, (((float) getHeight()) + this.f47814q) * 1056964608);
    }

    public void setSliderPrimaryColor(int i) {
        this.f47798B = i;
    }

    public void setSliderSecondaryColor(int i) {
        this.f47797A = i;
    }

    public void setLineHeight(float f) {
        this.f47814q = f;
        this.f47820w = new RectF(this.f47806i, (((float) getHeight()) - this.f47814q) * 0.5f, ((float) getWidth()) - this.f47806i, (((float) getHeight()) + this.f47814q) * 0.5f);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.f47806i = this.f47805h + ((float) i);
    }

    /* renamed from: c */
    private void m57917c() {
        this.f47822y = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public void setNotifyWhileDragging(boolean z) {
        this.f47818u = z;
    }

    @NonNull
    public T getAbsoluteMinValue() {
        return this.f47808k;
    }

    @NonNull
    public T getAbsoluteMaxValue() {
        return this.f47809l;
    }

    @NonNull
    public T getSelectedMinValue() {
        return m57910a(this.f47815r);
    }

    public void setSelectedMinValue(@NonNull T t) {
        if (0.0d == this.f47812o - this.f47811n) {
            setNormalizedMinValue(0.0d);
        } else {
            setNormalizedMinValue(m57907a((Number) t));
        }
    }

    @NonNull
    public T getSelectedMaxValue() {
        return m57910a(this.f47816s);
    }

    public void setSelectedMaxValue(@NonNull T t) {
        if (0.0d == this.f47812o - this.f47811n) {
            setmNormalizedMaxValue(1.0d);
        } else {
            setmNormalizedMaxValue(m57907a((Number) t));
        }
    }

    public void setOnRangeSeekBarChangeListener(OnRangeSeekBarChangeListener<T> onRangeSeekBarChangeListener) {
        this.f47819v = onRangeSeekBarChangeListener;
    }

    public void setThumbColor(int i) {
        this.f47801d.setColorFilter(new PorterDuffColorFilter(i, Mode.SRC_IN));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f47806i = ((float) getPaddingLeft()) + this.f47805h;
        super.onLayout(z, i, i2, i3, i4);
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f47813p = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
                this.f47821x = motionEvent.getX(motionEvent.findPointerIndex(this.f47813p));
                this.f47817t = m57909a(this.f47821x);
                if (this.f47817t != null) {
                    setPressed(true);
                    invalidate();
                    m57919a();
                    m57916b(motionEvent);
                    m57918d();
                    break;
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                if (this.f47823z) {
                    m57916b(motionEvent);
                    m57920b();
                    setPressed(false);
                } else {
                    m57919a();
                    m57916b(motionEvent);
                    m57920b();
                }
                this.f47817t = null;
                invalidate();
                if (this.f47819v != null) {
                    this.f47819v.onRangeSeekBarValuesChanged(this, getSelectedMinValue(), getSelectedMaxValue());
                    break;
                }
                break;
            case 2:
                if (this.f47817t != null) {
                    if (this.f47823z) {
                        m57916b(motionEvent);
                    } else if (Math.abs(motionEvent.getX(motionEvent.findPointerIndex(this.f47813p)) - this.f47821x) > ((float) this.f47822y)) {
                        setPressed(true);
                        invalidate();
                        m57919a();
                        m57916b(motionEvent);
                        m57918d();
                    }
                    if (!(this.f47818u == null || this.f47819v == null)) {
                        this.f47819v.onRangeSeekBarValuesChanged(this, getSelectedMinValue(), getSelectedMaxValue());
                        break;
                    }
                }
                break;
            case 3:
                if (this.f47823z != null) {
                    m57920b();
                    setPressed(false);
                }
                invalidate();
                break;
            case 5:
                int pointerCount = motionEvent.getPointerCount() - 1;
                this.f47821x = motionEvent.getX(pointerCount);
                this.f47813p = motionEvent.getPointerId(pointerCount);
                invalidate();
                break;
            case 6:
                m57912a(motionEvent);
                invalidate();
                break;
            default:
                break;
        }
        return true;
    }

    @NonNull
    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", this.f47815r);
        bundle.putDouble("MAX", this.f47816s);
        return bundle;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("SUPER"));
        this.f47815r = bundle.getDouble("MIN");
        this.f47816s = bundle.getDouble("MAX");
    }

    /* renamed from: a */
    private void m57912a(@NonNull MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f47813p) {
            action = action == 0 ? 1 : 0;
            this.f47821x = motionEvent.getX(action);
            this.f47813p = motionEvent.getPointerId(action);
        }
    }

    /* renamed from: b */
    private void m57916b(@NonNull MotionEvent motionEvent) {
        float x = motionEvent.getX(motionEvent.findPointerIndex(this.f47813p));
        if (Thumb.MIN.equals(this.f47817t)) {
            setNormalizedMinValue(m57914b(x));
        } else if (Thumb.MAX.equals(this.f47817t)) {
            setmNormalizedMaxValue(m57914b(x));
        }
    }

    /* renamed from: d */
    private void m57918d() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    /* renamed from: a */
    void m57919a() {
        this.f47823z = true;
    }

    /* renamed from: b */
    void m57920b() {
        this.f47823z = false;
    }

    protected synchronized void onMeasure(int i, int i2) {
        int i3 = Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        if (MeasureSpec.getMode(i) != 0) {
            i3 = MeasureSpec.getSize(i);
        }
        i = this.f47802e.getHeight();
        if (MeasureSpec.getMode(i2) != 0) {
            i = Math.min(i, MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(i3, i);
    }

    protected synchronized void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        this.f47820w.left = this.f47806i;
        this.f47820w.right = ((float) getWidth()) - this.f47806i;
        this.f47820w.top = (((float) getHeight()) - this.f47814q) * 0.5f;
        this.f47820w.bottom = (((float) getHeight()) + this.f47814q) * 0.5f;
        this.f47800c.setStyle(Style.FILL);
        this.f47800c.setColor(this.f47797A);
        this.f47800c.setAntiAlias(true);
        canvas.drawRect(this.f47820w, this.f47800c);
        this.f47820w.left = m57915b(this.f47815r);
        this.f47820w.right = m57915b(this.f47816s);
        this.f47800c.setColor(this.f47798B);
        canvas.drawRect(this.f47820w, this.f47800c);
        m57911a(m57915b(this.f47815r), Thumb.MIN.equals(this.f47817t), canvas);
        m57911a(m57915b(this.f47816s), Thumb.MAX.equals(this.f47817t), canvas);
    }

    /* renamed from: a */
    private void m57911a(float f, boolean z, @NonNull Canvas canvas) {
        canvas.drawBitmap(z ? this.f47803f : this.f47802e, f - this.f47805h, (((float) getHeight()) * 0.5f) - this.f47807j, this.f47801d);
    }

    @Nullable
    /* renamed from: a */
    private Thumb m57909a(float f) {
        boolean a = m57913a(f, this.f47815r);
        boolean a2 = m57913a(f, this.f47816s);
        if (a && a2) {
            return f / ((float) getWidth()) > 0.5f ? Thumb.MIN : Thumb.MAX;
        } else {
            if (a) {
                return Thumb.MIN;
            }
            return a2 ? Thumb.MAX : 0.0f;
        }
    }

    /* renamed from: a */
    private boolean m57913a(float f, double d) {
        return Math.abs(f - m57915b(d)) <= this.f47804g;
    }

    public void setNormalizedMinValue(double d) {
        this.f47815r = Math.max(0.0d, Math.min(1.0d, Math.min(d, Math.min(this.f47816s, this.f47799b))));
        invalidate();
    }

    public void setmNormalizedMaxValue(double d) {
        this.f47816s = Math.max(0.0d, Math.min(1.0d, Math.max(d, this.f47815r)));
        invalidate();
    }

    @NonNull
    /* renamed from: a */
    private T m57910a(double d) {
        return this.f47810m.toNumber(this.f47811n + (d * (this.f47812o - this.f47811n)));
    }

    /* renamed from: a */
    private double m57907a(@NonNull T t) {
        if (0.0d == this.f47812o - this.f47811n) {
            return 0.0d;
        }
        return (t.doubleValue() - this.f47811n) / (this.f47812o - this.f47811n);
    }

    /* renamed from: b */
    private float m57915b(double d) {
        return (float) (((double) this.f47806i) + (d * ((double) (((float) getWidth()) - (this.f47806i * 2.0f)))));
    }

    /* renamed from: b */
    private double m57914b(float f) {
        float width = (float) getWidth();
        if (width <= this.f47806i * 2.0f) {
            return 0.0d;
        }
        return Math.min(1.0d, Math.max(0.0d, (double) ((f - this.f47806i) / (width - (this.f47806i * 2.0f)))));
    }

    @NonNull
    /* renamed from: a */
    private Bitmap m57908a(@NonNull BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable.getBitmap() != null) {
            return bitmapDrawable.getBitmap();
        }
        throw new IllegalArgumentException("BitmapDrawable cannot be null");
    }
}
