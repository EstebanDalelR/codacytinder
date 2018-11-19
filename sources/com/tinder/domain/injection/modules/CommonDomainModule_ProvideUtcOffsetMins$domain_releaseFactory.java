package com.tinder.domain.injection.modules;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import kotlin.jvm.functions.Function0;

public final class CommonDomainModule_ProvideUtcOffsetMins$domain_releaseFactory implements Factory<Function0<Integer>> {
    private final CommonDomainModule module;

    public CommonDomainModule_ProvideUtcOffsetMins$domain_releaseFactory(CommonDomainModule commonDomainModule) {
        this.module = commonDomainModule;
    }

    public Function0<Integer> get() {
        return provideInstance(this.module);
    }

    public static Function0<Integer> provideInstance(CommonDomainModule commonDomainModule) {
        return proxyProvideUtcOffsetMins$domain_release(commonDomainModule);
    }

    public static CommonDomainModule_ProvideUtcOffsetMins$domain_releaseFactory create(CommonDomainModule commonDomainModule) {
        return new CommonDomainModule_ProvideUtcOffsetMins$domain_releaseFactory(commonDomainModule);
    }

    public static Function0<Integer> proxyProvideUtcOffsetMins$domain_release(CommonDomainModule commonDomainModule) {
        return (Function0) C15521i.a(commonDomainModule.provideUtcOffsetMins$domain_release(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
