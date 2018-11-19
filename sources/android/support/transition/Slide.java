package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Slide extends Visibility {
    /* renamed from: g */
    private static final TimeInterpolator f12743g = new DecelerateInterpolator();
    /* renamed from: h */
    private static final TimeInterpolator f12744h = new AccelerateInterpolator();
    /* renamed from: j */
    private static final C0317a f12745j = new C40011();
    /* renamed from: k */
    private static final C0317a f12746k = new C40022();
    /* renamed from: l */
    private static final C0317a f12747l = new C40033();
    /* renamed from: m */
    private static final C0317a f12748m = new C40044();
    /* renamed from: n */
    private static final C0317a f12749n = new C40055();
    /* renamed from: o */
    private static final C0317a f12750o = new C40066();
    /* renamed from: i */
    private C0317a f12751i;

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    /* renamed from: android.support.transition.Slide$a */
    private interface C0317a {
        /* renamed from: a */
        float mo331a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo330b(ViewGroup viewGroup, View view);
    }

    /* renamed from: android.support.transition.Slide$b */
    private static abstract class C2799b implements C0317a {
        private C2799b() {
        }

        /* renamed from: b */
        public float mo330b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: android.support.transition.Slide$c */
    private static abstract class C2800c implements C0317a {
        private C2800c() {
        }

        /* renamed from: a */
        public float mo331a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    /* renamed from: android.support.transition.Slide$1 */
    static class C40011 extends C2799b {
        C40011() {
            super();
        }

        /* renamed from: a */
        public float mo331a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$2 */
    static class C40022 extends C2799b {
        C40022() {
            super();
        }

        /* renamed from: a */
        public float mo331a(ViewGroup viewGroup, View view) {
            Object obj = 1;
            if (ViewCompat.m2208f(viewGroup) != 1) {
                obj = null;
            }
            if (obj != null) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$3 */
    static class C40033 extends C2800c {
        C40033() {
            super();
        }

        /* renamed from: b */
        public float mo330b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: android.support.transition.Slide$4 */
    static class C40044 extends C2799b {
        C40044() {
            super();
        }

        /* renamed from: a */
        public float mo331a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$5 */
    static class C40055 extends C2799b {
        C40055() {
            super();
        }

        /* renamed from: a */
        public float mo331a(ViewGroup viewGroup, View view) {
            Object obj = 1;
            if (ViewCompat.m2208f(viewGroup) != 1) {
                obj = null;
            }
            if (obj != null) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$6 */
    static class C40066 extends C2800c {
        C40066() {
            super();
        }

        /* renamed from: b */
        public float mo330b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: d */
    private void m15703d(C0358z c0358z) {
        Object obj = new int[2];
        c0358z.f1197b.getLocationOnScreen(obj);
        c0358z.f1196a.put("android:slide:screenPosition", obj);
    }

    /* renamed from: a */
    public void mo336a(@NonNull C0358z c0358z) {
        super.mo336a(c0358z);
        m15703d(c0358z);
    }

    /* renamed from: b */
    public void mo339b(@NonNull C0358z c0358z) {
        super.mo339b(c0358z);
        m15703d(c0358z);
    }

    /* renamed from: a */
    public Animator mo3015a(ViewGroup viewGroup, View view, C0358z c0358z, C0358z c0358z2) {
        if (c0358z2 == null) {
            return null;
        }
        int[] iArr = (int[]) c0358z2.f1196a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return ab.m1230a(view, c0358z2, iArr[null], iArr[1], this.f12751i.mo331a(viewGroup, view), this.f12751i.mo330b(viewGroup, view), translationX, translationY, f12743g);
    }

    /* renamed from: b */
    public Animator mo3016b(ViewGroup viewGroup, View view, C0358z c0358z, C0358z c0358z2) {
        if (c0358z == null) {
            return null;
        }
        int[] iArr = (int[]) c0358z.f1196a.get("android:slide:screenPosition");
        return ab.m1230a(view, c0358z, iArr[null], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f12751i.mo331a(viewGroup, view), this.f12751i.mo330b(viewGroup, view), f12744h);
    }
}
