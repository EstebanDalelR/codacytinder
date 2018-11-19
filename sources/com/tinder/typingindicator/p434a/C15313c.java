package com.tinder.typingindicator.p434a;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/typingindicator/animator/TypingIndicatorToMessageTransitionAnimation;", "", "()V", "createAnimator", "Landroid/animation/ValueAnimator;", "typingIndicatorView", "Landroid/view/View;", "messageView", "animatorListenerAdapter", "Landroid/animation/AnimatorListenerAdapter;", "resetTypingIndicatorScaleAndAlpha", "", "setViewsToInitialStates", "updateViews", "increasingAnimatedFraction", "", "updateViewsToFinalAnimationState", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.a.c */
public final class C15313c {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/typingindicator/animator/TypingIndicatorToMessageTransitionAnimation$createAnimator$1$1"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.a.c$a */
    static final class C15312a implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C15313c f47522a;
        /* renamed from: b */
        final /* synthetic */ View f47523b;
        /* renamed from: c */
        final /* synthetic */ View f47524c;
        /* renamed from: d */
        final /* synthetic */ AnimatorListenerAdapter f47525d;

        C15312a(C15313c c15313c, View view, View view2, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f47522a = c15313c;
            this.f47523b = view;
            this.f47524c = view2;
            this.f47525d = animatorListenerAdapter;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C15313c c15313c = this.f47522a;
            View view = this.f47523b;
            View view2 = this.f47524c;
            C2668g.a(valueAnimator, "it");
            c15313c.m57487a(view, view2, (float) valueAnimator.getAnimatedFraction());
        }
    }

    @NotNull
    /* renamed from: a */
    public final ValueAnimator m57490a(@NotNull View view, @NotNull View view2, @NotNull AnimatorListenerAdapter animatorListenerAdapter) {
        C2668g.b(view, "typingIndicatorView");
        C2668g.b(view2, "messageView");
        C2668g.b(animatorListenerAdapter, "animatorListenerAdapter");
        m57489b(view, view2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setDuration(300);
        valueAnimator.addUpdateListener(new C15312a(this, view, view2, animatorListenerAdapter));
        valueAnimator.addListener(animatorListenerAdapter);
        return valueAnimator;
    }

    /* renamed from: a */
    public final void m57492a(@NotNull View view, @NotNull View view2) {
        C2668g.b(view, "typingIndicatorView");
        C2668g.b(view2, "messageView");
        m57487a(view, view2, 1.0f);
    }

    /* renamed from: a */
    public final void m57491a(@NotNull View view) {
        C2668g.b(view, "typingIndicatorView");
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    /* renamed from: a */
    private final void m57487a(View view, View view2, float f) {
        float f2 = 1.0f - f;
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(f2);
        view2.setScaleX(f);
        view2.setScaleY(f);
        view2.setAlpha(f);
    }

    /* renamed from: b */
    private final void m57489b(View view, View view2) {
        view.setPivotX(0.0f);
        view.setPivotY((float) view.getMeasuredHeight());
        view2.setPivotX(0.0f);
        view2.setPivotY((float) view2.getMeasuredHeight());
        view2.setAlpha(0.0f);
        view2.setScaleX(0.0f);
        view2.setScaleY(0.0f);
    }
}
