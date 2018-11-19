package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.transition.C2803b.C0331a;
import android.support.transition.Transition.TransitionListener;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class Visibility extends Transition {
    /* renamed from: g */
    private static final String[] f8866g = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    /* renamed from: h */
    private int f8867h = 3;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    /* renamed from: android.support.transition.Visibility$b */
    private static class C0323b {
        /* renamed from: a */
        boolean f1123a;
        /* renamed from: b */
        boolean f1124b;
        /* renamed from: c */
        int f1125c;
        /* renamed from: d */
        int f1126d;
        /* renamed from: e */
        ViewGroup f1127e;
        /* renamed from: f */
        ViewGroup f1128f;

        private C0323b() {
        }
    }

    /* renamed from: android.support.transition.Visibility$a */
    private static class C2802a extends AnimatorListenerAdapter implements TransitionListener, C0331a {
        /* renamed from: a */
        boolean f8860a = false;
        /* renamed from: b */
        private final View f8861b;
        /* renamed from: c */
        private final int f8862c;
        /* renamed from: d */
        private final ViewGroup f8863d;
        /* renamed from: e */
        private final boolean f8864e;
        /* renamed from: f */
        private boolean f8865f;

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onTransitionCancel(@NonNull Transition transition) {
        }

        public void onTransitionStart(@NonNull Transition transition) {
        }

        C2802a(View view, int i, boolean z) {
            this.f8861b = view;
            this.f8862c = i;
            this.f8863d = (ViewGroup) view.getParent();
            this.f8864e = z;
            m10891a(true);
        }

        public void onAnimationPause(Animator animator) {
            if (this.f8860a == null) {
                am.m1250a(this.f8861b, this.f8862c);
            }
        }

        public void onAnimationResume(Animator animator) {
            if (this.f8860a == null) {
                am.m1250a(this.f8861b, 0);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f8860a = true;
        }

        public void onAnimationEnd(Animator animator) {
            m10890a();
        }

        public void onTransitionEnd(@NonNull Transition transition) {
            m10890a();
            transition.mo364b((TransitionListener) this);
        }

        public void onTransitionPause(@NonNull Transition transition) {
            m10891a(null);
        }

        public void onTransitionResume(@NonNull Transition transition) {
            m10891a(true);
        }

        /* renamed from: a */
        private void m10890a() {
            if (!this.f8860a) {
                am.m1250a(this.f8861b, this.f8862c);
                if (this.f8863d != null) {
                    this.f8863d.invalidate();
                }
            }
            m10891a(false);
        }

        /* renamed from: a */
        private void m10891a(boolean z) {
            if (this.f8864e && this.f8865f != z && this.f8863d != null) {
                this.f8865f = z;
                af.m1232a(this.f8863d, z);
            }
        }
    }

    /* renamed from: a */
    public Animator mo3015a(ViewGroup viewGroup, View view, C0358z c0358z, C0358z c0358z2) {
        return null;
    }

    /* renamed from: b */
    public Animator mo3016b(ViewGroup viewGroup, View view, C0358z c0358z, C0358z c0358z2) {
        return null;
    }

    /* renamed from: a */
    public void m10897a(int i) {
        if ((i & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f8867h = i;
    }

    @Nullable
    /* renamed from: a */
    public String[] mo338a() {
        return f8866g;
    }

    /* renamed from: d */
    private void m10893d(C0358z c0358z) {
        c0358z.f1196a.put("android:visibility:visibility", Integer.valueOf(c0358z.f1197b.getVisibility()));
        c0358z.f1196a.put("android:visibility:parent", c0358z.f1197b.getParent());
        Object obj = new int[2];
        c0358z.f1197b.getLocationOnScreen(obj);
        c0358z.f1196a.put("android:visibility:screenLocation", obj);
    }

    /* renamed from: a */
    public void mo336a(@NonNull C0358z c0358z) {
        m10893d(c0358z);
    }

    /* renamed from: b */
    public void mo339b(@NonNull C0358z c0358z) {
        m10893d(c0358z);
    }

    /* renamed from: b */
    private C0323b m10892b(C0358z c0358z, C0358z c0358z2) {
        C0323b c0323b = new C0323b();
        c0323b.f1123a = false;
        c0323b.f1124b = false;
        if (c0358z == null || !c0358z.f1196a.containsKey("android:visibility:visibility")) {
            c0323b.f1125c = -1;
            c0323b.f1127e = null;
        } else {
            c0323b.f1125c = ((Integer) c0358z.f1196a.get("android:visibility:visibility")).intValue();
            c0323b.f1127e = (ViewGroup) c0358z.f1196a.get("android:visibility:parent");
        }
        if (c0358z2 == null || !c0358z2.f1196a.containsKey("android:visibility:visibility")) {
            c0323b.f1126d = -1;
            c0323b.f1128f = null;
        } else {
            c0323b.f1126d = ((Integer) c0358z2.f1196a.get("android:visibility:visibility")).intValue();
            c0323b.f1128f = (ViewGroup) c0358z2.f1196a.get("android:visibility:parent");
        }
        if (c0358z == null || c0358z2 == null) {
            if (c0358z == null && c0323b.f1126d == null) {
                c0323b.f1124b = true;
                c0323b.f1123a = true;
            } else if (c0358z2 == null && c0323b.f1125c == null) {
                c0323b.f1124b = false;
                c0323b.f1123a = true;
            }
        } else if (c0323b.f1125c == c0323b.f1126d && c0323b.f1127e == c0323b.f1128f) {
            return c0323b;
        } else {
            if (c0323b.f1125c != c0323b.f1126d) {
                if (c0323b.f1125c == null) {
                    c0323b.f1124b = false;
                    c0323b.f1123a = true;
                } else if (c0323b.f1126d == null) {
                    c0323b.f1124b = true;
                    c0323b.f1123a = true;
                }
            } else if (c0323b.f1128f == null) {
                c0323b.f1124b = false;
                c0323b.f1123a = true;
            } else if (c0323b.f1127e == null) {
                c0323b.f1124b = true;
                c0323b.f1123a = true;
            }
        }
        return c0323b;
    }

    @Nullable
    /* renamed from: a */
    public Animator mo335a(@NonNull ViewGroup viewGroup, @Nullable C0358z c0358z, @Nullable C0358z c0358z2) {
        C0323b b = m10892b(c0358z, c0358z2);
        if (!b.f1123a || (b.f1127e == null && b.f1128f == null)) {
            return null;
        }
        if (b.f1124b) {
            return m10894a(viewGroup, c0358z, b.f1125c, c0358z2, b.f1126d);
        }
        return m10901b(viewGroup, c0358z, b.f1125c, c0358z2, b.f1126d);
    }

    /* renamed from: a */
    public Animator m10894a(ViewGroup viewGroup, C0358z c0358z, int i, C0358z c0358z2, int i2) {
        if ((this.f8867h & 1) == 1) {
            if (c0358z2 != null) {
                if (c0358z == null) {
                    View view = (View) c0358z2.f1197b.getParent();
                    if (m10892b(m1209b(view, false), m1193a(view, false)).f1123a != 0) {
                        return null;
                    }
                }
                return mo3015a(viewGroup, c0358z2.f1197b, c0358z, c0358z2);
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public android.animation.Animator m10901b(android.view.ViewGroup r7, android.support.transition.C0358z r8, int r9, android.support.transition.C0358z r10, int r11) {
        /*
        r6 = this;
        r9 = r6.f8867h;
        r0 = 2;
        r9 = r9 & r0;
        r1 = 0;
        if (r9 == r0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        if (r8 == 0) goto L_0x000d;
    L_0x000a:
        r9 = r8.f1197b;
        goto L_0x000e;
    L_0x000d:
        r9 = r1;
    L_0x000e:
        if (r10 == 0) goto L_0x0013;
    L_0x0010:
        r2 = r10.f1197b;
        goto L_0x0014;
    L_0x0013:
        r2 = r1;
    L_0x0014:
        r3 = 1;
        if (r2 == 0) goto L_0x0026;
    L_0x0017:
        r4 = r2.getParent();
        if (r4 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0026;
    L_0x001e:
        r4 = 4;
        if (r11 != r4) goto L_0x0022;
    L_0x0021:
        goto L_0x0024;
    L_0x0022:
        if (r9 != r2) goto L_0x0029;
    L_0x0024:
        r9 = r1;
        goto L_0x0073;
    L_0x0026:
        if (r2 == 0) goto L_0x002b;
    L_0x0028:
        r9 = r2;
    L_0x0029:
        r2 = r1;
        goto L_0x0073;
    L_0x002b:
        if (r9 == 0) goto L_0x0071;
    L_0x002d:
        r2 = r9.getParent();
        if (r2 != 0) goto L_0x0034;
    L_0x0033:
        goto L_0x0029;
    L_0x0034:
        r2 = r9.getParent();
        r2 = r2 instanceof android.view.View;
        if (r2 == 0) goto L_0x0071;
    L_0x003c:
        r2 = r9.getParent();
        r2 = (android.view.View) r2;
        r4 = r6.m1193a(r2, r3);
        r5 = r6.m1209b(r2, r3);
        r4 = r6.m10892b(r4, r5);
        r4 = r4.f1123a;
        if (r4 != 0) goto L_0x0057;
    L_0x0052:
        r9 = android.support.transition.C0357y.m1307a(r7, r9, r2);
        goto L_0x0029;
    L_0x0057:
        r4 = r2.getParent();
        if (r4 != 0) goto L_0x006f;
    L_0x005d:
        r2 = r2.getId();
        r4 = -1;
        if (r2 == r4) goto L_0x006f;
    L_0x0064:
        r2 = r7.findViewById(r2);
        if (r2 == 0) goto L_0x006f;
    L_0x006a:
        r2 = r6.e;
        if (r2 == 0) goto L_0x006f;
    L_0x006e:
        goto L_0x0029;
    L_0x006f:
        r9 = r1;
        goto L_0x0029;
    L_0x0071:
        r9 = r1;
        r2 = r9;
    L_0x0073:
        r4 = 0;
        if (r9 == 0) goto L_0x00bb;
    L_0x0076:
        if (r8 == 0) goto L_0x00bb;
    L_0x0078:
        r11 = r8.f1196a;
        r1 = "android:visibility:screenLocation";
        r11 = r11.get(r1);
        r11 = (int[]) r11;
        r1 = r11[r4];
        r11 = r11[r3];
        r0 = new int[r0];
        r7.getLocationOnScreen(r0);
        r2 = r0[r4];
        r1 = r1 - r2;
        r2 = r9.getLeft();
        r1 = r1 - r2;
        r9.offsetLeftAndRight(r1);
        r0 = r0[r3];
        r11 = r11 - r0;
        r0 = r9.getTop();
        r11 = r11 - r0;
        r9.offsetTopAndBottom(r11);
        r11 = android.support.transition.af.m1231a(r7);
        r11.mo3017a(r9);
        r7 = r6.mo3016b(r7, r9, r8, r10);
        if (r7 != 0) goto L_0x00b2;
    L_0x00ae:
        r11.mo3018b(r9);
        goto L_0x00ba;
    L_0x00b2:
        r8 = new android.support.transition.Visibility$1;
        r8.<init>(r6, r11, r9);
        r7.addListener(r8);
    L_0x00ba:
        return r7;
    L_0x00bb:
        if (r2 == 0) goto L_0x00dd;
    L_0x00bd:
        r9 = r2.getVisibility();
        android.support.transition.am.m1250a(r2, r4);
        r7 = r6.mo3016b(r7, r2, r8, r10);
        if (r7 == 0) goto L_0x00d9;
    L_0x00ca:
        r8 = new android.support.transition.Visibility$a;
        r8.<init>(r2, r11, r3);
        r7.addListener(r8);
        android.support.transition.C0324a.m1228a(r7, r8);
        r6.mo359a(r8);
        goto L_0x00dc;
    L_0x00d9:
        android.support.transition.am.m1250a(r2, r9);
    L_0x00dc:
        return r7;
    L_0x00dd:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Visibility.b(android.view.ViewGroup, android.support.transition.z, int, android.support.transition.z, int):android.animation.Animator");
    }

    /* renamed from: a */
    public boolean mo337a(C0358z c0358z, C0358z c0358z2) {
        boolean z = false;
        if (c0358z == null && c0358z2 == null) {
            return false;
        }
        if (c0358z != null && c0358z2 != null && c0358z2.f1196a.containsKey("android:visibility:visibility") != c0358z.f1196a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c0358z = m10892b(c0358z, c0358z2);
        if (c0358z.f1123a != null && (c0358z.f1125c == null || c0358z.f1126d == null)) {
            z = true;
        }
        return z;
    }
}
