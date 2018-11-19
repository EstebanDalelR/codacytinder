package com.airbnb.lottie.p017b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.annotation.FloatRange;

/* renamed from: com.airbnb.lottie.b.c */
public class C0781c extends ValueAnimator {
    /* renamed from: a */
    private boolean f2119a = false;
    /* renamed from: b */
    private boolean f2120b = false;
    /* renamed from: c */
    private float f2121c = 0.0f;
    /* renamed from: d */
    private float f2122d = 1.0f;
    /* renamed from: e */
    private long f2123e;
    /* renamed from: f */
    private float f2124f = 0.0f;

    /* renamed from: com.airbnb.lottie.b.c$1 */
    class C07791 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C0781c f2117a;

        C07791(C0781c c0781c) {
            this.f2117a = c0781c;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2117a.m2749a(this.f2117a.f2121c, this.f2117a.f2122d);
        }

        public void onAnimationCancel(Animator animator) {
            this.f2117a.m2749a(this.f2117a.f2121c, this.f2117a.f2122d);
        }
    }

    /* renamed from: com.airbnb.lottie.b.c$2 */
    class C07802 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C0781c f2118a;

        C07802(C0781c c0781c) {
            this.f2118a = c0781c;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f2118a.f2119a) {
                this.f2118a.f2124f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        }
    }

    public C0781c() {
        setFloatValues(new float[]{0.0f, 1.0f});
        addListener(new C07791(this));
        addUpdateListener(new C07802(this));
    }

    public void start() {
        if (this.f2119a) {
            m2748a(m2755d());
            end();
            return;
        }
        super.start();
    }

    /* renamed from: a */
    public void m2747a() {
        this.f2119a = true;
    }

    public ValueAnimator setDuration(long j) {
        this.f2123e = j;
        m2749a(this.f2121c, this.f2122d);
        return this;
    }

    /* renamed from: a */
    public void m2748a(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.f2124f != f) {
            m2746d(f);
        }
    }

    /* renamed from: b */
    public void m2751b() {
        m2746d(m2753c());
    }

    /* renamed from: d */
    private void m2746d(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (f < this.f2121c) {
            f = this.f2121c;
        } else if (f > this.f2122d) {
            f = this.f2122d;
        }
        this.f2124f = f;
        if (getDuration() > 0) {
            setCurrentPlayTime((long) (((float) getDuration()) * ((f - this.f2121c) / (this.f2122d - this.f2121c))));
        }
    }

    /* renamed from: c */
    public float m2753c() {
        return this.f2124f;
    }

    /* renamed from: a */
    public void m2750a(boolean z) {
        this.f2120b = z;
        m2749a(this.f2121c, this.f2122d);
    }

    /* renamed from: b */
    public void m2752b(float f) {
        this.f2121c = f;
        m2749a(f, this.f2122d);
    }

    /* renamed from: c */
    public void m2754c(float f) {
        this.f2122d = f;
        m2749a(this.f2121c, f);
    }

    /* renamed from: d */
    public float m2755d() {
        return this.f2122d;
    }

    /* renamed from: e */
    public void m2756e() {
        float f = this.f2124f;
        start();
        m2748a(f);
    }

    /* renamed from: a */
    public void m2749a(float f, float f2) {
        float min = Math.min(f, f2);
        f = Math.max(f, f2);
        f2 = new float[2];
        f2[0] = this.f2120b ? f : min;
        f2[1] = this.f2120b ? min : f;
        setFloatValues(f2);
        super.setDuration((long) (((float) this.f2123e) * (f - min)));
        m2748a(m2753c());
    }
}
