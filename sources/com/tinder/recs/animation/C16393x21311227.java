package com.tinder.recs.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.tinder.recs.animation.RecProfileAnimationDecorator.State;
import com.tinder.utils.an;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/tinder/recs/animation/PlaceRecProfileEntranceAnimationDecorator$getFadeInAnimation$1$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/recs/animation/PlaceRecProfileEntranceAnimationDecorator$getFadeInAnimation$1;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recs.animation.PlaceRecProfileEntranceAnimationDecorator$getFadeInAnimation$$inlined$apply$lambda$1 */
public final class C16393x21311227 extends an {
    final /* synthetic */ ObjectAnimator $downArrowFadeIn$inlined;
    final /* synthetic */ ObjectAnimator $gamepadFadeIn$inlined;
    final /* synthetic */ ObjectAnimator $placeholderFadeOut$inlined;
    final /* synthetic */ PlaceRecProfileEntranceAnimationDecorator this$0;

    C16393x21311227(PlaceRecProfileEntranceAnimationDecorator placeRecProfileEntranceAnimationDecorator, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3) {
        this.this$0 = placeRecProfileEntranceAnimationDecorator;
        this.$gamepadFadeIn$inlined = objectAnimator;
        this.$placeholderFadeOut$inlined = objectAnimator2;
        this.$downArrowFadeIn$inlined = objectAnimator3;
    }

    public void onAnimationEnd(@Nullable Animator animator) {
        animator = this.this$0.placeholderImageView;
        C2668g.a(animator, "placeholderImageView");
        animator.setVisibility(4);
        animator = this.this$0.placeholderImageView;
        C2668g.a(animator, "placeholderImageView");
        animator.setAlpha(1.0f);
        this.this$0.state = State.FINISHED;
        this.this$0.notifyAnimationEnd();
    }
}
