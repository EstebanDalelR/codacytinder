package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0582a;
import android.support.v4.view.C0593c;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.C0586b;
import android.support.v4.widget.C0650n.C0649a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowInsets;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    /* renamed from: a */
    static final int[] f1857a = new int[]{16842931};
    /* renamed from: b */
    static final boolean f1858b = (VERSION.SDK_INT >= 19);
    /* renamed from: c */
    private static final int[] f1859c = new int[]{16843828};
    /* renamed from: d */
    private static final boolean f1860d;
    /* renamed from: A */
    private float f1861A;
    /* renamed from: B */
    private Drawable f1862B;
    /* renamed from: C */
    private Drawable f1863C;
    /* renamed from: D */
    private Drawable f1864D;
    /* renamed from: E */
    private Object f1865E;
    /* renamed from: F */
    private boolean f1866F;
    /* renamed from: G */
    private Drawable f1867G;
    /* renamed from: H */
    private Drawable f1868H;
    /* renamed from: I */
    private Drawable f1869I;
    /* renamed from: J */
    private Drawable f1870J;
    /* renamed from: K */
    private final ArrayList<View> f1871K;
    /* renamed from: e */
    private final C2900a f1872e;
    /* renamed from: f */
    private float f1873f;
    /* renamed from: g */
    private int f1874g;
    /* renamed from: h */
    private int f1875h;
    /* renamed from: i */
    private float f1876i;
    /* renamed from: j */
    private Paint f1877j;
    /* renamed from: k */
    private final C0650n f1878k;
    /* renamed from: l */
    private final C0650n f1879l;
    /* renamed from: m */
    private final C2901b f1880m;
    /* renamed from: n */
    private final C2901b f1881n;
    /* renamed from: o */
    private int f1882o;
    /* renamed from: p */
    private boolean f1883p;
    /* renamed from: q */
    private boolean f1884q;
    /* renamed from: r */
    private int f1885r;
    /* renamed from: s */
    private int f1886s;
    /* renamed from: t */
    private int f1887t;
    /* renamed from: u */
    private int f1888u;
    /* renamed from: v */
    private boolean f1889v;
    /* renamed from: w */
    private boolean f1890w;
    @Nullable
    /* renamed from: x */
    private DrawerListener f1891x;
    /* renamed from: y */
    private List<DrawerListener> f1892y;
    /* renamed from: z */
    private float f1893z;

    public interface DrawerListener {
        void onDrawerClosed(@NonNull View view);

        void onDrawerOpened(@NonNull View view);

        void onDrawerSlide(@NonNull View view, float f);

        void onDrawerStateChanged(int i);
    }

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: a */
        public int f1853a = 0;
        /* renamed from: b */
        float f1854b;
        /* renamed from: c */
        boolean f1855c;
        /* renamed from: d */
        int f1856d;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, DrawerLayout.f1857a);
            this.f1853a = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(@NonNull LayoutParams layoutParams) {
            super(layoutParams);
            this.f1853a = layoutParams.f1853a;
        }

        public LayoutParams(@NonNull android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(@NonNull MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C06141();
        int lockModeEnd;
        int lockModeLeft;
        int lockModeRight;
        int lockModeStart;
        int openDrawerGravity = null;

        /* renamed from: android.support.v4.widget.DrawerLayout$SavedState$1 */
        static class C06141 implements ClassLoaderCreator<SavedState> {
            C06141() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2442a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m2443a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2444a(i);
            }

            /* renamed from: a */
            public SavedState m2443a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m2442a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m2444a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.openDrawerGravity = parcel.readInt();
            this.lockModeLeft = parcel.readInt();
            this.lockModeRight = parcel.readInt();
            this.lockModeStart = parcel.readInt();
            this.lockModeEnd = parcel.readInt();
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.openDrawerGravity);
            parcel.writeInt(this.lockModeLeft);
            parcel.writeInt(this.lockModeRight);
            parcel.writeInt(this.lockModeStart);
            parcel.writeInt(this.lockModeEnd);
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$a */
    static final class C2900a extends C0582a {
        public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
            super.onInitializeAccessibilityNodeInfo(view, c0586b);
            if (DrawerLayout.m2453l(view) == null) {
                c0586b.m2262b(null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.DrawerLayout$b */
    private class C2901b extends C0649a {
        /* renamed from: a */
        final /* synthetic */ DrawerLayout f9138a;
        /* renamed from: b */
        private final int f9139b;
        /* renamed from: c */
        private C0650n f9140c;
        /* renamed from: d */
        private final Runnable f9141d;

        /* renamed from: b */
        public boolean mo602b(int i) {
            return false;
        }

        /* renamed from: a */
        public void m11377a() {
            this.f9138a.removeCallbacks(this.f9141d);
        }

        /* renamed from: a */
        public boolean mo229a(View view, int i) {
            return (this.f9138a.m2483g(view) == 0 || this.f9138a.m2465a(view, this.f9139b) == 0 || this.f9138a.m2456a(view) != null) ? null : true;
        }

        /* renamed from: a */
        public void mo226a(int i) {
            this.f9138a.m2459a(this.f9139b, i, this.f9140c.m2640c());
        }

        /* renamed from: a */
        public void mo228a(View view, int i, int i2, int i3, int i4) {
            float f;
            i2 = view.getWidth();
            if (this.f9138a.m2465a(view, 3) != 0) {
                f = ((float) (i + i2)) / ((float) i2);
            } else {
                f = ((float) (this.f9138a.getWidth() - i)) / ((float) i2);
            }
            this.f9138a.m2471b(view, f);
            view.setVisibility(f == 0 ? 4 : 0);
            this.f9138a.invalidate();
        }

        /* renamed from: b */
        public void mo256b(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f1855c = false;
            m11375b();
        }

        /* renamed from: b */
        private void m11375b() {
            int i = 3;
            if (this.f9139b == 3) {
                i = 5;
            }
            View b = this.f9138a.m2466b(i);
            if (b != null) {
                this.f9138a.m2485i(b);
            }
        }

        /* renamed from: a */
        public void mo227a(View view, float f, float f2) {
            int i;
            f2 = this.f9138a.m2476d(view);
            int width = view.getWidth();
            if (this.f9138a.m2465a(view, 3)) {
                if (f <= 0.0f) {
                    if (f != 0.0f || f2 <= 0.5f) {
                        i = -width;
                    }
                }
                i = 0;
            } else {
                int width2 = this.f9138a.getWidth();
                if (f < 0.0f || (f == 0.0f && f2 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f9140c.m2630a(i, view.getTop());
            this.f9138a.invalidate();
        }

        /* renamed from: a */
        public void mo600a(int i, int i2) {
            this.f9138a.postDelayed(this.f9141d, 160);
        }

        /* renamed from: b */
        public void mo601b(int i, int i2) {
            View b;
            if ((i & 1) == 1) {
                b = this.f9138a.m2466b(3);
            } else {
                b = this.f9138a.m2466b(5);
            }
            if (b != 0 && this.f9138a.m2456a(b) == 0) {
                this.f9140c.m2629a(b, i2);
            }
        }

        /* renamed from: b */
        public int mo255b(View view) {
            return this.f9138a.m2483g(view) ? view.getWidth() : null;
        }

        /* renamed from: b */
        public int mo230b(View view, int i, int i2) {
            if (this.f9138a.m2465a(view, 3) != 0) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            i2 = this.f9138a.getWidth();
            return Math.max(i2 - view.getWidth(), Math.min(i, i2));
        }

        /* renamed from: a */
        public int mo225a(View view, int i, int i2) {
            return view.getTop();
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f1860d = z;
    }

    public void setDrawerElevation(float f) {
        this.f1873f = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m2483g(childAt)) {
                ViewCompat.m2215i(childAt, this.f1873f);
            }
        }
    }

    public float getDrawerElevation() {
        return f1860d ? this.f1873f : 0.0f;
    }

    public void setScrimColor(@ColorInt int i) {
        this.f1875h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        if (this.f1891x != null) {
            m2469b(this.f1891x);
        }
        if (drawerListener != null) {
            m2461a(drawerListener);
        }
        this.f1891x = drawerListener;
    }

    /* renamed from: a */
    public void m2461a(@NonNull DrawerListener drawerListener) {
        if (drawerListener != null) {
            if (this.f1892y == null) {
                this.f1892y = new ArrayList();
            }
            this.f1892y.add(drawerListener);
        }
    }

    /* renamed from: b */
    public void m2469b(@NonNull DrawerListener drawerListener) {
        if (drawerListener != null && this.f1892y != null) {
            this.f1892y.remove(drawerListener);
        }
    }

    public void setDrawerLockMode(int i) {
        m2458a(i, 3);
        m2458a(i, 5);
    }

    /* renamed from: a */
    public void m2458a(int i, int i2) {
        int a = C0593c.m2313a(i2, ViewCompat.m2208f(this));
        if (i2 == 3) {
            this.f1885r = i;
        } else if (i2 == 5) {
            this.f1886s = i;
        } else if (i2 == 8388611) {
            this.f1887t = i;
        } else if (i2 == 8388613) {
            this.f1888u = i;
        }
        if (i != 0) {
            (a == 3 ? this.f1878k : this.f1879l).m2646e();
        }
        switch (i) {
            case 1:
                i = m2466b(a);
                if (i != 0) {
                    m2485i(i);
                    return;
                }
                return;
            case 2:
                i = m2466b(a);
                if (i != 0) {
                    m2484h(i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public int m2455a(int i) {
        int f = ViewCompat.m2208f(this);
        if (i != 3) {
            if (i != 5) {
                if (i != 8388611) {
                    if (i == 8388613) {
                        if (this.f1888u != 3) {
                            return this.f1888u;
                        }
                        if (f == 0) {
                            i = this.f1886s;
                        } else {
                            i = this.f1885r;
                        }
                        if (i != 3) {
                            return i;
                        }
                    }
                } else if (this.f1887t != 3) {
                    return this.f1887t;
                } else {
                    if (f == 0) {
                        i = this.f1885r;
                    } else {
                        i = this.f1886s;
                    }
                    if (i != 3) {
                        return i;
                    }
                }
            } else if (this.f1886s != 3) {
                return this.f1886s;
            } else {
                if (f == 0) {
                    i = this.f1888u;
                } else {
                    i = this.f1887t;
                }
                if (i != 3) {
                    return i;
                }
            }
        } else if (this.f1885r != 3) {
            return this.f1885r;
        } else {
            i = f == 0 ? this.f1887t : this.f1888u;
            if (i != 3) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public int m2456a(@NonNull View view) {
        if (m2483g(view)) {
            return m2455a(((LayoutParams) view.getLayoutParams()).f1853a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    void m2459a(int i, int i2, View view) {
        LayoutParams layoutParams;
        i = this.f1878k.m2627a();
        int a = this.f1879l.m2627a();
        int i3 = 2;
        if (i != 1) {
            if (a != 1) {
                if (i != 2) {
                    if (a != 2) {
                        i3 = 0;
                    }
                }
                if (view != null && i2 == 0) {
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    if (layoutParams.f1854b == 0) {
                        m2470b(view);
                    } else if (layoutParams.f1854b == 1065353216) {
                        m2474c(view);
                    }
                }
                if (i3 != this.f1882o) {
                    this.f1882o = i3;
                    if (this.f1892y != 0) {
                        for (i = this.f1892y.size() - 1; i >= 0; i--) {
                            ((DrawerListener) this.f1892y.get(i)).onDrawerStateChanged(i3);
                        }
                    }
                }
            }
        }
        i3 = 1;
        layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.f1854b == 0) {
            m2470b(view);
        } else if (layoutParams.f1854b == 1065353216) {
            m2474c(view);
        }
        if (i3 != this.f1882o) {
            this.f1882o = i3;
            if (this.f1892y != 0) {
                for (i = this.f1892y.size() - 1; i >= 0; i--) {
                    ((DrawerListener) this.f1892y.get(i)).onDrawerStateChanged(i3);
                }
            }
        }
    }

    /* renamed from: b */
    void m2470b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f1856d & 1) == 1) {
            layoutParams.f1856d = 0;
            if (this.f1892y != null) {
                for (int size = this.f1892y.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.f1892y.get(size)).onDrawerClosed(view);
                }
            }
            m2447c(view, false);
            if (hasWindowFocus() != null) {
                view = getRootView();
                if (view != null) {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* renamed from: c */
    void m2474c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f1856d & 1) == 0) {
            layoutParams.f1856d = 1;
            if (this.f1892y != null) {
                for (int size = this.f1892y.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.f1892y.get(size)).onDrawerOpened(view);
                }
            }
            m2447c(view, true);
            if (hasWindowFocus() != null) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: c */
    private void m2447c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m2483g(childAt)) && !(z && childAt == view)) {
                ViewCompat.m2176a(childAt, 4);
            } else {
                ViewCompat.m2176a(childAt, 1);
            }
        }
    }

    /* renamed from: a */
    void m2462a(View view, float f) {
        if (this.f1892y != null) {
            for (int size = this.f1892y.size() - 1; size >= 0; size--) {
                ((DrawerListener) this.f1892y.get(size)).onDrawerSlide(view, f);
            }
        }
    }

    /* renamed from: b */
    void m2471b(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f1854b) {
            layoutParams.f1854b = f;
            m2462a(view, f);
        }
    }

    /* renamed from: d */
    float m2476d(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1854b;
    }

    /* renamed from: e */
    int m2478e(View view) {
        return C0593c.m2313a(((LayoutParams) view.getLayoutParams()).f1853a, ViewCompat.m2208f(this));
    }

    /* renamed from: a */
    boolean m2465a(View view, int i) {
        return (m2478e(view) & i) == i ? true : null;
    }

    /* renamed from: a */
    View m2457a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f1856d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    void m2475c(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        i -= (int) (m2476d(view) * width);
        if (!m2465a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m2471b(view, f);
    }

    /* renamed from: b */
    View m2466b(int i) {
        i = C0593c.m2313a(i, ViewCompat.m2208f(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m2478e(childAt) & 7) == i) {
                return childAt;
            }
        }
        return 0;
    }

    /* renamed from: c */
    static String m2446c(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1884q = true;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1884q = true;
    }

    protected void onMeasure(int i, int i2) {
        DrawerLayout drawerLayout = this;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        size = MapboxConstants.ANIMATION_DURATION;
                    }
                }
                if (mode2 != Integer.MIN_VALUE) {
                    if (mode2 == 0) {
                        size2 = MapboxConstants.ANIMATION_DURATION;
                    }
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        Object obj = (drawerLayout.f1865E == null || !ViewCompat.m2227s(this)) ? null : 1;
        int f = ViewCompat.m2208f(this);
        int childCount = getChildCount();
        int i4 = 0;
        Object obj2 = null;
        Object obj3 = null;
        while (i4 < childCount) {
            int a;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (obj != null) {
                    a = C0593c.m2313a(layoutParams.f1853a, f);
                    WindowInsets windowInsets;
                    if (ViewCompat.m2227s(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            windowInsets = (WindowInsets) drawerLayout.f1865E;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        windowInsets = (WindowInsets) drawerLayout.f1865E;
                        if (a == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (m2481f(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (m2483g(childAt)) {
                    if (f1860d && ViewCompat.m2223o(childAt) != drawerLayout.f1873f) {
                        ViewCompat.m2215i(childAt, drawerLayout.f1873f);
                    }
                    mode2 = m2478e(childAt) & 7;
                    Object obj4 = mode2 == 3 ? 1 : null;
                    if ((obj4 == null || r10 == null) && (obj4 != null || r11 == null)) {
                        if (obj4 != null) {
                            obj2 = 1;
                        } else {
                            obj3 = 1;
                        }
                        childAt.measure(getChildMeasureSpec(i, (drawerLayout.f1874g + layoutParams.leftMargin) + layoutParams.rightMargin, layoutParams.width), getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Child drawer has absolute gravity ");
                        stringBuilder.append(m2446c(mode2));
                        stringBuilder.append(" but this ");
                        stringBuilder.append("DrawerLayout");
                        stringBuilder.append(" already has a ");
                        stringBuilder.append("drawer view along that edge");
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Child ");
                    stringBuilder2.append(childAt);
                    stringBuilder2.append(" at index ");
                    stringBuilder2.append(i4);
                    stringBuilder2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    stringBuilder2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
            a = i;
            int i5 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* renamed from: d */
    private void m2448d() {
        if (!f1860d) {
            this.f1863C = m2449e();
            this.f1864D = m2450f();
        }
    }

    /* renamed from: e */
    private Drawable m2449e() {
        int f = ViewCompat.m2208f(this);
        if (f == 0) {
            if (this.f1867G != null) {
                m2445a(this.f1867G, f);
                return this.f1867G;
            }
        } else if (this.f1868H != null) {
            m2445a(this.f1868H, f);
            return this.f1868H;
        }
        return this.f1869I;
    }

    /* renamed from: f */
    private Drawable m2450f() {
        int f = ViewCompat.m2208f(this);
        if (f == 0) {
            if (this.f1868H != null) {
                m2445a(this.f1868H, f);
                return this.f1868H;
            }
        } else if (this.f1867G != null) {
            m2445a(this.f1867G, f);
            return this.f1867G;
        }
        return this.f1870J;
    }

    /* renamed from: a */
    private boolean m2445a(Drawable drawable, int i) {
        if (drawable != null) {
            if (C0450a.m1724b(drawable)) {
                C0450a.m1725b(drawable, i);
                return true;
            }
        }
        return null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1883p = true;
        int i5 = i3 - i;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m2481f(childAt)) {
                    childAt.layout(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.leftMargin + childAt.getMeasuredWidth(), layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int i7;
                    float f;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m2465a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i7 = (-measuredWidth) + ((int) (layoutParams.f1854b * f2));
                        f = ((float) (measuredWidth + i7)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i8 = i5 - ((int) (layoutParams.f1854b * f3));
                        f = ((float) (i5 - i8)) / f3;
                        i7 = i8;
                    }
                    Object obj = f != layoutParams.f1854b ? 1 : null;
                    int i9 = layoutParams.f1853a & 112;
                    int i10;
                    if (i9 == 16) {
                        i10 = i4 - i2;
                        i9 = (i10 - measuredHeight) / 2;
                        if (i9 < layoutParams.topMargin) {
                            i9 = layoutParams.topMargin;
                        } else if (i9 + measuredHeight > i10 - layoutParams.bottomMargin) {
                            i9 = (i10 - layoutParams.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i7, i9, measuredWidth + i7, measuredHeight + i9);
                    } else if (i9 != 80) {
                        childAt.layout(i7, layoutParams.topMargin, measuredWidth + i7, layoutParams.topMargin + measuredHeight);
                    } else {
                        i10 = i4 - i2;
                        childAt.layout(i7, (i10 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i7, i10 - layoutParams.bottomMargin);
                    }
                    if (obj != null) {
                        m2471b(childAt, f);
                    }
                    int i11 = layoutParams.f1854b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        r0.f1883p = false;
        r0.f1884q = false;
    }

    public void requestLayout() {
        if (!this.f1883p) {
            super.requestLayout();
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f1854b);
        }
        this.f1876i = f;
        boolean a = this.f1878k.m2633a(true);
        boolean a2 = this.f1879l.m2633a(true);
        if (a || a2) {
            ViewCompat.m2200c(this);
        }
    }

    /* renamed from: m */
    private static boolean m2454m(View view) {
        view = view.getBackground();
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (view.getOpacity() == -1) {
            z = true;
        }
        return z;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f1862B = drawable;
        invalidate();
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f1862B;
    }

    public void setStatusBarBackground(int i) {
        this.f1862B = i != 0 ? C0432b.m1640a(getContext(), i) : 0;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.f1862B = new ColorDrawable(i);
        invalidate();
    }

    public void onRtlPropertiesChanged(int i) {
        m2448d();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1866F && this.f1862B != null) {
            int systemWindowInsetTop = (VERSION.SDK_INT < 21 || this.f1865E == null) ? 0 : ((WindowInsets) this.f1865E).getSystemWindowInsetTop();
            if (systemWindowInsetTop > 0) {
                this.f1862B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f1862B.draw(canvas);
            }
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean f = m2481f(view2);
        int width = getWidth();
        int save = canvas2.save();
        if (f) {
            int childCount = getChildCount();
            i = width;
            i2 = 0;
            for (width = 0; width < childCount; width++) {
                View childAt = getChildAt(width);
                if (childAt != view2 && childAt.getVisibility() == 0 && m2454m(childAt) && m2483g(childAt)) {
                    if (childAt.getHeight() >= height) {
                        int right;
                        if (m2465a(childAt, 3)) {
                            right = childAt.getRight();
                            if (right > i2) {
                                i2 = right;
                            }
                        } else {
                            right = childAt.getLeft();
                            if (right < i) {
                                i = right;
                            }
                        }
                    }
                }
            }
            canvas2.clipRect(i2, 0, i, getHeight());
        } else {
            i = width;
            i2 = 0;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas2.restoreToCount(save);
        if (r0.f1876i > 0.0f && f) {
            r0.f1877j.setColor((((int) (((float) ((r0.f1875h & -16777216) >>> 24)) * r0.f1876i)) << 24) | (r0.f1875h & 16777215));
            canvas2.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), r0.f1877j);
        } else if (r0.f1863C != null && m2465a(view2, 3)) {
            height = r0.f1863C.getIntrinsicWidth();
            r7 = view.getRight();
            r5 = Math.max(0.0f, Math.min(((float) r7) / ((float) r0.f1878k.m2634b()), 1.0f));
            r0.f1863C.setBounds(r7, view.getTop(), height + r7, view.getBottom());
            r0.f1863C.setAlpha((int) (r5 * 255.0f));
            r0.f1863C.draw(canvas2);
        } else if (r0.f1864D != null && m2465a(view2, 5)) {
            height = r0.f1864D.getIntrinsicWidth();
            r7 = view.getLeft();
            r5 = Math.max(0.0f, Math.min(((float) (getWidth() - r7)) / ((float) r0.f1879l.m2634b()), 1.0f));
            r0.f1864D.setBounds(r7 - height, view.getTop(), r7, view.getBottom());
            r0.f1864D.setAlpha((int) (r5 * 255.0f));
            r0.f1864D.draw(canvas2);
        }
        return drawChild;
    }

    /* renamed from: f */
    boolean m2481f(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1853a == null ? true : null;
    }

    /* renamed from: g */
    boolean m2483g(View view) {
        view = C0593c.m2313a(((LayoutParams) view.getLayoutParams()).f1853a, ViewCompat.m2208f(view));
        return ((view & 3) == 0 && (view & 5) == null) ? null : true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int a = this.f1878k.m2631a(motionEvent) | this.f1879l.m2631a(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                motionEvent = motionEvent.getY();
                this.f1893z = x;
                this.f1861A = motionEvent;
                if (this.f1876i > 0.0f) {
                    View d = this.f1878k.m2644d((int) x, (int) motionEvent);
                    if (!(d == null || m2481f(d) == null)) {
                        motionEvent = true;
                        this.f1889v = false;
                        this.f1890w = false;
                        break;
                    }
                }
                motionEvent = null;
                this.f1889v = false;
                this.f1890w = false;
            case 1:
            case 3:
                m2464a(true);
                this.f1889v = false;
                this.f1890w = false;
                break;
            case 2:
                if (this.f1878k.m2645d(3) != null) {
                    this.f1880m.m11377a();
                    this.f1881n.m11377a();
                    break;
                }
                break;
            default:
                break;
        }
        motionEvent = null;
        if (a != 0 || r7 != null || m2451g() != null) {
            return true;
        }
        if (this.f1890w != null) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f1878k.m2635b(motionEvent);
        this.f1879l.m2635b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            float x;
            switch (action) {
                case 0:
                    x = motionEvent.getX();
                    motionEvent = motionEvent.getY();
                    this.f1893z = x;
                    this.f1861A = motionEvent;
                    this.f1889v = false;
                    this.f1890w = false;
                    break;
                case 1:
                    boolean z;
                    x = motionEvent.getX();
                    motionEvent = motionEvent.getY();
                    View d = this.f1878k.m2644d((int) x, (int) motionEvent);
                    if (d != null && m2481f(d)) {
                        x -= this.f1893z;
                        motionEvent -= this.f1861A;
                        int d2 = this.f1878k.m2643d();
                        if ((x * x) + (motionEvent * motionEvent) < ((float) (d2 * d2))) {
                            View a = m2457a();
                            if (a != null) {
                                if (m2456a(a) != 2) {
                                    z = null;
                                    m2464a(z);
                                    this.f1889v = false;
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    m2464a(z);
                    this.f1889v = false;
                default:
                    break;
            }
        }
        m2464a(true);
        this.f1889v = false;
        this.f1890w = false;
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f1889v = z;
        if (z) {
            m2464a(true);
        }
    }

    /* renamed from: b */
    public void m2467b() {
        m2464a(false);
    }

    /* renamed from: a */
    void m2464a(boolean z) {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m2483g(childAt)) {
                if (!z || layoutParams.f1855c) {
                    int width = childAt.getWidth();
                    if (m2465a(childAt, 3)) {
                        i |= this.f1878k.m2632a(childAt, -width, childAt.getTop());
                    } else {
                        i |= this.f1879l.m2632a(childAt, getWidth(), childAt.getTop());
                    }
                    layoutParams.f1855c = false;
                }
            }
        }
        this.f1880m.m11377a();
        this.f1881n.m11377a();
        if (i != 0) {
            invalidate();
        }
    }

    /* renamed from: h */
    public void m2484h(@NonNull View view) {
        m2463a(view, true);
    }

    /* renamed from: a */
    public void m2463a(@NonNull View view, boolean z) {
        if (m2483g(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f1884q) {
                layoutParams.f1854b = 1.0f;
                layoutParams.f1856d = 1;
                m2447c(view, true);
            } else if (z) {
                layoutParams.f1856d |= 2;
                if (m2465a(view, (int) true)) {
                    this.f1878k.m2632a(view, 0, view.getTop());
                } else {
                    this.f1879l.m2632a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m2475c(view, 1.0f);
                m2459a(layoutParams.f1853a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: d */
    public void m2477d(int i) {
        m2460a(i, true);
    }

    /* renamed from: a */
    public void m2460a(int i, boolean z) {
        View b = m2466b(i);
        if (b == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No drawer view found with gravity ");
            stringBuilder.append(m2446c(i));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        m2463a(b, z);
    }

    /* renamed from: i */
    public void m2485i(@NonNull View view) {
        m2472b(view, true);
    }

    /* renamed from: b */
    public void m2472b(@NonNull View view, boolean z) {
        if (m2483g(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f1884q) {
                layoutParams.f1854b = 0.0f;
                layoutParams.f1856d = 0;
            } else if (z) {
                layoutParams.f1856d |= true;
                if (m2465a(view, (int) true)) {
                    this.f1878k.m2632a(view, -view.getWidth(), view.getTop());
                } else {
                    this.f1879l.m2632a(view, getWidth(), view.getTop());
                }
            } else {
                m2475c(view, 0.0f);
                m2459a(layoutParams.f1853a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" is not a sliding drawer");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: e */
    public void m2479e(int i) {
        m2468b(i, true);
    }

    /* renamed from: b */
    public void m2468b(int i, boolean z) {
        View b = m2466b(i);
        if (b == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No drawer view found with gravity ");
            stringBuilder.append(m2446c(i));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        m2472b(b, z);
    }

    /* renamed from: j */
    public boolean m2486j(@NonNull View view) {
        if (m2483g(view)) {
            return (((LayoutParams) view.getLayoutParams()).f1856d & 1) == 1;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View ");
            stringBuilder.append(view);
            stringBuilder.append(" is not a drawer");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: f */
    public boolean m2480f(int i) {
        i = m2466b(i);
        return i != 0 ? m2486j(i) : false;
    }

    /* renamed from: k */
    public boolean m2487k(@NonNull View view) {
        if (m2483g(view)) {
            return ((LayoutParams) view.getLayoutParams()).f1854b > 0.0f ? true : null;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("View ");
            stringBuilder.append(view);
            stringBuilder.append(" is not a drawer");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: g */
    public boolean m2482g(int i) {
        i = m2466b(i);
        return i != 0 ? m2487k(i) : false;
    }

    /* renamed from: g */
    private boolean m2451g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f1855c) {
                return true;
            }
        }
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new LayoutParams((MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (!(layoutParams instanceof LayoutParams) || super.checkLayoutParams(layoutParams) == null) ? null : true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            Object obj = null;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!m2483g(childAt)) {
                    this.f1871K.add(childAt);
                } else if (m2486j(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    obj = 1;
                }
            }
            if (obj == null) {
                childCount = this.f1871K.size();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View view = (View) this.f1871K.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f1871K.clear();
        }
    }

    /* renamed from: h */
    private boolean m2452h() {
        return m2473c() != null;
    }

    /* renamed from: c */
    View m2473c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2483g(childAt) && m2487k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m2452h()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = m2473c();
        if (c != 0 && m2456a(c) == null) {
            m2467b();
        }
        return c != null ? 1 : 0;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (savedState.openDrawerGravity != 0) {
                View b = m2466b(savedState.openDrawerGravity);
                if (b != null) {
                    m2484h(b);
                }
            }
            if (savedState.lockModeLeft != 3) {
                m2458a(savedState.lockModeLeft, 3);
            }
            if (savedState.lockModeRight != 3) {
                m2458a(savedState.lockModeRight, 5);
            }
            if (savedState.lockModeStart != 3) {
                m2458a(savedState.lockModeStart, 8388611);
            }
            if (savedState.lockModeEnd != 3) {
                m2458a(savedState.lockModeEnd, 8388613);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            Object obj = 1;
            Object obj2 = layoutParams.f1856d == 1 ? 1 : null;
            if (layoutParams.f1856d != 2) {
                obj = null;
            }
            if (obj2 == null) {
                if (obj == null) {
                    i++;
                }
            }
            savedState.openDrawerGravity = layoutParams.f1853a;
            break;
        }
        savedState.lockModeLeft = this.f1885r;
        savedState.lockModeRight = this.f1886s;
        savedState.lockModeStart = this.f1887t;
        savedState.lockModeEnd = this.f1888u;
        return savedState;
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m2457a() == 0) {
            if (m2483g(view) == 0) {
                ViewCompat.m2176a(view, 1);
                if (f1858b == 0) {
                    ViewCompat.m2185a(view, this.f1872e);
                }
            }
        }
        ViewCompat.m2176a(view, 4);
        if (f1858b == 0) {
            ViewCompat.m2185a(view, this.f1872e);
        }
    }

    /* renamed from: l */
    static boolean m2453l(View view) {
        return (ViewCompat.m2203d(view) == 4 || ViewCompat.m2203d(view) == 2) ? null : true;
    }
}
