package com.tinder.model.adapter.legacy;

import dagger.internal.Factory;

public final class LegacySchoolAdapter_Factory implements Factory<LegacySchoolAdapter> {
    private static final LegacySchoolAdapter_Factory INSTANCE = new LegacySchoolAdapter_Factory();

    public LegacySchoolAdapter get() {
        return provideInstance();
    }

    public static LegacySchoolAdapter provideInstance() {
        return new LegacySchoolAdapter();
    }

    public static LegacySchoolAdapter_Factory create() {
        return INSTANCE;
    }

    public static LegacySchoolAdapter newLegacySchoolAdapter() {
        return new LegacySchoolAdapter();
    }
}
