package com.tinder.ads;

import dagger.internal.Factory;

public final class RecsNativeDisplayAd_Factory_Factory implements Factory<RecsNativeDisplayAd.Factory> {
    private static final RecsNativeDisplayAd_Factory_Factory INSTANCE = new RecsNativeDisplayAd_Factory_Factory();

    public RecsNativeDisplayAd.Factory get() {
        return provideInstance();
    }

    public static RecsNativeDisplayAd.Factory provideInstance() {
        return new RecsNativeDisplayAd.Factory();
    }

    public static RecsNativeDisplayAd_Factory_Factory create() {
        return INSTANCE;
    }

    public static RecsNativeDisplayAd.Factory newFactory() {
        return new RecsNativeDisplayAd.Factory();
    }
}
