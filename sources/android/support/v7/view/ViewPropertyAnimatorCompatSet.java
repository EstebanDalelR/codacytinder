package android.support.v7.view;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.view.C0609n;
import android.support.v4.view.C2899o;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ViewPropertyAnimatorCompatSet {
    final ArrayList<C0609n> mAnimators = new ArrayList();
    private long mDuration = -1;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    ViewPropertyAnimatorListener mListener;
    private final C2899o mProxyListener = new C40451();

    /* renamed from: android.support.v7.view.ViewPropertyAnimatorCompatSet$1 */
    class C40451 extends C2899o {
        private int mProxyEndCount = 0;
        private boolean mProxyStarted = false;

        C40451() {
        }

        public void onAnimationStart(View view) {
            if (this.mProxyStarted == null) {
                this.mProxyStarted = true;
                if (ViewPropertyAnimatorCompatSet.this.mListener != null) {
                    ViewPropertyAnimatorCompatSet.this.mListener.onAnimationStart(null);
                }
            }
        }

        void onEnd() {
            this.mProxyEndCount = 0;
            this.mProxyStarted = false;
            ViewPropertyAnimatorCompatSet.this.onAnimationsEnded();
        }

        public void onAnimationEnd(View view) {
            view = this.mProxyEndCount + 1;
            this.mProxyEndCount = view;
            if (view == ViewPropertyAnimatorCompatSet.this.mAnimators.size()) {
                if (ViewPropertyAnimatorCompatSet.this.mListener != null) {
                    ViewPropertyAnimatorCompatSet.this.mListener.onAnimationEnd(null);
                }
                onEnd();
            }
        }
    }

    public ViewPropertyAnimatorCompatSet play(C0609n c0609n) {
        if (!this.mIsStarted) {
            this.mAnimators.add(c0609n);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(C0609n c0609n, C0609n c0609n2) {
        this.mAnimators.add(c0609n);
        c0609n2.m2383b(c0609n.m2376a());
        this.mAnimators.add(c0609n2);
        return this;
    }

    public void start() {
        if (!this.mIsStarted) {
            Iterator it = this.mAnimators.iterator();
            while (it.hasNext()) {
                C0609n c0609n = (C0609n) it.next();
                if (this.mDuration >= 0) {
                    c0609n.m2378a(this.mDuration);
                }
                if (this.mInterpolator != null) {
                    c0609n.m2381a(this.mInterpolator);
                }
                if (this.mListener != null) {
                    c0609n.m2379a(this.mProxyListener);
                }
                c0609n.m2385c();
            }
            this.mIsStarted = true;
        }
    }

    void onAnimationsEnded() {
        this.mIsStarted = false;
    }

    public void cancel() {
        if (this.mIsStarted) {
            Iterator it = this.mAnimators.iterator();
            while (it.hasNext()) {
                ((C0609n) it.next()).m2384b();
            }
            this.mIsStarted = false;
        }
    }

    public ViewPropertyAnimatorCompatSet setDuration(long j) {
        if (!this.mIsStarted) {
            this.mDuration = j;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator) {
        if (!this.mIsStarted) {
            this.mInterpolator = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.mIsStarted) {
            this.mListener = viewPropertyAnimatorListener;
        }
        return this;
    }
}
