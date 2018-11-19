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

public class UnderlinePageIndicator extends View implements PageIndicator {
    /* renamed from: a */
    private final Paint f56759a;
    /* renamed from: b */
    private boolean f56760b;
    /* renamed from: c */
    private int f56761c;
    /* renamed from: d */
    private int f56762d;
    /* renamed from: e */
    private int f56763e;
    /* renamed from: f */
    private ViewPager f56764f;
    /* renamed from: g */
    private OnPageChangeListener f56765g;
    /* renamed from: h */
    private int f56766h;
    /* renamed from: i */
    private int f56767i;
    /* renamed from: j */
    private float f56768j;
    /* renamed from: k */
    private int f56769k;
    /* renamed from: l */
    private float f56770l;
    /* renamed from: m */
    private int f56771m;
    /* renamed from: n */
    private boolean f56772n;
    /* renamed from: o */
    private final Runnable f56773o;

    /* renamed from: com.viewpagerindicator.UnderlinePageIndicator$1 */
    class C154991 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UnderlinePageIndicator f47939a;

        public void run() {
            if (this.f47939a.f56760b) {
                int max = Math.max(this.f47939a.f56759a.getAlpha() - this.f47939a.f56763e, 0);
                this.f47939a.f56759a.setAlpha(max);
                this.f47939a.invalidate();
                if (max > 0) {
                    this.f47939a.postDelayed(this, 30);
                }
            }
        }
    }

    /* renamed from: com.viewpagerindicator.UnderlinePageIndicator$2 */
    class C155002 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ UnderlinePageIndicator f47940a;

        C155002(UnderlinePageIndicator underlinePageIndicator) {
            this.f47940a = underlinePageIndicator;
        }

        public void run() {
            if (this.f47940a.f56760b) {
                this.f47940a.post(this.f47940a.f56773o);
            }
        }
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C155011();
        int currentPage;

        /* renamed from: com.viewpagerindicator.UnderlinePageIndicator$SavedState$1 */
        static class C155011 implements Creator<SavedState> {
            C155011() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m57978a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m57979a(i);
            }

            /* renamed from: a */
            public SavedState m57978a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m57979a(int i) {
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

    public boolean getFades() {
        return this.f56760b;
    }

    public void setFades(boolean z) {
        if (z != this.f56760b) {
            this.f56760b = z;
            if (z) {
                post(this.f56773o);
                return;
            }
            removeCallbacks(this.f56773o);
            this.f56759a.setAlpha(255);
            invalidate();
        }
    }

    public int getFadeDelay() {
        return this.f56761c;
    }

    public void setFadeDelay(int i) {
        this.f56761c = i;
    }

    public int getFadeLength() {
        return this.f56762d;
    }

    public void setFadeLength(int i) {
        this.f56762d = i;
        this.f56763e = 255 / (this.f56762d / 30);
    }

    public int getSelectedColor() {
        return this.f56759a.getColor();
    }

    public void setSelectedColor(int i) {
        this.f56759a.setColor(i);
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f56764f != null) {
            int count = this.f56764f.getAdapter().getCount();
            if (count != 0) {
                if (this.f56767i >= count) {
                    setCurrentItem(count - 1);
                    return;
                }
                int paddingLeft = getPaddingLeft();
                float width = ((float) ((getWidth() - paddingLeft) - getPaddingRight())) / (((float) count) * 1.0f);
                float f = ((float) paddingLeft) + ((((float) this.f56767i) + this.f56768j) * width);
                Canvas canvas2 = canvas;
                canvas2.drawRect(f, (float) getPaddingTop(), f + width, (float) (getHeight() - getPaddingBottom()), this.f56759a);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int i = 0;
        if (this.f56764f != null) {
            if (this.f56764f.getAdapter().getCount() != 0) {
                int action = motionEvent.getAction() & 255;
                switch (action) {
                    case 0:
                        this.f56771m = C0597f.b(motionEvent, 0);
                        this.f56770l = motionEvent.getX();
                        break;
                    case 1:
                    case 3:
                        if (!this.f56772n) {
                            int count = this.f56764f.getAdapter().getCount();
                            float width = (float) getWidth();
                            float f = width / 2.0f;
                            width /= 6.0f;
                            if (this.f56767i > 0 && motionEvent.getX() < f - width) {
                                if (action != 3) {
                                    this.f56764f.setCurrentItem(this.f56767i - 1);
                                }
                                return true;
                            } else if (this.f56767i < count - 1 && motionEvent.getX() > f + width) {
                                if (action != 3) {
                                    this.f56764f.setCurrentItem(this.f56767i + 1);
                                }
                                return true;
                            }
                        }
                        this.f56772n = false;
                        this.f56771m = -1;
                        if (this.f56764f.isFakeDragging() != null) {
                            this.f56764f.endFakeDrag();
                            break;
                        }
                        break;
                    case 2:
                        motionEvent = C0597f.c(motionEvent, C0597f.a(motionEvent, this.f56771m));
                        float f2 = motionEvent - this.f56770l;
                        if (!this.f56772n && Math.abs(f2) > ((float) this.f56769k)) {
                            this.f56772n = true;
                        }
                        if (this.f56772n) {
                            this.f56770l = motionEvent;
                            if (!(this.f56764f.isFakeDragging() == null && this.f56764f.beginFakeDrag() == null)) {
                                this.f56764f.fakeDragBy(f2);
                                break;
                            }
                        }
                        break;
                    case 5:
                        action = C0597f.b(motionEvent);
                        this.f56770l = C0597f.c(motionEvent, action);
                        this.f56771m = C0597f.b(motionEvent, action);
                        break;
                    case 6:
                        action = C0597f.b(motionEvent);
                        if (C0597f.b(motionEvent, action) == this.f56771m) {
                            if (action == 0) {
                                i = 1;
                            }
                            this.f56771m = C0597f.b(motionEvent, i);
                        }
                        this.f56770l = C0597f.c(motionEvent, C0597f.a(motionEvent, this.f56771m));
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
        if (this.f56764f != viewPager) {
            if (this.f56764f != null) {
                this.f56764f.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f56764f = viewPager;
            this.f56764f.setOnPageChangeListener(this);
            invalidate();
            post(new C155002(this));
        }
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public void setCurrentItem(int i) {
        if (this.f56764f == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f56764f.setCurrentItem(i);
        this.f56767i = i;
        invalidate();
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    public void onPageScrollStateChanged(int i) {
        this.f56766h = i;
        if (this.f56765g != null) {
            this.f56765g.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f56767i = i;
        this.f56768j = f;
        if (this.f56760b) {
            if (i2 > 0) {
                removeCallbacks(this.f56773o);
                this.f56759a.setAlpha(255);
            } else if (this.f56766h != 1) {
                postDelayed(this.f56773o, (long) this.f56761c);
            }
        }
        invalidate();
        if (this.f56765g != null) {
            this.f56765g.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        if (this.f56766h == 0) {
            this.f56767i = i;
            this.f56768j = 0.0f;
            invalidate();
            this.f56773o.run();
        }
        if (this.f56765g != null) {
            this.f56765g.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f56765g = onPageChangeListener;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f56767i = savedState.currentPage;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f56767i;
        return savedState;
    }
}
