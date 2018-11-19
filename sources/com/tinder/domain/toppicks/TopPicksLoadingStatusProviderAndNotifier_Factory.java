package com.tinder.domain.toppicks;

import dagger.internal.Factory;

public final class TopPicksLoadingStatusProviderAndNotifier_Factory implements Factory<TopPicksLoadingStatusProviderAndNotifier> {
    private static final TopPicksLoadingStatusProviderAndNotifier_Factory INSTANCE = new TopPicksLoadingStatusProviderAndNotifier_Factory();

    public TopPicksLoadingStatusProviderAndNotifier get() {
        return provideInstance();
    }

    public static TopPicksLoadingStatusProviderAndNotifier provideInstance() {
        return new TopPicksLoadingStatusProviderAndNotifier();
    }

    public static TopPicksLoadingStatusProviderAndNotifier_Factory create() {
        return INSTANCE;
    }

    public static TopPicksLoadingStatusProviderAndNotifier newTopPicksLoadingStatusProviderAndNotifier() {
        return new TopPicksLoadingStatusProviderAndNotifier();
    }
}
