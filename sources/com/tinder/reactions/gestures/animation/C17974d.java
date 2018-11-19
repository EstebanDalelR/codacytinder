package com.tinder.reactions.gestures.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.tinder.reactions.gestures.animation.ReactionEntranceAnimationDecorator.State;
import com.tinder.reactions.gestures.view.GrandGestureReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/gestures/animation/FadeOutExitAnimation;", "Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator;", "()V", "animate", "", "grandGestureReactionView", "Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animation.d */
public final class C17974d extends ReactionExitAnimationDecorator {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/reactions/gestures/animation/FadeOutExitAnimation$animate$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/reactions/gestures/animation/FadeOutExitAnimation;Landroid/animation/ObjectAnimator;Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animation.d$a */
    public static final class C14643a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C17974d f46176a;
        /* renamed from: b */
        final /* synthetic */ ObjectAnimator f46177b;
        /* renamed from: c */
        final /* synthetic */ GrandGestureReactionView f46178c;

        C14643a(C17974d c17974d, ObjectAnimator objectAnimator, GrandGestureReactionView grandGestureReactionView) {
            this.f46176a = c17974d;
            this.f46177b = objectAnimator;
            this.f46178c = grandGestureReactionView;
        }

        public void onAnimationStart(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f46176a.m55836a(State.RUNNING);
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f46177b.removeAllListeners();
            this.f46176a.m55836a(State.FINISHED);
            this.f46178c.setVisibility(8);
            this.f46178c.setAlpha(1.0f);
            this.f46176a.m61625b();
        }
    }

    /* renamed from: a */
    public void mo11965a(@NotNull GrandGestureReactionView grandGestureReactionView) {
        C2668g.b(grandGestureReactionView, "grandGestureReactionView");
        ObjectAnimator duration = ObjectAnimator.ofFloat(grandGestureReactionView, "alpha", new float[]{1.0f, 0.0f}).setDuration(400);
        duration.addListener(new C14643a(this, duration, grandGestureReactionView));
        duration.start();
    }
}
