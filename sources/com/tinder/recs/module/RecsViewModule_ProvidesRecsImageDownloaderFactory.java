package com.tinder.recs.module;

import com.tinder.recs.data.CarouselViewImageDownloader;
import com.tinder.recs.view.RecsView;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsViewModule_ProvidesRecsImageDownloaderFactory implements Factory<CarouselViewImageDownloader> {
    private final RecsViewModule module;
    private final Provider<RecsView> recsViewProvider;

    public RecsViewModule_ProvidesRecsImageDownloaderFactory(RecsViewModule recsViewModule, Provider<RecsView> provider) {
        this.module = recsViewModule;
        this.recsViewProvider = provider;
    }

    public CarouselViewImageDownloader get() {
        return provideInstance(this.module, this.recsViewProvider);
    }

    public static CarouselViewImageDownloader provideInstance(RecsViewModule recsViewModule, Provider<RecsView> provider) {
        return proxyProvidesRecsImageDownloader(recsViewModule, (RecsView) provider.get());
    }

    public static RecsViewModule_ProvidesRecsImageDownloaderFactory create(RecsViewModule recsViewModule, Provider<RecsView> provider) {
        return new RecsViewModule_ProvidesRecsImageDownloaderFactory(recsViewModule, provider);
    }

    public static CarouselViewImageDownloader proxyProvidesRecsImageDownloader(RecsViewModule recsViewModule, RecsView recsView) {
        return (CarouselViewImageDownloader) C15521i.m58001a(recsViewModule.providesRecsImageDownloader(recsView), "Cannot return null from a non-@Nullable @Provides method");
    }
}
