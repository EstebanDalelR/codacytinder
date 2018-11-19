package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.support.annotation.NonNull;
import android.support.transition.Transition.TransitionListener;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.g */
public class C4009g extends Visibility {

    /* renamed from: android.support.transition.g$a */
    private static class C0343a extends AnimatorListenerAdapter {
        /* renamed from: a */
        private final View f1178a;
        /* renamed from: b */
        private boolean f1179b = false;

        C0343a(View view) {
            this.f1178a = view;
        }

        public void onAnimationStart(Animator animator) {
            if (ViewCompat.m2228t(this.f1178a) != null && this.f1178a.getLayerType() == null) {
                this.f1179b = true;
                this.f1178a.setLayerType(2, null);
            }
        }

        public void onAnimationEnd(Animator animator) {
            am.m1249a(this.f1178a, 1.0f);
            if (this.f1179b != null) {
                this.f1178a.setLayerType(0, null);
            }
        }
    }

    public C4009g(int i) {
        m10897a(i);
    }

    /* renamed from: a */
    public void mo336a(@NonNull C0358z c0358z) {
        super.mo336a(c0358z);
        c0358z.f1196a.put("android:fade:transitionAlpha", Float.valueOf(am.m1255c(c0358z.f1197b)));
    }

    /* renamed from: a */
    private Animator m15722a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        am.m1249a(view, f);
        f = ObjectAnimator.ofFloat(view, am.f1150a, new float[]{f2});
        f.addListener(new C0343a(view));
        mo359a((TransitionListener) new C2810u(this) {
            /* renamed from: b */
            final /* synthetic */ C4009g f12759b;

            public void onTransitionEnd(@NonNull Transition transition) {
                am.m1249a(view, 1.0f);
                am.m1257e(view);
                transition.mo364b((TransitionListener) this);
            }
        });
        return f;
    }

    /* renamed from: a */
    public Animator mo3015a(ViewGroup viewGroup, View view, C0358z c0358z, C0358z c0358z2) {
        viewGroup = null;
        c0358z = C4009g.m15721a(c0358z, 0.0f);
        if (c0358z != 1065353216) {
            viewGroup = c0358z;
        }
        return m15722a(view, viewGroup, 1.0f);
    }

    /* renamed from: b */
    public Animator mo3016b(ViewGroup viewGroup, View view, C0358z c0358z, C0358z c0358z2) {
        am.m1256d(view);
        return m15722a(view, C4009g.m15721a(c0358z, 1.0f), null);
    }

    /* renamed from: a */
    private static float m15721a(C0358z c0358z, float f) {
        if (c0358z == null) {
            return f;
        }
        Float f2 = (Float) c0358z.f1196a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }
}
