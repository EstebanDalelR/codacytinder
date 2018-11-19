package com.tinder.domain.toppicks.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.SimpleVoidUseCase;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.toppicks.model.TopPicksSession;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/domain/toppicks/usecase/UpdateSessionAfterNonGoldTeasersEmpty;", "Lcom/tinder/domain/common/usecase/SimpleVoidUseCase;", "topPicksSessionRepository", "Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;", "getTopPicksRefreshTime", "Lcom/tinder/domain/toppicks/usecase/GetTopPicksRefreshTime;", "subscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/domain/toppicks/repo/TopPicksSessionRepository;Lcom/tinder/domain/toppicks/usecase/GetTopPicksRefreshTime;Lcom/tinder/domain/purchase/SubscriptionProvider;Lcom/tinder/common/logger/Logger;)V", "execute", "", "performTeasersEmptyUpdate", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class UpdateSessionAfterNonGoldTeasersEmpty implements SimpleVoidUseCase {
    private final GetTopPicksRefreshTime getTopPicksRefreshTime;
    private final Logger logger;
    private final SubscriptionProvider subscriptionProvider;
    private final TopPicksSessionRepository topPicksSessionRepository;

    @Inject
    public UpdateSessionAfterNonGoldTeasersEmpty(@NotNull TopPicksSessionRepository topPicksSessionRepository, @NotNull GetTopPicksRefreshTime getTopPicksRefreshTime, @NotNull SubscriptionProvider subscriptionProvider, @NotNull Logger logger) {
        C2668g.b(topPicksSessionRepository, "topPicksSessionRepository");
        C2668g.b(getTopPicksRefreshTime, "getTopPicksRefreshTime");
        C2668g.b(subscriptionProvider, "subscriptionProvider");
        C2668g.b(logger, "logger");
        this.topPicksSessionRepository = topPicksSessionRepository;
        this.getTopPicksRefreshTime = getTopPicksRefreshTime;
        this.subscriptionProvider = subscriptionProvider;
        this.logger = logger;
    }

    public void execute() {
        this.subscriptionProvider.observe().c(1).a(new UpdateSessionAfterNonGoldTeasersEmpty$execute$1(this), new UpdateSessionAfterNonGoldTeasersEmpty$execute$2(this));
    }

    private final void performTeasersEmptyUpdate() {
        this.topPicksSessionRepository.updateCurrentSession(new TopPicksSession(this.getTopPicksRefreshTime.execute().getTime(), false, false, false, false, 26, null));
    }
}
