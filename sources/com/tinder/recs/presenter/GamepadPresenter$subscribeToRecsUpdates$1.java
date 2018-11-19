package com.tinder.recs.presenter;

import com.tinder.domain.recs.model.RecsUpdate;
import com.tinder.fireboarding.domain.C9566h;
import com.tinder.fireboarding.domain.Level;
import com.tinder.recs.presenter.GamepadPresenter.RecsUpdateCompositeInfo;
import io.reactivex.functions.Function3;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/tinder/recs/presenter/GamepadPresenter$RecsUpdateCompositeInfo;", "recsUpdate", "Lcom/tinder/domain/recs/model/RecsUpdate;", "completedLevels", "", "Lcom/tinder/fireboarding/domain/Level;", "fireboardingConfig", "Lcom/tinder/fireboarding/domain/FireboardingConfig;", "apply"}, k = 3, mv = {1, 1, 10})
final class GamepadPresenter$subscribeToRecsUpdates$1<T1, T2, T3, R> implements Function3<RecsUpdate, Set<? extends Level>, C9566h, RecsUpdateCompositeInfo> {
    public static final GamepadPresenter$subscribeToRecsUpdates$1 INSTANCE = new GamepadPresenter$subscribeToRecsUpdates$1();

    GamepadPresenter$subscribeToRecsUpdates$1() {
    }

    @NotNull
    public final RecsUpdateCompositeInfo apply(@NotNull RecsUpdate recsUpdate, @NotNull Set<? extends Level> set, @NotNull C9566h c9566h) {
        C2668g.b(recsUpdate, "recsUpdate");
        C2668g.b(set, "completedLevels");
        C2668g.b(c9566h, "fireboardingConfig");
        return new RecsUpdateCompositeInfo(recsUpdate, set, c9566h);
    }
}
