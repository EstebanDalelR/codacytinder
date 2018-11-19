package com.tinder.recs;

import com.tinder.fireboarding.view.reccard.FireboardingRecCardView.C9619b;
import com.tinder.fireboarding.view.reccard.FireboardingRecCardView.OnFireboardingRecCardViewListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/tinder/recs/RecCardViewHolderFactory$onFireBoardingRecCardViewListener$1", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$OnFireboardingRecCardViewListener;", "(Lcom/tinder/recs/RecCardViewHolderFactory;)V", "onFireboardingRecCardViewMovedToTop", "", "onFireboardingRecCardViewReadyForAnimation", "recCardViewParams", "Lcom/tinder/fireboarding/view/reccard/FireboardingRecCardView$RecCardViewParams;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecCardViewHolderFactory$onFireBoardingRecCardViewListener$1 implements OnFireboardingRecCardViewListener {
    final /* synthetic */ RecCardViewHolderFactory this$0;

    RecCardViewHolderFactory$onFireBoardingRecCardViewListener$1(RecCardViewHolderFactory recCardViewHolderFactory) {
        this.this$0 = recCardViewHolderFactory;
    }

    public void onFireboardingRecCardViewMovedToTop() {
        this.this$0.recsView.onFireboardingRecCardViewMovedToTop();
    }

    public void onFireboardingRecCardViewReadyForAnimation(@NotNull C9619b c9619b) {
        C2668g.b(c9619b, "recCardViewParams");
        this.this$0.recsView.onFireboardingRecCardViewReadyForAnimation(c9619b);
    }
}
