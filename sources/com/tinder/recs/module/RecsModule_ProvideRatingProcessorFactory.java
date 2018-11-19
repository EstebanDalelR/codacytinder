package com.tinder.recs.module;

import com.tinder.domain.recs.engine.dispatcher.RatingProcessor;
import com.tinder.domain.recs.engine.dispatcher.SwipeDispatcher;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideRatingProcessorFactory implements Factory<RatingProcessor> {
    private final RecsModule module;
    private final Provider<SwipeDispatcher.Factory> swipeDispatcherFactoryProvider;

    public RecsModule_ProvideRatingProcessorFactory(RecsModule recsModule, Provider<SwipeDispatcher.Factory> provider) {
        this.module = recsModule;
        this.swipeDispatcherFactoryProvider = provider;
    }

    public RatingProcessor get() {
        return provideInstance(this.module, this.swipeDispatcherFactoryProvider);
    }

    public static RatingProcessor provideInstance(RecsModule recsModule, Provider<SwipeDispatcher.Factory> provider) {
        return proxyProvideRatingProcessor(recsModule, (SwipeDispatcher.Factory) provider.get());
    }

    public static RecsModule_ProvideRatingProcessorFactory create(RecsModule recsModule, Provider<SwipeDispatcher.Factory> provider) {
        return new RecsModule_ProvideRatingProcessorFactory(recsModule, provider);
    }

    public static RatingProcessor proxyProvideRatingProcessor(RecsModule recsModule, SwipeDispatcher.Factory factory) {
        return (RatingProcessor) C15521i.m58001a(recsModule.provideRatingProcessor(factory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
