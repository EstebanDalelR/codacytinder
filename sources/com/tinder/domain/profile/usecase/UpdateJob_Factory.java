package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.JobRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateJob_Factory implements Factory<UpdateJob> {
    private final Provider<JobRepository> jobRepositoryProvider;

    public UpdateJob_Factory(Provider<JobRepository> provider) {
        this.jobRepositoryProvider = provider;
    }

    public UpdateJob get() {
        return provideInstance(this.jobRepositoryProvider);
    }

    public static UpdateJob provideInstance(Provider<JobRepository> provider) {
        return new UpdateJob((JobRepository) provider.get());
    }

    public static UpdateJob_Factory create(Provider<JobRepository> provider) {
        return new UpdateJob_Factory(provider);
    }

    public static UpdateJob newUpdateJob(JobRepository jobRepository) {
        return new UpdateJob(jobRepository);
    }
}
