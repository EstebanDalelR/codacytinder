package com.tinder.recs.module;

import com.tinder.data.recs.C8776g;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class RecsModule_ProvideRecsAlreadySwipedProviderFactory implements Factory<C8776g> {
    private final RecsModule module;

    public RecsModule_ProvideRecsAlreadySwipedProviderFactory(RecsModule recsModule) {
        this.module = recsModule;
    }

    public C8776g get() {
        return provideInstance(this.module);
    }

    public static C8776g provideInstance(RecsModule recsModule) {
        return proxyProvideRecsAlreadySwipedProvider(recsModule);
    }

    public static RecsModule_ProvideRecsAlreadySwipedProviderFactory create(RecsModule recsModule) {
        return new RecsModule_ProvideRecsAlreadySwipedProviderFactory(recsModule);
    }

    public static C8776g proxyProvideRecsAlreadySwipedProvider(RecsModule recsModule) {
        return (C8776g) C15521i.m58001a(recsModule.provideRecsAlreadySwipedProvider(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
