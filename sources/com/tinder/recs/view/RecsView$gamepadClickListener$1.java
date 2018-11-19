package com.tinder.recs.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/tinder/recs/view/RecsView$gamepadClickListener$1", "Lcom/tinder/recs/view/GamepadView$GamepadClickListener;", "(Lcom/tinder/recs/view/RecsView;)V", "onBoostClick", "", "onLikeClick", "onPassClick", "onRewindClick", "onSuperlikeClick", "superLikeButton", "Lcom/tinder/recs/view/SuperLikeButton;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecsView$gamepadClickListener$1 implements GamepadView$GamepadClickListener {
    final /* synthetic */ RecsView this$0;

    RecsView$gamepadClickListener$1(RecsView recsView) {
        this.this$0 = recsView;
    }

    public void onRewindClick() {
        this.this$0.getPresenter$Tinder_release().rewind();
    }

    public void onPassClick() {
        if (RecsView.access$isSwipesEnabled$p(this.this$0)) {
            RecCardView access$getTopRecCardView$p = RecsView.access$getTopRecCardView$p(this.this$0);
            if (access$getTopRecCardView$p != null) {
                View stampPass = access$getTopRecCardView$p.getStampPass();
                if (stampPass != null) {
                    RecsView.access$animateStamp(this.this$0, access$getTopRecCardView$p, stampPass, new RecsView$gamepadClickListener$1$onPassClick$1(this));
                } else {
                    RecsView.access$passOnTopRecFromCardStackButton(this.this$0);
                }
            }
        }
    }

    public void onBoostClick() {
        this.this$0.getPresenter$Tinder_release().handleBoostClick();
    }

    public void onLikeClick() {
        if (RecsView.access$isSwipesEnabled$p(this.this$0)) {
            RecCardView access$getTopRecCardView$p = RecsView.access$getTopRecCardView$p(this.this$0);
            if (access$getTopRecCardView$p != null) {
                View stampLike = access$getTopRecCardView$p.getStampLike();
                if (stampLike != null) {
                    RecsView.access$animateStamp(this.this$0, access$getTopRecCardView$p, stampLike, new RecsView$gamepadClickListener$1$onLikeClick$1(this));
                } else {
                    RecsView.access$likeOnTopRecFromCardStackButton(this.this$0);
                }
            }
        }
    }

    public void onSuperlikeClick(@NotNull SuperLikeButton superLikeButton) {
        C2668g.b(superLikeButton, "superLikeButton");
        if (RecsView.access$isSwipesEnabled$p(this.this$0) != null) {
            superLikeButton = RecsView.access$getTopRecCardView$p(this.this$0);
            if (superLikeButton != null) {
                View stampSuperLike = superLikeButton.getStampSuperLike();
                if (stampSuperLike != null) {
                    RecsView.access$animateStamp(this.this$0, superLikeButton, stampSuperLike, new RecsView$gamepadClickListener$1$onSuperlikeClick$1(this));
                } else {
                    RecsView.access$superlikeOnTopRecFromCardStackButton(this.this$0);
                }
            }
        }
    }
}
