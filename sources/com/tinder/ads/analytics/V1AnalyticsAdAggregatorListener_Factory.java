package com.tinder.ads.analytics;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class V1AnalyticsAdAggregatorListener_Factory implements Factory<V1AnalyticsAdAggregatorListener> {
    private final Provider<LegacyAddAdRequestReceiveEvent> legacyAddAdRequestReceiveEventProvider;
    private final Provider<LegacyAddAdRequestSendEvent> legacyAddAdRequestSendEventProvider;

    public V1AnalyticsAdAggregatorListener_Factory(Provider<LegacyAddAdRequestSendEvent> provider, Provider<LegacyAddAdRequestReceiveEvent> provider2) {
        this.legacyAddAdRequestSendEventProvider = provider;
        this.legacyAddAdRequestReceiveEventProvider = provider2;
    }

    public V1AnalyticsAdAggregatorListener get() {
        return provideInstance(this.legacyAddAdRequestSendEventProvider, this.legacyAddAdRequestReceiveEventProvider);
    }

    public static V1AnalyticsAdAggregatorListener provideInstance(Provider<LegacyAddAdRequestSendEvent> provider, Provider<LegacyAddAdRequestReceiveEvent> provider2) {
        return new V1AnalyticsAdAggregatorListener((LegacyAddAdRequestSendEvent) provider.get(), (LegacyAddAdRequestReceiveEvent) provider2.get());
    }

    public static V1AnalyticsAdAggregatorListener_Factory create(Provider<LegacyAddAdRequestSendEvent> provider, Provider<LegacyAddAdRequestReceiveEvent> provider2) {
        return new V1AnalyticsAdAggregatorListener_Factory(provider, provider2);
    }

    public static V1AnalyticsAdAggregatorListener newV1AnalyticsAdAggregatorListener(LegacyAddAdRequestSendEvent legacyAddAdRequestSendEvent, LegacyAddAdRequestReceiveEvent legacyAddAdRequestReceiveEvent) {
        return new V1AnalyticsAdAggregatorListener(legacyAddAdRequestSendEvent, legacyAddAdRequestReceiveEvent);
    }
}
