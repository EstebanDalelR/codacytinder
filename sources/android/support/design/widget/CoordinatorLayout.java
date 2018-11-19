package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.FloatRange;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.VisibleForTesting;
import android.support.p008b.C0127a.C0124a;
import android.support.p008b.C0127a.C0125b;
import android.support.p008b.C0127a.C0126c;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.p010a.C0360a;
import android.support.v4.util.C0558i;
import android.support.v4.util.Pools.C4028b;
import android.support.v4.util.Pools.Pool;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0593c;
import android.support.v4.view.C0599h;
import android.support.v4.view.C0610p;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.C0639f;
import android.support.v4.widget.C0651o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {
    /* renamed from: a */
    static final String f12685a;
    /* renamed from: b */
    static final Class<?>[] f12686b = new Class[]{Context.class, AttributeSet.class};
    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f12687c = new ThreadLocal();
    /* renamed from: d */
    static final Comparator<View> f12688d;
    /* renamed from: f */
    private static final Pool<Rect> f12689f = new C4028b(12);
    /* renamed from: e */
    OnHierarchyChangeListener f12690e;
    /* renamed from: g */
    private final List<View> f12691g;
    /* renamed from: h */
    private final C0639f<View> f12692h;
    /* renamed from: i */
    private final List<View> f12693i;
    /* renamed from: j */
    private final List<View> f12694j;
    /* renamed from: k */
    private final int[] f12695k;
    /* renamed from: l */
    private Paint f12696l;
    /* renamed from: m */
    private boolean f12697m;
    /* renamed from: n */
    private boolean f12698n;
    /* renamed from: o */
    private int[] f12699o;
    /* renamed from: p */
    private View f12700p;
    /* renamed from: q */
    private View f12701q;
    /* renamed from: r */
    private C0206c f12702r;
    /* renamed from: s */
    private boolean f12703s;
    /* renamed from: t */
    private C0610p f12704t;
    /* renamed from: u */
    private boolean f12705u;
    /* renamed from: v */
    private Drawable f12706v;
    /* renamed from: w */
    private OnApplyWindowInsetsListener f12707w;
    /* renamed from: x */
    private final C0599h f12708x;

    public interface AttachedBehavior {
        @NonNull
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        @NonNull
        /* renamed from: a */
        public C0610p m677a(CoordinatorLayout coordinatorLayout, V v, C0610p c0610p) {
            return c0610p;
        }

        /* renamed from: a */
        public void mo244a(@NonNull C0205b c0205b) {
        }

        /* renamed from: a */
        public void mo231a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        /* renamed from: a */
        public void m681a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo232a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr) {
        }

        /* renamed from: a */
        public boolean mo233a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2987a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo245a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3659a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo234a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3660a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo235a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean m692a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2, boolean z) {
            return false;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo236a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public void m696b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i) {
        }

        /* renamed from: b */
        public boolean mo238b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo246b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @ColorInt
        /* renamed from: c */
        public int m700c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: c */
        public void m701c() {
        }

        @Deprecated
        /* renamed from: c */
        public void mo239c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        /* renamed from: d */
        public float m703d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: d */
        public void m704d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: e */
        public boolean m705e(CoordinatorLayout coordinatorLayout, V v) {
            return m703d(coordinatorLayout, v) > null ? true : null;
        }

        /* renamed from: a */
        public boolean mo3654a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            return i2 == 0 ? mo236a(coordinatorLayout, (View) v, view, view2, i) : null;
        }

        /* renamed from: b */
        public void m697b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            if (i2 == 0) {
                m696b(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo3650a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
            if (i == 0) {
                mo239c(coordinatorLayout, v, view);
            }
        }

        /* renamed from: a */
        public void mo3651a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                m681a(coordinatorLayout, (View) v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo3652a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
            if (i3 == 0) {
                mo232a(coordinatorLayout, (View) v, view, i, i2, iArr);
            }
        }

        /* renamed from: b */
        public Parcelable mo237b(CoordinatorLayout coordinatorLayout, V v) {
            return BaseSavedState.EMPTY_STATE;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DefaultBehavior {
        Class<? extends Behavior> value();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$a */
    private class C0204a implements OnHierarchyChangeListener {
        /* renamed from: a */
        final /* synthetic */ CoordinatorLayout f681a;

        C0204a(CoordinatorLayout coordinatorLayout) {
            this.f681a = coordinatorLayout;
        }

        public void onChildViewAdded(View view, View view2) {
            if (this.f681a.f12690e != null) {
                this.f681a.f12690e.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            this.f681a.m15639a(2);
            if (this.f681a.f12690e != null) {
                this.f681a.f12690e.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$b */
    public static class C0205b extends MarginLayoutParams {
        /* renamed from: a */
        Behavior f682a;
        /* renamed from: b */
        boolean f683b = false;
        /* renamed from: c */
        public int f684c = 0;
        /* renamed from: d */
        public int f685d = 0;
        /* renamed from: e */
        public int f686e = -1;
        /* renamed from: f */
        int f687f = -1;
        /* renamed from: g */
        public int f688g = 0;
        /* renamed from: h */
        public int f689h = 0;
        /* renamed from: i */
        int f690i;
        /* renamed from: j */
        int f691j;
        /* renamed from: k */
        View f692k;
        /* renamed from: l */
        View f693l;
        /* renamed from: m */
        final Rect f694m = new Rect();
        /* renamed from: n */
        Object f695n;
        /* renamed from: o */
        private boolean f696o;
        /* renamed from: p */
        private boolean f697p;
        /* renamed from: q */
        private boolean f698q;
        /* renamed from: r */
        private boolean f699r;

        public C0205b(int i, int i2) {
            super(i, i2);
        }

        C0205b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0126c.CoordinatorLayout_Layout);
            this.f684c = obtainStyledAttributes.getInteger(C0126c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f687f = obtainStyledAttributes.getResourceId(C0126c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f685d = obtainStyledAttributes.getInteger(C0126c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f686e = obtainStyledAttributes.getInteger(C0126c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f688g = obtainStyledAttributes.getInt(C0126c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f689h = obtainStyledAttributes.getInt(C0126c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f683b = obtainStyledAttributes.hasValue(C0126c.CoordinatorLayout_Layout_layout_behavior);
            if (this.f683b) {
                this.f682a = CoordinatorLayout.m15612a(context, attributeSet, obtainStyledAttributes.getString(C0126c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            if (this.f682a != null) {
                this.f682a.mo244a(this);
            }
        }

        public C0205b(C0205b c0205b) {
            super(c0205b);
        }

        public C0205b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0205b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        @IdRes
        /* renamed from: a */
        public int m712a() {
            return this.f687f;
        }

        @Nullable
        /* renamed from: b */
        public Behavior m720b() {
            return this.f682a;
        }

        /* renamed from: a */
        public void m716a(@Nullable Behavior behavior) {
            if (this.f682a != behavior) {
                if (this.f682a != null) {
                    this.f682a.m701c();
                }
                this.f682a = behavior;
                this.f695n = null;
                this.f683b = true;
                if (behavior != null) {
                    behavior.mo244a(this);
                }
            }
        }

        /* renamed from: a */
        void m715a(Rect rect) {
            this.f694m.set(rect);
        }

        /* renamed from: c */
        Rect m723c() {
            return this.f694m;
        }

        /* renamed from: d */
        boolean m724d() {
            return this.f692k == null && this.f687f != -1;
        }

        /* renamed from: e */
        boolean m725e() {
            if (this.f682a == null) {
                this.f696o = false;
            }
            return this.f696o;
        }

        /* renamed from: a */
        boolean m718a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f696o) {
                return true;
            }
            coordinatorLayout = (this.f682a != null ? this.f682a.m705e(coordinatorLayout, view) : null) | this.f696o;
            this.f696o = coordinatorLayout;
            return coordinatorLayout;
        }

        /* renamed from: f */
        void m726f() {
            this.f696o = false;
        }

        /* renamed from: a */
        void m713a(int i) {
            m714a(i, false);
        }

        /* renamed from: a */
        void m714a(int i, boolean z) {
            switch (i) {
                case 0:
                    this.f697p = z;
                    return;
                case 1:
                    this.f698q = z;
                    return;
                default:
                    return;
            }
        }

        /* renamed from: b */
        boolean m722b(int i) {
            switch (i) {
                case 0:
                    return this.f697p;
                case 1:
                    return this.f698q;
                default:
                    return false;
            }
        }

        /* renamed from: g */
        boolean m727g() {
            return this.f699r;
        }

        /* renamed from: a */
        void m717a(boolean z) {
            this.f699r = z;
        }

        /* renamed from: h */
        void m728h() {
            this.f699r = false;
        }

        /* renamed from: a */
        boolean m719a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (!(view2 == this.f693l || m710a(view2, ViewCompat.m2208f(coordinatorLayout)))) {
                if (this.f682a == null || this.f682a.mo3660a(coordinatorLayout, view, view2) == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: b */
        View m721b(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f687f == -1) {
                this.f693l = null;
                this.f692k = null;
                return null;
            }
            if (this.f692k == null || !m711b(view, coordinatorLayout)) {
                m709a(view, coordinatorLayout);
            }
            return this.f692k;
        }

        /* renamed from: a */
        private void m709a(View view, CoordinatorLayout coordinatorLayout) {
            this.f692k = coordinatorLayout.findViewById(this.f687f);
            if (this.f692k != null) {
                if (this.f692k != coordinatorLayout) {
                    View view2 = this.f692k;
                    View parent = this.f692k.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode() != null) {
                            this.f693l = null;
                            this.f692k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f693l = view2;
                } else if (coordinatorLayout.isInEditMode() != null) {
                    this.f693l = null;
                    this.f692k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f693l = null;
                this.f692k = null;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not find CoordinatorLayout descendant view with id ");
                stringBuilder.append(coordinatorLayout.getResources().getResourceName(this.f687f));
                stringBuilder.append(" to anchor view ");
                stringBuilder.append(view);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        /* renamed from: b */
        private boolean m711b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f692k.getId() != this.f687f) {
                return false;
            }
            View view2 = this.f692k;
            View parent = this.f692k.getParent();
            while (parent != coordinatorLayout) {
                if (parent != null) {
                    if (parent != view) {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                        parent = parent.getParent();
                    }
                }
                this.f693l = null;
                this.f692k = null;
                return false;
            }
            this.f693l = view2;
            return true;
        }

        /* renamed from: a */
        private boolean m710a(View view, int i) {
            view = C0593c.m2313a(((C0205b) view.getLayoutParams()).f688g, i);
            return (view == null || (C0593c.m2313a(this.f689h, i) & view) != view) ? null : true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$c */
    class C0206c implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ CoordinatorLayout f700a;

        C0206c(CoordinatorLayout coordinatorLayout) {
            this.f700a = coordinatorLayout;
        }

        public boolean onPreDraw() {
            this.f700a.m15639a(0);
            return true;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$d */
    static class C0207d implements Comparator<View> {
        C0207d() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m729a((View) obj, (View) obj2);
        }

        /* renamed from: a */
        public int m729a(View view, View view2) {
            view = ViewCompat.m2169A(view);
            view2 = ViewCompat.m2169A(view2);
            if (view > view2) {
                return -1;
            }
            return view < view2 ? 1 : null;
        }
    }

    /* renamed from: android.support.design.widget.CoordinatorLayout$1 */
    class C27651 implements OnApplyWindowInsetsListener {
        /* renamed from: a */
        final /* synthetic */ CoordinatorLayout f8715a;

        C27651(CoordinatorLayout coordinatorLayout) {
            this.f8715a = coordinatorLayout;
        }

        public C0610p onApplyWindowInsets(View view, C0610p c0610p) {
            return this.f8715a.m15637a(c0610p);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C02031();
        SparseArray<Parcelable> behaviorStates;

        /* renamed from: android.support.design.widget.CoordinatorLayout$SavedState$1 */
        static class C02031 implements ClassLoaderCreator<SavedState> {
            C02031() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m706a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m707a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m708a(i);
            }

            /* renamed from: a */
            public SavedState m707a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m706a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m708a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            parcel = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray(readInt);
            for (classLoader = null; classLoader < readInt; classLoader++) {
                this.behaviorStates.append(iArr[classLoader], parcel[classLoader]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.behaviorStates != null ? this.behaviorStates.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.behaviorStates.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: c */
    private static int m15624c(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static int m15626d(int i) {
        return i == 0 ? 8388661 : i;
    }

    /* renamed from: e */
    private static int m15628e(int i) {
        return i == 0 ? 17 : i;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return m15653d();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m15634a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return m15636a(layoutParams);
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f12685a = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f12688d = new C0207d();
        } else {
            f12688d = null;
        }
    }

    @NonNull
    /* renamed from: e */
    private static Rect m15629e() {
        Rect rect = (Rect) f12689f.acquire();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: a */
    private static void m15613a(@NonNull Rect rect) {
        rect.setEmpty();
        f12689f.release(rect);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0124a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12691g = new ArrayList();
        this.f12692h = new C0639f();
        this.f12693i = new ArrayList();
        this.f12694j = new ArrayList();
        this.f12695k = new int[2];
        this.f12708x = new C0599h(this);
        int i2 = 0;
        if (i == 0) {
            attributeSet = context.obtainStyledAttributes(attributeSet, C0126c.CoordinatorLayout, 0, C0125b.Widget_Support_CoordinatorLayout);
        } else {
            attributeSet = context.obtainStyledAttributes(attributeSet, C0126c.CoordinatorLayout, i, 0);
        }
        i = attributeSet.getResourceId(C0126c.CoordinatorLayout_keylines, 0);
        if (i != 0) {
            context = context.getResources();
            this.f12699o = context.getIntArray(i);
            context = context.getDisplayMetrics().density;
            i = this.f12699o.length;
            while (i2 < i) {
                this.f12699o[i2] = (int) (((float) this.f12699o[i2]) * context);
                i2++;
            }
        }
        this.f12706v = attributeSet.getDrawable(C0126c.CoordinatorLayout_statusBarBackground);
        attributeSet.recycle();
        m15633g();
        super.setOnHierarchyChangeListener(new C0204a(this));
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f12690e = onHierarchyChangeListener;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m15619a(false);
        if (this.f12703s) {
            if (this.f12702r == null) {
                this.f12702r = new C0206c(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f12702r);
        }
        if (this.f12704t == null && ViewCompat.m2227s(this)) {
            ViewCompat.m2226r(this);
        }
        this.f12698n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m15619a(false);
        if (this.f12703s && this.f12702r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f12702r);
        }
        if (this.f12701q != null) {
            onStopNestedScroll(this.f12701q);
        }
        this.f12698n = false;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        if (this.f12706v != drawable) {
            Drawable drawable2 = null;
            if (this.f12706v != null) {
                this.f12706v.setCallback(null);
            }
            if (drawable != null) {
                drawable2 = drawable.mutate();
            }
            this.f12706v = drawable2;
            if (this.f12706v != null) {
                if (this.f12706v.isStateful() != null) {
                    this.f12706v.setState(getDrawableState());
                }
                C0450a.m1725b(this.f12706v, ViewCompat.m2208f(this));
                this.f12706v.setVisible(getVisibility() == 0, false);
                this.f12706v.setCallback(this);
            }
            ViewCompat.m2200c(this);
        }
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f12706v;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12706v;
        int i = 0;
        if (drawable != null && drawable.isStateful()) {
            i = 0 | drawable.setState(drawableState);
        }
        if (i != 0) {
            invalidate();
        }
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (drawable != this.f12706v) {
                return null;
            }
        }
        return true;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f12706v != null && this.f12706v.isVisible() != z) {
            this.f12706v.setVisible(z, false);
        }
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        setStatusBarBackground(i != 0 ? C0432b.m1640a(getContext(), i) : 0);
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* renamed from: a */
    final C0610p m15637a(C0610p c0610p) {
        if (C0558i.m2057a(this.f12704t, c0610p)) {
            return c0610p;
        }
        this.f12704t = c0610p;
        boolean z = false;
        boolean z2 = c0610p != null && c0610p.m2390b() > 0;
        this.f12705u = z2;
        if (!this.f12705u && getBackground() == null) {
            z = true;
        }
        setWillNotDraw(z);
        c0610p = m15622b(c0610p);
        requestLayout();
        return c0610p;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final C0610p getLastWindowInsets() {
        return this.f12704t;
    }

    /* renamed from: a */
    private void m15619a(boolean z) {
        boolean childCount = getChildCount();
        for (boolean z2 = false; z2 < childCount; z2++) {
            View childAt = getChildAt(z2);
            Behavior b = ((C0205b) childAt.getLayoutParams()).m720b();
            if (b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    b.mo234a(this, childAt, obtain);
                } else {
                    b.mo238b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (z = false; z < childCount; z++) {
            ((C0205b) getChildAt(z).getLayoutParams()).m726f();
        }
        this.f12700p = false;
        this.f12697m = false;
    }

    /* renamed from: a */
    private void m15618a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        if (f12688d != null) {
            Collections.sort(list, f12688d);
        }
    }

    /* renamed from: a */
    private boolean m15620a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f12693i;
        m15618a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        Object obj = null;
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) list.get(i2);
            C0205b c0205b = (C0205b) view.getLayoutParams();
            Behavior b = c0205b.m720b();
            if ((z || r8 != null) && actionMasked != 0) {
                if (b != null) {
                    if (motionEvent3 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    switch (i) {
                        case 0:
                            b.mo234a(r0, view, motionEvent3);
                            break;
                        case 1:
                            b.mo238b(r0, view, motionEvent3);
                            break;
                        default:
                            break;
                    }
                }
            } else {
                if (!(z || b == null)) {
                    switch (i) {
                        case 0:
                            z = b.mo234a(r0, view, motionEvent2);
                            break;
                        case 1:
                            z = b.mo238b(r0, view, motionEvent2);
                            break;
                        default:
                            break;
                    }
                    if (z) {
                        r0.f12700p = view;
                    }
                }
                boolean e = c0205b.m725e();
                boolean a = c0205b.m718a(r0, view);
                obj = (!a || e) ? null : 1;
                if (a && obj == null) {
                    list.clear();
                    return z;
                }
            }
        }
        list.clear();
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m15619a(true);
        }
        motionEvent = m15620a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m15619a(true);
        }
        return motionEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean b;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3 = motionEvent;
        int actionMasked = motionEvent.getActionMasked();
        boolean a;
        Behavior b2;
        if (this.f12700p == null) {
            a = m15620a(motionEvent3, 1);
            if (a) {
                b2 = ((C0205b) r0.f12700p.getLayoutParams()).m720b();
                if (b2 != null) {
                    b = b2.mo238b(r0, r0.f12700p, motionEvent3);
                    motionEvent2 = null;
                    if (r0.f12700p != null) {
                        b |= super.onTouchEvent(motionEvent);
                    } else if (a) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        super.onTouchEvent(motionEvent2);
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    if (actionMasked == 1 || actionMasked == 3) {
                        m15619a(false);
                    }
                    return b;
                }
            }
        }
        a = false;
        b2 = ((C0205b) r0.f12700p.getLayoutParams()).m720b();
        if (b2 != null) {
            b = b2.mo238b(r0, r0.f12700p, motionEvent3);
            motionEvent2 = null;
            if (r0.f12700p != null) {
                b |= super.onTouchEvent(motionEvent);
            } else if (a) {
                long uptimeMillis2 = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            m15619a(false);
            return b;
        }
        b = false;
        motionEvent2 = null;
        if (r0.f12700p != null) {
            b |= super.onTouchEvent(motionEvent);
        } else if (a) {
            long uptimeMillis22 = SystemClock.uptimeMillis();
            motionEvent2 = MotionEvent.obtain(uptimeMillis22, uptimeMillis22, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEvent2);
        }
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        m15619a(false);
        return b;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f12697m) {
            m15619a(false);
            this.f12697m = true;
        }
    }

    /* renamed from: b */
    private int m15621b(int i) {
        if (this.f12699o == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No keylines defined for ");
            stringBuilder.append(this);
            stringBuilder.append(" - attempted index lookup ");
            stringBuilder.append(i);
            Log.e("CoordinatorLayout", stringBuilder.toString());
            return 0;
        }
        if (i >= 0) {
            if (i < this.f12699o.length) {
                return this.f12699o[i];
            }
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Keyline index ");
        stringBuilder.append(i);
        stringBuilder.append(" out of range for ");
        stringBuilder.append(this);
        Log.e("CoordinatorLayout", stringBuilder.toString());
        return 0;
    }

    /* renamed from: a */
    static Behavior m15612a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(str);
            str = stringBuilder.toString();
        } else if (str.indexOf(46) < 0) {
            if (!TextUtils.isEmpty(f12685a)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(f12685a);
                stringBuilder2.append('.');
                stringBuilder2.append(str);
                str = stringBuilder2.toString();
            }
        }
        try {
            Map map = (Map) f12687c.get();
            if (map == null) {
                map = new HashMap();
                f12687c.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f12686b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Context context2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Could not inflate Behavior subclass ");
            stringBuilder.append(str);
            throw new RuntimeException(stringBuilder.toString(), context2);
        }
    }

    /* renamed from: a */
    C0205b m15635a(View view) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        if (!c0205b.f683b) {
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0205b.m716a(behavior);
                c0205b.f683b = true;
            } else {
                DefaultBehavior defaultBehavior = null;
                for (view = view.getClass(); view != null; view = view.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) view.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        c0205b.m716a((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (View view2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Default behavior class ");
                        stringBuilder.append(defaultBehavior.value().getName());
                        stringBuilder.append(" could not be instantiated. Did you forget");
                        stringBuilder.append(" a default constructor?");
                        Log.e("CoordinatorLayout", stringBuilder.toString(), view2);
                    }
                }
                c0205b.f683b = true;
            }
        }
        return c0205b;
    }

    /* renamed from: f */
    private void m15632f() {
        this.f12691g.clear();
        this.f12692h.m2567a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childAt = getChildAt(i);
            C0205b a = m15635a((View) childAt);
            a.m721b(this, (View) childAt);
            this.f12692h.m2568a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    Object childAt2 = getChildAt(i2);
                    if (a.m719a(this, childAt, childAt2)) {
                        if (!this.f12692h.m2571b(childAt2)) {
                            this.f12692h.m2568a(childAt2);
                        }
                        this.f12692h.m2569a(childAt2, childAt);
                    }
                }
            }
        }
        this.f12691g.addAll(this.f12692h.m2570b());
        Collections.reverse(this.f12691g);
    }

    /* renamed from: a */
    void m15643a(View view, Rect rect) {
        C0651o.m2650b(this, view, rect);
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: a */
    public void m15641a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    protected void onMeasure(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this;
        m15632f();
        m15638a();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int f = ViewCompat.m2208f(this);
        Object obj = f == 1 ? 1 : null;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = paddingLeft + paddingRight;
        int i4 = paddingTop + paddingBottom;
        paddingTop = getSuggestedMinimumWidth();
        paddingBottom = getSuggestedMinimumHeight();
        Object obj2 = (coordinatorLayout.f12704t == null || !ViewCompat.m2227s(this)) ? null : 1;
        int size3 = coordinatorLayout.f12691g.size();
        int i5 = paddingTop;
        int i6 = paddingBottom;
        int i7 = 0;
        int i8 = 0;
        while (i8 < size3) {
            int i9;
            int i10;
            View view = (View) coordinatorLayout.f12691g.get(i8);
            if (view.getVisibility() == 8) {
                i9 = i8;
                i10 = size3;
            } else {
                int i11;
                int max;
                int i12;
                int i13;
                Behavior b;
                View view2;
                int i14;
                int i15;
                int i16;
                View view3;
                View view4;
                C0205b c0205b = (C0205b) view.getLayoutParams();
                if (c0205b.f686e < 0 || mode == 0) {
                    i11 = i6;
                    i9 = i7;
                } else {
                    paddingTop = m15621b(c0205b.f686e);
                    i11 = i6;
                    i6 = C0593c.m2313a(m15626d(c0205b.f684c), f) & 7;
                    i9 = i7;
                    if ((i6 == 3 && obj == null) || (i6 == 5 && obj != null)) {
                        max = Math.max(0, (size - paddingRight) - paddingTop);
                        if (obj2 != null) {
                        }
                        i12 = i;
                        i13 = i2;
                        b = c0205b.m720b();
                        if (b != null) {
                            view2 = view;
                            i14 = i5;
                            i10 = size3;
                            i15 = i11;
                            i16 = i9;
                            i9 = i8;
                            m15641a(view2, i12, max, i13, 0);
                        } else {
                            view3 = view;
                            i15 = i11;
                            view2 = view3;
                            i16 = i9;
                            i14 = i5;
                            i9 = i8;
                            i10 = size3;
                            if (!b.mo2987a(coordinatorLayout, view3, i12, max, i13, 0)) {
                                m15641a(view2, i12, max, i13, 0);
                            }
                        }
                        view4 = view2;
                        paddingBottom = Math.max(i14, ((i3 + view4.getMeasuredWidth()) + c0205b.leftMargin) + c0205b.rightMargin);
                        i6 = Math.max(i15, ((i4 + view4.getMeasuredHeight()) + c0205b.topMargin) + c0205b.bottomMargin);
                        i7 = View.combineMeasuredStates(i16, view4.getMeasuredState());
                        i5 = paddingBottom;
                    } else if ((i6 == 5 && obj == null) || (i6 == 3 && obj != null)) {
                        max = Math.max(0, paddingTop - paddingLeft);
                        if (obj2 != null || ViewCompat.m2227s(view)) {
                            i12 = i;
                            i13 = i2;
                        } else {
                            i6 = coordinatorLayout.f12704t.m2390b() + coordinatorLayout.f12704t.m2392d();
                            i12 = MeasureSpec.makeMeasureSpec(size - (coordinatorLayout.f12704t.m2388a() + coordinatorLayout.f12704t.m2391c()), mode);
                            i13 = MeasureSpec.makeMeasureSpec(size2 - i6, mode2);
                        }
                        b = c0205b.m720b();
                        if (b != null) {
                            view3 = view;
                            i15 = i11;
                            view2 = view3;
                            i16 = i9;
                            i14 = i5;
                            i9 = i8;
                            i10 = size3;
                            if (b.mo2987a(coordinatorLayout, view3, i12, max, i13, 0)) {
                                m15641a(view2, i12, max, i13, 0);
                            }
                        } else {
                            view2 = view;
                            i14 = i5;
                            i10 = size3;
                            i15 = i11;
                            i16 = i9;
                            i9 = i8;
                            m15641a(view2, i12, max, i13, 0);
                        }
                        view4 = view2;
                        paddingBottom = Math.max(i14, ((i3 + view4.getMeasuredWidth()) + c0205b.leftMargin) + c0205b.rightMargin);
                        i6 = Math.max(i15, ((i4 + view4.getMeasuredHeight()) + c0205b.topMargin) + c0205b.bottomMargin);
                        i7 = View.combineMeasuredStates(i16, view4.getMeasuredState());
                        i5 = paddingBottom;
                    }
                }
                max = 0;
                if (obj2 != null) {
                }
                i12 = i;
                i13 = i2;
                b = c0205b.m720b();
                if (b != null) {
                    view3 = view;
                    i15 = i11;
                    view2 = view3;
                    i16 = i9;
                    i14 = i5;
                    i9 = i8;
                    i10 = size3;
                    if (b.mo2987a(coordinatorLayout, view3, i12, max, i13, 0)) {
                        m15641a(view2, i12, max, i13, 0);
                    }
                } else {
                    view2 = view;
                    i14 = i5;
                    i10 = size3;
                    i15 = i11;
                    i16 = i9;
                    i9 = i8;
                    m15641a(view2, i12, max, i13, 0);
                }
                view4 = view2;
                paddingBottom = Math.max(i14, ((i3 + view4.getMeasuredWidth()) + c0205b.leftMargin) + c0205b.rightMargin);
                i6 = Math.max(i15, ((i4 + view4.getMeasuredHeight()) + c0205b.topMargin) + c0205b.bottomMargin);
                i7 = View.combineMeasuredStates(i16, view4.getMeasuredState());
                i5 = paddingBottom;
            }
            i8 = i9 + 1;
            size3 = i10;
        }
        int i17 = i7;
        setMeasuredDimension(View.resolveSizeAndState(i5, i, -16777216 & i17), View.resolveSizeAndState(i6, i2, i17 << 16));
    }

    /* renamed from: b */
    private C0610p m15622b(C0610p c0610p) {
        if (c0610p.m2393e()) {
            return c0610p;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ViewCompat.m2227s(childAt)) {
                Behavior b = ((C0205b) childAt.getLayoutParams()).m720b();
                if (b != null) {
                    c0610p = b.m677a(this, childAt, c0610p);
                    if (c0610p.m2393e()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return c0610p;
    }

    /* renamed from: a */
    public void m15640a(View view, int i) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        if (c0205b.m724d()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (c0205b.f692k != null) {
            m15617a(view, c0205b.f692k, i);
        } else if (c0205b.f686e >= 0) {
            m15623b(view, c0205b.f686e, i);
        } else {
            m15625c(view, i);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int f = ViewCompat.m2208f(this);
        i = this.f12691g.size();
        for (i2 = 0; i2 < i; i2++) {
            View view = (View) this.f12691g.get(i2);
            if (view.getVisibility() != 8) {
                i4 = ((C0205b) view.getLayoutParams()).m720b();
                if (i4 == 0 || i4.mo233a(this, view, f) == 0) {
                    m15640a(view, f);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12705u && this.f12706v != null) {
            int b = this.f12704t != null ? this.f12704t.m2390b() : 0;
            if (b > 0) {
                this.f12706v.setBounds(0, 0, getWidth(), b);
                this.f12706v.draw(canvas);
            }
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m15633g();
    }

    /* renamed from: b */
    void m15649b(View view, Rect rect) {
        ((C0205b) view.getLayoutParams()).m715a(rect);
    }

    /* renamed from: c */
    void m15652c(View view, Rect rect) {
        rect.set(((C0205b) view.getLayoutParams()).m723c());
    }

    /* renamed from: a */
    void m15644a(View view, boolean z, Rect rect) {
        if (!view.isLayoutRequested()) {
            if (view.getVisibility() != 8) {
                if (z) {
                    m15643a(view, rect);
                } else {
                    rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
                return;
            }
        }
        rect.setEmpty();
    }

    /* renamed from: a */
    private void m15615a(View view, int i, Rect rect, Rect rect2, C0205b c0205b, int i2, int i3) {
        view = C0593c.m2313a(m15628e(c0205b.f684c), i);
        i = C0593c.m2313a(m15624c(c0205b.f685d), i);
        c0205b = view & 7;
        view &= 112;
        int i4 = i & 7;
        i &= 112;
        if (i4 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i4 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i == 16) {
            i = rect.top + (rect.height() / 2);
        } else if (i != 80) {
            i = rect.top;
        } else {
            i = rect.bottom;
        }
        if (c0205b == 1) {
            i4 -= i2 / 2;
        } else if (c0205b != 5) {
            i4 -= i2;
        }
        if (view == 16) {
            i -= i3 / 2;
        } else if (view != 80) {
            i -= i3;
        }
        rect2.set(i4, i, i2 + i4, i3 + i);
    }

    /* renamed from: a */
    private void m15614a(C0205b c0205b, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        width = Math.max(getPaddingLeft() + c0205b.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - c0205b.rightMargin));
        c0205b = Math.max(getPaddingTop() + c0205b.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - c0205b.bottomMargin));
        rect.set(width, c0205b, i + width, i2 + c0205b);
    }

    /* renamed from: a */
    void m15642a(View view, int i, Rect rect, Rect rect2) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m15615a(view, i, rect, rect2, c0205b, measuredWidth, measuredHeight);
        m15614a(c0205b, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m15617a(View view, View view2, int i) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        Rect e = m15629e();
        Rect e2 = m15629e();
        try {
            m15643a(view2, e);
            m15642a(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m15613a(e);
            m15613a(e2);
        }
    }

    /* renamed from: b */
    private void m15623b(View view, int i, int i2) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        int a = C0593c.m2313a(m15626d(c0205b.f684c), i2);
        int i3 = a & 7;
        a &= 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        i = m15621b(i) - measuredWidth;
        i2 = 0;
        if (i3 == 1) {
            i += measuredWidth / 2;
        } else if (i3 == 5) {
            i += measuredWidth;
        }
        if (a == 16) {
            i2 = 0 + (measuredHeight / 2);
        } else if (a == 80) {
            i2 = measuredHeight + 0;
        }
        i = Math.max(getPaddingLeft() + c0205b.leftMargin, Math.min(i, ((width - getPaddingRight()) - measuredWidth) - c0205b.rightMargin));
        i2 = Math.max(getPaddingTop() + c0205b.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight) - c0205b.bottomMargin));
        view.layout(i, i2, measuredWidth + i, measuredHeight + i2);
    }

    /* renamed from: c */
    private void m15625c(View view, int i) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        Rect e = m15629e();
        e.set(getPaddingLeft() + c0205b.leftMargin, getPaddingTop() + c0205b.topMargin, (getWidth() - getPaddingRight()) - c0205b.rightMargin, (getHeight() - getPaddingBottom()) - c0205b.bottomMargin);
        if (!(this.f12704t == null || !ViewCompat.m2227s(this) || ViewCompat.m2227s(view))) {
            e.left += this.f12704t.m2388a();
            e.top += this.f12704t.m2390b();
            e.right -= this.f12704t.m2391c();
            e.bottom -= this.f12704t.m2392d();
        }
        Rect e2 = m15629e();
        C0593c.m2314a(m15624c(c0205b.f684c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m15613a(e);
        m15613a(e2);
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        if (c0205b.f682a != null) {
            float d = c0205b.f682a.m703d(this, view);
            if (d > 0.0f) {
                if (this.f12696l == null) {
                    this.f12696l = new Paint();
                }
                this.f12696l.setColor(c0205b.f682a.m700c(this, view));
                this.f12696l.setAlpha(C0360a.m1309a(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f12696l);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: a */
    final void m15639a(int i) {
        int i2 = i;
        int f = ViewCompat.m2208f(this);
        int size = this.f12691g.size();
        Rect e = m15629e();
        Rect e2 = m15629e();
        Rect e3 = m15629e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) r0.f12691g.get(i3);
            C0205b c0205b = (C0205b) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                int a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (c0205b.f693l == ((View) r0.f12691g.get(i4))) {
                        m15648b(view, f);
                    }
                }
                m15644a(view, true, e2);
                if (!(c0205b.f688g == 0 || e2.isEmpty())) {
                    a = C0593c.m2313a(c0205b.f688g, f);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i5 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    a &= 7;
                    if (a == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (a == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (c0205b.f689h != 0 && view.getVisibility() == 0) {
                    m15616a(view, e, f);
                }
                if (i2 != 2) {
                    m15652c(view, e3);
                    if (!e3.equals(e2)) {
                        m15649b(view, e2);
                    }
                }
                for (a = i3 + 1; a < size; a++) {
                    View view2 = (View) r0.f12691g.get(a);
                    C0205b c0205b2 = (C0205b) view2.getLayoutParams();
                    Behavior b = c0205b2.m720b();
                    if (b != null && b.mo3660a(r0, view2, view)) {
                        if (i2 == 0 && c0205b2.m727g()) {
                            c0205b2.m728h();
                        } else {
                            boolean b2;
                            if (i2 != 2) {
                                b2 = b.mo246b(r0, view2, view);
                            } else {
                                b.m704d(r0, view2, view);
                                b2 = true;
                            }
                            if (i2 == 1) {
                                c0205b2.m717a(b2);
                            }
                        }
                    }
                }
            }
        }
        m15613a(e);
        m15613a(e2);
        m15613a(e3);
    }

    /* renamed from: a */
    private void m15616a(View view, Rect rect, int i) {
        if (ViewCompat.m2234z(view) && view.getWidth() > 0) {
            if (view.getHeight() > 0) {
                C0205b c0205b = (C0205b) view.getLayoutParams();
                Behavior b = c0205b.m720b();
                Rect e = m15629e();
                Rect e2 = m15629e();
                e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                if (b == null || !b.mo245a(this, view, e)) {
                    e.set(e2);
                } else if (!e2.contains(e)) {
                    rect = new StringBuilder();
                    rect.append("Rect should be within the child's bounds. Rect:");
                    rect.append(e.toShortString());
                    rect.append(" | Bounds:");
                    rect.append(e2.toShortString());
                    throw new IllegalArgumentException(rect.toString());
                }
                m15613a(e2);
                if (e.isEmpty()) {
                    m15613a(e);
                    return;
                }
                int i2;
                Object obj;
                int height;
                i = C0593c.m2313a(c0205b.f689h, i);
                if ((i & 48) == 48) {
                    i2 = (e.top - c0205b.topMargin) - c0205b.f691j;
                    if (i2 < rect.top) {
                        m15630e(view, rect.top - i2);
                        obj = 1;
                        if ((i & 80) == 80) {
                            height = ((getHeight() - e.bottom) - c0205b.bottomMargin) + c0205b.f691j;
                            if (height < rect.bottom) {
                                m15630e(view, height - rect.bottom);
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            m15630e(view, 0);
                        }
                        if ((i & 3) == 3) {
                            i2 = (e.left - c0205b.leftMargin) - c0205b.f690i;
                            if (i2 < rect.left) {
                                m15627d(view, rect.left - i2);
                                obj = 1;
                                if ((i & 5) == 5) {
                                    i = ((getWidth() - e.right) - c0205b.rightMargin) + c0205b.f690i;
                                    if (i < rect.right) {
                                        m15627d(view, i - rect.right);
                                        obj = 1;
                                    }
                                }
                                if (obj == null) {
                                    m15627d(view, 0);
                                }
                                m15613a(e);
                            }
                        }
                        obj = null;
                        if ((i & 5) == 5) {
                            i = ((getWidth() - e.right) - c0205b.rightMargin) + c0205b.f690i;
                            if (i < rect.right) {
                                m15627d(view, i - rect.right);
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            m15627d(view, 0);
                        }
                        m15613a(e);
                    }
                }
                obj = null;
                if ((i & 80) == 80) {
                    height = ((getHeight() - e.bottom) - c0205b.bottomMargin) + c0205b.f691j;
                    if (height < rect.bottom) {
                        m15630e(view, height - rect.bottom);
                        obj = 1;
                    }
                }
                if (obj == null) {
                    m15630e(view, 0);
                }
                if ((i & 3) == 3) {
                    i2 = (e.left - c0205b.leftMargin) - c0205b.f690i;
                    if (i2 < rect.left) {
                        m15627d(view, rect.left - i2);
                        obj = 1;
                        if ((i & 5) == 5) {
                            i = ((getWidth() - e.right) - c0205b.rightMargin) + c0205b.f690i;
                            if (i < rect.right) {
                                m15627d(view, i - rect.right);
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            m15627d(view, 0);
                        }
                        m15613a(e);
                    }
                }
                obj = null;
                if ((i & 5) == 5) {
                    i = ((getWidth() - e.right) - c0205b.rightMargin) + c0205b.f690i;
                    if (i < rect.right) {
                        m15627d(view, i - rect.right);
                        obj = 1;
                    }
                }
                if (obj == null) {
                    m15627d(view, 0);
                }
                m15613a(e);
            }
        }
    }

    /* renamed from: d */
    private void m15627d(View view, int i) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        if (c0205b.f690i != i) {
            ViewCompat.m2205d(view, i - c0205b.f690i);
            c0205b.f690i = i;
        }
    }

    /* renamed from: e */
    private void m15630e(View view, int i) {
        C0205b c0205b = (C0205b) view.getLayoutParams();
        if (c0205b.f691j != i) {
            ViewCompat.m2202c(view, i - c0205b.f691j);
            c0205b.f691j = i;
        }
    }

    /* renamed from: b */
    public void m15647b(View view) {
        List c = this.f12692h.m2572c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                Behavior b = ((C0205b) view2.getLayoutParams()).m720b();
                if (b != null) {
                    b.mo246b(this, view2, view);
                }
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public List<View> m15650c(@NonNull View view) {
        view = this.f12692h.m2573d(view);
        this.f12694j.clear();
        if (view != null) {
            this.f12694j.addAll(view);
        }
        return this.f12694j;
    }

    @NonNull
    /* renamed from: d */
    public List<View> m15654d(@NonNull View view) {
        view = this.f12692h.m2572c(view);
        this.f12694j.clear();
        if (view != null) {
            this.f12694j.addAll(view);
        }
        return this.f12694j;
    }

    @VisibleForTesting
    final List<View> getDependencySortedChildren() {
        m15632f();
        return Collections.unmodifiableList(this.f12691g);
    }

    /* renamed from: a */
    void m15638a() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (m15631e(getChildAt(i))) {
                z = true;
                break;
            }
        }
        if (z == this.f12703s) {
            return;
        }
        if (z) {
            m15646b();
        } else {
            m15651c();
        }
    }

    /* renamed from: e */
    private boolean m15631e(View view) {
        return this.f12692h.m2574e(view);
    }

    /* renamed from: b */
    void m15646b() {
        if (this.f12698n) {
            if (this.f12702r == null) {
                this.f12702r = new C0206c(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f12702r);
        }
        this.f12703s = true;
    }

    /* renamed from: c */
    void m15651c() {
        if (this.f12698n && this.f12702r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f12702r);
        }
        this.f12703s = false;
    }

    /* renamed from: b */
    void m15648b(View view, int i) {
        CoordinatorLayout coordinatorLayout = this;
        View view2 = view;
        C0205b c0205b = (C0205b) view.getLayoutParams();
        if (c0205b.f692k != null) {
            Rect e = m15629e();
            Rect e2 = m15629e();
            Rect e3 = m15629e();
            m15643a(c0205b.f692k, e);
            boolean z = false;
            m15644a(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m15615a(view2, i, e, e3, c0205b, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m15614a(c0205b, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                ViewCompat.m2205d(view2, i3);
            }
            if (i4 != 0) {
                ViewCompat.m2202c(view2, i4);
            }
            if (z) {
                Behavior b = c0205b.m720b();
                if (b != null) {
                    b.mo246b(coordinatorLayout, view2, c0205b.f692k);
                }
            }
            m15613a(e);
            m15613a(e2);
            m15613a(e3);
        }
    }

    /* renamed from: a */
    public boolean m15645a(View view, int i, int i2) {
        Rect e = m15629e();
        m15643a(view, e);
        try {
            view = e.contains(i, i2);
            return view;
        } finally {
            m15613a(e);
        }
    }

    /* renamed from: a */
    public C0205b m15634a(AttributeSet attributeSet) {
        return new C0205b(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected C0205b m15636a(LayoutParams layoutParams) {
        if (layoutParams instanceof C0205b) {
            return new C0205b((C0205b) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0205b((MarginLayoutParams) layoutParams);
        }
        return new C0205b(layoutParams);
    }

    /* renamed from: d */
    protected C0205b m15653d() {
        return new C0205b(-2, -2);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (!(layoutParams instanceof C0205b) || super.checkLayoutParams(layoutParams) == null) ? null : true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0205b c0205b = (C0205b) childAt.getLayoutParams();
                Behavior b = c0205b.m720b();
                if (b != null) {
                    boolean a = b.mo3654a(r12, childAt, view, view2, i, i3);
                    boolean z2 = z | a;
                    c0205b.m714a(i3, a);
                    z = z2;
                } else {
                    c0205b.m714a(i3, false);
                }
            }
        }
        CoordinatorLayout coordinatorLayout = this;
        return z;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f12708x.m2349a(view, view2, i, i2);
        this.f12701q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0205b c0205b = (C0205b) childAt.getLayoutParams();
            if (c0205b.m722b(i2)) {
                Behavior b = c0205b.m720b();
                if (b != null) {
                    b.m697b(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onStopNestedScroll(View view, int i) {
        this.f12708x.m2347a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0205b c0205b = (C0205b) childAt.getLayoutParams();
            if (c0205b.m722b(i)) {
                Behavior b = c0205b.m720b();
                if (b != null) {
                    b.mo3650a(this, childAt, view, i);
                }
                c0205b.m713a(i);
                c0205b.m728h();
            }
        }
        this.f12701q = null;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        Object obj = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int i7;
            if (childAt.getVisibility() == 8) {
                i7 = i5;
            } else {
                C0205b c0205b = (C0205b) childAt.getLayoutParams();
                i7 = i5;
                if (c0205b.m722b(i7)) {
                    Behavior b = c0205b.m720b();
                    if (b != null) {
                        b.mo3651a(r9, childAt, view, i, i2, i3, i4, i7);
                        obj = 1;
                    }
                }
            }
        }
        if (obj != null) {
            m15639a(1);
        }
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        Object obj = null;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0205b c0205b = (C0205b) childAt.getLayoutParams();
                if (c0205b.m722b(i3)) {
                    Behavior b = c0205b.m720b();
                    if (b != null) {
                        int max;
                        int max2;
                        int[] iArr2 = r8.f12695k;
                        r8.f12695k[1] = 0;
                        iArr2[0] = 0;
                        b.mo3652a(r8, childAt, view, i, i2, r8.f12695k, i3);
                        if (i > 0) {
                            max = Math.max(i4, r8.f12695k[0]);
                        } else {
                            max = Math.min(i4, r8.f12695k[0]);
                        }
                        if (i2 > 0) {
                            max2 = Math.max(i5, r8.f12695k[1]);
                        } else {
                            max2 = Math.min(i5, r8.f12695k[1]);
                        }
                        i4 = max;
                        i5 = max2;
                        obj = 1;
                    }
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (obj != null) {
            m15639a(1);
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0205b c0205b = (C0205b) childAt.getLayoutParams();
                if (c0205b.m722b(0)) {
                    Behavior b = c0205b.m720b();
                    if (b != null) {
                        z2 |= b.m692a(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            m15639a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0205b c0205b = (C0205b) childAt.getLayoutParams();
                if (c0205b.m722b(0)) {
                    Behavior b = c0205b.m720b();
                    if (b != null) {
                        z |= b.mo235a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public int getNestedScrollAxes() {
        return this.f12708x.m2345a();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            parcelable = savedState.behaviorStates;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                int id = childAt.getId();
                Behavior b = m15635a(childAt).m720b();
                if (!(id == -1 || b == null)) {
                    Parcelable parcelable2 = (Parcelable) parcelable.get(id);
                    if (parcelable2 != null) {
                        b.mo231a(this, childAt, parcelable2);
                    }
                }
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior b = ((C0205b) childAt.getLayoutParams()).m720b();
            if (!(id == -1 || b == null)) {
                Parcelable b2 = b.mo237b(this, childAt);
                if (b2 != null) {
                    sparseArray.append(id, b2);
                }
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior b = ((C0205b) view.getLayoutParams()).m720b();
        if (b == null || !b.mo3659a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    /* renamed from: g */
    private void m15633g() {
        if (VERSION.SDK_INT >= 21) {
            if (ViewCompat.m2227s(this)) {
                if (this.f12707w == null) {
                    this.f12707w = new C27651(this);
                }
                ViewCompat.m2184a((View) this, this.f12707w);
                setSystemUiVisibility(1280);
            } else {
                ViewCompat.m2184a((View) this, null);
            }
        }
    }
}
