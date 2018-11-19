package com.tinder.superlikeable.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.superlikeable.p422b.C15136b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\\\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¨\u0006\u0012"}, d2 = {"prepareForFullScreenAnimation", "", "Landroid/animation/ValueAnimator;", "duration", "", "interpolator", "Landroid/animation/TimeInterpolator;", "logoStartScale", "", "logoEndScale", "logoView", "Lcom/airbnb/lottie/LottieAnimationView;", "backgroundCardStartScaleX", "backgroundCardStartScaleY", "backgroundCardEndScaleX", "backgroundCardEndScaleY", "backgroundCardView", "Landroid/view/View;", "superlikeable_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.g */
public final class C15128g {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/superlikeable/animation/ValueAnimatorScaleBackgroundToFullScreenExtKt$prepareForFullScreenAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/airbnb/lottie/LottieAnimationView;FLandroid/view/View;FFFFF)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.g$a */
    public static final class C15126a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ LottieAnimationView f47076a;
        /* renamed from: b */
        final /* synthetic */ float f47077b;
        /* renamed from: c */
        final /* synthetic */ View f47078c;
        /* renamed from: d */
        final /* synthetic */ float f47079d;
        /* renamed from: e */
        final /* synthetic */ float f47080e;
        /* renamed from: f */
        final /* synthetic */ float f47081f;
        /* renamed from: g */
        final /* synthetic */ float f47082g;
        /* renamed from: h */
        final /* synthetic */ float f47083h;

        C15126a(LottieAnimationView lottieAnimationView, float f, View view, float f2, float f3, float f4, float f5, float f6) {
            this.f47076a = lottieAnimationView;
            this.f47077b = f;
            this.f47078c = view;
            this.f47079d = f2;
            this.f47080e = f3;
            this.f47081f = f4;
            this.f47082g = f5;
            this.f47083h = f6;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f47076a.setScaleX(this.f47077b);
            this.f47076a.setScaleY(this.f47077b);
            this.f47078c.setScaleX(this.f47079d);
            this.f47078c.setScaleY(this.f47080e);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f47076a.setScaleX(this.f47081f);
            this.f47076a.setScaleY(this.f47081f);
            this.f47078c.setScaleX(this.f47082g);
            this.f47078c.setScaleY(this.f47083h);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.g$b */
    static final class C15127b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ float f47084a;
        /* renamed from: b */
        final /* synthetic */ float f47085b;
        /* renamed from: c */
        final /* synthetic */ LottieAnimationView f47086c;
        /* renamed from: d */
        final /* synthetic */ float f47087d;
        /* renamed from: e */
        final /* synthetic */ float f47088e;
        /* renamed from: f */
        final /* synthetic */ float f47089f;
        /* renamed from: g */
        final /* synthetic */ float f47090g;
        /* renamed from: h */
        final /* synthetic */ View f47091h;

        C15127b(float f, float f2, LottieAnimationView lottieAnimationView, float f3, float f4, float f5, float f6, View view) {
            this.f47084a = f;
            this.f47085b = f2;
            this.f47086c = lottieAnimationView;
            this.f47087d = f3;
            this.f47088e = f4;
            this.f47089f = f5;
            this.f47090g = f6;
            this.f47091h = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            valueAnimator = valueAnimator.getAnimatedFraction();
            float f = this.f47084a + ((this.f47085b - this.f47084a) * valueAnimator);
            this.f47086c.setScaleX(f);
            this.f47086c.setScaleY(f);
            float f2 = this.f47089f + ((this.f47090g - this.f47089f) * valueAnimator);
            this.f47091h.setScaleX(this.f47087d + ((this.f47088e - this.f47087d) * valueAnimator));
            this.f47091h.setScaleY(f2);
        }
    }

    /* renamed from: a */
    public static final void m56957a(@NotNull ValueAnimator valueAnimator, long j, @NotNull TimeInterpolator timeInterpolator, float f, float f2, @NotNull LottieAnimationView lottieAnimationView, float f3, float f4, float f5, float f6, @NotNull View view) {
        ValueAnimator valueAnimator2 = valueAnimator;
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        C2668g.b(valueAnimator2, "$receiver");
        C2668g.b(timeInterpolator2, "interpolator");
        LottieAnimationView lottieAnimationView2 = lottieAnimationView;
        C2668g.b(lottieAnimationView2, "logoView");
        View view2 = view;
        C2668g.b(view2, "backgroundCardView");
        C15136b.m56961a(valueAnimator2);
        valueAnimator2.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setDuration(j);
        valueAnimator2.setInterpolator(timeInterpolator2);
        float f7 = f3;
        valueAnimator2.addListener(new C15126a(lottieAnimationView2, f, view2, f7, f4, f2, f5, f6));
        valueAnimator2.addUpdateListener(new C15127b(f, f2, lottieAnimationView2, f7, f5, f4, f6, view2));
    }
}
