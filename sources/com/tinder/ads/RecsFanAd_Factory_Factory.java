package com.tinder.ads;

import dagger.internal.Factory;

public final class RecsFanAd_Factory_Factory implements Factory<RecsFanAd.Factory> {
    private static final RecsFanAd_Factory_Factory INSTANCE = new RecsFanAd_Factory_Factory();

    public RecsFanAd.Factory get() {
        return provideInstance();
    }

    public static RecsFanAd.Factory provideInstance() {
        return new RecsFanAd.Factory();
    }

    public static RecsFanAd_Factory_Factory create() {
        return INSTANCE;
    }

    public static RecsFanAd.Factory newFactory() {
        return new RecsFanAd.Factory();
    }
}
