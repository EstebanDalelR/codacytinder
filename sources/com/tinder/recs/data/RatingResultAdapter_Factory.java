package com.tinder.recs.data;

import dagger.internal.Factory;

public final class RatingResultAdapter_Factory implements Factory<RatingResultAdapter> {
    private static final RatingResultAdapter_Factory INSTANCE = new RatingResultAdapter_Factory();

    public RatingResultAdapter get() {
        return provideInstance();
    }

    public static RatingResultAdapter provideInstance() {
        return new RatingResultAdapter();
    }

    public static RatingResultAdapter_Factory create() {
        return INSTANCE;
    }

    public static RatingResultAdapter newRatingResultAdapter() {
        return new RatingResultAdapter();
    }
}
