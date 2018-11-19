package com.tinder.domain.fastmatch.newCount.usecase;

import com.tinder.domain.fastmatch.repository.NewCountRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveNewCountUpdate_Factory implements Factory<ObserveNewCountUpdate> {
    private final Provider<NewCountRepository> newCountRepositoryProvider;

    public ObserveNewCountUpdate_Factory(Provider<NewCountRepository> provider) {
        this.newCountRepositoryProvider = provider;
    }

    public ObserveNewCountUpdate get() {
        return provideInstance(this.newCountRepositoryProvider);
    }

    public static ObserveNewCountUpdate provideInstance(Provider<NewCountRepository> provider) {
        return new ObserveNewCountUpdate((NewCountRepository) provider.get());
    }

    public static ObserveNewCountUpdate_Factory create(Provider<NewCountRepository> provider) {
        return new ObserveNewCountUpdate_Factory(provider);
    }

    public static ObserveNewCountUpdate newObserveNewCountUpdate(NewCountRepository newCountRepository) {
        return new ObserveNewCountUpdate(newCountRepository);
    }
}
