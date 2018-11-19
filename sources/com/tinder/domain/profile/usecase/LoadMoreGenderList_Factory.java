package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.CustomGenderRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoadMoreGenderList_Factory implements Factory<LoadMoreGenderList> {
    private final Provider<CustomGenderRepository> customGenderRepositoryProvider;

    public LoadMoreGenderList_Factory(Provider<CustomGenderRepository> provider) {
        this.customGenderRepositoryProvider = provider;
    }

    public LoadMoreGenderList get() {
        return provideInstance(this.customGenderRepositoryProvider);
    }

    public static LoadMoreGenderList provideInstance(Provider<CustomGenderRepository> provider) {
        return new LoadMoreGenderList((CustomGenderRepository) provider.get());
    }

    public static LoadMoreGenderList_Factory create(Provider<CustomGenderRepository> provider) {
        return new LoadMoreGenderList_Factory(provider);
    }

    public static LoadMoreGenderList newLoadMoreGenderList(CustomGenderRepository customGenderRepository) {
        return new LoadMoreGenderList(customGenderRepository);
    }
}
