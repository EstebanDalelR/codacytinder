package com.tinder.recs.rule;

import com.tinder.domain.recs.engine.dispatcher.SwipeDispatcher;
import com.tinder.superlike.p421e.C15082f;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SwipeDispatchRule_Factory implements Factory<SwipeDispatchRule> {
    private final Provider<C15082f> superlikeStatusProvider;
    private final Provider<SwipeDispatcher.Factory> swipeDispatcherFactoryProvider;

    public SwipeDispatchRule_Factory(Provider<SwipeDispatcher.Factory> provider, Provider<C15082f> provider2) {
        this.swipeDispatcherFactoryProvider = provider;
        this.superlikeStatusProvider = provider2;
    }

    public SwipeDispatchRule get() {
        return provideInstance(this.swipeDispatcherFactoryProvider, this.superlikeStatusProvider);
    }

    public static SwipeDispatchRule provideInstance(Provider<SwipeDispatcher.Factory> provider, Provider<C15082f> provider2) {
        return new SwipeDispatchRule((SwipeDispatcher.Factory) provider.get(), (C15082f) provider2.get());
    }

    public static SwipeDispatchRule_Factory create(Provider<SwipeDispatcher.Factory> provider, Provider<C15082f> provider2) {
        return new SwipeDispatchRule_Factory(provider, provider2);
    }

    public static SwipeDispatchRule newSwipeDispatchRule(SwipeDispatcher.Factory factory, C15082f c15082f) {
        return new SwipeDispatchRule(factory, c15082f);
    }
}
