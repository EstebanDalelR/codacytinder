package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.m */
public final class C0606m {
    /* renamed from: a */
    static final C0605c f1806a;

    /* renamed from: android.support.v4.view.m$c */
    static class C0605c {
        C0605c() {
        }

        /* renamed from: a */
        public boolean mo3064a(ViewParent viewParent, View view, View view2, int i) {
            return viewParent instanceof NestedScrollingParent ? ((NestedScrollingParent) viewParent).onStartNestedScroll(view, view2, i) : null;
        }

        /* renamed from: b */
        public void mo3065b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo3059a(ViewParent viewParent, View view) {
            if (viewParent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) viewParent).onStopNestedScroll(view);
            }
        }

        /* renamed from: a */
        public void mo3060a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo3061a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof NestedScrollingParent) {
                ((NestedScrollingParent) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo3063a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent instanceof NestedScrollingParent ? ((NestedScrollingParent) viewParent).onNestedFling(view, f, f2, z) : null;
        }

        /* renamed from: a */
        public boolean mo3062a(ViewParent viewParent, View view, float f, float f2) {
            return viewParent instanceof NestedScrollingParent ? ((NestedScrollingParent) viewParent).onNestedPreFling(view, f, f2) : null;
        }
    }

    @RequiresApi(19)
    /* renamed from: android.support.v4.view.m$a */
    static class C2897a extends C0605c {
        C2897a() {
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.view.m$b */
    static class C4032b extends C2897a {
        C4032b() {
        }

        /* renamed from: a */
        public boolean mo3064a(ViewParent viewParent, View view, View view2, int i) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (View view3) {
                i = new StringBuilder();
                i.append("ViewParent ");
                i.append(viewParent);
                i.append(" does not implement interface ");
                i.append("method onStartNestedScroll");
                Log.e("ViewParentCompat", i.toString(), view3);
                return null;
            }
        }

        /* renamed from: b */
        public void mo3065b(ViewParent viewParent, View view, View view2, int i) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (View view3) {
                i = new StringBuilder();
                i.append("ViewParent ");
                i.append(viewParent);
                i.append(" does not implement interface ");
                i.append("method onNestedScrollAccepted");
                Log.e("ViewParentCompat", i.toString(), view3);
            }
        }

        /* renamed from: a */
        public void mo3059a(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (View view2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onStopNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), view2);
            }
        }

        /* renamed from: a */
        public void mo3060a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (View view2) {
                i2 = new StringBuilder();
                i2.append("ViewParent ");
                i2.append(viewParent);
                i2.append(" does not implement interface ");
                i2.append("method onNestedScroll");
                Log.e("ViewParentCompat", i2.toString(), view2);
            }
        }

        /* renamed from: a */
        public void mo3061a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (View view2) {
                i2 = new StringBuilder();
                i2.append("ViewParent ");
                i2.append(viewParent);
                i2.append(" does not implement interface ");
                i2.append("method onNestedPreScroll");
                Log.e("ViewParentCompat", i2.toString(), view2);
            }
        }

        /* renamed from: a */
        public boolean mo3063a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (View view2) {
                f2 = new StringBuilder();
                f2.append("ViewParent ");
                f2.append(viewParent);
                f2.append(" does not implement interface ");
                f2.append("method onNestedFling");
                Log.e("ViewParentCompat", f2.toString(), view2);
                return null;
            }
        }

        /* renamed from: a */
        public boolean mo3062a(ViewParent viewParent, View view, float f, float f2) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (View view2) {
                f2 = new StringBuilder();
                f2.append("ViewParent ");
                f2.append(viewParent);
                f2.append(" does not implement interface ");
                f2.append("method onNestedPreFling");
                Log.e("ViewParentCompat", f2.toString(), view2);
                return null;
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1806a = new C4032b();
        } else if (VERSION.SDK_INT >= 19) {
            f1806a = new C2897a();
        } else {
            f1806a = new C0605c();
        }
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m2373a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static boolean m2372a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        return i2 == 0 ? f1806a.mo3064a(viewParent, view, view2, i) : null;
    }

    /* renamed from: b */
    public static void m2374b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            f1806a.mo3065b(viewParent, view, view2, i);
        }
    }

    /* renamed from: a */
    public static void m2367a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            f1806a.mo3059a(viewParent, view);
        }
    }

    /* renamed from: a */
    public static void m2368a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            f1806a.mo3060a(viewParent, view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2369a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            f1806a.mo3061a(viewParent, view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public static boolean m2371a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f1806a.mo3063a(viewParent, view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m2370a(ViewParent viewParent, View view, float f, float f2) {
        return f1806a.mo3062a(viewParent, view, f, f2);
    }
}
