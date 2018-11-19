package com.tinder.model.adapter.legacy;

import dagger.internal.Factory;

public final class LegacyJobAdapter_Factory implements Factory<LegacyJobAdapter> {
    private static final LegacyJobAdapter_Factory INSTANCE = new LegacyJobAdapter_Factory();

    public LegacyJobAdapter get() {
        return provideInstance();
    }

    public static LegacyJobAdapter provideInstance() {
        return new LegacyJobAdapter();
    }

    public static LegacyJobAdapter_Factory create() {
        return INSTANCE;
    }

    public static LegacyJobAdapter newLegacyJobAdapter() {
        return new LegacyJobAdapter();
    }
}
