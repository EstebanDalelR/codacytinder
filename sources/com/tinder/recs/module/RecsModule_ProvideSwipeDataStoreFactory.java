package com.tinder.recs.module;

import com.tinder.domain.recs.SwipeDataStore;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class RecsModule_ProvideSwipeDataStoreFactory implements Factory<SwipeDataStore> {
    private final RecsModule module;

    public RecsModule_ProvideSwipeDataStoreFactory(RecsModule recsModule) {
        this.module = recsModule;
    }

    public SwipeDataStore get() {
        return provideInstance(this.module);
    }

    public static SwipeDataStore provideInstance(RecsModule recsModule) {
        return proxyProvideSwipeDataStore(recsModule);
    }

    public static RecsModule_ProvideSwipeDataStoreFactory create(RecsModule recsModule) {
        return new RecsModule_ProvideSwipeDataStoreFactory(recsModule);
    }

    public static SwipeDataStore proxyProvideSwipeDataStore(RecsModule recsModule) {
        return (SwipeDataStore) C15521i.m58001a(recsModule.provideSwipeDataStore(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
