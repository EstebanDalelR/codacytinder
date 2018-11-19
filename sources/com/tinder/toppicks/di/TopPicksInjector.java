package com.tinder.toppicks.di;

import com.tinder.toppicks.counter.TopPicksBottomCounterView;
import com.tinder.toppicks.emptyview.TopPicksEmptyView;
import com.tinder.toppicks.exhausted.TopPicksExhaustedView;
import com.tinder.toppicks.teasers.TopPicksTeasersView;
import com.tinder.toppicks.view.GoldShimmerTimerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/tinder/toppicks/di/TopPicksInjector;", "", "inject", "", "topPicksBottomCounterView", "Lcom/tinder/toppicks/counter/TopPicksBottomCounterView;", "topPicksEmptyView", "Lcom/tinder/toppicks/emptyview/TopPicksEmptyView;", "topPicksExhaustedView", "Lcom/tinder/toppicks/exhausted/TopPicksExhaustedView;", "topPicksTeasersView", "Lcom/tinder/toppicks/teasers/TopPicksTeasersView;", "goldShimmerTimerView", "Lcom/tinder/toppicks/view/GoldShimmerTimerView;", "Factory", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksInjector {
    void inject(@NotNull TopPicksBottomCounterView topPicksBottomCounterView);

    void inject(@NotNull TopPicksEmptyView topPicksEmptyView);

    void inject(@NotNull TopPicksExhaustedView topPicksExhaustedView);

    void inject(@NotNull TopPicksTeasersView topPicksTeasersView);

    void inject(@NotNull GoldShimmerTimerView goldShimmerTimerView);
}
