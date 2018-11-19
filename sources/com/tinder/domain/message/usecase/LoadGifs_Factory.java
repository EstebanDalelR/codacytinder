package com.tinder.domain.message.usecase;

import com.tinder.domain.message.GifRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoadGifs_Factory implements Factory<LoadGifs> {
    private final Provider<GifRepository> gifRepositoryProvider;

    public LoadGifs_Factory(Provider<GifRepository> provider) {
        this.gifRepositoryProvider = provider;
    }

    public LoadGifs get() {
        return provideInstance(this.gifRepositoryProvider);
    }

    public static LoadGifs provideInstance(Provider<GifRepository> provider) {
        return new LoadGifs((GifRepository) provider.get());
    }

    public static LoadGifs_Factory create(Provider<GifRepository> provider) {
        return new LoadGifs_Factory(provider);
    }

    public static LoadGifs newLoadGifs(GifRepository gifRepository) {
        return new LoadGifs(gifRepository);
    }
}
