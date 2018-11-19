package com.tinder.model.adapter.domain;

import dagger.internal.Factory;

public final class GenderLegacyUserAdapter_Factory implements Factory<GenderLegacyUserAdapter> {
    private static final GenderLegacyUserAdapter_Factory INSTANCE = new GenderLegacyUserAdapter_Factory();

    public GenderLegacyUserAdapter get() {
        return provideInstance();
    }

    public static GenderLegacyUserAdapter provideInstance() {
        return new GenderLegacyUserAdapter();
    }

    public static GenderLegacyUserAdapter_Factory create() {
        return INSTANCE;
    }

    public static GenderLegacyUserAdapter newGenderLegacyUserAdapter() {
        return new GenderLegacyUserAdapter();
    }
}
