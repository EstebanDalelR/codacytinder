package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.common.model.Subscription;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "subscription", "Lcom/tinder/domain/common/model/Subscription;", "apply"}, k = 3, mv = {1, 1, 10})
final class DeleteExpireTopPickTeasersUseCase$execute$1<T, R> implements Function<Subscription, CompletableSource> {
    final /* synthetic */ DeleteExpireTopPickTeasersUseCase this$0;

    DeleteExpireTopPickTeasersUseCase$execute$1(DeleteExpireTopPickTeasersUseCase deleteExpireTopPickTeasersUseCase) {
        this.this$0 = deleteExpireTopPickTeasersUseCase;
    }

    public final CompletableSource apply(@NotNull Subscription subscription) {
        C2668g.b(subscription, "subscription");
        if (subscription.isGold() != null) {
            return this.this$0.topPicksRepository.clearAllTeaserRecs();
        }
        return this.this$0.topPicksRepository.clearExpiredTeaserRecs();
    }
}
