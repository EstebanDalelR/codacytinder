package com.tinder.recs.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/recs/view/RecsView$animateStamp$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/recs/view/RecsView;Lkotlin/jvm/functions/Function0;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$animateStamp$1 extends AnimatorListenerAdapter {
    final /* synthetic */ Function0 $animationEndListener;
    final /* synthetic */ RecsView this$0;

    RecsView$animateStamp$1(RecsView recsView, Function0 function0) {
        this.this$0 = recsView;
        this.$animationEndListener = function0;
    }

    public void onAnimationEnd(@NotNull Animator animator) {
        C2668g.b(animator, "animation");
        this.$animationEndListener.invoke();
        RecsView.access$setStampIsAnimating$p(this.this$0, false);
    }
}
