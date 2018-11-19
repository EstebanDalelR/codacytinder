package com.tinder.model.adapter.domain;

import dagger.internal.Factory;

public final class SchoolLegacySchoolAdapter_Factory implements Factory<SchoolLegacySchoolAdapter> {
    private static final SchoolLegacySchoolAdapter_Factory INSTANCE = new SchoolLegacySchoolAdapter_Factory();

    public SchoolLegacySchoolAdapter get() {
        return provideInstance();
    }

    public static SchoolLegacySchoolAdapter provideInstance() {
        return new SchoolLegacySchoolAdapter();
    }

    public static SchoolLegacySchoolAdapter_Factory create() {
        return INSTANCE;
    }

    public static SchoolLegacySchoolAdapter newSchoolLegacySchoolAdapter() {
        return new SchoolLegacySchoolAdapter();
    }
}
