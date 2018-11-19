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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/gestures/animation/SlideUpEnterAnimation;", "Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator;", "()V", "animate", "", "grandGestureReactionView", "Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animation.f */
public final class C16334f extends ReactionEntranceAnimationDecorator {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/tinder/reactions/gestures/animation/SlideUpEnterAnimation$animate$1", "Landroid/view/animation/Animation$AnimationListener;", "(Lcom/tinder/reactions/gestures/animation/SlideUpEnterAnimation;Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;Landroid/view/animation/Animation;)V", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animation.f$a */
    public static final class C14645a implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ C16334f f46182a;
        /* renamed from: b */
        final /* synthetic */ GrandGestureReactionView f46183b;
        /* renamed from: c */
        final /* synthetic */ Animation f46184c;

        public void onAnimationRepeat(@NotNull Animation animation) {
            C2668g.b(animation, "animation");
        }

        C14645a(C16334f c16334f, GrandGestureReactionView grandGestureReactionView, Animation animation) {
            this.f46182a = c16334f;
            this.f46183b = grandGestureReactionView;
            this.f46184c = animation;
        }

        public void onAnimationStart(@NotNull Animation animation) {
            C2668g.b(animation, "animation");
            this.f46182a.m55836a(State.RUNNING);
            this.f46183b.setVisibility(0);
            this.f46183b.m68079l();
        }

        public void onAnimationEnd(@NotNull Animation animation) {
            C2668g.b(animation, "animation");
            this.f46184c.setAnimationListener(null);
            this.f46182a.m55836a(State.FINISHED);
        }
    }

    /* renamed from: a */
    public void mo11965a(@NotNull GrandGestureReactionView grandGestureReactionView) {
        C2668g.b(grandGestureReactionView, "grandGestureReactionView");
        Animation loadAnimation = AnimationUtils.loadAnimation(grandGestureReactionView.getContext(), R.anim.slide_up_accelerate_decelerate);
        loadAnimation.setAnimationListener(new C14645a(this, grandGestureReactionView, loadAnimation));
        grandGestureReactionView.startAnimation(loadAnimation);
    }
}
