package com.tinder.ads.module;

import android.arch.lifecycle.LifecycleObserver;
import com.tinder.recsads.lifecycle.observer.RecsAdLifecycleObserver;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsAdsModule_ProvideRecsAdLifecycleObserverFactory implements Factory<LifecycleObserver> {
    private final Provider<RecsAdLifecycleObserver> recsAdLifecycleObserverProvider;

    public RecsAdsModule_ProvideRecsAdLifecycleObserverFactory(Provider<RecsAdLifecycleObserver> provider) {
        this.recsAdLifecycleObserverProvider = provider;
    }

    public LifecycleObserver get() {
        return provideInstance(this.recsAdLifecycleObserverProvider);
    }

    public static LifecycleObserver provideInstance(Provider<RecsAdLifecycleObserver> provider) {
        return proxyProvideRecsAdLifecycleObserver((RecsAdLifecycleObserver) provider.get());
    }

    public static RecsAdsModule_ProvideRecsAdLifecycleObserverFactory create(Provider<RecsAdLifecycleObserver> provider) {
        return new RecsAdsModule_ProvideRecsAdLifecycleObserverFactory(provider);
    }

    public static LifecycleObserver proxyProvideRecsAdLifecycleObserver(RecsAdLifecycleObserver recsAdLifecycleObserver) {
        return (LifecycleObserver) C15521i.a(RecsAdsModule.provideRecsAdLifecycleObserver(recsAdLifecycleObserver), "Cannot return null from a non-@Nullable @Provides method");
    }
}
