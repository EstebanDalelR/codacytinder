package com.tinder.ads;

import com.tinder.ads.MessageAd.TinderUpdateMessageAdFactory;
import dagger.internal.Factory;

public final class MessageAd_TinderUpdateMessageAdFactory_Factory implements Factory<TinderUpdateMessageAdFactory> {
    private static final MessageAd_TinderUpdateMessageAdFactory_Factory INSTANCE = new MessageAd_TinderUpdateMessageAdFactory_Factory();

    public TinderUpdateMessageAdFactory get() {
        return provideInstance();
    }

    public static TinderUpdateMessageAdFactory provideInstance() {
        return new TinderUpdateMessageAdFactory();
    }

    public static MessageAd_TinderUpdateMessageAdFactory_Factory create() {
        return INSTANCE;
    }

    public static TinderUpdateMessageAdFactory newTinderUpdateMessageAdFactory() {
        return new TinderUpdateMessageAdFactory();
    }
}
