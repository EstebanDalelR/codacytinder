package com.tinder.domain.ads;

import com.tinder.domain.match.repository.TrackingUrlRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SponsoredMessagePingTrackingUrls_Factory implements Factory<SponsoredMessagePingTrackingUrls> {
    private final Provider<TrackingUrlRepository> trackingUrlRepositoryProvider;

    public SponsoredMessagePingTrackingUrls_Factory(Provider<TrackingUrlRepository> provider) {
        this.trackingUrlRepositoryProvider = provider;
    }

    public SponsoredMessagePingTrackingUrls get() {
        return provideInstance(this.trackingUrlRepositoryProvider);
    }

    public static SponsoredMessagePingTrackingUrls provideInstance(Provider<TrackingUrlRepository> provider) {
        return new SponsoredMessagePingTrackingUrls((TrackingUrlRepository) provider.get());
    }

    public static SponsoredMessagePingTrackingUrls_Factory create(Provider<TrackingUrlRepository> provider) {
        return new SponsoredMessagePingTrackingUrls_Factory(provider);
    }

    public static SponsoredMessagePingTrackingUrls newSponsoredMessagePingTrackingUrls(TrackingUrlRepository trackingUrlRepository) {
        return new SponsoredMessagePingTrackingUrls(trackingUrlRepository);
    }
}
