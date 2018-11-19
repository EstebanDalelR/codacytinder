package com.viewpagerindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.C0597f;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;

public class LinePageIndicator extends View implements PageIndicator {
    /* renamed from: a */
    private final Paint f56711a;
    /* renamed from: b */
    private final Paint f56712b;
    /* renamed from: c */
    private ViewPager f56713c;
    /* renamed from: d */
    private OnPageChangeListener f56714d;
    /* renamed from: e */
    private int f56715e;
    /* renamed from: f */
    private boolean f56716f;
    /* renamed from: g */
    private float f56717g;
    /* renamed from: h */
    private float f56718h;
    /* renamed from: i */
    private int f56719i;
    /* renamed from: j */
    private float f56720j;
    /* renamed from: k */
    private int f56721k;
    /* renamed from: l */
    private boolean f56722l;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C154941();
        int currentPage;

        /* renamed from: com.viewpagerindicator.LinePageIndicator$SavedState$1 */
        static class C154941 implements Creator<SavedState> {
            C154941() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m57973a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m57974a(i);
            }

            /* renamed from: a */
            public SavedState m57973a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m57974a(int i) {
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

    public void setCentered(boolean z) {
        this.f56716f = z;
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f56711a.setColor(i);
        invalidate();
    }

    public int getUnselectedColor() {
        return this.f56711a.getColor();
    }

    public void setSelectedColor(int i) {
        this.f56712b.setColor(i);
        invalidate();
    }

    public int getSelectedColor() {
        return this.f56712b.getColor();
    }

    public void setLineWidth(float f) {
        this.f56717g = f;
        invalidate();
    }

    public float getLineWidth() {
        return this.f56717g;
    }

    public void setStrokeWidth(float f) {
        this.f56712b.setStrokeWidth(f);
        this.f56711a.setStrokeWidth(f);
        invalidate();
    }

    public float getStrokeWidth() {
        return this.f56712b.getStrokeWidth();
    }

    public void setGapWidth(float f) {
        this.f56718h = f;
        invalidate();
    }

    public float getGapWidth() {
        return this.f56718h;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f56713c != null) {
            int count = this.f56713c.getAdapter().getCount();
            if (count != 0) {
                if (this.f56715e >= count) {
                    setCurrentItem(count - 1);
                    return;
                }
                float f = this.f56717g + this.f56718h;
                float f2 = (((float) count) * f) - this.f56718h;
                float paddingTop = (float) getPaddingTop();
                float paddingLeft = (float) getPaddingLeft();
                float paddingRight = (float) getPaddingRight();
                paddingTop += ((((float) getHeight()) - paddingTop) - ((float) getPaddingBottom())) / 2.0f;
                if (this.f56716f) {
                    paddingLeft += (((((float) getWidth()) - paddingLeft) - paddingRight) / 2.0f) - (f2 / 2.0f);
                }
                int i = 0;
                while (i < count) {
                    float f3 = paddingLeft + (((float) i) * f);
                    canvas.drawLine(f3, paddingTop, f3 + this.f56717g, paddingTop, i == this.f56715e ? this.f56712b : this.f56711a);
                    i++;
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int i = 0;
        if (this.f56713c != null) {
            if (this.f56713c.getAdapter().getCount() != 0) {
                int action = motionEvent.getAction() & 255;
                switch (action) {
                    case 0:
                        this.f56721k = C0597f.b(motionEvent, 0);
                        this.f56720j = motionEvent.getX();
                        break;
                    case 1:
                    case 3:
                        if (!this.f56722l) {
                            int count = this.f56713c.getAdapter().getCount();
                            float width = (float) getWidth();
                            float f = width / 2.0f;
                            width /= 6.0f;
                            if (this.f56715e > 0 && motionEvent.getX() < f - width) {
                                if (action != 3) {
                                    this.f56713c.setCurrentItem(this.f56715e - 1);
                                }
                                return true;
                            } else if (this.f56715e < count - 1 && motionEvent.getX() > f + width) {
                                if (action != 3) {
                                    this.f56713c.setCurrentItem(this.f56715e + 1);
                                }
                                return true;
                            }
                        }
                        this.f56722l = false;
                        this.f56721k = -1;
                        if (this.f56713c.isFakeDragging() != null) {
                            this.f56713c.endFakeDrag();
                            break;
                        }
                        break;
                    case 2:
                        motionEvent = C0597f.c(motionEvent, C0597f.a(motionEvent, this.f56721k));
                        float f2 = motionEvent - this.f56720j;
                        if (!this.f56722l && Math.abs(f2) > ((float) this.f56719i)) {
                            this.f56722l = true;
                        }
                        if (this.f56722l) {
                            this.f56720j = motionEvent;
                            if (!(this.f56713c.isFakeDragging() == null && this.f56713c.beginFakeDrag() == null)) {
                                this.f56713c.fakeDragBy(f2);
                                break;
                            }
                        }
                        break;
                    case 5:
                        action = C0597f.b(motionEvent);
                        this.f56720j = C0597f.c(motionEvent, action);
                        this.f56721k = C0597f.b(motionEvent, action);
                        break;
                    case 6:
                        action = C0597f.b(motionEvent);
                        if (C0597f.b(motionEvent, action) == this.f56721k) {
                            if (action == 0) {
                                i = 1;
                            }
                            this.f56721k = C0597f.b(motionEvent, i);
                        }
                        this.f56720j = C0597f.c(motionEvent, C0597f.a(motionEvent, this.f56721k));
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
        if (this.f56713c != viewPager) {
            if (this.f56713c != null) {
                this.f56713c.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f56713c = viewPager;
            this.f56713c.setOnPageChangeListener(this);
            invalidate();
        }
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public void setCurrentItem(int i) {
        if (this.f56713c == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f56713c.setCurrentItem(i);
        this.f56715e = i;
        invalidate();
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    public void onPageScrollStateChanged(int i) {
        if (this.f56714d != null) {
            this.f56714d.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f56714d != null) {
            this.f56714d.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        this.f56715e = i;
        invalidate();
        if (this.f56714d != null) {
            this.f56714d.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f56714d = onPageChangeListener;
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(m66312a(i), m66313b(i2));
    }

    /* renamed from: a */
    private int m66312a(int i) {
        float paddingLeft;
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            if (this.f56713c != null) {
                int count = this.f56713c.getAdapter().getCount();
                paddingLeft = (((float) (getPaddingLeft() + getPaddingRight())) + (((float) count) * this.f56717g)) + (((float) (count - 1)) * this.f56718h);
                if (mode == Integer.MIN_VALUE) {
                    paddingLeft = Math.min(paddingLeft, (float) i);
                }
                return (int) Math.ceil((double) paddingLeft);
            }
        }
        paddingLeft = (float) i;
        return (int) Math.ceil((double) paddingLeft);
    }

    /* renamed from: b */
    private int m66313b(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i = (float) i;
        } else {
            int strokeWidth = (this.f56712b.getStrokeWidth() + ((float) getPaddingTop())) + ((float) getPaddingBottom());
            i = mode == Integer.MIN_VALUE ? Math.min(strokeWidth, (float) i) : strokeWidth;
        }
        return (int) Math.ceil((double) i);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f56715e = savedState.currentPage;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f56715e;
        return savedState;
    }
}
