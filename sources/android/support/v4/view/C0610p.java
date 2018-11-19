package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.p */
public class C0610p {
    /* renamed from: a */
    private final Object f1817a;

    private C0610p(Object obj) {
        this.f1817a = obj;
    }

    /* renamed from: a */
    public int m2388a() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1817a).getSystemWindowInsetLeft() : 0;
    }

    /* renamed from: b */
    public int m2390b() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1817a).getSystemWindowInsetTop() : 0;
    }

    /* renamed from: c */
    public int m2391c() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1817a).getSystemWindowInsetRight() : 0;
    }

    /* renamed from: d */
    public int m2392d() {
        return VERSION.SDK_INT >= 20 ? ((WindowInsets) this.f1817a).getSystemWindowInsetBottom() : 0;
    }

    /* renamed from: e */
    public boolean m2393e() {
        return VERSION.SDK_INT >= 21 ? ((WindowInsets) this.f1817a).isConsumed() : false;
    }

    /* renamed from: f */
    public C0610p m2394f() {
        return VERSION.SDK_INT >= 20 ? new C0610p(((WindowInsets) this.f1817a).consumeSystemWindowInsets()) : null;
    }

    /* renamed from: a */
    public C0610p m2389a(int i, int i2, int i3, int i4) {
        return VERSION.SDK_INT >= 20 ? new C0610p(((WindowInsets) this.f1817a).replaceSystemWindowInsets(i, i2, i3, i4)) : 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C0610p c0610p = (C0610p) obj;
                if (this.f1817a != null) {
                    z = this.f1817a.equals(c0610p.f1817a);
                } else if (c0610p.f1817a != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f1817a == null ? 0 : this.f1817a.hashCode();
    }

    /* renamed from: a */
    static C0610p m2386a(Object obj) {
        return obj == null ? null : new C0610p(obj);
    }

    /* renamed from: a */
    static Object m2387a(C0610p c0610p) {
        return c0610p == null ? null : c0610p.f1817a;
    }
}
