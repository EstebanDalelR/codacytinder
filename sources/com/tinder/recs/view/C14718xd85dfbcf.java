package com.tinder.recs.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/recs/view/RecProfileView$exitWithGamepadExitAnimationDisabled$1$2", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/tinder/recs/view/RecProfileView$exitWithGamepadExitAnimationDisabled$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.view.RecProfileView$exitWithGamepadExitAnimationDisabled$$inlined$apply$lambda$2 */
public final class C14718xd85dfbcf extends AnimatorListenerAdapter {
    final /* synthetic */ long $animationDuration$inlined;
    final /* synthetic */ ScrollView $profileContainer$inlined;
    final /* synthetic */ RecProfileView this$0;

    C14718xd85dfbcf(RecProfileView recProfileView, long j, ScrollView scrollView) {
        this.this$0 = recProfileView;
        this.$animationDuration$inlined = j;
        this.$profileContainer$inlined = scrollView;
    }

    public void onAnimationEnd(@NotNull Animator animator) {
        C2668g.b(animator, "animation");
        super.onAnimationEnd(animator);
        this.this$0.profileScrollAnimation = (ValueAnimator) null;
        this.this$0.exit();
    }
}
