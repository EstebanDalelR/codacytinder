package com.tinder.domain.injection.modules;

import dagger.internal.C15521i;
import dagger.internal.Factory;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

public final class CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory implements Factory<Function0<DateTime>> {
    private final CommonDomainModule module;

    public CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory(CommonDomainModule commonDomainModule) {
        this.module = commonDomainModule;
    }

    public Function0<DateTime> get() {
        return provideInstance(this.module);
    }

    public static Function0<DateTime> provideInstance(CommonDomainModule commonDomainModule) {
        return proxyProvideDateTimeProvider$domain_release(commonDomainModule);
    }

    public static CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory create(CommonDomainModule commonDomainModule) {
        return new CommonDomainModule_ProvideDateTimeProvider$domain_releaseFactory(commonDomainModule);
    }

    public static Function0<DateTime> proxyProvideDateTimeProvider$domain_release(CommonDomainModule commonDomainModule) {
        return (Function0) C15521i.a(commonDomainModule.provideDateTimeProvider$domain_release(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
