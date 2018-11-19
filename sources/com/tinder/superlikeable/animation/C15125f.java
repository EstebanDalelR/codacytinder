package com.tinder.superlikeable.animation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.tinder.superlikeable.p422b.C15136b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¨\u0006\r"}, d2 = {"prepareForCardAppearanceAnimation", "", "Landroid/animation/ValueAnimator;", "startDelay", "", "duration", "interpolator", "Landroid/view/animation/OvershootInterpolator;", "startScale", "", "endScale", "childView", "Landroid/view/View;", "superlikeable_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.superlikeable.animation.f */
public final class C15125f {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/superlikeable/animation/ValueAnimationCardAppearanceExtKt$prepareForCardAppearanceAnimation$1", "Landroid/animation/AnimatorListenerAdapter;", "(Landroid/view/View;FF)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.f$a */
    public static final class C15123a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ View f47069a;
        /* renamed from: b */
        final /* synthetic */ float f47070b;
        /* renamed from: c */
        final /* synthetic */ float f47071c;

        C15123a(View view, float f, float f2) {
            this.f47069a = view;
            this.f47070b = f;
            this.f47071c = f2;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f47069a.setAlpha(0.0f);
            this.f47069a.setScaleX(this.f47070b);
            this.f47069a.setScaleY(this.f47070b);
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f47069a.setScaleX(this.f47071c);
            this.f47069a.setScaleY(this.f47071c);
            this.f47069a.setAlpha(1.0f);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.animation.f$b */
    static final class C15124b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ float f47072a;
        /* renamed from: b */
        final /* synthetic */ float f47073b;
        /* renamed from: c */
        final /* synthetic */ OvershootInterpolator f47074c;
        /* renamed from: d */
        final /* synthetic */ View f47075d;

        C15124b(float f, float f2, OvershootInterpolator overshootInterpolator, View view) {
            this.f47072a = f;
            this.f47073b = f2;
            this.f47074c = overshootInterpolator;
            this.f47075d = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "animator");
            valueAnimator = valueAnimator.getAnimatedFraction();
            float interpolation = this.f47072a + ((this.f47073b - this.f47072a) * this.f47074c.getInterpolation(valueAnimator));
            this.f47075d.setAlpha(valueAnimator);
            this.f47075d.setScaleX(interpolation);
            this.f47075d.setScaleY(interpolation);
        }
    }

    /* renamed from: a */
    public static final void m56956a(@NotNull ValueAnimator valueAnimator, long j, long j2, @NotNull OvershootInterpolator overshootInterpolator, float f, float f2, @NotNull View view) {
        C2668g.b(valueAnimator, "$receiver");
        C2668g.b(overshootInterpolator, "interpolator");
        C2668g.b(view, "childView");
        C15136b.m56961a(valueAnimator);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setStartDelay(j);
        valueAnimator.setDuration(j2);
        valueAnimator.addListener((AnimatorListener) new C15123a(view, f, f2));
        valueAnimator.addUpdateListener((AnimatorUpdateListener) new C15124b(f, f2, overshootInterpolator, view));
    }
}
