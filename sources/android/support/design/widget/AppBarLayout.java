package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.VisibleForTesting;
import android.support.design.C0181a.C0171b;
import android.support.design.C0181a.C0179j;
import android.support.design.C0181a.C0180k;
import android.support.design.widget.CoordinatorLayout.C0205b;
import android.support.design.widget.CoordinatorLayout.DefaultBehavior;
import android.support.v4.p010a.C0360a;
import android.support.v4.util.C0558i;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0610p;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@DefaultBehavior(Behavior.class)
public class AppBarLayout extends LinearLayout {
    /* renamed from: a */
    private int f607a;
    /* renamed from: b */
    private int f608b;
    /* renamed from: c */
    private int f609c;
    /* renamed from: d */
    private boolean f610d;
    /* renamed from: e */
    private int f611e;
    /* renamed from: f */
    private C0610p f612f;
    /* renamed from: g */
    private List<OnOffsetChangedListener> f613g;
    /* renamed from: h */
    private boolean f614h;
    /* renamed from: i */
    private boolean f615i;
    /* renamed from: j */
    private int[] f616j;

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        /* renamed from: a */
        int f605a = 1;
        /* renamed from: b */
        Interpolator f606b;

        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            attributeSet = context.obtainStyledAttributes(attributeSet, C0180k.AppBarLayout_Layout);
            this.f605a = attributeSet.getInt(C0180k.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (attributeSet.hasValue(C0180k.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f606b = AnimationUtils.loadInterpolator(context, attributeSet.getResourceId(C0180k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            attributeSet.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @RequiresApi(19)
        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int m617a() {
            return this.f605a;
        }

        /* renamed from: b */
        public Interpolator m618b() {
            return this.f606b;
        }

        /* renamed from: c */
        boolean m619c() {
            return (this.f605a & 1) == 1 && (this.f605a & 10) != 0;
        }
    }

    public interface OnOffsetChangedListener {
        void onOffsetChanged(AppBarLayout appBarLayout, int i);
    }

    /* renamed from: android.support.design.widget.AppBarLayout$1 */
    class C27551 implements OnApplyWindowInsetsListener {
        /* renamed from: a */
        final /* synthetic */ AppBarLayout f8683a;

        C27551(AppBarLayout appBarLayout) {
            this.f8683a = appBarLayout;
        }

        public C0610p onApplyWindowInsets(View view, C0610p c0610p) {
            return this.f8683a.m627a(c0610p);
        }
    }

    public static class Behavior extends HeaderBehavior<AppBarLayout> {
        /* renamed from: b */
        private int f14127b;
        /* renamed from: c */
        private ValueAnimator f14128c;
        /* renamed from: d */
        private int f14129d = -1;
        /* renamed from: e */
        private boolean f14130e;
        /* renamed from: f */
        private float f14131f;
        /* renamed from: g */
        private WeakReference<View> f14132g;
        /* renamed from: h */
        private C0188a f14133h;

        /* renamed from: android.support.design.widget.AppBarLayout$Behavior$a */
        public static abstract class C0188a {
            /* renamed from: a */
            public abstract boolean m616a(@NonNull AppBarLayout appBarLayout);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new C01871();
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;

            /* renamed from: android.support.design.widget.AppBarLayout$Behavior$SavedState$1 */
            static class C01871 implements ClassLoaderCreator<SavedState> {
                C01871() {
                }

                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m613a(parcel);
                }

                public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return m614a(parcel, classLoader);
                }

                public /* synthetic */ Object[] newArray(int i) {
                    return m615a(i);
                }

                /* renamed from: a */
                public SavedState m614a(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                /* renamed from: a */
                public SavedState m613a(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                /* renamed from: a */
                public SavedState[] m615a(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != null ? true : null;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte((byte) this.firstVisibleChildAtMinimumHeight);
            }
        }

        /* renamed from: a */
        private static boolean m17414a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a */
        /* synthetic */ int mo3648a(View view) {
            return m17446c((AppBarLayout) view);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo3655b() {
            return super.mo3655b();
        }

        /* renamed from: c */
        /* synthetic */ boolean mo3657c(View view) {
            return m17434a((AppBarLayout) view);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean m17437a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            coordinatorLayout = ((i & 2) == null || appBarLayout.m634c() == null || coordinatorLayout.getHeight() - view.getHeight() > appBarLayout.getHeight()) ? null : true;
            if (!(coordinatorLayout == null || this.f14128c == null)) {
                this.f14128c.cancel();
            }
            this.f14132g = null;
            return coordinatorLayout;
        }

        /* renamed from: a */
        public void m17427a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            if (i2 != 0) {
                int i4;
                int downNestedPreScrollRange;
                if (i2 < 0) {
                    view = -appBarLayout.getTotalScrollRange();
                    i4 = view;
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + view;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i4 != downNestedPreScrollRange) {
                    iArr[1] = m15662b(coordinatorLayout, appBarLayout, i2, i4, downNestedPreScrollRange);
                }
            }
        }

        /* renamed from: a */
        public void m17426a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5) {
            if (i4 < 0) {
                m15662b(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void m17425a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (i == 0) {
                m17417c(coordinatorLayout, appBarLayout);
            }
            this.f14132g = new WeakReference(view);
        }

        /* renamed from: a */
        private void m17411a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int round;
            int abs = Math.abs(mo3646a() - i);
            f = Math.abs(f);
            if (f > 0.0f) {
                round = Math.round((((float) abs) / f) * 1000.0f) * 3;
            } else {
                round = (int) (((((float) abs) / ((float) appBarLayout.getHeight())) + 1.0f) * 150.0f);
            }
            m17412a(coordinatorLayout, appBarLayout, i, round);
        }

        /* renamed from: a */
        private void m17412a(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, int i, int i2) {
            if (mo3646a() == i) {
                if (!(this.f14128c == null || this.f14128c.isRunning() == null)) {
                    this.f14128c.cancel();
                }
                return;
            }
            if (this.f14128c == null) {
                this.f14128c = new ValueAnimator();
                this.f14128c.setInterpolator(C0226a.f784e);
                this.f14128c.addUpdateListener(new AnimatorUpdateListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ Behavior f604c;

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f604c.a_(coordinatorLayout, appBarLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                this.f14128c.cancel();
            }
            this.f14128c.setDuration((long) Math.min(i2, 600));
            this.f14128c.setIntValues(new int[]{r0, i});
            this.f14128c.start();
        }

        /* renamed from: a */
        private int m17410a(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int i3 = -i;
                if (childAt.getTop() <= i3 && childAt.getBottom() >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private void m17417c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int a = mo3646a();
            int a2 = m17410a(appBarLayout, a);
            if (a2 >= 0) {
                View childAt = appBarLayout.getChildAt(a2);
                int a3 = ((LayoutParams) childAt.getLayoutParams()).m617a();
                if ((a3 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (a2 == appBarLayout.getChildCount() - 1) {
                        i2 += appBarLayout.getTopInset();
                    }
                    if (m17414a(a3, 2)) {
                        i2 += ViewCompat.m2220l(childAt);
                    } else if (m17414a(a3, 5)) {
                        int l = ViewCompat.m2220l(childAt) + i2;
                        if (a < l) {
                            i = l;
                        } else {
                            i2 = l;
                        }
                    }
                    if (a < (i2 + i) / 2) {
                        i = i2;
                    }
                    m17411a(coordinatorLayout, appBarLayout, C0360a.m1309a(i, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: a */
        public boolean m17436a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((C0205b) appBarLayout.getLayoutParams()).height != -2) {
                return super.mo2987a(coordinatorLayout, (View) appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.m15641a(appBarLayout, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean m17435a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            i = super.mo233a(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            if (this.f14129d >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(this.f14129d);
                int i2 = -childAt.getBottom();
                if (this.f14130e) {
                    i2 += ViewCompat.m2220l(childAt) + appBarLayout.getTopInset();
                } else {
                    i2 += Math.round(((float) childAt.getHeight()) * this.f14131f);
                }
                a_(coordinatorLayout, appBarLayout, i2);
            } else if (pendingAction != 0) {
                Object obj = (pendingAction & 4) != 0 ? 1 : null;
                if ((pendingAction & 2) != 0) {
                    pendingAction = -appBarLayout.getUpNestedPreScrollRange();
                    if (obj != null) {
                        m17411a(coordinatorLayout, appBarLayout, pendingAction, 0.0f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, pendingAction);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (obj != null) {
                        m17411a(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        a_(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.m635d();
            this.f14129d = -1;
            mo3653a(C0360a.m1309a(mo3655b(), -appBarLayout.getTotalScrollRange(), 0));
            m17413a(coordinatorLayout, appBarLayout, mo3655b(), 0, true);
            appBarLayout.m628a(mo3655b());
            return i;
        }

        /* renamed from: a */
        boolean m17434a(AppBarLayout appBarLayout) {
            if (this.f14133h != null) {
                return this.f14133h.m616a(appBarLayout);
            }
            boolean z = true;
            if (this.f14132g == null) {
                return true;
            }
            View view = (View) this.f14132g.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1) != null) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        void m17423a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m17417c(coordinatorLayout, appBarLayout);
        }

        /* renamed from: b */
        int m17442b(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        /* renamed from: c */
        int m17446c(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        /* renamed from: a */
        int m17420a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int a = mo3646a();
            int i4 = 0;
            if (i2 == 0 || a < i2 || a > i3) {
                this.f14127b = 0;
            } else {
                int a2 = C0360a.m1309a(i, i2, i3);
                if (a != a2) {
                    i = appBarLayout.m633b() != 0 ? m17415b(appBarLayout, a2) : a2;
                    i2 = mo3653a(i);
                    i4 = a - a2;
                    this.f14127b = a2 - i;
                    if (i2 == 0 && appBarLayout.m633b() != 0) {
                        coordinatorLayout.m15647b((View) appBarLayout);
                    }
                    appBarLayout.m628a(mo3655b());
                    m17413a(coordinatorLayout, appBarLayout, a2, a2 < a ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* renamed from: b */
        private int m17415b(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = appBarLayout.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b = layoutParams.m618b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else {
                    if (b != null) {
                        childCount = layoutParams.m617a();
                        if ((childCount & 1) != 0) {
                            i2 = 0 + ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin);
                            if ((childCount & 2) != 0) {
                                i2 -= ViewCompat.m2220l(childAt);
                            }
                        }
                        if (ViewCompat.m2227s(childAt)) {
                            i2 -= appBarLayout.getTopInset();
                        }
                        if (i2 > 0) {
                            appBarLayout = (float) i2;
                            return Integer.signum(i) * (childAt.getTop() + Math.round(appBarLayout * b.getInterpolation(((float) (abs - childAt.getTop())) / appBarLayout)));
                        }
                    }
                    return i;
                }
            }
            return i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        private void m17413a(android.support.design.widget.CoordinatorLayout r6, android.support.design.widget.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
            r5 = this;
            r0 = m17416c(r7, r8);
            if (r0 == 0) goto L_0x0058;
        L_0x0006:
            r1 = r0.getLayoutParams();
            r1 = (android.support.design.widget.AppBarLayout.LayoutParams) r1;
            r1 = r1.m617a();
            r2 = r1 & 1;
            r3 = 0;
            if (r2 == 0) goto L_0x0041;
        L_0x0015:
            r2 = android.support.v4.view.ViewCompat.m2220l(r0);
            r4 = 1;
            if (r9 <= 0) goto L_0x002f;
        L_0x001c:
            r9 = r1 & 12;
            if (r9 == 0) goto L_0x002f;
        L_0x0020:
            r8 = -r8;
            r9 = r0.getBottom();
            r9 = r9 - r2;
            r0 = r7.getTopInset();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x0041;
        L_0x002d:
            r3 = 1;
            goto L_0x0041;
        L_0x002f:
            r9 = r1 & 2;
            if (r9 == 0) goto L_0x0041;
        L_0x0033:
            r8 = -r8;
            r9 = r0.getBottom();
            r9 = r9 - r2;
            r0 = r7.getTopInset();
            r9 = r9 - r0;
            if (r8 < r9) goto L_0x0041;
        L_0x0040:
            goto L_0x002d;
        L_0x0041:
            r8 = r7.m631a(r3);
            r9 = android.os.Build.VERSION.SDK_INT;
            r0 = 11;
            if (r9 < r0) goto L_0x0058;
        L_0x004b:
            if (r10 != 0) goto L_0x0055;
        L_0x004d:
            if (r8 == 0) goto L_0x0058;
        L_0x004f:
            r6 = r5.m17418d(r6, r7);
            if (r6 == 0) goto L_0x0058;
        L_0x0055:
            r7.jumpDrawablesToCurrentState();
        L_0x0058:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AppBarLayout.Behavior.a(android.support.design.widget.CoordinatorLayout, android.support.design.widget.AppBarLayout, int, int, boolean):void");
        }

        /* renamed from: d */
        private boolean m17418d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            coordinatorLayout = coordinatorLayout.m15654d((View) appBarLayout);
            appBarLayout = coordinatorLayout.size();
            boolean z = false;
            for (int i = 0; i < appBarLayout; i++) {
                android.support.design.widget.CoordinatorLayout.Behavior b = ((C0205b) ((View) coordinatorLayout.get(i)).getLayoutParams()).m720b();
                if (b instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) b).m15675d() != null) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: c */
        private static View m17416c(AppBarLayout appBarLayout, int i) {
            i = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (i >= childAt.getTop() && i <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        int mo3646a() {
            return mo3655b() + this.f14127b;
        }

        /* renamed from: b */
        public Parcelable m17444b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            coordinatorLayout = super.mo237b(coordinatorLayout, appBarLayout);
            int b = mo3655b();
            int childCount = appBarLayout.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    Parcelable savedState = new SavedState(coordinatorLayout);
                    savedState.firstVisibleChildIndex = i;
                    if (bottom == ViewCompat.m2220l(childAt) + appBarLayout.getTopInset()) {
                        z = true;
                    }
                    savedState.firstVisibleChildAtMinimumHeight = z;
                    savedState.firstVisibleChildPercentageShown = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return coordinatorLayout;
        }

        /* renamed from: a */
        public void m17424a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo231a(coordinatorLayout, (View) appBarLayout, savedState.getSuperState());
                this.f14129d = savedState.firstVisibleChildIndex;
                this.f14131f = savedState.firstVisibleChildPercentageShown;
                this.f14130e = savedState.firstVisibleChildAtMinimumHeight;
                return;
            }
            super.mo231a(coordinatorLayout, (View) appBarLayout, parcelable);
            this.f14129d = -1;
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo2987a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo2987a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo3655b() {
            return super.mo3655b();
        }

        /* renamed from: b */
        /* synthetic */ View mo3662b(List list) {
            return m17451a(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0180k.ScrollingViewBehavior_Layout);
            m15672b((int) context.getDimensionPixelSize(C0180k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            context.recycle();
        }

        /* renamed from: a */
        public boolean mo3660a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: b */
        public boolean mo246b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m17449e(coordinatorLayout, view, view2);
            return null;
        }

        /* renamed from: a */
        public boolean mo3659a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = m17451a(coordinatorLayout.m15650c(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                view = this.a;
                view.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (view.contains(rect) == null) {
                    a.m630a(false, z ^ 1);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        private void m17449e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            coordinatorLayout = ((C0205b) view2.getLayoutParams()).m720b();
            if (coordinatorLayout instanceof Behavior) {
                ViewCompat.m2202c(view, (((view2.getBottom() - view.getTop()) + ((Behavior) coordinatorLayout).f14127b) + m15668a()) - m15674c(view2));
            }
        }

        /* renamed from: a */
        float mo3658a(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                view = m17448a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + view <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                totalScrollRange -= downNestedPreScrollRange;
                if (totalScrollRange != 0) {
                    return (((float) view) / ((float) totalScrollRange)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: a */
        private static int m17448a(AppBarLayout appBarLayout) {
            appBarLayout = ((C0205b) appBarLayout.getLayoutParams()).m720b();
            return appBarLayout instanceof Behavior ? ((Behavior) appBarLayout).mo3646a() : null;
        }

        /* renamed from: a */
        AppBarLayout m17451a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: b */
        int mo3661b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo3661b(view);
        }
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m624a();
    }

    /* renamed from: generateDefaultLayoutParams */
    protected /* synthetic */ android.widget.LinearLayout.LayoutParams m71740generateDefaultLayoutParams() {
        return m624a();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m625a(attributeSet);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m626a(layoutParams);
    }

    /* renamed from: generateLayoutParams */
    public /* synthetic */ android.widget.LinearLayout.LayoutParams m71741generateLayoutParams(AttributeSet attributeSet) {
        return m625a(attributeSet);
    }

    /* renamed from: generateLayoutParams */
    protected /* synthetic */ android.widget.LinearLayout.LayoutParams m71742generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m626a(layoutParams);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f607a = -1;
        this.f608b = -1;
        this.f609c = -1;
        this.f611e = 0;
        setOrientation(1);
        C0248o.m917a(context);
        if (VERSION.SDK_INT >= 21) {
            C0251r.m925a(this);
            C0251r.m927a(this, attributeSet, 0, C0179j.Widget_Design_AppBarLayout);
        }
        context = context.obtainStyledAttributes(attributeSet, C0180k.AppBarLayout, 0, C0179j.Widget_Design_AppBarLayout);
        ViewCompat.m2183a((View) this, context.getDrawable(C0180k.AppBarLayout_android_background));
        if (context.hasValue(C0180k.AppBarLayout_expanded) != null) {
            m620a(context.getBoolean(C0180k.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && context.hasValue(C0180k.AppBarLayout_elevation) != null) {
            C0251r.m926a(this, (float) context.getDimensionPixelSize(C0180k.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (context.hasValue(C0180k.AppBarLayout_android_keyboardNavigationCluster) != null) {
                setKeyboardNavigationCluster(context.getBoolean(C0180k.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (context.hasValue(C0180k.AppBarLayout_android_touchscreenBlocksFocus) != null) {
                setTouchscreenBlocksFocus(context.getBoolean(C0180k.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        context.recycle();
        ViewCompat.m2184a((View) this, new C27551(this));
    }

    /* renamed from: a */
    public void m629a(OnOffsetChangedListener onOffsetChangedListener) {
        if (this.f613g == null) {
            this.f613g = new ArrayList();
        }
        if (onOffsetChangedListener != null && !this.f613g.contains(onOffsetChangedListener)) {
            this.f613g.add(onOffsetChangedListener);
        }
    }

    /* renamed from: b */
    public void m632b(OnOffsetChangedListener onOffsetChangedListener) {
        if (this.f613g != null && onOffsetChangedListener != null) {
            this.f613g.remove(onOffsetChangedListener);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m623f();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m623f();
        z = false;
        this.f610d = false;
        boolean childCount = getChildCount();
        while (z < childCount) {
            if (((LayoutParams) getChildAt(z).getLayoutParams()).m618b() != 0) {
                this.f610d = true;
                break;
            }
            z++;
        }
        m622e();
    }

    /* renamed from: e */
    private void m622e() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).m619c()) {
                z = true;
                break;
            }
        }
        m621b(z);
    }

    /* renamed from: f */
    private void m623f() {
        this.f607a = -1;
        this.f608b = -1;
        this.f609c = -1;
    }

    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setExpanded(boolean z) {
        m630a(z, ViewCompat.m2234z(this));
    }

    /* renamed from: a */
    public void m630a(boolean z, boolean z2) {
        m620a(z, z2, true);
    }

    /* renamed from: a */
    private void m620a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        z = (z ? true : true) | (z2 ? true : false);
        if (z3) {
            i = 8;
        }
        this.f611e = z | i;
        requestLayout();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    protected LayoutParams m624a() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    public LayoutParams m625a(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: a */
    protected LayoutParams m626a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof android.widget.LinearLayout.LayoutParams)) {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: b */
    boolean m633b() {
        return this.f610d;
    }

    public final int getTotalScrollRange() {
        if (this.f607a != -1) {
            return this.f607a;
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i3 = layoutParams.f605a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += (measuredHeight + layoutParams.topMargin) + layoutParams.bottomMargin;
            if ((i3 & 2) != 0) {
                i -= ViewCompat.m2220l(childAt);
                break;
            }
        }
        childCount = Math.max(0, i - getTopInset());
        this.f607a = childCount;
        return childCount;
    }

    /* renamed from: c */
    boolean m634c() {
        return getTotalScrollRange() != 0;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    int getDownNestedPreScrollRange() {
        if (this.f608b != -1) {
            return this.f608b;
        }
        int childCount;
        int i = 0;
        for (childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i2 = layoutParams.f605a;
            if ((i2 & 5) == 5) {
                i += layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i2 & 8) != 0) {
                    i += ViewCompat.m2220l(childAt);
                } else if ((i2 & 2) != 0) {
                    i += measuredHeight - ViewCompat.m2220l(childAt);
                } else {
                    i += measuredHeight - getTopInset();
                }
            } else if (i > 0) {
                break;
            }
        }
        childCount = Math.max(0, i);
        this.f608b = childCount;
        return childCount;
    }

    int getDownNestedScrollRange() {
        if (this.f609c != -1) {
            return this.f609c;
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + (layoutParams.topMargin + layoutParams.bottomMargin);
            int i3 = layoutParams.f605a;
            if ((i3 & 1) == 0) {
                break;
            }
            i += measuredHeight;
            if ((i3 & 2) != 0) {
                i -= ViewCompat.m2220l(childAt) + getTopInset();
                break;
            }
        }
        childCount = Math.max(0, i);
        this.f609c = childCount;
        return childCount;
    }

    /* renamed from: a */
    void m628a(int i) {
        if (this.f613g != null) {
            int size = this.f613g.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnOffsetChangedListener onOffsetChangedListener = (OnOffsetChangedListener) this.f613g.get(i2);
                if (onOffsetChangedListener != null) {
                    onOffsetChangedListener.onOffsetChanged(this, i);
                }
            }
        }
    }

    final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int l = ViewCompat.m2220l(this);
        if (l != 0) {
            return (l * 2) + topInset;
        }
        l = getChildCount();
        l = l >= 1 ? ViewCompat.m2220l(getChildAt(l - 1)) : 0;
        if (l != 0) {
            return (l * 2) + topInset;
        }
        return getHeight() / 3;
    }

    protected int[] onCreateDrawableState(int i) {
        if (this.f616j == null) {
            this.f616j = new int[2];
        }
        int[] iArr = this.f616j;
        i = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f614h ? C0171b.state_collapsible : -C0171b.state_collapsible;
        int i2 = (this.f614h && this.f615i) ? C0171b.state_collapsed : -C0171b.state_collapsed;
        iArr[1] = i2;
        return mergeDrawableStates(i, iArr);
    }

    /* renamed from: b */
    private boolean m621b(boolean z) {
        if (this.f614h == z) {
            return false;
        }
        this.f614h = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: a */
    boolean m631a(boolean z) {
        if (this.f615i == z) {
            return false;
        }
        this.f615i = z;
        refreshDrawableState();
        return true;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C0251r.m926a(this, f);
        }
    }

    int getPendingAction() {
        return this.f611e;
    }

    /* renamed from: d */
    void m635d() {
        this.f611e = 0;
    }

    @VisibleForTesting
    final int getTopInset() {
        return this.f612f != null ? this.f612f.m2390b() : 0;
    }

    /* renamed from: a */
    C0610p m627a(C0610p c0610p) {
        C0610p c0610p2 = ViewCompat.m2227s(this) ? c0610p : null;
        if (!C0558i.m2057a(this.f612f, c0610p2)) {
            this.f612f = c0610p2;
            m623f();
        }
        return c0610p;
    }
}
