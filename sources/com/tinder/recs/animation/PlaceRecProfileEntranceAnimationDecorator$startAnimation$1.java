package com.tinder.recs.animation;

import android.animation.Animator;
import com.tinder.utils.an;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/recs/animation/PlaceRecProfileEntranceAnimationDecorator$startAnimation$1", "Lcom/tinder/utils/SimpleAnimatorListener;", "(Lcom/tinder/recs/animation/PlaceRecProfileEntranceAnimationDecorator;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "onAnimationStart", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlaceRecProfileEntranceAnimationDecorator$startAnimation$1 extends an {
    final /* synthetic */ PlaceRecProfileEntranceAnimationDecorator this$0;

    PlaceRecProfileEntranceAnimationDecorator$startAnimation$1(PlaceRecProfileEntranceAnimationDecorator placeRecProfileEntranceAnimationDecorator) {
        this.this$0 = placeRecProfileEntranceAnimationDecorator;
    }

    public void onAnimationStart(@Nullable Animator animator) {
        animator = this.this$0.photosView;
        C2668g.a(animator, "photosView");
        animator.setVisibility(0);
        this.this$0.profileView.setBackgroundColor(-1);
        this.this$0.notifyAnimationStart();
    }

    public void onAnimationEnd(@Nullable Animator animator) {
        this.this$0.recProfileView.getEntranceBackground().setVisibility(8);
    }
}
