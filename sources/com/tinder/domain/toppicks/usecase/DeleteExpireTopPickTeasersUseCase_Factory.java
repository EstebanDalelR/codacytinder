package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.toppicks.repo.TopPicksRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteExpireTopPickTeasersUseCase_Factory implements Factory<DeleteExpireTopPickTeasersUseCase> {
    private final Provider<SubscriptionProvider> subscriptionProvider;
    private final Provider<TopPicksRepository> topPicksRepositoryProvider;

    public DeleteExpireTopPickTeasersUseCase_Factory(Provider<TopPicksRepository> provider, Provider<SubscriptionProvider> provider2) {
        this.topPicksRepositoryProvider = provider;
        this.subscriptionProvider = provider2;
    }

    public DeleteExpireTopPickTeasersUseCase get() {
        return provideInstance(this.topPicksRepositoryProvider, this.subscriptionProvider);
    }

    public static DeleteExpireTopPickTeasersUseCase provideInstance(Provider<TopPicksRepository> provider, Provider<SubscriptionProvider> provider2) {
        return new DeleteExpireTopPickTeasersUseCase((TopPicksRepository) provider.get(), (SubscriptionProvider) provider2.get());
    }

    public static DeleteExpireTopPickTeasersUseCase_Factory create(Provider<TopPicksRepository> provider, Provider<SubscriptionProvider> provider2) {
        return new DeleteExpireTopPickTeasersUseCase_Factory(provider, provider2);
    }

    public static DeleteExpireTopPickTeasersUseCase newDeleteExpireTopPickTeasersUseCase(TopPicksRepository topPicksRepository, SubscriptionProvider subscriptionProvider) {
        return new DeleteExpireTopPickTeasersUseCase(topPicksRepository, subscriptionProvider);
    }
}
