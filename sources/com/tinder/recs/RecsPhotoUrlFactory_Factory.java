package com.tinder.recs;

import dagger.internal.Factory;

public final class RecsPhotoUrlFactory_Factory implements Factory<RecsPhotoUrlFactory> {
    private static final RecsPhotoUrlFactory_Factory INSTANCE = new RecsPhotoUrlFactory_Factory();

    public RecsPhotoUrlFactory get() {
        return provideInstance();
    }

    public static RecsPhotoUrlFactory provideInstance() {
        return new RecsPhotoUrlFactory();
    }

    public static RecsPhotoUrlFactory_Factory create() {
        return INSTANCE;
    }

    public static RecsPhotoUrlFactory newRecsPhotoUrlFactory() {
        return new RecsPhotoUrlFactory();
    }
}
