package com.tinder.recs.module;

import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.recs.analytics.AddRecsSessionEvent;
import com.tinder.recs.analytics.RecsSessionTracker;
import com.tinder.recs.analytics.RecsSessionTracker.RecsSessionFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_RecsSessionTrackerFactory implements Factory<RecsSessionTracker> {
    private final Provider<AddRecsSessionEvent> addRecsSessionEventProvider;
    private final Provider<CurrentScreenTracker> currentScreenTrackerProvider;
    private final RecsModule module;
    private final Provider<RecsSessionFactory> recsSessionFactoryProvider;

    public RecsModule_RecsSessionTrackerFactory(RecsModule recsModule, Provider<CurrentScreenTracker> provider, Provider<AddRecsSessionEvent> provider2, Provider<RecsSessionFactory> provider3) {
        this.module = recsModule;
        this.currentScreenTrackerProvider = provider;
        this.addRecsSessionEventProvider = provider2;
        this.recsSessionFactoryProvider = provider3;
    }

    public RecsSessionTracker get() {
        return provideInstance(this.module, this.currentScreenTrackerProvider, this.addRecsSessionEventProvider, this.recsSessionFactoryProvider);
    }

    public static RecsSessionTracker provideInstance(RecsModule recsModule, Provider<CurrentScreenTracker> provider, Provider<AddRecsSessionEvent> provider2, Provider<RecsSessionFactory> provider3) {
        return proxyRecsSessionTracker(recsModule, (CurrentScreenTracker) provider.get(), (AddRecsSessionEvent) provider2.get(), (RecsSessionFactory) provider3.get());
    }

    public static RecsModule_RecsSessionTrackerFactory create(RecsModule recsModule, Provider<CurrentScreenTracker> provider, Provider<AddRecsSessionEvent> provider2, Provider<RecsSessionFactory> provider3) {
        return new RecsModule_RecsSessionTrackerFactory(recsModule, provider, provider2, provider3);
    }

    public static RecsSessionTracker proxyRecsSessionTracker(RecsModule recsModule, CurrentScreenTracker currentScreenTracker, AddRecsSessionEvent addRecsSessionEvent, RecsSessionFactory recsSessionFactory) {
        return (RecsSessionTracker) C15521i.m58001a(recsModule.recsSessionTracker(currentScreenTracker, addRecsSessionEvent, recsSessionFactory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
