package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SaveTopPicksRefreshTime_Factory implements Factory<SaveTopPicksRefreshTime> {
    private final Provider<TopPicksApplicationRepository> topPicksApplicationRepositoryProvider;

    public SaveTopPicksRefreshTime_Factory(Provider<TopPicksApplicationRepository> provider) {
        this.topPicksApplicationRepositoryProvider = provider;
    }

    public SaveTopPicksRefreshTime get() {
        return provideInstance(this.topPicksApplicationRepositoryProvider);
    }

    public static SaveTopPicksRefreshTime provideInstance(Provider<TopPicksApplicationRepository> provider) {
        return new SaveTopPicksRefreshTime((TopPicksApplicationRepository) provider.get());
    }

    public static SaveTopPicksRefreshTime_Factory create(Provider<TopPicksApplicationRepository> provider) {
        return new SaveTopPicksRefreshTime_Factory(provider);
    }

    public static SaveTopPicksRefreshTime newSaveTopPicksRefreshTime(TopPicksApplicationRepository topPicksApplicationRepository) {
        return new SaveTopPicksRefreshTime(topPicksApplicationRepository);
    }
}
