package com.tinder.fireboarding.view.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.tinder.base.p170a.p171a.C8299a;
import com.tinder.fireboarding.view.BackgroundScalingView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/fireboarding/view/animation/FeatureStagingAnimatorFactory;", "", "()V", "animator", "Landroid/animation/ValueAnimator;", "rotationUpdateCalculator", "Lcom/tinder/fireboarding/view/animation/FractionUpdateCalculator;", "create", "backgroundScalingView", "Lcom/tinder/fireboarding/view/BackgroundScalingView;", "updateRayRotation", "", "fraction", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.d */
public final class C9595d {
    /* renamed from: a */
    private final ValueAnimator f32070a = new ValueAnimator();
    /* renamed from: b */
    private final C9604g f32071b = new C9604g(0.0f, 100.0f, 0.0f, 4, null);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/fireboarding/view/animation/FeatureStagingAnimatorFactory$create$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.d$a */
    static final class C9593a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C9595d f32066a;
        /* renamed from: b */
        final /* synthetic */ BackgroundScalingView f32067b;

        C9593a(C9595d c9595d, BackgroundScalingView backgroundScalingView) {
            this.f32066a = c9595d;
            this.f32067b = backgroundScalingView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "animation");
            this.f32066a.m39954a(valueAnimator.getAnimatedFraction(), this.f32067b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fireboarding/view/animation/FeatureStagingAnimatorFactory$create$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/FeatureStagingAnimatorFactory$create$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.d$b */
    public static final class C9594b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C9595d f32068a;
        /* renamed from: b */
        final /* synthetic */ BackgroundScalingView f32069b;

        C9594b(C9595d c9595d, BackgroundScalingView backgroundScalingView) {
            this.f32068a = c9595d;
            this.f32069b = backgroundScalingView;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            super.onAnimationEnd(animator);
            this.f32068a.m39954a(1.0f, this.f32069b);
        }
    }

    @NotNull
    /* renamed from: a */
    public final ValueAnimator m39956a(@NotNull BackgroundScalingView backgroundScalingView) {
        C2668g.b(backgroundScalingView, "backgroundScalingView");
        ValueAnimator valueAnimator = this.f32070a;
        C8299a.m35391a(valueAnimator);
        valueAnimator.setDuration(1000);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.addUpdateListener(new C9593a(this, backgroundScalingView));
        valueAnimator.addListener(new C9594b(this, backgroundScalingView));
        return valueAnimator;
    }

    /* renamed from: a */
    private final void m39954a(float f, BackgroundScalingView backgroundScalingView) {
        backgroundScalingView.setRotationDegreesRays(this.f32071b.m39970a(f));
    }
}
