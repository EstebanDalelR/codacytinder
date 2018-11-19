package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.JobRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SMSUpdateJob_Factory implements Factory<SMSUpdateJob> {
    private final Provider<JobRepository> repositoryProvider;

    public SMSUpdateJob_Factory(Provider<JobRepository> provider) {
        this.repositoryProvider = provider;
    }

    public SMSUpdateJob get() {
        return provideInstance(this.repositoryProvider);
    }

    public static SMSUpdateJob provideInstance(Provider<JobRepository> provider) {
        return new SMSUpdateJob((JobRepository) provider.get());
    }

    public static SMSUpdateJob_Factory create(Provider<JobRepository> provider) {
        return new SMSUpdateJob_Factory(provider);
    }

    public static SMSUpdateJob newSMSUpdateJob(JobRepository jobRepository) {
        return new SMSUpdateJob(jobRepository);
    }
}
