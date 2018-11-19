package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.purchase.SubscriptionProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

public final class ObserveTopPicksScreenState_Factory implements Factory<ObserveTopPicksScreenState> {
    private final Provider<Function0<DateTime>> dateTimeProvider;
    private final Provider<SubscriptionProvider> subscriptionProvider;
    private final Provider<ObserveTopPicksSession> topPicksSessionObserverProvider;

    public ObserveTopPicksScreenState_Factory(Provider<SubscriptionProvider> provider, Provider<ObserveTopPicksSession> provider2, Provider<Function0<DateTime>> provider3) {
        this.subscriptionProvider = provider;
        this.topPicksSessionObserverProvider = provider2;
        this.dateTimeProvider = provider3;
    }

    public ObserveTopPicksScreenState get() {
        return provideInstance(this.subscriptionProvider, this.topPicksSessionObserverProvider, this.dateTimeProvider);
    }

    public static ObserveTopPicksScreenState provideInstance(Provider<SubscriptionProvider> provider, Provider<ObserveTopPicksSession> provider2, Provider<Function0<DateTime>> provider3) {
        return new ObserveTopPicksScreenState((SubscriptionProvider) provider.get(), (ObserveTopPicksSession) provider2.get(), (Function0) provider3.get());
    }

    public static ObserveTopPicksScreenState_Factory create(Provider<SubscriptionProvider> provider, Provider<ObserveTopPicksSession> provider2, Provider<Function0<DateTime>> provider3) {
        return new ObserveTopPicksScreenState_Factory(provider, provider2, provider3);
    }

    public static ObserveTopPicksScreenState newObserveTopPicksScreenState(SubscriptionProvider subscriptionProvider, ObserveTopPicksSession observeTopPicksSession, Function0<DateTime> function0) {
        return new ObserveTopPicksScreenState(subscriptionProvider, observeTopPicksSession, function0);
    }
}
