package com.tinder.ads;

import dagger.internal.Factory;

public final class V1BrandedProfileCardAd_Factory_Factory implements Factory<V1BrandedProfileCardAd.Factory> {
    private static final V1BrandedProfileCardAd_Factory_Factory INSTANCE = new V1BrandedProfileCardAd_Factory_Factory();

    public V1BrandedProfileCardAd.Factory get() {
        return provideInstance();
    }

    public static V1BrandedProfileCardAd.Factory provideInstance() {
        return new V1BrandedProfileCardAd.Factory();
    }

    public static V1BrandedProfileCardAd_Factory_Factory create() {
        return INSTANCE;
    }

    public static V1BrandedProfileCardAd.Factory newFactory() {
        return new V1BrandedProfileCardAd.Factory();
    }
}
