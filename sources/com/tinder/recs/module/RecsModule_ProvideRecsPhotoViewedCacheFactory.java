package com.tinder.recs.module;

import com.tinder.recs.analytics.RecsPhotosViewedCache;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class RecsModule_ProvideRecsPhotoViewedCacheFactory implements Factory<RecsPhotosViewedCache> {
    private final RecsModule module;

    public RecsModule_ProvideRecsPhotoViewedCacheFactory(RecsModule recsModule) {
        this.module = recsModule;
    }

    public RecsPhotosViewedCache get() {
        return provideInstance(this.module);
    }

    public static RecsPhotosViewedCache provideInstance(RecsModule recsModule) {
        return proxyProvideRecsPhotoViewedCache(recsModule);
    }

    public static RecsModule_ProvideRecsPhotoViewedCacheFactory create(RecsModule recsModule) {
        return new RecsModule_ProvideRecsPhotoViewedCacheFactory(recsModule);
    }

    public static RecsPhotosViewedCache proxyProvideRecsPhotoViewedCache(RecsModule recsModule) {
        return (RecsPhotosViewedCache) C15521i.m58001a(recsModule.provideRecsPhotoViewedCache(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
