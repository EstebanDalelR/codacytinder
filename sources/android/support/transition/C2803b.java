package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import java.util.ArrayList;

@RequiresApi(14)
/* renamed from: android.support.transition.b */
class C2803b implements C0332d {

    /* renamed from: android.support.transition.b$a */
    interface C0331a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    public void mo354a(@NonNull Animator animator, @NonNull AnimatorListenerAdapter animatorListenerAdapter) {
    }

    C2803b() {
    }

    /* renamed from: a */
    public void mo353a(@NonNull Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0331a) {
                    ((C0331a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo355b(@NonNull Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0331a) {
                    ((C0331a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
