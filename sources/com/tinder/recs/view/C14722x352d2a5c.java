package com.tinder.recs.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.p011a.C2890b;
import com.tinder.views.SuperlikeCounterView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import tinder.com.tooltip.C19478g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/tinder/recs/view/SuperLikeButton$createCounterChangeAnimator$backDownAnim$1$1"}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.view.SuperLikeButton$createCounterChangeAnimator$$inlined$apply$lambda$3 */
final class C14722x352d2a5c implements AnimatorUpdateListener {
    final /* synthetic */ C2890b $fastOutInterpolator$inlined;
    final /* synthetic */ float $upY$inlined;
    final /* synthetic */ SuperLikeButton this$0;

    C14722x352d2a5c(SuperLikeButton superLikeButton, C2890b c2890b, float f) {
        this.this$0 = superLikeButton;
        this.$fastOutInterpolator$inlined = c2890b;
        this.$upY$inlined = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2668g.a(valueAnimator, "it");
        valueAnimator = valueAnimator.getAnimatedFraction();
        ((SuperlikeCounterView) this.this$0.getContent()).setTranslationY(this.$upY$inlined - (this.$upY$inlined * valueAnimator));
        float f = (float) 1;
        valueAnimator = f - valueAnimator;
        ((SuperlikeCounterView) this.this$0.getContent()).setAlpha(valueAnimator);
        C19478g.a(this.this$0.getContent(), f + (valueAnimator * 0.44f));
    }
}
