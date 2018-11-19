package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.SchoolRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateSchool_Factory implements Factory<UpdateSchool> {
    private final Provider<SchoolRepository> schoolRepositoryProvider;

    public UpdateSchool_Factory(Provider<SchoolRepository> provider) {
        this.schoolRepositoryProvider = provider;
    }

    public UpdateSchool get() {
        return provideInstance(this.schoolRepositoryProvider);
    }

    public static UpdateSchool provideInstance(Provider<SchoolRepository> provider) {
        return new UpdateSchool((SchoolRepository) provider.get());
    }

    public static UpdateSchool_Factory create(Provider<SchoolRepository> provider) {
        return new UpdateSchool_Factory(provider);
    }

    public static UpdateSchool newUpdateSchool(SchoolRepository schoolRepository) {
        return new UpdateSchool(schoolRepository);
    }
}
