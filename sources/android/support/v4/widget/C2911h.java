package android.support.v4.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.C0563n;
import android.support.v4.view.C0582a;
import android.support.v4.view.C0606m;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.C0583a;
import android.support.v4.view.accessibility.C0586b;
import android.support.v4.view.accessibility.C0588c;
import android.support.v4.view.accessibility.C0589d;
import android.support.v4.widget.FocusStrategy.BoundsAdapter;
import android.support.v4.widget.FocusStrategy.CollectionAdapter;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.h */
public abstract class C2911h extends C0582a {
    /* renamed from: a */
    private static final Rect f9184a = new Rect(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, Integer.MIN_VALUE, Integer.MIN_VALUE);
    /* renamed from: l */
    private static final BoundsAdapter<C0586b> f9185l = new C29081();
    /* renamed from: m */
    private static final CollectionAdapter<C0563n<C0586b>, C0586b> f9186m = new C29092();
    /* renamed from: b */
    private final Rect f9187b = new Rect();
    /* renamed from: c */
    private final Rect f9188c = new Rect();
    /* renamed from: d */
    private final Rect f9189d = new Rect();
    /* renamed from: e */
    private final int[] f9190e = new int[2];
    /* renamed from: f */
    private final AccessibilityManager f9191f;
    /* renamed from: g */
    private final View f9192g;
    /* renamed from: h */
    private C2910a f9193h;
    /* renamed from: i */
    private int f9194i = Integer.MIN_VALUE;
    /* renamed from: j */
    private int f9195j = Integer.MIN_VALUE;
    /* renamed from: k */
    private int f9196k = Integer.MIN_VALUE;

    /* renamed from: android.support.v4.widget.h$1 */
    static class C29081 implements BoundsAdapter<C0586b> {
        C29081() {
        }

        public /* synthetic */ void obtainBounds(Object obj, Rect rect) {
            m11413a((C0586b) obj, rect);
        }

        /* renamed from: a */
        public void m11413a(C0586b c0586b, Rect rect) {
            c0586b.m2256a(rect);
        }
    }

    /* renamed from: android.support.v4.widget.h$2 */
    static class C29092 implements CollectionAdapter<C0563n<C0586b>, C0586b> {
        C29092() {
        }

        public /* synthetic */ Object get(Object obj, int i) {
            return m11415a((C0563n) obj, i);
        }

        public /* synthetic */ int size(Object obj) {
            return m11414a((C0563n) obj);
        }

        /* renamed from: a */
        public C0586b m11415a(C0563n<C0586b> c0563n, int i) {
            return (C0586b) c0563n.m2089e(i);
        }

        /* renamed from: a */
        public int m11414a(C0563n<C0586b> c0563n) {
            return c0563n.m2082b();
        }
    }

    /* renamed from: android.support.v4.widget.h$a */
    private class C2910a extends C0588c {
        /* renamed from: a */
        final /* synthetic */ C2911h f9183a;

        C2910a(C2911h c2911h) {
            this.f9183a = c2911h;
        }

        /* renamed from: a */
        public C0586b mo632a(int i) {
            return C0586b.m2249a(this.f9183a.m11444b(i));
        }

        /* renamed from: a */
        public boolean mo633a(int i, int i2, Bundle bundle) {
            return this.f9183a.m11442a(i, i2, bundle);
        }

        /* renamed from: b */
        public C0586b mo634b(int i) {
            i = i == 2 ? this.f9183a.f9194i : this.f9183a.f9195j;
            if (i == Integer.MIN_VALUE) {
                return 0;
            }
            return mo632a(i);
        }
    }

    /* renamed from: a */
    protected abstract int m11432a(float f, float f2);

    /* renamed from: a */
    protected abstract void m11435a(int i, @NonNull C0586b c0586b);

    /* renamed from: a */
    protected void m11436a(int i, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: a */
    protected void m11437a(int i, boolean z) {
    }

    /* renamed from: a */
    protected void m11438a(@NonNull C0586b c0586b) {
    }

    /* renamed from: a */
    protected void m11439a(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: a */
    protected abstract void m11440a(List<Integer> list);

    /* renamed from: b */
    protected abstract boolean m11446b(int i, int i2, @Nullable Bundle bundle);

    public C2911h(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f9192g = view;
        this.f9191f = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (ViewCompat.m2203d(view) == 0) {
            ViewCompat.m2176a(view, 1);
        }
    }

    public C0588c getAccessibilityNodeProvider(View view) {
        if (this.f9193h == null) {
            this.f9193h = new C2910a(this);
        }
        return this.f9193h;
    }

    /* renamed from: a */
    public final boolean m11443a(@NonNull MotionEvent motionEvent) {
        boolean z = false;
        if (this.f9191f.isEnabled()) {
            if (this.f9191f.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    switch (action) {
                        case 9:
                            break;
                        case 10:
                            if (this.f9194i == -2147483648) {
                                return false;
                            }
                            m11427e(Integer.MIN_VALUE);
                            return true;
                        default:
                            return false;
                    }
                }
                motionEvent = m11432a(motionEvent.getX(), motionEvent.getY());
                m11427e(motionEvent);
                if (motionEvent != -2147483648) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m11441a(int i, int i2) {
        if (i != Integer.MIN_VALUE) {
            if (this.f9191f.isEnabled()) {
                ViewParent parent = this.f9192g.getParent();
                if (parent == null) {
                    return false;
                }
                return C0606m.m2373a(parent, this.f9192g, m11424c(i, i2));
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void m11433a() {
        m11445b(-1, 1);
    }

    /* renamed from: a */
    public final void m11434a(int i) {
        m11445b(i, 0);
    }

    /* renamed from: b */
    public final void m11445b(int i, int i2) {
        if (i != Integer.MIN_VALUE && this.f9191f.isEnabled()) {
            ViewParent parent = this.f9192g.getParent();
            if (parent != null) {
                AccessibilityEvent c = m11424c(i, ItemAnimator.FLAG_MOVED);
                C0583a.m2246a(c, i2);
                C0606m.m2373a(parent, this.f9192g, c);
            }
        }
    }

    /* renamed from: e */
    private void m11427e(int i) {
        if (this.f9196k != i) {
            int i2 = this.f9196k;
            this.f9196k = i;
            m11441a(i, (int) ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            m11441a(i2, 256);
        }
    }

    /* renamed from: c */
    private AccessibilityEvent m11424c(int i, int i2) {
        if (i != -1) {
            return m11426d(i, i2);
        }
        return m11428f(i2);
    }

    /* renamed from: f */
    private AccessibilityEvent m11428f(int i) {
        i = AccessibilityEvent.obtain(i);
        this.f9192g.onInitializeAccessibilityEvent(i);
        return i;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        m11439a(accessibilityEvent);
    }

    /* renamed from: d */
    private AccessibilityEvent m11426d(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0586b b = m11444b(i);
        obtain.getText().add(b.m2297q());
        obtain.setContentDescription(b.m2298r());
        obtain.setScrollable(b.m2294n());
        obtain.setPassword(b.m2293m());
        obtain.setEnabled(b.m2292l());
        obtain.setChecked(b.m2281f());
        m11436a(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(b.m2296p());
        C0589d.m2307a(obtain, this.f9192g, i);
        obtain.setPackageName(this.f9192g.getContext().getPackageName());
        return obtain;
    }

    @NonNull
    /* renamed from: b */
    C0586b m11444b(int i) {
        if (i == -1) {
            return m11423b();
        }
        return m11429g(i);
    }

    @NonNull
    /* renamed from: b */
    private C0586b m11423b() {
        C0586b a = C0586b.m2250a(this.f9192g);
        ViewCompat.m2186a(this.f9192g, a);
        List arrayList = new ArrayList();
        m11440a(arrayList);
        if (a.m2267c() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a.m2263b(this.f9192g, ((Integer) arrayList.get(i)).intValue());
            }
            return a;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public void onInitializeAccessibilityNodeInfo(View view, C0586b c0586b) {
        super.onInitializeAccessibilityNodeInfo(view, c0586b);
        m11438a(c0586b);
    }

    @NonNull
    /* renamed from: g */
    private C0586b m11429g(int i) {
        C0586b b = C0586b.m2252b();
        b.m2282g(true);
        b.m2272c(true);
        b.m2264b((CharSequence) "android.view.View");
        b.m2261b(f9184a);
        b.m2274d(f9184a);
        b.m2262b(this.f9192g);
        m11435a(i, b);
        if (b.m2297q() == null && b.m2298r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b.m2256a(this.f9188c);
        if (this.f9188c.equals(f9184a)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int d = b.m2273d();
        if ((d & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else if ((d & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } else {
            b.m2258a(this.f9192g.getContext().getPackageName());
            b.m2257a(this.f9192g, i);
            if (this.f9194i == i) {
                b.m2280f(true);
                b.m2255a((int) ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            } else {
                b.m2280f(false);
                b.m2255a(64);
            }
            boolean z = this.f9195j == i;
            if (z) {
                b.m2255a(2);
            } else if (b.m2283g()) {
                b.m2255a(1);
            }
            b.m2276d(z);
            this.f9192g.getLocationOnScreen(this.f9190e);
            b.m2268c(this.f9187b);
            if (this.f9187b.equals(f9184a) != 0) {
                b.m2256a(this.f9187b);
                if (b.f1786a != -1) {
                    C0586b b2 = C0586b.m2252b();
                    for (int i2 = b.f1786a; i2 != -1; i2 = b2.f1786a) {
                        b2.m2270c(this.f9192g, -1);
                        b2.m2261b(f9184a);
                        m11435a(i2, b2);
                        b2.m2256a(this.f9188c);
                        this.f9187b.offset(this.f9188c.left, this.f9188c.top);
                    }
                    b2.m2299s();
                }
                this.f9187b.offset(this.f9190e[0] - this.f9192g.getScrollX(), this.f9190e[1] - this.f9192g.getScrollY());
            }
            if (this.f9192g.getLocalVisibleRect(this.f9189d) != 0) {
                this.f9189d.offset(this.f9190e[0] - this.f9192g.getScrollX(), this.f9190e[1] - this.f9192g.getScrollY());
                if (this.f9187b.intersect(this.f9189d) != 0) {
                    b.m2274d(this.f9187b);
                    if (m11421a(this.f9187b) != 0) {
                        b.m2278e(true);
                    }
                }
            }
            return b;
        }
    }

    /* renamed from: a */
    boolean m11442a(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m11425c(i, i2, bundle);
        }
        return m11420a(i2, bundle);
    }

    /* renamed from: a */
    private boolean m11420a(int i, Bundle bundle) {
        return ViewCompat.m2193a(this.f9192g, i, bundle);
    }

    /* renamed from: c */
    private boolean m11425c(int i, int i2, Bundle bundle) {
        if (i2 == 64) {
            return m11430h(i);
        }
        if (i2 == ProfileEditingConfig.DEFAULT_MAX_LENGTH) {
            return m11431i(i);
        }
        switch (i2) {
            case 1:
                return m11447c(i);
            case 2:
                return m11448d(i);
            default:
                return m11446b(i, i2, bundle);
        }
    }

    /* renamed from: a */
    private boolean m11421a(Rect rect) {
        boolean z = false;
        if (rect != null) {
            if (rect.isEmpty() == null) {
                if (this.f9192g.getWindowVisibility() != null) {
                    return false;
                }
                rect = this.f9192g.getParent();
                while (rect instanceof View) {
                    View view = (View) rect;
                    if (view.getAlpha() > 0.0f) {
                        if (view.getVisibility() == 0) {
                            rect = view.getParent();
                        }
                    }
                    return false;
                }
                if (rect != null) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m11430h(int i) {
        if (this.f9191f.isEnabled()) {
            if (this.f9191f.isTouchExplorationEnabled()) {
                if (this.f9194i == i) {
                    return false;
                }
                if (this.f9194i != Integer.MIN_VALUE) {
                    m11431i(this.f9194i);
                }
                this.f9194i = i;
                this.f9192g.invalidate();
                m11441a(i, 32768);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m11431i(int i) {
        if (this.f9194i != i) {
            return false;
        }
        this.f9194i = Integer.MIN_VALUE;
        this.f9192g.invalidate();
        m11441a(i, 65536);
        return true;
    }

    /* renamed from: c */
    public final boolean m11447c(int i) {
        if ((!this.f9192g.isFocused() && !this.f9192g.requestFocus()) || this.f9195j == i) {
            return false;
        }
        if (this.f9195j != Integer.MIN_VALUE) {
            m11448d(this.f9195j);
        }
        this.f9195j = i;
        m11437a(i, true);
        m11441a(i, 8);
        return true;
    }

    /* renamed from: d */
    public final boolean m11448d(int i) {
        if (this.f9195j != i) {
            return false;
        }
        this.f9195j = Integer.MIN_VALUE;
        m11437a(i, false);
        m11441a(i, 8);
        return true;
    }
}
