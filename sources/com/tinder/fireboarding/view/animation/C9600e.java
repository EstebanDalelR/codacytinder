package com.tinder.fireboarding.view.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.tinder.fireboarding.view.BackgroundScalingView;
import com.tinder.fireboarding.view.C9571a;
import com.tinder.fireboarding.view.C9617b;
import com.tinder.fireboarding.view.animation.C9587b.C9581b;
import com.tinder.fireboarding.view.animation.C9587b.C9583d;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002JB\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0019J\u0006\u0010\u001b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tinder/fireboarding/view/animation/FireboardingAnimator;", "", "()V", "animatorSet", "Landroid/animation/AnimatorSet;", "entranceAnimatorFactory", "Lcom/tinder/fireboarding/view/animation/EntranceAnimatorFactory;", "exitAnimatorFactory", "Lcom/tinder/fireboarding/view/animation/ExitAnimatorFactory;", "featureStagingAnimatorFactory", "Lcom/tinder/fireboarding/view/animation/FeatureStagingAnimatorFactory;", "prepareViewsForAnimation", "", "featureIconView", "Landroid/view/View;", "textContainer", "startViewCenterY", "", "parentCenterY", "startAnimation", "view", "Lcom/tinder/fireboarding/view/BackgroundScalingView;", "animationParams", "Lcom/tinder/fireboarding/view/animation/FireboardingAnimator$AnimationParams;", "onEntranceAnimationEndListener", "Lkotlin/Function0;", "onAnimationEndListener", "stopAnimation", "AnimationParams", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fireboarding.view.animation.e */
public final class C9600e {
    /* renamed from: a */
    private AnimatorSet f32085a;
    /* renamed from: b */
    private final C9587b f32086b = new C9587b();
    /* renamed from: c */
    private final C9595d f32087c = new C9595d();
    /* renamed from: d */
    private final C9592c f32088d = new C9592c();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/tinder/fireboarding/view/animation/FireboardingAnimator$AnimationParams;", "", "startViewBounds", "Lcom/tinder/fireboarding/view/ViewBounds;", "parentViewBounds", "gamepadButtonViewBounds", "(Lcom/tinder/fireboarding/view/ViewBounds;Lcom/tinder/fireboarding/view/ViewBounds;Lcom/tinder/fireboarding/view/ViewBounds;)V", "getGamepadButtonViewBounds", "()Lcom/tinder/fireboarding/view/ViewBounds;", "getParentViewBounds", "getStartViewBounds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.e$a */
    public static final class C9596a {
        @NotNull
        /* renamed from: a */
        private final C9571a f32072a;
        @NotNull
        /* renamed from: b */
        private final C9571a f32073b;
        @NotNull
        /* renamed from: c */
        private final C9571a f32074c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9596a) {
                    C9596a c9596a = (C9596a) obj;
                    if (C2668g.a(this.f32072a, c9596a.f32072a) && C2668g.a(this.f32073b, c9596a.f32073b) && C2668g.a(this.f32074c, c9596a.f32074c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C9571a c9571a = this.f32072a;
            int i = 0;
            int hashCode = (c9571a != null ? c9571a.hashCode() : 0) * 31;
            C9571a c9571a2 = this.f32073b;
            hashCode = (hashCode + (c9571a2 != null ? c9571a2.hashCode() : 0)) * 31;
            c9571a2 = this.f32074c;
            if (c9571a2 != null) {
                i = c9571a2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AnimationParams(startViewBounds=");
            stringBuilder.append(this.f32072a);
            stringBuilder.append(", parentViewBounds=");
            stringBuilder.append(this.f32073b);
            stringBuilder.append(", gamepadButtonViewBounds=");
            stringBuilder.append(this.f32074c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9596a(@NotNull C9571a c9571a, @NotNull C9571a c9571a2, @NotNull C9571a c9571a3) {
            C2668g.b(c9571a, "startViewBounds");
            C2668g.b(c9571a2, "parentViewBounds");
            C2668g.b(c9571a3, "gamepadButtonViewBounds");
            this.f32072a = c9571a;
            this.f32073b = c9571a2;
            this.f32074c = c9571a3;
        }

        @NotNull
        /* renamed from: a */
        public final C9571a m39957a() {
            return this.f32072a;
        }

        @NotNull
        /* renamed from: b */
        public final C9571a m39958b() {
            return this.f32073b;
        }

        @NotNull
        /* renamed from: c */
        public final C9571a m39959c() {
            return this.f32074c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fireboarding/view/animation/FireboardingAnimator$startAnimation$entranceAnimator$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/FireboardingAnimator$startAnimation$entranceAnimator$1;Landroid/animation/ValueAnimator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.e$b */
    public static final class C9597b extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f32075a;
        /* renamed from: b */
        final /* synthetic */ Function0 f32076b;

        C9597b(ValueAnimator valueAnimator, Function0 function0) {
            this.f32075a = valueAnimator;
            this.f32076b = function0;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32075a.removeListener(this);
            this.f32076b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fireboarding/view/animation/FireboardingAnimator$startAnimation$exitAnimator$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/FireboardingAnimator$startAnimation$exitAnimator$1;Landroid/animation/ValueAnimator;)V", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.e$c */
    public static final class C9598c extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ValueAnimator f32077a;
        /* renamed from: b */
        final /* synthetic */ BackgroundScalingView f32078b;

        C9598c(ValueAnimator valueAnimator, BackgroundScalingView backgroundScalingView) {
            this.f32077a = valueAnimator;
            this.f32078b = backgroundScalingView;
        }

        public void onAnimationStart(@Nullable Animator animator) {
            this.f32077a.removeListener(this);
            this.f32078b.setRaysDrawableVisible(false);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/fireboarding/view/animation/FireboardingAnimator$startAnimation$1$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/fireboarding/view/animation/FireboardingAnimator$startAnimation$1;Landroid/animation/AnimatorSet;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "fireboarding_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fireboarding.view.animation.e$d */
    public static final class C9599d extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ AnimatorSet f32079a;
        /* renamed from: b */
        final /* synthetic */ C9600e f32080b;
        /* renamed from: c */
        final /* synthetic */ Function0 f32081c;
        /* renamed from: d */
        final /* synthetic */ ValueAnimator f32082d;
        /* renamed from: e */
        final /* synthetic */ ValueAnimator f32083e;
        /* renamed from: f */
        final /* synthetic */ ValueAnimator f32084f;

        C9599d(AnimatorSet animatorSet, C9600e c9600e, Function0 function0, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, ValueAnimator valueAnimator3) {
            this.f32079a = animatorSet;
            this.f32080b = c9600e;
            this.f32081c = function0;
            this.f32082d = valueAnimator;
            this.f32083e = valueAnimator2;
            this.f32084f = valueAnimator3;
        }

        public void onAnimationEnd(@Nullable Animator animator) {
            this.f32079a.removeListener(this);
            this.f32081c.invoke();
        }
    }

    /* renamed from: a */
    public final void m39962a(@NotNull BackgroundScalingView backgroundScalingView, @NotNull View view, @NotNull View view2, @NotNull C9596a c9596a, @NotNull Function0<C15813i> function0, @NotNull Function0<C15813i> function02) {
        BackgroundScalingView backgroundScalingView2 = backgroundScalingView;
        View view3 = view;
        View view4 = view2;
        C9596a c9596a2 = c9596a;
        Function0<C15813i> function03 = function0;
        C2668g.b(backgroundScalingView2, "view");
        C2668g.b(view3, "featureIconView");
        C2668g.b(view4, "textContainer");
        C2668g.b(c9596a2, "animationParams");
        C2668g.b(function03, "onEntranceAnimationEndListener");
        Function0<C15813i> function04 = function02;
        C2668g.b(function04, "onAnimationEndListener");
        m39960a(view3, view4, C9617b.m40013b(c9596a.m39957a()), C9617b.m40013b(c9596a.m39958b()));
        C9583d a = C9587b.f32037a.m39914a(c9596a2);
        backgroundScalingView2.m39875b(a.m39923a().m39894a(), a.m39923a().m39895b(), a.m39923a().m39898e(), a.m39923a().m39899f());
        backgroundScalingView2.setRaysDrawableVisible(true);
        C9581b b = C9587b.f32037a.m39915b(view3);
        C9581b c9581b = b;
        ValueAnimator a2 = this.f32086b.m39938a(a, C9587b.f32037a.m39913a(view3), b, C9587b.f32037a.m39916c(view4), backgroundScalingView2, view3, view4);
        a2.addListener(new C9597b(a2, function03));
        ValueAnimator a3 = this.f32087c.m39956a(backgroundScalingView2);
        ValueAnimator a4 = this.f32088d.m39953a((View) backgroundScalingView2, view3, view4, C9592c.f32062a.m39939a(view3, c9581b.m39918b(), c9596a2));
        a4.addListener(new C9598c(a4, backgroundScalingView2));
        m39961a();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f32085a = animatorSet;
        animatorSet.addListener(new C9599d(animatorSet, this, function04, a2, a3, a4));
        animatorSet.playSequentially(new Animator[]{a2, a3, a4});
        animatorSet.start();
    }

    /* renamed from: a */
    public final void m39961a() {
        AnimatorSet animatorSet = this.f32085a;
        if (animatorSet != null) {
            animatorSet.end();
        }
        this.f32085a = (AnimatorSet) null;
    }

    /* renamed from: a */
    private final void m39960a(View view, View view2, int i, int i2) {
        view.setTranslationY(((float) i) - ((float) C9617b.m40013b(C9617b.m40012a(view))));
        view2.setTranslationY(((float) i2) - ((float) C9617b.m40013b(C9617b.m40012a(view2))));
        view = ((float) view.getWidth()) / ((float) view2.getWidth());
        view2.setScaleX(view);
        view2.setScaleY(view);
    }
}
