package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetTopPicksRefreshTime_Factory implements Factory<GetTopPicksRefreshTime> {
    private final Provider<TopPicksApplicationRepository> topPicksApplicationRepositoryProvider;

    public GetTopPicksRefreshTime_Factory(Provider<TopPicksApplicationRepository> provider) {
        this.topPicksApplicationRepositoryProvider = provider;
    }

    public GetTopPicksRefreshTime get() {
        return provideInstance(this.topPicksApplicationRepositoryProvider);
    }

    public static GetTopPicksRefreshTime provideInstance(Provider<TopPicksApplicationRepository> provider) {
        return new GetTopPicksRefreshTime((TopPicksApplicationRepository) provider.get());
    }

    public static GetTopPicksRefreshTime_Factory create(Provider<TopPicksApplicationRepository> provider) {
        return new GetTopPicksRefreshTime_Factory(provider);
    }

    public static GetTopPicksRefreshTime newGetTopPicksRefreshTime(TopPicksApplicationRepository topPicksApplicationRepository) {
        return new GetTopPicksRefreshTime(topPicksApplicationRepository);
    }
}
