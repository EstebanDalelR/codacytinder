package com.tinder.ads;

import dagger.internal.Factory;

public final class RecsNativeVideoAd_Factory_Factory implements Factory<RecsNativeVideoAd.Factory> {
    private static final RecsNativeVideoAd_Factory_Factory INSTANCE = new RecsNativeVideoAd_Factory_Factory();

    public RecsNativeVideoAd.Factory get() {
        return provideInstance();
    }

    public static RecsNativeVideoAd.Factory provideInstance() {
        return new RecsNativeVideoAd.Factory();
    }

    public static RecsNativeVideoAd_Factory_Factory create() {
        return INSTANCE;
    }

    public static RecsNativeVideoAd.Factory newFactory() {
        return new RecsNativeVideoAd.Factory();
    }
}
