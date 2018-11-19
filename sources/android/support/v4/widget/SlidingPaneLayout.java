package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.C0432b;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {
    /* renamed from: h */
    static final C0618b f1901h;
    /* renamed from: a */
    View f1902a;
    /* renamed from: b */
    float f1903b;
    /* renamed from: c */
    int f1904c;
    /* renamed from: d */
    boolean f1905d;
    /* renamed from: e */
    final C0650n f1906e;
    /* renamed from: f */
    boolean f1907f;
    /* renamed from: g */
    final ArrayList<C0617a> f1908g;
    /* renamed from: i */
    private int f1909i;
    /* renamed from: j */
    private int f1910j;
    /* renamed from: k */
    private Drawable f1911k;
    /* renamed from: l */
    private Drawable f1912l;
    /* renamed from: m */
    private final int f1913m;
    /* renamed from: n */
    private boolean f1914n;
    /* renamed from: o */
    private float f1915o;
    /* renamed from: p */
    private int f1916p;
    /* renamed from: q */
    private float f1917q;
    /* renamed from: r */
    private float f1918r;
    /* renamed from: s */
    private PanelSlideListener f1919s;
    /* renamed from: t */
    private boolean f1920t;
    /* renamed from: u */
    private final Rect f1921u;

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: e */
        private static final int[] f1894e = new int[]{16843137};
        /* renamed from: a */
        public float f1895a = 0.0f;
        /* renamed from: b */
        boolean f1896b;
        /* renamed from: c */
        boolean f1897c;
        /* renamed from: d */
        Paint f1898d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(@NonNull android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(@NonNull MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, f1894e);
            this.f1895a = context.getFloat(null, 0.0f);
            context.recycle();
        }
    }

    public interface PanelSlideListener {
        void onPanelClosed(@NonNull View view);

        void onPanelOpened(@NonNull View view);

        void onPanelSlide(@NonNull View view, float f);
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$a */
    private class C0617a implements Runnable {
        /* renamed from: a */
        final View f1899a;
        /* renamed from: b */
        final /* synthetic */ SlidingPaneLayout f1900b;

        C0617a(SlidingPaneLayout slidingPaneLayout, View view) {
            this.f1900b = slidingPaneLayout;
            this.f1899a = view;
        }

        public void run() {
            if (this.f1899a.getParent() == this.f1900b) {
                this.f1899a.setLayerType(0, null);
                this.f1900b.m2502b(this.f1899a);
            }
            this.f1900b.f1908g.remove(this);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$b */
    interface C0618b {
        /* renamed from: a */
        void mo603a(SlidingPaneLayout slidingPaneLayout, View view);
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C06161();
        boolean isOpen;

        /* renamed from: android.support.v4.widget.SlidingPaneLayout$SavedState$1 */
        static class C06161 implements ClassLoaderCreator<SavedState> {
            C06161() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2490a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m2491a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2492a(i);
            }

            /* renamed from: a */
            public SavedState m2491a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState m2490a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m2492a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.isOpen = parcel.readInt() != null ? true : null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.isOpen);
        }
    }

    /* renamed from: android.support.v4.widget.SlidingPaneLayout$c */
    static class C2903c implements C0618b {
        C2903c() {
        }

        /* renamed from: a */
        public void mo603a(SlidingPaneLayout slidingPaneLayout, View view) {
            ViewCompat.m2178a(slidingPaneLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @RequiresApi(16)
    /* renamed from: android.support.v4.widget.SlidingPaneLayout$d */
    static class C4033d extends C2903c {
        /* renamed from: a */
        private Method f12810a;
        /* renamed from: b */
        private Field f12811b;

        C4033d() {
            try {
                this.f12810a = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
            } catch (Throwable e) {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", e);
            }
            try {
                this.f12811b = View.class.getDeclaredField("mRecreateDisplayList");
                this.f12811b.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
            }
        }

        /* renamed from: a */
        public void mo603a(SlidingPaneLayout slidingPaneLayout, View view) {
            if (this.f12810a == null || this.f12811b == null) {
                view.invalidate();
                return;
            }
            try {
                this.f12811b.setBoolean(view, true);
                this.f12810a.invoke(view, (Object[]) null);
            } catch (Throwable e) {
                Log.e("SlidingPaneLayout", "Error refreshing display list state", e);
            }
            super.mo603a(slidingPaneLayout, view);
        }
    }

    @RequiresApi(17)
    /* renamed from: android.support.v4.widget.SlidingPaneLayout$e */
    static class C4034e extends C2903c {
        C4034e() {
        }

        /* renamed from: a */
        public void mo603a(SlidingPaneLayout slidingPaneLayout, View view) {
            ViewCompat.m2180a(view, ((LayoutParams) view.getLayoutParams()).f1898d);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f1901h = new C4034e();
        } else if (VERSION.SDK_INT >= 16) {
            f1901h = new C4033d();
        } else {
            f1901h = new C2903c();
        }
    }

    public void setParallaxDistance(int i) {
        this.f1916p = i;
        requestLayout();
    }

    public int getParallaxDistance() {
        return this.f1916p;
    }

    public void setSliderFadeColor(@ColorInt int i) {
        this.f1909i = i;
    }

    @ColorInt
    public int getSliderFadeColor() {
        return this.f1909i;
    }

    public void setCoveredFadeColor(@ColorInt int i) {
        this.f1910j = i;
    }

    @ColorInt
    public int getCoveredFadeColor() {
        return this.f1910j;
    }

    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        this.f1919s = panelSlideListener;
    }

    /* renamed from: a */
    void m2500a(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View view2 = view;
        boolean f = m2508f();
        int width = f ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = f ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m2498d(view)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i = view.getLeft();
            i2 = view.getRight();
            i3 = view.getTop();
            i4 = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt != view2) {
                boolean z;
                if (childAt.getVisibility() == 8) {
                    z = f;
                } else {
                    int i6;
                    int max = Math.max(f ? paddingLeft : width, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    if (f) {
                        z = f;
                        i6 = width;
                    } else {
                        z = f;
                        i6 = paddingLeft;
                    }
                    max = (max < i || max2 < i3 || Math.min(i6, childAt.getRight()) > i2 || Math.min(height, childAt.getBottom()) > i4) ? 0 : 4;
                    childAt.setVisibility(max);
                }
                i5++;
                f = z;
                view2 = view;
            } else {
                return;
            }
        }
        SlidingPaneLayout slidingPaneLayout = this;
    }

    /* renamed from: a */
    void m2499a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: d */
    private static boolean m2498d(View view) {
        boolean z = true;
        if (view.isOpaque()) {
            return true;
        }
        if (VERSION.SDK_INT >= 18) {
            return false;
        }
        view = view.getBackground();
        if (view == null) {
            return false;
        }
        if (view.getOpacity() != -1) {
            z = false;
        }
        return z;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1920t = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1920t = true;
        int size = this.f1908g.size();
        for (int i = 0; i < size; i++) {
            ((C0617a) this.f1908g.get(i)).run();
        }
        this.f1908g.clear();
    }

    protected void onMeasure(int i, int i2) {
        int paddingTop;
        SlidingPaneLayout slidingPaneLayout = this;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    size = MapboxConstants.ANIMATION_DURATION;
                }
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = MapboxConstants.ANIMATION_DURATION;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            size2 = 0;
        } else if (mode2 != 1073741824) {
            size2 = 0;
            paddingTop = 0;
        } else {
            size2 = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = size2;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        slidingPaneLayout.f1902a = null;
        int i3 = size2;
        int i4 = paddingLeft;
        size2 = 0;
        boolean z2 = false;
        float f = 0.0f;
        while (true) {
            int i5 = 8;
            if (size2 >= childCount) {
                break;
            }
            int i6;
            View childAt = getChildAt(size2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f1897c = z;
            } else {
                if (layoutParams.f1895a > 0.0f) {
                    f += layoutParams.f1895a;
                    if (layoutParams.width == 0) {
                    }
                }
                i6 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    mode = MeasureSpec.makeMeasureSpec(paddingLeft - i6, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    mode = MeasureSpec.makeMeasureSpec(paddingLeft - i6, 1073741824);
                } else {
                    mode = MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i5 = MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    i5 = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    i5 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(mode, i5);
                mode = childAt.getMeasuredWidth();
                i6 = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && i6 > i3) {
                    i3 = Math.min(i6, paddingTop);
                }
                i4 -= mode;
                z = i4 < 0;
                layoutParams.f1896b = z;
                z |= z2;
                if (layoutParams.f1896b) {
                    slidingPaneLayout.f1902a = childAt;
                }
                z2 = z;
            }
            size2++;
            z = false;
        }
        if (z2 || f > 0.0f) {
            mode = paddingLeft - slidingPaneLayout.f1913m;
            mode2 = 0;
            while (mode2 < childCount) {
                int i7;
                View childAt2 = getChildAt(mode2);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        Object obj = (layoutParams2.width != 0 || layoutParams2.f1895a <= 0.0f) ? null : 1;
                        if (obj != null) {
                            i6 = 0;
                        } else {
                            i6 = childAt2.getMeasuredWidth();
                        }
                        int i8;
                        if (!z2 || childAt2 == slidingPaneLayout.f1902a) {
                            if (layoutParams2.f1895a > 0.0f) {
                                int makeMeasureSpec;
                                if (layoutParams2.width != 0) {
                                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    i5 = MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                    if (z2) {
                                        i7 = mode;
                                        childAt2.measure(MeasureSpec.makeMeasureSpec(i6 + ((int) ((layoutParams2.f1895a * ((float) Math.max(0, i4))) / f)), 1073741824), i5);
                                        mode2++;
                                        mode = i7;
                                        i5 = 8;
                                    } else {
                                        i8 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                        i7 = mode;
                                        mode = MeasureSpec.makeMeasureSpec(i8, 1073741824);
                                        if (i6 != i8) {
                                            childAt2.measure(mode, i5);
                                        }
                                        mode2++;
                                        mode = i7;
                                        i5 = 8;
                                    }
                                } else if (layoutParams2.height == -1) {
                                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                i5 = makeMeasureSpec;
                                if (z2) {
                                    i7 = mode;
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(i6 + ((int) ((layoutParams2.f1895a * ((float) Math.max(0, i4))) / f)), 1073741824), i5);
                                    mode2++;
                                    mode = i7;
                                    i5 = 8;
                                } else {
                                    i8 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    i7 = mode;
                                    mode = MeasureSpec.makeMeasureSpec(i8, 1073741824);
                                    if (i6 != i8) {
                                        childAt2.measure(mode, i5);
                                    }
                                    mode2++;
                                    mode = i7;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i6 > mode || layoutParams2.f1895a > 0.0f)) {
                            int i9;
                            if (obj == null) {
                                i9 = 1073741824;
                                i8 = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                i8 = MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                i9 = 1073741824;
                            } else if (layoutParams2.height == -1) {
                                i9 = 1073741824;
                                i8 = MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                            } else {
                                i9 = 1073741824;
                                i8 = MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(MeasureSpec.makeMeasureSpec(mode, i9), i8);
                        }
                    }
                }
                i7 = mode;
                mode2++;
                mode = i7;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, (i3 + getPaddingTop()) + getPaddingBottom());
        slidingPaneLayout.f1914n = z2;
        if (slidingPaneLayout.f1906e.m2627a() != 0 && !z2) {
            slidingPaneLayout.f1906e.m2647f();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SlidingPaneLayout slidingPaneLayout = this;
        boolean f = m2508f();
        if (f) {
            slidingPaneLayout.f1906e.m2628a(2);
        } else {
            slidingPaneLayout.f1906e.m2628a(1);
        }
        int i5 = i3 - i;
        int paddingRight = f ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = f ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (slidingPaneLayout.f1920t) {
            float f2 = (slidingPaneLayout.f1914n && slidingPaneLayout.f1907f) ? 1.0f : 0.0f;
            slidingPaneLayout.f1903b = f2;
        }
        int i6 = paddingRight;
        int i7 = i6;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt = getChildAt(paddingRight);
            if (childAt.getVisibility() != 8) {
                int min;
                int i8;
                int i9;
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f1896b) {
                    int i10 = i5 - paddingLeft;
                    min = (Math.min(i6, i10 - slidingPaneLayout.f1913m) - i7) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    slidingPaneLayout.f1904c = min;
                    i8 = f ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f1897c = ((i7 + i8) + min) + (measuredWidth / 2) > i10;
                    i10 = (int) (((float) min) * slidingPaneLayout.f1903b);
                    i8 = (i8 + i10) + i7;
                    slidingPaneLayout.f1903b = ((float) i10) / ((float) slidingPaneLayout.f1904c);
                } else if (!slidingPaneLayout.f1914n || slidingPaneLayout.f1916p == 0) {
                    i8 = i6;
                } else {
                    min = (int) ((1.0f - slidingPaneLayout.f1903b) * ((float) slidingPaneLayout.f1916p));
                    i8 = i6;
                    if (f) {
                        min = i8 - min;
                        i9 = min + measuredWidth;
                    } else {
                        i9 = (i5 - i8) + min;
                        min = i9 - measuredWidth;
                    }
                    childAt.layout(min, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                    i6 += childAt.getWidth();
                    i7 = i8;
                }
                min = 0;
                if (f) {
                    min = i8 - min;
                    i9 = min + measuredWidth;
                } else {
                    i9 = (i5 - i8) + min;
                    min = i9 - measuredWidth;
                }
                childAt.layout(min, paddingTop, i9, childAt.getMeasuredHeight() + paddingTop);
                i6 += childAt.getWidth();
                i7 = i8;
            }
        }
        if (slidingPaneLayout.f1920t) {
            if (slidingPaneLayout.f1914n) {
                if (slidingPaneLayout.f1916p != 0) {
                    m2494a(slidingPaneLayout.f1903b);
                }
                if (((LayoutParams) slidingPaneLayout.f1902a.getLayoutParams()).f1897c) {
                    m2495a(slidingPaneLayout.f1902a, slidingPaneLayout.f1903b, slidingPaneLayout.f1909i);
                }
            } else {
                for (int i11 = 0; i11 < childCount; i11++) {
                    m2495a(getChildAt(i11), 0.0f, slidingPaneLayout.f1909i);
                }
            }
            m2500a(slidingPaneLayout.f1902a);
        }
        slidingPaneLayout.f1920t = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f1920t = true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() == null && this.f1914n == null) {
            this.f1907f = view == this.f1902a ? true : null;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (!this.f1914n && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f1907f = this.f1906e.m2639b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY()) ^ true;
            }
        }
        if (this.f1914n) {
            if (!this.f1905d || actionMasked == 0) {
                if (actionMasked != 3) {
                    if (actionMasked != 1) {
                        Object obj;
                        float x;
                        float y;
                        if (actionMasked == 0) {
                            this.f1905d = false;
                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            this.f1917q = x;
                            this.f1918r = y;
                            if (this.f1906e.m2639b(this.f1902a, (int) x, (int) y) && m2505c(this.f1902a)) {
                                obj = 1;
                                if (this.f1906e.m2631a(motionEvent) == null) {
                                    if (obj != null) {
                                        z = false;
                                    }
                                }
                                return z;
                            }
                        } else if (actionMasked == 2) {
                            x = motionEvent.getX();
                            y = motionEvent.getY();
                            x = Math.abs(x - this.f1917q);
                            y = Math.abs(y - this.f1918r);
                            if (x > ((float) this.f1906e.m2643d()) && y > x) {
                                this.f1906e.m2646e();
                                this.f1905d = true;
                                return false;
                            }
                        }
                        obj = null;
                        if (this.f1906e.m2631a(motionEvent) == null) {
                            if (obj != null) {
                                z = false;
                            }
                        }
                        return z;
                    }
                }
                this.f1906e.m2646e();
                return false;
            }
        }
        this.f1906e.m2646e();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1914n) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1906e.m2635b(motionEvent);
        float x;
        switch (motionEvent.getActionMasked()) {
            case 0:
                x = motionEvent.getX();
                motionEvent = motionEvent.getY();
                this.f1917q = x;
                this.f1918r = motionEvent;
                break;
            case 1:
                if (m2505c(this.f1902a)) {
                    x = motionEvent.getX();
                    motionEvent = motionEvent.getY();
                    float f = x - this.f1917q;
                    float f2 = motionEvent - this.f1918r;
                    int d = this.f1906e.m2643d();
                    if ((f * f) + (f2 * f2) < ((float) (d * d)) && this.f1906e.m2639b(this.f1902a, (int) x, (int) motionEvent) != null) {
                        m2496a(this.f1902a, 0);
                        break;
                    }
                }
                break;
            default:
                break;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m2496a(View view, int i) {
        if (this.f1920t == null) {
            if (m2501a((float) null, i) == null) {
                return false;
            }
        }
        this.f1907f = false;
        return true;
    }

    /* renamed from: b */
    private boolean m2497b(View view, int i) {
        if (this.f1920t == null) {
            if (m2501a(1.0f, i) == null) {
                return null;
            }
        }
        this.f1907f = true;
        return true;
    }

    /* renamed from: b */
    public boolean m2503b() {
        return m2497b(this.f1902a, 0);
    }

    /* renamed from: c */
    public boolean m2504c() {
        return m2496a(this.f1902a, 0);
    }

    /* renamed from: d */
    public boolean m2506d() {
        if (this.f1914n) {
            if (this.f1903b != 1.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean m2507e() {
        return this.f1914n;
    }

    /* renamed from: a */
    private void m2495a(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            f = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f1898d == 0) {
                layoutParams.f1898d = new Paint();
            }
            layoutParams.f1898d.setColorFilter(new PorterDuffColorFilter(f, Mode.SRC_OVER));
            if (view.getLayerType() != 2.8E-45f) {
                view.setLayerType(2, layoutParams.f1898d);
            }
            m2502b(view);
        } else if (view.getLayerType() != null) {
            if (layoutParams.f1898d != null) {
                layoutParams.f1898d.setColorFilter(0);
            }
            Runnable c0617a = new C0617a(this, view);
            this.f1908g.add(c0617a);
            ViewCompat.m2188a((View) this, c0617a);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (!(!this.f1914n || layoutParams.f1896b || this.f1902a == null)) {
            canvas.getClipBounds(this.f1921u);
            if (m2508f()) {
                this.f1921u.left = Math.max(this.f1921u.left, this.f1902a.getRight());
            } else {
                this.f1921u.right = Math.min(this.f1921u.right, this.f1902a.getLeft());
            }
            canvas.clipRect(this.f1921u);
        }
        view = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return view;
    }

    /* renamed from: b */
    void m2502b(View view) {
        f1901h.mo603a(this, view);
    }

    /* renamed from: a */
    boolean m2501a(float f, int i) {
        if (this.f1914n == 0) {
            return false;
        }
        int width;
        LayoutParams layoutParams = (LayoutParams) this.f1902a.getLayoutParams();
        if (m2508f() != 0) {
            width = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f1904c))) + ((float) this.f1902a.getWidth())));
        } else {
            width = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f1904c)));
        }
        if (this.f1906e.m2632a(this.f1902a, width, this.f1902a.getTop()) == null) {
            return false;
        }
        m2499a();
        ViewCompat.m2200c(this);
        return true;
    }

    public void computeScroll() {
        if (this.f1906e.m2633a(true)) {
            if (this.f1914n) {
                ViewCompat.m2200c(this);
            } else {
                this.f1906e.m2647f();
            }
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f1911k = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.f1912l = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0432b.m1640a(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0432b.m1640a(getContext(), i));
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        if (m2508f()) {
            drawable = this.f1912l;
        } else {
            drawable = this.f1911k;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null) {
            if (drawable != null) {
                int right;
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (m2508f()) {
                    right = childAt.getRight();
                    intrinsicWidth += right;
                } else {
                    right = childAt.getLeft();
                    int i = right - intrinsicWidth;
                    intrinsicWidth = right;
                    right = i;
                }
                drawable.setBounds(right, top, intrinsicWidth, bottom);
                drawable.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m2494a(float f) {
        Object obj;
        int childCount;
        int i;
        View childAt;
        int i2;
        boolean f2 = m2508f();
        LayoutParams layoutParams = (LayoutParams) this.f1902a.getLayoutParams();
        if (layoutParams.f1897c) {
            if ((f2 ? layoutParams.rightMargin : layoutParams.leftMargin) <= 0) {
                obj = 1;
                childCount = getChildCount();
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    if (childAt == this.f1902a) {
                        i2 = (int) ((1.0f - this.f1915o) * ((float) this.f1916p));
                        this.f1915o = f;
                        i2 -= (int) ((1.0f - f) * ((float) this.f1916p));
                        if (f2) {
                            i2 = -i2;
                        }
                        childAt.offsetLeftAndRight(i2);
                        if (obj == null) {
                            m2495a(childAt, f2 ? this.f1915o - 1.0f : 1.0f - this.f1915o, this.f1910j);
                        }
                    }
                }
            }
        }
        obj = null;
        childCount = getChildCount();
        for (i = 0; i < childCount; i++) {
            childAt = getChildAt(i);
            if (childAt == this.f1902a) {
                i2 = (int) ((1.0f - this.f1915o) * ((float) this.f1916p));
                this.f1915o = f;
                i2 -= (int) ((1.0f - f) * ((float) this.f1916p));
                if (f2) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
                if (obj == null) {
                    if (f2) {
                    }
                    m2495a(childAt, f2 ? this.f1915o - 1.0f : 1.0f - this.f1915o, this.f1910j);
                }
            }
        }
    }

    /* renamed from: c */
    boolean m2505c(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f1914n && layoutParams.f1897c != null && this.f1903b > 0.0f) {
            z = true;
        }
        return z;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (!(layoutParams instanceof LayoutParams) || super.checkLayoutParams(layoutParams) == null) ? null : true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.isOpen = m2507e() ? m2506d() : this.f1907f;
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (savedState.isOpen) {
                m2503b();
            } else {
                m2504c();
            }
            this.f1907f = savedState.isOpen;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* renamed from: f */
    boolean m2508f() {
        return ViewCompat.m2208f(this) == 1;
    }
}
