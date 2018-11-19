package android.support.v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.annotation.CallSuper;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.C0432b;
import android.support.v4.view.accessibility.C0586b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.facebook.ads.AdError;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<C0573a> COMPARATOR = new C05691();
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS = new int[]{16842931};
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = new C05702();
    private static final C0575e sPositionComparator = new C0575e();
    private int mActivePointerId = -1;
    C0600i mAdapter;
    private List<OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new C05713(this);
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C0573a> mItems = new ArrayList();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private C0574c mObserver;
    private int mOffscreenPageLimit = 1;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C0573a mTempItem = new C0573a();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    /* renamed from: android.support.v4.view.ViewPager$1 */
    static class C05691 implements Comparator<C0573a> {
        C05691() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m2235a((C0573a) obj, (C0573a) obj2);
        }

        /* renamed from: a */
        public int m2235a(C0573a c0573a, C0573a c0573a2) {
            return c0573a.f1771b - c0573a2.f1771b;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$2 */
    static class C05702 implements Interpolator {
        public float getInterpolation(float f) {
            f -= 1.0f;
            return ((((f * f) * f) * f) * f) + 1.0f;
        }

        C05702() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$3 */
    class C05713 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ViewPager f1763a;

        C05713(ViewPager viewPager) {
            this.f1763a = viewPager;
        }

        public void run() {
            this.f1763a.setScrollState(0);
            this.f1763a.populate();
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        /* renamed from: a */
        public boolean f1764a;
        /* renamed from: b */
        public int f1765b;
        /* renamed from: c */
        float f1766c = 0.0f;
        /* renamed from: d */
        boolean f1767d;
        /* renamed from: e */
        int f1768e;
        /* renamed from: f */
        int f1769f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f1765b = context.getInteger(null, 48);
            context.recycle();
        }
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable C0600i c0600i, @Nullable C0600i c0600i2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public interface PageTransformer {
        void transformPage(@NonNull View view, float f);
    }

    /* renamed from: android.support.v4.view.ViewPager$a */
    static class C0573a {
        /* renamed from: a */
        Object f1770a;
        /* renamed from: b */
        int f1771b;
        /* renamed from: c */
        boolean f1772c;
        /* renamed from: d */
        float f1773d;
        /* renamed from: e */
        float f1774e;

        C0573a() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$c */
    private class C0574c extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ ViewPager f1775a;

        C0574c(ViewPager viewPager) {
            this.f1775a = viewPager;
        }

        public void onChanged() {
            this.f1775a.dataSetChanged();
        }

        public void onInvalidated() {
            this.f1775a.dataSetChanged();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    static class C0575e implements Comparator<View> {
        C0575e() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m2239a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        public int m2239a(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f1764a == layoutParams2.f1764a) {
                return layoutParams.f1768e - layoutParams2.f1768e;
            }
            return layoutParams.f1764a != null ? true : -1;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$4 */
    class C28854 implements OnApplyWindowInsetsListener {
        /* renamed from: a */
        final /* synthetic */ ViewPager f9105a;
        /* renamed from: b */
        private final Rect f9106b = new Rect();

        C28854(ViewPager viewPager) {
            this.f9105a = viewPager;
        }

        public C0610p onApplyWindowInsets(View view, C0610p c0610p) {
            C0610p a = ViewCompat.m2174a(view, c0610p);
            if (a.m2393e() != null) {
                return a;
            }
            c0610p = this.f9106b;
            c0610p.left = a.m2388a();
            c0610p.top = a.m2390b();
            c0610p.right = a.m2391c();
            c0610p.bottom = a.m2392d();
            int childCount = this.f9105a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0610p b = ViewCompat.m2194b(this.f9105a.getChildAt(i), a);
                c0610p.left = Math.min(b.m2388a(), c0610p.left);
                c0610p.top = Math.min(b.m2390b(), c0610p.top);
                c0610p.right = Math.min(b.m2391c(), c0610p.right);
                c0610p.bottom = Math.min(b.m2392d(), c0610p.bottom);
            }
            return a.m2389a(c0610p.left, c0610p.top, c0610p.right, c0610p.bottom);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C05721();
        Parcelable adapterState;
        ClassLoader loader;
        int position;

        /* renamed from: android.support.v4.view.ViewPager$SavedState$1 */
        static class C05721 implements ClassLoaderCreator<SavedState> {
            C05721() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2236a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m2237a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2238a(i);
            }

            /* renamed from: a */
            public SavedState m2237a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m2236a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m2238a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FragmentPager.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" position=");
            stringBuilder.append(this.position);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$b */
    class C2886b extends C0582a {
        /* renamed from: a */
        final /* synthetic */ ViewPager f9107a;

        C2886b(ViewPager viewPager) {
            this.f9107a = viewPager;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m11360a());
            if (accessibilityEvent.getEventType() == 4096 && this.f9107a.mAdapter != null) {
                accessibilityEvent.setItemCount(this.f9107a.mAdapter.getCount());
                accessibilityEvent.setFromIndex(this.f9107a.mCurItem);
                accessibilityEvent.setToIndex(this.f9107a.mCurItem);
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
            super.onInitializeAccessibilityNodeInfo(view, c0586b);
            c0586b.m2264b(ViewPager.class.getName());
            c0586b.m2284h(m11360a());
            if (this.f9107a.canScrollHorizontally(1) != null) {
                c0586b.m2255a(4096);
            }
            if (this.f9107a.canScrollHorizontally(-1) != null) {
                c0586b.m2255a(8192);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle) != null) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || this.f9107a.canScrollHorizontally(-1) == null) {
                    return false;
                }
                this.f9107a.setCurrentItem(this.f9107a.mCurItem - 1);
                return true;
            } else if (this.f9107a.canScrollHorizontally(1) == null) {
                return false;
            } else {
                this.f9107a.setCurrentItem(this.f9107a.mCurItem + 1);
                return true;
            }
        }

        /* renamed from: a */
        private boolean m11360a() {
            return this.f9107a.mAdapter != null && this.f9107a.mAdapter.getCount() > 1;
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    public static class C2887d implements OnPageChangeListener {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        initViewPager();
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.m2185a((View) this, new C2886b(this));
        if (ViewCompat.m2203d(this) == 0) {
            ViewCompat.m2176a((View) this, 1);
        }
        ViewCompat.m2184a((View) this, new C28854(this));
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        if (!(this.mScroller == null || this.mScroller.isFinished())) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                enableLayers(i != 0);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setAdapter(@Nullable C0600i c0600i) {
        int i = 0;
        if (this.mAdapter != null) {
            this.mAdapter.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.mItems.size(); i2++) {
                C0573a c0573a = (C0573a) this.mItems.get(i2);
                this.mAdapter.destroyItem((ViewGroup) this, c0573a.f1771b, c0573a.f1770a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        C0600i c0600i2 = this.mAdapter;
        this.mAdapter = c0600i;
        this.mExpectedAdapterCount = 0;
        if (this.mAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new C0574c(this);
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (z) {
                requestLayout();
            } else {
                populate();
            }
        }
        if (this.mAdapterChangeListeners != null && !this.mAdapterChangeListeners.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            while (i < size) {
                ((OnAdapterChangeListener) this.mAdapterChangeListeners.get(i)).onAdapterChanged(this, c0600i2, c0600i);
                i++;
            }
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f1764a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    @Nullable
    public C0600i getAdapter() {
        return this.mAdapter;
    }

    public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(onAdapterChangeListener);
    }

    public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener onAdapterChangeListener) {
        if (this.mAdapterChangeListeners != null) {
            this.mAdapterChangeListeners.remove(onAdapterChangeListener);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, this.mFirstLayout ^ 1, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        if (this.mAdapter != null) {
            if (this.mAdapter.getCount() > 0) {
                if (!z2 && this.mCurItem == i && this.mItems.size()) {
                    setScrollingCacheEnabled(false);
                    return;
                }
                z2 = true;
                if (i < 0) {
                    i = 0;
                } else if (i >= this.mAdapter.getCount()) {
                    i = this.mAdapter.getCount() - 1;
                }
                int i3 = this.mOffscreenPageLimit;
                if (i > this.mCurItem + i3 || i < this.mCurItem - i3) {
                    for (i3 = 0; i3 < this.mItems.size(); i3++) {
                        ((C0573a) this.mItems.get(i3)).f1772c = true;
                    }
                }
                if (this.mCurItem == i) {
                    z2 = false;
                }
                if (this.mFirstLayout) {
                    this.mCurItem = i;
                    if (z2) {
                        dispatchOnPageSelected(i);
                    }
                    requestLayout();
                } else {
                    populate(i);
                    scrollToItem(i, z, i2, z2);
                }
                return;
            }
        }
        setScrollingCacheEnabled(false);
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        C0573a infoForPosition = infoForPosition(i);
        int clientWidth = infoForPosition != null ? (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.f1774e, this.mLastOffset))) : 0;
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    public void addOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    public void removeOnPageChangeListener(@NonNull OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners != null) {
            this.mOnPageChangeListeners.remove(onPageChangeListener);
        }
    }

    public void clearOnPageChangeListeners() {
        if (this.mOnPageChangeListeners != null) {
            this.mOnPageChangeListeners.clear();
        }
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer pageTransformer) {
        setPageTransformer(z, pageTransformer, 2);
    }

    public void setPageTransformer(boolean z, @Nullable PageTransformer pageTransformer, int i) {
        int i2 = 1;
        boolean z2 = pageTransformer != null;
        Object obj = z2 != (this.mPageTransformer != null) ? 1 : null;
        this.mPageTransformer = pageTransformer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (obj != null) {
            populate();
        }
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.mDrawingOrderedChildren.get(i2)).getLayoutParams()).f1769f;
    }

    OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Requested offscreen page limit ");
            stringBuilder.append(i);
            stringBuilder.append(" too small; defaulting to ");
            stringBuilder.append(1);
            Log.w(str, stringBuilder.toString());
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null ? true : null);
        invalidate();
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(C0432b.m1640a(getContext(), i));
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.mMarginDrawable) {
                return null;
            }
        }
        return true;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    void smoothScrollTo(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int currX;
        Object obj = (this.mScroller == null || this.mScroller.isFinished()) ? null : 1;
        if (obj != null) {
            currX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            currX = getScrollX();
        }
        int i4 = currX;
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        i = getClientWidth();
        i2 = i / 2;
        i = (float) i;
        i2 = (float) i2;
        i2 += distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / i)) * i2;
        i3 = Math.abs(i3);
        if (i3 > 0) {
            i = Math.round(Math.abs(i2 / ((float) i3)) * 1148846080) * 4;
        } else {
            i = (int) (((((float) Math.abs(i5)) / ((i * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1065353216) * 1120403456);
        }
        int min = Math.min(i, MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i5, i6, min);
        ViewCompat.m2200c(this);
    }

    C0573a addNewItem(int i, int i2) {
        C0573a c0573a = new C0573a();
        c0573a.f1771b = i;
        c0573a.f1770a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        c0573a.f1773d = this.mAdapter.getPageWidth(i);
        if (i2 >= 0) {
            if (i2 < this.mItems.size()) {
                this.mItems.add(i2, c0573a);
                return c0573a;
            }
        }
        this.mItems.add(c0573a);
        return c0573a;
    }

    void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        Object obj = (this.mItems.size() >= (this.mOffscreenPageLimit * 2) + 1 || this.mItems.size() >= count) ? null : 1;
        Object obj2 = obj;
        int i = this.mCurItem;
        int i2 = 0;
        Object obj3 = null;
        while (i2 < this.mItems.size()) {
            C0573a c0573a = (C0573a) this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(c0573a.f1770a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (obj3 == null) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        obj3 = 1;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, c0573a.f1771b, c0573a.f1770a);
                    if (this.mCurItem == c0573a.f1771b) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (c0573a.f1771b != itemPosition) {
                    if (c0573a.f1771b == this.mCurItem) {
                        i = itemPosition;
                    }
                    c0573a.f1771b = itemPosition;
                }
                obj2 = 1;
            }
            i2++;
        }
        if (obj3 != null) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (obj2 != null) {
            count = getChildCount();
            for (i2 = 0; i2 < count; i2++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
                if (!layoutParams.f1764a) {
                    layoutParams.f1766c = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    void populate() {
        populate(this.mCurItem);
    }

    void populate(int r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r0.mCurItem;
        if (r2 == r1) goto L_0x0011;
    L_0x0008:
        r2 = r0.mCurItem;
        r2 = r0.infoForPosition(r2);
        r0.mCurItem = r1;
        goto L_0x0012;
    L_0x0011:
        r2 = 0;
    L_0x0012:
        r1 = r0.mAdapter;
        if (r1 != 0) goto L_0x001a;
    L_0x0016:
        r18.sortChildDrawingOrder();
        return;
    L_0x001a:
        r1 = r0.mPopulatePending;
        if (r1 == 0) goto L_0x0022;
    L_0x001e:
        r18.sortChildDrawingOrder();
        return;
    L_0x0022:
        r1 = r18.getWindowToken();
        if (r1 != 0) goto L_0x0029;
    L_0x0028:
        return;
    L_0x0029:
        r1 = r0.mAdapter;
        r1.startUpdate(r0);
        r1 = r0.mOffscreenPageLimit;
        r4 = r0.mCurItem;
        r4 = r4 - r1;
        r5 = 0;
        r4 = java.lang.Math.max(r5, r4);
        r6 = r0.mAdapter;
        r6 = r6.getCount();
        r7 = r6 + -1;
        r8 = r0.mCurItem;
        r8 = r8 + r1;
        r1 = java.lang.Math.min(r7, r8);
        r7 = r0.mExpectedAdapterCount;
        if (r6 == r7) goto L_0x00a3;
    L_0x004b:
        r1 = r18.getResources();	 Catch:{ NotFoundException -> 0x0058 }
        r2 = r18.getId();	 Catch:{ NotFoundException -> 0x0058 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x0058 }
        goto L_0x0060;
    L_0x0058:
        r1 = r18.getId();
        r1 = java.lang.Integer.toHexString(r1);
    L_0x0060:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r3.append(r4);
        r4 = r0.mExpectedAdapterCount;
        r3.append(r4);
        r4 = ", found: ";
        r3.append(r4);
        r3.append(r6);
        r4 = " Pager id: ";
        r3.append(r4);
        r3.append(r1);
        r1 = " Pager class: ";
        r3.append(r1);
        r1 = r18.getClass();
        r3.append(r1);
        r1 = " Problematic adapter: ";
        r3.append(r1);
        r1 = r0.mAdapter;
        r1 = r1.getClass();
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x00a3:
        r7 = 0;
    L_0x00a4:
        r8 = r0.mItems;
        r8 = r8.size();
        if (r7 >= r8) goto L_0x00c4;
    L_0x00ac:
        r8 = r0.mItems;
        r8 = r8.get(r7);
        r8 = (android.support.v4.view.ViewPager.C0573a) r8;
        r9 = r8.f1771b;
        r10 = r0.mCurItem;
        if (r9 < r10) goto L_0x00c1;
    L_0x00ba:
        r9 = r8.f1771b;
        r10 = r0.mCurItem;
        if (r9 != r10) goto L_0x00c4;
    L_0x00c0:
        goto L_0x00c5;
    L_0x00c1:
        r7 = r7 + 1;
        goto L_0x00a4;
    L_0x00c4:
        r8 = 0;
    L_0x00c5:
        if (r8 != 0) goto L_0x00cf;
    L_0x00c7:
        if (r6 <= 0) goto L_0x00cf;
    L_0x00c9:
        r8 = r0.mCurItem;
        r8 = r0.addNewItem(r8, r7);
    L_0x00cf:
        r9 = 0;
        if (r8 == 0) goto L_0x01fb;
    L_0x00d2:
        r10 = r7 + -1;
        if (r10 < 0) goto L_0x00df;
    L_0x00d6:
        r11 = r0.mItems;
        r11 = r11.get(r10);
        r11 = (android.support.v4.view.ViewPager.C0573a) r11;
        goto L_0x00e0;
    L_0x00df:
        r11 = 0;
    L_0x00e0:
        r12 = r18.getClientWidth();
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r12 > 0) goto L_0x00ea;
    L_0x00e8:
        r3 = 0;
        goto L_0x00f7;
    L_0x00ea:
        r14 = r8.f1773d;
        r14 = r13 - r14;
        r15 = r18.getPaddingLeft();
        r15 = (float) r15;
        r3 = (float) r12;
        r15 = r15 / r3;
        r3 = r14 + r15;
    L_0x00f7:
        r14 = r0.mCurItem;
        r14 = r14 + -1;
        r15 = r7;
        r7 = 0;
    L_0x00fd:
        if (r14 < 0) goto L_0x015d;
    L_0x00ff:
        r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r16 < 0) goto L_0x012b;
    L_0x0103:
        if (r14 >= r4) goto L_0x012b;
    L_0x0105:
        if (r11 != 0) goto L_0x0108;
    L_0x0107:
        goto L_0x015d;
    L_0x0108:
        r5 = r11.f1771b;
        if (r14 != r5) goto L_0x0159;
    L_0x010c:
        r5 = r11.f1772c;
        if (r5 != 0) goto L_0x0159;
    L_0x0110:
        r5 = r0.mItems;
        r5.remove(r10);
        r5 = r0.mAdapter;
        r11 = r11.f1770a;
        r5.destroyItem(r0, r14, r11);
        r10 = r10 + -1;
        r15 = r15 + -1;
        if (r10 < 0) goto L_0x0157;
    L_0x0122:
        r5 = r0.mItems;
        r5 = r5.get(r10);
        r5 = (android.support.v4.view.ViewPager.C0573a) r5;
        goto L_0x0158;
    L_0x012b:
        if (r11 == 0) goto L_0x0141;
    L_0x012d:
        r5 = r11.f1771b;
        if (r14 != r5) goto L_0x0141;
    L_0x0131:
        r5 = r11.f1773d;
        r7 = r7 + r5;
        r10 = r10 + -1;
        if (r10 < 0) goto L_0x0157;
    L_0x0138:
        r5 = r0.mItems;
        r5 = r5.get(r10);
        r5 = (android.support.v4.view.ViewPager.C0573a) r5;
        goto L_0x0158;
    L_0x0141:
        r5 = r10 + 1;
        r5 = r0.addNewItem(r14, r5);
        r5 = r5.f1773d;
        r7 = r7 + r5;
        r15 = r15 + 1;
        if (r10 < 0) goto L_0x0157;
    L_0x014e:
        r5 = r0.mItems;
        r5 = r5.get(r10);
        r5 = (android.support.v4.view.ViewPager.C0573a) r5;
        goto L_0x0158;
    L_0x0157:
        r5 = 0;
    L_0x0158:
        r11 = r5;
    L_0x0159:
        r14 = r14 + -1;
        r5 = 0;
        goto L_0x00fd;
    L_0x015d:
        r3 = r8.f1773d;
        r4 = r15 + 1;
        r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r5 >= 0) goto L_0x01ef;
    L_0x0165:
        r5 = r0.mItems;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x0176;
    L_0x016d:
        r5 = r0.mItems;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0573a) r5;
        goto L_0x0177;
    L_0x0176:
        r5 = 0;
    L_0x0177:
        if (r12 > 0) goto L_0x017b;
    L_0x0179:
        r7 = 0;
        goto L_0x0183;
    L_0x017b:
        r7 = r18.getPaddingRight();
        r7 = (float) r7;
        r10 = (float) r12;
        r7 = r7 / r10;
        r7 = r7 + r13;
    L_0x0183:
        r10 = r0.mCurItem;
    L_0x0185:
        r10 = r10 + 1;
        if (r10 >= r6) goto L_0x01ef;
    L_0x0189:
        r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r11 < 0) goto L_0x01b9;
    L_0x018d:
        if (r10 <= r1) goto L_0x01b9;
    L_0x018f:
        if (r5 != 0) goto L_0x0192;
    L_0x0191:
        goto L_0x01ef;
    L_0x0192:
        r11 = r5.f1771b;
        if (r10 != r11) goto L_0x01ee;
    L_0x0196:
        r11 = r5.f1772c;
        if (r11 != 0) goto L_0x01ee;
    L_0x019a:
        r11 = r0.mItems;
        r11.remove(r4);
        r11 = r0.mAdapter;
        r5 = r5.f1770a;
        r11.destroyItem(r0, r10, r5);
        r5 = r0.mItems;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x01b7;
    L_0x01ae:
        r5 = r0.mItems;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0573a) r5;
        goto L_0x01ee;
    L_0x01b7:
        r5 = 0;
        goto L_0x01ee;
    L_0x01b9:
        if (r5 == 0) goto L_0x01d5;
    L_0x01bb:
        r11 = r5.f1771b;
        if (r10 != r11) goto L_0x01d5;
    L_0x01bf:
        r5 = r5.f1773d;
        r3 = r3 + r5;
        r4 = r4 + 1;
        r5 = r0.mItems;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x01b7;
    L_0x01cc:
        r5 = r0.mItems;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0573a) r5;
        goto L_0x01ee;
    L_0x01d5:
        r5 = r0.addNewItem(r10, r4);
        r4 = r4 + 1;
        r5 = r5.f1773d;
        r3 = r3 + r5;
        r5 = r0.mItems;
        r5 = r5.size();
        if (r4 >= r5) goto L_0x01b7;
    L_0x01e6:
        r5 = r0.mItems;
        r5 = r5.get(r4);
        r5 = (android.support.v4.view.ViewPager.C0573a) r5;
    L_0x01ee:
        goto L_0x0185;
    L_0x01ef:
        r0.calculatePageOffsets(r8, r15, r2);
        r1 = r0.mAdapter;
        r2 = r0.mCurItem;
        r3 = r8.f1770a;
        r1.setPrimaryItem(r0, r2, r3);
    L_0x01fb:
        r1 = r0.mAdapter;
        r1.finishUpdate(r0);
        r1 = r18.getChildCount();
        r2 = 0;
    L_0x0205:
        if (r2 >= r1) goto L_0x022e;
    L_0x0207:
        r3 = r0.getChildAt(r2);
        r4 = r3.getLayoutParams();
        r4 = (android.support.v4.view.ViewPager.LayoutParams) r4;
        r4.f1769f = r2;
        r5 = r4.f1764a;
        if (r5 != 0) goto L_0x022b;
    L_0x0217:
        r5 = r4.f1766c;
        r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r5 != 0) goto L_0x022b;
    L_0x021d:
        r3 = r0.infoForChild(r3);
        if (r3 == 0) goto L_0x022b;
    L_0x0223:
        r5 = r3.f1773d;
        r4.f1766c = r5;
        r3 = r3.f1771b;
        r4.f1768e = r3;
    L_0x022b:
        r2 = r2 + 1;
        goto L_0x0205;
    L_0x022e:
        r18.sortChildDrawingOrder();
        r1 = r18.hasFocus();
        if (r1 == 0) goto L_0x026d;
    L_0x0237:
        r1 = r18.findFocus();
        if (r1 == 0) goto L_0x0242;
    L_0x023d:
        r3 = r0.infoForAnyChild(r1);
        goto L_0x0243;
    L_0x0242:
        r3 = 0;
    L_0x0243:
        if (r3 == 0) goto L_0x024b;
    L_0x0245:
        r1 = r3.f1771b;
        r2 = r0.mCurItem;
        if (r1 == r2) goto L_0x026d;
    L_0x024b:
        r1 = 0;
    L_0x024c:
        r2 = r18.getChildCount();
        if (r1 >= r2) goto L_0x026d;
    L_0x0252:
        r2 = r0.getChildAt(r1);
        r3 = r0.infoForChild(r2);
        if (r3 == 0) goto L_0x026a;
    L_0x025c:
        r3 = r3.f1771b;
        r4 = r0.mCurItem;
        if (r3 != r4) goto L_0x026a;
    L_0x0262:
        r3 = 2;
        r2 = r2.requestFocus(r3);
        if (r2 == 0) goto L_0x026a;
    L_0x0269:
        goto L_0x026d;
    L_0x026a:
        r1 = r1 + 1;
        goto L_0x024c;
    L_0x026d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.populate(int):void");
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            if (this.mDrawingOrderedChildren == null) {
                this.mDrawingOrderedChildren = new ArrayList();
            } else {
                this.mDrawingOrderedChildren.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    private void calculatePageOffsets(C0573a c0573a, int i, C0573a c0573a2) {
        int size;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        if (c0573a2 != null) {
            int i2 = c0573a2.f1771b;
            C0573a c0573a3;
            if (i2 < c0573a.f1771b) {
                float f2 = (c0573a2.f1774e + c0573a2.f1773d) + f;
                i2++;
                c0573a2 = null;
                while (i2 <= c0573a.f1771b && c0573a2 < this.mItems.size()) {
                    c0573a3 = (C0573a) this.mItems.get(c0573a2);
                    while (i2 > c0573a3.f1771b && c0573a2 < this.mItems.size() - 1) {
                        c0573a2++;
                        c0573a3 = (C0573a) this.mItems.get(c0573a2);
                    }
                    while (i2 < c0573a3.f1771b) {
                        f2 += this.mAdapter.getPageWidth(i2) + f;
                        i2++;
                    }
                    c0573a3.f1774e = f2;
                    f2 += c0573a3.f1773d + f;
                    i2++;
                }
            } else if (i2 > c0573a.f1771b) {
                size = this.mItems.size() - 1;
                c0573a2 = c0573a2.f1774e;
                i2--;
                while (i2 >= c0573a.f1771b && size >= 0) {
                    c0573a3 = (C0573a) this.mItems.get(size);
                    while (i2 < c0573a3.f1771b && size > 0) {
                        size--;
                        c0573a3 = (C0573a) this.mItems.get(size);
                    }
                    while (i2 > c0573a3.f1771b) {
                        c0573a2 -= this.mAdapter.getPageWidth(i2) + f;
                        i2--;
                    }
                    c0573a2 -= c0573a3.f1773d + f;
                    c0573a3.f1774e = c0573a2;
                    i2--;
                }
            }
        }
        c0573a2 = this.mItems.size();
        float f3 = c0573a.f1774e;
        size = c0573a.f1771b - 1;
        this.mFirstOffset = c0573a.f1771b == 0 ? c0573a.f1774e : -3.4028235E38f;
        count--;
        this.mLastOffset = c0573a.f1771b == count ? (c0573a.f1774e + c0573a.f1773d) - 1.0f : Float.MAX_VALUE;
        int i3 = i - 1;
        while (i3 >= 0) {
            C0573a c0573a4 = (C0573a) this.mItems.get(i3);
            while (size > c0573a4.f1771b) {
                f3 -= this.mAdapter.getPageWidth(size) + f;
                size--;
            }
            f3 -= c0573a4.f1773d + f;
            c0573a4.f1774e = f3;
            if (c0573a4.f1771b == 0) {
                this.mFirstOffset = f3;
            }
            i3--;
            size--;
        }
        f3 = (c0573a.f1774e + c0573a.f1773d) + f;
        c0573a = c0573a.f1771b + 1;
        i++;
        while (i < c0573a2) {
            C0573a c0573a5 = (C0573a) this.mItems.get(i);
            while (c0573a < c0573a5.f1771b) {
                f3 += this.mAdapter.getPageWidth(c0573a) + f;
                c0573a++;
            }
            if (c0573a5.f1771b == count) {
                this.mLastOffset = (c0573a5.f1773d + f3) - 1.0f;
            }
            c0573a5.f1774e = f3;
            f3 += c0573a5.f1773d + f;
            i++;
            c0573a++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        if (this.mAdapter != null) {
            savedState.adapterState = this.mAdapter.saveState();
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.mAdapter != null) {
                this.mAdapter.restoreState(savedState.adapterState, savedState.loader);
                setCurrentItemInternal(savedState.position, false, true);
            } else {
                this.mRestoredCurItem = savedState.position;
                this.mRestoredAdapterState = savedState.adapterState;
                this.mRestoredClassLoader = savedState.loader;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f1764a |= isDecorView(view);
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f1764a) {
            layoutParams2.f1767d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    private static boolean isDecorView(@NonNull View view) {
        return view.getClass().getAnnotation(DecorView.class) != null ? true : null;
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    C0573a infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C0573a c0573a = (C0573a) this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, c0573a.f1770a)) {
                return c0573a;
            }
        }
        return null;
    }

    C0573a infoForAnyChild(View view) {
        while (true) {
            View parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null) {
                break;
            } else if ((parent instanceof View) == null) {
                break;
            } else {
                view = parent;
            }
        }
        return null;
    }

    C0573a infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C0573a c0573a = (C0573a) this.mItems.get(i2);
            if (c0573a.f1771b == i) {
                return c0573a;
            }
        }
        return 0;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = measuredHeight;
        measuredHeight = measuredWidth;
        measuredWidth = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (measuredWidth >= childCount) {
                break;
            }
            View childAt = getChildAt(measuredWidth);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f1764a) {
                    Object obj;
                    int i6;
                    int i7;
                    int i8 = layoutParams.f1765b & 7;
                    int i9 = layoutParams.f1765b & 112;
                    if (i9 != 48) {
                        if (i9 != 80) {
                            obj = null;
                            if (i8 != 3) {
                                if (i8 == 5) {
                                    z = false;
                                }
                            }
                            i8 = Integer.MIN_VALUE;
                            if (obj != null) {
                                i8 = 1073741824;
                            } else if (z) {
                                i6 = 1073741824;
                                if (layoutParams.width == -2) {
                                    i7 = layoutParams.width == -1 ? layoutParams.width : measuredHeight;
                                    i8 = 1073741824;
                                } else {
                                    i7 = measuredHeight;
                                }
                                if (layoutParams.height != -2) {
                                    i3 = layoutParams.height == -1 ? layoutParams.height : i4;
                                } else {
                                    i3 = i4;
                                    i5 = i6;
                                }
                                childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                                if (obj == null) {
                                    i4 -= childAt.getMeasuredHeight();
                                } else if (!z) {
                                    measuredHeight -= childAt.getMeasuredWidth();
                                }
                            }
                            i6 = Integer.MIN_VALUE;
                            if (layoutParams.width == -2) {
                                i7 = measuredHeight;
                            } else {
                                if (layoutParams.width == -1) {
                                }
                                i8 = 1073741824;
                            }
                            if (layoutParams.height != -2) {
                                i3 = i4;
                                i5 = i6;
                            } else if (layoutParams.height == -1) {
                            }
                            childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                            if (obj == null) {
                                i4 -= childAt.getMeasuredHeight();
                            } else if (!z) {
                                measuredHeight -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    obj = 1;
                    if (i8 != 3) {
                        if (i8 == 5) {
                            z = false;
                        }
                    }
                    i8 = Integer.MIN_VALUE;
                    if (obj != null) {
                        i8 = 1073741824;
                    } else if (z) {
                        i6 = 1073741824;
                        if (layoutParams.width == -2) {
                            if (layoutParams.width == -1) {
                            }
                            i8 = 1073741824;
                        } else {
                            i7 = measuredHeight;
                        }
                        if (layoutParams.height != -2) {
                            i3 = i4;
                            i5 = i6;
                        } else if (layoutParams.height == -1) {
                        }
                        childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                        if (obj == null) {
                            i4 -= childAt.getMeasuredHeight();
                        } else if (!z) {
                            measuredHeight -= childAt.getMeasuredWidth();
                        }
                    }
                    i6 = Integer.MIN_VALUE;
                    if (layoutParams.width == -2) {
                        i7 = measuredHeight;
                    } else {
                        if (layoutParams.width == -1) {
                        }
                        i8 = 1073741824;
                    }
                    if (layoutParams.height != -2) {
                        i3 = i4;
                        i5 = i6;
                    } else if (layoutParams.height == -1) {
                    }
                    childAt.measure(MeasureSpec.makeMeasureSpec(i7, i8), MeasureSpec.makeMeasureSpec(i3, i5));
                    if (obj == null) {
                        i4 -= childAt.getMeasuredHeight();
                    } else if (!z) {
                        measuredHeight -= childAt.getMeasuredWidth();
                    }
                }
            }
            measuredWidth++;
        }
        r0.mChildWidthMeasureSpec = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        r0.mChildHeightMeasureSpec = MeasureSpec.makeMeasureSpec(i4, 1073741824);
        r0.mInLayout = true;
        populate();
        i3 = 0;
        r0.mInLayout = false;
        measuredWidth = getChildCount();
        while (i3 < measuredWidth) {
            View childAt2 = getChildAt(i3);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams2 == null || !layoutParams2.f1764a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (((float) measuredHeight) * layoutParams2.f1766c), 1073741824), r0.mChildHeightMeasureSpec);
                }
            }
            i3++;
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            recomputeScrollPosition(i, i3, this.mPageMargin, this.mPageMargin);
        }
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            i2 = infoForPosition(this.mCurItem);
            i = (int) ((i2 != 0 ? Math.min(i2.f1774e, this.mLastOffset) : 0) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (i != getScrollX()) {
                completeScroll(0);
                scrollTo(i, getScrollY());
            }
        } else if (this.mScroller.isFinished()) {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        } else {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        ViewPager viewPager = this;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = paddingBottom;
        int i8 = 0;
        paddingBottom = paddingTop;
        paddingTop = paddingLeft;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt = getChildAt(paddingLeft);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1764a) {
                    int i9 = layoutParams.f1765b & 7;
                    int i10 = layoutParams.f1765b & 112;
                    if (i9 == 1) {
                        i9 = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingTop);
                    } else if (i9 == 3) {
                        i9 = paddingTop;
                        paddingTop = childAt.getMeasuredWidth() + paddingTop;
                    } else if (i9 != 5) {
                        i9 = paddingTop;
                    } else {
                        i9 = (i5 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i10 == 16) {
                        i10 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingBottom);
                    } else if (i10 == 48) {
                        i10 = paddingBottom;
                        paddingBottom = childAt.getMeasuredHeight() + paddingBottom;
                    } else if (i10 != 80) {
                        i10 = paddingBottom;
                    } else {
                        i10 = (i6 - i7) - childAt.getMeasuredHeight();
                        i7 += childAt.getMeasuredHeight();
                    }
                    i9 += scrollX;
                    childAt.layout(i9, i10, childAt.getMeasuredWidth() + i9, i10 + childAt.getMeasuredHeight());
                    i8++;
                }
            }
        }
        i5 = (i5 - paddingTop) - paddingRight;
        for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
            View childAt2 = getChildAt(paddingLeft);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f1764a) {
                    C0573a infoForChild = infoForChild(childAt2);
                    if (infoForChild != null) {
                        float f = (float) i5;
                        int i11 = ((int) (infoForChild.f1774e * f)) + paddingTop;
                        if (layoutParams2.f1767d) {
                            layoutParams2.f1767d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f1766c), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingBottom) - i7, 1073741824));
                        }
                        childAt2.layout(i11, paddingBottom, childAt2.getMeasuredWidth() + i11, childAt2.getMeasuredHeight() + paddingBottom);
                    }
                }
            }
        }
        viewPager.mTopPageBounds = paddingBottom;
        viewPager.mBottomPageBounds = i6 - i7;
        viewPager.mDecorChildCount = i8;
        if (viewPager.mFirstLayout) {
            z2 = false;
            scrollToItem(viewPager.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        viewPager.mFirstLayout = z2;
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.m2200c(this);
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() != 0) {
            C0573a infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin + clientWidth;
            float f = (float) clientWidth;
            float f2 = ((float) this.mPageMargin) / f;
            int i3 = infoForCurrentScrollPosition.f1771b;
            i = ((((float) i) / f) - infoForCurrentScrollPosition.f1774e) / (infoForCurrentScrollPosition.f1773d + f2);
            int i4 = (int) (((float) i2) * i);
            this.mCalledSuper = false;
            onPageScrolled(i3, i, i4);
            if (this.mCalledSuper != 0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout != 0) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0, 0);
            if (this.mCalledSuper != 0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    @CallSuper
    protected void onPageScrolled(int i, float f, int i2) {
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i3 = paddingRight;
            paddingRight = paddingLeft;
            for (paddingLeft = 0; paddingLeft < childCount; paddingLeft++) {
                View childAt = getChildAt(paddingLeft);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1764a) {
                    int i4 = layoutParams.f1765b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            i4 = childAt.getWidth() + paddingRight;
                        } else if (i4 != 5) {
                            i4 = paddingRight;
                        } else {
                            i4 = (width - i3) - childAt.getMeasuredWidth();
                            i3 += childAt.getMeasuredWidth();
                        }
                        paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                        if (paddingRight != 0) {
                            childAt.offsetLeftAndRight(paddingRight);
                        }
                        paddingRight = i4;
                    } else {
                        i4 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingRight);
                    }
                    int i5 = i4;
                    i4 = paddingRight;
                    paddingRight = i5;
                    paddingRight = (paddingRight + scrollX) - childAt.getLeft();
                    if (paddingRight != 0) {
                        childAt.offsetLeftAndRight(paddingRight);
                    }
                    paddingRight = i4;
                }
            }
        }
        dispatchOnPageScrolled(i, f, i2);
        if (this.mPageTransformer != 0) {
            i = getScrollX();
            int childCount2 = getChildCount();
            for (int i6 = 0; i6 < childCount2; i6++) {
                i2 = getChildAt(i6);
                if (!((LayoutParams) i2.getLayoutParams()).f1764a) {
                    this.mPageTransformer.transformPage(i2, ((float) (i2.getLeft() - i)) / ((float) getClientWidth()));
                }
            }
        }
        this.mCalledSuper = true;
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrolled(i, f, i2);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener = (OnPageChangeListener) this.mOnPageChangeListeners.get(i3);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrolled(i, f, i2);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageSelected(i);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener = (OnPageChangeListener) this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageSelected(i);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        if (this.mOnPageChangeListener != null) {
            this.mOnPageChangeListener.onPageScrollStateChanged(i);
        }
        if (this.mOnPageChangeListeners != null) {
            int size = this.mOnPageChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener = (OnPageChangeListener) this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener != null) {
                    onPageChangeListener.onPageScrollStateChanged(i);
                }
            }
        }
        if (this.mInternalPageChangeListener != null) {
            this.mInternalPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    private void completeScroll(boolean z) {
        Object obj = this.mScrollState == 2 ? 1 : null;
        if (obj != null) {
            setScrollingCacheEnabled(false);
            if ((this.mScroller.isFinished() ^ 1) != 0) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        Object obj2 = obj;
        for (int i = 0; i < this.mItems.size(); i++) {
            C0573a c0573a = (C0573a) this.mItems.get(i);
            if (c0573a.f1772c) {
                c0573a.f1772c = false;
                obj2 = 1;
            }
        }
        if (obj2 == null) {
            return;
        }
        if (z) {
            ViewCompat.m2188a((View) this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.mPageTransformerLayerType : 0, null);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View view = this;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            if (action != 1) {
                if (action != 0) {
                    if (view.mIsBeingDragged) {
                        return true;
                    }
                    if (view.mIsUnableToDrag) {
                        return false;
                    }
                }
                if (action == 0) {
                    float x = motionEvent.getX();
                    view.mInitialMotionX = x;
                    view.mLastMotionX = x;
                    x = motionEvent.getY();
                    view.mInitialMotionY = x;
                    view.mLastMotionY = x;
                    view.mActivePointerId = motionEvent2.getPointerId(0);
                    view.mIsUnableToDrag = false;
                    view.mIsScrollStarted = true;
                    view.mScroller.computeScrollOffset();
                    if (view.mScrollState != 2 || Math.abs(view.mScroller.getFinalX() - view.mScroller.getCurrX()) <= view.mCloseEnough) {
                        completeScroll(false);
                        view.mIsBeingDragged = false;
                    } else {
                        view.mScroller.abortAnimation();
                        view.mPopulatePending = false;
                        populate();
                        view.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                } else if (action == 2) {
                    action = view.mActivePointerId;
                    if (action != -1) {
                        action = motionEvent2.findPointerIndex(action);
                        float x2 = motionEvent2.getX(action);
                        float f = x2 - view.mLastMotionX;
                        float abs = Math.abs(f);
                        float y = motionEvent2.getY(action);
                        float abs2 = Math.abs(y - view.mInitialMotionY);
                        if (f == 0.0f || isGutterDrag(view.mLastMotionX, f) || !canScroll(view, false, (int) f, (int) x2, (int) y)) {
                            if (abs > ((float) view.mTouchSlop) && abs * 0.5f > abs2) {
                                view.mIsBeingDragged = true;
                                requestParentDisallowInterceptTouchEvent(true);
                                setScrollState(1);
                                view.mLastMotionX = f > 0.0f ? view.mInitialMotionX + ((float) view.mTouchSlop) : view.mInitialMotionX - ((float) view.mTouchSlop);
                                view.mLastMotionY = y;
                                setScrollingCacheEnabled(true);
                            } else if (abs2 > ((float) view.mTouchSlop)) {
                                view.mIsUnableToDrag = true;
                            }
                            if (view.mIsBeingDragged && performDrag(x2)) {
                                ViewCompat.m2200c(this);
                            }
                        } else {
                            view.mLastMotionX = x2;
                            view.mLastMotionY = y;
                            view.mIsUnableToDrag = true;
                            return false;
                        }
                    }
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                }
                if (view.mVelocityTracker == null) {
                    view.mVelocityTracker = VelocityTracker.obtain();
                }
                view.mVelocityTracker.addMovement(motionEvent2);
                return view.mIsBeingDragged;
            }
        }
        resetTouch();
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && this.mAdapter != null) {
            if (this.mAdapter.getCount() != 0) {
                if (this.mVelocityTracker == null) {
                    this.mVelocityTracker = VelocityTracker.obtain();
                }
                this.mVelocityTracker.addMovement(motionEvent);
                float x;
                int xVelocity;
                switch (motionEvent.getAction() & 255) {
                    case 0:
                        this.mScroller.abortAnimation();
                        this.mPopulatePending = false;
                        populate();
                        x = motionEvent.getX();
                        this.mInitialMotionX = x;
                        this.mLastMotionX = x;
                        x = motionEvent.getY();
                        this.mInitialMotionY = x;
                        this.mLastMotionY = x;
                        this.mActivePointerId = motionEvent.getPointerId(0);
                        break;
                    case 1:
                        if (this.mIsBeingDragged) {
                            VelocityTracker velocityTracker = this.mVelocityTracker;
                            velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) this.mMaximumVelocity);
                            xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                            this.mPopulatePending = true;
                            int clientWidth = getClientWidth();
                            int scrollX = getScrollX();
                            C0573a infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                            float f = (float) clientWidth;
                            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f1771b, ((((float) scrollX) / f) - infoForCurrentScrollPosition.f1774e) / (infoForCurrentScrollPosition.f1773d + (((float) this.mPageMargin) / f)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                            z = resetTouch();
                            break;
                        }
                        break;
                    case 2:
                        if (!this.mIsBeingDragged) {
                            xVelocity = motionEvent.findPointerIndex(this.mActivePointerId);
                            if (xVelocity == -1) {
                                z = resetTouch();
                                break;
                            }
                            float x2 = motionEvent.getX(xVelocity);
                            float abs = Math.abs(x2 - this.mLastMotionX);
                            x = motionEvent.getY(xVelocity);
                            float abs2 = Math.abs(x - this.mLastMotionY);
                            if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                                this.mIsBeingDragged = true;
                                requestParentDisallowInterceptTouchEvent(true);
                                this.mLastMotionX = x2 - this.mInitialMotionX > 0.0f ? this.mInitialMotionX + ((float) this.mTouchSlop) : this.mInitialMotionX - ((float) this.mTouchSlop);
                                this.mLastMotionY = x;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        if (this.mIsBeingDragged) {
                            z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                            break;
                        }
                        break;
                    case 3:
                        if (this.mIsBeingDragged != null) {
                            scrollToItem(this.mCurItem, true, 0, false);
                            z = resetTouch();
                            break;
                        }
                        break;
                    case 5:
                        xVelocity = motionEvent.getActionIndex();
                        this.mLastMotionX = motionEvent.getX(xVelocity);
                        this.mActivePointerId = motionEvent.getPointerId(xVelocity);
                        break;
                    case 6:
                        onSecondaryPointerUp(motionEvent);
                        this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                        break;
                    default:
                        break;
                }
                if (z) {
                    ViewCompat.m2200c(this);
                }
                return true;
            }
        }
        return false;
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished()) {
            if (!this.mRightEdge.isFinished()) {
                return false;
            }
        }
        return true;
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean performDrag(float f) {
        Object obj;
        Object obj2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        f = ((float) getScrollX()) + f2;
        f2 = (float) getClientWidth();
        float f3 = this.mFirstOffset * f2;
        float f4 = this.mLastOffset * f2;
        boolean z = false;
        C0573a c0573a = (C0573a) this.mItems.get(0);
        C0573a c0573a2 = (C0573a) this.mItems.get(this.mItems.size() - 1);
        if (c0573a.f1771b != 0) {
            f3 = c0573a.f1774e * f2;
            obj = null;
        } else {
            obj = 1;
        }
        if (c0573a2.f1771b != this.mAdapter.getCount() - 1) {
            f4 = c0573a2.f1774e * f2;
            obj2 = null;
        } else {
            obj2 = 1;
        }
        if (f < f3) {
            if (obj != null) {
                this.mLeftEdge.onPull(Math.abs(f3 - f) / f2);
                z = true;
            }
            f = f3;
        } else if (f > f4) {
            if (obj2 != null) {
                this.mRightEdge.onPull(Math.abs(f - f4) / f2);
                z = true;
            }
            f = f4;
        }
        int i = (int) f;
        this.mLastMotionX += f - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z;
    }

    private C0573a infoForCurrentScrollPosition() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        C0573a c0573a = null;
        int i = 0;
        Object obj = 1;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.mItems.size()) {
            C0573a c0573a2 = (C0573a) this.mItems.get(i);
            if (obj == null) {
                i2++;
                if (c0573a2.f1771b != i2) {
                    c0573a2 = this.mTempItem;
                    c0573a2.f1774e = (f2 + f3) + f;
                    c0573a2.f1771b = i2;
                    c0573a2.f1773d = this.mAdapter.getPageWidth(c0573a2.f1771b);
                    i--;
                }
            }
            f2 = c0573a2.f1774e;
            float f4 = (c0573a2.f1773d + f2) + f;
            if (obj == null) {
                if (scrollX < f2) {
                    return c0573a;
                }
            }
            if (scrollX >= f4) {
                if (i != this.mItems.size() - 1) {
                    i2 = c0573a2.f1771b;
                    f3 = c0573a2.f1773d;
                    i++;
                    c0573a = c0573a2;
                    obj = null;
                }
            }
            return c0573a2;
        }
        return c0573a;
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 1053609165 : 1058642330));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= null) {
            return i;
        }
        return Math.max(((C0573a) this.mItems.get(0)).f1771b, Math.min(i, ((C0573a) this.mItems.get(this.mItems.size() - 1)).f1771b));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        int i = 0;
        if (overScrollMode != 0) {
            if (overScrollMode != 1 || this.mAdapter == null || this.mAdapter.getCount() <= 1) {
                this.mLeftEdge.finish();
                this.mRightEdge.finish();
                if (i != 0) {
                    ViewCompat.m2200c(this);
                }
            }
        }
        if (!this.mLeftEdge.isFinished()) {
            overScrollMode = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
            this.mLeftEdge.setSize(height, width);
            i = 0 | this.mLeftEdge.draw(canvas);
            canvas.restoreToCount(overScrollMode);
        }
        if (!this.mRightEdge.isFinished()) {
            overScrollMode = canvas.save();
            height = getWidth();
            width = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) height));
            this.mRightEdge.setSize(width, height);
            i |= this.mRightEdge.draw(canvas);
            canvas.restoreToCount(overScrollMode);
        }
        if (i != 0) {
            ViewCompat.m2200c(this);
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && r0.mMarginDrawable != null && r0.mItems.size() > 0 && r0.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = (float) width;
            float f2 = ((float) r0.mPageMargin) / f;
            int i = 0;
            C0573a c0573a = (C0573a) r0.mItems.get(0);
            float f3 = c0573a.f1774e;
            int size = r0.mItems.size();
            int i2 = c0573a.f1771b;
            int i3 = ((C0573a) r0.mItems.get(size - 1)).f1771b;
            while (i2 < i3) {
                float f4;
                float f5;
                while (i2 > c0573a.f1771b && i < size) {
                    i++;
                    c0573a = (C0573a) r0.mItems.get(i);
                }
                if (i2 == c0573a.f1771b) {
                    f4 = (c0573a.f1774e + c0573a.f1773d) * f;
                    f3 = (c0573a.f1774e + c0573a.f1773d) + f2;
                } else {
                    float pageWidth = r0.mAdapter.getPageWidth(i2);
                    f4 = (f3 + pageWidth) * f;
                    f3 += pageWidth + f2;
                }
                if (((float) r0.mPageMargin) + f4 > ((float) scrollX)) {
                    f5 = f2;
                    r0.mMarginDrawable.setBounds(Math.round(f4), r0.mTopPageBounds, Math.round(((float) r0.mPageMargin) + f4), r0.mBottomPageBounds);
                    r0.mMarginDrawable.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f5 = f2;
                }
                if (f4 <= ((float) (scrollX + width))) {
                    i2++;
                    f2 = f5;
                } else {
                    return;
                }
            }
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            this.mVelocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0573a infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f1771b, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f1774e) / infoForCurrentScrollPosition.f1773d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            f = (float) getClientWidth();
            float f2 = this.mFirstOffset * f;
            float f3 = this.mLastOffset * f;
            C0573a c0573a = (C0573a) this.mItems.get(0);
            C0573a c0573a2 = (C0573a) this.mItems.get(this.mItems.size() - 1);
            if (c0573a.f1771b != 0) {
                f2 = c0573a.f1774e * f;
            }
            if (c0573a2.f1771b != this.mAdapter.getCount() - 1) {
                f3 = c0573a2.f1774e * f;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            f = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(f);
            f.recycle();
        }
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            actionIndex = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(actionIndex);
            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            if (this.mVelocityTracker != null) {
                this.mVelocityTracker.clear();
            }
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                z = true;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX < ((int) (((float) clientWidth) * this.mLastOffset))) {
                z = true;
            }
            return z;
        }
    }

    protected boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view2.getScrollX();
            int scrollY = view2.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (canScroll(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view2.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (executeKeyEvent(keyEvent) == null) {
                return null;
            }
        }
        return true;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        if (keyEvent.hasModifiers(2) != null) {
                            return pageLeft();
                        }
                        return arrowScroll(17);
                    case 22:
                        if (keyEvent.hasModifiers(2) != null) {
                            return pageRight();
                        }
                        return arrowScroll(66);
                    default:
                        break;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return arrowScroll(2);
            } else {
                if (keyEvent.hasModifiers(1) != null) {
                    return arrowScroll(1);
                }
            }
        }
        return null;
    }

    public boolean arrowScroll(int i) {
        View findFocus = findFocus();
        boolean z = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ");
                        stringBuilder.append(parent2.getClass().getSimpleName());
                    }
                    String str = TAG;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    stringBuilder2.append(stringBuilder.toString());
                    Log.e(str, stringBuilder2.toString());
                }
            }
            view = findFocus;
        }
        findFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findFocus == null || findFocus == view) {
            if (i != 17) {
                if (i != 1) {
                    if (i == 66 || i == 2) {
                        z = pageRight();
                    }
                }
            }
            z = pageLeft();
        } else {
            boolean requestFocus;
            int i2;
            int i3;
            if (i == 17) {
                i2 = getChildRectInPagerCoordinates(this.mTempRect, findFocus).left;
                i3 = getChildRectInPagerCoordinates(this.mTempRect, view).left;
                if (view == null || i2 < i3) {
                    requestFocus = findFocus.requestFocus();
                } else {
                    requestFocus = pageLeft();
                }
            } else if (i == 66) {
                i2 = getChildRectInPagerCoordinates(this.mTempRect, findFocus).left;
                i3 = getChildRectInPagerCoordinates(this.mTempRect, view).left;
                if (view == null || i2 > i3) {
                    requestFocus = findFocus.requestFocus();
                } else {
                    requestFocus = pageRight();
                }
            }
            z = requestFocus;
        }
        if (z) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z;
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        view = view.getParent();
        while ((view instanceof ViewGroup) && view != this) {
            ViewGroup viewGroup = (ViewGroup) view;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            view = viewGroup.getParent();
        }
        return rect;
    }

    boolean pageLeft() {
        if (this.mCurItem <= 0) {
            return false;
        }
        setCurrentItem(this.mCurItem - 1, true);
        return true;
    }

    boolean pageRight() {
        if (this.mAdapter == null || this.mCurItem >= this.mAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0573a infoForChild = infoForChild(childAt);
                    if (infoForChild != null && infoForChild.f1771b == this.mCurItem) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || isFocusable() == 0) {
            return;
        }
        if (!(((i2 & 1) == 1 && isInTouchMode() != 0 && isFocusableInTouchMode() == 0) || arrayList == null)) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0573a infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f1771b == this.mCurItem) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int childCount = getChildCount();
        int i3 = -1;
        if ((i & 2) != 0) {
            i3 = childCount;
            childCount = 0;
            i2 = 1;
        } else {
            childCount--;
            i2 = -1;
        }
        while (childCount != i3) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                C0573a infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f1771b == this.mCurItem && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            childCount += i2;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0573a infoForChild = infoForChild(childAt);
                if (infoForChild != null && infoForChild.f1771b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (!(layoutParams instanceof LayoutParams) || super.checkLayoutParams(layoutParams) == null) ? null : true;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
