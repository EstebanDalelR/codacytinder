package com.tinder.ads;

import com.tinder.ads.MessageAd.SponsoredMessageAdFactory;
import dagger.internal.Factory;

public final class MessageAd_SponsoredMessageAdFactory_Factory implements Factory<SponsoredMessageAdFactory> {
    private static final MessageAd_SponsoredMessageAdFactory_Factory INSTANCE = new MessageAd_SponsoredMessageAdFactory_Factory();

    public SponsoredMessageAdFactory get() {
        return provideInstance();
    }

    public static SponsoredMessageAdFactory provideInstance() {
        return new SponsoredMessageAdFactory();
    }

    public static MessageAd_SponsoredMessageAdFactory_Factory create() {
        return INSTANCE;
    }

    public static SponsoredMessageAdFactory newSponsoredMessageAdFactory() {
        return new SponsoredMessageAdFactory();
    }
}
