package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.C3956a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/domain/toppicks/usecase/DeleteExpireTopPickTeasersUseCase;", "", "topPicksRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksRepository;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "(Lcom/tinder/domain/toppicks/repo/TopPicksRepository;Lcom/tinder/domain/purchase/SubscriptionProvider;)V", "execute", "Lio/reactivex/Completable;", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class DeleteExpireTopPickTeasersUseCase {
    private final SubscriptionProvider subscriptionProvider;
    private final TopPicksRepository topPicksRepository;

    @Inject
    public DeleteExpireTopPickTeasersUseCase(@NotNull TopPicksRepository topPicksRepository, @NotNull SubscriptionProvider subscriptionProvider) {
        C2668g.b(topPicksRepository, "topPicksRepository");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        this.topPicksRepository = topPicksRepository;
        this.subscriptionProvider = subscriptionProvider;
    }

    @NotNull
    public final C3956a execute() {
        C3956a c = C15551e.a(this.subscriptionProvider.observe()).c(new DeleteExpireTopPickTeasersUseCase$execute$1(this));
        C2668g.a(c, "RxJavaInterop.toV2Flowab…      }\n                }");
        return c;
    }
}
