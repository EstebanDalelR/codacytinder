package com.tinder.fireboarding.view.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.tinder.base.p170a.p171a.C8299a;
import com.tinder.base.p173c.C8304b;
import com.tinder.fireboarding.view.animation.p255a.C9576a;
import com.tinder.fireboarding.view.animation.p255a.C9576a.C9575a;
import com.tinder.fireboarding.view.animation.p255a.C9577b;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tinder.com.tooltip.C19478g;
import tinder.com.tooltip.TooltipView;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rJ&\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/fireboarding/view/animation/TooltipAppearingAnimator;", "", "()V", "animator", "Landroid/animation/ValueAnimator;", "createTooltipAppearingInterpolator", "Lcom/tinder/fireboarding/view/animation/interpolator/TooltipAppearanceSpringInterpolator;", "end", "", "start", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "onAnimationEnd", "Lkotlin/Function0;", "startAppearingAnimation", "view", "Landroid/view/View;", "tooltipOffsetX", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.j */
public final class C9612j {
    /* renamed from: a */
    private final ValueAnimator f32117a = new ValueAnimator();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/tinder/base/extension/ViewExtKt$doWhenViewHasSize$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onPreDraw", "", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.j$a */
    public static final class C9609a implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ View f32105a;
        /* renamed from: b */
        final /* synthetic */ C9612j f32106b;
        /* renamed from: c */
        final /* synthetic */ TooltipView f32107c;
        /* renamed from: d */
        final /* synthetic */ Function0 f32108d;

        public C9609a(View view, C9612j c9612j, TooltipView tooltipView, Function0 function0) {
            this.f32105a = view;
            this.f32106b = c9612j;
            this.f32107c = tooltipView;
            this.f32108d = function0;
        }

        public boolean onPreDraw() {
            if (!C8304b.m35397b(this.f32105a)) {
                return true;
            }
            this.f32105a.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = this.f32105a;
            this.f32106b.m40003a(this.f32107c, this.f32107c.getXOffset(), this.f32108d);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.j$b */
    static final class C9610b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ float f32109a;
        /* renamed from: b */
        final /* synthetic */ float f32110b;
        /* renamed from: c */
        final /* synthetic */ View f32111c;

        C9610b(float f, float f2, View view) {
            this.f32109a = f;
            this.f32110b = f2;
            this.f32111c = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2668g.a(valueAnimator, "it");
            C19478g.a(this.f32111c, this.f32109a + (valueAnimator.getAnimatedFraction() * this.f32110b));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/fireboarding/view/animation/TooltipAppearingAnimator$startAppearingAnimation$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/TooltipAppearingAnimator;Landroid/view/View;FFLkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.j$c */
    public static final class C9611c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C9612j f32112a;
        /* renamed from: b */
        final /* synthetic */ View f32113b;
        /* renamed from: c */
        final /* synthetic */ float f32114c;
        /* renamed from: d */
        final /* synthetic */ float f32115d;
        /* renamed from: e */
        final /* synthetic */ Function0 f32116e;

        C9611c(C9612j c9612j, View view, float f, float f2, Function0 function0) {
            this.f32112a = c9612j;
            this.f32113b = view;
            this.f32114c = f;
            this.f32115d = f2;
            this.f32116e = function0;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f32113b.setPivotX(((float) this.f32113b.getWidth()) - this.f32114c);
            this.f32113b.setPivotY((float) this.f32113b.getHeight());
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32112a.f32117a.removeListener(this);
            C19478g.a(this.f32113b, this.f32115d);
            this.f32116e.invoke();
        }
    }

    /* renamed from: a */
    public final void m40007a(@NotNull TooltipView tooltipView, @NotNull Function0<C15813i> function0) {
        C2668g.b(tooltipView, "tooltipView");
        C2668g.b(function0, "onAnimationEnd");
        View view = tooltipView;
        if (C8304b.m35397b(view)) {
            m40003a(view, tooltipView.getXOffset(), function0);
        } else {
            view.getViewTreeObserver().addOnPreDrawListener(new C9609a(view, this, tooltipView, function0));
        }
    }

    /* renamed from: a */
    public final void m40006a() {
        C8299a.m35391a(this.f32117a);
    }

    /* renamed from: a */
    private final void m40003a(View view, float f, Function0<C15813i> function0) {
        C8299a.m35391a(this.f32117a);
        this.f32117a.setDuration(500);
        this.f32117a.setFloatValues(new float[]{0.0f, 1.0f});
        C19478g.a(view, 0.0f);
        this.f32117a.setInterpolator(m40005b());
        this.f32117a.addUpdateListener(new C9610b(0.0f, 1.0f, view));
        this.f32117a.addListener(new C9611c(this, view, f, 1.0f, function0));
        this.f32117a.start();
    }

    /* renamed from: b */
    private final C9577b m40005b() {
        return new C9577b(new Pair(new C9576a(new C9575a(0.22d, 11.06d)), new C9576a(new C9575a(0.08d, 0.25d))));
    }
}
