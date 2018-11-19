package com.tinder.recs.presenter;

import com.tinder.fireboarding.domain.Level;
import io.reactivex.functions.Action;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
final class RecsPresenter$onFireboardingRecCardAnimationComplete$1 implements Action {
    final /* synthetic */ Level $level;
    final /* synthetic */ RecsPresenter this$0;

    RecsPresenter$onFireboardingRecCardAnimationComplete$1(RecsPresenter recsPresenter, Level level) {
        this.this$0 = recsPresenter;
        this.$level = level;
    }

    public final void run() {
        this.this$0.getTarget().dismissFireboardingViewContainer();
        if (this.$level != Level.LIKE_AND_PASS) {
            this.this$0.getTarget().showFireboardingLevelTutorialTooltip(this.$level);
        }
    }
}
