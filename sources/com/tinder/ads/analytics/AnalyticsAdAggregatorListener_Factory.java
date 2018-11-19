package com.tinder.ads.analytics;

import com.tinder.recsads.analytics.C16435l;
import com.tinder.recsads.analytics.C16437n;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AnalyticsAdAggregatorListener_Factory implements Factory<AnalyticsAdAggregatorListener> {
    private final Provider<C16435l> addAdRequestReceiveEventProvider;
    private final Provider<C16437n> addAdRequestSendEventProvider;

    public AnalyticsAdAggregatorListener_Factory(Provider<C16437n> provider, Provider<C16435l> provider2) {
        this.addAdRequestSendEventProvider = provider;
        this.addAdRequestReceiveEventProvider = provider2;
    }

    public AnalyticsAdAggregatorListener get() {
        return provideInstance(this.addAdRequestSendEventProvider, this.addAdRequestReceiveEventProvider);
    }

    public static AnalyticsAdAggregatorListener provideInstance(Provider<C16437n> provider, Provider<C16435l> provider2) {
        return new AnalyticsAdAggregatorListener((C16437n) provider.get(), (C16435l) provider2.get());
    }

    public static AnalyticsAdAggregatorListener_Factory create(Provider<C16437n> provider, Provider<C16435l> provider2) {
        return new AnalyticsAdAggregatorListener_Factory(provider, provider2);
    }

    public static AnalyticsAdAggregatorListener newAnalyticsAdAggregatorListener(C16437n c16437n, C16435l c16435l) {
        return new AnalyticsAdAggregatorListener(c16437n, c16435l);
    }
}
