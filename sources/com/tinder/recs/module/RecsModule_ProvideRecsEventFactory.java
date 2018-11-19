package com.tinder.recs.module;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.analytics.performance.C8151o;
import com.tinder.core.experiment.AbTestUtility;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideRecsEventFactory implements Factory<C8151o> {
    private final Provider<AbTestUtility> abTestUtilityProvider;
    private final Provider<C2630h> fireworksProvider;
    private final RecsModule module;

    public RecsModule_ProvideRecsEventFactory(RecsModule recsModule, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        this.module = recsModule;
        this.fireworksProvider = provider;
        this.abTestUtilityProvider = provider2;
    }

    public C8151o get() {
        return provideInstance(this.module, this.fireworksProvider, this.abTestUtilityProvider);
    }

    public static C8151o provideInstance(RecsModule recsModule, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        return proxyProvideRecsEvent(recsModule, (C2630h) provider.get(), (AbTestUtility) provider2.get());
    }

    public static RecsModule_ProvideRecsEventFactory create(RecsModule recsModule, Provider<C2630h> provider, Provider<AbTestUtility> provider2) {
        return new RecsModule_ProvideRecsEventFactory(recsModule, provider, provider2);
    }

    public static C8151o proxyProvideRecsEvent(RecsModule recsModule, C2630h c2630h, AbTestUtility abTestUtility) {
        return (C8151o) C15521i.m58001a(recsModule.provideRecsEvent(c2630h, abTestUtility), "Cannot return null from a non-@Nullable @Provides method");
    }
}
