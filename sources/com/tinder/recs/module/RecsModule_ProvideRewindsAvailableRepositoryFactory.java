package com.tinder.recs.module;

import android.content.SharedPreferences;
import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideRewindsAvailableRepositoryFactory implements Factory<RewindsAvailableRepository> {
    private final RecsModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public RecsModule_ProvideRewindsAvailableRepositoryFactory(RecsModule recsModule, Provider<SharedPreferences> provider) {
        this.module = recsModule;
        this.sharedPreferencesProvider = provider;
    }

    public RewindsAvailableRepository get() {
        return provideInstance(this.module, this.sharedPreferencesProvider);
    }

    public static RewindsAvailableRepository provideInstance(RecsModule recsModule, Provider<SharedPreferences> provider) {
        return proxyProvideRewindsAvailableRepository(recsModule, (SharedPreferences) provider.get());
    }

    public static RecsModule_ProvideRewindsAvailableRepositoryFactory create(RecsModule recsModule, Provider<SharedPreferences> provider) {
        return new RecsModule_ProvideRewindsAvailableRepositoryFactory(recsModule, provider);
    }

    public static RewindsAvailableRepository proxyProvideRewindsAvailableRepository(RecsModule recsModule, SharedPreferences sharedPreferences) {
        return (RewindsAvailableRepository) C15521i.m58001a(recsModule.provideRewindsAvailableRepository(sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}
