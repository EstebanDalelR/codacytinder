package com.tinder.recs.presenter;

import com.tinder.fireboarding.domain.Level;
import com.tinder.recs.presenter.GamepadPresenter.RecsUpdateCompositeInfo;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.collections.C19066k;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/recs/presenter/GamepadPresenter$RecsUpdateCompositeInfo;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class GamepadPresenter$subscribeToRecsUpdates$2<T> implements Consumer<RecsUpdateCompositeInfo> {
    final /* synthetic */ GamepadPresenter this$0;

    GamepadPresenter$subscribeToRecsUpdates$2(GamepadPresenter gamepadPresenter) {
        this.this$0 = gamepadPresenter;
    }

    public final void accept(RecsUpdateCompositeInfo recsUpdateCompositeInfo) {
        if (recsUpdateCompositeInfo.getFireboardingConfig().a()) {
            this.this$0.onRecsUpdate(recsUpdateCompositeInfo.getRecsUpdate(), recsUpdateCompositeInfo.getCompletedLevels());
        } else {
            this.this$0.onRecsUpdate(recsUpdateCompositeInfo.getRecsUpdate(), C19066k.m68009k(Level.values()));
        }
    }
}
