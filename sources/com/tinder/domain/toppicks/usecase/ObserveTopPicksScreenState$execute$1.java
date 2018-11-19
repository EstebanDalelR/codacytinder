package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.toppicks.TopPicksScreenState;
import com.tinder.domain.toppicks.model.TopPicksSession;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/toppicks/TopPicksScreenState;", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "session", "Lcom/tinder/domain/toppicks/model/TopPicksSession;", "apply"}, k = 3, mv = {1, 1, 10})
final class ObserveTopPicksScreenState$execute$1<T1, T2, R> implements BiFunction<Subscription, TopPicksSession, TopPicksScreenState> {
    final /* synthetic */ ObserveTopPicksScreenState this$0;

    ObserveTopPicksScreenState$execute$1(ObserveTopPicksScreenState observeTopPicksScreenState) {
        this.this$0 = observeTopPicksScreenState;
    }

    @NotNull
    public final TopPicksScreenState apply(@NotNull Subscription subscription, @NotNull TopPicksSession topPicksSession) {
        C2668g.b(subscription, "subscription");
        C2668g.b(topPicksSession, "session");
        return this.this$0.resolveScreenState(subscription, topPicksSession);
    }
}
