package android.support.design.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.annotation.VisibleForTesting;
import android.support.design.C0181a.C0173d;
import android.support.design.C0181a.C0180k;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0205b;
import android.support.v4.p010a.C0360a;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.C0650n;
import android.support.v4.widget.C0650n.C0649a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.ads.AdError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {
    /* renamed from: a */
    int f8690a;
    /* renamed from: b */
    int f8691b;
    /* renamed from: c */
    boolean f8692c;
    /* renamed from: d */
    int f8693d = 4;
    /* renamed from: e */
    C0650n f8694e;
    /* renamed from: f */
    int f8695f;
    /* renamed from: g */
    WeakReference<V> f8696g;
    /* renamed from: h */
    WeakReference<View> f8697h;
    /* renamed from: i */
    int f8698i;
    /* renamed from: j */
    boolean f8699j;
    /* renamed from: k */
    private float f8700k;
    /* renamed from: l */
    private int f8701l;
    /* renamed from: m */
    private boolean f8702m;
    /* renamed from: n */
    private int f8703n;
    /* renamed from: o */
    private boolean f8704o;
    /* renamed from: p */
    private boolean f8705p;
    /* renamed from: q */
    private int f8706q;
    /* renamed from: r */
    private boolean f8707r;
    /* renamed from: s */
    private C0200a f8708s;
    /* renamed from: t */
    private VelocityTracker f8709t;
    /* renamed from: u */
    private int f8710u;
    /* renamed from: v */
    private final C0649a f8711v = new C27612(this);

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a */
    public static abstract class C0200a {
        /* renamed from: a */
        public abstract void mo267a(@NonNull View view, float f);

        /* renamed from: a */
        public abstract void mo268a(@NonNull View view, int i);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b */
    private class C0201b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f652a;
        /* renamed from: b */
        private final View f653b;
        /* renamed from: c */
        private final int f654c;

        C0201b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
            this.f652a = bottomSheetBehavior;
            this.f653b = view;
            this.f654c = i;
        }

        public void run() {
            if (this.f652a.f8694e == null || !this.f652a.f8694e.m2633a(true)) {
                this.f652a.m10735c(this.f654c);
            } else {
                ViewCompat.m2188a(this.f653b, (Runnable) this);
            }
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$2 */
    class C27612 extends C0649a {
        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f8689a;

        C27612(BottomSheetBehavior bottomSheetBehavior) {
            this.f8689a = bottomSheetBehavior;
        }

        /* renamed from: a */
        public boolean mo229a(View view, int i) {
            boolean z = true;
            if (this.f8689a.f8693d == 1 || this.f8689a.f8699j) {
                return false;
            }
            if (this.f8689a.f8693d == 3 && this.f8689a.f8698i == i) {
                View view2 = (View) this.f8689a.f8697h.get();
                if (!(view2 == null || view2.canScrollVertically(-1) == 0)) {
                    return false;
                }
            }
            if (this.f8689a.f8696g == 0 || this.f8689a.f8696g.get() != view) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        public void mo228a(View view, int i, int i2, int i3, int i4) {
            this.f8689a.m10737d(i2);
        }

        /* renamed from: a */
        public void mo226a(int i) {
            if (i == 1) {
                this.f8689a.m10735c(1);
            }
        }

        /* renamed from: a */
        public void mo227a(View view, float f, float f2) {
            int i;
            int i2 = 4;
            if (f2 < 0.0f) {
                i = this.f8689a.f8690a;
            } else if (this.f8689a.f8692c && this.f8689a.m10730a(view, f2)) {
                i = this.f8689a.f8695f;
                i2 = 5;
                if (this.f8689a.f8694e.m2630a(view.getLeft(), i) != null) {
                    this.f8689a.m10735c(i2);
                }
                this.f8689a.m10735c(2.8E-45f);
                ViewCompat.m2188a(view, new C0201b(this.f8689a, view, i2));
                return;
            } else {
                if (f2 == 0.0f) {
                    f = view.getTop();
                    if (Math.abs(f - this.f8689a.f8690a) < Math.abs(f - this.f8689a.f8691b)) {
                        i = this.f8689a.f8690a;
                    } else {
                        i = this.f8689a.f8691b;
                    }
                } else {
                    i = this.f8689a.f8691b;
                }
                if (this.f8689a.f8694e.m2630a(view.getLeft(), i) != null) {
                    this.f8689a.m10735c(2.8E-45f);
                    ViewCompat.m2188a(view, new C0201b(this.f8689a, view, i2));
                    return;
                }
                this.f8689a.m10735c(i2);
            }
            i2 = 3;
            if (this.f8689a.f8694e.m2630a(view.getLeft(), i) != null) {
                this.f8689a.m10735c(2.8E-45f);
                ViewCompat.m2188a(view, new C0201b(this.f8689a, view, i2));
                return;
            }
            this.f8689a.m10735c(i2);
        }

        /* renamed from: a */
        public int mo225a(View view, int i, int i2) {
            return C0360a.m1309a(i, this.f8689a.f8690a, this.f8689a.f8692c != 0 ? this.f8689a.f8695f : this.f8689a.f8691b);
        }

        /* renamed from: b */
        public int mo230b(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: a */
        public int mo224a(View view) {
            if (this.f8689a.f8692c != null) {
                return this.f8689a.f8695f - this.f8689a.f8690a;
            }
            return this.f8689a.f8691b - this.f8689a.f8690a;
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01991();
        final int state;

        /* renamed from: android.support.design.widget.BottomSheetBehavior$SavedState$1 */
        static class C01991 implements ClassLoaderCreator<SavedState> {
            C01991() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m658a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m659a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m660a(i);
            }

            /* renamed from: a */
            public SavedState m659a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m658a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m660a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        attributeSet = context.obtainStyledAttributes(attributeSet, C0180k.BottomSheetBehavior_Layout);
        TypedValue peekValue = attributeSet.peekValue(C0180k.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || peekValue.data != -1) {
            m10720a(attributeSet.getDimensionPixelSize(C0180k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            m10720a(peekValue.data);
        }
        m10725a(attributeSet.getBoolean(C0180k.BottomSheetBehavior_Layout_behavior_hideable, false));
        m10733b(attributeSet.getBoolean(C0180k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        attributeSet.recycle();
        this.f8700k = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: b */
    public Parcelable mo237b(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo237b(coordinatorLayout, v), this.f8693d);
    }

    /* renamed from: a */
    public void mo231a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo231a(coordinatorLayout, (View) v, savedState.getSuperState());
        if (savedState.state != 1) {
            if (savedState.state != 2) {
                this.f8693d = savedState.state;
                return;
            }
        }
        this.f8693d = 4;
    }

    /* renamed from: a */
    public boolean mo233a(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (ViewCompat.m2227s(coordinatorLayout) && !ViewCompat.m2227s(v)) {
            ViewCompat.m2198b((View) v, true);
        }
        int top = v.getTop();
        coordinatorLayout.m15640a((View) v, i);
        this.f8695f = coordinatorLayout.getHeight();
        if (this.f8702m != 0) {
            if (this.f8703n == 0) {
                this.f8703n = coordinatorLayout.getResources().getDimensionPixelSize(C0173d.design_bottom_sheet_peek_height_min);
            }
            i = Math.max(this.f8703n, this.f8695f - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i = this.f8701l;
        }
        this.f8690a = Math.max(0, this.f8695f - v.getHeight());
        this.f8691b = Math.max(this.f8695f - i, this.f8690a);
        if (this.f8693d == 3) {
            ViewCompat.m2202c((View) v, this.f8690a);
        } else if (this.f8692c != 0 && this.f8693d == 5) {
            ViewCompat.m2202c((View) v, this.f8695f);
        } else if (this.f8693d == 4) {
            ViewCompat.m2202c((View) v, this.f8691b);
        } else if (this.f8693d == 1 || this.f8693d == 2) {
            ViewCompat.m2202c((View) v, top - v.getTop());
        }
        if (this.f8694e == 0) {
            this.f8694e = C0650n.m2611a((ViewGroup) coordinatorLayout, this.f8711v);
        }
        this.f8696g = new WeakReference(v);
        this.f8697h = new WeakReference(m10719a((View) v));
        return true;
    }

    /* renamed from: a */
    public boolean mo234a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (v.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m10716a();
            }
            if (this.f8709t == null) {
                this.f8709t = VelocityTracker.obtain();
            }
            this.f8709t.addMovement(motionEvent);
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        int x = (int) motionEvent.getX();
                        this.f8710u = (int) motionEvent.getY();
                        View view = this.f8697h != null ? (View) this.f8697h.get() : null;
                        if (view != null && coordinatorLayout.m15645a(view, x, this.f8710u)) {
                            this.f8698i = motionEvent.getPointerId(motionEvent.getActionIndex());
                            this.f8699j = true;
                        }
                        v = (this.f8698i == -1 && coordinatorLayout.m15645a((View) v, x, this.f8710u) == null) ? true : null;
                        this.f8705p = v;
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
            this.f8699j = false;
            this.f8698i = -1;
            if (this.f8705p != null) {
                this.f8705p = false;
                return false;
            }
            if (this.f8705p == null && this.f8694e.m2631a(motionEvent) != null) {
                return true;
            }
            View view2 = (View) this.f8697h.get();
            if (actionMasked == 2 && view2 != null && !this.f8705p && this.f8693d != 1 && coordinatorLayout.m15645a(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) == null && Math.abs(((float) this.f8710u) - motionEvent.getY()) > ((float) this.f8694e.m2643d())) {
                z = true;
            }
            return z;
        }
        this.f8705p = true;
        return false;
    }

    /* renamed from: b */
    public boolean mo238b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (v.isShown() == null) {
            return null;
        }
        coordinatorLayout = motionEvent.getActionMasked();
        if (this.f8693d == 1 && coordinatorLayout == null) {
            return true;
        }
        if (this.f8694e != null) {
            this.f8694e.m2635b(motionEvent);
        }
        if (coordinatorLayout == null) {
            m10716a();
        }
        if (this.f8709t == null) {
            this.f8709t = VelocityTracker.obtain();
        }
        this.f8709t.addMovement(motionEvent);
        if (coordinatorLayout == 2 && this.f8705p == null && Math.abs(((float) this.f8710u) - motionEvent.getY()) > ((float) this.f8694e.m2643d())) {
            this.f8694e.m2629a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return this.f8705p ^ 1;
    }

    /* renamed from: a */
    public boolean mo236a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.f8706q = 0;
        this.f8707r = false;
        if ((i & 2) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo232a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (view == ((View) this.f8697h.get())) {
            coordinatorLayout = v.getTop();
            i = coordinatorLayout - i2;
            if (i2 > 0) {
                if (i < this.f8690a) {
                    iArr[1] = coordinatorLayout - this.f8690a;
                    ViewCompat.m2202c((View) v, -iArr[1]);
                    m10735c(3);
                } else {
                    iArr[1] = i2;
                    ViewCompat.m2202c((View) v, -i2);
                    m10735c(1);
                }
            } else if (i2 < 0 && view.canScrollVertically(-1) == null) {
                if (i > this.f8691b) {
                    if (this.f8692c == null) {
                        iArr[1] = coordinatorLayout - this.f8691b;
                        ViewCompat.m2202c((View) v, -iArr[1]);
                        m10735c(4);
                    }
                }
                iArr[1] = i2;
                ViewCompat.m2202c((View) v, -i2);
                m10735c(1);
            }
            m10737d(v.getTop());
            this.f8706q = i2;
            this.f8707r = true;
        }
    }

    /* renamed from: c */
    public void mo239c(CoordinatorLayout coordinatorLayout, V v, View view) {
        int i = 3;
        if (v.getTop() == this.f8690a) {
            m10735c(3);
            return;
        }
        if (this.f8697h != null && view == this.f8697h.get()) {
            if (this.f8707r != null) {
                int i2;
                if (this.f8706q > null) {
                    i2 = this.f8690a;
                } else if (this.f8692c == null || m10730a((View) v, m10717b()) == null) {
                    if (this.f8706q == null) {
                        coordinatorLayout = v.getTop();
                        if (Math.abs(coordinatorLayout - this.f8690a) < Math.abs(coordinatorLayout - this.f8691b)) {
                            i2 = this.f8690a;
                        } else {
                            i2 = this.f8691b;
                        }
                    } else {
                        i2 = this.f8691b;
                    }
                    i = 4;
                } else {
                    i2 = this.f8695f;
                    i = 5;
                }
                if (this.f8694e.m2632a((View) v, v.getLeft(), i2) != null) {
                    m10735c(2);
                    ViewCompat.m2188a((View) v, new C0201b(this, v, i));
                } else {
                    m10735c(i);
                }
                this.f8707r = null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo235a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return (view != this.f8697h.get() || (this.f8693d == 3 && super.mo235a(coordinatorLayout, (View) v, view, f, f2) == null)) ? null : true;
    }

    /* renamed from: a */
    public final void m10720a(int i) {
        boolean z = true;
        if (i != -1) {
            if (!this.f8702m) {
                if (this.f8701l != i) {
                }
            }
            this.f8702m = false;
            this.f8701l = Math.max(0, i);
            this.f8691b = this.f8695f - i;
            if (!z) {
            }
        } else if (this.f8702m == 0) {
            this.f8702m = true;
            if (!z && this.f8693d == 4 && this.f8696g != 0) {
                View view = (View) this.f8696g.get();
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            }
            return;
        }
        z = false;
        if (!z) {
        }
    }

    /* renamed from: a */
    public void m10725a(boolean z) {
        this.f8692c = z;
    }

    /* renamed from: b */
    public void m10733b(boolean z) {
        this.f8704o = z;
    }

    /* renamed from: a */
    public void m10721a(C0200a c0200a) {
        this.f8708s = c0200a;
    }

    /* renamed from: b */
    public final void m10732b(final int i) {
        if (i != this.f8693d) {
            if (this.f8696g == null) {
                if (i == 4 || i == 3 || (this.f8692c && i == 5)) {
                    this.f8693d = i;
                }
                return;
            }
            final View view = (View) this.f8696g.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != null && parent.isLayoutRequested() && ViewCompat.m2171C(view)) {
                    view.post(new Runnable(this) {
                        /* renamed from: c */
                        final /* synthetic */ BottomSheetBehavior f651c;

                        public void run() {
                            this.f651c.m10724a(view, i);
                        }
                    });
                } else {
                    m10724a(view, i);
                }
            }
        }
    }

    /* renamed from: c */
    void m10735c(int i) {
        if (this.f8693d != i) {
            this.f8693d = i;
            View view = (View) this.f8696g.get();
            if (!(view == null || this.f8708s == null)) {
                this.f8708s.mo268a(view, i);
            }
        }
    }

    /* renamed from: a */
    private void m10716a() {
        this.f8698i = -1;
        if (this.f8709t != null) {
            this.f8709t.recycle();
            this.f8709t = null;
        }
    }

    /* renamed from: a */
    boolean m10730a(View view, float f) {
        boolean z = true;
        if (this.f8704o) {
            return true;
        }
        if (view.getTop() < this.f8691b) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f8691b)) / ((float) this.f8701l) <= 0.5f) {
            z = false;
        }
        return z;
    }

    @VisibleForTesting
    /* renamed from: a */
    View m10719a(View view) {
        if (ViewCompat.m2232x(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = m10719a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private float m10717b() {
        this.f8709t.computeCurrentVelocity(AdError.NETWORK_ERROR_CODE, this.f8700k);
        return this.f8709t.getYVelocity(this.f8698i);
    }

    /* renamed from: a */
    void m10724a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f8691b;
        } else if (i == 3) {
            i2 = this.f8690a;
        } else if (this.f8692c && i == 5) {
            i2 = this.f8695f;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal state argument: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        if (this.f8694e.m2632a(view, view.getLeft(), i2)) {
            m10735c(2);
            ViewCompat.m2188a(view, new C0201b(this, view, i));
            return;
        }
        m10735c(i);
    }

    /* renamed from: d */
    void m10737d(int i) {
        View view = (View) this.f8696g.get();
        if (view != null && this.f8708s != null) {
            if (i > this.f8691b) {
                this.f8708s.mo267a(view, ((float) (this.f8691b - i)) / ((float) (this.f8695f - this.f8691b)));
            } else {
                this.f8708s.mo267a(view, ((float) (this.f8691b - i)) / ((float) (this.f8691b - this.f8690a)));
            }
        }
    }

    /* renamed from: b */
    public static <V extends View> BottomSheetBehavior<V> m10718b(V v) {
        v = v.getLayoutParams();
        if (v instanceof C0205b) {
            v = ((C0205b) v).m720b();
            if (v instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) v;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }
}
