package com.tinder.ads.module;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.recsads.lifecycle.observer.RecsAdCtaBouncebackLifecycleObserver;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideRecsAdCtaBouncebackLifecycleObserverFactory implements Factory<LifecycleObserver> {
    private final Provider<RecsAdCtaBouncebackLifecycleObserver> bouncebackObserverProvider;

    public RecsAdsModule_ProvideRecsAdCtaBouncebackLifecycleObserverFactory(Provider<RecsAdCtaBouncebackLifecycleObserver> provider) {
        this.bouncebackObserverProvider = provider;
    }

    public LifecycleObserver get() {
        return provideInstance(this.bouncebackObserverProvider);
    }

    public static LifecycleObserver provideInstance(Provider<RecsAdCtaBouncebackLifecycleObserver> provider) {
        return proxyProvideRecsAdCtaBouncebackLifecycleObserver((RecsAdCtaBouncebackLifecycleObserver) provider.get());
    }

    public static RecsAdsModule_ProvideRecsAdCtaBouncebackLifecycleObserverFactory create(Provider<RecsAdCtaBouncebackLifecycleObserver> provider) {
        return new RecsAdsModule_ProvideRecsAdCtaBouncebackLifecycleObserverFactory(provider);
    }

    public static LifecycleObserver proxyProvideRecsAdCtaBouncebackLifecycleObserver(RecsAdCtaBouncebackLifecycleObserver recsAdCtaBouncebackLifecycleObserver) {
        return (LifecycleObserver) C15521i.a(RecsAdsModule.provideRecsAdCtaBouncebackLifecycleObserver(recsAdCtaBouncebackLifecycleObserver), "Cannot return null from a non-@Nullable @Provides method");
    }
}
