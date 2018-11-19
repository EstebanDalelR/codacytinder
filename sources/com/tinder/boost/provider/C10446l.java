package com.tinder.boost.provider;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.animation.Interpolator;
import com.tinder.boost.view.BoostEmitterView.PointProvider;
import com.tinder.boost.view.BoostEmitterView.PointProvider.Signage;

/* renamed from: com.tinder.boost.provider.l */
public abstract class C10446l implements AnimatorUpdateListener, PointProvider {
    /* renamed from: a */
    private final int f34033a;
    /* renamed from: b */
    private final ValueAnimator f34034b = ValueAnimator.ofInt(new int[]{0, 180});
    /* renamed from: c */
    private final int f34035c;
    /* renamed from: d */
    private int f34036d;
    /* renamed from: e */
    private int f34037e;
    /* renamed from: f */
    private Signage f34038f;

    protected C10446l(Signage signage, Interpolator interpolator, int i, int i2, int i3) {
        this.f34033a = i;
        this.f34034b.addUpdateListener(this);
        this.f34038f = signage;
        this.f34034b.setDuration((long) i2);
        this.f34034b.setInterpolator(interpolator);
        this.f34035c = i3;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = ((float) this.f34037e) - (((float) (this.f34037e - this.f34035c)) * animatedFraction);
        double sin = ((double) ((((float) this.f34033a) * animatedFraction) * 1.5f)) * Math.sin((Math.toRadians((double) ((Integer) valueAnimator.getAnimatedValue()).intValue()) * ((double) animatedFraction)) * 1.5d);
        onNextPointCalculated((float) (((double) this.f34036d) + (((double) this.f34038f.getMultiplier()) * sin)), f, animatedFraction);
        onMagnitudeChange(sin);
    }

    public void startAt(int i, int i2) {
        this.f34036d = i;
        this.f34037e = i2;
        this.f34034b.start();
    }
}
