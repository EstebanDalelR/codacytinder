package com.tinder.domain.toppicks.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateSessionAfterNonGoldTeasersEmpty_Factory implements Factory<UpdateSessionAfterNonGoldTeasersEmpty> {
    private final Provider<GetTopPicksRefreshTime> getTopPicksRefreshTimeProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<SubscriptionProvider> subscriptionProvider;
    private final Provider<TopPicksSessionRepository> topPicksSessionRepositoryProvider;

    public UpdateSessionAfterNonGoldTeasersEmpty_Factory(Provider<TopPicksSessionRepository> provider, Provider<GetTopPicksRefreshTime> provider2, Provider<SubscriptionProvider> provider3, Provider<Logger> provider4) {
        this.topPicksSessionRepositoryProvider = provider;
        this.getTopPicksRefreshTimeProvider = provider2;
        this.subscriptionProvider = provider3;
        this.loggerProvider = provider4;
    }

    public UpdateSessionAfterNonGoldTeasersEmpty get() {
        return provideInstance(this.topPicksSessionRepositoryProvider, this.getTopPicksRefreshTimeProvider, this.subscriptionProvider, this.loggerProvider);
    }

    public static UpdateSessionAfterNonGoldTeasersEmpty provideInstance(Provider<TopPicksSessionRepository> provider, Provider<GetTopPicksRefreshTime> provider2, Provider<SubscriptionProvider> provider3, Provider<Logger> provider4) {
        return new UpdateSessionAfterNonGoldTeasersEmpty((TopPicksSessionRepository) provider.get(), (GetTopPicksRefreshTime) provider2.get(), (SubscriptionProvider) provider3.get(), (Logger) provider4.get());
    }

    public static UpdateSessionAfterNonGoldTeasersEmpty_Factory create(Provider<TopPicksSessionRepository> provider, Provider<GetTopPicksRefreshTime> provider2, Provider<SubscriptionProvider> provider3, Provider<Logger> provider4) {
        return new UpdateSessionAfterNonGoldTeasersEmpty_Factory(provider, provider2, provider3, provider4);
    }

    public static UpdateSessionAfterNonGoldTeasersEmpty newUpdateSessionAfterNonGoldTeasersEmpty(TopPicksSessionRepository topPicksSessionRepository, GetTopPicksRefreshTime getTopPicksRefreshTime, SubscriptionProvider subscriptionProvider, Logger logger) {
        return new UpdateSessionAfterNonGoldTeasersEmpty(topPicksSessionRepository, getTopPicksRefreshTime, subscriptionProvider, logger);
    }
}
