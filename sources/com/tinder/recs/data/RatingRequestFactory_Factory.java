package com.tinder.recs.data;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class RatingRequestFactory_Factory implements Factory<RatingRequestFactory> {
    private final Provider<Factory> ratingRequestCommonFieldsFactoryProvider;

    public RatingRequestFactory_Factory(Provider<Factory> provider) {
        this.ratingRequestCommonFieldsFactoryProvider = provider;
    }

    public RatingRequestFactory get() {
        return provideInstance(this.ratingRequestCommonFieldsFactoryProvider);
    }

    public static RatingRequestFactory provideInstance(Provider<Factory> provider) {
        return new RatingRequestFactory((Factory) provider.get());
    }

    public static RatingRequestFactory_Factory create(Provider<Factory> provider) {
        return new RatingRequestFactory_Factory(provider);
    }

    public static RatingRequestFactory newRatingRequestFactory(Object obj) {
        return new RatingRequestFactory((Factory) obj);
    }
}
