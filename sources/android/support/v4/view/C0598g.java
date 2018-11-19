package android.support.v4.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.g */
public class C0598g {
    /* renamed from: a */
    private ViewParent f1796a;
    /* renamed from: b */
    private ViewParent f1797b;
    /* renamed from: c */
    private final View f1798c;
    /* renamed from: d */
    private boolean f1799d;
    /* renamed from: e */
    private int[] f1800e;

    public C0598g(@NonNull View view) {
        this.f1798c = view;
    }

    /* renamed from: a */
    public void m2331a(boolean z) {
        if (this.f1799d) {
            ViewCompat.m2233y(this.f1798c);
        }
        this.f1799d = z;
    }

    /* renamed from: a */
    public boolean m2332a() {
        return this.f1799d;
    }

    /* renamed from: b */
    public boolean m2341b() {
        return m2335a(0);
    }

    /* renamed from: a */
    public boolean m2335a(int i) {
        return m2330d(i) != 0;
    }

    /* renamed from: b */
    public boolean m2342b(int i) {
        return m2336a(i, 0);
    }

    /* renamed from: a */
    public boolean m2336a(int i, int i2) {
        if (m2335a(i2)) {
            return true;
        }
        if (m2332a()) {
            View view = this.f1798c;
            for (ViewParent parent = this.f1798c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0606m.m2372a(parent, view, this.f1798c, i, i2)) {
                    m2329a(i2, parent);
                    C0606m.m2374b(parent, view, this.f1798c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m2343c() {
        m2344c(0);
    }

    /* renamed from: c */
    public void m2344c(int i) {
        ViewParent d = m2330d(i);
        if (d != null) {
            C0606m.m2367a(d, this.f1798c, i);
            m2329a(i, null);
        }
    }

    /* renamed from: a */
    public boolean m2337a(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return m2338a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public boolean m2338a(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        int[] iArr2 = iArr;
        if (m2332a()) {
            int i6 = i5;
            ViewParent d = m2330d(i6);
            if (d == null) {
                return false;
            }
            int i7;
            int i8;
            if (i == 0 && i2 == 0 && i3 == 0) {
                if (i4 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                }
            }
            if (iArr2 != null) {
                r0.f1798c.getLocationInWindow(iArr2);
                i7 = iArr2[0];
                i8 = iArr2[1];
            } else {
                i7 = 0;
                i8 = 0;
            }
            C0606m.m2368a(d, r0.f1798c, i, i2, i3, i4, i6);
            if (iArr2 != null) {
                r0.f1798c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i7;
                iArr2[1] = iArr2[1] - i8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2339a(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return m2340a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean m2340a(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        if (m2332a()) {
            ViewParent d = m2330d(i3);
            if (d == null) {
                return false;
            }
            int i4;
            int i5;
            boolean z = true;
            if (i == 0) {
                if (i2 == 0) {
                    if (iArr2 != null) {
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                }
            }
            if (iArr2 != null) {
                this.f1798c.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.f1800e == null) {
                    this.f1800e = new int[2];
                }
                iArr = this.f1800e;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C0606m.m2369a(d, this.f1798c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f1798c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr[0] == 0) {
                if (iArr[1] == 0) {
                    z = false;
                }
            }
            return z;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2334a(float f, float f2, boolean z) {
        if (m2332a()) {
            ViewParent d = m2330d(0);
            if (d != null) {
                return C0606m.m2371a(d, this.f1798c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m2333a(float f, float f2) {
        if (m2332a()) {
            ViewParent d = m2330d(0);
            if (d != null) {
                return C0606m.m2370a(d, this.f1798c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: d */
    private ViewParent m2330d(int i) {
        switch (i) {
            case 0:
                return this.f1796a;
            case 1:
                return this.f1797b;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private void m2329a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f1796a = viewParent;
                return;
            case 1:
                this.f1797b = viewParent;
                return;
            default:
                return;
        }
    }
}
