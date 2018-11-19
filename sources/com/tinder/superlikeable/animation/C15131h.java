package com.tinder.superlikeable.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.superlikeable.p422b.C15136b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aD\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0000¨\u0006\u000e"}, d2 = {"prepareForLogoMoveUpAnimation", "", "Landroid/animation/ValueAnimator;", "duration", "", "interpolator", "Landroid/animation/TimeInterpolator;", "logoStartScale", "", "logoEndScale", "logoStartTranslationY", "logoEndTranslationY", "logoView", "Lcom/airbnb/lottie/LottieAnimationView;", "superlikeable_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.h */
public final class C15131h {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/superlikeable/animation/ValueAnimatorSuperLikeableLogoExtKt$prepareForLogoMoveUpAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/airbnb/lottie/LottieAnimationView;FFFF)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.h$a */
    public static final class C15129a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ LottieAnimationView f47092a;
        /* renamed from: b */
        final /* synthetic */ float f47093b;
        /* renamed from: c */
        final /* synthetic */ float f47094c;
        /* renamed from: d */
        final /* synthetic */ float f47095d;
        /* renamed from: e */
        final /* synthetic */ float f47096e;

        C15129a(LottieAnimationView lottieAnimationView, float f, float f2, float f3, float f4) {
            this.f47092a = lottieAnimationView;
            this.f47093b = f;
            this.f47094c = f2;
            this.f47095d = f3;
            this.f47096e = f4;
        }

        public void onAnimationStart(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f47092a.setScaleX(this.f47093b);
            this.f47092a.setScaleY(this.f47093b);
            this.f47092a.setTranslationY(this.f47094c);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f47092a.setScaleX(this.f47095d);
            this.f47092a.setScaleY(this.f47095d);
            this.f47092a.setTranslationY(this.f47096e);
            this.f47092a.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.h$b */
    static final class C15130b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ float f47097a;
        /* renamed from: b */
        final /* synthetic */ float f47098b;
        /* renamed from: c */
        final /* synthetic */ LottieAnimationView f47099c;
        /* renamed from: d */
        final /* synthetic */ float f47100d;
        /* renamed from: e */
        final /* synthetic */ float f47101e;

        C15130b(float f, float f2, LottieAnimationView lottieAnimationView, float f3, float f4) {
            this.f47097a = f;
            this.f47098b = f2;
            this.f47099c = lottieAnimationView;
            this.f47100d = f3;
            this.f47101e = f4;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedFraction();
            float f = this.f47097a + ((this.f47098b - this.f47097a) * valueAnimator);
            this.f47099c.setScaleX(f);
            this.f47099c.setScaleY(f);
            this.f47099c.setTranslationY(this.f47100d + ((this.f47101e - this.f47100d) * valueAnimator));
        }
    }

    /* renamed from: a */
    public static final void m56958a(@NotNull ValueAnimator valueAnimator, long j, @NotNull TimeInterpolator timeInterpolator, float f, float f2, float f3, float f4, @NotNull LottieAnimationView lottieAnimationView) {
        C2668g.b(valueAnimator, "$receiver");
        C2668g.b(timeInterpolator, "interpolator");
        C2668g.b(lottieAnimationView, "logoView");
        C15136b.m56961a(valueAnimator);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setDuration(j);
        valueAnimator.setInterpolator(timeInterpolator);
        float f5 = f3;
        valueAnimator.addListener(new C15129a(lottieAnimationView, f, f5, f2, f4));
        valueAnimator.addUpdateListener(new C15130b(f, f2, lottieAnimationView, f5, f4));
    }
}
