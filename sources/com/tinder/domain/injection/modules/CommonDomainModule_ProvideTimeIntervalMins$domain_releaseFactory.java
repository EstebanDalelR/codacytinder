package com.tinder.domain.injection.modules;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import io.reactivex.C3959e;

public final class CommonDomainModule_ProvideTimeIntervalMins$domain_releaseFactory implements Factory<C3959e<Long>> {
    private final CommonDomainModule module;

    public CommonDomainModule_ProvideTimeIntervalMins$domain_releaseFactory(CommonDomainModule commonDomainModule) {
        this.module = commonDomainModule;
    }

    public C3959e<Long> get() {
        return provideInstance(this.module);
    }

    public static C3959e<Long> provideInstance(CommonDomainModule commonDomainModule) {
        return proxyProvideTimeIntervalMins$domain_release(commonDomainModule);
    }

    public static CommonDomainModule_ProvideTimeIntervalMins$domain_releaseFactory create(CommonDomainModule commonDomainModule) {
        return new CommonDomainModule_ProvideTimeIntervalMins$domain_releaseFactory(commonDomainModule);
    }

    public static C3959e<Long> proxyProvideTimeIntervalMins$domain_release(CommonDomainModule commonDomainModule) {
        return (C3959e) C15521i.a(commonDomainModule.provideTimeIntervalMins$domain_release(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
