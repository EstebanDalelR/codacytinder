package com.tinder.domain.auth;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ClearSharedPreferences_Factory implements Factory<ClearSharedPreferences> {
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ClearSharedPreferences_Factory(Provider<SharedPreferences> provider) {
        this.sharedPreferencesProvider = provider;
    }

    public ClearSharedPreferences get() {
        return provideInstance(this.sharedPreferencesProvider);
    }

    public static ClearSharedPreferences provideInstance(Provider<SharedPreferences> provider) {
        return new ClearSharedPreferences((SharedPreferences) provider.get());
    }

    public static ClearSharedPreferences_Factory create(Provider<SharedPreferences> provider) {
        return new ClearSharedPreferences_Factory(provider);
    }

    public static ClearSharedPreferences newClearSharedPreferences(SharedPreferences sharedPreferences) {
        return new ClearSharedPreferences(sharedPreferences);
    }
}
