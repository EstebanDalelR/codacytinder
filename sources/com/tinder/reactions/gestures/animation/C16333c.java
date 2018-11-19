package com.tinder.reactions.gestures.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.tinder.reactions.gestures.animation.ReactionEntranceAnimationDecorator.State;
import com.tinder.reactions.gestures.view.GrandGestureReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/gestures/animation/FadeInEnterAnimation;", "Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator;", "()V", "animate", "", "grandGestureReactionView", "Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animation.c */
public final class C16333c extends ReactionEntranceAnimationDecorator {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/reactions/gestures/animation/FadeInEnterAnimation$animate$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/reactions/gestures/animation/FadeInEnterAnimation;Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;Landroid/animation/ObjectAnimator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animation.c$a */
    public static final class C14642a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C16333c f46173a;
        /* renamed from: b */
        final /* synthetic */ GrandGestureReactionView f46174b;
        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f46175c;

        C14642a(C16333c c16333c, GrandGestureReactionView grandGestureReactionView, ObjectAnimator objectAnimator) {
            this.f46173a = c16333c;
            this.f46174b = grandGestureReactionView;
            this.f46175c = objectAnimator;
        }

        public void onAnimationStart(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f46173a.m55836a(State.RUNNING);
            this.f46174b.setVisibility(0);
        }

        public void onAnimationEnd(@NotNull Animator animator) {
            C2668g.b(animator, "animation");
            this.f46175c.removeAllListeners();
            this.f46173a.m55836a(State.FINISHED);
            this.f46174b.m68079l();
        }
    }

    /* renamed from: a */
    public void mo11965a(@NotNull GrandGestureReactionView grandGestureReactionView) {
        C2668g.b(grandGestureReactionView, "grandGestureReactionView");
        ObjectAnimator duration = ObjectAnimator.ofFloat(grandGestureReactionView, "alpha", new float[]{0.0f, 1.0f}).setDuration(1000);
        duration.addListener(new C14642a(this, grandGestureReactionView, duration));
        duration.start();
    }
}
