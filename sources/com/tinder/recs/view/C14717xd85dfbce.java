package com.tinder.recs.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "DATA", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/recs/view/RecProfileView$exitWithGamepadExitAnimationDisabled$1$1"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.view.RecProfileView$exitWithGamepadExitAnimationDisabled$$inlined$apply$lambda$1 */
final class C14717xd85dfbce implements AnimatorUpdateListener {
    final /* synthetic */ long $animationDuration$inlined;
    final /* synthetic */ ScrollView $profileContainer$inlined;
    final /* synthetic */ RecProfileView this$0;

    C14717xd85dfbce(RecProfileView recProfileView, long j, ScrollView scrollView) {
        this.this$0 = recProfileView;
        this.$animationDuration$inlined = j;
        this.$profileContainer$inlined = scrollView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ScrollView scrollView = this.$profileContainer$inlined;
        ScrollView scrollView2 = this.$profileContainer$inlined;
        C2668g.a(scrollView2, "profileContainer");
        int scrollX = scrollView2.getScrollX();
        C2668g.a(valueAnimator, "animation");
        valueAnimator = valueAnimator.getAnimatedValue();
        if (valueAnimator == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
        scrollView.smoothScrollTo(scrollX, ((Integer) valueAnimator).intValue());
    }
}
