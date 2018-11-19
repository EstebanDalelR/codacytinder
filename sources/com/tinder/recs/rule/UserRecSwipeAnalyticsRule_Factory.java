package com.tinder.recs.rule;

import com.tinder.recs.analytics.AddRecsRateEvent;
import com.tinder.recs.analytics.RecsPhotosViewedCache;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UserRecSwipeAnalyticsRule_Factory implements Factory<UserRecSwipeAnalyticsRule> {
    private final Provider<AddRecsRateEvent> addRecsRateEventProvider;
    private final Provider<RecsPhotosViewedCache> recsPhotosViewedCacheProvider;

    public UserRecSwipeAnalyticsRule_Factory(Provider<AddRecsRateEvent> provider, Provider<RecsPhotosViewedCache> provider2) {
        this.addRecsRateEventProvider = provider;
        this.recsPhotosViewedCacheProvider = provider2;
    }

    public UserRecSwipeAnalyticsRule get() {
        return provideInstance(this.addRecsRateEventProvider, this.recsPhotosViewedCacheProvider);
    }

    public static UserRecSwipeAnalyticsRule provideInstance(Provider<AddRecsRateEvent> provider, Provider<RecsPhotosViewedCache> provider2) {
        return new UserRecSwipeAnalyticsRule((AddRecsRateEvent) provider.get(), (RecsPhotosViewedCache) provider2.get());
    }

    public static UserRecSwipeAnalyticsRule_Factory create(Provider<AddRecsRateEvent> provider, Provider<RecsPhotosViewedCache> provider2) {
        return new UserRecSwipeAnalyticsRule_Factory(provider, provider2);
    }

    public static UserRecSwipeAnalyticsRule newUserRecSwipeAnalyticsRule(AddRecsRateEvent addRecsRateEvent, RecsPhotosViewedCache recsPhotosViewedCache) {
        return new UserRecSwipeAnalyticsRule(addRecsRateEvent, recsPhotosViewedCache);
    }
}
