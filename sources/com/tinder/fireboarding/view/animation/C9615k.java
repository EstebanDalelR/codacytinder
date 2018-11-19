package com.tinder.fireboarding.view.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.tinder.base.p170a.p171a.C8299a;
import com.tinder.fireboarding.view.animation.p255a.C9576a;
import com.tinder.fireboarding.view.animation.p255a.C9576a.C9575a;
import com.tinder.fireboarding.view.animation.p255a.C9577b;
import com.tinder.fireboarding.view.animation.p255a.C9578c;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tinder.com.tooltip.C19478g;
import tinder.com.tooltip.TooltipView;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/fireboarding/view/animation/TooltipDisappearingAnimator;", "", "()V", "animator", "Landroid/animation/ValueAnimator;", "createTooltipDisappearingInterpolator", "Lcom/tinder/fireboarding/view/animation/interpolator/TooltipDisappearanceSpringInterpolator;", "end", "", "start", "view", "Ltinder/com/tooltip/TooltipView;", "onAnimationEnd", "Lkotlin/Function0;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.k */
public final class C9615k {
    /* renamed from: a */
    private final ValueAnimator f32128a = new ValueAnimator();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/fireboarding/view/animation/TooltipDisappearingAnimator$start$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.k$a */
    static final class C9613a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ float f32118a;
        /* renamed from: b */
        final /* synthetic */ float f32119b;
        /* renamed from: c */
        final /* synthetic */ C9615k f32120c;
        /* renamed from: d */
        final /* synthetic */ TooltipView f32121d;
        /* renamed from: e */
        final /* synthetic */ Function0 f32122e;

        C9613a(float f, float f2, C9615k c9615k, TooltipView tooltipView, Function0 function0) {
            this.f32118a = f;
            this.f32119b = f2;
            this.f32120c = c9615k;
            this.f32121d = tooltipView;
            this.f32122e = function0;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f = this.f32118a;
            C2668g.a(valueAnimator, "it");
            C19478g.a((View) this.f32121d, f + (valueAnimator.getAnimatedFraction() * this.f32119b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fireboarding/view/animation/TooltipDisappearingAnimator$start$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/TooltipDisappearingAnimator$start$1;Landroid/animation/ValueAnimator;F)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.k$b */
    public static final class C9614b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f32123a;
        /* renamed from: b */
        final /* synthetic */ float f32124b;
        /* renamed from: c */
        final /* synthetic */ C9615k f32125c;
        /* renamed from: d */
        final /* synthetic */ TooltipView f32126d;
        /* renamed from: e */
        final /* synthetic */ Function0 f32127e;

        C9614b(ValueAnimator valueAnimator, float f, C9615k c9615k, TooltipView tooltipView, Function0 function0) {
            this.f32123a = valueAnimator;
            this.f32124b = f;
            this.f32125c = c9615k;
            this.f32126d = tooltipView;
            this.f32127e = function0;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32123a.removeListener(this);
            C19478g.a((View) this.f32126d, this.f32124b);
            this.f32127e.invoke();
        }
    }

    /* renamed from: a */
    public final void m40010a(@NotNull TooltipView tooltipView, @NotNull Function0<C15813i> function0) {
        C2668g.b(tooltipView, "view");
        C2668g.b(function0, "onAnimationEnd");
        ValueAnimator valueAnimator = this.f32128a;
        C8299a.m35391a(valueAnimator);
        valueAnimator.setDuration(500);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        C19478g.a(tooltipView, 1.0f);
        valueAnimator.addUpdateListener(new C9613a(1.0f, -1.0f, this, tooltipView, function0));
        valueAnimator.addListener(new C9614b(valueAnimator, 0.0f, this, tooltipView, function0));
        valueAnimator.setInterpolator(m40008b());
        valueAnimator.start();
    }

    /* renamed from: a */
    public final void m40009a() {
        C8299a.m35391a(this.f32128a);
    }

    /* renamed from: b */
    private final C9578c m40008b() {
        return new C9578c(new C9577b(new Pair(new C9576a(new C9575a(0.22d, 11.06d)), new C9576a(new C9575a(0.08d, 0.25d)))));
    }
}
