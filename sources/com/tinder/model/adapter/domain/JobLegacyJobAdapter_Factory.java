package com.tinder.model.adapter.domain;

import dagger.internal.Factory;

public final class JobLegacyJobAdapter_Factory implements Factory<JobLegacyJobAdapter> {
    private static final JobLegacyJobAdapter_Factory INSTANCE = new JobLegacyJobAdapter_Factory();

    public JobLegacyJobAdapter get() {
        return provideInstance();
    }

    public static JobLegacyJobAdapter provideInstance() {
        return new JobLegacyJobAdapter();
    }

    public static JobLegacyJobAdapter_Factory create() {
        return INSTANCE;
    }

    public static JobLegacyJobAdapter newJobLegacyJobAdapter() {
        return new JobLegacyJobAdapter();
    }
}
