package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.n */
public final class C0609n {
    /* renamed from: a */
    Runnable f1813a = null;
    /* renamed from: b */
    Runnable f1814b = null;
    /* renamed from: c */
    int f1815c = -1;
    /* renamed from: d */
    private WeakReference<View> f1816d;

    /* renamed from: android.support.v4.view.n$a */
    static class C2898a implements ViewPropertyAnimatorListener {
        /* renamed from: a */
        C0609n f9136a;
        /* renamed from: b */
        boolean f9137b;

        C2898a(C0609n c0609n) {
            this.f9136a = c0609n;
        }

        public void onAnimationStart(View view) {
            this.f9137b = false;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = null;
            if (this.f9136a.f1815c > -1) {
                view.setLayerType(2, null);
            }
            if (this.f9136a.f1813a != null) {
                Runnable runnable = this.f9136a.f1813a;
                this.f9136a.f1813a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof ViewPropertyAnimatorListener) {
                viewPropertyAnimatorListener = (ViewPropertyAnimatorListener) tag;
            }
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationStart(view);
            }
        }

        public void onAnimationEnd(View view) {
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = null;
            if (this.f9136a.f1815c > -1) {
                view.setLayerType(this.f9136a.f1815c, null);
                this.f9136a.f1815c = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f9137b) {
                if (this.f9136a.f1814b != null) {
                    Runnable runnable = this.f9136a.f1814b;
                    this.f9136a.f1814b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof ViewPropertyAnimatorListener) {
                    viewPropertyAnimatorListener = (ViewPropertyAnimatorListener) tag;
                }
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }
                this.f9137b = true;
            }
        }

        public void onAnimationCancel(View view) {
            Object tag = view.getTag(2113929216);
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = tag instanceof ViewPropertyAnimatorListener ? (ViewPropertyAnimatorListener) tag : null;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.onAnimationCancel(view);
            }
        }
    }

    C0609n(View view) {
        this.f1816d = new WeakReference(view);
    }

    /* renamed from: a */
    public C0609n m2378a(long j) {
        View view = (View) this.f1816d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0609n m2377a(float f) {
        View view = (View) this.f1816d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0609n m2382b(float f) {
        View view = (View) this.f1816d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: a */
    public long m2376a() {
        View view = (View) this.f1816d.get();
        return view != null ? view.animate().getDuration() : 0;
    }

    /* renamed from: a */
    public C0609n m2381a(Interpolator interpolator) {
        View view = (View) this.f1816d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0609n m2383b(long j) {
        View view = (View) this.f1816d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public void m2384b() {
        View view = (View) this.f1816d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public void m2385c() {
        View view = (View) this.f1816d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public C0609n m2379a(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = (View) this.f1816d.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m2375a(view, viewPropertyAnimatorListener);
            } else {
                view.setTag(2113929216, viewPropertyAnimatorListener);
                m2375a(view, new C2898a(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m2375a(final View view, final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new AnimatorListenerAdapter(this) {
                /* renamed from: c */
                final /* synthetic */ C0609n f1809c;

                public void onAnimationCancel(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationCancel(view);
                }

                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationEnd(view);
                }

                public void onAnimationStart(Animator animator) {
                    viewPropertyAnimatorListener.onAnimationStart(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0609n m2380a(final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final View view = (View) this.f1816d.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            AnimatorUpdateListener animatorUpdateListener = null;
            if (viewPropertyAnimatorUpdateListener != null) {
                animatorUpdateListener = new AnimatorUpdateListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0609n f1812c;

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        viewPropertyAnimatorUpdateListener.onAnimationUpdate(view);
                    }
                };
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }
}
