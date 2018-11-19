package com.tinder.recs.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/recs/view/RecCardStampsDecoration$onDecorationDrawOver$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/recs/view/RecCardStampsDecoration;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class RecCardStampsDecoration$onDecorationDrawOver$1 extends AnimatorListenerAdapter {
    final /* synthetic */ RecCardStampsDecoration this$0;

    RecCardStampsDecoration$onDecorationDrawOver$1(RecCardStampsDecoration recCardStampsDecoration) {
        this.this$0 = recCardStampsDecoration;
    }

    public void onAnimationEnd(@NotNull Animator animator) {
        C2668g.b(animator, "animation");
        super.onAnimationEnd(animator);
        this.this$0.isStampOopsAnimating = false;
    }
}
