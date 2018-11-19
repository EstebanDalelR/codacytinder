package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;

/* renamed from: android.support.transition.a */
class C0324a {
    /* renamed from: a */
    private static final C0332d f1129a;

    static {
        if (VERSION.SDK_INT >= 19) {
            f1129a = new C2804c();
        } else {
            f1129a = new C2803b();
        }
    }

    /* renamed from: a */
    static void m1228a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        f1129a.mo354a(animator, animatorListenerAdapter);
    }

    /* renamed from: a */
    static void m1227a(@NonNull Animator animator) {
        f1129a.mo353a(animator);
    }

    /* renamed from: b */
    static void m1229b(@NonNull Animator animator) {
        f1129a.mo355b(animator);
    }
}
