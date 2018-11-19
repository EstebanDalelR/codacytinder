package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.C0597f;
import android.support.v4.view.C0602k;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import com.viewpagerindicator.C15509b.C15503a;
import com.viewpagerindicator.C15509b.C15504b;
import com.viewpagerindicator.C15509b.C15505c;
import com.viewpagerindicator.C15509b.C15506d;
import com.viewpagerindicator.C15509b.C15507e;
import com.viewpagerindicator.C15509b.C15508f;

public class CirclePageIndicator extends View implements PageIndicator {
    /* renamed from: a */
    private float f56694a;
    /* renamed from: b */
    private final Paint f56695b;
    /* renamed from: c */
    private final Paint f56696c;
    /* renamed from: d */
    private final Paint f56697d;
    /* renamed from: e */
    private ViewPager f56698e;
    /* renamed from: f */
    private OnPageChangeListener f56699f;
    /* renamed from: g */
    private int f56700g;
    /* renamed from: h */
    private int f56701h;
    /* renamed from: i */
    private float f56702i;
    /* renamed from: j */
    private int f56703j;
    /* renamed from: k */
    private int f56704k;
    /* renamed from: l */
    private boolean f56705l;
    /* renamed from: m */
    private boolean f56706m;
    /* renamed from: n */
    private int f56707n;
    /* renamed from: o */
    private float f56708o;
    /* renamed from: p */
    private int f56709p;
    /* renamed from: q */
    private boolean f56710q;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C154921();
        int currentPage;

        /* renamed from: com.viewpagerindicator.CirclePageIndicator$SavedState$1 */
        static class C154921 implements Creator<SavedState> {
            C154921() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m57971a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m57972a(i);
            }

            /* renamed from: a */
            public SavedState m57971a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m57972a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C15503a.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56695b = new Paint(1);
        this.f56696c = new Paint(1);
        this.f56697d = new Paint(1);
        this.f56708o = -1.0f;
        this.f56709p = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C15505c.default_circle_indicator_page_color);
            int color2 = resources.getColor(C15505c.default_circle_indicator_fill_color);
            int integer = resources.getInteger(C15507e.default_circle_indicator_orientation);
            int color3 = resources.getColor(C15505c.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(C15506d.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(C15506d.default_circle_indicator_radius);
            boolean z = resources.getBoolean(C15504b.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(C15504b.default_circle_indicator_snap);
            attributeSet = context.obtainStyledAttributes(attributeSet, C15508f.CirclePageIndicator, i, 0);
            this.f56705l = attributeSet.getBoolean(C15508f.CirclePageIndicator_centered, z);
            this.f56704k = attributeSet.getInt(C15508f.CirclePageIndicator_android_orientation, integer);
            this.f56695b.setStyle(Style.FILL);
            this.f56695b.setColor(attributeSet.getColor(C15508f.CirclePageIndicator_pageColor, color));
            this.f56696c.setStyle(Style.STROKE);
            this.f56696c.setColor(attributeSet.getColor(C15508f.CirclePageIndicator_strokeColor, color3));
            this.f56696c.setStrokeWidth(attributeSet.getDimension(C15508f.CirclePageIndicator_strokeWidth, dimension));
            this.f56697d.setStyle(Style.FILL);
            this.f56697d.setColor(attributeSet.getColor(C15508f.CirclePageIndicator_fillColor, color2));
            this.f56694a = attributeSet.getDimension(C15508f.CirclePageIndicator_radius, dimension2);
            this.f56706m = attributeSet.getBoolean(C15508f.CirclePageIndicator_snap, z2);
            i = attributeSet.getDrawable(C15508f.CirclePageIndicator_android_background);
            if (i != 0) {
                setBackgroundDrawable(i);
            }
            attributeSet.recycle();
            this.f56707n = C0602k.a(ViewConfiguration.get(context));
        }
    }

    public void setCentered(boolean z) {
        this.f56705l = z;
        invalidate();
    }

    public void setPageColor(int i) {
        this.f56695b.setColor(i);
        invalidate();
    }

    public int getPageColor() {
        return this.f56695b.getColor();
    }

    public void setFillColor(int i) {
        this.f56697d.setColor(i);
        invalidate();
    }

    public int getFillColor() {
        return this.f56697d.getColor();
    }

    public void setOrientation(int i) {
        switch (i) {
            case 0:
            case 1:
                this.f56704k = i;
                requestLayout();
                return;
            default:
                throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
    }

    public int getOrientation() {
        return this.f56704k;
    }

    public void setStrokeColor(int i) {
        this.f56696c.setColor(i);
        invalidate();
    }

    public int getStrokeColor() {
        return this.f56696c.getColor();
    }

    public void setStrokeWidth(float f) {
        this.f56696c.setStrokeWidth(f);
        invalidate();
    }

    public float getStrokeWidth() {
        return this.f56696c.getStrokeWidth();
    }

    public void setRadius(float f) {
        this.f56694a = f;
        invalidate();
    }

    public float getRadius() {
        return this.f56694a;
    }

    public void setSnap(boolean z) {
        this.f56706m = z;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f56698e != null) {
            int count = this.f56698e.getAdapter().getCount();
            if (count != 0) {
                if (this.f56700g >= count) {
                    setCurrentItem(count - 1);
                    return;
                }
                int width;
                int paddingLeft;
                int paddingRight;
                int paddingTop;
                if (this.f56704k == 0) {
                    width = getWidth();
                    paddingLeft = getPaddingLeft();
                    paddingRight = getPaddingRight();
                    paddingTop = getPaddingTop();
                } else {
                    width = getHeight();
                    paddingLeft = getPaddingTop();
                    paddingRight = getPaddingBottom();
                    paddingTop = getPaddingLeft();
                }
                float f = this.f56694a * 3.0f;
                float f2 = ((float) paddingTop) + this.f56694a;
                float f3 = ((float) paddingLeft) + this.f56694a;
                if (this.f56705l) {
                    f3 += (((float) ((width - paddingLeft) - paddingRight)) / 2.0f) - ((((float) count) * f) / 2.0f);
                }
                float f4 = this.f56694a;
                if (this.f56696c.getStrokeWidth() > 0.0f) {
                    f4 -= this.f56696c.getStrokeWidth() / 2.0f;
                }
                for (paddingLeft = 0; paddingLeft < count; paddingLeft++) {
                    float f5;
                    float f6 = (((float) paddingLeft) * f) + f3;
                    if (this.f56704k == 0) {
                        f5 = f2;
                    } else {
                        f5 = f6;
                        f6 = f2;
                    }
                    if (this.f56695b.getAlpha() > 0) {
                        canvas.drawCircle(f6, f5, f4, this.f56695b);
                    }
                    if (f4 != this.f56694a) {
                        canvas.drawCircle(f6, f5, this.f56694a, this.f56696c);
                    }
                }
                float f7 = ((float) (this.f56706m ? this.f56701h : this.f56700g)) * f;
                if (!this.f56706m) {
                    f7 += this.f56702i * f;
                }
                if (this.f56704k == 0) {
                    f7 += f3;
                } else {
                    float f8 = f2;
                    f2 = f7 + f3;
                    f7 = f8;
                }
                canvas.drawCircle(f7, f2, this.f56694a, this.f56697d);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int i = 0;
        if (this.f56698e != null) {
            if (this.f56698e.getAdapter().getCount() != 0) {
                int action = motionEvent.getAction() & 255;
                switch (action) {
                    case 0:
                        this.f56709p = C0597f.b(motionEvent, 0);
                        this.f56708o = motionEvent.getX();
                        break;
                    case 1:
                    case 3:
                        if (!this.f56710q) {
                            int count = this.f56698e.getAdapter().getCount();
                            float width = (float) getWidth();
                            float f = width / 2.0f;
                            width /= 6.0f;
                            if (this.f56700g > 0 && motionEvent.getX() < f - width) {
                                if (action != 3) {
                                    this.f56698e.setCurrentItem(this.f56700g - 1);
                                }
                                return true;
                            } else if (this.f56700g < count - 1 && motionEvent.getX() > f + width) {
                                if (action != 3) {
                                    this.f56698e.setCurrentItem(this.f56700g + 1);
                                }
                                return true;
                            }
                        }
                        this.f56710q = false;
                        this.f56709p = -1;
                        if (this.f56698e.isFakeDragging() != null) {
                            this.f56698e.endFakeDrag();
                            break;
                        }
                        break;
                    case 2:
                        motionEvent = C0597f.c(motionEvent, C0597f.a(motionEvent, this.f56709p));
                        float f2 = motionEvent - this.f56708o;
                        if (!this.f56710q && Math.abs(f2) > ((float) this.f56707n)) {
                            this.f56710q = true;
                        }
                        if (this.f56710q) {
                            this.f56708o = motionEvent;
                            if (!(this.f56698e.isFakeDragging() == null && this.f56698e.beginFakeDrag() == null)) {
                                this.f56698e.fakeDragBy(f2);
                                break;
                            }
                        }
                        break;
                    case 5:
                        action = C0597f.b(motionEvent);
                        this.f56708o = C0597f.c(motionEvent, action);
                        this.f56709p = C0597f.b(motionEvent, action);
                        break;
                    case 6:
                        action = C0597f.b(motionEvent);
                        if (C0597f.b(motionEvent, action) == this.f56709p) {
                            if (action == 0) {
                                i = 1;
                            }
                            this.f56709p = C0597f.b(motionEvent, i);
                        }
                        this.f56708o = C0597f.c(motionEvent, C0597f.a(motionEvent, this.f56709p));
                        break;
                    default:
                        break;
                }
                return true;
            }
        }
        return false;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f56698e != viewPager) {
            if (this.f56698e != null) {
                this.f56698e.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f56698e = viewPager;
            this.f56698e.setOnPageChangeListener(this);
            invalidate();
        }
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public void setCurrentItem(int i) {
        if (this.f56698e == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f56698e.setCurrentItem(i);
        this.f56700g = i;
        invalidate();
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    public void onPageScrollStateChanged(int i) {
        this.f56703j = i;
        if (this.f56699f != null) {
            this.f56699f.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f56700g = i;
        this.f56702i = f;
        invalidate();
        if (this.f56699f != null) {
            this.f56699f.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        if (this.f56706m || this.f56703j == 0) {
            this.f56700g = i;
            this.f56701h = i;
            invalidate();
        }
        if (this.f56699f != null) {
            this.f56699f.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f56699f = onPageChangeListener;
    }

    protected void onMeasure(int i, int i2) {
        if (this.f56704k == 0) {
            setMeasuredDimension(m66310a(i), m66311b(i2));
        } else {
            setMeasuredDimension(m66311b(i), m66310a(i2));
        }
    }

    /* renamed from: a */
    private int m66310a(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return i;
        }
        if (this.f56698e == null) {
            return i;
        }
        int count = this.f56698e.getAdapter().getCount();
        count = (int) (((((float) (getPaddingLeft() + getPaddingRight())) + (((float) (count * 2)) * this.f56694a)) + (((float) (count - 1)) * this.f56694a)) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(count, i) : count;
    }

    /* renamed from: b */
    private int m66311b(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return i;
        }
        int paddingTop = (int) ((((this.f56694a * 2.0f) + ((float) getPaddingTop())) + ((float) getPaddingBottom())) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, i) : paddingTop;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f56700g = savedState.currentPage;
        this.f56701h = savedState.currentPage;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f56700g;
        return savedState;
    }
}
