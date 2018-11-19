package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.support.v4.view.C0598g;
import android.support.v4.view.C0599h;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingChild, NestedScrollingParent {
    /* renamed from: D */
    private static final int[] f9142D = new int[]{16842766};
    /* renamed from: m */
    private static final String f9143m = "SwipeRefreshLayout";
    /* renamed from: A */
    private int f9144A;
    /* renamed from: B */
    private boolean f9145B;
    /* renamed from: C */
    private final DecelerateInterpolator f9146C;
    /* renamed from: E */
    private int f9147E;
    /* renamed from: F */
    private Animation f9148F;
    /* renamed from: G */
    private Animation f9149G;
    /* renamed from: H */
    private Animation f9150H;
    /* renamed from: I */
    private Animation f9151I;
    /* renamed from: J */
    private Animation f9152J;
    /* renamed from: K */
    private int f9153K;
    /* renamed from: L */
    private OnChildScrollUpCallback f9154L;
    /* renamed from: M */
    private AnimationListener f9155M;
    /* renamed from: N */
    private final Animation f9156N;
    /* renamed from: O */
    private final Animation f9157O;
    /* renamed from: a */
    OnRefreshListener f9158a;
    /* renamed from: b */
    boolean f9159b;
    /* renamed from: c */
    int f9160c;
    /* renamed from: d */
    boolean f9161d;
    /* renamed from: e */
    C0632b f9162e;
    /* renamed from: f */
    protected int f9163f;
    /* renamed from: g */
    float f9164g;
    /* renamed from: h */
    protected int f9165h;
    /* renamed from: i */
    int f9166i;
    /* renamed from: j */
    CircularProgressDrawable f9167j;
    /* renamed from: k */
    boolean f9168k;
    /* renamed from: l */
    boolean f9169l;
    /* renamed from: n */
    private View f9170n;
    /* renamed from: o */
    private int f9171o;
    /* renamed from: p */
    private float f9172p;
    /* renamed from: q */
    private float f9173q;
    /* renamed from: r */
    private final C0599h f9174r;
    /* renamed from: s */
    private final C0598g f9175s;
    /* renamed from: t */
    private final int[] f9176t;
    /* renamed from: u */
    private final int[] f9177u;
    /* renamed from: v */
    private boolean f9178v;
    /* renamed from: w */
    private int f9179w;
    /* renamed from: x */
    private float f9180x;
    /* renamed from: y */
    private float f9181y;
    /* renamed from: z */
    private boolean f9182z;

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$1 */
    class C06191 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1922a;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        C06191(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1922a = swipeRefreshLayout;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f1922a.f9159b != null) {
                this.f1922a.f9167j.setAlpha(255);
                this.f1922a.f9167j.start();
                if (!(this.f1922a.f9168k == null || this.f1922a.f9158a == null)) {
                    this.f1922a.f9158a.onRefresh();
                }
                this.f1922a.f9160c = this.f1922a.f9162e.getTop();
                return;
            }
            this.f1922a.m11404a();
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$2 */
    class C06202 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1923a;

        C06202(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1923a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            this.f1923a.setAnimationProgress(f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$3 */
    class C06213 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1924a;

        C06213(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1924a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            this.f1924a.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$5 */
    class C06235 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1928a;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        C06235(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1928a = swipeRefreshLayout;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f1928a.f9161d == null) {
                this.f1928a.m11406a(null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$6 */
    class C06246 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1929a;

        C06246(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1929a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            if (this.f1929a.f9169l == null) {
                transformation = this.f1929a.f9166i - Math.abs(this.f1929a.f9165h);
            } else {
                transformation = this.f1929a.f9166i;
            }
            this.f1929a.setTargetOffsetTopAndBottom((this.f1929a.f9163f + ((int) (((float) (transformation - this.f1929a.f9163f)) * f))) - this.f1929a.f9162e.getTop());
            this.f1929a.f9167j.m2440b(1.0f - f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$7 */
    class C06257 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1930a;

        C06257(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1930a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            this.f1930a.m11405a(f);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$8 */
    class C06268 extends Animation {
        /* renamed from: a */
        final /* synthetic */ SwipeRefreshLayout f1931a;

        C06268(SwipeRefreshLayout swipeRefreshLayout) {
            this.f1931a = swipeRefreshLayout;
        }

        public void applyTransformation(float f, Transformation transformation) {
            this.f1931a.setAnimationProgress(this.f1931a.f9164g + ((-this.f1931a.f9164g) * f));
            this.f1931a.m11405a(f);
        }
    }

    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(@NonNull SwipeRefreshLayout swipeRefreshLayout, @Nullable View view);
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    /* renamed from: a */
    void m11404a() {
        this.f9162e.clearAnimation();
        this.f9167j.stop();
        this.f9162e.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f9161d) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f9165h - this.f9160c);
        }
        this.f9160c = this.f9162e.getTop();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            m11404a();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m11404a();
    }

    private void setColorViewAlpha(int i) {
        this.f9162e.getBackground().setAlpha(i);
        this.f9167j.setAlpha(i);
    }

    public int getProgressViewStartOffset() {
        return this.f9165h;
    }

    public int getProgressViewEndOffset() {
        return this.f9166i;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f9153K = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f9153K = (int) (displayMetrics.density * 40.0f);
            }
            this.f9162e.setImageDrawable(null);
            this.f9167j.m2437a(i);
            this.f9162e.setImageDrawable(this.f9167j);
        }
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9159b = false;
        this.f9172p = -1.0f;
        this.f9176t = new int[2];
        this.f9177u = new int[2];
        this.f9144A = -1;
        this.f9147E = -1;
        this.f9155M = new C06191(this);
        this.f9156N = new C06246(this);
        this.f9157O = new C06257(this);
        this.f9171o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f9179w = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f9146C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f9153K = (int) (displayMetrics.density * 40.0f);
        m11399d();
        setChildrenDrawingOrderEnabled(true);
        this.f9166i = (int) (displayMetrics.density * 64.0f);
        this.f9172p = (float) this.f9166i;
        this.f9174r = new C0599h(this);
        this.f9175s = new C0598g(this);
        setNestedScrollingEnabled(true);
        int i = -this.f9153K;
        this.f9160c = i;
        this.f9165h = i;
        m11405a(1.0f);
        context = context.obtainStyledAttributes(attributeSet, f9142D);
        setEnabled(context.getBoolean(0, true));
        context.recycle();
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.f9147E < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return this.f9147E;
        }
        return i2 >= this.f9147E ? i2 + 1 : i2;
    }

    /* renamed from: d */
    private void m11399d() {
        this.f9162e = new C0632b(getContext(), -328966);
        this.f9167j = new CircularProgressDrawable(getContext());
        this.f9167j.m2437a(1);
        this.f9162e.setImageDrawable(this.f9167j);
        this.f9162e.setVisibility(8);
        addView(this.f9162e);
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.f9158a = onRefreshListener;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f9159b == z) {
            m11392a(z, false);
            return;
        }
        this.f9159b = z;
        if (this.f9169l) {
            z = this.f9166i;
        } else {
            z = this.f9166i + this.f9165h;
        }
        setTargetOffsetTopAndBottom(z - this.f9160c);
        this.f9168k = false;
        m11396b(this.f9155M);
    }

    /* renamed from: b */
    private void m11396b(AnimationListener animationListener) {
        this.f9162e.setVisibility(0);
        this.f9167j.setAlpha(255);
        this.f9148F = new C06202(this);
        this.f9148F.setDuration((long) this.f9179w);
        if (animationListener != null) {
            this.f9162e.m2557a(animationListener);
        }
        this.f9162e.clearAnimation();
        this.f9162e.startAnimation(this.f9148F);
    }

    void setAnimationProgress(float f) {
        this.f9162e.setScaleX(f);
        this.f9162e.setScaleY(f);
    }

    /* renamed from: a */
    private void m11392a(boolean z, boolean z2) {
        if (this.f9159b != z) {
            this.f9168k = z2;
            m11403g();
            this.f9159b = z;
            if (this.f9159b) {
                m11390a(this.f9160c, this.f9155M);
            } else {
                m11406a(this.f9155M);
            }
        }
    }

    /* renamed from: a */
    void m11406a(AnimationListener animationListener) {
        this.f9149G = new C06213(this);
        this.f9149G.setDuration(150);
        this.f9162e.m2557a(animationListener);
        this.f9162e.clearAnimation();
        this.f9162e.startAnimation(this.f9149G);
    }

    /* renamed from: e */
    private void m11401e() {
        this.f9150H = m11389a(this.f9167j.getAlpha(), 76);
    }

    /* renamed from: f */
    private void m11402f() {
        this.f9151I = m11389a(this.f9167j.getAlpha(), 255);
    }

    /* renamed from: a */
    private Animation m11389a(final int i, final int i2) {
        Animation c06224 = new Animation(this) {
            /* renamed from: c */
            final /* synthetic */ SwipeRefreshLayout f1927c;

            public void applyTransformation(float f, Transformation transformation) {
                this.f1927c.f9167j.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        c06224.setDuration(MapboxConstants.ANIMATION_DURATION);
        this.f9162e.m2557a(0);
        this.f9162e.clearAnimation();
        this.f9162e.startAnimation(c06224);
        return c06224;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(C0432b.m1647c(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.f9162e.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0432b.m1647c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        m11403g();
        this.f9167j.m2439a(iArr);
    }

    /* renamed from: b */
    public boolean m11407b() {
        return this.f9159b;
    }

    /* renamed from: g */
    private void m11403g() {
        if (this.f9170n == null) {
            int i = 0;
            while (i < getChildCount()) {
                View childAt = getChildAt(i);
                if (childAt.equals(this.f9162e)) {
                    i++;
                } else {
                    this.f9170n = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.f9172p = (float) i;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getMeasuredWidth();
        i = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f9170n == 0) {
                m11403g();
            }
            if (this.f9170n != 0) {
                i2 = this.f9170n;
                i3 = getPaddingLeft();
                i4 = getPaddingTop();
                i2.layout(i3, i4, ((z - getPaddingLeft()) - getPaddingRight()) + i3, ((i - getPaddingTop()) - getPaddingBottom()) + i4);
                i = this.f9162e.getMeasuredWidth();
                z /= 2;
                i /= 2;
                this.f9162e.layout(z - i, this.f9160c, z + i, this.f9160c + this.f9162e.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9170n == 0) {
            m11403g();
        }
        if (this.f9170n != 0) {
            this.f9170n.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f9162e.measure(MeasureSpec.makeMeasureSpec(this.f9153K, 1073741824), MeasureSpec.makeMeasureSpec(this.f9153K, 1073741824));
            this.f9147E = -1;
            for (i = 0; i < getChildCount(); i++) {
                if (getChildAt(i) == this.f9162e) {
                    this.f9147E = i;
                    break;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        return this.f9153K;
    }

    /* renamed from: c */
    public boolean m11408c() {
        if (this.f9154L != null) {
            return this.f9154L.canChildScrollUp(this, this.f9170n);
        }
        if (this.f9170n instanceof ListView) {
            return C0644k.m2586b((ListView) this.f9170n, -1);
        }
        return this.f9170n.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.f9154L = onChildScrollUpCallback;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m11403g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9145B && actionMasked == 0) {
            this.f9145B = false;
        }
        if (!(!isEnabled() || this.f9145B || m11408c() || this.f9159b)) {
            if (!this.f9178v) {
                if (actionMasked != 6) {
                    switch (actionMasked) {
                        case 0:
                            setTargetOffsetTopAndBottom(this.f9165h - this.f9162e.getTop());
                            this.f9144A = motionEvent.getPointerId(0);
                            this.f9182z = false;
                            actionMasked = motionEvent.findPointerIndex(this.f9144A);
                            if (actionMasked >= 0) {
                                this.f9181y = motionEvent.getY(actionMasked);
                                break;
                            }
                            return false;
                        case 1:
                        case 3:
                            this.f9182z = false;
                            this.f9144A = -1;
                            break;
                        case 2:
                            if (this.f9144A != -1) {
                                actionMasked = motionEvent.findPointerIndex(this.f9144A);
                                if (actionMasked >= 0) {
                                    m11400d(motionEvent.getY(actionMasked));
                                    break;
                                }
                                return false;
                            }
                            Log.e(f9143m, "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        default:
                            break;
                    }
                }
                m11391a(motionEvent);
                return this.f9182z;
            }
        }
        return false;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT < 21 && (this.f9170n instanceof AbsListView)) {
            return;
        }
        if (this.f9170n == null || ViewCompat.m2232x(this.f9170n)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (isEnabled() == null || this.f9145B != null || this.f9159b != null || (i & 2) == null) ? null : true;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f9174r.m2348a(view, view2, i);
        startNestedScroll(i & 2);
        this.f9173q = null;
        this.f9178v = true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f9173q > 0.0f) {
            float f = (float) i2;
            if (f > this.f9173q) {
                iArr[1] = i2 - ((int) this.f9173q);
                this.f9173q = 0.0f;
            } else {
                this.f9173q -= f;
                iArr[1] = i2;
            }
            m11394b(this.f9173q);
        }
        if (this.f9169l && i2 > 0 && this.f9173q == 0.0f && Math.abs(i2 - iArr[1]) > null) {
            this.f9162e.setVisibility(8);
        }
        view = this.f9176t;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], view, null) != 0) {
            iArr[0] = iArr[0] + view[0];
            iArr[1] = iArr[1] + view[1];
        }
    }

    public int getNestedScrollAxes() {
        return this.f9174r.m2345a();
    }

    public void onStopNestedScroll(View view) {
        this.f9174r.m2346a(view);
        this.f9178v = null;
        if (this.f9173q > null) {
            m11397c(this.f9173q);
            this.f9173q = 0.0f;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f9177u);
        i4 += this.f9177u[1];
        if (i4 < 0 && m11408c() == null) {
            this.f9173q += (float) Math.abs(i4);
            m11394b(this.f9173q);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f9175s.m2331a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f9175s.m2332a();
    }

    public boolean startNestedScroll(int i) {
        return this.f9175s.m2342b(i);
    }

    public void stopNestedScroll() {
        this.f9175s.m2343c();
    }

    public boolean hasNestedScrollingParent() {
        return this.f9175s.m2341b();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f9175s.m2337a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f9175s.m2339a(i, i2, iArr, iArr2);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f9175s.m2334a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f9175s.m2333a(f, f2);
    }

    /* renamed from: a */
    private boolean m11393a(Animation animation) {
        return (animation != null && animation.hasStarted() && animation.hasEnded() == null) ? true : null;
    }

    /* renamed from: b */
    private void m11394b(float f) {
        this.f9167j.m2438a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f9172p));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float f2 = (float) (this.f9169l ? this.f9166i - this.f9165h : this.f9166i);
        double max2 = (double) (Math.max(0.0f, Math.min(Math.abs(f) - this.f9172p, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i = this.f9165h + ((int) ((f2 * min) + ((f2 * pow) * 2.0f)));
        if (this.f9162e.getVisibility() != 0) {
            this.f9162e.setVisibility(0);
        }
        if (!this.f9161d) {
            this.f9162e.setScaleX(1.0f);
            this.f9162e.setScaleY(1.0f);
        }
        if (this.f9161d) {
            setAnimationProgress(Math.min(1.0f, f / this.f9172p));
        }
        if (f < this.f9172p) {
            if (this.f9167j.getAlpha() > 76 && m11393a(this.f9150H) == null) {
                m11401e();
            }
        } else if (this.f9167j.getAlpha() < 255 && m11393a(this.f9151I) == null) {
            m11402f();
        }
        this.f9167j.m2436a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f9167j.m2440b(Math.min(1.0f, max));
        this.f9167j.m2441c((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i - this.f9160c);
    }

    /* renamed from: c */
    private void m11397c(float f) {
        if (f > this.f9172p) {
            m11392a(true, true);
            return;
        }
        this.f9159b = false;
        this.f9167j.m2436a(0.0f, 0.0f);
        AnimationListener animationListener = null;
        if (!this.f9161d) {
            animationListener = new C06235(this);
        }
        m11395b(this.f9160c, animationListener);
        this.f9167j.m2438a(false);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f9145B && actionMasked == 0) {
            this.f9145B = false;
        }
        if (!(!isEnabled() || this.f9145B || m11408c() || this.f9159b)) {
            if (!this.f9178v) {
                switch (actionMasked) {
                    case 0:
                        this.f9144A = motionEvent.getPointerId(0);
                        this.f9182z = false;
                        break;
                    case 1:
                        actionMasked = motionEvent.findPointerIndex(this.f9144A);
                        if (actionMasked < 0) {
                            Log.e(f9143m, "Got ACTION_UP event but don't have an active pointer id.");
                            return false;
                        }
                        if (this.f9182z) {
                            motionEvent = (motionEvent.getY(actionMasked) - this.f9180x) * 1056964608;
                            this.f9182z = false;
                            m11397c(motionEvent);
                        }
                        this.f9144A = -1;
                        return false;
                    case 2:
                        actionMasked = motionEvent.findPointerIndex(this.f9144A);
                        if (actionMasked < 0) {
                            Log.e(f9143m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        motionEvent = motionEvent.getY(actionMasked);
                        m11400d(motionEvent);
                        if (this.f9182z) {
                            float f = (motionEvent - this.f9180x) * 1056964608;
                            if (f > 0.0f) {
                                m11394b(f);
                                break;
                            }
                            return false;
                        }
                        break;
                    case 3:
                        return false;
                    case 5:
                        actionMasked = motionEvent.getActionIndex();
                        if (actionMasked >= 0) {
                            this.f9144A = motionEvent.getPointerId(actionMasked);
                            break;
                        }
                        Log.e(f9143m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    case 6:
                        m11391a(motionEvent);
                        break;
                    default:
                        break;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m11400d(float f) {
        if (f - this.f9181y > ((float) this.f9171o) && this.f9182z == null) {
            this.f9180x = this.f9181y + ((float) this.f9171o);
            this.f9182z = true;
            this.f9167j.setAlpha(76);
        }
    }

    /* renamed from: a */
    private void m11390a(int i, AnimationListener animationListener) {
        this.f9163f = i;
        this.f9156N.reset();
        this.f9156N.setDuration(200);
        this.f9156N.setInterpolator(this.f9146C);
        if (animationListener != null) {
            this.f9162e.m2557a(animationListener);
        }
        this.f9162e.clearAnimation();
        this.f9162e.startAnimation(this.f9156N);
    }

    /* renamed from: b */
    private void m11395b(int i, AnimationListener animationListener) {
        if (this.f9161d) {
            m11398c(i, animationListener);
            return;
        }
        this.f9163f = i;
        this.f9157O.reset();
        this.f9157O.setDuration(200);
        this.f9157O.setInterpolator(this.f9146C);
        if (animationListener != null) {
            this.f9162e.m2557a(animationListener);
        }
        this.f9162e.clearAnimation();
        this.f9162e.startAnimation(this.f9157O);
    }

    /* renamed from: a */
    void m11405a(float f) {
        setTargetOffsetTopAndBottom((this.f9163f + ((int) (((float) (this.f9165h - this.f9163f)) * f))) - this.f9162e.getTop());
    }

    /* renamed from: c */
    private void m11398c(int i, AnimationListener animationListener) {
        this.f9163f = i;
        this.f9164g = this.f9162e.getScaleX();
        this.f9152J = new C06268(this);
        this.f9152J.setDuration(150);
        if (animationListener != null) {
            this.f9162e.m2557a(animationListener);
        }
        this.f9162e.clearAnimation();
        this.f9162e.startAnimation(this.f9152J);
    }

    void setTargetOffsetTopAndBottom(int i) {
        this.f9162e.bringToFront();
        ViewCompat.m2202c(this.f9162e, i);
        this.f9160c = this.f9162e.getTop();
    }

    /* renamed from: a */
    private void m11391a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9144A) {
            this.f9144A = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
