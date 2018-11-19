package com.viewpagerindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import java.util.ArrayList;

public class TitlePageIndicator extends View implements PageIndicator {
    /* renamed from: A */
    private OnCenterItemClickListener f56732A;
    /* renamed from: a */
    private ViewPager f56733a;
    /* renamed from: b */
    private OnPageChangeListener f56734b;
    /* renamed from: c */
    private int f56735c;
    /* renamed from: d */
    private float f56736d;
    /* renamed from: e */
    private int f56737e;
    /* renamed from: f */
    private final Paint f56738f;
    /* renamed from: g */
    private boolean f56739g;
    /* renamed from: h */
    private int f56740h;
    /* renamed from: i */
    private int f56741i;
    /* renamed from: j */
    private Path f56742j;
    /* renamed from: k */
    private final Rect f56743k;
    /* renamed from: l */
    private final Paint f56744l;
    /* renamed from: m */
    private IndicatorStyle f56745m;
    /* renamed from: n */
    private LinePosition f56746n;
    /* renamed from: o */
    private final Paint f56747o;
    /* renamed from: p */
    private float f56748p;
    /* renamed from: q */
    private float f56749q;
    /* renamed from: r */
    private float f56750r;
    /* renamed from: s */
    private float f56751s;
    /* renamed from: t */
    private float f56752t;
    /* renamed from: u */
    private float f56753u;
    /* renamed from: v */
    private float f56754v;
    /* renamed from: w */
    private int f56755w;
    /* renamed from: x */
    private float f56756x;
    /* renamed from: y */
    private int f56757y;
    /* renamed from: z */
    private boolean f56758z;

    public enum IndicatorStyle {
        None(0),
        Triangle(1),
        Underline(2);
        
        public final int value;

        private IndicatorStyle(int i) {
            this.value = i;
        }

        public static IndicatorStyle fromValue(int i) {
            for (IndicatorStyle indicatorStyle : values()) {
                if (indicatorStyle.value == i) {
                    return indicatorStyle;
                }
            }
            return 0;
        }
    }

    public enum LinePosition {
        Bottom(0),
        Top(1);
        
        public final int value;

        private LinePosition(int i) {
            this.value = i;
        }

        public static LinePosition fromValue(int i) {
            for (LinePosition linePosition : values()) {
                if (linePosition.value == i) {
                    return linePosition;
                }
            }
            return 0;
        }
    }

    public interface OnCenterItemClickListener {
        void onCenterItemClick(int i);
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C154981();
        int currentPage;

        /* renamed from: com.viewpagerindicator.TitlePageIndicator$SavedState$1 */
        static class C154981 implements Creator<SavedState> {
            C154981() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m57976a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m57977a(i);
            }

            /* renamed from: a */
            public SavedState m57976a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m57977a(int i) {
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

    public int getFooterColor() {
        return this.f56744l.getColor();
    }

    public void setFooterColor(int i) {
        this.f56744l.setColor(i);
        this.f56747o.setColor(i);
        invalidate();
    }

    public float getFooterLineHeight() {
        return this.f56754v;
    }

    public void setFooterLineHeight(float f) {
        this.f56754v = f;
        this.f56744l.setStrokeWidth(this.f56754v);
        invalidate();
    }

    public float getFooterIndicatorHeight() {
        return this.f56748p;
    }

    public void setFooterIndicatorHeight(float f) {
        this.f56748p = f;
        invalidate();
    }

    public float getFooterIndicatorPadding() {
        return this.f56750r;
    }

    public void setFooterIndicatorPadding(float f) {
        this.f56750r = f;
        invalidate();
    }

    public IndicatorStyle getFooterIndicatorStyle() {
        return this.f56745m;
    }

    public void setFooterIndicatorStyle(IndicatorStyle indicatorStyle) {
        this.f56745m = indicatorStyle;
        invalidate();
    }

    public LinePosition getLinePosition() {
        return this.f56746n;
    }

    public void setLinePosition(LinePosition linePosition) {
        this.f56746n = linePosition;
        invalidate();
    }

    public int getSelectedColor() {
        return this.f56741i;
    }

    public void setSelectedColor(int i) {
        this.f56741i = i;
        invalidate();
    }

    public void setSelectedBold(boolean z) {
        this.f56739g = z;
        invalidate();
    }

    public int getTextColor() {
        return this.f56740h;
    }

    public void setTextColor(int i) {
        this.f56738f.setColor(i);
        this.f56740h = i;
        invalidate();
    }

    public float getTextSize() {
        return this.f56738f.getTextSize();
    }

    public void setTextSize(float f) {
        this.f56738f.setTextSize(f);
        invalidate();
    }

    public float getTitlePadding() {
        return this.f56751s;
    }

    public void setTitlePadding(float f) {
        this.f56751s = f;
        invalidate();
    }

    public float getTopPadding() {
        return this.f56752t;
    }

    public void setTopPadding(float f) {
        this.f56752t = f;
        invalidate();
    }

    public float getClipPadding() {
        return this.f56753u;
    }

    public void setClipPadding(float f) {
        this.f56753u = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f56738f.setTypeface(typeface);
        invalidate();
    }

    public Typeface getTypeface() {
        return this.f56738f.getTypeface();
    }

    protected void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f56733a != null) {
            int count = r0.f56733a.getAdapter().getCount();
            if (count != 0) {
                if (r0.f56735c == -1 && r0.f56733a != null) {
                    r0.f56735c = r0.f56733a.getCurrentItem();
                }
                ArrayList a = m66320a(r0.f56738f);
                int size = a.size();
                if (r0.f56735c >= size) {
                    setCurrentItem(size - 1);
                    return;
                }
                float f;
                Rect rect;
                int i;
                Rect rect2;
                int i2;
                int i3;
                int i4 = count - 1;
                float width = ((float) getWidth()) / 2.0f;
                int left = getLeft();
                float f2 = ((float) left) + r0.f56753u;
                int width2 = getWidth();
                int height = getHeight();
                int i5 = left + width2;
                float f3 = ((float) i5) - r0.f56753u;
                int i6 = r0.f56735c;
                float f4 = width;
                if (((double) r0.f56736d) <= 0.5d) {
                    f = r0.f56736d;
                } else {
                    i6++;
                    f = 1.0f - r0.f56736d;
                }
                int i7 = i6;
                Object obj = f <= 0.25f ? 1 : null;
                Object obj2 = f <= 0.05f ? 1 : null;
                float f5 = (0.25f - f) / 0.25f;
                Rect rect3 = (Rect) a.get(r0.f56735c);
                f = (float) (rect3.right - rect3.left);
                if (((float) rect3.left) < f2) {
                    m66322b(rect3, f, left);
                }
                if (((float) rect3.right) > f3) {
                    m66321a(rect3, f, i5);
                }
                if (r0.f56735c > 0) {
                    i6 = r0.f56735c - 1;
                    while (i6 >= 0) {
                        float f6;
                        rect = (Rect) a.get(i6);
                        if (((float) rect.left) < f2) {
                            f6 = f2;
                            i = rect.right - rect.left;
                            m66322b(rect, (float) i, left);
                            rect2 = (Rect) a.get(i6 + 1);
                            i2 = width2;
                            if (((float) rect.right) + r0.f56751s > ((float) rect2.left)) {
                                rect.left = (int) (((float) (rect2.left - i)) - r0.f56751s);
                                rect.right = rect.left + i;
                            }
                        } else {
                            f6 = f2;
                            i2 = width2;
                        }
                        i6--;
                        f2 = f6;
                        width2 = i2;
                        canvas2 = canvas;
                    }
                }
                i2 = width2;
                if (r0.f56735c < i4) {
                    for (i4 = r0.f56735c + 1; i4 < count; i4++) {
                        rect2 = (Rect) a.get(i4);
                        if (((float) rect2.right) > f3) {
                            i6 = rect2.right - rect2.left;
                            m66321a(rect2, (float) i6, i5);
                            rect = (Rect) a.get(i4 - 1);
                            if (((float) rect2.left) - r0.f56751s < ((float) rect.right)) {
                                rect2.left = (int) (((float) rect.right) + r0.f56751s);
                                rect2.right = rect2.left + i6;
                            }
                        }
                    }
                }
                i = r0.f56740h >>> 24;
                width2 = 0;
                while (width2 < count) {
                    int i8;
                    rect = (Rect) a.get(width2);
                    if ((rect.left <= left || rect.left >= i5) && (rect.right <= left || rect.right >= i5)) {
                        i8 = i5;
                        i3 = i2;
                        i2 = width2;
                    } else {
                        Rect rect4;
                        Object obj3 = width2 == i7 ? 1 : null;
                        CharSequence a2 = m66319a(width2);
                        Paint paint = r0.f56738f;
                        boolean z = (obj3 == null || obj2 == null || !r0.f56739g) ? false : true;
                        paint.setFakeBoldText(z);
                        r0.f56738f.setColor(r0.f56740h);
                        if (!(obj3 == null || obj == null)) {
                            r0.f56738f.setAlpha(i - ((int) (((float) i) * f5)));
                        }
                        if (width2 < size - 1) {
                            rect4 = (Rect) a.get(width2 + 1);
                            if (((float) rect.right) + r0.f56751s > ((float) rect4.left)) {
                                int i9 = rect.right - rect.left;
                                rect.left = (int) (((float) (rect4.left - i9)) - r0.f56751s);
                                rect.right = rect.left + i9;
                            }
                        }
                        CharSequence charSequence = a2;
                        Rect rect5 = rect;
                        i8 = i5;
                        i3 = i2;
                        i2 = width2;
                        canvas.drawText(a2, 0, a2.length(), (float) rect.left, r0.f56752t + ((float) rect.bottom), r0.f56738f);
                        if (!(obj3 == null || obj == null)) {
                            r0.f56738f.setColor(r0.f56741i);
                            r0.f56738f.setAlpha((int) (((float) (r0.f56741i >>> 24)) * f5));
                            CharSequence charSequence2 = charSequence;
                            rect4 = rect5;
                            canvas.drawText(charSequence2, 0, charSequence2.length(), (float) rect4.left, r0.f56752t + ((float) rect4.bottom), r0.f56738f);
                        }
                    }
                    width2 = i2 + 1;
                    i2 = i3;
                    i5 = i8;
                }
                i3 = i2;
                float f7 = r0.f56754v;
                f2 = r0.f56748p;
                if (r0.f56746n == LinePosition.Top) {
                    f3 = -f2;
                    f2 = -f7;
                    i4 = 0;
                } else {
                    f3 = f2;
                    f2 = f7;
                    i4 = height;
                }
                r0.f56742j.reset();
                f7 = (float) i4;
                float f8 = f7 - (f2 / 2.0f);
                r0.f56742j.moveTo(0.0f, f8);
                r0.f56742j.lineTo((float) i3, f8);
                r0.f56742j.close();
                Canvas canvas3 = canvas;
                canvas3.drawPath(r0.f56742j, r0.f56744l);
                f7 -= f2;
                switch (r0.f56745m) {
                    case Triangle:
                        r0.f56742j.reset();
                        f = f4;
                        r0.f56742j.moveTo(f, f7 - f3);
                        r0.f56742j.lineTo(f + f3, f7);
                        r0.f56742j.lineTo(f - f3, f7);
                        r0.f56742j.close();
                        canvas3.drawPath(r0.f56742j, r0.f56747o);
                        break;
                    case Underline:
                        if (obj != null) {
                            if (i7 < size) {
                                rect2 = (Rect) a.get(i7);
                                float f9 = ((float) rect2.right) + r0.f56749q;
                                f2 = ((float) rect2.left) - r0.f56749q;
                                f3 = f7 - f3;
                                r0.f56742j.reset();
                                r0.f56742j.moveTo(f2, f7);
                                r0.f56742j.lineTo(f9, f7);
                                r0.f56742j.lineTo(f9, f3);
                                r0.f56742j.lineTo(f2, f3);
                                r0.f56742j.close();
                                r0.f56747o.setAlpha((int) (255.0f * f5));
                                canvas3.drawPath(r0.f56742j, r0.f56747o);
                                r0.f56747o.setAlpha(255);
                                break;
                            }
                            break;
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        int i = 0;
        if (this.f56733a != null) {
            if (this.f56733a.getAdapter().getCount() != 0) {
                int action = motionEvent.getAction() & 255;
                switch (action) {
                    case 0:
                        this.f56757y = C0597f.b(motionEvent, 0);
                        this.f56756x = motionEvent.getX();
                        break;
                    case 1:
                    case 3:
                        if (!this.f56758z) {
                            int count = this.f56733a.getAdapter().getCount();
                            float width = (float) getWidth();
                            float f = width / 2.0f;
                            width /= 6.0f;
                            float f2 = f - width;
                            f += width;
                            motionEvent = motionEvent.getX();
                            if (motionEvent < f2) {
                                if (this.f56735c > null) {
                                    if (action != 3) {
                                        this.f56733a.setCurrentItem(this.f56735c - 1);
                                    }
                                    return true;
                                }
                            } else if (motionEvent > f) {
                                if (this.f56735c < count - 1) {
                                    if (action != 3) {
                                        this.f56733a.setCurrentItem(this.f56735c + 1);
                                    }
                                    return true;
                                }
                            } else if (!(this.f56732A == null || action == 3)) {
                                this.f56732A.onCenterItemClick(this.f56735c);
                            }
                        }
                        this.f56758z = false;
                        this.f56757y = -1;
                        if (this.f56733a.isFakeDragging() != null) {
                            this.f56733a.endFakeDrag();
                            break;
                        }
                        break;
                    case 2:
                        motionEvent = C0597f.c(motionEvent, C0597f.a(motionEvent, this.f56757y));
                        float f3 = motionEvent - this.f56756x;
                        if (!this.f56758z && Math.abs(f3) > ((float) this.f56755w)) {
                            this.f56758z = true;
                        }
                        if (this.f56758z) {
                            this.f56756x = motionEvent;
                            if (!(this.f56733a.isFakeDragging() == null && this.f56733a.beginFakeDrag() == null)) {
                                this.f56733a.fakeDragBy(f3);
                                break;
                            }
                        }
                        break;
                    case 5:
                        action = C0597f.b(motionEvent);
                        this.f56756x = C0597f.c(motionEvent, action);
                        this.f56757y = C0597f.b(motionEvent, action);
                        break;
                    case 6:
                        action = C0597f.b(motionEvent);
                        if (C0597f.b(motionEvent, action) == this.f56757y) {
                            if (action == 0) {
                                i = 1;
                            }
                            this.f56757y = C0597f.b(motionEvent, i);
                        }
                        this.f56756x = C0597f.c(motionEvent, C0597f.a(motionEvent, this.f56757y));
                        break;
                    default:
                        break;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m66321a(Rect rect, float f, int i) {
        rect.right = (int) (((float) i) - this.f56753u);
        rect.left = (int) (((float) rect.right) - f);
    }

    /* renamed from: b */
    private void m66322b(Rect rect, float f, int i) {
        rect.left = (int) (((float) i) + this.f56753u);
        rect.right = (int) (this.f56753u + f);
    }

    /* renamed from: a */
    private ArrayList<Rect> m66320a(Paint paint) {
        ArrayList<Rect> arrayList = new ArrayList();
        int count = this.f56733a.getAdapter().getCount();
        int width = getWidth();
        int i = width / 2;
        for (int i2 = 0; i2 < count; i2++) {
            Rect a = m66318a(i2, paint);
            int i3 = a.right - a.left;
            int i4 = a.bottom - a.top;
            a.left = (int) ((((float) i) - (((float) i3) / 2.0f)) + ((((float) (i2 - this.f56735c)) - this.f56736d) * ((float) width)));
            a.right = a.left + i3;
            a.top = 0;
            a.bottom = i4;
            arrayList.add(a);
        }
        return arrayList;
    }

    /* renamed from: a */
    private Rect m66318a(int i, Paint paint) {
        Rect rect = new Rect();
        i = m66319a(i);
        rect.right = (int) paint.measureText(i, 0, i.length());
        rect.bottom = (int) (paint.descent() - paint.ascent());
        return rect;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f56733a != viewPager) {
            if (this.f56733a != null) {
                this.f56733a.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f56733a = viewPager;
            this.f56733a.setOnPageChangeListener(this);
            invalidate();
        }
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    public void setOnCenterItemClickListener(OnCenterItemClickListener onCenterItemClickListener) {
        this.f56732A = onCenterItemClickListener;
    }

    public void setCurrentItem(int i) {
        if (this.f56733a == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f56733a.setCurrentItem(i);
        this.f56735c = i;
        invalidate();
    }

    public void onPageScrollStateChanged(int i) {
        this.f56737e = i;
        if (this.f56734b != null) {
            this.f56734b.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f56735c = i;
        this.f56736d = f;
        invalidate();
        if (this.f56734b != null) {
            this.f56734b.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        if (this.f56737e == 0) {
            this.f56735c = i;
            invalidate();
        }
        if (this.f56734b != null) {
            this.f56734b.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f56734b = onPageChangeListener;
    }

    protected void onMeasure(int i, int i2) {
        i = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i2) == 1073741824) {
            i2 = (float) MeasureSpec.getSize(i2);
        } else {
            this.f56743k.setEmpty();
            this.f56743k.bottom = (int) (this.f56738f.descent() - this.f56738f.ascent());
            i2 = ((((float) (this.f56743k.bottom - this.f56743k.top)) + this.f56754v) + this.f56750r) + this.f56752t;
            if (this.f56745m != IndicatorStyle.None) {
                i2 += this.f56748p;
            }
        }
        setMeasuredDimension(i, (int) i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f56735c = savedState.currentPage;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.f56735c;
        return savedState;
    }

    /* renamed from: a */
    private CharSequence m66319a(int i) {
        i = this.f56733a.getAdapter().getPageTitle(i);
        return i == 0 ? "" : i;
    }
}
