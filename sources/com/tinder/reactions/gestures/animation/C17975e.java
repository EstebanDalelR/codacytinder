package com.tinder.reactions.gestures.animation;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.tinder.R;
import com.tinder.reactions.gestures.animation.ReactionEntranceAnimationDecorator.State;
import com.tinder.reactions.gestures.view.GrandGestureReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/gestures/animation/SlideDownExitAnimation;", "Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator;", "()V", "animate", "", "grandGestureReactionView", "Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animation.e */
public final class C17975e extends ReactionExitAnimationDecorator {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/tinder/reactions/gestures/animation/SlideDownExitAnimation$animate$1", "Landroid/view/animation/Animation$AnimationListener;", "(Lcom/tinder/reactions/gestures/animation/SlideDownExitAnimation;Landroid/view/animation/Animation;Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;)V", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animation.e$a */
    public static final class C14644a implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ C17975e f46179a;
        /* renamed from: b */
        final /* synthetic */ Animation f46180b;
        /* renamed from: c */
        final /* synthetic */ GrandGestureReactionView f46181c;

        public void onAnimationRepeat(@NotNull Animation animation) {
            C2668g.b(animation, "animation");
        }

        C14644a(C17975e c17975e, Animation animation, GrandGestureReactionView grandGestureReactionView) {
            this.f46179a = c17975e;
            this.f46180b = animation;
            this.f46181c = grandGestureReactionView;
        }

        public void onAnimationStart(@NotNull Animation animation) {
            C2668g.b(animation, "animation");
            this.f46179a.m55836a(State.RUNNING);
        }

        public void onAnimationEnd(@NotNull Animation animation) {
            C2668g.b(animation, "animation");
            this.f46180b.setAnimationListener(null);
            this.f46179a.m55836a(State.FINISHED);
            this.f46181c.setVisibility(8);
            this.f46179a.m61625b();
        }
    }

    /* renamed from: a */
    public void mo11965a(@NotNull GrandGestureReactionView grandGestureReactionView) {
        C2668g.b(grandGestureReactionView, "grandGestureReactionView");
        Animation loadAnimation = AnimationUtils.loadAnimation(grandGestureReactionView.getContext(), R.anim.slide_down_accelerate_decelerate);
        loadAnimation.setAnimationListener(new C14644a(this, loadAnimation, grandGestureReactionView));
        grandGestureReactionView.startAnimation(loadAnimation);
    }
}
