package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.tinder.domain.config.model.ProfileEditingConfig;

/* renamed from: android.support.v4.view.accessibility.b */
public class C0586b {
    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public int f1786a = -1;
    /* renamed from: b */
    private final AccessibilityNodeInfo f1787b;

    /* renamed from: android.support.v4.view.accessibility.b$a */
    public static class C0584a {
        /* renamed from: a */
        final Object f1784a;

        /* renamed from: a */
        public static C0584a m2247a(int i, int i2, boolean z, int i3) {
            if (VERSION.SDK_INT >= 21) {
                return new C0584a(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (VERSION.SDK_INT >= 19) {
                return new C0584a(CollectionInfo.obtain(i, i2, z));
            }
            return new C0584a(0);
        }

        C0584a(Object obj) {
            this.f1784a = obj;
        }
    }

    /* renamed from: android.support.v4.view.accessibility.b$b */
    public static class C0585b {
        /* renamed from: a */
        final Object f1785a;

        /* renamed from: a */
        public static C0585b m2248a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (VERSION.SDK_INT >= 21) {
                return new C0585b(CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (VERSION.SDK_INT >= true) {
                return new C0585b(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0585b(0);
        }

        C0585b(Object obj) {
            this.f1785a = obj;
        }
    }

    /* renamed from: b */
    private static String m2253b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case ProfileEditingConfig.DEFAULT_MAX_LENGTH /*128*/:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case ItemAnimator.FLAG_MOVED /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    private C0586b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1787b = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0586b m2251a(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0586b(accessibilityNodeInfo);
    }

    /* renamed from: a */
    public AccessibilityNodeInfo m2254a() {
        return this.f1787b;
    }

    /* renamed from: a */
    public static C0586b m2250a(View view) {
        return C0586b.m2251a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: b */
    public static C0586b m2252b() {
        return C0586b.m2251a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: a */
    public static C0586b m2249a(C0586b c0586b) {
        return C0586b.m2251a(AccessibilityNodeInfo.obtain(c0586b.f1787b));
    }

    /* renamed from: a */
    public void m2257a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f1787b.setSource(view, i);
        }
    }

    /* renamed from: c */
    public int m2267c() {
        return this.f1787b.getChildCount();
    }

    /* renamed from: b */
    public void m2263b(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f1787b.addChild(view, i);
        }
    }

    /* renamed from: d */
    public int m2273d() {
        return this.f1787b.getActions();
    }

    /* renamed from: a */
    public void m2255a(int i) {
        this.f1787b.addAction(i);
    }

    /* renamed from: b */
    public void m2262b(View view) {
        this.f1787b.setParent(view);
    }

    /* renamed from: c */
    public void m2270c(View view, int i) {
        this.f1786a = i;
        if (VERSION.SDK_INT >= 16) {
            this.f1787b.setParent(view, i);
        }
    }

    /* renamed from: a */
    public void m2256a(Rect rect) {
        this.f1787b.getBoundsInParent(rect);
    }

    /* renamed from: b */
    public void m2261b(Rect rect) {
        this.f1787b.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public void m2268c(Rect rect) {
        this.f1787b.getBoundsInScreen(rect);
    }

    /* renamed from: d */
    public void m2274d(Rect rect) {
        this.f1787b.setBoundsInScreen(rect);
    }

    /* renamed from: e */
    public boolean m2279e() {
        return this.f1787b.isCheckable();
    }

    /* renamed from: a */
    public void m2260a(boolean z) {
        this.f1787b.setCheckable(z);
    }

    /* renamed from: f */
    public boolean m2281f() {
        return this.f1787b.isChecked();
    }

    /* renamed from: b */
    public void m2266b(boolean z) {
        this.f1787b.setChecked(z);
    }

    /* renamed from: g */
    public boolean m2283g() {
        return this.f1787b.isFocusable();
    }

    /* renamed from: c */
    public void m2272c(boolean z) {
        this.f1787b.setFocusable(z);
    }

    /* renamed from: h */
    public boolean m2285h() {
        return this.f1787b.isFocused();
    }

    /* renamed from: d */
    public void m2276d(boolean z) {
        this.f1787b.setFocused(z);
    }

    /* renamed from: e */
    public void m2278e(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1787b.setVisibleToUser(z);
        }
    }

    /* renamed from: f */
    public void m2280f(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f1787b.setAccessibilityFocused(z);
        }
    }

    /* renamed from: i */
    public boolean m2287i() {
        return this.f1787b.isSelected();
    }

    /* renamed from: j */
    public boolean m2289j() {
        return this.f1787b.isClickable();
    }

    /* renamed from: k */
    public boolean m2291k() {
        return this.f1787b.isLongClickable();
    }

    /* renamed from: l */
    public boolean m2292l() {
        return this.f1787b.isEnabled();
    }

    /* renamed from: g */
    public void m2282g(boolean z) {
        this.f1787b.setEnabled(z);
    }

    /* renamed from: m */
    public boolean m2293m() {
        return this.f1787b.isPassword();
    }

    /* renamed from: n */
    public boolean m2294n() {
        return this.f1787b.isScrollable();
    }

    /* renamed from: h */
    public void m2284h(boolean z) {
        this.f1787b.setScrollable(z);
    }

    /* renamed from: o */
    public CharSequence m2295o() {
        return this.f1787b.getPackageName();
    }

    /* renamed from: a */
    public void m2258a(CharSequence charSequence) {
        this.f1787b.setPackageName(charSequence);
    }

    /* renamed from: p */
    public CharSequence m2296p() {
        return this.f1787b.getClassName();
    }

    /* renamed from: b */
    public void m2264b(CharSequence charSequence) {
        this.f1787b.setClassName(charSequence);
    }

    /* renamed from: q */
    public CharSequence m2297q() {
        return this.f1787b.getText();
    }

    /* renamed from: c */
    public void m2271c(CharSequence charSequence) {
        this.f1787b.setText(charSequence);
    }

    /* renamed from: r */
    public CharSequence m2298r() {
        return this.f1787b.getContentDescription();
    }

    /* renamed from: d */
    public void m2275d(CharSequence charSequence) {
        this.f1787b.setContentDescription(charSequence);
    }

    /* renamed from: s */
    public void m2299s() {
        this.f1787b.recycle();
    }

    /* renamed from: t */
    public String m2300t() {
        return VERSION.SDK_INT >= 18 ? this.f1787b.getViewIdResourceName() : null;
    }

    /* renamed from: a */
    public void m2259a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1787b.setCollectionInfo((CollectionInfo) ((C0584a) obj).f1784a);
        }
    }

    /* renamed from: b */
    public void m2265b(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f1787b.setCollectionItemInfo((CollectionItemInfo) ((C0585b) obj).f1785a);
        }
    }

    /* renamed from: i */
    public void m2286i(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f1787b.setContentInvalid(z);
        }
    }

    /* renamed from: e */
    public void m2277e(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f1787b.setError(charSequence);
        }
    }

    /* renamed from: c */
    public void m2269c(View view) {
        if (VERSION.SDK_INT >= 17) {
            this.f1787b.setLabelFor(view);
        }
    }

    /* renamed from: j */
    public void m2288j(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f1787b.setCanOpenPopup(z);
        }
    }

    /* renamed from: k */
    public void m2290k(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f1787b.setDismissable(z);
        }
    }

    public int hashCode() {
        return this.f1787b == null ? 0 : this.f1787b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0586b c0586b = (C0586b) obj;
        if (this.f1787b == null) {
            if (c0586b.f1787b != null) {
                return false;
            }
        } else if (this.f1787b.equals(c0586b.f1787b) == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        m2256a(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        m2268c(rect);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInScreen: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(m2295o());
        stringBuilder.append("; className: ");
        stringBuilder.append(m2296p());
        stringBuilder.append("; text: ");
        stringBuilder.append(m2297q());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(m2298r());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(m2300t());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(m2279e());
        stringBuilder.append("; checked: ");
        stringBuilder.append(m2281f());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(m2283g());
        stringBuilder.append("; focused: ");
        stringBuilder.append(m2285h());
        stringBuilder.append("; selected: ");
        stringBuilder.append(m2287i());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(m2289j());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(m2291k());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(m2292l());
        stringBuilder.append("; password: ");
        stringBuilder.append(m2293m());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("; scrollable: ");
        stringBuilder3.append(m2294n());
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; [");
        int d = m2273d();
        while (d != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(d);
            d &= numberOfTrailingZeros ^ -1;
            stringBuilder.append(C0586b.m2253b(numberOfTrailingZeros));
            if (d != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
