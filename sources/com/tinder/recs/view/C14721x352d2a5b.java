package com.tinder.recs.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.p011a.C2890b;
import com.tinder.views.SuperlikeCounterView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r¸\u0006\u0000"}, d2 = {"com/tinder/recs/view/SuperLikeButton$createCounterChangeAnimator$twistAnimator$1$1", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "(Lcom/tinder/recs/view/SuperLikeButton$createCounterChangeAnimator$twistAnimator$1;)V", "hasFlipped", "", "getHasFlipped$Tinder_release", "()Z", "setHasFlipped$Tinder_release", "(Z)V", "onAnimationUpdate", "", "animation", "Landroid/animation/ValueAnimator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.view.SuperLikeButton$createCounterChangeAnimator$$inlined$apply$lambda$2 */
public final class C14721x352d2a5b implements AnimatorUpdateListener {
    final /* synthetic */ C2890b $fastOutInterpolator$inlined;
    final /* synthetic */ int $nextCount$inlined;
    final /* synthetic */ int $rotation$inlined;
    private boolean hasFlipped;
    final /* synthetic */ SuperLikeButton this$0;

    C14721x352d2a5b(SuperLikeButton superLikeButton, C2890b c2890b, int i, int i2) {
        this.this$0 = superLikeButton;
        this.$fastOutInterpolator$inlined = c2890b;
        this.$rotation$inlined = i;
        this.$nextCount$inlined = i2;
    }

    public final boolean getHasFlipped$Tinder_release() {
        return this.hasFlipped;
    }

    public final void setHasFlipped$Tinder_release(boolean z) {
        this.hasFlipped = z;
    }

    public void onAnimationUpdate(@NotNull ValueAnimator valueAnimator) {
        C2668g.b(valueAnimator, "animation");
        valueAnimator = valueAnimator.getAnimatedFraction();
        ((SuperlikeCounterView) this.this$0.getContent()).setRotationY(((float) this.$rotation$inlined) * valueAnimator);
        if (!this.hasFlipped && valueAnimator >= 0.5f) {
            ((SuperlikeCounterView) this.this$0.getContent()).setRotationY((float) this.$rotation$inlined);
            ((SuperlikeCounterView) this.this$0.getContent()).setCount(this.$nextCount$inlined);
            this.hasFlipped = true;
        }
    }
}
