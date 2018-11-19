package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.SchoolRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SMSUpdateSchool_Factory implements Factory<SMSUpdateSchool> {
    private final Provider<SchoolRepository> schoolRepositoryProvider;

    public SMSUpdateSchool_Factory(Provider<SchoolRepository> provider) {
        this.schoolRepositoryProvider = provider;
    }

    public SMSUpdateSchool get() {
        return provideInstance(this.schoolRepositoryProvider);
    }

    public static SMSUpdateSchool provideInstance(Provider<SchoolRepository> provider) {
        return new SMSUpdateSchool((SchoolRepository) provider.get());
    }

    public static SMSUpdateSchool_Factory create(Provider<SchoolRepository> provider) {
        return new SMSUpdateSchool_Factory(provider);
    }

    public static SMSUpdateSchool newSMSUpdateSchool(SchoolRepository schoolRepository) {
        return new SMSUpdateSchool(schoolRepository);
    }
}
