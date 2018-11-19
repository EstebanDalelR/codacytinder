package com.tinder.recs.provider;

import android.content.SharedPreferences;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TappyConfigProvider_Factory implements Factory<TappyConfigProvider> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public TappyConfigProvider_Factory(Provider<AbTestUtility> provider, Provider<SharedPreferences> provider2) {
        this.abTestUtilityProvider = provider;
        this.sharedPreferencesProvider = provider2;
    }

    public TappyConfigProvider get() {
        return provideInstance(this.abTestUtilityProvider, this.sharedPreferencesProvider);
    }

    public static TappyConfigProvider provideInstance(Provider<AbTestUtility> provider, Provider<SharedPreferences> provider2) {
        return new TappyConfigProvider((AbTestUtility) provider.get(), (SharedPreferences) provider2.get());
    }

    public static TappyConfigProvider_Factory create(Provider<AbTestUtility> provider, Provider<SharedPreferences> provider2) {
        return new TappyConfigProvider_Factory(provider, provider2);
    }

    public static TappyConfigProvider newTappyConfigProvider(AbTestUtility abTestUtility, SharedPreferences sharedPreferences) {
        return new TappyConfigProvider(abTestUtility, sharedPreferences);
    }
}
