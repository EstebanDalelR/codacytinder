package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: android.support.transition.c */
class C2804c implements C0332d {
    C2804c() {
    }

    /* renamed from: a */
    public void mo354a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: a */
    public void mo353a(@NonNull Animator animator) {
        animator.pause();
    }

    /* renamed from: b */
    public void mo355b(@NonNull Animator animator) {
        animator.resume();
    }
}
