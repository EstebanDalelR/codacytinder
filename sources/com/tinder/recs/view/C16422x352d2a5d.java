package com.tinder.recs.view;

import android.animation.Animator;
import android.support.v4.view.p011a.C2890b;
import com.tinder.utils.an;
import com.tinder.views.SuperlikeCounterView;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/recs/view/SuperLikeButton$createCounterChangeAnimator$backDownAnim$1$2", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/recs/view/SuperLikeButton$createCounterChangeAnimator$backDownAnim$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.view.SuperLikeButton$createCounterChangeAnimator$$inlined$apply$lambda$4 */
public final class C16422x352d2a5d extends an {
    final /* synthetic */ C2890b $fastOutInterpolator$inlined;
    final /* synthetic */ float $upY$inlined;
    final /* synthetic */ SuperLikeButton this$0;

    C16422x352d2a5d(SuperLikeButton superLikeButton, C2890b c2890b, float f) {
        this.this$0 = superLikeButton;
        this.$fastOutInterpolator$inlined = c2890b;
        this.$upY$inlined = f;
    }

    public void onAnimationEnd(@Nullable Animator animator) {
        ((SuperlikeCounterView) this.this$0.getContent()).setRotationY(0.0f);
        ((SuperlikeCounterView) this.this$0.getContent()).setRotationY(0.0f);
    }
}
