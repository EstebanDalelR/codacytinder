package com.tinder.recs.usecase;

import com.tinder.recs.domain.usecase.ObserveRewindsAvailable;
import com.tinder.tinderplus.p428a.C15193i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CanUserRewind_Factory implements Factory<CanUserRewind> {
    private final Provider<ObserveRewindsAvailable> observeRewindsAvailableProvider;
    private final Provider<C15193i> tinderPlusInteractorProvider;

    public CanUserRewind_Factory(Provider<ObserveRewindsAvailable> provider, Provider<C15193i> provider2) {
        this.observeRewindsAvailableProvider = provider;
        this.tinderPlusInteractorProvider = provider2;
    }

    public CanUserRewind get() {
        return provideInstance(this.observeRewindsAvailableProvider, this.tinderPlusInteractorProvider);
    }

    public static CanUserRewind provideInstance(Provider<ObserveRewindsAvailable> provider, Provider<C15193i> provider2) {
        return new CanUserRewind((ObserveRewindsAvailable) provider.get(), (C15193i) provider2.get());
    }

    public static CanUserRewind_Factory create(Provider<ObserveRewindsAvailable> provider, Provider<C15193i> provider2) {
        return new CanUserRewind_Factory(provider, provider2);
    }

    public static CanUserRewind newCanUserRewind(ObserveRewindsAvailable observeRewindsAvailable, C15193i c15193i) {
        return new CanUserRewind(observeRewindsAvailable, c15193i);
    }
}
