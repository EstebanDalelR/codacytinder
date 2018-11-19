package com.tinder.domain.recs.usecase;

import com.tinder.domain.recs.RecsEngineRegistry;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveRecsEngineLoadingStatuses_Factory implements Factory<ObserveRecsEngineLoadingStatuses> {
    private final Provider<RecsEngineRegistry> recsEngineRegistryProvider;

    public ObserveRecsEngineLoadingStatuses_Factory(Provider<RecsEngineRegistry> provider) {
        this.recsEngineRegistryProvider = provider;
    }

    public ObserveRecsEngineLoadingStatuses get() {
        return provideInstance(this.recsEngineRegistryProvider);
    }

    public static ObserveRecsEngineLoadingStatuses provideInstance(Provider<RecsEngineRegistry> provider) {
        return new ObserveRecsEngineLoadingStatuses((RecsEngineRegistry) provider.get());
    }

    public static ObserveRecsEngineLoadingStatuses_Factory create(Provider<RecsEngineRegistry> provider) {
        return new ObserveRecsEngineLoadingStatuses_Factory(provider);
    }

    public static ObserveRecsEngineLoadingStatuses newObserveRecsEngineLoadingStatuses(RecsEngineRegistry recsEngineRegistry) {
        return new ObserveRecsEngineLoadingStatuses(recsEngineRegistry);
    }
}
