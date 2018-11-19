package com.tinder.recs.presenter;

import android.content.res.Resources;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsStatusMessageResolver_Factory implements Factory<RecsStatusMessageResolver> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<Resources> resourcesProvider;

    public RecsStatusMessageResolver_Factory(Provider<Resources> provider, Provider<AbTestUtility> provider2) {
        this.resourcesProvider = provider;
        this.abTestUtilityProvider = provider2;
    }

    public RecsStatusMessageResolver get() {
        return provideInstance(this.resourcesProvider, this.abTestUtilityProvider);
    }

    public static RecsStatusMessageResolver provideInstance(Provider<Resources> provider, Provider<AbTestUtility> provider2) {
        return new RecsStatusMessageResolver((Resources) provider.get(), (AbTestUtility) provider2.get());
    }

    public static RecsStatusMessageResolver_Factory create(Provider<Resources> provider, Provider<AbTestUtility> provider2) {
        return new RecsStatusMessageResolver_Factory(provider, provider2);
    }

    public static RecsStatusMessageResolver newRecsStatusMessageResolver(Resources resources, AbTestUtility abTestUtility) {
        return new RecsStatusMessageResolver(resources, abTestUtility);
    }
}
