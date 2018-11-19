package com.tinder.recs;

import dagger.internal.Factory;

public final class DiscoverySettingsLegacyUserAdapter_Factory implements Factory<DiscoverySettingsLegacyUserAdapter> {
    private static final DiscoverySettingsLegacyUserAdapter_Factory INSTANCE = new DiscoverySettingsLegacyUserAdapter_Factory();

    public DiscoverySettingsLegacyUserAdapter get() {
        return provideInstance();
    }

    public static DiscoverySettingsLegacyUserAdapter provideInstance() {
        return new DiscoverySettingsLegacyUserAdapter();
    }

    public static DiscoverySettingsLegacyUserAdapter_Factory create() {
        return INSTANCE;
    }

    public static DiscoverySettingsLegacyUserAdapter newDiscoverySettingsLegacyUserAdapter() {
        return new DiscoverySettingsLegacyUserAdapter();
    }
}
