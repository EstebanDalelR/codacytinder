package com.tinder.reactions.gestures.animation;

import com.tinder.reactions.gestures.animation.ReactionEntranceAnimationDecorator.State;
import com.tinder.reactions.gestures.view.GrandGestureReactionView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/gestures/animation/DefaultExitAnimation;", "Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator;", "()V", "animate", "", "grandGestureReactionView", "Lcom/tinder/reactions/gestures/view/GrandGestureReactionView;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animation.b */
public final class C17973b extends ReactionExitAnimationDecorator {
    /* renamed from: a */
    public void mo11965a(@NotNull GrandGestureReactionView grandGestureReactionView) {
        C2668g.b(grandGestureReactionView, "grandGestureReactionView");
        m55836a(State.RUNNING);
        grandGestureReactionView.setVisibility(8);
        m61625b();
        m55836a((State) State.FINISHED);
    }
}
