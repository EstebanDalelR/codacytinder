package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.l */
final class C0246l {
    /* renamed from: a */
    ValueAnimator f890a = null;
    /* renamed from: b */
    private final ArrayList<C0245a> f891b = new ArrayList();
    /* renamed from: c */
    private C0245a f892c = null;
    /* renamed from: d */
    private final AnimatorListener f893d = new C02441(this);

    /* renamed from: android.support.design.widget.l$1 */
    class C02441 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C0246l f887a;

        C02441(C0246l c0246l) {
            this.f887a = c0246l;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f887a.f890a == animator) {
                this.f887a.f890a = null;
            }
        }
    }

    /* renamed from: android.support.design.widget.l$a */
    static class C0245a {
        /* renamed from: a */
        final int[] f888a;
        /* renamed from: b */
        final ValueAnimator f889b;

        C0245a(int[] iArr, ValueAnimator valueAnimator) {
            this.f888a = iArr;
            this.f889b = valueAnimator;
        }
    }

    C0246l() {
    }

    /* renamed from: a */
    public void m916a(int[] iArr, ValueAnimator valueAnimator) {
        C0245a c0245a = new C0245a(iArr, valueAnimator);
        valueAnimator.addListener(this.f893d);
        this.f891b.add(c0245a);
    }

    /* renamed from: a */
    void m915a(int[] iArr) {
        C0245a c0245a;
        int size = this.f891b.size();
        for (int i = 0; i < size; i++) {
            c0245a = (C0245a) this.f891b.get(i);
            if (StateSet.stateSetMatches(c0245a.f888a, iArr)) {
                break;
            }
        }
        c0245a = null;
        if (c0245a != this.f892c) {
            if (this.f892c != null) {
                m913b();
            }
            this.f892c = c0245a;
            if (c0245a != null) {
                m912a(c0245a);
            }
        }
    }

    /* renamed from: a */
    private void m912a(C0245a c0245a) {
        this.f890a = c0245a.f889b;
        this.f890a.start();
    }

    /* renamed from: b */
    private void m913b() {
        if (this.f890a != null) {
            this.f890a.cancel();
            this.f890a = null;
        }
    }

    /* renamed from: a */
    public void m914a() {
        if (this.f890a != null) {
            this.f890a.end();
            this.f890a = null;
        }
    }
}
