package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.C0582a;
import android.support.v4.view.C0598g;
import android.support.v4.view.C0599h;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.C0586b;
import android.support.v4.view.accessibility.C0589d;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.ads.AdError;
import java.util.List;

public class NestedScrollView extends FrameLayout implements NestedScrollingChild2, NestedScrollingParent, ScrollingView {
    /* renamed from: w */
    private static final C2902a f12782w = new C2902a();
    /* renamed from: x */
    private static final int[] f12783x = new int[]{16843130};
    /* renamed from: A */
    private float f12784A;
    /* renamed from: B */
    private OnScrollChangeListener f12785B;
    /* renamed from: a */
    private long f12786a;
    /* renamed from: b */
    private final Rect f12787b;
    /* renamed from: c */
    private OverScroller f12788c;
    /* renamed from: d */
    private EdgeEffect f12789d;
    /* renamed from: e */
    private EdgeEffect f12790e;
    /* renamed from: f */
    private int f12791f;
    /* renamed from: g */
    private boolean f12792g;
    /* renamed from: h */
    private boolean f12793h;
    /* renamed from: i */
    private View f12794i;
    /* renamed from: j */
    private boolean f12795j;
    /* renamed from: k */
    private VelocityTracker f12796k;
    /* renamed from: l */
    private boolean f12797l;
    /* renamed from: m */
    private boolean f12798m;
    /* renamed from: n */
    private int f12799n;
    /* renamed from: o */
    private int f12800o;
    /* renamed from: p */
    private int f12801p;
    /* renamed from: q */
    private int f12802q;
    /* renamed from: r */
    private final int[] f12803r;
    /* renamed from: s */
    private final int[] f12804s;
    /* renamed from: t */
    private int f12805t;
    /* renamed from: u */
    private int f12806u;
    /* renamed from: v */
    private SavedState f12807v;
    /* renamed from: y */
    private final C0599h f12808y;
    /* renamed from: z */
    private final C0598g f12809z;

    public interface OnScrollChangeListener {
        void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C06151();
        public int scrollPosition;

        /* renamed from: android.support.v4.widget.NestedScrollView$SavedState$1 */
        static class C06151 implements Creator<SavedState> {
            C06151() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2488a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2489a(i);
            }

            /* renamed from: a */
            public SavedState m2488a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m2489a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.scrollPosition = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.scrollPosition);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("HorizontalScrollView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" scrollPosition=");
            stringBuilder.append(this.scrollPosition);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C2902a extends C0582a {
        C2902a() {
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle) != null) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled() == null) {
                return false;
            }
            if (i == 4096) {
                i = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m15816b(0, i);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                i = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m15816b(0, i);
                return true;
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
            super.onInitializeAccessibilityNodeInfo(view, c0586b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0586b.m2264b(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    c0586b.m2284h(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0586b.m2255a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0586b.m2255a(4096);
                    }
                }
            }
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0589d.m2306a(accessibilityEvent, nestedScrollView.getScrollX());
            C0589d.m2308b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: b */
    private static int m15800b(int i, int i2, int i3) {
        if (i2 < i3) {
            if (i >= 0) {
                return i2 + i > i3 ? i3 - i2 : i;
            }
        }
        return 0;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12787b = new Rect();
        this.f12792g = true;
        this.f12793h = false;
        this.f12794i = null;
        this.f12795j = false;
        this.f12798m = true;
        this.f12802q = -1;
        this.f12803r = new int[2];
        this.f12804s = new int[2];
        m15793a();
        context = context.obtainStyledAttributes(attributeSet, f12783x, i, 0);
        setFillViewport(context.getBoolean(0, false));
        context.recycle();
        this.f12808y = new C0599h(this);
        this.f12809z = new C0598g(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m2185a((View) this, f12782w);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f12809z.m2331a(z);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f12809z.m2332a();
    }

    public boolean startNestedScroll(int i) {
        return this.f12809z.m2342b(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return this.f12809z.m2336a(i, i2);
    }

    public void stopNestedScroll() {
        this.f12809z.m2343c();
    }

    public void stopNestedScroll(int i) {
        this.f12809z.m2344c(i);
    }

    public boolean hasNestedScrollingParent() {
        return this.f12809z.m2341b();
    }

    public boolean hasNestedScrollingParent(int i) {
        return this.f12809z.m2335a(i);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f12809z.m2337a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f12809z.m2338a(i, i2, i3, i4, iArr, i5);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f12809z.m2339a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f12809z.m2340a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f12809z.m2334a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f12809z.m2333a(f, f2);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f12808y.m2348a(view, view2, i);
        startNestedScroll(2);
    }

    public void onStopNestedScroll(View view) {
        this.f12808y.m2346a(view);
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        view = getScrollY();
        scrollBy(0, i4);
        int scrollY = getScrollY() - view;
        dispatchNestedScroll(0, scrollY, 0, i4 - scrollY, null);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, null);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return null;
        }
        m15809f((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public int getNestedScrollAxes() {
        return this.f12808y.m2345a();
    }

    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        return scrollY < verticalFadingEdgeLength ? ((float) scrollY) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        return bottom < verticalFadingEdgeLength ? ((float) bottom) / ((float) verticalFadingEdgeLength) : 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* renamed from: a */
    private void m15793a() {
        this.f12788c = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f12799n = viewConfiguration.getScaledTouchSlop();
        this.f12800o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f12801p = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(@Nullable OnScrollChangeListener onScrollChangeListener) {
        this.f12785B = onScrollChangeListener;
    }

    /* renamed from: b */
    private boolean m15802b() {
        boolean z = false;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom()) {
            z = true;
        }
        return z;
    }

    public void setFillViewport(boolean z) {
        if (z != this.f12797l) {
            this.f12797l = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f12798m = z;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f12785B != null) {
            this.f12785B.onScrollChange(this, i, i2, i3, i4);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f12797l && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            i2 = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (i2.getMeasuredHeight() < measuredHeight) {
                i2.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) i2.getLayoutParams()).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (m15815a(keyEvent) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m15815a(@NonNull KeyEvent keyEvent) {
        this.f12787b.setEmpty();
        boolean z = false;
        int i = 130;
        if (m15802b()) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 62) {
                    switch (keyCode) {
                        case 19:
                            if (keyEvent.isAltPressed() != null) {
                                z = m15817b(33);
                                break;
                            }
                            z = m15818c(33);
                            break;
                        case 20:
                            if (keyEvent.isAltPressed() != null) {
                                z = m15817b(130);
                                break;
                            }
                            z = m15818c(130);
                            break;
                        default:
                            break;
                    }
                }
                if (keyEvent.isShiftPressed() != null) {
                    i = 33;
                }
                m15813a(i);
            }
            return z;
        } else if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        } else {
            keyEvent = findFocus();
            if (keyEvent == this) {
                keyEvent = null;
            }
            Object findNextFocus = FocusFinder.getInstance().findNextFocus(this, keyEvent, 130);
            if (!(findNextFocus == null || findNextFocus == this || findNextFocus.requestFocus(130) == null)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: c */
    private boolean m15804c(int i, int i2) {
        boolean z = false;
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight()) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    private void m15803c() {
        if (this.f12796k == null) {
            this.f12796k = VelocityTracker.obtain();
        } else {
            this.f12796k.clear();
        }
    }

    /* renamed from: d */
    private void m15805d() {
        if (this.f12796k == null) {
            this.f12796k = VelocityTracker.obtain();
        }
    }

    /* renamed from: e */
    private void m15806e() {
        if (this.f12796k != null) {
            this.f12796k.recycle();
            this.f12796k = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m15806e();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f12795j) {
            return true;
        }
        action &= 255;
        if (action != 6) {
            switch (action) {
                case 0:
                    action = (int) motionEvent.getY();
                    if (!m15804c((int) motionEvent.getX(), action)) {
                        this.f12795j = false;
                        m15806e();
                        break;
                    }
                    this.f12791f = action;
                    this.f12802q = motionEvent.getPointerId(0);
                    m15803c();
                    this.f12796k.addMovement(motionEvent);
                    this.f12788c.computeScrollOffset();
                    this.f12795j = this.f12788c.isFinished() ^ 1;
                    startNestedScroll(2, 0);
                    break;
                case 1:
                case 3:
                    this.f12795j = false;
                    this.f12802q = -1;
                    m15806e();
                    if (this.f12788c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != null) {
                        ViewCompat.m2200c(this);
                    }
                    stopNestedScroll(0);
                    break;
                case 2:
                    action = this.f12802q;
                    if (action != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(action);
                        if (findPointerIndex != -1) {
                            action = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(action - this.f12791f) > this.f12799n && (2 & getNestedScrollAxes()) == 0) {
                                this.f12795j = true;
                                this.f12791f = action;
                                m15805d();
                                this.f12796k.addMovement(motionEvent);
                                this.f12805t = 0;
                                motionEvent = getParent();
                                if (motionEvent != null) {
                                    motionEvent.requestDisallowInterceptTouchEvent(true);
                                    break;
                                }
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid pointerId=");
                        stringBuilder.append(action);
                        stringBuilder.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", stringBuilder.toString());
                        break;
                    }
                    break;
                    break;
                default:
                    break;
            }
        }
        m15794a(motionEvent);
        return this.f12795j;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView = this;
        MotionEvent motionEvent2 = motionEvent;
        m15805d();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            nestedScrollView.f12805t = 0;
        }
        obtain.offsetLocation(0.0f, (float) nestedScrollView.f12805t);
        ViewParent parent;
        switch (actionMasked) {
            case 0:
                if (getChildCount() != 0) {
                    boolean isFinished = nestedScrollView.f12788c.isFinished() ^ true;
                    nestedScrollView.f12795j = isFinished;
                    if (isFinished) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (!nestedScrollView.f12788c.isFinished()) {
                        nestedScrollView.f12788c.abortAnimation();
                    }
                    nestedScrollView.f12791f = (int) motionEvent.getY();
                    nestedScrollView.f12802q = motionEvent2.getPointerId(0);
                    startNestedScroll(2, 0);
                    break;
                }
                return false;
            case 1:
                VelocityTracker velocityTracker = nestedScrollView.f12796k;
                velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) nestedScrollView.f12801p);
                actionMasked = (int) velocityTracker.getYVelocity(nestedScrollView.f12802q);
                if (Math.abs(actionMasked) > nestedScrollView.f12800o) {
                    m15809f(-actionMasked);
                } else if (nestedScrollView.f12788c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m2200c(this);
                }
                nestedScrollView.f12802q = -1;
                m15808f();
                break;
            case 2:
                int findPointerIndex = motionEvent2.findPointerIndex(nestedScrollView.f12802q);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i = nestedScrollView.f12791f - y;
                    if (dispatchNestedPreScroll(0, i, nestedScrollView.f12804s, nestedScrollView.f12803r, 0)) {
                        i -= nestedScrollView.f12804s[1];
                        obtain.offsetLocation(0.0f, (float) nestedScrollView.f12803r[1]);
                        nestedScrollView.f12805t += nestedScrollView.f12803r[1];
                    }
                    if (!nestedScrollView.f12795j && Math.abs(i) > nestedScrollView.f12799n) {
                        parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        nestedScrollView.f12795j = true;
                        if (i > 0) {
                            i -= nestedScrollView.f12799n;
                        } else {
                            i += nestedScrollView.f12799n;
                        }
                    }
                    int i2 = i;
                    if (nestedScrollView.f12795j) {
                        Object obj;
                        int i3;
                        int i4;
                        int i5;
                        int scrollY;
                        nestedScrollView.f12791f = y - nestedScrollView.f12803r[1];
                        int scrollY2 = getScrollY();
                        i = getScrollRange();
                        actionMasked = getOverScrollMode();
                        if (actionMasked != 0) {
                            if (actionMasked != 1 || i <= 0) {
                                obj = null;
                                i3 = i;
                                i4 = i2;
                                i5 = findPointerIndex;
                                if (m15814a(0, i2, 0, getScrollY(), 0, i, 0, 0, true) && !hasNestedScrollingParent(0)) {
                                    nestedScrollView.f12796k.clear();
                                }
                                scrollY = getScrollY() - scrollY2;
                                if (dispatchNestedScroll(0, scrollY, 0, i4 - scrollY, nestedScrollView.f12803r, 0)) {
                                    if (obj != null) {
                                        m15810g();
                                        actionMasked = scrollY2 + i4;
                                        if (actionMasked >= 0) {
                                            C0641g.m2576a(nestedScrollView.f12789d, ((float) i4) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                            if (!nestedScrollView.f12790e.isFinished()) {
                                                nestedScrollView.f12790e.onRelease();
                                            }
                                        } else {
                                            scrollY = i5;
                                            if (actionMasked > i3) {
                                                C0641g.m2576a(nestedScrollView.f12790e, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(scrollY) / ((float) getWidth())));
                                                if (!nestedScrollView.f12789d.isFinished()) {
                                                    nestedScrollView.f12789d.onRelease();
                                                }
                                            }
                                        }
                                        if (!(nestedScrollView.f12789d == null || (nestedScrollView.f12789d.isFinished() && nestedScrollView.f12790e.isFinished()))) {
                                            ViewCompat.m2200c(this);
                                            break;
                                        }
                                    }
                                }
                                nestedScrollView.f12791f -= nestedScrollView.f12803r[1];
                                obtain.offsetLocation(0.0f, (float) nestedScrollView.f12803r[1]);
                                nestedScrollView.f12805t += nestedScrollView.f12803r[1];
                                break;
                            }
                        }
                        obj = 1;
                        i3 = i;
                        i4 = i2;
                        i5 = findPointerIndex;
                        nestedScrollView.f12796k.clear();
                        scrollY = getScrollY() - scrollY2;
                        if (dispatchNestedScroll(0, scrollY, 0, i4 - scrollY, nestedScrollView.f12803r, 0)) {
                            if (obj != null) {
                                m15810g();
                                actionMasked = scrollY2 + i4;
                                if (actionMasked >= 0) {
                                    scrollY = i5;
                                    if (actionMasked > i3) {
                                        C0641g.m2576a(nestedScrollView.f12790e, ((float) i4) / ((float) getHeight()), 1.0f - (motionEvent2.getX(scrollY) / ((float) getWidth())));
                                        if (nestedScrollView.f12789d.isFinished()) {
                                            nestedScrollView.f12789d.onRelease();
                                        }
                                    }
                                } else {
                                    C0641g.m2576a(nestedScrollView.f12789d, ((float) i4) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                    if (nestedScrollView.f12790e.isFinished()) {
                                        nestedScrollView.f12790e.onRelease();
                                    }
                                }
                                ViewCompat.m2200c(this);
                                break;
                            }
                        }
                        nestedScrollView.f12791f -= nestedScrollView.f12803r[1];
                        obtain.offsetLocation(0.0f, (float) nestedScrollView.f12803r[1]);
                        nestedScrollView.f12805t += nestedScrollView.f12803r[1];
                        break;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid pointerId=");
                stringBuilder.append(nestedScrollView.f12802q);
                stringBuilder.append(" in onTouchEvent");
                Log.e("NestedScrollView", stringBuilder.toString());
                break;
                break;
            case 3:
                if (nestedScrollView.f12795j && getChildCount() > 0 && nestedScrollView.f12788c.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m2200c(this);
                }
                nestedScrollView.f12802q = -1;
                m15808f();
                break;
            case 5:
                actionMasked = motionEvent.getActionIndex();
                nestedScrollView.f12791f = (int) motionEvent2.getY(actionMasked);
                nestedScrollView.f12802q = motionEvent2.getPointerId(actionMasked);
                break;
            case 6:
                m15794a(motionEvent);
                nestedScrollView.f12791f = (int) motionEvent2.getY(motionEvent2.findPointerIndex(nestedScrollView.f12802q));
                break;
            default:
                break;
        }
        if (nestedScrollView.f12796k != null) {
            nestedScrollView.f12796k.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: a */
    private void m15794a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f12802q) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.f12791f = (int) motionEvent.getY(actionIndex);
            this.f12802q = motionEvent.getPointerId(actionIndex);
            if (this.f12796k != null) {
                this.f12796k.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            if (motionEvent.getAction() == 8) {
                if (!this.f12795j) {
                    motionEvent = motionEvent.getAxisValue(9);
                    if (motionEvent != 0.0f) {
                        motionEvent = (int) (motionEvent * getVerticalScrollFactorCompat());
                        int scrollRange = getScrollRange();
                        int scrollY = getScrollY();
                        motionEvent = scrollY - motionEvent;
                        if (motionEvent < null) {
                            motionEvent = null;
                        } else if (motionEvent > scrollRange) {
                            motionEvent = scrollRange;
                        }
                        if (motionEvent != scrollY) {
                            super.scrollTo(getScrollX(), motionEvent);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f12784A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f12784A = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f12784A;
    }

    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* renamed from: a */
    boolean m15814a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        Object obj;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        boolean z3;
        NestedScrollView nestedScrollView = this;
        int overScrollMode = getOverScrollMode();
        Object obj2 = computeHorizontalScrollRange() > computeHorizontalScrollExtent() ? 1 : null;
        Object obj3 = computeVerticalScrollRange() > computeVerticalScrollExtent() ? 1 : null;
        if (overScrollMode != 0) {
            if (overScrollMode != 1 || obj2 == null) {
                obj2 = null;
                if (overScrollMode != 0) {
                    if (overScrollMode == 1 || obj3 == null) {
                        obj = null;
                        overScrollMode = i3 + i;
                        i9 = obj2 != null ? 0 : i7;
                        i10 = i4 + i2;
                        i11 = obj != null ? 0 : i8;
                        i12 = -i9;
                        i9 += i5;
                        i13 = -i11;
                        i11 += i6;
                        if (overScrollMode <= i9) {
                            i12 = i9;
                        } else if (overScrollMode >= i12) {
                            i12 = overScrollMode;
                            z2 = false;
                            if (i10 <= i11) {
                                i13 = i11;
                            } else if (i10 >= i13) {
                                i13 = i10;
                                z3 = false;
                                if (z3 && !hasNestedScrollingParent(1)) {
                                    nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                                }
                                onOverScrolled(i12, i13, z2, z3);
                                if (z2 || z3) {
                                    return true;
                                }
                                return false;
                            }
                            z3 = true;
                            nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                            onOverScrolled(i12, i13, z2, z3);
                            if (!z2) {
                            }
                            return true;
                        }
                        z2 = true;
                        if (i10 <= i11) {
                            i13 = i11;
                        } else if (i10 >= i13) {
                            i13 = i10;
                            z3 = false;
                            nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                            onOverScrolled(i12, i13, z2, z3);
                            if (z2) {
                            }
                            return true;
                        }
                        z3 = true;
                        nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                        onOverScrolled(i12, i13, z2, z3);
                        if (z2) {
                        }
                        return true;
                    }
                }
                obj = 1;
                overScrollMode = i3 + i;
                if (obj2 != null) {
                }
                i10 = i4 + i2;
                if (obj != null) {
                }
                i12 = -i9;
                i9 += i5;
                i13 = -i11;
                i11 += i6;
                if (overScrollMode <= i9) {
                    i12 = i9;
                } else if (overScrollMode >= i12) {
                    i12 = overScrollMode;
                    z2 = false;
                    if (i10 <= i11) {
                        i13 = i11;
                    } else if (i10 >= i13) {
                        i13 = i10;
                        z3 = false;
                        nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                        onOverScrolled(i12, i13, z2, z3);
                        if (z2) {
                        }
                        return true;
                    }
                    z3 = true;
                    nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                    return true;
                }
                z2 = true;
                if (i10 <= i11) {
                    i13 = i11;
                } else if (i10 >= i13) {
                    i13 = i10;
                    z3 = false;
                    nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                    return true;
                }
                z3 = true;
                nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
                return true;
            }
        }
        obj2 = 1;
        if (overScrollMode != 0) {
            if (overScrollMode == 1) {
            }
            obj = null;
            overScrollMode = i3 + i;
            if (obj2 != null) {
            }
            i10 = i4 + i2;
            if (obj != null) {
            }
            i12 = -i9;
            i9 += i5;
            i13 = -i11;
            i11 += i6;
            if (overScrollMode <= i9) {
                i12 = i9;
            } else if (overScrollMode >= i12) {
                i12 = overScrollMode;
                z2 = false;
                if (i10 <= i11) {
                    i13 = i11;
                } else if (i10 >= i13) {
                    i13 = i10;
                    z3 = false;
                    nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                    onOverScrolled(i12, i13, z2, z3);
                    if (z2) {
                    }
                    return true;
                }
                z3 = true;
                nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
                return true;
            }
            z2 = true;
            if (i10 <= i11) {
                i13 = i11;
            } else if (i10 >= i13) {
                i13 = i10;
                z3 = false;
                nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
                return true;
            }
            z3 = true;
            nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
            return true;
        }
        obj = 1;
        overScrollMode = i3 + i;
        if (obj2 != null) {
        }
        i10 = i4 + i2;
        if (obj != null) {
        }
        i12 = -i9;
        i9 += i5;
        i13 = -i11;
        i11 += i6;
        if (overScrollMode <= i9) {
            i12 = i9;
        } else if (overScrollMode >= i12) {
            i12 = overScrollMode;
            z2 = false;
            if (i10 <= i11) {
                i13 = i11;
            } else if (i10 >= i13) {
                i13 = i10;
                z3 = false;
                nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
                onOverScrolled(i12, i13, z2, z3);
                if (z2) {
                }
                return true;
            }
            z3 = true;
            nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
            return true;
        }
        z2 = true;
        if (i10 <= i11) {
            i13 = i11;
        } else if (i10 >= i13) {
            i13 = i10;
            z3 = false;
            nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
            onOverScrolled(i12, i13, z2, z3);
            if (z2) {
            }
            return true;
        }
        z3 = true;
        nestedScrollView.f12788c.springBack(i12, i13, 0, 0, 0, getScrollRange());
        onOverScrolled(i12, i13, z2, z3);
        if (z2) {
        }
        return true;
    }

    int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    /* renamed from: a */
    private View m15792a(boolean z, int i, int i2) {
        List focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        Object obj = null;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                Object obj2 = (i >= top || bottom >= i2) ? null : 1;
                if (view == null) {
                    view = view2;
                    obj = obj2;
                } else {
                    Object obj3 = ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) ? null : 1;
                    if (obj != null) {
                        if (!(obj2 == null || obj3 == null)) {
                        }
                    } else if (obj2 != null) {
                        view = view2;
                        obj = 1;
                    } else if (obj3 == null) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public boolean m15813a(int i) {
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        if (obj != null) {
            this.f12787b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f12787b.top + height > childAt.getBottom()) {
                    this.f12787b.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f12787b.top = getScrollY() - height;
            if (this.f12787b.top < 0) {
                this.f12787b.top = 0;
            }
        }
        this.f12787b.bottom = this.f12787b.top + height;
        return m15795a(i, this.f12787b.top, this.f12787b.bottom);
    }

    /* renamed from: b */
    public boolean m15817b(int i) {
        Object obj = i == 130 ? 1 : null;
        int height = getHeight();
        this.f12787b.top = 0;
        this.f12787b.bottom = height;
        if (obj != null) {
            int childCount = getChildCount();
            if (childCount > 0) {
                this.f12787b.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
                this.f12787b.top = this.f12787b.bottom - height;
            }
        }
        return m15795a(i, this.f12787b.top, this.f12787b.bottom);
    }

    /* renamed from: a */
    private boolean m15795a(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        height += scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m15792a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > height) {
            m15807e(z2 ? i2 - scrollY : i3 - height);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    public boolean m15818c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m15798a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom() - ((getScrollY() + getHeight()) - getPaddingBottom());
                if (bottom < maxScrollAmount) {
                    maxScrollAmount = bottom;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m15807e(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f12787b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f12787b);
            m15807e(m15811a(this.f12787b));
            findNextFocus.requestFocus(i);
        }
        if (!(findFocus == null || findFocus.isFocused() == 0 || m15797a(findFocus) == 0)) {
            i = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(i);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m15797a(View view) {
        return m15798a(view, 0, getHeight()) ^ 1;
    }

    /* renamed from: a */
    private boolean m15798a(View view, int i, int i2) {
        view.getDrawingRect(this.f12787b);
        offsetDescendantRectToMyCoords(view, this.f12787b);
        return (this.f12787b.bottom + i < getScrollY() || this.f12787b.top - i > getScrollY() + i2) ? null : true;
    }

    /* renamed from: e */
    private void m15807e(int i) {
        if (i == 0) {
            return;
        }
        if (this.f12798m) {
            m15812a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: a */
    public final void m15812a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f12786a > 250) {
                i = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f12788c.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, i)) - scrollY);
                ViewCompat.m2200c(this);
            } else {
                if (!this.f12788c.isFinished()) {
                    this.f12788c.abortAnimation();
                }
                scrollBy(i, i2);
            }
            this.f12786a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b */
    public final void m15816b(int i, int i2) {
        m15812a(i - getScrollX(), i2 - getScrollY());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    protected void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void computeScroll() {
        if (this.f12788c.computeScrollOffset()) {
            r10.f12788c.getCurrX();
            int currY = r10.f12788c.getCurrY();
            int i = currY - r10.f12806u;
            if (dispatchNestedPreScroll(0, i, r10.f12804s, null, 1)) {
                i -= r10.f12804s[1];
            }
            int i2 = i;
            if (i2 != 0) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY;
                m15814a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - i3;
                if (!dispatchNestedScroll(0, scrollY2, 0, i2 - scrollY2, null, 1)) {
                    Object obj;
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode != 0) {
                        if (overScrollMode != 1 || scrollRange <= 0) {
                            obj = null;
                            if (obj != null) {
                                m15810g();
                                if (currY > 0 && i3 > 0) {
                                    r10.f12789d.onAbsorb((int) r10.f12788c.getCurrVelocity());
                                } else if (currY >= scrollRange && i3 < scrollRange) {
                                    r10.f12790e.onAbsorb((int) r10.f12788c.getCurrVelocity());
                                }
                            }
                        }
                    }
                    obj = 1;
                    if (obj != null) {
                        m15810g();
                        if (currY > 0) {
                        }
                        r10.f12790e.onAbsorb((int) r10.f12788c.getCurrVelocity());
                    }
                }
            }
            r10.f12806u = currY;
            ViewCompat.m2200c(this);
            return;
        }
        if (hasNestedScrollingParent(1)) {
            stopNestedScroll(1);
        }
        r10.f12806u = 0;
    }

    /* renamed from: b */
    private void m15801b(View view) {
        view.getDrawingRect(this.f12787b);
        offsetDescendantRectToMyCoords(view, this.f12787b);
        view = m15811a(this.f12787b);
        if (view != null) {
            scrollBy(0, view);
        }
    }

    /* renamed from: a */
    private boolean m15796a(Rect rect, boolean z) {
        int a = m15811a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                m15812a(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    protected int m15811a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                rect = (rect.top - scrollY) + null;
            } else {
                rect = (rect.bottom - i2) + null;
            }
            i = Math.min(rect, getChildAt(0).getBottom() - i2);
        } else if (rect.top < scrollY && rect.bottom < i2) {
            if (rect.height() > height) {
                i = 0 - (i2 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            i = Math.max(i, -getScrollY());
        }
        return i;
    }

    public void requestChildFocus(View view, View view2) {
        if (this.f12792g) {
            this.f12794i = view2;
        } else {
            m15801b(view2);
        }
        super.requestChildFocus(view, view2);
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocus;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            findNextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocus == null || m15797a(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m15796a(rect, z);
    }

    public void requestLayout() {
        this.f12792g = true;
        super.requestLayout();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12792g = false;
        if (!(this.f12794i == 0 || m15799a(this.f12794i, (View) this) == 0)) {
            m15801b(this.f12794i);
        }
        this.f12794i = null;
        if (this.f12793h == 0) {
            if (this.f12807v != 0) {
                scrollTo(getScrollX(), this.f12807v.scrollPosition);
                this.f12807v = null;
            }
            i = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > i) {
                scrollTo(getScrollX(), i);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f12793h = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12793h = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null) {
            if (this != findFocus) {
                if (m15798a(findFocus, 0, i4) != 0) {
                    findFocus.getDrawingRect(this.f12787b);
                    offsetDescendantRectToMyCoords(findFocus, this.f12787b);
                    m15807e(m15811a(this.f12787b));
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m15799a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        view = view.getParent();
        if (!(view instanceof ViewGroup) || m15799a(view, view2) == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    public void m15819d(int i) {
        if (getChildCount() > 0) {
            startNestedScroll(2, 1);
            this.f12788c.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, 0);
            this.f12806u = getScrollY();
            ViewCompat.m2200c(this);
        }
    }

    /* renamed from: f */
    private void m15809f(int i) {
        boolean z;
        float f;
        int scrollY = getScrollY();
        if (scrollY > 0 || i > 0) {
            if (scrollY >= getScrollRange()) {
                if (i < 0) {
                }
            }
            z = true;
            f = (float) i;
            if (!dispatchNestedPreFling(0.0f, f)) {
                dispatchNestedFling(0.0f, f, z);
                m15819d(i);
            }
        }
        z = false;
        f = (float) i;
        if (!dispatchNestedPreFling(0.0f, f)) {
            dispatchNestedFling(0.0f, f, z);
            m15819d(i);
        }
    }

    /* renamed from: f */
    private void m15808f() {
        this.f12795j = false;
        m15806e();
        stopNestedScroll(0);
        if (this.f12789d != null) {
            this.f12789d.onRelease();
            this.f12790e.onRelease();
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            i = m15800b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            i2 = m15800b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    /* renamed from: g */
    private void m15810g() {
        if (getOverScrollMode() == 2) {
            this.f12789d = null;
            this.f12790e = null;
        } else if (this.f12789d == null) {
            Context context = getContext();
            this.f12789d = new EdgeEffect(context);
            this.f12790e = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f12789d != null) {
            int save;
            int width;
            int height;
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f12789d.isFinished()) {
                int i2;
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT >= 21) {
                    if (!getClipToPadding()) {
                        i2 = 0;
                        if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                            height -= getPaddingTop() + getPaddingBottom();
                            min += getPaddingTop();
                        }
                        canvas.translate((float) i2, (float) min);
                        this.f12789d.setSize(width, height);
                        if (this.f12789d.draw(canvas)) {
                            ViewCompat.m2200c(this);
                        }
                        canvas.restoreToCount(save);
                    }
                }
                width -= getPaddingLeft() + getPaddingRight();
                i2 = getPaddingLeft() + 0;
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
                canvas.translate((float) i2, (float) min);
                this.f12789d.setSize(width, height);
                if (this.f12789d.draw(canvas)) {
                    ViewCompat.m2200c(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f12790e.isFinished()) {
                save = canvas.save();
                width = getWidth();
                height = getHeight();
                scrollY = Math.max(getScrollRange(), scrollY) + height;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    scrollY -= getPaddingBottom();
                }
                canvas.translate((float) (i - width), (float) scrollY);
                canvas.rotate(180.0f, (float) width, 0.0f);
                this.f12790e.setSize(width, height);
                if (this.f12790e.draw(canvas)) {
                    ViewCompat.m2200c(this);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f12807v = savedState;
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.scrollPosition = getScrollY();
        return savedState;
    }
}
