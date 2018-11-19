package com.tinder.recs.module;

import com.tinder.fireboarding.view.reccard.FireboardingLevelIconViewFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;

public final class RecsViewModule_ProvideFireboardingLevelIconViewFactoryFactory implements Factory<FireboardingLevelIconViewFactory> {
    private final RecsViewModule module;

    public RecsViewModule_ProvideFireboardingLevelIconViewFactoryFactory(RecsViewModule recsViewModule) {
        this.module = recsViewModule;
    }

    public FireboardingLevelIconViewFactory get() {
        return provideInstance(this.module);
    }

    public static FireboardingLevelIconViewFactory provideInstance(RecsViewModule recsViewModule) {
        return proxyProvideFireboardingLevelIconViewFactory(recsViewModule);
    }

    public static RecsViewModule_ProvideFireboardingLevelIconViewFactoryFactory create(RecsViewModule recsViewModule) {
        return new RecsViewModule_ProvideFireboardingLevelIconViewFactoryFactory(recsViewModule);
    }

    public static FireboardingLevelIconViewFactory proxyProvideFireboardingLevelIconViewFactory(RecsViewModule recsViewModule) {
        return (FireboardingLevelIconViewFactory) C15521i.m58001a(recsViewModule.provideFireboardingLevelIconViewFactory(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
