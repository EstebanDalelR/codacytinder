package com.tinder.model.adapter.domain;

import dagger.internal.Factory;

public final class BadgeLegacyBadgeAdapter_Factory implements Factory<BadgeLegacyBadgeAdapter> {
    private static final BadgeLegacyBadgeAdapter_Factory INSTANCE = new BadgeLegacyBadgeAdapter_Factory();

    public BadgeLegacyBadgeAdapter get() {
        return provideInstance();
    }

    public static BadgeLegacyBadgeAdapter provideInstance() {
        return new BadgeLegacyBadgeAdapter();
    }

    public static BadgeLegacyBadgeAdapter_Factory create() {
        return INSTANCE;
    }

    public static BadgeLegacyBadgeAdapter newBadgeLegacyBadgeAdapter() {
        return new BadgeLegacyBadgeAdapter();
    }
}
